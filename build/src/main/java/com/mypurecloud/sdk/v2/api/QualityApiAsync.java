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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class QualityApiAsync {
  private final ApiClient pcapiClient;

  public QualityApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public QualityApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a calibration by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Calibration> deleteQualityCalibrationAsync(DeleteQualityCalibrationRequest request, AsyncApiCallback<Calibration> callback) {
    return pcapiClient.<Calibration>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Calibration>() {}, callback);
  }

  /**
   * Delete a calibration by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Calibration>> deleteQualityCalibrationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Calibration>> callback) {
    return pcapiClient.<Calibration>invokeAPIVerboseAsync(request, new TypeReference<Calibration>() {}, callback);
  }

  /**
   * Delete an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Evaluation> deleteQualityConversationEvaluationAsync(DeleteQualityConversationEvaluationRequest request, AsyncApiCallback<Evaluation> callback) {
    return pcapiClient.<Evaluation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Evaluation>() {}, callback);
  }

  /**
   * Delete an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Evaluation>> deleteQualityConversationEvaluationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Evaluation>> callback) {
    return pcapiClient.<Evaluation>invokeAPIVerboseAsync(request, new TypeReference<Evaluation>() {}, callback);
  }

  /**
   * Delete an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteQualityFormAsync(DeleteQualityFormRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteQualityFormAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a keywordSet by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteQualityKeywordsetAsync(DeleteQualityKeywordsetRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a keywordSet by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteQualityKeywordsetAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete keyword sets
   * Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteQualityKeywordsetsAsync(DeleteQualityKeywordsetsRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete keyword sets
   * Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteQualityKeywordsetsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Gets a list of Agent Activities
   * Including the number of evaluations and average evaluation score
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AgentActivityEntityListing> getQualityAgentsActivityAsync(GetQualityAgentsActivityRequest request, AsyncApiCallback<AgentActivityEntityListing> callback) {
    return pcapiClient.<AgentActivityEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AgentActivityEntityListing>() {}, callback);
  }

  /**
   * Gets a list of Agent Activities
   * Including the number of evaluations and average evaluation score
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AgentActivityEntityListing>> getQualityAgentsActivityAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<AgentActivityEntityListing>> callback) {
    return pcapiClient.<AgentActivityEntityListing>invokeAPIVerboseAsync(request, new TypeReference<AgentActivityEntityListing>() {}, callback);
  }

  /**
   * Get a calibration by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Calibration> getQualityCalibrationAsync(GetQualityCalibrationRequest request, AsyncApiCallback<Calibration> callback) {
    return pcapiClient.<Calibration>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Calibration>() {}, callback);
  }

  /**
   * Get a calibration by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Calibration>> getQualityCalibrationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Calibration>> callback) {
    return pcapiClient.<Calibration>invokeAPIVerboseAsync(request, new TypeReference<Calibration>() {}, callback);
  }

  /**
   * Get the list of calibrations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CalibrationEntityListing> getQualityCalibrationsAsync(GetQualityCalibrationsRequest request, AsyncApiCallback<CalibrationEntityListing> callback) {
    return pcapiClient.<CalibrationEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CalibrationEntityListing>() {}, callback);
  }

  /**
   * Get the list of calibrations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CalibrationEntityListing>> getQualityCalibrationsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CalibrationEntityListing>> callback) {
    return pcapiClient.<CalibrationEntityListing>invokeAPIVerboseAsync(request, new TypeReference<CalibrationEntityListing>() {}, callback);
  }

  /**
   * Get audits for conversation or recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<QualityAuditPage> getQualityConversationAuditsAsync(GetQualityConversationAuditsRequest request, AsyncApiCallback<QualityAuditPage> callback) {
    return pcapiClient.<QualityAuditPage>invokeAPIAsync(request.withHttpInfo(), new TypeReference<QualityAuditPage>() {}, callback);
  }

  /**
   * Get audits for conversation or recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<QualityAuditPage>> getQualityConversationAuditsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<QualityAuditPage>> callback) {
    return pcapiClient.<QualityAuditPage>invokeAPIVerboseAsync(request, new TypeReference<QualityAuditPage>() {}, callback);
  }

  /**
   * Get an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Evaluation> getQualityConversationEvaluationAsync(GetQualityConversationEvaluationRequest request, AsyncApiCallback<Evaluation> callback) {
    return pcapiClient.<Evaluation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Evaluation>() {}, callback);
  }

  /**
   * Get an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Evaluation>> getQualityConversationEvaluationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Evaluation>> callback) {
    return pcapiClient.<Evaluation>invokeAPIVerboseAsync(request, new TypeReference<Evaluation>() {}, callback);
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EvaluationEntityListing> getQualityEvaluationsQueryAsync(GetQualityEvaluationsQueryRequest request, AsyncApiCallback<EvaluationEntityListing> callback) {
    return pcapiClient.<EvaluationEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EvaluationEntityListing>() {}, callback);
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EvaluationEntityListing>> getQualityEvaluationsQueryAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EvaluationEntityListing>> callback) {
    return pcapiClient.<EvaluationEntityListing>invokeAPIVerboseAsync(request, new TypeReference<EvaluationEntityListing>() {}, callback);
  }

  /**
   * Get an evaluator activity
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EvaluatorActivityEntityListing> getQualityEvaluatorsActivityAsync(GetQualityEvaluatorsActivityRequest request, AsyncApiCallback<EvaluatorActivityEntityListing> callback) {
    return pcapiClient.<EvaluatorActivityEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EvaluatorActivityEntityListing>() {}, callback);
  }

  /**
   * Get an evaluator activity
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EvaluatorActivityEntityListing>> getQualityEvaluatorsActivityAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EvaluatorActivityEntityListing>> callback) {
    return pcapiClient.<EvaluatorActivityEntityListing>invokeAPIVerboseAsync(request, new TypeReference<EvaluatorActivityEntityListing>() {}, callback);
  }

  /**
   * Get an evaluation form
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EvaluationForm> getQualityFormAsync(GetQualityFormRequest request, AsyncApiCallback<EvaluationForm> callback) {
    return pcapiClient.<EvaluationForm>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, callback);
  }

  /**
   * Get an evaluation form
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EvaluationForm>> getQualityFormAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    return pcapiClient.<EvaluationForm>invokeAPIVerboseAsync(request, new TypeReference<EvaluationForm>() {}, callback);
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EvaluationFormEntityListing> getQualityFormVersionsAsync(GetQualityFormVersionsRequest request, AsyncApiCallback<EvaluationFormEntityListing> callback) {
    return pcapiClient.<EvaluationFormEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {}, callback);
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EvaluationFormEntityListing>> getQualityFormVersionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>> callback) {
    return pcapiClient.<EvaluationFormEntityListing>invokeAPIVerboseAsync(request, new TypeReference<EvaluationFormEntityListing>() {}, callback);
  }

  /**
   * Get the list of evaluation forms
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EvaluationFormEntityListing> getQualityFormsAsync(GetQualityFormsRequest request, AsyncApiCallback<EvaluationFormEntityListing> callback) {
    return pcapiClient.<EvaluationFormEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {}, callback);
  }

  /**
   * Get the list of evaluation forms
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EvaluationFormEntityListing>> getQualityFormsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>> callback) {
    return pcapiClient.<EvaluationFormEntityListing>invokeAPIVerboseAsync(request, new TypeReference<EvaluationFormEntityListing>() {}, callback);
  }

  /**
   * Get a keywordSet by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<KeywordSet> getQualityKeywordsetAsync(GetQualityKeywordsetRequest request, AsyncApiCallback<KeywordSet> callback) {
    return pcapiClient.<KeywordSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<KeywordSet>() {}, callback);
  }

  /**
   * Get a keywordSet by id.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<KeywordSet>> getQualityKeywordsetAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<KeywordSet>> callback) {
    return pcapiClient.<KeywordSet>invokeAPIVerboseAsync(request, new TypeReference<KeywordSet>() {}, callback);
  }

  /**
   * Get the list of keyword sets
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<KeywordSetEntityListing> getQualityKeywordsetsAsync(GetQualityKeywordsetsRequest request, AsyncApiCallback<KeywordSetEntityListing> callback) {
    return pcapiClient.<KeywordSetEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<KeywordSetEntityListing>() {}, callback);
  }

  /**
   * Get the list of keyword sets
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<KeywordSetEntityListing>> getQualityKeywordsetsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<KeywordSetEntityListing>> callback) {
    return pcapiClient.<KeywordSetEntityListing>invokeAPIVerboseAsync(request, new TypeReference<KeywordSetEntityListing>() {}, callback);
  }

  /**
   * Get the published evaluation forms.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EvaluationForm> getQualityPublishedformAsync(GetQualityPublishedformRequest request, AsyncApiCallback<EvaluationForm> callback) {
    return pcapiClient.<EvaluationForm>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, callback);
  }

  /**
   * Get the published evaluation forms.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EvaluationForm>> getQualityPublishedformAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    return pcapiClient.<EvaluationForm>invokeAPIVerboseAsync(request, new TypeReference<EvaluationForm>() {}, callback);
  }

  /**
   * Get the published evaluation forms.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EvaluationFormEntityListing> getQualityPublishedformsAsync(GetQualityPublishedformsRequest request, AsyncApiCallback<EvaluationFormEntityListing> callback) {
    return pcapiClient.<EvaluationFormEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {}, callback);
  }

  /**
   * Get the published evaluation forms.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EvaluationFormEntityListing>> getQualityPublishedformsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>> callback) {
    return pcapiClient.<EvaluationFormEntityListing>invokeAPIVerboseAsync(request, new TypeReference<EvaluationFormEntityListing>() {}, callback);
  }

  /**
   * Query for evaluation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AggregateQueryResponse> postAnalyticsEvaluationsAggregatesQueryAsync(PostAnalyticsEvaluationsAggregatesQueryRequest request, AsyncApiCallback<AggregateQueryResponse> callback) {
    return pcapiClient.<AggregateQueryResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {}, callback);
  }

  /**
   * Query for evaluation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AggregateQueryResponse>> postAnalyticsEvaluationsAggregatesQueryAsync(ApiRequest<AggregationQuery> request, AsyncApiCallback<ApiResponse<AggregateQueryResponse>> callback) {
    return pcapiClient.<AggregateQueryResponse>invokeAPIVerboseAsync(request, new TypeReference<AggregateQueryResponse>() {}, callback);
  }

  /**
   * Create a calibration
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Calibration> postQualityCalibrationsAsync(PostQualityCalibrationsRequest request, AsyncApiCallback<Calibration> callback) {
    return pcapiClient.<Calibration>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Calibration>() {}, callback);
  }

  /**
   * Create a calibration
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Calibration>> postQualityCalibrationsAsync(ApiRequest<CalibrationCreate> request, AsyncApiCallback<ApiResponse<Calibration>> callback) {
    return pcapiClient.<Calibration>invokeAPIVerboseAsync(request, new TypeReference<Calibration>() {}, callback);
  }

  /**
   * Create an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Evaluation> postQualityConversationEvaluationsAsync(PostQualityConversationEvaluationsRequest request, AsyncApiCallback<Evaluation> callback) {
    return pcapiClient.<Evaluation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Evaluation>() {}, callback);
  }

  /**
   * Create an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Evaluation>> postQualityConversationEvaluationsAsync(ApiRequest<Evaluation> request, AsyncApiCallback<ApiResponse<Evaluation>> callback) {
    return pcapiClient.<Evaluation>invokeAPIVerboseAsync(request, new TypeReference<Evaluation>() {}, callback);
  }

  /**
   * Score evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EvaluationScoringSet> postQualityEvaluationsScoringAsync(PostQualityEvaluationsScoringRequest request, AsyncApiCallback<EvaluationScoringSet> callback) {
    return pcapiClient.<EvaluationScoringSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EvaluationScoringSet>() {}, callback);
  }

  /**
   * Score evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EvaluationScoringSet>> postQualityEvaluationsScoringAsync(ApiRequest<EvaluationFormAndScoringSet> request, AsyncApiCallback<ApiResponse<EvaluationScoringSet>> callback) {
    return pcapiClient.<EvaluationScoringSet>invokeAPIVerboseAsync(request, new TypeReference<EvaluationScoringSet>() {}, callback);
  }

  /**
   * Create an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EvaluationForm> postQualityFormsAsync(PostQualityFormsRequest request, AsyncApiCallback<EvaluationForm> callback) {
    return pcapiClient.<EvaluationForm>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, callback);
  }

  /**
   * Create an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EvaluationForm>> postQualityFormsAsync(ApiRequest<EvaluationForm> request, AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    return pcapiClient.<EvaluationForm>invokeAPIVerboseAsync(request, new TypeReference<EvaluationForm>() {}, callback);
  }

  /**
   * Create a Keyword Set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<KeywordSet> postQualityKeywordsetsAsync(PostQualityKeywordsetsRequest request, AsyncApiCallback<KeywordSet> callback) {
    return pcapiClient.<KeywordSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<KeywordSet>() {}, callback);
  }

  /**
   * Create a Keyword Set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<KeywordSet>> postQualityKeywordsetsAsync(ApiRequest<KeywordSet> request, AsyncApiCallback<ApiResponse<KeywordSet>> callback) {
    return pcapiClient.<KeywordSet>invokeAPIVerboseAsync(request, new TypeReference<KeywordSet>() {}, callback);
  }

  /**
   * Publish an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EvaluationForm> postQualityPublishedformsAsync(PostQualityPublishedformsRequest request, AsyncApiCallback<EvaluationForm> callback) {
    return pcapiClient.<EvaluationForm>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, callback);
  }

  /**
   * Publish an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EvaluationForm>> postQualityPublishedformsAsync(ApiRequest<EvaluationForm> request, AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    return pcapiClient.<EvaluationForm>invokeAPIVerboseAsync(request, new TypeReference<EvaluationForm>() {}, callback);
  }

  /**
   * Retrieve the spotability statistic
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<KeywordSet> postQualitySpotabilityAsync(PostQualitySpotabilityRequest request, AsyncApiCallback<KeywordSet> callback) {
    return pcapiClient.<KeywordSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<KeywordSet>() {}, callback);
  }

  /**
   * Retrieve the spotability statistic
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<KeywordSet>> postQualitySpotabilityAsync(ApiRequest<KeywordSet> request, AsyncApiCallback<ApiResponse<KeywordSet>> callback) {
    return pcapiClient.<KeywordSet>invokeAPIVerboseAsync(request, new TypeReference<KeywordSet>() {}, callback);
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Calibration> putQualityCalibrationAsync(PutQualityCalibrationRequest request, AsyncApiCallback<Calibration> callback) {
    return pcapiClient.<Calibration>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Calibration>() {}, callback);
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Calibration>> putQualityCalibrationAsync(ApiRequest<Calibration> request, AsyncApiCallback<ApiResponse<Calibration>> callback) {
    return pcapiClient.<Calibration>invokeAPIVerboseAsync(request, new TypeReference<Calibration>() {}, callback);
  }

  /**
   * Update an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Evaluation> putQualityConversationEvaluationAsync(PutQualityConversationEvaluationRequest request, AsyncApiCallback<Evaluation> callback) {
    return pcapiClient.<Evaluation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Evaluation>() {}, callback);
  }

  /**
   * Update an evaluation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Evaluation>> putQualityConversationEvaluationAsync(ApiRequest<Evaluation> request, AsyncApiCallback<ApiResponse<Evaluation>> callback) {
    return pcapiClient.<Evaluation>invokeAPIVerboseAsync(request, new TypeReference<Evaluation>() {}, callback);
  }

  /**
   * Update an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EvaluationForm> putQualityFormAsync(PutQualityFormRequest request, AsyncApiCallback<EvaluationForm> callback) {
    return pcapiClient.<EvaluationForm>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, callback);
  }

  /**
   * Update an evaluation form.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EvaluationForm>> putQualityFormAsync(ApiRequest<EvaluationForm> request, AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    return pcapiClient.<EvaluationForm>invokeAPIVerboseAsync(request, new TypeReference<EvaluationForm>() {}, callback);
  }

  /**
   * Update a keywordSet to the specified keywordSet via PUT.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<KeywordSet> putQualityKeywordsetAsync(PutQualityKeywordsetRequest request, AsyncApiCallback<KeywordSet> callback) {
    return pcapiClient.<KeywordSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<KeywordSet>() {}, callback);
  }

  /**
   * Update a keywordSet to the specified keywordSet via PUT.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<KeywordSet>> putQualityKeywordsetAsync(ApiRequest<KeywordSet> request, AsyncApiCallback<ApiResponse<KeywordSet>> callback) {
    return pcapiClient.<KeywordSet>invokeAPIVerboseAsync(request, new TypeReference<KeywordSet>() {}, callback);
  }

}
