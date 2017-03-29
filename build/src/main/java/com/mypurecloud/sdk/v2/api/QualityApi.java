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
import com.mypurecloud.sdk.v2.model.QualityAuditPage;
import com.mypurecloud.sdk.v2.model.EvaluationEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluatorActivityEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationFormEntityListing;
import com.mypurecloud.sdk.v2.model.KeywordSet;
import com.mypurecloud.sdk.v2.model.KeywordSetEntityListing;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.CalibrationCreate;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationFormAndScoringSet;


import com.mypurecloud.sdk.v2.api.request.DeleteQualityCalibrationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityConversationEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityFormRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityKeywordsetRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityKeywordsetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityAgentsActivityRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityCalibrationRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityCalibrationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityConversationAuditsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityConversationEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityEvaluationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityEvaluatorsActivityRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityKeywordsetRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityKeywordsetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsEvaluationsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityCalibrationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityConversationEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityEvaluationsScoringRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityFormsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityKeywordsetsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityPublishedformsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualitySpotabilityRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityCalibrationRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityConversationEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityFormRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityKeywordsetRequest;

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
   * @throws ApiException if fails to make API call
   */
  public Calibration deleteQualityCalibration(String calibrationId, String calibratorId) throws ApiException {
    return deleteQualityCalibrationWithHttpInfo(calibrationId, calibratorId).getBody();
  }

  /**
   * Delete a calibration by id.
   * 
   * @param calibrationId Calibration ID (required)
   * @param calibratorId calibratorId (required)
   * @return Calibration
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Calibration> deleteQualityCalibrationWithHttpInfo(String calibrationId, String calibratorId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'calibrationId' is set
    if (calibrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'calibrationId' when calling deleteQualityCalibration");
    }
    
    // verify the required parameter 'calibratorId' is set
    if (calibratorId == null) {
      throw new ApiException(400, "Missing the required parameter 'calibratorId' when calling deleteQualityCalibration");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/calibrations/{calibrationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "calibrationId" + "\\}", pcapiClient.escapeString(calibrationId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "calibratorId", calibratorId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Calibration>() {});
  }

  /**
   * Delete a calibration by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Calibration deleteQualityCalibration(DeleteQualityCalibrationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Calibration>() {});
  }

  /**
   * Delete a calibration by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Calibration> deleteQualityCalibration(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Calibration>invokeAPIVerbose(request, new TypeReference<Calibration>() {});
  }

  /**
   * Delete an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws ApiException if fails to make API call
   */
  public Evaluation deleteQualityConversationEvaluation(String conversationId, String evaluationId, String expand) throws ApiException {
    return deleteQualityConversationEvaluationWithHttpInfo(conversationId, evaluationId, expand).getBody();
  }

  /**
   * Delete an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Evaluation> deleteQualityConversationEvaluationWithHttpInfo(String conversationId, String evaluationId, String expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling deleteQualityConversationEvaluation");
    }
    
    // verify the required parameter 'evaluationId' is set
    if (evaluationId == null) {
      throw new ApiException(400, "Missing the required parameter 'evaluationId' when calling deleteQualityConversationEvaluation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "evaluationId" + "\\}", pcapiClient.escapeString(evaluationId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Evaluation>() {});
  }

  /**
   * Delete an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Evaluation deleteQualityConversationEvaluation(DeleteQualityConversationEvaluationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Evaluation>() {});
  }

  /**
   * Delete an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Evaluation> deleteQualityConversationEvaluation(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Evaluation>invokeAPIVerbose(request, new TypeReference<Evaluation>() {});
  }

  /**
   * Delete an evaluation form.
   * 
   * @param formId Form ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteQualityForm(String formId) throws ApiException {
    return deleteQualityFormWithHttpInfo(formId).getBody();
  }

  /**
   * Delete an evaluation form.
   * 
   * @param formId Form ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteQualityFormWithHttpInfo(String formId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling deleteQualityForm");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/forms/{formId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "formId" + "\\}", pcapiClient.escapeString(formId.toString()));

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
   * Delete an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteQualityForm(DeleteQualityFormRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteQualityForm(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a keywordSet by id.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteQualityKeywordset(String keywordSetId) throws ApiException {
    deleteQualityKeywordsetWithHttpInfo(keywordSetId);
  }

  /**
   * Delete a keywordSet by id.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteQualityKeywordsetWithHttpInfo(String keywordSetId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'keywordSetId' is set
    if (keywordSetId == null) {
      throw new ApiException(400, "Missing the required parameter 'keywordSetId' when calling deleteQualityKeywordset");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/keywordsets/{keywordSetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "keywordSetId" + "\\}", pcapiClient.escapeString(keywordSetId.toString()));

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
   * Delete a keywordSet by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteQualityKeywordset(DeleteQualityKeywordsetRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a keywordSet by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteQualityKeywordset(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete keyword sets
   * Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.
   * @param ids A comma-delimited list of valid KeywordSet ids (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteQualityKeywordsets(String ids) throws ApiException {
    return deleteQualityKeywordsetsWithHttpInfo(ids).getBody();
  }

  /**
   * Delete keyword sets
   * Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.
   * @param ids A comma-delimited list of valid KeywordSet ids (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteQualityKeywordsetsWithHttpInfo(String ids) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling deleteQualityKeywordsets");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/keywordsets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "ids", ids));

    
    
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
   * Delete keyword sets
   * Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteQualityKeywordsets(DeleteQualityKeywordsetsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete keyword sets
   * Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteQualityKeywordsets(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Gets a list of Agent Activities
   * Including the number of evaluations and average evaluation score
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param startTime Start time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime End time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param agentUserId user id of agent requested (optional)
   * @param evaluatorUserId user id of the evaluator (optional)
   * @param name name (optional)
   * @param group group id (optional)
   * @return AgentActivityEntityListing
   * @throws ApiException if fails to make API call
   */
  public AgentActivityEntityListing getQualityAgentsActivity(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, Date startTime, Date endTime, List<Object> agentUserId, String evaluatorUserId, String name, String group) throws ApiException {
    return getQualityAgentsActivityWithHttpInfo(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group).getBody();
  }

  /**
   * Gets a list of Agent Activities
   * Including the number of evaluations and average evaluation score
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param startTime Start time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime End time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param agentUserId user id of agent requested (optional)
   * @param evaluatorUserId user id of the evaluator (optional)
   * @param name name (optional)
   * @param group group id (optional)
   * @return AgentActivityEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgentActivityEntityListing> getQualityAgentsActivityWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, Date startTime, Date endTime, List<Object> agentUserId, String evaluatorUserId, String name, String group) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/agents/activity".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "nextPage", nextPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "previousPage", previousPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "startTime", startTime));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "endTime", endTime));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "agentUserId", agentUserId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "evaluatorUserId", evaluatorUserId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "group", group));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AgentActivityEntityListing>() {});
  }

  /**
   * Gets a list of Agent Activities
   * Including the number of evaluations and average evaluation score
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AgentActivityEntityListing getQualityAgentsActivity(GetQualityAgentsActivityRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AgentActivityEntityListing>() {});
  }

  /**
   * Gets a list of Agent Activities
   * Including the number of evaluations and average evaluation score
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgentActivityEntityListing> getQualityAgentsActivity(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<AgentActivityEntityListing>invokeAPIVerbose(request, new TypeReference<AgentActivityEntityListing>() {});
  }

  /**
   * Get a calibration by id.
   * 
   * @param calibrationId Calibration ID (required)
   * @param calibratorId calibratorId (required)
   * @return Calibration
   * @throws ApiException if fails to make API call
   */
  public Calibration getQualityCalibration(String calibrationId, String calibratorId) throws ApiException {
    return getQualityCalibrationWithHttpInfo(calibrationId, calibratorId).getBody();
  }

  /**
   * Get a calibration by id.
   * 
   * @param calibrationId Calibration ID (required)
   * @param calibratorId calibratorId (required)
   * @return Calibration
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Calibration> getQualityCalibrationWithHttpInfo(String calibrationId, String calibratorId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'calibrationId' is set
    if (calibrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'calibrationId' when calling getQualityCalibration");
    }
    
    // verify the required parameter 'calibratorId' is set
    if (calibratorId == null) {
      throw new ApiException(400, "Missing the required parameter 'calibratorId' when calling getQualityCalibration");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/calibrations/{calibrationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "calibrationId" + "\\}", pcapiClient.escapeString(calibrationId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "calibratorId", calibratorId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Calibration>() {});
  }

  /**
   * Get a calibration by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Calibration getQualityCalibration(GetQualityCalibrationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Calibration>() {});
  }

  /**
   * Get a calibration by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Calibration> getQualityCalibration(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Calibration>invokeAPIVerbose(request, new TypeReference<Calibration>() {});
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
   * @param startTime Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @return CalibrationEntityListing
   * @throws ApiException if fails to make API call
   */
  public CalibrationEntityListing getQualityCalibrations(String calibratorId, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String conversationId, Date startTime, Date endTime) throws ApiException {
    return getQualityCalibrationsWithHttpInfo(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime).getBody();
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
   * @param startTime Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @return CalibrationEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CalibrationEntityListing> getQualityCalibrationsWithHttpInfo(String calibratorId, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String conversationId, Date startTime, Date endTime) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'calibratorId' is set
    if (calibratorId == null) {
      throw new ApiException(400, "Missing the required parameter 'calibratorId' when calling getQualityCalibrations");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/calibrations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "nextPage", nextPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "previousPage", previousPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "conversationId", conversationId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "startTime", startTime));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "endTime", endTime));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "calibratorId", calibratorId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CalibrationEntityListing>() {});
  }

  /**
   * Get the list of calibrations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CalibrationEntityListing getQualityCalibrations(GetQualityCalibrationsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CalibrationEntityListing>() {});
  }

  /**
   * Get the list of calibrations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CalibrationEntityListing> getQualityCalibrations(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<CalibrationEntityListing>invokeAPIVerbose(request, new TypeReference<CalibrationEntityListing>() {});
  }

  /**
   * Get audits for conversation or recording
   * 
   * @param conversationId Conversation ID (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param recordingId id of the recording (optional)
   * @param entityType entity type options: Recording, Calibration, Evaluation, Annotation (optional, default to RECORDING)
   * @return QualityAuditPage
   * @throws ApiException if fails to make API call
   */
  public QualityAuditPage getQualityConversationAudits(String conversationId, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String recordingId, String entityType) throws ApiException {
    return getQualityConversationAuditsWithHttpInfo(conversationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, recordingId, entityType).getBody();
  }

  /**
   * Get audits for conversation or recording
   * 
   * @param conversationId Conversation ID (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param recordingId id of the recording (optional)
   * @param entityType entity type options: Recording, Calibration, Evaluation, Annotation (optional, default to RECORDING)
   * @return QualityAuditPage
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QualityAuditPage> getQualityConversationAuditsWithHttpInfo(String conversationId, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String recordingId, String entityType) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling getQualityConversationAudits");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/conversations/{conversationId}/audits".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "nextPage", nextPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "previousPage", previousPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "recordingId", recordingId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "entityType", entityType));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<QualityAuditPage>() {});
  }

  /**
   * Get audits for conversation or recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public QualityAuditPage getQualityConversationAudits(GetQualityConversationAuditsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<QualityAuditPage>() {});
  }

  /**
   * Get audits for conversation or recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QualityAuditPage> getQualityConversationAudits(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<QualityAuditPage>invokeAPIVerbose(request, new TypeReference<QualityAuditPage>() {});
  }

  /**
   * Get an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param expand agent, evaluator, evaluationForm (optional)
   * @return Evaluation
   * @throws ApiException if fails to make API call
   */
  public Evaluation getQualityConversationEvaluation(String conversationId, String evaluationId, String expand) throws ApiException {
    return getQualityConversationEvaluationWithHttpInfo(conversationId, evaluationId, expand).getBody();
  }

  /**
   * Get an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param expand agent, evaluator, evaluationForm (optional)
   * @return Evaluation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Evaluation> getQualityConversationEvaluationWithHttpInfo(String conversationId, String evaluationId, String expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling getQualityConversationEvaluation");
    }
    
    // verify the required parameter 'evaluationId' is set
    if (evaluationId == null) {
      throw new ApiException(400, "Missing the required parameter 'evaluationId' when calling getQualityConversationEvaluation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "evaluationId" + "\\}", pcapiClient.escapeString(evaluationId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Evaluation>() {});
  }

  /**
   * Get an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Evaluation getQualityConversationEvaluation(GetQualityConversationEvaluationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Evaluation>() {});
  }

  /**
   * Get an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Evaluation> getQualityConversationEvaluation(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Evaluation>invokeAPIVerbose(request, new TypeReference<Evaluation>() {});
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId
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
   * @param evaluationState evaluation state options: Pending, InProgress, Finished (optional)
   * @param isReleased the evaluation has been released (optional)
   * @param agentHasRead agent has the evaluation (optional)
   * @param expandAnswerTotalScores get the total scores for evaluations (optional)
   * @param maximum maximum (optional)
   * @return EvaluationEntityListing
   * @throws ApiException if fails to make API call
   */
  public EvaluationEntityListing getQualityEvaluationsQuery(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String conversationId, String agentUserId, String evaluatorUserId, String queueId, String startTime, String endTime, List<Object> evaluationState, Boolean isReleased, Boolean agentHasRead, Boolean expandAnswerTotalScores, Integer maximum) throws ApiException {
    return getQualityEvaluationsQueryWithHttpInfo(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, agentUserId, evaluatorUserId, queueId, startTime, endTime, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum).getBody();
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId
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
   * @param evaluationState evaluation state options: Pending, InProgress, Finished (optional)
   * @param isReleased the evaluation has been released (optional)
   * @param agentHasRead agent has the evaluation (optional)
   * @param expandAnswerTotalScores get the total scores for evaluations (optional)
   * @param maximum maximum (optional)
   * @return EvaluationEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationEntityListing> getQualityEvaluationsQueryWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String conversationId, String agentUserId, String evaluatorUserId, String queueId, String startTime, String endTime, List<Object> evaluationState, Boolean isReleased, Boolean agentHasRead, Boolean expandAnswerTotalScores, Integer maximum) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/evaluations/query".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "nextPage", nextPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "previousPage", previousPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "conversationId", conversationId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "agentUserId", agentUserId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "evaluatorUserId", evaluatorUserId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "queueId", queueId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "startTime", startTime));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "endTime", endTime));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "evaluationState", evaluationState));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "isReleased", isReleased));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "agentHasRead", agentHasRead));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expandAnswerTotalScores", expandAnswerTotalScores));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "maximum", maximum));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EvaluationEntityListing>() {});
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EvaluationEntityListing getQualityEvaluationsQuery(GetQualityEvaluationsQueryRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EvaluationEntityListing>() {});
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationEntityListing> getQualityEvaluationsQuery(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EvaluationEntityListing>invokeAPIVerbose(request, new TypeReference<EvaluationEntityListing>() {});
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
   * @param startTime The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param name Evaluator name (optional)
   * @param permission permission strings (optional)
   * @param group group id (optional)
   * @return EvaluatorActivityEntityListing
   * @throws ApiException if fails to make API call
   */
  public EvaluatorActivityEntityListing getQualityEvaluatorsActivity(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, Date startTime, Date endTime, String name, List<Object> permission, String group) throws ApiException {
    return getQualityEvaluatorsActivityWithHttpInfo(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group).getBody();
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
   * @param startTime The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param name Evaluator name (optional)
   * @param permission permission strings (optional)
   * @param group group id (optional)
   * @return EvaluatorActivityEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluatorActivityEntityListing> getQualityEvaluatorsActivityWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, Date startTime, Date endTime, String name, List<Object> permission, String group) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/evaluators/activity".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "nextPage", nextPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "previousPage", previousPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "startTime", startTime));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "endTime", endTime));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "permission", permission));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "group", group));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EvaluatorActivityEntityListing>() {});
  }

  /**
   * Get an evaluator activity
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EvaluatorActivityEntityListing getQualityEvaluatorsActivity(GetQualityEvaluatorsActivityRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EvaluatorActivityEntityListing>() {});
  }

  /**
   * Get an evaluator activity
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluatorActivityEntityListing> getQualityEvaluatorsActivity(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EvaluatorActivityEntityListing>invokeAPIVerbose(request, new TypeReference<EvaluatorActivityEntityListing>() {});
  }

  /**
   * Get an evaluation form
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws ApiException if fails to make API call
   */
  public EvaluationForm getQualityForm(String formId) throws ApiException {
    return getQualityFormWithHttpInfo(formId).getBody();
  }

  /**
   * Get an evaluation form
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationForm> getQualityFormWithHttpInfo(String formId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling getQualityForm");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/forms/{formId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "formId" + "\\}", pcapiClient.escapeString(formId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EvaluationForm>() {});
  }

  /**
   * Get an evaluation form
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EvaluationForm getQualityForm(GetQualityFormRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
  }

  /**
   * Get an evaluation form
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationForm> getQualityForm(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EvaluationForm>invokeAPIVerbose(request, new TypeReference<EvaluationForm>() {});
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param formId Form ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return EvaluationFormEntityListing
   * @throws ApiException if fails to make API call
   */
  public EvaluationFormEntityListing getQualityFormVersions(String formId, Integer pageSize, Integer pageNumber) throws ApiException {
    return getQualityFormVersionsWithHttpInfo(formId, pageSize, pageNumber).getBody();
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param formId Form ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return EvaluationFormEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityFormVersionsWithHttpInfo(String formId, Integer pageSize, Integer pageNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling getQualityFormVersions");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/forms/{formId}/versions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "formId" + "\\}", pcapiClient.escapeString(formId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EvaluationFormEntityListing>() {});
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EvaluationFormEntityListing getQualityFormVersions(GetQualityFormVersionsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {});
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityFormVersions(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EvaluationFormEntityListing>invokeAPIVerbose(request, new TypeReference<EvaluationFormEntityListing>() {});
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
   * @return EvaluationFormEntityListing
   * @throws ApiException if fails to make API call
   */
  public EvaluationFormEntityListing getQualityForms(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name) throws ApiException {
    return getQualityFormsWithHttpInfo(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name).getBody();
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
   * @return EvaluationFormEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityFormsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/forms".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "nextPage", nextPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "previousPage", previousPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EvaluationFormEntityListing>() {});
  }

  /**
   * Get the list of evaluation forms
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EvaluationFormEntityListing getQualityForms(GetQualityFormsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {});
  }

  /**
   * Get the list of evaluation forms
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityForms(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EvaluationFormEntityListing>invokeAPIVerbose(request, new TypeReference<EvaluationFormEntityListing>() {});
  }

  /**
   * Get a keywordSet by id.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @return KeywordSet
   * @throws ApiException if fails to make API call
   */
  public KeywordSet getQualityKeywordset(String keywordSetId) throws ApiException {
    return getQualityKeywordsetWithHttpInfo(keywordSetId).getBody();
  }

  /**
   * Get a keywordSet by id.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @return KeywordSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeywordSet> getQualityKeywordsetWithHttpInfo(String keywordSetId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'keywordSetId' is set
    if (keywordSetId == null) {
      throw new ApiException(400, "Missing the required parameter 'keywordSetId' when calling getQualityKeywordset");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/keywordsets/{keywordSetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "keywordSetId" + "\\}", pcapiClient.escapeString(keywordSetId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<KeywordSet>() {});
  }

  /**
   * Get a keywordSet by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public KeywordSet getQualityKeywordset(GetQualityKeywordsetRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<KeywordSet>() {});
  }

  /**
   * Get a keywordSet by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeywordSet> getQualityKeywordset(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<KeywordSet>invokeAPIVerbose(request, new TypeReference<KeywordSet>() {});
  }

  /**
   * Get the list of keyword sets
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param name the keyword set name - used for filtering results in searches. (optional)
   * @param queueId the queue id - used for filtering results in searches. (optional)
   * @param agentId the agent id - used for filtering results in searches. (optional)
   * @param operator If agentID and queueId are both present, this determines whether the query is an AND or OR between those parameters. (optional)
   * @return KeywordSetEntityListing
   * @throws ApiException if fails to make API call
   */
  public KeywordSetEntityListing getQualityKeywordsets(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String name, String queueId, String agentId, String operator) throws ApiException {
    return getQualityKeywordsetsWithHttpInfo(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, queueId, agentId, operator).getBody();
  }

  /**
   * Get the list of keyword sets
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param name the keyword set name - used for filtering results in searches. (optional)
   * @param queueId the queue id - used for filtering results in searches. (optional)
   * @param agentId the agent id - used for filtering results in searches. (optional)
   * @param operator If agentID and queueId are both present, this determines whether the query is an AND or OR between those parameters. (optional)
   * @return KeywordSetEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeywordSetEntityListing> getQualityKeywordsetsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String name, String queueId, String agentId, String operator) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/keywordsets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "nextPage", nextPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "previousPage", previousPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "queueId", queueId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "agentId", agentId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "operator", operator));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<KeywordSetEntityListing>() {});
  }

  /**
   * Get the list of keyword sets
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public KeywordSetEntityListing getQualityKeywordsets(GetQualityKeywordsetsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<KeywordSetEntityListing>() {});
  }

  /**
   * Get the list of keyword sets
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeywordSetEntityListing> getQualityKeywordsets(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<KeywordSetEntityListing>invokeAPIVerbose(request, new TypeReference<KeywordSetEntityListing>() {});
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws ApiException if fails to make API call
   */
  public EvaluationForm getQualityPublishedform(String formId) throws ApiException {
    return getQualityPublishedformWithHttpInfo(formId).getBody();
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationForm> getQualityPublishedformWithHttpInfo(String formId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling getQualityPublishedform");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/publishedforms/{formId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "formId" + "\\}", pcapiClient.escapeString(formId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EvaluationForm>() {});
  }

  /**
   * Get the published evaluation forms.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EvaluationForm getQualityPublishedform(GetQualityPublishedformRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
  }

  /**
   * Get the published evaluation forms.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationForm> getQualityPublishedform(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EvaluationForm>invokeAPIVerbose(request, new TypeReference<EvaluationForm>() {});
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @return EvaluationFormEntityListing
   * @throws ApiException if fails to make API call
   */
  public EvaluationFormEntityListing getQualityPublishedforms(Integer pageSize, Integer pageNumber, String name) throws ApiException {
    return getQualityPublishedformsWithHttpInfo(pageSize, pageNumber, name).getBody();
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @return EvaluationFormEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityPublishedformsWithHttpInfo(Integer pageSize, Integer pageNumber, String name) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/publishedforms".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EvaluationFormEntityListing>() {});
  }

  /**
   * Get the published evaluation forms.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EvaluationFormEntityListing getQualityPublishedforms(GetQualityPublishedformsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {});
  }

  /**
   * Get the published evaluation forms.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityPublishedforms(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EvaluationFormEntityListing>invokeAPIVerbose(request, new TypeReference<EvaluationFormEntityListing>() {});
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if fails to make API call
   */
  public AggregateQueryResponse postAnalyticsEvaluationsAggregatesQuery(AggregationQuery body) throws ApiException {
    return postAnalyticsEvaluationsAggregatesQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsEvaluationsAggregatesQueryWithHttpInfo(AggregationQuery body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postAnalyticsEvaluationsAggregatesQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/evaluations/aggregates/query".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AggregateQueryResponse>() {});
  }

  /**
   * Query for evaluation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AggregateQueryResponse postAnalyticsEvaluationsAggregatesQuery(PostAnalyticsEvaluationsAggregatesQueryRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {});
  }

  /**
   * Query for evaluation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsEvaluationsAggregatesQuery(ApiRequest<AggregationQuery> request) throws ApiException {
    return pcapiClient.<AggregateQueryResponse>invokeAPIVerbose(request, new TypeReference<AggregateQueryResponse>() {});
  }

  /**
   * Create a calibration
   * 
   * @param body calibration (required)
   * @param expand calibratorId (optional)
   * @return Calibration
   * @throws ApiException if fails to make API call
   */
  public Calibration postQualityCalibrations(CalibrationCreate body, String expand) throws ApiException {
    return postQualityCalibrationsWithHttpInfo(body, expand).getBody();
  }

  /**
   * Create a calibration
   * 
   * @param body calibration (required)
   * @param expand calibratorId (optional)
   * @return Calibration
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Calibration> postQualityCalibrationsWithHttpInfo(CalibrationCreate body, String expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postQualityCalibrations");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/calibrations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Calibration>() {});
  }

  /**
   * Create a calibration
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Calibration postQualityCalibrations(PostQualityCalibrationsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Calibration>() {});
  }

  /**
   * Create a calibration
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Calibration> postQualityCalibrations(ApiRequest<CalibrationCreate> request) throws ApiException {
    return pcapiClient.<Calibration>invokeAPIVerbose(request, new TypeReference<Calibration>() {});
  }

  /**
   * Create an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param body evaluation (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws ApiException if fails to make API call
   */
  public Evaluation postQualityConversationEvaluations(String conversationId, Evaluation body, String expand) throws ApiException {
    return postQualityConversationEvaluationsWithHttpInfo(conversationId, body, expand).getBody();
  }

  /**
   * Create an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param body evaluation (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Evaluation> postQualityConversationEvaluationsWithHttpInfo(String conversationId, Evaluation body, String expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling postQualityConversationEvaluations");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postQualityConversationEvaluations");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/conversations/{conversationId}/evaluations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Evaluation>() {});
  }

  /**
   * Create an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Evaluation postQualityConversationEvaluations(PostQualityConversationEvaluationsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Evaluation>() {});
  }

  /**
   * Create an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Evaluation> postQualityConversationEvaluations(ApiRequest<Evaluation> request) throws ApiException {
    return pcapiClient.<Evaluation>invokeAPIVerbose(request, new TypeReference<Evaluation>() {});
  }

  /**
   * Score evaluation
   * 
   * @param body evaluationAndScoringSet (required)
   * @return EvaluationScoringSet
   * @throws ApiException if fails to make API call
   */
  public EvaluationScoringSet postQualityEvaluationsScoring(EvaluationFormAndScoringSet body) throws ApiException {
    return postQualityEvaluationsScoringWithHttpInfo(body).getBody();
  }

  /**
   * Score evaluation
   * 
   * @param body evaluationAndScoringSet (required)
   * @return EvaluationScoringSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationScoringSet> postQualityEvaluationsScoringWithHttpInfo(EvaluationFormAndScoringSet body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postQualityEvaluationsScoring");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/evaluations/scoring".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EvaluationScoringSet>() {});
  }

  /**
   * Score evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EvaluationScoringSet postQualityEvaluationsScoring(PostQualityEvaluationsScoringRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EvaluationScoringSet>() {});
  }

  /**
   * Score evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationScoringSet> postQualityEvaluationsScoring(ApiRequest<EvaluationFormAndScoringSet> request) throws ApiException {
    return pcapiClient.<EvaluationScoringSet>invokeAPIVerbose(request, new TypeReference<EvaluationScoringSet>() {});
  }

  /**
   * Create an evaluation form.
   * 
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws ApiException if fails to make API call
   */
  public EvaluationForm postQualityForms(EvaluationForm body) throws ApiException {
    return postQualityFormsWithHttpInfo(body).getBody();
  }

  /**
   * Create an evaluation form.
   * 
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationForm> postQualityFormsWithHttpInfo(EvaluationForm body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postQualityForms");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/forms".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EvaluationForm>() {});
  }

  /**
   * Create an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EvaluationForm postQualityForms(PostQualityFormsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
  }

  /**
   * Create an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationForm> postQualityForms(ApiRequest<EvaluationForm> request) throws ApiException {
    return pcapiClient.<EvaluationForm>invokeAPIVerbose(request, new TypeReference<EvaluationForm>() {});
  }

  /**
   * Create a Keyword Set
   * 
   * @param body keywordSet (required)
   * @param expand queueId (optional)
   * @return KeywordSet
   * @throws ApiException if fails to make API call
   */
  public KeywordSet postQualityKeywordsets(KeywordSet body, String expand) throws ApiException {
    return postQualityKeywordsetsWithHttpInfo(body, expand).getBody();
  }

  /**
   * Create a Keyword Set
   * 
   * @param body keywordSet (required)
   * @param expand queueId (optional)
   * @return KeywordSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeywordSet> postQualityKeywordsetsWithHttpInfo(KeywordSet body, String expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postQualityKeywordsets");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/keywordsets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<KeywordSet>() {});
  }

  /**
   * Create a Keyword Set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public KeywordSet postQualityKeywordsets(PostQualityKeywordsetsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<KeywordSet>() {});
  }

  /**
   * Create a Keyword Set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeywordSet> postQualityKeywordsets(ApiRequest<KeywordSet> request) throws ApiException {
    return pcapiClient.<KeywordSet>invokeAPIVerbose(request, new TypeReference<KeywordSet>() {});
  }

  /**
   * Publish an evaluation form.
   * 
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws ApiException if fails to make API call
   */
  public EvaluationForm postQualityPublishedforms(EvaluationForm body) throws ApiException {
    return postQualityPublishedformsWithHttpInfo(body).getBody();
  }

  /**
   * Publish an evaluation form.
   * 
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationForm> postQualityPublishedformsWithHttpInfo(EvaluationForm body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postQualityPublishedforms");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/publishedforms".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EvaluationForm>() {});
  }

  /**
   * Publish an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EvaluationForm postQualityPublishedforms(PostQualityPublishedformsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
  }

  /**
   * Publish an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationForm> postQualityPublishedforms(ApiRequest<EvaluationForm> request) throws ApiException {
    return pcapiClient.<EvaluationForm>invokeAPIVerbose(request, new TypeReference<EvaluationForm>() {});
  }

  /**
   * Retrieve the spotability statistic
   * 
   * @param body Keyword Set (optional)
   * @return KeywordSet
   * @throws ApiException if fails to make API call
   */
  public KeywordSet postQualitySpotability(KeywordSet body) throws ApiException {
    return postQualitySpotabilityWithHttpInfo(body).getBody();
  }

  /**
   * Retrieve the spotability statistic
   * 
   * @param body Keyword Set (optional)
   * @return KeywordSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeywordSet> postQualitySpotabilityWithHttpInfo(KeywordSet body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/spotability".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<KeywordSet>() {});
  }

  /**
   * Retrieve the spotability statistic
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public KeywordSet postQualitySpotability(PostQualitySpotabilityRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<KeywordSet>() {});
  }

  /**
   * Retrieve the spotability statistic
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeywordSet> postQualitySpotability(ApiRequest<KeywordSet> request) throws ApiException {
    return pcapiClient.<KeywordSet>invokeAPIVerbose(request, new TypeReference<KeywordSet>() {});
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @param calibrationId Calibration ID (required)
   * @param body Calibration (required)
   * @return Calibration
   * @throws ApiException if fails to make API call
   */
  public Calibration putQualityCalibration(String calibrationId, Calibration body) throws ApiException {
    return putQualityCalibrationWithHttpInfo(calibrationId, body).getBody();
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @param calibrationId Calibration ID (required)
   * @param body Calibration (required)
   * @return Calibration
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Calibration> putQualityCalibrationWithHttpInfo(String calibrationId, Calibration body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'calibrationId' is set
    if (calibrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'calibrationId' when calling putQualityCalibration");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putQualityCalibration");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/calibrations/{calibrationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "calibrationId" + "\\}", pcapiClient.escapeString(calibrationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Calibration>() {});
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Calibration putQualityCalibration(PutQualityCalibrationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Calibration>() {});
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Calibration> putQualityCalibration(ApiRequest<Calibration> request) throws ApiException {
    return pcapiClient.<Calibration>invokeAPIVerbose(request, new TypeReference<Calibration>() {});
  }

  /**
   * Update an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param body evaluation (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws ApiException if fails to make API call
   */
  public Evaluation putQualityConversationEvaluation(String conversationId, String evaluationId, Evaluation body, String expand) throws ApiException {
    return putQualityConversationEvaluationWithHttpInfo(conversationId, evaluationId, body, expand).getBody();
  }

  /**
   * Update an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param body evaluation (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Evaluation> putQualityConversationEvaluationWithHttpInfo(String conversationId, String evaluationId, Evaluation body, String expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling putQualityConversationEvaluation");
    }
    
    // verify the required parameter 'evaluationId' is set
    if (evaluationId == null) {
      throw new ApiException(400, "Missing the required parameter 'evaluationId' when calling putQualityConversationEvaluation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putQualityConversationEvaluation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "evaluationId" + "\\}", pcapiClient.escapeString(evaluationId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Evaluation>() {});
  }

  /**
   * Update an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Evaluation putQualityConversationEvaluation(PutQualityConversationEvaluationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Evaluation>() {});
  }

  /**
   * Update an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Evaluation> putQualityConversationEvaluation(ApiRequest<Evaluation> request) throws ApiException {
    return pcapiClient.<Evaluation>invokeAPIVerbose(request, new TypeReference<Evaluation>() {});
  }

  /**
   * Update an evaluation form.
   * 
   * @param formId Form ID (required)
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws ApiException if fails to make API call
   */
  public EvaluationForm putQualityForm(String formId, EvaluationForm body) throws ApiException {
    return putQualityFormWithHttpInfo(formId, body).getBody();
  }

  /**
   * Update an evaluation form.
   * 
   * @param formId Form ID (required)
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationForm> putQualityFormWithHttpInfo(String formId, EvaluationForm body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling putQualityForm");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putQualityForm");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/forms/{formId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "formId" + "\\}", pcapiClient.escapeString(formId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EvaluationForm>() {});
  }

  /**
   * Update an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EvaluationForm putQualityForm(PutQualityFormRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
  }

  /**
   * Update an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EvaluationForm> putQualityForm(ApiRequest<EvaluationForm> request) throws ApiException {
    return pcapiClient.<EvaluationForm>invokeAPIVerbose(request, new TypeReference<EvaluationForm>() {});
  }

  /**
   * Update a keywordSet to the specified keywordSet via PUT.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @param body keywordSet (required)
   * @return KeywordSet
   * @throws ApiException if fails to make API call
   */
  public KeywordSet putQualityKeywordset(String keywordSetId, KeywordSet body) throws ApiException {
    return putQualityKeywordsetWithHttpInfo(keywordSetId, body).getBody();
  }

  /**
   * Update a keywordSet to the specified keywordSet via PUT.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @param body keywordSet (required)
   * @return KeywordSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeywordSet> putQualityKeywordsetWithHttpInfo(String keywordSetId, KeywordSet body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'keywordSetId' is set
    if (keywordSetId == null) {
      throw new ApiException(400, "Missing the required parameter 'keywordSetId' when calling putQualityKeywordset");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putQualityKeywordset");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/quality/keywordsets/{keywordSetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "keywordSetId" + "\\}", pcapiClient.escapeString(keywordSetId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<KeywordSet>() {});
  }

  /**
   * Update a keywordSet to the specified keywordSet via PUT.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public KeywordSet putQualityKeywordset(PutQualityKeywordsetRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<KeywordSet>() {});
  }

  /**
   * Update a keywordSet to the specified keywordSet via PUT.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeywordSet> putQualityKeywordset(ApiRequest<KeywordSet> request) throws ApiException {
    return pcapiClient.<KeywordSet>invokeAPIVerbose(request, new TypeReference<KeywordSet>() {});
  }

}
