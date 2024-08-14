package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AssessmentScoringSet;
import com.mypurecloud.sdk.v2.model.AssignedLearningModuleDomainEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.LearningAssessmentScoringRequest;
import com.mypurecloud.sdk.v2.model.LearningAssignment;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateParam;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkAddResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkRemoveResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentCreate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentExternalUpdate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentItem;
import com.mypurecloud.sdk.v2.model.LearningAssignmentReschedule;
import com.mypurecloud.sdk.v2.model.LearningAssignmentStep;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUpdate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserListing;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserQuery;
import com.mypurecloud.sdk.v2.model.LearningAssignmentsDomainEntity;
import com.mypurecloud.sdk.v2.model.LearningModule;
import com.mypurecloud.sdk.v2.model.LearningModuleCoverArtResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleJobRequest;
import com.mypurecloud.sdk.v2.model.LearningModuleJobResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewGetResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewUpdateRequest;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewUpdateResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePublishRequest;
import com.mypurecloud.sdk.v2.model.LearningModulePublishResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleRequest;
import com.mypurecloud.sdk.v2.model.LearningModuleRule;
import com.mypurecloud.sdk.v2.model.LearningModulesDomainEntityListing;
import com.mypurecloud.sdk.v2.model.LearningScheduleSlotsQueryRequest;
import com.mypurecloud.sdk.v2.model.LearningScheduleSlotsQueryResponse;
import com.mypurecloud.sdk.v2.model.LearningScormResponse;
import com.mypurecloud.sdk.v2.model.LearningScormUploadRequest;
import com.mypurecloud.sdk.v2.model.LearningScormUploadResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteLearningAssignmentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteLearningModuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningAssignmentRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningAssignmentStepRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningAssignmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningAssignmentsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModuleJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModulePreviewRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModuleRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModuleVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModulesAssignmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModulesCoverartCoverArtIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningScormScormIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchLearningAssignmentRequest;
import com.mypurecloud.sdk.v2.api.request.PatchLearningAssignmentRescheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PatchLearningAssignmentStepRequest;
import com.mypurecloud.sdk.v2.api.request.PatchLearningModuleUserAssignmentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssessmentsScoringRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentReassignRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentResetRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentsBulkaddRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentsBulkremoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningModuleJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningModulePublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningModulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningRulesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningScheduleslotsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningScormRequest;
import com.mypurecloud.sdk.v2.api.request.PutLearningModuleRequest;
import com.mypurecloud.sdk.v2.api.request.PutLearningModulePreviewRequest;
import com.mypurecloud.sdk.v2.api.request.PutLearningModuleRuleRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearningApi {
  private final ApiClient pcapiClient;

  public LearningApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LearningApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a learning assignment
   * 
   * @param assignmentId The Learning Assignment ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLearningAssignment(String assignmentId) throws IOException, ApiException {
     deleteLearningAssignment(createDeleteLearningAssignmentRequest(assignmentId));
  }

  /**
   * Delete a learning assignment
   * 
   * @param assignmentId The Learning Assignment ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLearningAssignmentWithHttpInfo(String assignmentId) throws IOException {
    return deleteLearningAssignment(createDeleteLearningAssignmentRequest(assignmentId).withHttpInfo());
  }

  private DeleteLearningAssignmentRequest createDeleteLearningAssignmentRequest(String assignmentId) {
    return DeleteLearningAssignmentRequest.builder()
            .withAssignmentId(assignmentId)

            .build();
  }

  /**
   * Delete a learning assignment
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLearningAssignment(DeleteLearningAssignmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a learning assignment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLearningAssignment(ApiRequest<Void> request) throws IOException {
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
   * Delete a learning module
   * This will delete a learning module if it is unpublished or it will delete a published and archived learning module
   * @param moduleId The ID of the learning module (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLearningModule(String moduleId) throws IOException, ApiException {
     deleteLearningModule(createDeleteLearningModuleRequest(moduleId));
  }

  /**
   * Delete a learning module
   * This will delete a learning module if it is unpublished or it will delete a published and archived learning module
   * @param moduleId The ID of the learning module (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLearningModuleWithHttpInfo(String moduleId) throws IOException {
    return deleteLearningModule(createDeleteLearningModuleRequest(moduleId).withHttpInfo());
  }

  private DeleteLearningModuleRequest createDeleteLearningModuleRequest(String moduleId) {
    return DeleteLearningModuleRequest.builder()
            .withModuleId(moduleId)

            .build();
  }

  /**
   * Delete a learning module
   * This will delete a learning module if it is unpublished or it will delete a published and archived learning module
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLearningModule(DeleteLearningModuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a learning module
   * This will delete a learning module if it is unpublished or it will delete a published and archived learning module
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLearningModule(ApiRequest<Void> request) throws IOException {
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
   * Get Learning Assignment
   * Permission not required if you are the assigned user of the learning assignment
   * @param assignmentId The ID of Learning Assignment (required)
   * @param expand Fields to expand in response (optional)
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment getLearningAssignment(String assignmentId, List<String> expand) throws IOException, ApiException {
    return  getLearningAssignment(createGetLearningAssignmentRequest(assignmentId, expand));
  }

  /**
   * Get Learning Assignment
   * Permission not required if you are the assigned user of the learning assignment
   * @param assignmentId The ID of Learning Assignment (required)
   * @param expand Fields to expand in response (optional)
   * @return LearningAssignment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> getLearningAssignmentWithHttpInfo(String assignmentId, List<String> expand) throws IOException {
    return getLearningAssignment(createGetLearningAssignmentRequest(assignmentId, expand).withHttpInfo());
  }

  private GetLearningAssignmentRequest createGetLearningAssignmentRequest(String assignmentId, List<String> expand) {
    return GetLearningAssignmentRequest.builder()
            .withAssignmentId(assignmentId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get Learning Assignment
   * Permission not required if you are the assigned user of the learning assignment
   * @param request The request object
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment getLearningAssignment(GetLearningAssignmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Learning Assignment
   * Permission not required if you are the assigned user of the learning assignment
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> getLearningAssignment(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Learning Assignment Step
   * Permission not required if you are the assigned user of the learning assignment
   * @param assignmentId The ID of Learning Assignment (required)
   * @param stepId The ID of Learning Assignment Step (required)
   * @param shareableContentObjectId The ID of SCO to load (optional)
   * @param defaultShareableContentObject The default SCO to retrieve (optional)
   * @param expand Fields to expand in response (optional)
   * @return LearningAssignmentStep
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentStep getLearningAssignmentStep(String assignmentId, String stepId, String shareableContentObjectId, String defaultShareableContentObject, List<String> expand) throws IOException, ApiException {
    return  getLearningAssignmentStep(createGetLearningAssignmentStepRequest(assignmentId, stepId, shareableContentObjectId, defaultShareableContentObject, expand));
  }

  /**
   * Get Learning Assignment Step
   * Permission not required if you are the assigned user of the learning assignment
   * @param assignmentId The ID of Learning Assignment (required)
   * @param stepId The ID of Learning Assignment Step (required)
   * @param shareableContentObjectId The ID of SCO to load (optional)
   * @param defaultShareableContentObject The default SCO to retrieve (optional)
   * @param expand Fields to expand in response (optional)
   * @return LearningAssignmentStep
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentStep> getLearningAssignmentStepWithHttpInfo(String assignmentId, String stepId, String shareableContentObjectId, String defaultShareableContentObject, List<String> expand) throws IOException {
    return getLearningAssignmentStep(createGetLearningAssignmentStepRequest(assignmentId, stepId, shareableContentObjectId, defaultShareableContentObject, expand).withHttpInfo());
  }

  private GetLearningAssignmentStepRequest createGetLearningAssignmentStepRequest(String assignmentId, String stepId, String shareableContentObjectId, String defaultShareableContentObject, List<String> expand) {
    return GetLearningAssignmentStepRequest.builder()
            .withAssignmentId(assignmentId)

            .withStepId(stepId)

            .withShareableContentObjectId(shareableContentObjectId)

            .withDefaultShareableContentObject(defaultShareableContentObject)

            .withExpand(expand)

            .build();
  }

  /**
   * Get Learning Assignment Step
   * Permission not required if you are the assigned user of the learning assignment
   * @param request The request object
   * @return LearningAssignmentStep
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentStep getLearningAssignmentStep(GetLearningAssignmentStepRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignmentStep> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignmentStep>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Learning Assignment Step
   * Permission not required if you are the assigned user of the learning assignment
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentStep> getLearningAssignmentStep(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignmentStep>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignmentStep> response = (ApiResponse<LearningAssignmentStep>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignmentStep> response = (ApiResponse<LearningAssignmentStep>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * List of Learning module Assignments
   * Either moduleId or user value is required
   * @param moduleId Specifies the ID of the learning module. Fetch assignments for learning module ID (optional)
   * @param interval Specifies the range of dueDates to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param completionInterval Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Specifies if only the non-overdue (overdue is \"False\") or overdue (overdue is \"True\") assignments are returned. If overdue is \"Any\" or if the overdue parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pass Specifies if only the failed (pass is \"False\") or passed (pass is \"True\") assignments (completed with assessment)are returned. If pass is \"Any\" or if the pass parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param minPercentageScore The minimum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param maxPercentageScore The maximum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param sortOrder Specifies result set sort order; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param sortBy Specifies which field to sort the results by, default sort is by recommendedCompletionDate (optional)
   * @param userId Specifies the list of user IDs to be queried, up to 100 user IDs. (optional)
   * @param types Specifies the module types to filter by. Informational, AssessedContent and Assessment are deprecated (optional)
   * @param states Specifies the assignment states to filter by (optional)
   * @param expand Specifies the expand option for returning additional information (optional)
   * @return LearningAssignmentsDomainEntity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentsDomainEntity getLearningAssignments(String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String pass, Float minPercentageScore, Float maxPercentageScore, String sortOrder, String sortBy, List<String> userId, List<String> types, List<String> states, List<String> expand) throws IOException, ApiException {
    return  getLearningAssignments(createGetLearningAssignmentsRequest(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, pass, minPercentageScore, maxPercentageScore, sortOrder, sortBy, userId, types, states, expand));
  }

  /**
   * List of Learning module Assignments
   * Either moduleId or user value is required
   * @param moduleId Specifies the ID of the learning module. Fetch assignments for learning module ID (optional)
   * @param interval Specifies the range of dueDates to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param completionInterval Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Specifies if only the non-overdue (overdue is \"False\") or overdue (overdue is \"True\") assignments are returned. If overdue is \"Any\" or if the overdue parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pass Specifies if only the failed (pass is \"False\") or passed (pass is \"True\") assignments (completed with assessment)are returned. If pass is \"Any\" or if the pass parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param minPercentageScore The minimum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param maxPercentageScore The maximum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param sortOrder Specifies result set sort order; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param sortBy Specifies which field to sort the results by, default sort is by recommendedCompletionDate (optional)
   * @param userId Specifies the list of user IDs to be queried, up to 100 user IDs. (optional)
   * @param types Specifies the module types to filter by. Informational, AssessedContent and Assessment are deprecated (optional)
   * @param states Specifies the assignment states to filter by (optional)
   * @param expand Specifies the expand option for returning additional information (optional)
   * @return LearningAssignmentsDomainEntity
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentsDomainEntity> getLearningAssignmentsWithHttpInfo(String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String pass, Float minPercentageScore, Float maxPercentageScore, String sortOrder, String sortBy, List<String> userId, List<String> types, List<String> states, List<String> expand) throws IOException {
    return getLearningAssignments(createGetLearningAssignmentsRequest(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, pass, minPercentageScore, maxPercentageScore, sortOrder, sortBy, userId, types, states, expand).withHttpInfo());
  }

  private GetLearningAssignmentsRequest createGetLearningAssignmentsRequest(String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String pass, Float minPercentageScore, Float maxPercentageScore, String sortOrder, String sortBy, List<String> userId, List<String> types, List<String> states, List<String> expand) {
    return GetLearningAssignmentsRequest.builder()
            .withModuleId(moduleId)

            .withInterval(interval)

            .withCompletionInterval(completionInterval)

            .withOverdue(overdue)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withPass(pass)

            .withMinPercentageScore(minPercentageScore)

            .withMaxPercentageScore(maxPercentageScore)

            .withSortOrder(sortOrder)

            .withSortBy(sortBy)

            .withUserId(userId)

            .withTypes(types)

            .withStates(states)

            .withExpand(expand)

            .build();
  }

  /**
   * List of Learning module Assignments
   * Either moduleId or user value is required
   * @param request The request object
   * @return LearningAssignmentsDomainEntity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentsDomainEntity getLearningAssignments(GetLearningAssignmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignmentsDomainEntity> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignmentsDomainEntity>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List of Learning module Assignments
   * Either moduleId or user value is required
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentsDomainEntity> getLearningAssignments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignmentsDomainEntity>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignmentsDomainEntity> response = (ApiResponse<LearningAssignmentsDomainEntity>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignmentsDomainEntity> response = (ApiResponse<LearningAssignmentsDomainEntity>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * List of Learning Assignments assigned to current user
   * 
   * @param moduleId Specifies the ID of the learning module. Fetch assignments for learning module ID (optional)
   * @param interval Specifies the range of dueDates to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param completionInterval Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Specifies if only the non-overdue (overdue is \"False\") or overdue (overdue is \"True\") assignments are returned. If overdue is \"Any\" or if the overdue parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pass Specifies if only the failed (pass is \"False\") or passed (pass is \"True\") assignments (completed with assessment)are returned. If pass is \"Any\" or if the pass parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param minPercentageScore The minimum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param maxPercentageScore The maximum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param sortOrder Specifies result set sort order; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param sortBy Specifies which field to sort the results by, default sort is by recommendedCompletionDate (optional)
   * @param types Specifies the module types to filter by. Informational, AssessedContent and Assessment are deprecated (optional)
   * @param states Specifies the assignment states to filter by (optional)
   * @param expand Specifies the expand option for returning additional information (optional)
   * @return LearningAssignmentsDomainEntity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentsDomainEntity getLearningAssignmentsMe(String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String pass, Float minPercentageScore, Float maxPercentageScore, String sortOrder, String sortBy, List<String> types, List<String> states, List<String> expand) throws IOException, ApiException {
    return  getLearningAssignmentsMe(createGetLearningAssignmentsMeRequest(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, pass, minPercentageScore, maxPercentageScore, sortOrder, sortBy, types, states, expand));
  }

  /**
   * List of Learning Assignments assigned to current user
   * 
   * @param moduleId Specifies the ID of the learning module. Fetch assignments for learning module ID (optional)
   * @param interval Specifies the range of dueDates to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param completionInterval Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Specifies if only the non-overdue (overdue is \"False\") or overdue (overdue is \"True\") assignments are returned. If overdue is \"Any\" or if the overdue parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pass Specifies if only the failed (pass is \"False\") or passed (pass is \"True\") assignments (completed with assessment)are returned. If pass is \"Any\" or if the pass parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param minPercentageScore The minimum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param maxPercentageScore The maximum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param sortOrder Specifies result set sort order; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param sortBy Specifies which field to sort the results by, default sort is by recommendedCompletionDate (optional)
   * @param types Specifies the module types to filter by. Informational, AssessedContent and Assessment are deprecated (optional)
   * @param states Specifies the assignment states to filter by (optional)
   * @param expand Specifies the expand option for returning additional information (optional)
   * @return LearningAssignmentsDomainEntity
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentsDomainEntity> getLearningAssignmentsMeWithHttpInfo(String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String pass, Float minPercentageScore, Float maxPercentageScore, String sortOrder, String sortBy, List<String> types, List<String> states, List<String> expand) throws IOException {
    return getLearningAssignmentsMe(createGetLearningAssignmentsMeRequest(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, pass, minPercentageScore, maxPercentageScore, sortOrder, sortBy, types, states, expand).withHttpInfo());
  }

  private GetLearningAssignmentsMeRequest createGetLearningAssignmentsMeRequest(String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String pass, Float minPercentageScore, Float maxPercentageScore, String sortOrder, String sortBy, List<String> types, List<String> states, List<String> expand) {
    return GetLearningAssignmentsMeRequest.builder()
            .withModuleId(moduleId)

            .withInterval(interval)

            .withCompletionInterval(completionInterval)

            .withOverdue(overdue)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withPass(pass)

            .withMinPercentageScore(minPercentageScore)

            .withMaxPercentageScore(maxPercentageScore)

            .withSortOrder(sortOrder)

            .withSortBy(sortBy)

            .withTypes(types)

            .withStates(states)

            .withExpand(expand)

            .build();
  }

  /**
   * List of Learning Assignments assigned to current user
   * 
   * @param request The request object
   * @return LearningAssignmentsDomainEntity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentsDomainEntity getLearningAssignmentsMe(GetLearningAssignmentsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignmentsDomainEntity> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignmentsDomainEntity>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List of Learning Assignments assigned to current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentsDomainEntity> getLearningAssignmentsMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignmentsDomainEntity>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignmentsDomainEntity> response = (ApiResponse<LearningAssignmentsDomainEntity>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignmentsDomainEntity> response = (ApiResponse<LearningAssignmentsDomainEntity>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a learning module
   * 
   * @param moduleId The ID of the learning module (required)
   * @param expand Fields to expand in response(case insensitive) (optional)
   * @return LearningModule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModule getLearningModule(String moduleId, List<String> expand) throws IOException, ApiException {
    return  getLearningModule(createGetLearningModuleRequest(moduleId, expand));
  }

  /**
   * Get a learning module
   * 
   * @param moduleId The ID of the learning module (required)
   * @param expand Fields to expand in response(case insensitive) (optional)
   * @return LearningModule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModule> getLearningModuleWithHttpInfo(String moduleId, List<String> expand) throws IOException {
    return getLearningModule(createGetLearningModuleRequest(moduleId, expand).withHttpInfo());
  }

  private GetLearningModuleRequest createGetLearningModuleRequest(String moduleId, List<String> expand) {
    return GetLearningModuleRequest.builder()
            .withModuleId(moduleId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get a learning module
   * 
   * @param request The request object
   * @return LearningModule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModule getLearningModule(GetLearningModuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningModule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningModule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a learning module
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModule> getLearningModule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningModule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a specific Learning Module job status
   * 
   * @param moduleId The ID of the learning module (required)
   * @param jobId The ID of the learning module job (required)
   * @return LearningModuleJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModuleJobResponse getLearningModuleJob(String moduleId, String jobId) throws IOException, ApiException {
    return  getLearningModuleJob(createGetLearningModuleJobRequest(moduleId, jobId));
  }

  /**
   * Get a specific Learning Module job status
   * 
   * @param moduleId The ID of the learning module (required)
   * @param jobId The ID of the learning module job (required)
   * @return LearningModuleJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModuleJobResponse> getLearningModuleJobWithHttpInfo(String moduleId, String jobId) throws IOException {
    return getLearningModuleJob(createGetLearningModuleJobRequest(moduleId, jobId).withHttpInfo());
  }

  private GetLearningModuleJobRequest createGetLearningModuleJobRequest(String moduleId, String jobId) {
    return GetLearningModuleJobRequest.builder()
            .withModuleId(moduleId)

            .withJobId(jobId)

            .build();
  }

  /**
   * Get a specific Learning Module job status
   * 
   * @param request The request object
   * @return LearningModuleJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModuleJobResponse getLearningModuleJob(GetLearningModuleJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningModuleJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningModuleJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a specific Learning Module job status
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModuleJobResponse> getLearningModuleJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningModuleJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningModuleJobResponse> response = (ApiResponse<LearningModuleJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningModuleJobResponse> response = (ApiResponse<LearningModuleJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a learning module preview
   * 
   * @param moduleId The ID of the learning module (required)
   * @return LearningModulePreviewGetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModulePreviewGetResponse getLearningModulePreview(String moduleId) throws IOException, ApiException {
    return  getLearningModulePreview(createGetLearningModulePreviewRequest(moduleId));
  }

  /**
   * Get a learning module preview
   * 
   * @param moduleId The ID of the learning module (required)
   * @return LearningModulePreviewGetResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModulePreviewGetResponse> getLearningModulePreviewWithHttpInfo(String moduleId) throws IOException {
    return getLearningModulePreview(createGetLearningModulePreviewRequest(moduleId).withHttpInfo());
  }

  private GetLearningModulePreviewRequest createGetLearningModulePreviewRequest(String moduleId) {
    return GetLearningModulePreviewRequest.builder()
            .withModuleId(moduleId)

            .build();
  }

  /**
   * Get a learning module preview
   * 
   * @param request The request object
   * @return LearningModulePreviewGetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModulePreviewGetResponse getLearningModulePreview(GetLearningModulePreviewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningModulePreviewGetResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningModulePreviewGetResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a learning module preview
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModulePreviewGetResponse> getLearningModulePreview(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningModulePreviewGetResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningModulePreviewGetResponse> response = (ApiResponse<LearningModulePreviewGetResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningModulePreviewGetResponse> response = (ApiResponse<LearningModulePreviewGetResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a learning module rule
   * 
   * @param moduleId The ID of the learning module (required)
   * @return LearningModuleRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModuleRule getLearningModuleRule(String moduleId) throws IOException, ApiException {
    return  getLearningModuleRule(createGetLearningModuleRuleRequest(moduleId));
  }

  /**
   * Get a learning module rule
   * 
   * @param moduleId The ID of the learning module (required)
   * @return LearningModuleRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModuleRule> getLearningModuleRuleWithHttpInfo(String moduleId) throws IOException {
    return getLearningModuleRule(createGetLearningModuleRuleRequest(moduleId).withHttpInfo());
  }

  private GetLearningModuleRuleRequest createGetLearningModuleRuleRequest(String moduleId) {
    return GetLearningModuleRuleRequest.builder()
            .withModuleId(moduleId)

            .build();
  }

  /**
   * Get a learning module rule
   * 
   * @param request The request object
   * @return LearningModuleRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModuleRule getLearningModuleRule(GetLearningModuleRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningModuleRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningModuleRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a learning module rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModuleRule> getLearningModuleRule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningModuleRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningModuleRule> response = (ApiResponse<LearningModuleRule>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningModuleRule> response = (ApiResponse<LearningModuleRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get specific version of a published module
   * 
   * @param moduleId The ID of the learning module (required)
   * @param versionId The version of learning module (required)
   * @param expand Fields to expand in response(case insensitive) (optional)
   * @return LearningModule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModule getLearningModuleVersion(String moduleId, String versionId, List<String> expand) throws IOException, ApiException {
    return  getLearningModuleVersion(createGetLearningModuleVersionRequest(moduleId, versionId, expand));
  }

  /**
   * Get specific version of a published module
   * 
   * @param moduleId The ID of the learning module (required)
   * @param versionId The version of learning module (required)
   * @param expand Fields to expand in response(case insensitive) (optional)
   * @return LearningModule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModule> getLearningModuleVersionWithHttpInfo(String moduleId, String versionId, List<String> expand) throws IOException {
    return getLearningModuleVersion(createGetLearningModuleVersionRequest(moduleId, versionId, expand).withHttpInfo());
  }

  private GetLearningModuleVersionRequest createGetLearningModuleVersionRequest(String moduleId, String versionId, List<String> expand) {
    return GetLearningModuleVersionRequest.builder()
            .withModuleId(moduleId)

            .withVersionId(versionId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get specific version of a published module
   * 
   * @param request The request object
   * @return LearningModule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModule getLearningModuleVersion(GetLearningModuleVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningModule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningModule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get specific version of a published module
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModule> getLearningModuleVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningModule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all learning modules of an organization
   * 
   * @param isArchived Archive status (optional, default to false)
   * @param types Specifies the module types. Informational, AssessedContent and Assessment are deprecated (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param sortBy Sort by (optional, default to name)
   * @param searchTerm Search Term (searchable by name) (optional)
   * @param expand Fields to expand in response(case insensitive) (optional)
   * @param isPublished Specifies if only the Unpublished (isPublished is \"False\") or Published (isPublished is \"True\") modules are returned. If isPublished is \"Any\" or omitted, both types are returned (optional, default to Any)
   * @param statuses Specifies the module statuses to filter by (optional)
   * @param externalIds Specifies the module external IDs to filter by. Only one ID is allowed (optional)
   * @return LearningModulesDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModulesDomainEntityListing getLearningModules(Boolean isArchived, List<String> types, Integer pageSize, Integer pageNumber, String sortOrder, String sortBy, String searchTerm, List<String> expand, String isPublished, List<String> statuses, List<String> externalIds) throws IOException, ApiException {
    return  getLearningModules(createGetLearningModulesRequest(isArchived, types, pageSize, pageNumber, sortOrder, sortBy, searchTerm, expand, isPublished, statuses, externalIds));
  }

  /**
   * Get all learning modules of an organization
   * 
   * @param isArchived Archive status (optional, default to false)
   * @param types Specifies the module types. Informational, AssessedContent and Assessment are deprecated (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param sortBy Sort by (optional, default to name)
   * @param searchTerm Search Term (searchable by name) (optional)
   * @param expand Fields to expand in response(case insensitive) (optional)
   * @param isPublished Specifies if only the Unpublished (isPublished is \"False\") or Published (isPublished is \"True\") modules are returned. If isPublished is \"Any\" or omitted, both types are returned (optional, default to Any)
   * @param statuses Specifies the module statuses to filter by (optional)
   * @param externalIds Specifies the module external IDs to filter by. Only one ID is allowed (optional)
   * @return LearningModulesDomainEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModulesDomainEntityListing> getLearningModulesWithHttpInfo(Boolean isArchived, List<String> types, Integer pageSize, Integer pageNumber, String sortOrder, String sortBy, String searchTerm, List<String> expand, String isPublished, List<String> statuses, List<String> externalIds) throws IOException {
    return getLearningModules(createGetLearningModulesRequest(isArchived, types, pageSize, pageNumber, sortOrder, sortBy, searchTerm, expand, isPublished, statuses, externalIds).withHttpInfo());
  }

  private GetLearningModulesRequest createGetLearningModulesRequest(Boolean isArchived, List<String> types, Integer pageSize, Integer pageNumber, String sortOrder, String sortBy, String searchTerm, List<String> expand, String isPublished, List<String> statuses, List<String> externalIds) {
    return GetLearningModulesRequest.builder()
            .withIsArchived(isArchived)

            .withTypes(types)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortOrder(sortOrder)

            .withSortBy(sortBy)

            .withSearchTerm(searchTerm)

            .withExpand(expand)

            .withIsPublished(isPublished)

            .withStatuses(statuses)

            .withExternalIds(externalIds)

            .build();
  }

  /**
   * Get all learning modules of an organization
   * 
   * @param request The request object
   * @return LearningModulesDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModulesDomainEntityListing getLearningModules(GetLearningModulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningModulesDomainEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningModulesDomainEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all learning modules of an organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModulesDomainEntityListing> getLearningModules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningModulesDomainEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningModulesDomainEntityListing> response = (ApiResponse<LearningModulesDomainEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningModulesDomainEntityListing> response = (ApiResponse<LearningModulesDomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all learning modules of an organization including assignments for a specific user
   * 
   * @param userIds The IDs of the users to include (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param searchTerm Search Term (searches by name and description) (optional)
   * @param overdue Specifies if only modules with overdue/not overdue (overdue is \"True\" or \"False\") assignments are returned. If overdue is \"Any\" or omitted, both are returned and can including modules that are unassigned. (optional, default to Any)
   * @param assignmentStates Specifies the assignment states to return. (optional)
   * @param expand Fields to expand in response(case insensitive) (optional)
   * @return AssignedLearningModuleDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedLearningModuleDomainEntityListing getLearningModulesAssignments(List<String> userIds, Integer pageSize, Integer pageNumber, String searchTerm, String overdue, List<String> assignmentStates, List<String> expand) throws IOException, ApiException {
    return  getLearningModulesAssignments(createGetLearningModulesAssignmentsRequest(userIds, pageSize, pageNumber, searchTerm, overdue, assignmentStates, expand));
  }

  /**
   * Get all learning modules of an organization including assignments for a specific user
   * 
   * @param userIds The IDs of the users to include (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param searchTerm Search Term (searches by name and description) (optional)
   * @param overdue Specifies if only modules with overdue/not overdue (overdue is \"True\" or \"False\") assignments are returned. If overdue is \"Any\" or omitted, both are returned and can including modules that are unassigned. (optional, default to Any)
   * @param assignmentStates Specifies the assignment states to return. (optional)
   * @param expand Fields to expand in response(case insensitive) (optional)
   * @return AssignedLearningModuleDomainEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssignedLearningModuleDomainEntityListing> getLearningModulesAssignmentsWithHttpInfo(List<String> userIds, Integer pageSize, Integer pageNumber, String searchTerm, String overdue, List<String> assignmentStates, List<String> expand) throws IOException {
    return getLearningModulesAssignments(createGetLearningModulesAssignmentsRequest(userIds, pageSize, pageNumber, searchTerm, overdue, assignmentStates, expand).withHttpInfo());
  }

  private GetLearningModulesAssignmentsRequest createGetLearningModulesAssignmentsRequest(List<String> userIds, Integer pageSize, Integer pageNumber, String searchTerm, String overdue, List<String> assignmentStates, List<String> expand) {
    return GetLearningModulesAssignmentsRequest.builder()
            .withUserIds(userIds)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSearchTerm(searchTerm)

            .withOverdue(overdue)

            .withAssignmentStates(assignmentStates)

            .withExpand(expand)

            .build();
  }

  /**
   * Get all learning modules of an organization including assignments for a specific user
   * 
   * @param request The request object
   * @return AssignedLearningModuleDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedLearningModuleDomainEntityListing getLearningModulesAssignments(GetLearningModulesAssignmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssignedLearningModuleDomainEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssignedLearningModuleDomainEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all learning modules of an organization including assignments for a specific user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssignedLearningModuleDomainEntityListing> getLearningModulesAssignments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssignedLearningModuleDomainEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedLearningModuleDomainEntityListing> response = (ApiResponse<AssignedLearningModuleDomainEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AssignedLearningModuleDomainEntityListing> response = (ApiResponse<AssignedLearningModuleDomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a specific Learning Module cover art using ID
   * 
   * @param coverArtId Key identifier for the cover art (required)
   * @return LearningModuleCoverArtResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModuleCoverArtResponse getLearningModulesCoverartCoverArtId(String coverArtId) throws IOException, ApiException {
    return  getLearningModulesCoverartCoverArtId(createGetLearningModulesCoverartCoverArtIdRequest(coverArtId));
  }

  /**
   * Get a specific Learning Module cover art using ID
   * 
   * @param coverArtId Key identifier for the cover art (required)
   * @return LearningModuleCoverArtResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModuleCoverArtResponse> getLearningModulesCoverartCoverArtIdWithHttpInfo(String coverArtId) throws IOException {
    return getLearningModulesCoverartCoverArtId(createGetLearningModulesCoverartCoverArtIdRequest(coverArtId).withHttpInfo());
  }

  private GetLearningModulesCoverartCoverArtIdRequest createGetLearningModulesCoverartCoverArtIdRequest(String coverArtId) {
    return GetLearningModulesCoverartCoverArtIdRequest.builder()
            .withCoverArtId(coverArtId)

            .build();
  }

  /**
   * Get a specific Learning Module cover art using ID
   * 
   * @param request The request object
   * @return LearningModuleCoverArtResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModuleCoverArtResponse getLearningModulesCoverartCoverArtId(GetLearningModulesCoverartCoverArtIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningModuleCoverArtResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningModuleCoverArtResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a specific Learning Module cover art using ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModuleCoverArtResponse> getLearningModulesCoverartCoverArtId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningModuleCoverArtResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningModuleCoverArtResponse> response = (ApiResponse<LearningModuleCoverArtResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningModuleCoverArtResponse> response = (ApiResponse<LearningModuleCoverArtResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Learning SCORM Result
   * 
   * @param scormId The ID of the SCORM package (required)
   * @return LearningScormResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningScormResponse getLearningScormScormId(String scormId) throws IOException, ApiException {
    return  getLearningScormScormId(createGetLearningScormScormIdRequest(scormId));
  }

  /**
   * Get Learning SCORM Result
   * 
   * @param scormId The ID of the SCORM package (required)
   * @return LearningScormResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningScormResponse> getLearningScormScormIdWithHttpInfo(String scormId) throws IOException {
    return getLearningScormScormId(createGetLearningScormScormIdRequest(scormId).withHttpInfo());
  }

  private GetLearningScormScormIdRequest createGetLearningScormScormIdRequest(String scormId) {
    return GetLearningScormScormIdRequest.builder()
            .withScormId(scormId)

            .build();
  }

  /**
   * Get Learning SCORM Result
   * 
   * @param request The request object
   * @return LearningScormResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningScormResponse getLearningScormScormId(GetLearningScormScormIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningScormResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningScormResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Learning SCORM Result
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningScormResponse> getLearningScormScormId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningScormResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningScormResponse> response = (ApiResponse<LearningScormResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningScormResponse> response = (ApiResponse<LearningScormResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update Learning Assignment
   * 
   * @param assignmentId The ID of Learning Assignment (required)
   * @param body The Learning Assignment to be updated (optional)
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment patchLearningAssignment(String assignmentId, LearningAssignmentUpdate body) throws IOException, ApiException {
    return  patchLearningAssignment(createPatchLearningAssignmentRequest(assignmentId, body));
  }

  /**
   * Update Learning Assignment
   * 
   * @param assignmentId The ID of Learning Assignment (required)
   * @param body The Learning Assignment to be updated (optional)
   * @return LearningAssignment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> patchLearningAssignmentWithHttpInfo(String assignmentId, LearningAssignmentUpdate body) throws IOException {
    return patchLearningAssignment(createPatchLearningAssignmentRequest(assignmentId, body).withHttpInfo());
  }

  private PatchLearningAssignmentRequest createPatchLearningAssignmentRequest(String assignmentId, LearningAssignmentUpdate body) {
    return PatchLearningAssignmentRequest.builder()
            .withAssignmentId(assignmentId)

            .withBody(body)

            .build();
  }

  /**
   * Update Learning Assignment
   * 
   * @param request The request object
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment patchLearningAssignment(PatchLearningAssignmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Learning Assignment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> patchLearningAssignment(ApiRequest<LearningAssignmentUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Reschedule Learning Assignment
   * 
   * @param assignmentId The ID of Learning Assignment (required)
   * @param body The Learning assignment reschedule model (optional)
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment patchLearningAssignmentReschedule(String assignmentId, LearningAssignmentReschedule body) throws IOException, ApiException {
    return  patchLearningAssignmentReschedule(createPatchLearningAssignmentRescheduleRequest(assignmentId, body));
  }

  /**
   * Reschedule Learning Assignment
   * 
   * @param assignmentId The ID of Learning Assignment (required)
   * @param body The Learning assignment reschedule model (optional)
   * @return LearningAssignment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> patchLearningAssignmentRescheduleWithHttpInfo(String assignmentId, LearningAssignmentReschedule body) throws IOException {
    return patchLearningAssignmentReschedule(createPatchLearningAssignmentRescheduleRequest(assignmentId, body).withHttpInfo());
  }

  private PatchLearningAssignmentRescheduleRequest createPatchLearningAssignmentRescheduleRequest(String assignmentId, LearningAssignmentReschedule body) {
    return PatchLearningAssignmentRescheduleRequest.builder()
            .withAssignmentId(assignmentId)

            .withBody(body)

            .build();
  }

  /**
   * Reschedule Learning Assignment
   * 
   * @param request The request object
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment patchLearningAssignmentReschedule(PatchLearningAssignmentRescheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Reschedule Learning Assignment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> patchLearningAssignmentReschedule(ApiRequest<LearningAssignmentReschedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update Learning Assignment Step
   * Permission not required if you are the assigned user of the learning assignment
   * @param assignmentId The ID of Learning Assignment (required)
   * @param stepId The ID of Learning Assignment Step (required)
   * @param body The Learning Assignment Step to be updated (optional)
   * @return LearningAssignmentStep
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentStep patchLearningAssignmentStep(String assignmentId, String stepId, LearningAssignmentStep body) throws IOException, ApiException {
    return  patchLearningAssignmentStep(createPatchLearningAssignmentStepRequest(assignmentId, stepId, body));
  }

  /**
   * Update Learning Assignment Step
   * Permission not required if you are the assigned user of the learning assignment
   * @param assignmentId The ID of Learning Assignment (required)
   * @param stepId The ID of Learning Assignment Step (required)
   * @param body The Learning Assignment Step to be updated (optional)
   * @return LearningAssignmentStep
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentStep> patchLearningAssignmentStepWithHttpInfo(String assignmentId, String stepId, LearningAssignmentStep body) throws IOException {
    return patchLearningAssignmentStep(createPatchLearningAssignmentStepRequest(assignmentId, stepId, body).withHttpInfo());
  }

  private PatchLearningAssignmentStepRequest createPatchLearningAssignmentStepRequest(String assignmentId, String stepId, LearningAssignmentStep body) {
    return PatchLearningAssignmentStepRequest.builder()
            .withAssignmentId(assignmentId)

            .withStepId(stepId)

            .withBody(body)

            .build();
  }

  /**
   * Update Learning Assignment Step
   * Permission not required if you are the assigned user of the learning assignment
   * @param request The request object
   * @return LearningAssignmentStep
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentStep patchLearningAssignmentStep(PatchLearningAssignmentStepRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignmentStep> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignmentStep>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Learning Assignment Step
   * Permission not required if you are the assigned user of the learning assignment
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentStep> patchLearningAssignmentStep(ApiRequest<LearningAssignmentStep> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignmentStep>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignmentStep> response = (ApiResponse<LearningAssignmentStep>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignmentStep> response = (ApiResponse<LearningAssignmentStep>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an external assignment for a specific user
   * 
   * @param moduleId Key identifier for the module (required)
   * @param userId Key identifier for the user (required)
   * @param body The learning request for updating the assignment (required)
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment patchLearningModuleUserAssignments(String moduleId, String userId, LearningAssignmentExternalUpdate body) throws IOException, ApiException {
    return  patchLearningModuleUserAssignments(createPatchLearningModuleUserAssignmentsRequest(moduleId, userId, body));
  }

  /**
   * Update an external assignment for a specific user
   * 
   * @param moduleId Key identifier for the module (required)
   * @param userId Key identifier for the user (required)
   * @param body The learning request for updating the assignment (required)
   * @return LearningAssignment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> patchLearningModuleUserAssignmentsWithHttpInfo(String moduleId, String userId, LearningAssignmentExternalUpdate body) throws IOException {
    return patchLearningModuleUserAssignments(createPatchLearningModuleUserAssignmentsRequest(moduleId, userId, body).withHttpInfo());
  }

  private PatchLearningModuleUserAssignmentsRequest createPatchLearningModuleUserAssignmentsRequest(String moduleId, String userId, LearningAssignmentExternalUpdate body) {
    return PatchLearningModuleUserAssignmentsRequest.builder()
            .withModuleId(moduleId)

            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Update an external assignment for a specific user
   * 
   * @param request The request object
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment patchLearningModuleUserAssignments(PatchLearningModuleUserAssignmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an external assignment for a specific user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> patchLearningModuleUserAssignments(ApiRequest<LearningAssignmentExternalUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Score learning assessment for preview
   * 
   * @param body Assessment form and answers to score (required)
   * @return AssessmentScoringSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssessmentScoringSet postLearningAssessmentsScoring(LearningAssessmentScoringRequest body) throws IOException, ApiException {
    return  postLearningAssessmentsScoring(createPostLearningAssessmentsScoringRequest(body));
  }

  /**
   * Score learning assessment for preview
   * 
   * @param body Assessment form and answers to score (required)
   * @return AssessmentScoringSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssessmentScoringSet> postLearningAssessmentsScoringWithHttpInfo(LearningAssessmentScoringRequest body) throws IOException {
    return postLearningAssessmentsScoring(createPostLearningAssessmentsScoringRequest(body).withHttpInfo());
  }

  private PostLearningAssessmentsScoringRequest createPostLearningAssessmentsScoringRequest(LearningAssessmentScoringRequest body) {
    return PostLearningAssessmentsScoringRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Score learning assessment for preview
   * 
   * @param request The request object
   * @return AssessmentScoringSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssessmentScoringSet postLearningAssessmentsScoring(PostLearningAssessmentsScoringRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssessmentScoringSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssessmentScoringSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Score learning assessment for preview
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssessmentScoringSet> postLearningAssessmentsScoring(ApiRequest<LearningAssessmentScoringRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssessmentScoringSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssessmentScoringSet> response = (ApiResponse<AssessmentScoringSet>)(ApiResponse<?>)exception;
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
      ApiResponse<AssessmentScoringSet> response = (ApiResponse<AssessmentScoringSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Reassign Learning Assignment
   * This will reassign the state of the assignment to 'Assigned' and update the assignment to the latest version of the module
   * @param assignmentId The Learning Assignment ID (required)
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment postLearningAssignmentReassign(String assignmentId) throws IOException, ApiException {
    return  postLearningAssignmentReassign(createPostLearningAssignmentReassignRequest(assignmentId));
  }

  /**
   * Reassign Learning Assignment
   * This will reassign the state of the assignment to 'Assigned' and update the assignment to the latest version of the module
   * @param assignmentId The Learning Assignment ID (required)
   * @return LearningAssignment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> postLearningAssignmentReassignWithHttpInfo(String assignmentId) throws IOException {
    return postLearningAssignmentReassign(createPostLearningAssignmentReassignRequest(assignmentId).withHttpInfo());
  }

  private PostLearningAssignmentReassignRequest createPostLearningAssignmentReassignRequest(String assignmentId) {
    return PostLearningAssignmentReassignRequest.builder()
            .withAssignmentId(assignmentId)

            .build();
  }

  /**
   * Reassign Learning Assignment
   * This will reassign the state of the assignment to 'Assigned' and update the assignment to the latest version of the module
   * @param request The request object
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment postLearningAssignmentReassign(PostLearningAssignmentReassignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Reassign Learning Assignment
   * This will reassign the state of the assignment to 'Assigned' and update the assignment to the latest version of the module
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> postLearningAssignmentReassign(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Reset Learning Assignment
   * This will reset the state of the assignment to 'Assigned' and remove the version of Learning module associated with the assignment
   * @param assignmentId The Learning Assignment ID (required)
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment postLearningAssignmentReset(String assignmentId) throws IOException, ApiException {
    return  postLearningAssignmentReset(createPostLearningAssignmentResetRequest(assignmentId));
  }

  /**
   * Reset Learning Assignment
   * This will reset the state of the assignment to 'Assigned' and remove the version of Learning module associated with the assignment
   * @param assignmentId The Learning Assignment ID (required)
   * @return LearningAssignment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> postLearningAssignmentResetWithHttpInfo(String assignmentId) throws IOException {
    return postLearningAssignmentReset(createPostLearningAssignmentResetRequest(assignmentId).withHttpInfo());
  }

  private PostLearningAssignmentResetRequest createPostLearningAssignmentResetRequest(String assignmentId) {
    return PostLearningAssignmentResetRequest.builder()
            .withAssignmentId(assignmentId)

            .build();
  }

  /**
   * Reset Learning Assignment
   * This will reset the state of the assignment to 'Assigned' and remove the version of Learning module associated with the assignment
   * @param request The request object
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment postLearningAssignmentReset(PostLearningAssignmentResetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Reset Learning Assignment
   * This will reset the state of the assignment to 'Assigned' and remove the version of Learning module associated with the assignment
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> postLearningAssignmentReset(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create Learning Assignment
   * 
   * @param body The Learning Assignment to be created (optional)
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment postLearningAssignments(LearningAssignmentCreate body) throws IOException, ApiException {
    return  postLearningAssignments(createPostLearningAssignmentsRequest(body));
  }

  /**
   * Create Learning Assignment
   * 
   * @param body The Learning Assignment to be created (optional)
   * @return LearningAssignment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> postLearningAssignmentsWithHttpInfo(LearningAssignmentCreate body) throws IOException {
    return postLearningAssignments(createPostLearningAssignmentsRequest(body).withHttpInfo());
  }

  private PostLearningAssignmentsRequest createPostLearningAssignmentsRequest(LearningAssignmentCreate body) {
    return PostLearningAssignmentsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create Learning Assignment
   * 
   * @param request The request object
   * @return LearningAssignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignment postLearningAssignments(PostLearningAssignmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Learning Assignment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignment> postLearningAssignments(ApiRequest<LearningAssignmentCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve aggregated assignment data
   * 
   * @param body Aggregate Request (required)
   * @return LearningAssignmentAggregateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentAggregateResponse postLearningAssignmentsAggregatesQuery(LearningAssignmentAggregateParam body) throws IOException, ApiException {
    return  postLearningAssignmentsAggregatesQuery(createPostLearningAssignmentsAggregatesQueryRequest(body));
  }

  /**
   * Retrieve aggregated assignment data
   * 
   * @param body Aggregate Request (required)
   * @return LearningAssignmentAggregateResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentAggregateResponse> postLearningAssignmentsAggregatesQueryWithHttpInfo(LearningAssignmentAggregateParam body) throws IOException {
    return postLearningAssignmentsAggregatesQuery(createPostLearningAssignmentsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostLearningAssignmentsAggregatesQueryRequest createPostLearningAssignmentsAggregatesQueryRequest(LearningAssignmentAggregateParam body) {
    return PostLearningAssignmentsAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Retrieve aggregated assignment data
   * 
   * @param request The request object
   * @return LearningAssignmentAggregateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentAggregateResponse postLearningAssignmentsAggregatesQuery(PostLearningAssignmentsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignmentAggregateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignmentAggregateResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve aggregated assignment data
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentAggregateResponse> postLearningAssignmentsAggregatesQuery(ApiRequest<LearningAssignmentAggregateParam> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignmentAggregateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignmentAggregateResponse> response = (ApiResponse<LearningAssignmentAggregateResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignmentAggregateResponse> response = (ApiResponse<LearningAssignmentAggregateResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add multiple learning assignments
   * 
   * @param body The learning assignments to be created (optional)
   * @return LearningAssignmentBulkAddResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentBulkAddResponse postLearningAssignmentsBulkadd(List<LearningAssignmentItem> body) throws IOException, ApiException {
    return  postLearningAssignmentsBulkadd(createPostLearningAssignmentsBulkaddRequest(body));
  }

  /**
   * Add multiple learning assignments
   * 
   * @param body The learning assignments to be created (optional)
   * @return LearningAssignmentBulkAddResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentBulkAddResponse> postLearningAssignmentsBulkaddWithHttpInfo(List<LearningAssignmentItem> body) throws IOException {
    return postLearningAssignmentsBulkadd(createPostLearningAssignmentsBulkaddRequest(body).withHttpInfo());
  }

  private PostLearningAssignmentsBulkaddRequest createPostLearningAssignmentsBulkaddRequest(List<LearningAssignmentItem> body) {
    return PostLearningAssignmentsBulkaddRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Add multiple learning assignments
   * 
   * @param request The request object
   * @return LearningAssignmentBulkAddResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentBulkAddResponse postLearningAssignmentsBulkadd(PostLearningAssignmentsBulkaddRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignmentBulkAddResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignmentBulkAddResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add multiple learning assignments
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentBulkAddResponse> postLearningAssignmentsBulkadd(ApiRequest<List<LearningAssignmentItem>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignmentBulkAddResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignmentBulkAddResponse> response = (ApiResponse<LearningAssignmentBulkAddResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignmentBulkAddResponse> response = (ApiResponse<LearningAssignmentBulkAddResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Remove multiple Learning Assignments
   * 
   * @param body The IDs of the learning assignments to be removed (optional)
   * @return LearningAssignmentBulkRemoveResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentBulkRemoveResponse postLearningAssignmentsBulkremove(List<String> body) throws IOException, ApiException {
    return  postLearningAssignmentsBulkremove(createPostLearningAssignmentsBulkremoveRequest(body));
  }

  /**
   * Remove multiple Learning Assignments
   * 
   * @param body The IDs of the learning assignments to be removed (optional)
   * @return LearningAssignmentBulkRemoveResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentBulkRemoveResponse> postLearningAssignmentsBulkremoveWithHttpInfo(List<String> body) throws IOException {
    return postLearningAssignmentsBulkremove(createPostLearningAssignmentsBulkremoveRequest(body).withHttpInfo());
  }

  private PostLearningAssignmentsBulkremoveRequest createPostLearningAssignmentsBulkremoveRequest(List<String> body) {
    return PostLearningAssignmentsBulkremoveRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Remove multiple Learning Assignments
   * 
   * @param request The request object
   * @return LearningAssignmentBulkRemoveResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentBulkRemoveResponse postLearningAssignmentsBulkremove(PostLearningAssignmentsBulkremoveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignmentBulkRemoveResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignmentBulkRemoveResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Remove multiple Learning Assignments
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentBulkRemoveResponse> postLearningAssignmentsBulkremove(ApiRequest<List<String>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignmentBulkRemoveResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignmentBulkRemoveResponse> response = (ApiResponse<LearningAssignmentBulkRemoveResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignmentBulkRemoveResponse> response = (ApiResponse<LearningAssignmentBulkRemoveResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Starts a specified operation on learning module
   * This will initiate operation specified in the request body for a learning module
   * @param moduleId The ID of the learning module (required)
   * @param body The learning module job request (required)
   * @return LearningModuleJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModuleJobResponse postLearningModuleJobs(String moduleId, LearningModuleJobRequest body) throws IOException, ApiException {
    return  postLearningModuleJobs(createPostLearningModuleJobsRequest(moduleId, body));
  }

  /**
   * Starts a specified operation on learning module
   * This will initiate operation specified in the request body for a learning module
   * @param moduleId The ID of the learning module (required)
   * @param body The learning module job request (required)
   * @return LearningModuleJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModuleJobResponse> postLearningModuleJobsWithHttpInfo(String moduleId, LearningModuleJobRequest body) throws IOException {
    return postLearningModuleJobs(createPostLearningModuleJobsRequest(moduleId, body).withHttpInfo());
  }

  private PostLearningModuleJobsRequest createPostLearningModuleJobsRequest(String moduleId, LearningModuleJobRequest body) {
    return PostLearningModuleJobsRequest.builder()
            .withModuleId(moduleId)

            .withBody(body)

            .build();
  }

  /**
   * Starts a specified operation on learning module
   * This will initiate operation specified in the request body for a learning module
   * @param request The request object
   * @return LearningModuleJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModuleJobResponse postLearningModuleJobs(PostLearningModuleJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningModuleJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningModuleJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Starts a specified operation on learning module
   * This will initiate operation specified in the request body for a learning module
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModuleJobResponse> postLearningModuleJobs(ApiRequest<LearningModuleJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningModuleJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningModuleJobResponse> response = (ApiResponse<LearningModuleJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningModuleJobResponse> response = (ApiResponse<LearningModuleJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Publish a Learning module
   * 
   * @param moduleId The ID of the learning module (required)
   * @param body The request body (optional)
   * @return LearningModulePublishResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModulePublishResponse postLearningModulePublish(String moduleId, LearningModulePublishRequest body) throws IOException, ApiException {
    return  postLearningModulePublish(createPostLearningModulePublishRequest(moduleId, body));
  }

  /**
   * Publish a Learning module
   * 
   * @param moduleId The ID of the learning module (required)
   * @param body The request body (optional)
   * @return LearningModulePublishResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModulePublishResponse> postLearningModulePublishWithHttpInfo(String moduleId, LearningModulePublishRequest body) throws IOException {
    return postLearningModulePublish(createPostLearningModulePublishRequest(moduleId, body).withHttpInfo());
  }

  private PostLearningModulePublishRequest createPostLearningModulePublishRequest(String moduleId, LearningModulePublishRequest body) {
    return PostLearningModulePublishRequest.builder()
            .withModuleId(moduleId)

            .withBody(body)

            .build();
  }

  /**
   * Publish a Learning module
   * 
   * @param request The request object
   * @return LearningModulePublishResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModulePublishResponse postLearningModulePublish(PostLearningModulePublishRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningModulePublishResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningModulePublishResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish a Learning module
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModulePublishResponse> postLearningModulePublish(ApiRequest<LearningModulePublishRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningModulePublishResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningModulePublishResponse> response = (ApiResponse<LearningModulePublishResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningModulePublishResponse> response = (ApiResponse<LearningModulePublishResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new learning module
   * This will create a new unpublished learning module with the specified fields.
   * @param body The learning module to be created (required)
   * @return LearningModule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModule postLearningModules(LearningModuleRequest body) throws IOException, ApiException {
    return  postLearningModules(createPostLearningModulesRequest(body));
  }

  /**
   * Create a new learning module
   * This will create a new unpublished learning module with the specified fields.
   * @param body The learning module to be created (required)
   * @return LearningModule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModule> postLearningModulesWithHttpInfo(LearningModuleRequest body) throws IOException {
    return postLearningModules(createPostLearningModulesRequest(body).withHttpInfo());
  }

  private PostLearningModulesRequest createPostLearningModulesRequest(LearningModuleRequest body) {
    return PostLearningModulesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new learning module
   * This will create a new unpublished learning module with the specified fields.
   * @param request The request object
   * @return LearningModule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModule postLearningModules(PostLearningModulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningModule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningModule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new learning module
   * This will create a new unpublished learning module with the specified fields.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModule> postLearningModules(ApiRequest<LearningModuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningModule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get users for learning module rule
   * This will get the users who matches the given rule.
   * @param pageSize Page size (required)
   * @param pageNumber Page number (required)
   * @param body The learning module rule to fetch users (required)
   * @return LearningAssignmentUserListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentUserListing postLearningRulesQuery(Integer pageSize, Integer pageNumber, LearningAssignmentUserQuery body) throws IOException, ApiException {
    return  postLearningRulesQuery(createPostLearningRulesQueryRequest(pageSize, pageNumber, body));
  }

  /**
   * Get users for learning module rule
   * This will get the users who matches the given rule.
   * @param pageSize Page size (required)
   * @param pageNumber Page number (required)
   * @param body The learning module rule to fetch users (required)
   * @return LearningAssignmentUserListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentUserListing> postLearningRulesQueryWithHttpInfo(Integer pageSize, Integer pageNumber, LearningAssignmentUserQuery body) throws IOException {
    return postLearningRulesQuery(createPostLearningRulesQueryRequest(pageSize, pageNumber, body).withHttpInfo());
  }

  private PostLearningRulesQueryRequest createPostLearningRulesQueryRequest(Integer pageSize, Integer pageNumber, LearningAssignmentUserQuery body) {
    return PostLearningRulesQueryRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withBody(body)

            .build();
  }

  /**
   * Get users for learning module rule
   * This will get the users who matches the given rule.
   * @param request The request object
   * @return LearningAssignmentUserListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningAssignmentUserListing postLearningRulesQuery(PostLearningRulesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningAssignmentUserListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningAssignmentUserListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get users for learning module rule
   * This will get the users who matches the given rule.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningAssignmentUserListing> postLearningRulesQuery(ApiRequest<LearningAssignmentUserQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningAssignmentUserListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningAssignmentUserListing> response = (ApiResponse<LearningAssignmentUserListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningAssignmentUserListing> response = (ApiResponse<LearningAssignmentUserListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of possible slots where a learning activity can be scheduled.
   * 
   * @param body The slot search request (required)
   * @return LearningScheduleSlotsQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningScheduleSlotsQueryResponse postLearningScheduleslotsQuery(LearningScheduleSlotsQueryRequest body) throws IOException, ApiException {
    return  postLearningScheduleslotsQuery(createPostLearningScheduleslotsQueryRequest(body));
  }

  /**
   * Get list of possible slots where a learning activity can be scheduled.
   * 
   * @param body The slot search request (required)
   * @return LearningScheduleSlotsQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningScheduleSlotsQueryResponse> postLearningScheduleslotsQueryWithHttpInfo(LearningScheduleSlotsQueryRequest body) throws IOException {
    return postLearningScheduleslotsQuery(createPostLearningScheduleslotsQueryRequest(body).withHttpInfo());
  }

  private PostLearningScheduleslotsQueryRequest createPostLearningScheduleslotsQueryRequest(LearningScheduleSlotsQueryRequest body) {
    return PostLearningScheduleslotsQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Get list of possible slots where a learning activity can be scheduled.
   * 
   * @param request The request object
   * @return LearningScheduleSlotsQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningScheduleSlotsQueryResponse postLearningScheduleslotsQuery(PostLearningScheduleslotsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningScheduleSlotsQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningScheduleSlotsQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of possible slots where a learning activity can be scheduled.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningScheduleSlotsQueryResponse> postLearningScheduleslotsQuery(ApiRequest<LearningScheduleSlotsQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningScheduleSlotsQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningScheduleSlotsQueryResponse> response = (ApiResponse<LearningScheduleSlotsQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningScheduleSlotsQueryResponse> response = (ApiResponse<LearningScheduleSlotsQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a SCORM package upload request
   * 
   * @param body The SCORM package to be uploaded (optional)
   * @return LearningScormUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningScormUploadResponse postLearningScorm(LearningScormUploadRequest body) throws IOException, ApiException {
    return  postLearningScorm(createPostLearningScormRequest(body));
  }

  /**
   * Create a SCORM package upload request
   * 
   * @param body The SCORM package to be uploaded (optional)
   * @return LearningScormUploadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningScormUploadResponse> postLearningScormWithHttpInfo(LearningScormUploadRequest body) throws IOException {
    return postLearningScorm(createPostLearningScormRequest(body).withHttpInfo());
  }

  private PostLearningScormRequest createPostLearningScormRequest(LearningScormUploadRequest body) {
    return PostLearningScormRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a SCORM package upload request
   * 
   * @param request The request object
   * @return LearningScormUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningScormUploadResponse postLearningScorm(PostLearningScormRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningScormUploadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningScormUploadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a SCORM package upload request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningScormUploadResponse> postLearningScorm(ApiRequest<LearningScormUploadRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningScormUploadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningScormUploadResponse> response = (ApiResponse<LearningScormUploadResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningScormUploadResponse> response = (ApiResponse<LearningScormUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a learning module
   * This will update the name, description, completion time in days and inform steps for a learning module
   * @param moduleId The ID of the learning module (required)
   * @param body The learning module to be updated (required)
   * @return LearningModule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModule putLearningModule(String moduleId, LearningModuleRequest body) throws IOException, ApiException {
    return  putLearningModule(createPutLearningModuleRequest(moduleId, body));
  }

  /**
   * Update a learning module
   * This will update the name, description, completion time in days and inform steps for a learning module
   * @param moduleId The ID of the learning module (required)
   * @param body The learning module to be updated (required)
   * @return LearningModule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModule> putLearningModuleWithHttpInfo(String moduleId, LearningModuleRequest body) throws IOException {
    return putLearningModule(createPutLearningModuleRequest(moduleId, body).withHttpInfo());
  }

  private PutLearningModuleRequest createPutLearningModuleRequest(String moduleId, LearningModuleRequest body) {
    return PutLearningModuleRequest.builder()
            .withModuleId(moduleId)

            .withBody(body)

            .build();
  }

  /**
   * Update a learning module
   * This will update the name, description, completion time in days and inform steps for a learning module
   * @param request The request object
   * @return LearningModule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModule putLearningModule(PutLearningModuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningModule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningModule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a learning module
   * This will update the name, description, completion time in days and inform steps for a learning module
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModule> putLearningModule(ApiRequest<LearningModuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningModule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a learning module preview
   * This will update a learning module preview
   * @param moduleId The ID of the learning module (required)
   * @param body The learning module to be updated (required)
   * @return LearningModulePreviewUpdateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModulePreviewUpdateResponse putLearningModulePreview(String moduleId, LearningModulePreviewUpdateRequest body) throws IOException, ApiException {
    return  putLearningModulePreview(createPutLearningModulePreviewRequest(moduleId, body));
  }

  /**
   * Update a learning module preview
   * This will update a learning module preview
   * @param moduleId The ID of the learning module (required)
   * @param body The learning module to be updated (required)
   * @return LearningModulePreviewUpdateResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModulePreviewUpdateResponse> putLearningModulePreviewWithHttpInfo(String moduleId, LearningModulePreviewUpdateRequest body) throws IOException {
    return putLearningModulePreview(createPutLearningModulePreviewRequest(moduleId, body).withHttpInfo());
  }

  private PutLearningModulePreviewRequest createPutLearningModulePreviewRequest(String moduleId, LearningModulePreviewUpdateRequest body) {
    return PutLearningModulePreviewRequest.builder()
            .withModuleId(moduleId)

            .withBody(body)

            .build();
  }

  /**
   * Update a learning module preview
   * This will update a learning module preview
   * @param request The request object
   * @return LearningModulePreviewUpdateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModulePreviewUpdateResponse putLearningModulePreview(PutLearningModulePreviewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningModulePreviewUpdateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningModulePreviewUpdateResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a learning module preview
   * This will update a learning module preview
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModulePreviewUpdateResponse> putLearningModulePreview(ApiRequest<LearningModulePreviewUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningModulePreviewUpdateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningModulePreviewUpdateResponse> response = (ApiResponse<LearningModulePreviewUpdateResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningModulePreviewUpdateResponse> response = (ApiResponse<LearningModulePreviewUpdateResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a learning module rule
   * This will update a learning module rule with the specified fields.
   * @param moduleId The ID of the learning module (required)
   * @param body The learning module rule to be updated (required)
   * @return LearningModuleRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModuleRule putLearningModuleRule(String moduleId, LearningModuleRule body) throws IOException, ApiException {
    return  putLearningModuleRule(createPutLearningModuleRuleRequest(moduleId, body));
  }

  /**
   * Update a learning module rule
   * This will update a learning module rule with the specified fields.
   * @param moduleId The ID of the learning module (required)
   * @param body The learning module rule to be updated (required)
   * @return LearningModuleRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModuleRule> putLearningModuleRuleWithHttpInfo(String moduleId, LearningModuleRule body) throws IOException {
    return putLearningModuleRule(createPutLearningModuleRuleRequest(moduleId, body).withHttpInfo());
  }

  private PutLearningModuleRuleRequest createPutLearningModuleRuleRequest(String moduleId, LearningModuleRule body) {
    return PutLearningModuleRuleRequest.builder()
            .withModuleId(moduleId)

            .withBody(body)

            .build();
  }

  /**
   * Update a learning module rule
   * This will update a learning module rule with the specified fields.
   * @param request The request object
   * @return LearningModuleRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModuleRule putLearningModuleRule(PutLearningModuleRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LearningModuleRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LearningModuleRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a learning module rule
   * This will update a learning module rule with the specified fields.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModuleRule> putLearningModuleRule(ApiRequest<LearningModuleRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LearningModuleRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LearningModuleRule> response = (ApiResponse<LearningModuleRule>)(ApiResponse<?>)exception;
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
      ApiResponse<LearningModuleRule> response = (ApiResponse<LearningModuleRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
