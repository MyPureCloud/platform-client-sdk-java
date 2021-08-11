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
import com.mypurecloud.sdk.v2.model.LearningAssignment;
import com.mypurecloud.sdk.v2.model.LearningAssignmentsDomainEntity;
import com.mypurecloud.sdk.v2.model.LearningModule;
import com.mypurecloud.sdk.v2.model.LearningModuleRule;
import com.mypurecloud.sdk.v2.model.LearningModulesDomainEntityListing;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUpdate;
import com.mypurecloud.sdk.v2.model.AssessmentScoringSet;
import com.mypurecloud.sdk.v2.model.LearningAssessmentScoringRequest;
import com.mypurecloud.sdk.v2.model.LearningAssignmentCreate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateParam;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkAddResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentItem;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkRemoveResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePublishResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleRequest;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserListing;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserQuery;


import com.mypurecloud.sdk.v2.api.request.DeleteLearningAssignmentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteLearningModuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningAssignmentRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningAssignmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningAssignmentsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModuleRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModuleVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModulesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchLearningAssignmentRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssessmentsScoringRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentsBulkaddRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentsBulkremoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningModulePublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningModulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningRulesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutLearningModuleRequest;
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
   * List of Learning module Assignments
   * Either moduleId or user value is required
   * @param moduleId Specifies the ID of the learning module. Fetch assignments for learning module ID (optional)
   * @param interval Specifies the range of dueDates to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param completionInterval Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Specifies if only the non-overdue (overdue is \&quot;False\&quot;) or overdue (overdue is \&quot;True\&quot;) assignments are returned. If overdue is \&quot;Any\&quot; or if the overdue parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pass Specifies if only the failed (pass is \&quot;False\&quot;) or passed (pass is \&quot;True\&quot;) assignments (completed with assessment)are returned. If pass is \&quot;Any\&quot; or if the pass parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param minPercentageScore The minimum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param maxPercentageScore The maximum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param sortOrder Specifies result set sort order; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param sortBy Specifies which field to sort the results by, default sort is by recommendedCompletionDate (optional)
   * @param userId Specifies the list of user IDs to be queried, up to 100 user IDs. (optional)
   * @param types Specifies the assignment types, currently not supported and will be ignored. For now, all learning assignments regardless of types will be returned (optional)
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
   * @param overdue Specifies if only the non-overdue (overdue is \&quot;False\&quot;) or overdue (overdue is \&quot;True\&quot;) assignments are returned. If overdue is \&quot;Any\&quot; or if the overdue parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pass Specifies if only the failed (pass is \&quot;False\&quot;) or passed (pass is \&quot;True\&quot;) assignments (completed with assessment)are returned. If pass is \&quot;Any\&quot; or if the pass parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param minPercentageScore The minimum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param maxPercentageScore The maximum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param sortOrder Specifies result set sort order; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param sortBy Specifies which field to sort the results by, default sort is by recommendedCompletionDate (optional)
   * @param userId Specifies the list of user IDs to be queried, up to 100 user IDs. (optional)
   * @param types Specifies the assignment types, currently not supported and will be ignored. For now, all learning assignments regardless of types will be returned (optional)
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
   * @param overdue Specifies if only the non-overdue (overdue is \&quot;False\&quot;) or overdue (overdue is \&quot;True\&quot;) assignments are returned. If overdue is \&quot;Any\&quot; or if the overdue parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pass Specifies if only the failed (pass is \&quot;False\&quot;) or passed (pass is \&quot;True\&quot;) assignments (completed with assessment)are returned. If pass is \&quot;Any\&quot; or if the pass parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param minPercentageScore The minimum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param maxPercentageScore The maximum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param sortOrder Specifies result set sort order; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param sortBy Specifies which field to sort the results by, default sort is by recommendedCompletionDate (optional)
   * @param types Specifies the assignment types, currently not supported and will be ignored. For now, all learning assignments regardless of types will be returned (optional)
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
   * @param overdue Specifies if only the non-overdue (overdue is \&quot;False\&quot;) or overdue (overdue is \&quot;True\&quot;) assignments are returned. If overdue is \&quot;Any\&quot; or if the overdue parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pass Specifies if only the failed (pass is \&quot;False\&quot;) or passed (pass is \&quot;True\&quot;) assignments (completed with assessment)are returned. If pass is \&quot;Any\&quot; or if the pass parameter is not supplied, all assignments are returned (optional, default to Any)
   * @param minPercentageScore The minimum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param maxPercentageScore The maximum assessment score for an assignment (completed with assessment) to be included in the results (inclusive) (optional)
   * @param sortOrder Specifies result set sort order; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param sortBy Specifies which field to sort the results by, default sort is by recommendedCompletionDate (optional)
   * @param types Specifies the assignment types, currently not supported and will be ignored. For now, all learning assignments regardless of types will be returned (optional)
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
   * @param types Specifies the module types. (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param sortBy Sort by (optional, default to name)
   * @param searchTerm Search Term (searchable by name) (optional)
   * @param expand Fields to expand in response(case insensitive) (optional)
   * @param isPublished Specifies if only the Unpublished (isPublished is \&quot;False\&quot;) or Published (isPublished is \&quot;True\&quot;) modules are returned. If isPublished is \&quot;Any\&quot; or omitted, both types are returned (optional, default to Any)
   * @return LearningModulesDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModulesDomainEntityListing getLearningModules(Boolean isArchived, List<String> types, Integer pageSize, Integer pageNumber, String sortOrder, String sortBy, String searchTerm, List<String> expand, String isPublished) throws IOException, ApiException {
    return  getLearningModules(createGetLearningModulesRequest(isArchived, types, pageSize, pageNumber, sortOrder, sortBy, searchTerm, expand, isPublished));
  }

  /**
   * Get all learning modules of an organization
   * 
   * @param isArchived Archive status (optional, default to false)
   * @param types Specifies the module types. (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param sortBy Sort by (optional, default to name)
   * @param searchTerm Search Term (searchable by name) (optional)
   * @param expand Fields to expand in response(case insensitive) (optional)
   * @param isPublished Specifies if only the Unpublished (isPublished is \&quot;False\&quot;) or Published (isPublished is \&quot;True\&quot;) modules are returned. If isPublished is \&quot;Any\&quot; or omitted, both types are returned (optional, default to Any)
   * @return LearningModulesDomainEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModulesDomainEntityListing> getLearningModulesWithHttpInfo(Boolean isArchived, List<String> types, Integer pageSize, Integer pageNumber, String sortOrder, String sortBy, String searchTerm, List<String> expand, String isPublished) throws IOException {
    return getLearningModules(createGetLearningModulesRequest(isArchived, types, pageSize, pageNumber, sortOrder, sortBy, searchTerm, expand, isPublished).withHttpInfo());
  }

  private GetLearningModulesRequest createGetLearningModulesRequest(Boolean isArchived, List<String> types, Integer pageSize, Integer pageNumber, String sortOrder, String sortBy, String searchTerm, List<String> expand, String isPublished) {
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
   * Publish a Learning module
   * 
   * @param moduleId The ID of the learning module (required)
   * @return LearningModulePublishResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LearningModulePublishResponse postLearningModulePublish(String moduleId) throws IOException, ApiException {
    return  postLearningModulePublish(createPostLearningModulePublishRequest(moduleId));
  }

  /**
   * Publish a Learning module
   * 
   * @param moduleId The ID of the learning module (required)
   * @return LearningModulePublishResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LearningModulePublishResponse> postLearningModulePublishWithHttpInfo(String moduleId) throws IOException {
    return postLearningModulePublish(createPostLearningModulePublishRequest(moduleId).withHttpInfo());
  }

  private PostLearningModulePublishRequest createPostLearningModulePublishRequest(String moduleId) {
    return PostLearningModulePublishRequest.builder()
            .withModuleId(moduleId)
    
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
  public ApiResponse<LearningModulePublishResponse> postLearningModulePublish(ApiRequest<Void> request) throws IOException {
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
