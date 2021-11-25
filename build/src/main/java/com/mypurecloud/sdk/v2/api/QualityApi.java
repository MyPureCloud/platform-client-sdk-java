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
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.Evaluation;
import com.mypurecloud.sdk.v2.model.AgentActivityEntityListing;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.CalibrationEntityListing;
import com.mypurecloud.sdk.v2.model.Survey;
import com.mypurecloud.sdk.v2.model.QualityAuditQueryExecutionStatusResponse;
import com.mypurecloud.sdk.v2.model.QualityAuditQueryExecutionResultsResponse;
import com.mypurecloud.sdk.v2.model.EvaluationEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluatorActivityEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationFormEntityListing;
import com.mypurecloud.sdk.v2.model.SurveyForm;
import com.mypurecloud.sdk.v2.model.SurveyFormEntityListing;
import com.mypurecloud.sdk.v2.model.ScorableSurvey;
import com.mypurecloud.sdk.v2.model.EvaluationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAggregationQuery;
import com.mypurecloud.sdk.v2.model.SurveyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAggregationQuery;
import com.mypurecloud.sdk.v2.model.CalibrationCreate;
import com.mypurecloud.sdk.v2.model.QMAuditQueryRequest;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationFormAndScoringSet;
import com.mypurecloud.sdk.v2.model.PublishForm;
import com.mypurecloud.sdk.v2.model.SurveyScoringSet;
import com.mypurecloud.sdk.v2.model.SurveyFormAndScoringSet;


import com.mypurecloud.sdk.v2.api.request.DeleteQualityCalibrationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityConversationEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityFormRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityFormsEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityFormsSurveyRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityAgentsActivityRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityCalibrationRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityCalibrationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityConversationEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityConversationSurveysRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityConversationsAuditsQueryTransactionIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityConversationsAuditsQueryTransactionIdResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityEvaluationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityEvaluatorsActivityRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsEvaluationVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveyRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveyVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveysRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveysBulkRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveysBulkContextsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsSurveyRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsSurveysRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualitySurveyRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualitySurveysScorableRequest;
import com.mypurecloud.sdk.v2.api.request.PatchQualityFormsSurveyRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsEvaluationsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsSurveysAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityCalibrationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityConversationEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityConversationsAuditsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityEvaluationsScoringRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityFormsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityFormsEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityFormsSurveysRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityPublishedformsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityPublishedformsEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityPublishedformsSurveysRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualitySurveysScoringRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityCalibrationRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityConversationEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityFormRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityFormsEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityFormsSurveyRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualitySurveysScorableRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class QualityApi {
  private final ApiClient pcapiClient;

  public QualityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QualityApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a calibration by id.
   * 
   * @param calibrationId Calibration ID (required)
   * @param calibratorId calibratorId (required)
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration deleteQualityCalibration(String calibrationId, String calibratorId) throws IOException, ApiException {
    return  deleteQualityCalibration(createDeleteQualityCalibrationRequest(calibrationId, calibratorId));
  }

  /**
   * Delete a calibration by id.
   * 
   * @param calibrationId Calibration ID (required)
   * @param calibratorId calibratorId (required)
   * @return Calibration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> deleteQualityCalibrationWithHttpInfo(String calibrationId, String calibratorId) throws IOException {
    return deleteQualityCalibration(createDeleteQualityCalibrationRequest(calibrationId, calibratorId).withHttpInfo());
  }

  private DeleteQualityCalibrationRequest createDeleteQualityCalibrationRequest(String calibrationId, String calibratorId) {
    return DeleteQualityCalibrationRequest.builder()
            .withCalibrationId(calibrationId)
    
            .withCalibratorId(calibratorId)
    
            .build();
  }

  /**
   * Delete a calibration by id.
   * 
   * @param request The request object
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration deleteQualityCalibration(DeleteQualityCalibrationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Calibration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Calibration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete a calibration by id.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> deleteQualityCalibration(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Calibration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)exception;
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
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation deleteQualityConversationEvaluation(String conversationId, String evaluationId, String expand) throws IOException, ApiException {
    return  deleteQualityConversationEvaluation(createDeleteQualityConversationEvaluationRequest(conversationId, evaluationId, expand));
  }

  /**
   * Delete an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> deleteQualityConversationEvaluationWithHttpInfo(String conversationId, String evaluationId, String expand) throws IOException {
    return deleteQualityConversationEvaluation(createDeleteQualityConversationEvaluationRequest(conversationId, evaluationId, expand).withHttpInfo());
  }

  private DeleteQualityConversationEvaluationRequest createDeleteQualityConversationEvaluationRequest(String conversationId, String evaluationId, String expand) {
    return DeleteQualityConversationEvaluationRequest.builder()
            .withConversationId(conversationId)
    
            .withEvaluationId(evaluationId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Delete an evaluation
   * 
   * @param request The request object
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation deleteQualityConversationEvaluation(DeleteQualityConversationEvaluationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Evaluation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Evaluation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete an evaluation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> deleteQualityConversationEvaluation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Evaluation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)exception;
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
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete an evaluation form.
   * 
   * @param formId Form ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteQualityForm(String formId) throws IOException, ApiException {
     deleteQualityForm(createDeleteQualityFormRequest(formId));
  }

  /**
   * Delete an evaluation form.
   * 
   * @param formId Form ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteQualityFormWithHttpInfo(String formId) throws IOException {
    return deleteQualityForm(createDeleteQualityFormRequest(formId).withHttpInfo());
  }

  private DeleteQualityFormRequest createDeleteQualityFormRequest(String formId) {
    return DeleteQualityFormRequest.builder()
            .withFormId(formId)
    
            .build();
  }

  /**
   * Delete an evaluation form.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteQualityForm(DeleteQualityFormRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an evaluation form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteQualityForm(ApiRequest<Void> request) throws IOException {
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
   * Delete an evaluation form.
   * 
   * @param formId Form ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteQualityFormsEvaluation(String formId) throws IOException, ApiException {
     deleteQualityFormsEvaluation(createDeleteQualityFormsEvaluationRequest(formId));
  }

  /**
   * Delete an evaluation form.
   * 
   * @param formId Form ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteQualityFormsEvaluationWithHttpInfo(String formId) throws IOException {
    return deleteQualityFormsEvaluation(createDeleteQualityFormsEvaluationRequest(formId).withHttpInfo());
  }

  private DeleteQualityFormsEvaluationRequest createDeleteQualityFormsEvaluationRequest(String formId) {
    return DeleteQualityFormsEvaluationRequest.builder()
            .withFormId(formId)
    
            .build();
  }

  /**
   * Delete an evaluation form.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteQualityFormsEvaluation(DeleteQualityFormsEvaluationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an evaluation form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteQualityFormsEvaluation(ApiRequest<Void> request) throws IOException {
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
   * Delete a survey form.
   * 
   * @param formId Form ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteQualityFormsSurvey(String formId) throws IOException, ApiException {
     deleteQualityFormsSurvey(createDeleteQualityFormsSurveyRequest(formId));
  }

  /**
   * Delete a survey form.
   * 
   * @param formId Form ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteQualityFormsSurveyWithHttpInfo(String formId) throws IOException {
    return deleteQualityFormsSurvey(createDeleteQualityFormsSurveyRequest(formId).withHttpInfo());
  }

  private DeleteQualityFormsSurveyRequest createDeleteQualityFormsSurveyRequest(String formId) {
    return DeleteQualityFormsSurveyRequest.builder()
            .withFormId(formId)
    
            .build();
  }

  /**
   * Delete a survey form.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteQualityFormsSurvey(DeleteQualityFormsSurveyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a survey form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteQualityFormsSurvey(ApiRequest<Void> request) throws IOException {
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
   * Gets a list of Agent Activities
   * Includes the number of evaluations and average evaluation score. These statistics include released evaluations only when evaluatorUserId is provided. In the absence of evaluatorUserId in the request, the api excludes evaluations which are set to never release for the calculation of evaluation statistics. 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param startTime Start time of agent activity based on assigned date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param endTime End time of agent activity based on assigned date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param agentUserId user id of agent requested (optional)
   * @param evaluatorUserId user id of the evaluator (optional)
   * @param name name (optional)
   * @param group group id (optional)
   * @return AgentActivityEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentActivityEntityListing getQualityAgentsActivity(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Date startTime, Date endTime, List<String> agentUserId, String evaluatorUserId, String name, String group) throws IOException, ApiException {
    return  getQualityAgentsActivity(createGetQualityAgentsActivityRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group));
  }

  /**
   * Gets a list of Agent Activities
   * Includes the number of evaluations and average evaluation score. These statistics include released evaluations only when evaluatorUserId is provided. In the absence of evaluatorUserId in the request, the api excludes evaluations which are set to never release for the calculation of evaluation statistics. 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param startTime Start time of agent activity based on assigned date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param endTime End time of agent activity based on assigned date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param agentUserId user id of agent requested (optional)
   * @param evaluatorUserId user id of the evaluator (optional)
   * @param name name (optional)
   * @param group group id (optional)
   * @return AgentActivityEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentActivityEntityListing> getQualityAgentsActivityWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Date startTime, Date endTime, List<String> agentUserId, String evaluatorUserId, String name, String group) throws IOException {
    return getQualityAgentsActivity(createGetQualityAgentsActivityRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group).withHttpInfo());
  }

  private GetQualityAgentsActivityRequest createGetQualityAgentsActivityRequest(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Date startTime, Date endTime, List<String> agentUserId, String evaluatorUserId, String name, String group) {
    return GetQualityAgentsActivityRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .withStartTime(startTime)
    
            .withEndTime(endTime)
    
            .withAgentUserId(agentUserId)
    
            .withEvaluatorUserId(evaluatorUserId)
    
            .withName(name)
    
            .withGroup(group)
    
            .build();
  }

  /**
   * Gets a list of Agent Activities
   * Includes the number of evaluations and average evaluation score. These statistics include released evaluations only when evaluatorUserId is provided. In the absence of evaluatorUserId in the request, the api excludes evaluations which are set to never release for the calculation of evaluation statistics. 
   * @param request The request object
   * @return AgentActivityEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentActivityEntityListing getQualityAgentsActivity(GetQualityAgentsActivityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentActivityEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentActivityEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a list of Agent Activities
   * Includes the number of evaluations and average evaluation score. These statistics include released evaluations only when evaluatorUserId is provided. In the absence of evaluatorUserId in the request, the api excludes evaluations which are set to never release for the calculation of evaluation statistics. 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentActivityEntityListing> getQualityAgentsActivity(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentActivityEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentActivityEntityListing> response = (ApiResponse<AgentActivityEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentActivityEntityListing> response = (ApiResponse<AgentActivityEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a calibration by id.  Requires either calibrator id or conversation id
   * 
   * @param calibrationId Calibration ID (required)
   * @param calibratorId calibratorId (optional)
   * @param conversationId conversationId (optional)
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration getQualityCalibration(String calibrationId, String calibratorId, String conversationId) throws IOException, ApiException {
    return  getQualityCalibration(createGetQualityCalibrationRequest(calibrationId, calibratorId, conversationId));
  }

  /**
   * Get a calibration by id.  Requires either calibrator id or conversation id
   * 
   * @param calibrationId Calibration ID (required)
   * @param calibratorId calibratorId (optional)
   * @param conversationId conversationId (optional)
   * @return Calibration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> getQualityCalibrationWithHttpInfo(String calibrationId, String calibratorId, String conversationId) throws IOException {
    return getQualityCalibration(createGetQualityCalibrationRequest(calibrationId, calibratorId, conversationId).withHttpInfo());
  }

  private GetQualityCalibrationRequest createGetQualityCalibrationRequest(String calibrationId, String calibratorId, String conversationId) {
    return GetQualityCalibrationRequest.builder()
            .withCalibrationId(calibrationId)
    
            .withCalibratorId(calibratorId)
    
            .withConversationId(conversationId)
    
            .build();
  }

  /**
   * Get a calibration by id.  Requires either calibrator id or conversation id
   * 
   * @param request The request object
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration getQualityCalibration(GetQualityCalibrationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Calibration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Calibration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a calibration by id.  Requires either calibrator id or conversation id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> getQualityCalibration(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Calibration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)exception;
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
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of calibrations
   * 
   * @param calibratorId user id of calibrator (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param conversationId conversation id (optional)
   * @param startTime Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param endTime end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @return CalibrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CalibrationEntityListing getQualityCalibrations(String calibratorId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String conversationId, Date startTime, Date endTime) throws IOException, ApiException {
    return  getQualityCalibrations(createGetQualityCalibrationsRequest(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime));
  }

  /**
   * Get the list of calibrations
   * 
   * @param calibratorId user id of calibrator (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param conversationId conversation id (optional)
   * @param startTime Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param endTime end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @return CalibrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CalibrationEntityListing> getQualityCalibrationsWithHttpInfo(String calibratorId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String conversationId, Date startTime, Date endTime) throws IOException {
    return getQualityCalibrations(createGetQualityCalibrationsRequest(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime).withHttpInfo());
  }

  private GetQualityCalibrationsRequest createGetQualityCalibrationsRequest(String calibratorId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String conversationId, Date startTime, Date endTime) {
    return GetQualityCalibrationsRequest.builder()
            .withCalibratorId(calibratorId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .withConversationId(conversationId)
    
            .withStartTime(startTime)
    
            .withEndTime(endTime)
    
            .build();
  }

  /**
   * Get the list of calibrations
   * 
   * @param request The request object
   * @return CalibrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CalibrationEntityListing getQualityCalibrations(GetQualityCalibrationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CalibrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CalibrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of calibrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CalibrationEntityListing> getQualityCalibrations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CalibrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CalibrationEntityListing> response = (ApiResponse<CalibrationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CalibrationEntityListing> response = (ApiResponse<CalibrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param expand agent, evaluator, evaluationForm (optional)
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation getQualityConversationEvaluation(String conversationId, String evaluationId, String expand) throws IOException, ApiException {
    return  getQualityConversationEvaluation(createGetQualityConversationEvaluationRequest(conversationId, evaluationId, expand));
  }

  /**
   * Get an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param expand agent, evaluator, evaluationForm (optional)
   * @return Evaluation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> getQualityConversationEvaluationWithHttpInfo(String conversationId, String evaluationId, String expand) throws IOException {
    return getQualityConversationEvaluation(createGetQualityConversationEvaluationRequest(conversationId, evaluationId, expand).withHttpInfo());
  }

  private GetQualityConversationEvaluationRequest createGetQualityConversationEvaluationRequest(String conversationId, String evaluationId, String expand) {
    return GetQualityConversationEvaluationRequest.builder()
            .withConversationId(conversationId)
    
            .withEvaluationId(evaluationId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get an evaluation
   * 
   * @param request The request object
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation getQualityConversationEvaluation(GetQualityConversationEvaluationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Evaluation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Evaluation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an evaluation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> getQualityConversationEvaluation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Evaluation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)exception;
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
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the surveys for a conversation
   * 
   * @param conversationId conversationId (required)
   * @return List<Survey>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Survey> getQualityConversationSurveys(String conversationId) throws IOException, ApiException {
    return  getQualityConversationSurveys(createGetQualityConversationSurveysRequest(conversationId));
  }

  /**
   * Get the surveys for a conversation
   * 
   * @param conversationId conversationId (required)
   * @return List<Survey>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Survey>> getQualityConversationSurveysWithHttpInfo(String conversationId) throws IOException {
    return getQualityConversationSurveys(createGetQualityConversationSurveysRequest(conversationId).withHttpInfo());
  }

  private GetQualityConversationSurveysRequest createGetQualityConversationSurveysRequest(String conversationId) {
    return GetQualityConversationSurveysRequest.builder()
            .withConversationId(conversationId)
    
            .build();
  }

  /**
   * Get the surveys for a conversation
   * 
   * @param request The request object
   * @return List<Survey>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Survey> getQualityConversationSurveys(GetQualityConversationSurveysRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<Survey>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<Survey>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the surveys for a conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Survey>> getQualityConversationSurveys(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<Survey>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<Survey>> response = (ApiResponse<List<Survey>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<Survey>> response = (ApiResponse<List<Survey>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get status of audit query execution
   * 
   * @param transactionId Transaction ID (required)
   * @return QualityAuditQueryExecutionStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QualityAuditQueryExecutionStatusResponse getQualityConversationsAuditsQueryTransactionId(String transactionId) throws IOException, ApiException {
    return  getQualityConversationsAuditsQueryTransactionId(createGetQualityConversationsAuditsQueryTransactionIdRequest(transactionId));
  }

  /**
   * Get status of audit query execution
   * 
   * @param transactionId Transaction ID (required)
   * @return QualityAuditQueryExecutionStatusResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QualityAuditQueryExecutionStatusResponse> getQualityConversationsAuditsQueryTransactionIdWithHttpInfo(String transactionId) throws IOException {
    return getQualityConversationsAuditsQueryTransactionId(createGetQualityConversationsAuditsQueryTransactionIdRequest(transactionId).withHttpInfo());
  }

  private GetQualityConversationsAuditsQueryTransactionIdRequest createGetQualityConversationsAuditsQueryTransactionIdRequest(String transactionId) {
    return GetQualityConversationsAuditsQueryTransactionIdRequest.builder()
            .withTransactionId(transactionId)
    
            .build();
  }

  /**
   * Get status of audit query execution
   * 
   * @param request The request object
   * @return QualityAuditQueryExecutionStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QualityAuditQueryExecutionStatusResponse getQualityConversationsAuditsQueryTransactionId(GetQualityConversationsAuditsQueryTransactionIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QualityAuditQueryExecutionStatusResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QualityAuditQueryExecutionStatusResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status of audit query execution
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QualityAuditQueryExecutionStatusResponse> getQualityConversationsAuditsQueryTransactionId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QualityAuditQueryExecutionStatusResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QualityAuditQueryExecutionStatusResponse> response = (ApiResponse<QualityAuditQueryExecutionStatusResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<QualityAuditQueryExecutionStatusResponse> response = (ApiResponse<QualityAuditQueryExecutionStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get results of audit query
   * 
   * @param transactionId Transaction ID (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param expand Which fields, if any, to expand (optional)
   * @return QualityAuditQueryExecutionResultsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QualityAuditQueryExecutionResultsResponse getQualityConversationsAuditsQueryTransactionIdResults(String transactionId, String cursor, Integer pageSize, List<String> expand) throws IOException, ApiException {
    return  getQualityConversationsAuditsQueryTransactionIdResults(createGetQualityConversationsAuditsQueryTransactionIdResultsRequest(transactionId, cursor, pageSize, expand));
  }

  /**
   * Get results of audit query
   * 
   * @param transactionId Transaction ID (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param expand Which fields, if any, to expand (optional)
   * @return QualityAuditQueryExecutionResultsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QualityAuditQueryExecutionResultsResponse> getQualityConversationsAuditsQueryTransactionIdResultsWithHttpInfo(String transactionId, String cursor, Integer pageSize, List<String> expand) throws IOException {
    return getQualityConversationsAuditsQueryTransactionIdResults(createGetQualityConversationsAuditsQueryTransactionIdResultsRequest(transactionId, cursor, pageSize, expand).withHttpInfo());
  }

  private GetQualityConversationsAuditsQueryTransactionIdResultsRequest createGetQualityConversationsAuditsQueryTransactionIdResultsRequest(String transactionId, String cursor, Integer pageSize, List<String> expand) {
    return GetQualityConversationsAuditsQueryTransactionIdResultsRequest.builder()
            .withTransactionId(transactionId)
    
            .withCursor(cursor)
    
            .withPageSize(pageSize)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get results of audit query
   * 
   * @param request The request object
   * @return QualityAuditQueryExecutionResultsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QualityAuditQueryExecutionResultsResponse getQualityConversationsAuditsQueryTransactionIdResults(GetQualityConversationsAuditsQueryTransactionIdResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QualityAuditQueryExecutionResultsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QualityAuditQueryExecutionResultsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get results of audit query
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QualityAuditQueryExecutionResultsResponse> getQualityConversationsAuditsQueryTransactionIdResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QualityAuditQueryExecutionResultsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QualityAuditQueryExecutionResultsResponse> response = (ApiResponse<QualityAuditQueryExecutionResultsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<QualityAuditQueryExecutionResultsResponse> response = (ApiResponse<QualityAuditQueryExecutionResultsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId. When querying by agentUserId (and not conversationId or evaluatorUserId), the results are sorted by release date. Evaluations set to &#39;Never Release&#39; are omitted in this case. When querying by evaluatorUserId or conversationId (including when combined with agentUserId), the results are sorted by assigned date.
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param conversationId conversationId specified (optional)
   * @param agentUserId user id of the agent (optional)
   * @param evaluatorUserId evaluator user id (optional)
   * @param queueId queue id (optional)
   * @param startTime start time of the evaluation query (optional)
   * @param endTime end time of the evaluation query (optional)
   * @param evaluationState  (optional)
   * @param isReleased the evaluation has been released (optional)
   * @param agentHasRead agent has the evaluation (optional)
   * @param expandAnswerTotalScores get the total scores for evaluations (optional)
   * @param maximum maximum (optional)
   * @param sortOrder sort order options for agentUserId or evaluatorUserId query. Valid options are &#39;a&#39;, &#39;asc&#39;, &#39;ascending&#39;, &#39;d&#39;, &#39;desc&#39;, &#39;descending&#39; (optional)
   * @return EvaluationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationEntityListing getQualityEvaluationsQuery(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String conversationId, String agentUserId, String evaluatorUserId, String queueId, String startTime, String endTime, List<String> evaluationState, Boolean isReleased, Boolean agentHasRead, Boolean expandAnswerTotalScores, Integer maximum, String sortOrder) throws IOException, ApiException {
    return  getQualityEvaluationsQuery(createGetQualityEvaluationsQueryRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, agentUserId, evaluatorUserId, queueId, startTime, endTime, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum, sortOrder));
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId. When querying by agentUserId (and not conversationId or evaluatorUserId), the results are sorted by release date. Evaluations set to &#39;Never Release&#39; are omitted in this case. When querying by evaluatorUserId or conversationId (including when combined with agentUserId), the results are sorted by assigned date.
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param conversationId conversationId specified (optional)
   * @param agentUserId user id of the agent (optional)
   * @param evaluatorUserId evaluator user id (optional)
   * @param queueId queue id (optional)
   * @param startTime start time of the evaluation query (optional)
   * @param endTime end time of the evaluation query (optional)
   * @param evaluationState  (optional)
   * @param isReleased the evaluation has been released (optional)
   * @param agentHasRead agent has the evaluation (optional)
   * @param expandAnswerTotalScores get the total scores for evaluations (optional)
   * @param maximum maximum (optional)
   * @param sortOrder sort order options for agentUserId or evaluatorUserId query. Valid options are &#39;a&#39;, &#39;asc&#39;, &#39;ascending&#39;, &#39;d&#39;, &#39;desc&#39;, &#39;descending&#39; (optional)
   * @return EvaluationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationEntityListing> getQualityEvaluationsQueryWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String conversationId, String agentUserId, String evaluatorUserId, String queueId, String startTime, String endTime, List<String> evaluationState, Boolean isReleased, Boolean agentHasRead, Boolean expandAnswerTotalScores, Integer maximum, String sortOrder) throws IOException {
    return getQualityEvaluationsQuery(createGetQualityEvaluationsQueryRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, agentUserId, evaluatorUserId, queueId, startTime, endTime, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum, sortOrder).withHttpInfo());
  }

  private GetQualityEvaluationsQueryRequest createGetQualityEvaluationsQueryRequest(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String conversationId, String agentUserId, String evaluatorUserId, String queueId, String startTime, String endTime, List<String> evaluationState, Boolean isReleased, Boolean agentHasRead, Boolean expandAnswerTotalScores, Integer maximum, String sortOrder) {
    return GetQualityEvaluationsQueryRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .withConversationId(conversationId)
    
            .withAgentUserId(agentUserId)
    
            .withEvaluatorUserId(evaluatorUserId)
    
            .withQueueId(queueId)
    
            .withStartTime(startTime)
    
            .withEndTime(endTime)
    
            .withEvaluationState(evaluationState)
    
            .withIsReleased(isReleased)
    
            .withAgentHasRead(agentHasRead)
    
            .withExpandAnswerTotalScores(expandAnswerTotalScores)
    
            .withMaximum(maximum)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId. When querying by agentUserId (and not conversationId or evaluatorUserId), the results are sorted by release date. Evaluations set to &#39;Never Release&#39; are omitted in this case. When querying by evaluatorUserId or conversationId (including when combined with agentUserId), the results are sorted by assigned date.
   * @param request The request object
   * @return EvaluationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationEntityListing getQualityEvaluationsQuery(GetQualityEvaluationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId. When querying by agentUserId (and not conversationId or evaluatorUserId), the results are sorted by release date. Evaluations set to &#39;Never Release&#39; are omitted in this case. When querying by evaluatorUserId or conversationId (including when combined with agentUserId), the results are sorted by assigned date.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationEntityListing> getQualityEvaluationsQuery(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationEntityListing> response = (ApiResponse<EvaluationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationEntityListing> response = (ApiResponse<EvaluationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get an evaluator activity
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param startTime The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param endTime The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param name Evaluator name (optional)
   * @param permission permission strings (optional)
   * @param group group id (optional)
   * @return EvaluatorActivityEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluatorActivityEntityListing getQualityEvaluatorsActivity(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Date startTime, Date endTime, String name, List<String> permission, String group) throws IOException, ApiException {
    return  getQualityEvaluatorsActivity(createGetQualityEvaluatorsActivityRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group));
  }

  /**
   * Get an evaluator activity
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param startTime The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param endTime The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param name Evaluator name (optional)
   * @param permission permission strings (optional)
   * @param group group id (optional)
   * @return EvaluatorActivityEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluatorActivityEntityListing> getQualityEvaluatorsActivityWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Date startTime, Date endTime, String name, List<String> permission, String group) throws IOException {
    return getQualityEvaluatorsActivity(createGetQualityEvaluatorsActivityRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group).withHttpInfo());
  }

  private GetQualityEvaluatorsActivityRequest createGetQualityEvaluatorsActivityRequest(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Date startTime, Date endTime, String name, List<String> permission, String group) {
    return GetQualityEvaluatorsActivityRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .withStartTime(startTime)
    
            .withEndTime(endTime)
    
            .withName(name)
    
            .withPermission(permission)
    
            .withGroup(group)
    
            .build();
  }

  /**
   * Get an evaluator activity
   * 
   * @param request The request object
   * @return EvaluatorActivityEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluatorActivityEntityListing getQualityEvaluatorsActivity(GetQualityEvaluatorsActivityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluatorActivityEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluatorActivityEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an evaluator activity
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluatorActivityEntityListing> getQualityEvaluatorsActivity(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluatorActivityEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluatorActivityEntityListing> response = (ApiResponse<EvaluatorActivityEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluatorActivityEntityListing> response = (ApiResponse<EvaluatorActivityEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get an evaluation form
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm getQualityForm(String formId) throws IOException, ApiException {
    return  getQualityForm(createGetQualityFormRequest(formId));
  }

  /**
   * Get an evaluation form
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> getQualityFormWithHttpInfo(String formId) throws IOException {
    return getQualityForm(createGetQualityFormRequest(formId).withHttpInfo());
  }

  private GetQualityFormRequest createGetQualityFormRequest(String formId) {
    return GetQualityFormRequest.builder()
            .withFormId(formId)
    
            .build();
  }

  /**
   * Get an evaluation form
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm getQualityForm(GetQualityFormRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an evaluation form
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> getQualityForm(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param formId Form ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityFormVersions(String formId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getQualityFormVersions(createGetQualityFormVersionsRequest(formId, pageSize, pageNumber));
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param formId Form ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return EvaluationFormEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityFormVersionsWithHttpInfo(String formId, Integer pageSize, Integer pageNumber) throws IOException {
    return getQualityFormVersions(createGetQualityFormVersionsRequest(formId, pageSize, pageNumber).withHttpInfo());
  }

  private GetQualityFormVersionsRequest createGetQualityFormVersionsRequest(String formId, Integer pageSize, Integer pageNumber) {
    return GetQualityFormVersionsRequest.builder()
            .withFormId(formId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param request The request object
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityFormVersions(GetQualityFormVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationFormEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityFormVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationFormEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of evaluation forms
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param expand Expand (optional)
   * @param name Name (optional)
   * @param sortOrder Order to sort results, either asc or desc (optional)
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityForms(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name, String sortOrder) throws IOException, ApiException {
    return  getQualityForms(createGetQualityFormsRequest(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder));
  }

  /**
   * Get the list of evaluation forms
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param expand Expand (optional)
   * @param name Name (optional)
   * @param sortOrder Order to sort results, either asc or desc (optional)
   * @return EvaluationFormEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityFormsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name, String sortOrder) throws IOException {
    return getQualityForms(createGetQualityFormsRequest(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder).withHttpInfo());
  }

  private GetQualityFormsRequest createGetQualityFormsRequest(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name, String sortOrder) {
    return GetQualityFormsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .withExpand(expand)
    
            .withName(name)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get the list of evaluation forms
   * 
   * @param request The request object
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityForms(GetQualityFormsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationFormEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of evaluation forms
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityForms(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationFormEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get an evaluation form
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm getQualityFormsEvaluation(String formId) throws IOException, ApiException {
    return  getQualityFormsEvaluation(createGetQualityFormsEvaluationRequest(formId));
  }

  /**
   * Get an evaluation form
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> getQualityFormsEvaluationWithHttpInfo(String formId) throws IOException {
    return getQualityFormsEvaluation(createGetQualityFormsEvaluationRequest(formId).withHttpInfo());
  }

  private GetQualityFormsEvaluationRequest createGetQualityFormsEvaluationRequest(String formId) {
    return GetQualityFormsEvaluationRequest.builder()
            .withFormId(formId)
    
            .build();
  }

  /**
   * Get an evaluation form
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm getQualityFormsEvaluation(GetQualityFormsEvaluationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an evaluation form
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> getQualityFormsEvaluation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param formId Form ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to asc)
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityFormsEvaluationVersions(String formId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return  getQualityFormsEvaluationVersions(createGetQualityFormsEvaluationVersionsRequest(formId, pageSize, pageNumber, sortOrder));
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param formId Form ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to asc)
   * @return EvaluationFormEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityFormsEvaluationVersionsWithHttpInfo(String formId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException {
    return getQualityFormsEvaluationVersions(createGetQualityFormsEvaluationVersionsRequest(formId, pageSize, pageNumber, sortOrder).withHttpInfo());
  }

  private GetQualityFormsEvaluationVersionsRequest createGetQualityFormsEvaluationVersionsRequest(String formId, Integer pageSize, Integer pageNumber, String sortOrder) {
    return GetQualityFormsEvaluationVersionsRequest.builder()
            .withFormId(formId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param request The request object
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityFormsEvaluationVersions(GetQualityFormsEvaluationVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationFormEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityFormsEvaluationVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationFormEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of evaluation forms
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param expand Expand (optional)
   * @param name Name (optional)
   * @param sortOrder Order to sort results, either asc or desc (optional)
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityFormsEvaluations(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name, String sortOrder) throws IOException, ApiException {
    return  getQualityFormsEvaluations(createGetQualityFormsEvaluationsRequest(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder));
  }

  /**
   * Get the list of evaluation forms
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param expand Expand (optional)
   * @param name Name (optional)
   * @param sortOrder Order to sort results, either asc or desc (optional)
   * @return EvaluationFormEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityFormsEvaluationsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name, String sortOrder) throws IOException {
    return getQualityFormsEvaluations(createGetQualityFormsEvaluationsRequest(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder).withHttpInfo());
  }

  private GetQualityFormsEvaluationsRequest createGetQualityFormsEvaluationsRequest(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name, String sortOrder) {
    return GetQualityFormsEvaluationsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .withExpand(expand)
    
            .withName(name)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get the list of evaluation forms
   * 
   * @param request The request object
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityFormsEvaluations(GetQualityFormsEvaluationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationFormEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of evaluation forms
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityFormsEvaluations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationFormEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a survey form
   * 
   * @param formId Form ID (required)
   * @return SurveyForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyForm getQualityFormsSurvey(String formId) throws IOException, ApiException {
    return  getQualityFormsSurvey(createGetQualityFormsSurveyRequest(formId));
  }

  /**
   * Get a survey form
   * 
   * @param formId Form ID (required)
   * @return SurveyForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyForm> getQualityFormsSurveyWithHttpInfo(String formId) throws IOException {
    return getQualityFormsSurvey(createGetQualityFormsSurveyRequest(formId).withHttpInfo());
  }

  private GetQualityFormsSurveyRequest createGetQualityFormsSurveyRequest(String formId) {
    return GetQualityFormsSurveyRequest.builder()
            .withFormId(formId)
    
            .build();
  }

  /**
   * Get a survey form
   * 
   * @param request The request object
   * @return SurveyForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyForm getQualityFormsSurvey(GetQualityFormsSurveyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a survey form
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyForm> getQualityFormsSurvey(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)exception;
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
      ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets all the revisions for a specific survey.
   * 
   * @param formId Form ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SurveyFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyFormEntityListing getQualityFormsSurveyVersions(String formId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getQualityFormsSurveyVersions(createGetQualityFormsSurveyVersionsRequest(formId, pageSize, pageNumber));
  }

  /**
   * Gets all the revisions for a specific survey.
   * 
   * @param formId Form ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SurveyFormEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyFormEntityListing> getQualityFormsSurveyVersionsWithHttpInfo(String formId, Integer pageSize, Integer pageNumber) throws IOException {
    return getQualityFormsSurveyVersions(createGetQualityFormsSurveyVersionsRequest(formId, pageSize, pageNumber).withHttpInfo());
  }

  private GetQualityFormsSurveyVersionsRequest createGetQualityFormsSurveyVersionsRequest(String formId, Integer pageSize, Integer pageNumber) {
    return GetQualityFormsSurveyVersionsRequest.builder()
            .withFormId(formId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Gets all the revisions for a specific survey.
   * 
   * @param request The request object
   * @return SurveyFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyFormEntityListing getQualityFormsSurveyVersions(GetQualityFormsSurveyVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyFormEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyFormEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets all the revisions for a specific survey.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyFormEntityListing> getQualityFormsSurveyVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyFormEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of survey forms
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param expand Expand (optional)
   * @param name Name (optional)
   * @param sortOrder Order to sort results, either asc or desc (optional)
   * @return SurveyFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyFormEntityListing getQualityFormsSurveys(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name, String sortOrder) throws IOException, ApiException {
    return  getQualityFormsSurveys(createGetQualityFormsSurveysRequest(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder));
  }

  /**
   * Get the list of survey forms
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param expand Expand (optional)
   * @param name Name (optional)
   * @param sortOrder Order to sort results, either asc or desc (optional)
   * @return SurveyFormEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyFormEntityListing> getQualityFormsSurveysWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name, String sortOrder) throws IOException {
    return getQualityFormsSurveys(createGetQualityFormsSurveysRequest(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder).withHttpInfo());
  }

  private GetQualityFormsSurveysRequest createGetQualityFormsSurveysRequest(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name, String sortOrder) {
    return GetQualityFormsSurveysRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .withExpand(expand)
    
            .withName(name)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get the list of survey forms
   * 
   * @param request The request object
   * @return SurveyFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyFormEntityListing getQualityFormsSurveys(GetQualityFormsSurveysRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyFormEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyFormEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of survey forms
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyFormEntityListing> getQualityFormsSurveys(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyFormEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve a list of survey forms by their ids
   * 
   * @param id A comma-delimited list of valid survey form ids (required)
   * @return SurveyFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyFormEntityListing getQualityFormsSurveysBulk(List<String> id) throws IOException, ApiException {
    return  getQualityFormsSurveysBulk(createGetQualityFormsSurveysBulkRequest(id));
  }

  /**
   * Retrieve a list of survey forms by their ids
   * 
   * @param id A comma-delimited list of valid survey form ids (required)
   * @return SurveyFormEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyFormEntityListing> getQualityFormsSurveysBulkWithHttpInfo(List<String> id) throws IOException {
    return getQualityFormsSurveysBulk(createGetQualityFormsSurveysBulkRequest(id).withHttpInfo());
  }

  private GetQualityFormsSurveysBulkRequest createGetQualityFormsSurveysBulkRequest(List<String> id) {
    return GetQualityFormsSurveysBulkRequest.builder()
            .withId(id)
    
            .build();
  }

  /**
   * Retrieve a list of survey forms by their ids
   * 
   * @param request The request object
   * @return SurveyFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyFormEntityListing getQualityFormsSurveysBulk(GetQualityFormsSurveysBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyFormEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyFormEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a list of survey forms by their ids
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyFormEntityListing> getQualityFormsSurveysBulk(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyFormEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve a list of the latest form versions by context ids
   * 
   * @param contextId A comma-delimited list of valid survey form context ids (required)
   * @param published If true, the latest published version will be included. If false, only the unpublished version will be included. (optional, default to true)
   * @return List<SurveyForm>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<SurveyForm> getQualityFormsSurveysBulkContexts(List<String> contextId, Boolean published) throws IOException, ApiException {
    return  getQualityFormsSurveysBulkContexts(createGetQualityFormsSurveysBulkContextsRequest(contextId, published));
  }

  /**
   * Retrieve a list of the latest form versions by context ids
   * 
   * @param contextId A comma-delimited list of valid survey form context ids (required)
   * @param published If true, the latest published version will be included. If false, only the unpublished version will be included. (optional, default to true)
   * @return List<SurveyForm>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<SurveyForm>> getQualityFormsSurveysBulkContextsWithHttpInfo(List<String> contextId, Boolean published) throws IOException {
    return getQualityFormsSurveysBulkContexts(createGetQualityFormsSurveysBulkContextsRequest(contextId, published).withHttpInfo());
  }

  private GetQualityFormsSurveysBulkContextsRequest createGetQualityFormsSurveysBulkContextsRequest(List<String> contextId, Boolean published) {
    return GetQualityFormsSurveysBulkContextsRequest.builder()
            .withContextId(contextId)
    
            .withPublished(published)
    
            .build();
  }

  /**
   * Retrieve a list of the latest form versions by context ids
   * 
   * @param request The request object
   * @return List<SurveyForm>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<SurveyForm> getQualityFormsSurveysBulkContexts(GetQualityFormsSurveysBulkContextsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<SurveyForm>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<SurveyForm>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a list of the latest form versions by context ids
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<SurveyForm>> getQualityFormsSurveysBulkContexts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<SurveyForm>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<SurveyForm>> response = (ApiResponse<List<SurveyForm>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<SurveyForm>> response = (ApiResponse<List<SurveyForm>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the published evaluation forms.
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm getQualityPublishedform(String formId) throws IOException, ApiException {
    return  getQualityPublishedform(createGetQualityPublishedformRequest(formId));
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> getQualityPublishedformWithHttpInfo(String formId) throws IOException {
    return getQualityPublishedform(createGetQualityPublishedformRequest(formId).withHttpInfo());
  }

  private GetQualityPublishedformRequest createGetQualityPublishedformRequest(String formId) {
    return GetQualityPublishedformRequest.builder()
            .withFormId(formId)
    
            .build();
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm getQualityPublishedform(GetQualityPublishedformRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> getQualityPublishedform(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the published evaluation forms.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param onlyLatestPerContext onlyLatestPerContext (optional, default to false)
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityPublishedforms(Integer pageSize, Integer pageNumber, String name, Boolean onlyLatestPerContext) throws IOException, ApiException {
    return  getQualityPublishedforms(createGetQualityPublishedformsRequest(pageSize, pageNumber, name, onlyLatestPerContext));
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param onlyLatestPerContext onlyLatestPerContext (optional, default to false)
   * @return EvaluationFormEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityPublishedformsWithHttpInfo(Integer pageSize, Integer pageNumber, String name, Boolean onlyLatestPerContext) throws IOException {
    return getQualityPublishedforms(createGetQualityPublishedformsRequest(pageSize, pageNumber, name, onlyLatestPerContext).withHttpInfo());
  }

  private GetQualityPublishedformsRequest createGetQualityPublishedformsRequest(Integer pageSize, Integer pageNumber, String name, Boolean onlyLatestPerContext) {
    return GetQualityPublishedformsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withName(name)
    
            .withOnlyLatestPerContext(onlyLatestPerContext)
    
            .build();
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request The request object
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityPublishedforms(GetQualityPublishedformsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationFormEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityPublishedforms(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationFormEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the most recent published version of an evaluation form.
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm getQualityPublishedformsEvaluation(String formId) throws IOException, ApiException {
    return  getQualityPublishedformsEvaluation(createGetQualityPublishedformsEvaluationRequest(formId));
  }

  /**
   * Get the most recent published version of an evaluation form.
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> getQualityPublishedformsEvaluationWithHttpInfo(String formId) throws IOException {
    return getQualityPublishedformsEvaluation(createGetQualityPublishedformsEvaluationRequest(formId).withHttpInfo());
  }

  private GetQualityPublishedformsEvaluationRequest createGetQualityPublishedformsEvaluationRequest(String formId) {
    return GetQualityPublishedformsEvaluationRequest.builder()
            .withFormId(formId)
    
            .build();
  }

  /**
   * Get the most recent published version of an evaluation form.
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm getQualityPublishedformsEvaluation(GetQualityPublishedformsEvaluationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the most recent published version of an evaluation form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> getQualityPublishedformsEvaluation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the published evaluation forms.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param onlyLatestPerContext onlyLatestPerContext (optional, default to false)
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityPublishedformsEvaluations(Integer pageSize, Integer pageNumber, String name, Boolean onlyLatestPerContext) throws IOException, ApiException {
    return  getQualityPublishedformsEvaluations(createGetQualityPublishedformsEvaluationsRequest(pageSize, pageNumber, name, onlyLatestPerContext));
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param onlyLatestPerContext onlyLatestPerContext (optional, default to false)
   * @return EvaluationFormEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityPublishedformsEvaluationsWithHttpInfo(Integer pageSize, Integer pageNumber, String name, Boolean onlyLatestPerContext) throws IOException {
    return getQualityPublishedformsEvaluations(createGetQualityPublishedformsEvaluationsRequest(pageSize, pageNumber, name, onlyLatestPerContext).withHttpInfo());
  }

  private GetQualityPublishedformsEvaluationsRequest createGetQualityPublishedformsEvaluationsRequest(Integer pageSize, Integer pageNumber, String name, Boolean onlyLatestPerContext) {
    return GetQualityPublishedformsEvaluationsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withName(name)
    
            .withOnlyLatestPerContext(onlyLatestPerContext)
    
            .build();
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request The request object
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityPublishedformsEvaluations(GetQualityPublishedformsEvaluationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationFormEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityPublishedformsEvaluations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationFormEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the most recent published version of a survey form.
   * 
   * @param formId Form ID (required)
   * @return SurveyForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyForm getQualityPublishedformsSurvey(String formId) throws IOException, ApiException {
    return  getQualityPublishedformsSurvey(createGetQualityPublishedformsSurveyRequest(formId));
  }

  /**
   * Get the most recent published version of a survey form.
   * 
   * @param formId Form ID (required)
   * @return SurveyForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyForm> getQualityPublishedformsSurveyWithHttpInfo(String formId) throws IOException {
    return getQualityPublishedformsSurvey(createGetQualityPublishedformsSurveyRequest(formId).withHttpInfo());
  }

  private GetQualityPublishedformsSurveyRequest createGetQualityPublishedformsSurveyRequest(String formId) {
    return GetQualityPublishedformsSurveyRequest.builder()
            .withFormId(formId)
    
            .build();
  }

  /**
   * Get the most recent published version of a survey form.
   * 
   * @param request The request object
   * @return SurveyForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyForm getQualityPublishedformsSurvey(GetQualityPublishedformsSurveyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the most recent published version of a survey form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyForm> getQualityPublishedformsSurvey(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)exception;
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
      ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the published survey forms.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param onlyLatestEnabledPerContext onlyLatestEnabledPerContext (optional, default to false)
   * @return SurveyFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyFormEntityListing getQualityPublishedformsSurveys(Integer pageSize, Integer pageNumber, String name, Boolean onlyLatestEnabledPerContext) throws IOException, ApiException {
    return  getQualityPublishedformsSurveys(createGetQualityPublishedformsSurveysRequest(pageSize, pageNumber, name, onlyLatestEnabledPerContext));
  }

  /**
   * Get the published survey forms.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param onlyLatestEnabledPerContext onlyLatestEnabledPerContext (optional, default to false)
   * @return SurveyFormEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyFormEntityListing> getQualityPublishedformsSurveysWithHttpInfo(Integer pageSize, Integer pageNumber, String name, Boolean onlyLatestEnabledPerContext) throws IOException {
    return getQualityPublishedformsSurveys(createGetQualityPublishedformsSurveysRequest(pageSize, pageNumber, name, onlyLatestEnabledPerContext).withHttpInfo());
  }

  private GetQualityPublishedformsSurveysRequest createGetQualityPublishedformsSurveysRequest(Integer pageSize, Integer pageNumber, String name, Boolean onlyLatestEnabledPerContext) {
    return GetQualityPublishedformsSurveysRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withName(name)
    
            .withOnlyLatestEnabledPerContext(onlyLatestEnabledPerContext)
    
            .build();
  }

  /**
   * Get the published survey forms.
   * 
   * @param request The request object
   * @return SurveyFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyFormEntityListing getQualityPublishedformsSurveys(GetQualityPublishedformsSurveysRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyFormEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyFormEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the published survey forms.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyFormEntityListing> getQualityPublishedformsSurveys(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyFormEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a survey for a conversation
   * 
   * @param surveyId surveyId (required)
   * @return Survey
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Survey getQualitySurvey(String surveyId) throws IOException, ApiException {
    return  getQualitySurvey(createGetQualitySurveyRequest(surveyId));
  }

  /**
   * Get a survey for a conversation
   * 
   * @param surveyId surveyId (required)
   * @return Survey
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Survey> getQualitySurveyWithHttpInfo(String surveyId) throws IOException {
    return getQualitySurvey(createGetQualitySurveyRequest(surveyId).withHttpInfo());
  }

  private GetQualitySurveyRequest createGetQualitySurveyRequest(String surveyId) {
    return GetQualitySurveyRequest.builder()
            .withSurveyId(surveyId)
    
            .build();
  }

  /**
   * Get a survey for a conversation
   * 
   * @param request The request object
   * @return Survey
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Survey getQualitySurvey(GetQualitySurveyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Survey> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Survey>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a survey for a conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Survey> getQualitySurvey(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Survey>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Survey> response = (ApiResponse<Survey>)(ApiResponse<?>)exception;
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
      ApiResponse<Survey> response = (ApiResponse<Survey>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a survey as an end-customer, for the purposes of scoring it.
   * 
   * @param customerSurveyUrl customerSurveyUrl (required)
   * @return ScorableSurvey
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScorableSurvey getQualitySurveysScorable(String customerSurveyUrl) throws IOException, ApiException {
    return  getQualitySurveysScorable(createGetQualitySurveysScorableRequest(customerSurveyUrl));
  }

  /**
   * Get a survey as an end-customer, for the purposes of scoring it.
   * 
   * @param customerSurveyUrl customerSurveyUrl (required)
   * @return ScorableSurvey
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScorableSurvey> getQualitySurveysScorableWithHttpInfo(String customerSurveyUrl) throws IOException {
    return getQualitySurveysScorable(createGetQualitySurveysScorableRequest(customerSurveyUrl).withHttpInfo());
  }

  private GetQualitySurveysScorableRequest createGetQualitySurveysScorableRequest(String customerSurveyUrl) {
    return GetQualitySurveysScorableRequest.builder()
            .withCustomerSurveyUrl(customerSurveyUrl)
    
            .build();
  }

  /**
   * Get a survey as an end-customer, for the purposes of scoring it.
   * 
   * @param request The request object
   * @return ScorableSurvey
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScorableSurvey getQualitySurveysScorable(GetQualitySurveysScorableRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScorableSurvey> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScorableSurvey>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a survey as an end-customer, for the purposes of scoring it.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScorableSurvey> getQualitySurveysScorable(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScorableSurvey>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScorableSurvey> response = (ApiResponse<ScorableSurvey>)(ApiResponse<?>)exception;
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
      ApiResponse<ScorableSurvey> response = (ApiResponse<ScorableSurvey>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Disable a particular version of a survey form and invalidates any invitations that have already been sent to customers using this version of the form.
   * 
   * @param formId Form ID (required)
   * @param body Survey form (required)
   * @return SurveyForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyForm patchQualityFormsSurvey(String formId, SurveyForm body) throws IOException, ApiException {
    return  patchQualityFormsSurvey(createPatchQualityFormsSurveyRequest(formId, body));
  }

  /**
   * Disable a particular version of a survey form and invalidates any invitations that have already been sent to customers using this version of the form.
   * 
   * @param formId Form ID (required)
   * @param body Survey form (required)
   * @return SurveyForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyForm> patchQualityFormsSurveyWithHttpInfo(String formId, SurveyForm body) throws IOException {
    return patchQualityFormsSurvey(createPatchQualityFormsSurveyRequest(formId, body).withHttpInfo());
  }

  private PatchQualityFormsSurveyRequest createPatchQualityFormsSurveyRequest(String formId, SurveyForm body) {
    return PatchQualityFormsSurveyRequest.builder()
            .withFormId(formId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Disable a particular version of a survey form and invalidates any invitations that have already been sent to customers using this version of the form.
   * 
   * @param request The request object
   * @return SurveyForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyForm patchQualityFormsSurvey(PatchQualityFormsSurveyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Disable a particular version of a survey form and invalidates any invitations that have already been sent to customers using this version of the form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyForm> patchQualityFormsSurvey(ApiRequest<SurveyForm> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)exception;
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
      ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for evaluation aggregates
   * 
   * @param body query (required)
   * @return EvaluationAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationAggregateQueryResponse postAnalyticsEvaluationsAggregatesQuery(EvaluationAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsEvaluationsAggregatesQuery(createPostAnalyticsEvaluationsAggregatesQueryRequest(body));
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param body query (required)
   * @return EvaluationAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationAggregateQueryResponse> postAnalyticsEvaluationsAggregatesQueryWithHttpInfo(EvaluationAggregationQuery body) throws IOException {
    return postAnalyticsEvaluationsAggregatesQuery(createPostAnalyticsEvaluationsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsEvaluationsAggregatesQueryRequest createPostAnalyticsEvaluationsAggregatesQueryRequest(EvaluationAggregationQuery body) {
    return PostAnalyticsEvaluationsAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param request The request object
   * @return EvaluationAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationAggregateQueryResponse postAnalyticsEvaluationsAggregatesQuery(PostAnalyticsEvaluationsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationAggregateQueryResponse> postAnalyticsEvaluationsAggregatesQuery(ApiRequest<EvaluationAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationAggregateQueryResponse> response = (ApiResponse<EvaluationAggregateQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationAggregateQueryResponse> response = (ApiResponse<EvaluationAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for survey aggregates
   * 
   * @param body query (required)
   * @return SurveyAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyAggregateQueryResponse postAnalyticsSurveysAggregatesQuery(SurveyAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsSurveysAggregatesQuery(createPostAnalyticsSurveysAggregatesQueryRequest(body));
  }

  /**
   * Query for survey aggregates
   * 
   * @param body query (required)
   * @return SurveyAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyAggregateQueryResponse> postAnalyticsSurveysAggregatesQueryWithHttpInfo(SurveyAggregationQuery body) throws IOException {
    return postAnalyticsSurveysAggregatesQuery(createPostAnalyticsSurveysAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsSurveysAggregatesQueryRequest createPostAnalyticsSurveysAggregatesQueryRequest(SurveyAggregationQuery body) {
    return PostAnalyticsSurveysAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for survey aggregates
   * 
   * @param request The request object
   * @return SurveyAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyAggregateQueryResponse postAnalyticsSurveysAggregatesQuery(PostAnalyticsSurveysAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for survey aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyAggregateQueryResponse> postAnalyticsSurveysAggregatesQuery(ApiRequest<SurveyAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyAggregateQueryResponse> response = (ApiResponse<SurveyAggregateQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SurveyAggregateQueryResponse> response = (ApiResponse<SurveyAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a calibration
   * 
   * @param body calibration (required)
   * @param expand calibratorId (optional)
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration postQualityCalibrations(CalibrationCreate body, String expand) throws IOException, ApiException {
    return  postQualityCalibrations(createPostQualityCalibrationsRequest(body, expand));
  }

  /**
   * Create a calibration
   * 
   * @param body calibration (required)
   * @param expand calibratorId (optional)
   * @return Calibration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> postQualityCalibrationsWithHttpInfo(CalibrationCreate body, String expand) throws IOException {
    return postQualityCalibrations(createPostQualityCalibrationsRequest(body, expand).withHttpInfo());
  }

  private PostQualityCalibrationsRequest createPostQualityCalibrationsRequest(CalibrationCreate body, String expand) {
    return PostQualityCalibrationsRequest.builder()
            .withBody(body)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Create a calibration
   * 
   * @param request The request object
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration postQualityCalibrations(PostQualityCalibrationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Calibration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Calibration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a calibration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> postQualityCalibrations(ApiRequest<CalibrationCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Calibration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)exception;
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
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param body evaluation (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation postQualityConversationEvaluations(String conversationId, Evaluation body, String expand) throws IOException, ApiException {
    return  postQualityConversationEvaluations(createPostQualityConversationEvaluationsRequest(conversationId, body, expand));
  }

  /**
   * Create an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param body evaluation (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> postQualityConversationEvaluationsWithHttpInfo(String conversationId, Evaluation body, String expand) throws IOException {
    return postQualityConversationEvaluations(createPostQualityConversationEvaluationsRequest(conversationId, body, expand).withHttpInfo());
  }

  private PostQualityConversationEvaluationsRequest createPostQualityConversationEvaluationsRequest(String conversationId, Evaluation body, String expand) {
    return PostQualityConversationEvaluationsRequest.builder()
            .withConversationId(conversationId)
    
            .withBody(body)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Create an evaluation
   * 
   * @param request The request object
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation postQualityConversationEvaluations(PostQualityConversationEvaluationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Evaluation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Evaluation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an evaluation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> postQualityConversationEvaluations(ApiRequest<Evaluation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Evaluation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)exception;
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
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create audit query execution
   * 
   * @param body query (required)
   * @return QualityAuditQueryExecutionStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QualityAuditQueryExecutionStatusResponse postQualityConversationsAuditsQuery(QMAuditQueryRequest body) throws IOException, ApiException {
    return  postQualityConversationsAuditsQuery(createPostQualityConversationsAuditsQueryRequest(body));
  }

  /**
   * Create audit query execution
   * 
   * @param body query (required)
   * @return QualityAuditQueryExecutionStatusResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QualityAuditQueryExecutionStatusResponse> postQualityConversationsAuditsQueryWithHttpInfo(QMAuditQueryRequest body) throws IOException {
    return postQualityConversationsAuditsQuery(createPostQualityConversationsAuditsQueryRequest(body).withHttpInfo());
  }

  private PostQualityConversationsAuditsQueryRequest createPostQualityConversationsAuditsQueryRequest(QMAuditQueryRequest body) {
    return PostQualityConversationsAuditsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create audit query execution
   * 
   * @param request The request object
   * @return QualityAuditQueryExecutionStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QualityAuditQueryExecutionStatusResponse postQualityConversationsAuditsQuery(PostQualityConversationsAuditsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QualityAuditQueryExecutionStatusResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QualityAuditQueryExecutionStatusResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create audit query execution
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QualityAuditQueryExecutionStatusResponse> postQualityConversationsAuditsQuery(ApiRequest<QMAuditQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QualityAuditQueryExecutionStatusResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QualityAuditQueryExecutionStatusResponse> response = (ApiResponse<QualityAuditQueryExecutionStatusResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<QualityAuditQueryExecutionStatusResponse> response = (ApiResponse<QualityAuditQueryExecutionStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Score evaluation
   * 
   * @param body evaluationAndScoringSet (required)
   * @return EvaluationScoringSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationScoringSet postQualityEvaluationsScoring(EvaluationFormAndScoringSet body) throws IOException, ApiException {
    return  postQualityEvaluationsScoring(createPostQualityEvaluationsScoringRequest(body));
  }

  /**
   * Score evaluation
   * 
   * @param body evaluationAndScoringSet (required)
   * @return EvaluationScoringSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationScoringSet> postQualityEvaluationsScoringWithHttpInfo(EvaluationFormAndScoringSet body) throws IOException {
    return postQualityEvaluationsScoring(createPostQualityEvaluationsScoringRequest(body).withHttpInfo());
  }

  private PostQualityEvaluationsScoringRequest createPostQualityEvaluationsScoringRequest(EvaluationFormAndScoringSet body) {
    return PostQualityEvaluationsScoringRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Score evaluation
   * 
   * @param request The request object
   * @return EvaluationScoringSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationScoringSet postQualityEvaluationsScoring(PostQualityEvaluationsScoringRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationScoringSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationScoringSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Score evaluation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationScoringSet> postQualityEvaluationsScoring(ApiRequest<EvaluationFormAndScoringSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationScoringSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationScoringSet> response = (ApiResponse<EvaluationScoringSet>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationScoringSet> response = (ApiResponse<EvaluationScoringSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create an evaluation form.
   * 
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm postQualityForms(EvaluationForm body) throws IOException, ApiException {
    return  postQualityForms(createPostQualityFormsRequest(body));
  }

  /**
   * Create an evaluation form.
   * 
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> postQualityFormsWithHttpInfo(EvaluationForm body) throws IOException {
    return postQualityForms(createPostQualityFormsRequest(body).withHttpInfo());
  }

  private PostQualityFormsRequest createPostQualityFormsRequest(EvaluationForm body) {
    return PostQualityFormsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create an evaluation form.
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm postQualityForms(PostQualityFormsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an evaluation form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> postQualityForms(ApiRequest<EvaluationForm> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create an evaluation form.
   * 
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm postQualityFormsEvaluations(EvaluationForm body) throws IOException, ApiException {
    return  postQualityFormsEvaluations(createPostQualityFormsEvaluationsRequest(body));
  }

  /**
   * Create an evaluation form.
   * 
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> postQualityFormsEvaluationsWithHttpInfo(EvaluationForm body) throws IOException {
    return postQualityFormsEvaluations(createPostQualityFormsEvaluationsRequest(body).withHttpInfo());
  }

  private PostQualityFormsEvaluationsRequest createPostQualityFormsEvaluationsRequest(EvaluationForm body) {
    return PostQualityFormsEvaluationsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create an evaluation form.
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm postQualityFormsEvaluations(PostQualityFormsEvaluationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an evaluation form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> postQualityFormsEvaluations(ApiRequest<EvaluationForm> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a survey form.
   * 
   * @param body Survey form (required)
   * @return SurveyForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyForm postQualityFormsSurveys(SurveyForm body) throws IOException, ApiException {
    return  postQualityFormsSurveys(createPostQualityFormsSurveysRequest(body));
  }

  /**
   * Create a survey form.
   * 
   * @param body Survey form (required)
   * @return SurveyForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyForm> postQualityFormsSurveysWithHttpInfo(SurveyForm body) throws IOException {
    return postQualityFormsSurveys(createPostQualityFormsSurveysRequest(body).withHttpInfo());
  }

  private PostQualityFormsSurveysRequest createPostQualityFormsSurveysRequest(SurveyForm body) {
    return PostQualityFormsSurveysRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a survey form.
   * 
   * @param request The request object
   * @return SurveyForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyForm postQualityFormsSurveys(PostQualityFormsSurveysRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a survey form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyForm> postQualityFormsSurveys(ApiRequest<SurveyForm> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)exception;
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
      ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Publish an evaluation form.
   * 
   * @param body Publish request containing id of form to publish (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm postQualityPublishedforms(PublishForm body) throws IOException, ApiException {
    return  postQualityPublishedforms(createPostQualityPublishedformsRequest(body));
  }

  /**
   * Publish an evaluation form.
   * 
   * @param body Publish request containing id of form to publish (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> postQualityPublishedformsWithHttpInfo(PublishForm body) throws IOException {
    return postQualityPublishedforms(createPostQualityPublishedformsRequest(body).withHttpInfo());
  }

  private PostQualityPublishedformsRequest createPostQualityPublishedformsRequest(PublishForm body) {
    return PostQualityPublishedformsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Publish an evaluation form.
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm postQualityPublishedforms(PostQualityPublishedformsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish an evaluation form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> postQualityPublishedforms(ApiRequest<PublishForm> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Publish an evaluation form.
   * 
   * @param body Publish request containing id of form to publish (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm postQualityPublishedformsEvaluations(PublishForm body) throws IOException, ApiException {
    return  postQualityPublishedformsEvaluations(createPostQualityPublishedformsEvaluationsRequest(body));
  }

  /**
   * Publish an evaluation form.
   * 
   * @param body Publish request containing id of form to publish (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> postQualityPublishedformsEvaluationsWithHttpInfo(PublishForm body) throws IOException {
    return postQualityPublishedformsEvaluations(createPostQualityPublishedformsEvaluationsRequest(body).withHttpInfo());
  }

  private PostQualityPublishedformsEvaluationsRequest createPostQualityPublishedformsEvaluationsRequest(PublishForm body) {
    return PostQualityPublishedformsEvaluationsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Publish an evaluation form.
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm postQualityPublishedformsEvaluations(PostQualityPublishedformsEvaluationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish an evaluation form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> postQualityPublishedformsEvaluations(ApiRequest<PublishForm> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Publish a survey form.
   * 
   * @param body Survey form (required)
   * @return SurveyForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyForm postQualityPublishedformsSurveys(PublishForm body) throws IOException, ApiException {
    return  postQualityPublishedformsSurveys(createPostQualityPublishedformsSurveysRequest(body));
  }

  /**
   * Publish a survey form.
   * 
   * @param body Survey form (required)
   * @return SurveyForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyForm> postQualityPublishedformsSurveysWithHttpInfo(PublishForm body) throws IOException {
    return postQualityPublishedformsSurveys(createPostQualityPublishedformsSurveysRequest(body).withHttpInfo());
  }

  private PostQualityPublishedformsSurveysRequest createPostQualityPublishedformsSurveysRequest(PublishForm body) {
    return PostQualityPublishedformsSurveysRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Publish a survey form.
   * 
   * @param request The request object
   * @return SurveyForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyForm postQualityPublishedformsSurveys(PostQualityPublishedformsSurveysRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish a survey form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyForm> postQualityPublishedformsSurveys(ApiRequest<PublishForm> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)exception;
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
      ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Score survey
   * 
   * @param body surveyAndScoringSet (required)
   * @return SurveyScoringSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyScoringSet postQualitySurveysScoring(SurveyFormAndScoringSet body) throws IOException, ApiException {
    return  postQualitySurveysScoring(createPostQualitySurveysScoringRequest(body));
  }

  /**
   * Score survey
   * 
   * @param body surveyAndScoringSet (required)
   * @return SurveyScoringSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyScoringSet> postQualitySurveysScoringWithHttpInfo(SurveyFormAndScoringSet body) throws IOException {
    return postQualitySurveysScoring(createPostQualitySurveysScoringRequest(body).withHttpInfo());
  }

  private PostQualitySurveysScoringRequest createPostQualitySurveysScoringRequest(SurveyFormAndScoringSet body) {
    return PostQualitySurveysScoringRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Score survey
   * 
   * @param request The request object
   * @return SurveyScoringSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyScoringSet postQualitySurveysScoring(PostQualitySurveysScoringRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyScoringSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyScoringSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Score survey
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyScoringSet> postQualitySurveysScoring(ApiRequest<SurveyFormAndScoringSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyScoringSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyScoringSet> response = (ApiResponse<SurveyScoringSet>)(ApiResponse<?>)exception;
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
      ApiResponse<SurveyScoringSet> response = (ApiResponse<SurveyScoringSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @param calibrationId Calibration ID (required)
   * @param body Calibration (required)
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration putQualityCalibration(String calibrationId, Calibration body) throws IOException, ApiException {
    return  putQualityCalibration(createPutQualityCalibrationRequest(calibrationId, body));
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @param calibrationId Calibration ID (required)
   * @param body Calibration (required)
   * @return Calibration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> putQualityCalibrationWithHttpInfo(String calibrationId, Calibration body) throws IOException {
    return putQualityCalibration(createPutQualityCalibrationRequest(calibrationId, body).withHttpInfo());
  }

  private PutQualityCalibrationRequest createPutQualityCalibrationRequest(String calibrationId, Calibration body) {
    return PutQualityCalibrationRequest.builder()
            .withCalibrationId(calibrationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @param request The request object
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration putQualityCalibration(PutQualityCalibrationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Calibration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Calibration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> putQualityCalibration(ApiRequest<Calibration> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Calibration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)exception;
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
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an evaluation
   * The quality:evaluation:edit permission allows modification of most fields, while the quality:evaluation:editScore permission allows an evaluator to change just the question scores, and the quality:evaluation:editAgentSignoff permission allows an agent to change the agent comments and sign off on the evaluation.
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param body evaluation (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation putQualityConversationEvaluation(String conversationId, String evaluationId, Evaluation body, String expand) throws IOException, ApiException {
    return  putQualityConversationEvaluation(createPutQualityConversationEvaluationRequest(conversationId, evaluationId, body, expand));
  }

  /**
   * Update an evaluation
   * The quality:evaluation:edit permission allows modification of most fields, while the quality:evaluation:editScore permission allows an evaluator to change just the question scores, and the quality:evaluation:editAgentSignoff permission allows an agent to change the agent comments and sign off on the evaluation.
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param body evaluation (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> putQualityConversationEvaluationWithHttpInfo(String conversationId, String evaluationId, Evaluation body, String expand) throws IOException {
    return putQualityConversationEvaluation(createPutQualityConversationEvaluationRequest(conversationId, evaluationId, body, expand).withHttpInfo());
  }

  private PutQualityConversationEvaluationRequest createPutQualityConversationEvaluationRequest(String conversationId, String evaluationId, Evaluation body, String expand) {
    return PutQualityConversationEvaluationRequest.builder()
            .withConversationId(conversationId)
    
            .withEvaluationId(evaluationId)
    
            .withBody(body)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Update an evaluation
   * The quality:evaluation:edit permission allows modification of most fields, while the quality:evaluation:editScore permission allows an evaluator to change just the question scores, and the quality:evaluation:editAgentSignoff permission allows an agent to change the agent comments and sign off on the evaluation.
   * @param request The request object
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation putQualityConversationEvaluation(PutQualityConversationEvaluationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Evaluation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Evaluation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an evaluation
   * The quality:evaluation:edit permission allows modification of most fields, while the quality:evaluation:editScore permission allows an evaluator to change just the question scores, and the quality:evaluation:editAgentSignoff permission allows an agent to change the agent comments and sign off on the evaluation.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> putQualityConversationEvaluation(ApiRequest<Evaluation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Evaluation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)exception;
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
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an evaluation form.
   * 
   * @param formId Form ID (required)
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm putQualityForm(String formId, EvaluationForm body) throws IOException, ApiException {
    return  putQualityForm(createPutQualityFormRequest(formId, body));
  }

  /**
   * Update an evaluation form.
   * 
   * @param formId Form ID (required)
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> putQualityFormWithHttpInfo(String formId, EvaluationForm body) throws IOException {
    return putQualityForm(createPutQualityFormRequest(formId, body).withHttpInfo());
  }

  private PutQualityFormRequest createPutQualityFormRequest(String formId, EvaluationForm body) {
    return PutQualityFormRequest.builder()
            .withFormId(formId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an evaluation form.
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm putQualityForm(PutQualityFormRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an evaluation form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> putQualityForm(ApiRequest<EvaluationForm> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an evaluation form.
   * 
   * @param formId Form ID (required)
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm putQualityFormsEvaluation(String formId, EvaluationForm body) throws IOException, ApiException {
    return  putQualityFormsEvaluation(createPutQualityFormsEvaluationRequest(formId, body));
  }

  /**
   * Update an evaluation form.
   * 
   * @param formId Form ID (required)
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> putQualityFormsEvaluationWithHttpInfo(String formId, EvaluationForm body) throws IOException {
    return putQualityFormsEvaluation(createPutQualityFormsEvaluationRequest(formId, body).withHttpInfo());
  }

  private PutQualityFormsEvaluationRequest createPutQualityFormsEvaluationRequest(String formId, EvaluationForm body) {
    return PutQualityFormsEvaluationRequest.builder()
            .withFormId(formId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an evaluation form.
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm putQualityFormsEvaluation(PutQualityFormsEvaluationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an evaluation form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> putQualityFormsEvaluation(ApiRequest<EvaluationForm> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
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
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a survey form.
   * 
   * @param formId Form ID (required)
   * @param body Survey form (required)
   * @return SurveyForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyForm putQualityFormsSurvey(String formId, SurveyForm body) throws IOException, ApiException {
    return  putQualityFormsSurvey(createPutQualityFormsSurveyRequest(formId, body));
  }

  /**
   * Update a survey form.
   * 
   * @param formId Form ID (required)
   * @param body Survey form (required)
   * @return SurveyForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyForm> putQualityFormsSurveyWithHttpInfo(String formId, SurveyForm body) throws IOException {
    return putQualityFormsSurvey(createPutQualityFormsSurveyRequest(formId, body).withHttpInfo());
  }

  private PutQualityFormsSurveyRequest createPutQualityFormsSurveyRequest(String formId, SurveyForm body) {
    return PutQualityFormsSurveyRequest.builder()
            .withFormId(formId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a survey form.
   * 
   * @param request The request object
   * @return SurveyForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyForm putQualityFormsSurvey(PutQualityFormsSurveyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a survey form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyForm> putQualityFormsSurvey(ApiRequest<SurveyForm> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)exception;
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
      ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a survey as an end-customer, for the purposes of scoring it.
   * 
   * @param body survey (required)
   * @param customerSurveyUrl customerSurveyUrl (required)
   * @return ScorableSurvey
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScorableSurvey putQualitySurveysScorable(ScorableSurvey body, String customerSurveyUrl) throws IOException, ApiException {
    return  putQualitySurveysScorable(createPutQualitySurveysScorableRequest(body, customerSurveyUrl));
  }

  /**
   * Update a survey as an end-customer, for the purposes of scoring it.
   * 
   * @param body survey (required)
   * @param customerSurveyUrl customerSurveyUrl (required)
   * @return ScorableSurvey
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScorableSurvey> putQualitySurveysScorableWithHttpInfo(ScorableSurvey body, String customerSurveyUrl) throws IOException {
    return putQualitySurveysScorable(createPutQualitySurveysScorableRequest(body, customerSurveyUrl).withHttpInfo());
  }

  private PutQualitySurveysScorableRequest createPutQualitySurveysScorableRequest(ScorableSurvey body, String customerSurveyUrl) {
    return PutQualitySurveysScorableRequest.builder()
            .withBody(body)
    
            .withCustomerSurveyUrl(customerSurveyUrl)
    
            .build();
  }

  /**
   * Update a survey as an end-customer, for the purposes of scoring it.
   * 
   * @param request The request object
   * @return ScorableSurvey
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScorableSurvey putQualitySurveysScorable(PutQualitySurveysScorableRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScorableSurvey> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScorableSurvey>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a survey as an end-customer, for the purposes of scoring it.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScorableSurvey> putQualitySurveysScorable(ApiRequest<ScorableSurvey> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScorableSurvey>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScorableSurvey> response = (ApiResponse<ScorableSurvey>)(ApiResponse<?>)exception;
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
      ApiResponse<ScorableSurvey> response = (ApiResponse<ScorableSurvey>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
