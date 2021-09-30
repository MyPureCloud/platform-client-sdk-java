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
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.DataAvailabilityResponse;
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.DivsPermittedEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzSubject;
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.UserProfileEntityListing;
import com.mypurecloud.sdk.v2.model.AgentMaxUtilization;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.Adjacents;
import com.mypurecloud.sdk.v2.model.CallForwarding;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
import com.mypurecloud.sdk.v2.model.Geolocation;
import com.mypurecloud.sdk.v2.model.OutOfOffice;
import com.mypurecloud.sdk.v2.model.UserProfile;
import com.mypurecloud.sdk.v2.model.UserQueueEntityListing;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.UserLanguageEntityListing;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingStatus;
import com.mypurecloud.sdk.v2.model.UserState;
import com.mypurecloud.sdk.v2.model.UserStations;
import com.mypurecloud.sdk.v2.model.TrustorEntityListing;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityListing;
import com.mypurecloud.sdk.v2.model.DevelopmentActivity;
import com.mypurecloud.sdk.v2.model.UserMe;
import com.mypurecloud.sdk.v2.model.UsersSearchResponse;
import com.mypurecloud.sdk.v2.model.UpdateUser;
import com.mypurecloud.sdk.v2.model.UserQueue;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguage;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguagePost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.PatchUser;
import com.mypurecloud.sdk.v2.model.UserAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.UserAggregationQuery;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncUserDetailsQuery;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.UserObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.UserObservationQuery;
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;
import com.mypurecloud.sdk.v2.model.ChangePasswordRequest;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.CreateUser;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityAggregateResponse;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityAggregateParam;
import com.mypurecloud.sdk.v2.model.ChangeMyPasswordRequest;
import com.mypurecloud.sdk.v2.model.UserSearchRequest;
import com.mypurecloud.sdk.v2.model.Utilization;


import com.mypurecloud.sdk.v2.api.request.DeleteAnalyticsUsersDetailsJobRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationSubjectDivisionRoleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingUserUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserRoutinglanguageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserRoutingskillRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserStationAssociatedstationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserStationDefaultstationRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsUsersDetailsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsUsersDetailsJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsUsersDetailsJobsAvailabilityRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionspermittedMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionspermittedPagedMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionspermittedPagedSubjectIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationSubjectRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationSubjectsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetFieldconfigRequest;
import com.mypurecloud.sdk.v2.api.request.GetProfilesUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUserUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserAdjacentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserCallforwardingRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserDirectreportsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserFavoritesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserGeolocationRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserOutofofficeRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserProfileRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserProfileskillsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRoutinglanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRoutingskillsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRoutingstatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserStateRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserStationRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserSuperiorsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserTrustorsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersDevelopmentActivitiesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersDevelopmentActivitiesMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersDevelopmentActivityRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserCallforwardingRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserGeolocationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserQueueRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserRoutinglanguageRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserRoutinglanguagesBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserRoutingskillsBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUsersBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersDetailsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersDetailsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectBulkaddRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectBulkremoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectBulkreplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectDivisionRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserInviteRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserPasswordRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserRoutinglanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserRoutingskillsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersDevelopmentActivitiesAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersMePasswordRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingUserUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserCallforwardingRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserOutofofficeRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserProfileskillsRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserRoutingskillRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserRoutingskillsBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserRoutingstatusRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserStateRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserStationAssociatedstationStationIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserStationDefaultstationStationIdRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UsersApi {
  private final ApiClient pcapiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete/cancel an async request
   * 
   * @param jobId jobId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsUsersDetailsJob(String jobId) throws IOException, ApiException {
     deleteAnalyticsUsersDetailsJob(createDeleteAnalyticsUsersDetailsJobRequest(jobId));
  }

  /**
   * Delete/cancel an async request
   * 
   * @param jobId jobId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAnalyticsUsersDetailsJobWithHttpInfo(String jobId) throws IOException {
    return deleteAnalyticsUsersDetailsJob(createDeleteAnalyticsUsersDetailsJobRequest(jobId).withHttpInfo());
  }

  private DeleteAnalyticsUsersDetailsJobRequest createDeleteAnalyticsUsersDetailsJobRequest(String jobId) {
    return DeleteAnalyticsUsersDetailsJobRequest.builder()
            .withJobId(jobId)
    
            .build();
  }

  /**
   * Delete/cancel an async request
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsUsersDetailsJob(DeleteAnalyticsUsersDetailsJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete/cancel an async request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAnalyticsUsersDetailsJob(ApiRequest<Void> request) throws IOException {
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
   * Delete a grant of a role in a division
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param divisionId the id of the division of the grant (required)
   * @param roleId the id of the role of the grant (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAuthorizationSubjectDivisionRole(String subjectId, String divisionId, String roleId) throws IOException, ApiException {
     deleteAuthorizationSubjectDivisionRole(createDeleteAuthorizationSubjectDivisionRoleRequest(subjectId, divisionId, roleId));
  }

  /**
   * Delete a grant of a role in a division
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param divisionId the id of the division of the grant (required)
   * @param roleId the id of the role of the grant (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAuthorizationSubjectDivisionRoleWithHttpInfo(String subjectId, String divisionId, String roleId) throws IOException {
    return deleteAuthorizationSubjectDivisionRole(createDeleteAuthorizationSubjectDivisionRoleRequest(subjectId, divisionId, roleId).withHttpInfo());
  }

  private DeleteAuthorizationSubjectDivisionRoleRequest createDeleteAuthorizationSubjectDivisionRoleRequest(String subjectId, String divisionId, String roleId) {
    return DeleteAuthorizationSubjectDivisionRoleRequest.builder()
            .withSubjectId(subjectId)
    
            .withDivisionId(divisionId)
    
            .withRoleId(roleId)
    
            .build();
  }

  /**
   * Delete a grant of a role in a division
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAuthorizationSubjectDivisionRole(DeleteAuthorizationSubjectDivisionRoleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a grant of a role in a division
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAuthorizationSubjectDivisionRole(ApiRequest<Void> request) throws IOException {
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
   * Delete the user&#39;s max utilization settings and revert to the organization-wide default.
   * 
   * @param userId User ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingUserUtilization(String userId) throws IOException, ApiException {
     deleteRoutingUserUtilization(createDeleteRoutingUserUtilizationRequest(userId));
  }

  /**
   * Delete the user&#39;s max utilization settings and revert to the organization-wide default.
   * 
   * @param userId User ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingUserUtilizationWithHttpInfo(String userId) throws IOException {
    return deleteRoutingUserUtilization(createDeleteRoutingUserUtilizationRequest(userId).withHttpInfo());
  }

  private DeleteRoutingUserUtilizationRequest createDeleteRoutingUserUtilizationRequest(String userId) {
    return DeleteRoutingUserUtilizationRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Delete the user&#39;s max utilization settings and revert to the organization-wide default.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingUserUtilization(DeleteRoutingUserUtilizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete the user&#39;s max utilization settings and revert to the organization-wide default.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingUserUtilization(ApiRequest<Void> request) throws IOException {
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
   * Delete user
   * 
   * @param userId User ID (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteUser(String userId) throws IOException, ApiException {
    return  deleteUser(createDeleteUserRequest(userId));
  }

  /**
   * Delete user
   * 
   * @param userId User ID (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteUserWithHttpInfo(String userId) throws IOException {
    return deleteUser(createDeleteUserRequest(userId).withHttpInfo());
  }

  private DeleteUserRequest createDeleteUserRequest(String userId) {
    return DeleteUserRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Delete user
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteUser(DeleteUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Empty> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Empty>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteUser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Empty>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
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
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Remove routing language from user
   * 
   * @param userId User ID (required)
   * @param languageId languageId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserRoutinglanguage(String userId, String languageId) throws IOException, ApiException {
     deleteUserRoutinglanguage(createDeleteUserRoutinglanguageRequest(userId, languageId));
  }

  /**
   * Remove routing language from user
   * 
   * @param userId User ID (required)
   * @param languageId languageId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserRoutinglanguageWithHttpInfo(String userId, String languageId) throws IOException {
    return deleteUserRoutinglanguage(createDeleteUserRoutinglanguageRequest(userId, languageId).withHttpInfo());
  }

  private DeleteUserRoutinglanguageRequest createDeleteUserRoutinglanguageRequest(String userId, String languageId) {
    return DeleteUserRoutinglanguageRequest.builder()
            .withUserId(userId)
    
            .withLanguageId(languageId)
    
            .build();
  }

  /**
   * Remove routing language from user
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserRoutinglanguage(DeleteUserRoutinglanguageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove routing language from user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserRoutinglanguage(ApiRequest<Void> request) throws IOException {
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
   * Remove routing skill from user
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserRoutingskill(String userId, String skillId) throws IOException, ApiException {
     deleteUserRoutingskill(createDeleteUserRoutingskillRequest(userId, skillId));
  }

  /**
   * Remove routing skill from user
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserRoutingskillWithHttpInfo(String userId, String skillId) throws IOException {
    return deleteUserRoutingskill(createDeleteUserRoutingskillRequest(userId, skillId).withHttpInfo());
  }

  private DeleteUserRoutingskillRequest createDeleteUserRoutingskillRequest(String userId, String skillId) {
    return DeleteUserRoutingskillRequest.builder()
            .withUserId(userId)
    
            .withSkillId(skillId)
    
            .build();
  }

  /**
   * Remove routing skill from user
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserRoutingskill(DeleteUserRoutingskillRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove routing skill from user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserRoutingskill(ApiRequest<Void> request) throws IOException {
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
   * Clear associated station
   * 
   * @param userId User ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserStationAssociatedstation(String userId) throws IOException, ApiException {
     deleteUserStationAssociatedstation(createDeleteUserStationAssociatedstationRequest(userId));
  }

  /**
   * Clear associated station
   * 
   * @param userId User ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserStationAssociatedstationWithHttpInfo(String userId) throws IOException {
    return deleteUserStationAssociatedstation(createDeleteUserStationAssociatedstationRequest(userId).withHttpInfo());
  }

  private DeleteUserStationAssociatedstationRequest createDeleteUserStationAssociatedstationRequest(String userId) {
    return DeleteUserStationAssociatedstationRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Clear associated station
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserStationAssociatedstation(DeleteUserStationAssociatedstationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Clear associated station
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserStationAssociatedstation(ApiRequest<Void> request) throws IOException {
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
   * Clear default station
   * 
   * @param userId User ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserStationDefaultstation(String userId) throws IOException, ApiException {
     deleteUserStationDefaultstation(createDeleteUserStationDefaultstationRequest(userId));
  }

  /**
   * Clear default station
   * 
   * @param userId User ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserStationDefaultstationWithHttpInfo(String userId) throws IOException {
    return deleteUserStationDefaultstation(createDeleteUserStationDefaultstationRequest(userId).withHttpInfo());
  }

  private DeleteUserStationDefaultstationRequest createDeleteUserStationDefaultstationRequest(String userId) {
    return DeleteUserStationDefaultstationRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Clear default station
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserStationDefaultstation(DeleteUserStationDefaultstationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Clear default station
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserStationDefaultstation(ApiRequest<Void> request) throws IOException {
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
   * Get status for async query for user details
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsUsersDetailsJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsUsersDetailsJob(createGetAnalyticsUsersDetailsJobRequest(jobId));
  }

  /**
   * Get status for async query for user details
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsUsersDetailsJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsUsersDetailsJob(createGetAnalyticsUsersDetailsJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsUsersDetailsJobRequest createGetAnalyticsUsersDetailsJobRequest(String jobId) {
    return GetAnalyticsUsersDetailsJobRequest.builder()
            .withJobId(jobId)
    
            .build();
  }

  /**
   * Get status for async query for user details
   * 
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsUsersDetailsJob(GetAnalyticsUsersDetailsJobRequest request) throws IOException, ApiException {
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
   * Get status for async query for user details
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsUsersDetailsJob(ApiRequest<Void> request) throws IOException {
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
   * Fetch a page of results for an async query
   * 
   * @param jobId jobId (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize The desired maximum number of results (optional)
   * @return AnalyticsUserDetailsAsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsUserDetailsAsyncQueryResponse getAnalyticsUsersDetailsJobResults(String jobId, String cursor, Integer pageSize) throws IOException, ApiException {
    return  getAnalyticsUsersDetailsJobResults(createGetAnalyticsUsersDetailsJobResultsRequest(jobId, cursor, pageSize));
  }

  /**
   * Fetch a page of results for an async query
   * 
   * @param jobId jobId (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize The desired maximum number of results (optional)
   * @return AnalyticsUserDetailsAsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> getAnalyticsUsersDetailsJobResultsWithHttpInfo(String jobId, String cursor, Integer pageSize) throws IOException {
    return getAnalyticsUsersDetailsJobResults(createGetAnalyticsUsersDetailsJobResultsRequest(jobId, cursor, pageSize).withHttpInfo());
  }

  private GetAnalyticsUsersDetailsJobResultsRequest createGetAnalyticsUsersDetailsJobResultsRequest(String jobId, String cursor, Integer pageSize) {
    return GetAnalyticsUsersDetailsJobResultsRequest.builder()
            .withJobId(jobId)
    
            .withCursor(cursor)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Fetch a page of results for an async query
   * 
   * @param request The request object
   * @return AnalyticsUserDetailsAsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsUserDetailsAsyncQueryResponse getAnalyticsUsersDetailsJobResults(GetAnalyticsUsersDetailsJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsUserDetailsAsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async query
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> getAnalyticsUsersDetailsJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsUserDetailsAsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> response = (ApiResponse<AnalyticsUserDetailsAsyncQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> response = (ApiResponse<AnalyticsUserDetailsAsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Lookup the datalake availability date and time
   * 
   * @return DataAvailabilityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataAvailabilityResponse getAnalyticsUsersDetailsJobsAvailability() throws IOException, ApiException {
    return  getAnalyticsUsersDetailsJobsAvailability(createGetAnalyticsUsersDetailsJobsAvailabilityRequest());
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @return DataAvailabilityResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataAvailabilityResponse> getAnalyticsUsersDetailsJobsAvailabilityWithHttpInfo() throws IOException {
    return getAnalyticsUsersDetailsJobsAvailability(createGetAnalyticsUsersDetailsJobsAvailabilityRequest().withHttpInfo());
  }

  private GetAnalyticsUsersDetailsJobsAvailabilityRequest createGetAnalyticsUsersDetailsJobsAvailabilityRequest() {
    return GetAnalyticsUsersDetailsJobsAvailabilityRequest.builder()
            .build();
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @param request The request object
   * @return DataAvailabilityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataAvailabilityResponse getAnalyticsUsersDetailsJobsAvailability(GetAnalyticsUsersDetailsJobsAvailabilityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataAvailabilityResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataAvailabilityResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataAvailabilityResponse> getAnalyticsUsersDetailsJobsAvailability(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataAvailabilityResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataAvailabilityResponse> response = (ApiResponse<DataAvailabilityResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<DataAvailabilityResponse> response = (ApiResponse<DataAvailabilityResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Returns which divisions the current user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param permission The permission string, including the object to access, e.g. routing:queue:view (required)
   * @param name Search term to filter by division name (optional)
   * @return List<AuthzDivision>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<AuthzDivision> getAuthorizationDivisionspermittedMe(String permission, String name) throws IOException, ApiException {
    return  getAuthorizationDivisionspermittedMe(createGetAuthorizationDivisionspermittedMeRequest(permission, name));
  }

  /**
   * Returns which divisions the current user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param permission The permission string, including the object to access, e.g. routing:queue:view (required)
   * @param name Search term to filter by division name (optional)
   * @return List<AuthzDivision>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<AuthzDivision>> getAuthorizationDivisionspermittedMeWithHttpInfo(String permission, String name) throws IOException {
    return getAuthorizationDivisionspermittedMe(createGetAuthorizationDivisionspermittedMeRequest(permission, name).withHttpInfo());
  }

  private GetAuthorizationDivisionspermittedMeRequest createGetAuthorizationDivisionspermittedMeRequest(String permission, String name) {
    return GetAuthorizationDivisionspermittedMeRequest.builder()
            .withPermission(permission)
    
            .withName(name)
    
            .build();
  }

  /**
   * Returns which divisions the current user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param request The request object
   * @return List<AuthzDivision>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<AuthzDivision> getAuthorizationDivisionspermittedMe(GetAuthorizationDivisionspermittedMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<AuthzDivision>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<AuthzDivision>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns which divisions the current user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<AuthzDivision>> getAuthorizationDivisionspermittedMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<AuthzDivision>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<AuthzDivision>> response = (ApiResponse<List<AuthzDivision>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<AuthzDivision>> response = (ApiResponse<List<AuthzDivision>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Returns which divisions the current user has the given permission in.
   * 
   * @param permission The permission string, including the object to access, e.g. routing:queue:view (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DivsPermittedEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DivsPermittedEntityListing getAuthorizationDivisionspermittedPagedMe(String permission, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getAuthorizationDivisionspermittedPagedMe(createGetAuthorizationDivisionspermittedPagedMeRequest(permission, pageNumber, pageSize));
  }

  /**
   * Returns which divisions the current user has the given permission in.
   * 
   * @param permission The permission string, including the object to access, e.g. routing:queue:view (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DivsPermittedEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DivsPermittedEntityListing> getAuthorizationDivisionspermittedPagedMeWithHttpInfo(String permission, Integer pageNumber, Integer pageSize) throws IOException {
    return getAuthorizationDivisionspermittedPagedMe(createGetAuthorizationDivisionspermittedPagedMeRequest(permission, pageNumber, pageSize).withHttpInfo());
  }

  private GetAuthorizationDivisionspermittedPagedMeRequest createGetAuthorizationDivisionspermittedPagedMeRequest(String permission, Integer pageNumber, Integer pageSize) {
    return GetAuthorizationDivisionspermittedPagedMeRequest.builder()
            .withPermission(permission)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Returns which divisions the current user has the given permission in.
   * 
   * @param request The request object
   * @return DivsPermittedEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DivsPermittedEntityListing getAuthorizationDivisionspermittedPagedMe(GetAuthorizationDivisionspermittedPagedMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DivsPermittedEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DivsPermittedEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns which divisions the current user has the given permission in.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DivsPermittedEntityListing> getAuthorizationDivisionspermittedPagedMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DivsPermittedEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DivsPermittedEntityListing> response = (ApiResponse<DivsPermittedEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DivsPermittedEntityListing> response = (ApiResponse<DivsPermittedEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Returns which divisions the specified user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param subjectId Subject ID (user or group) (required)
   * @param permission The permission string, including the object to access, e.g. routing:queue:view (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DivsPermittedEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DivsPermittedEntityListing getAuthorizationDivisionspermittedPagedSubjectId(String subjectId, String permission, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getAuthorizationDivisionspermittedPagedSubjectId(createGetAuthorizationDivisionspermittedPagedSubjectIdRequest(subjectId, permission, pageNumber, pageSize));
  }

  /**
   * Returns which divisions the specified user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param subjectId Subject ID (user or group) (required)
   * @param permission The permission string, including the object to access, e.g. routing:queue:view (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DivsPermittedEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DivsPermittedEntityListing> getAuthorizationDivisionspermittedPagedSubjectIdWithHttpInfo(String subjectId, String permission, Integer pageNumber, Integer pageSize) throws IOException {
    return getAuthorizationDivisionspermittedPagedSubjectId(createGetAuthorizationDivisionspermittedPagedSubjectIdRequest(subjectId, permission, pageNumber, pageSize).withHttpInfo());
  }

  private GetAuthorizationDivisionspermittedPagedSubjectIdRequest createGetAuthorizationDivisionspermittedPagedSubjectIdRequest(String subjectId, String permission, Integer pageNumber, Integer pageSize) {
    return GetAuthorizationDivisionspermittedPagedSubjectIdRequest.builder()
            .withSubjectId(subjectId)
    
            .withPermission(permission)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Returns which divisions the specified user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param request The request object
   * @return DivsPermittedEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DivsPermittedEntityListing getAuthorizationDivisionspermittedPagedSubjectId(GetAuthorizationDivisionspermittedPagedSubjectIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DivsPermittedEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DivsPermittedEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns which divisions the specified user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DivsPermittedEntityListing> getAuthorizationDivisionspermittedPagedSubjectId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DivsPermittedEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DivsPermittedEntityListing> response = (ApiResponse<DivsPermittedEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DivsPermittedEntityListing> response = (ApiResponse<DivsPermittedEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @return AuthzSubject
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzSubject getAuthorizationSubject(String subjectId) throws IOException, ApiException {
    return  getAuthorizationSubject(createGetAuthorizationSubjectRequest(subjectId));
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @return AuthzSubject
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzSubject> getAuthorizationSubjectWithHttpInfo(String subjectId) throws IOException {
    return getAuthorizationSubject(createGetAuthorizationSubjectRequest(subjectId).withHttpInfo());
  }

  private GetAuthorizationSubjectRequest createGetAuthorizationSubjectRequest(String subjectId) {
    return GetAuthorizationSubjectRequest.builder()
            .withSubjectId(subjectId)
    
            .build();
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param request The request object
   * @return AuthzSubject
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzSubject getAuthorizationSubject(GetAuthorizationSubjectRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzSubject> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzSubject>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzSubject> getAuthorizationSubject(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzSubject>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzSubject> response = (ApiResponse<AuthzSubject>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzSubject> response = (ApiResponse<AuthzSubject>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Returns a listing of roles and permissions for the currently authenticated user.
   * 
   * @return AuthzSubject
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzSubject getAuthorizationSubjectsMe() throws IOException, ApiException {
    return  getAuthorizationSubjectsMe(createGetAuthorizationSubjectsMeRequest());
  }

  /**
   * Returns a listing of roles and permissions for the currently authenticated user.
   * 
   * @return AuthzSubject
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzSubject> getAuthorizationSubjectsMeWithHttpInfo() throws IOException {
    return getAuthorizationSubjectsMe(createGetAuthorizationSubjectsMeRequest().withHttpInfo());
  }

  private GetAuthorizationSubjectsMeRequest createGetAuthorizationSubjectsMeRequest() {
    return GetAuthorizationSubjectsMeRequest.builder()
            .build();
  }

  /**
   * Returns a listing of roles and permissions for the currently authenticated user.
   * 
   * @param request The request object
   * @return AuthzSubject
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzSubject getAuthorizationSubjectsMe(GetAuthorizationSubjectsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzSubject> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzSubject>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns a listing of roles and permissions for the currently authenticated user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzSubject> getAuthorizationSubjectsMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzSubject>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzSubject> response = (ApiResponse<AuthzSubject>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzSubject> response = (ApiResponse<AuthzSubject>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Fetch field config for an entity type
   * 
   * @param type Field type (required)
   * @return FieldConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FieldConfig getFieldconfig(String type) throws IOException, ApiException {
    return  getFieldconfig(createGetFieldconfigRequest(type));
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param type Field type (required)
   * @return FieldConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FieldConfig> getFieldconfigWithHttpInfo(String type) throws IOException {
    return getFieldconfig(createGetFieldconfigRequest(type).withHttpInfo());
  }

  private GetFieldconfigRequest createGetFieldconfigRequest(String type) {
    return GetFieldconfigRequest.builder()
            .withType(type)
    
            .build();
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param request The request object
   * @return FieldConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FieldConfig getFieldconfig(GetFieldconfigRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FieldConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FieldConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FieldConfig> getFieldconfig(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FieldConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FieldConfig> response = (ApiResponse<FieldConfig>)(ApiResponse<?>)exception;
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
      ApiResponse<FieldConfig> response = (ApiResponse<FieldConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a user profile listing
   * This api is deprecated. User /api/v2/users
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param jid jid (optional)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @param integrationPresenceSource Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \&quot;expand\&quot;. (optional)
   * @return UserProfileEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserProfileEntityListing getProfilesUsers(Integer pageSize, Integer pageNumber, List<String> id, List<String> jid, String sortOrder, List<String> expand, String integrationPresenceSource) throws IOException, ApiException {
    return  getProfilesUsers(createGetProfilesUsersRequest(pageSize, pageNumber, id, jid, sortOrder, expand, integrationPresenceSource));
  }

  /**
   * Get a user profile listing
   * This api is deprecated. User /api/v2/users
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param jid jid (optional)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @param integrationPresenceSource Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \&quot;expand\&quot;. (optional)
   * @return UserProfileEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserProfileEntityListing> getProfilesUsersWithHttpInfo(Integer pageSize, Integer pageNumber, List<String> id, List<String> jid, String sortOrder, List<String> expand, String integrationPresenceSource) throws IOException {
    return getProfilesUsers(createGetProfilesUsersRequest(pageSize, pageNumber, id, jid, sortOrder, expand, integrationPresenceSource).withHttpInfo());
  }

  private GetProfilesUsersRequest createGetProfilesUsersRequest(Integer pageSize, Integer pageNumber, List<String> id, List<String> jid, String sortOrder, List<String> expand, String integrationPresenceSource) {
    return GetProfilesUsersRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withId(id)
    
            .withJid(jid)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .withIntegrationPresenceSource(integrationPresenceSource)
    
            .build();
  }

  /**
   * Get a user profile listing
   * This api is deprecated. User /api/v2/users
   * @param request The request object
   * @return UserProfileEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserProfileEntityListing getProfilesUsers(GetProfilesUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserProfileEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserProfileEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user profile listing
   * This api is deprecated. User /api/v2/users
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserProfileEntityListing> getProfilesUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserProfileEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserProfileEntityListing> response = (ApiResponse<UserProfileEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserProfileEntityListing> response = (ApiResponse<UserProfileEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the user&#39;s max utilization settings.  If not configured, the organization-wide default is returned.
   * 
   * @param userId User ID (required)
   * @return AgentMaxUtilization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentMaxUtilization getRoutingUserUtilization(String userId) throws IOException, ApiException {
    return  getRoutingUserUtilization(createGetRoutingUserUtilizationRequest(userId));
  }

  /**
   * Get the user&#39;s max utilization settings.  If not configured, the organization-wide default is returned.
   * 
   * @param userId User ID (required)
   * @return AgentMaxUtilization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentMaxUtilization> getRoutingUserUtilizationWithHttpInfo(String userId) throws IOException {
    return getRoutingUserUtilization(createGetRoutingUserUtilizationRequest(userId).withHttpInfo());
  }

  private GetRoutingUserUtilizationRequest createGetRoutingUserUtilizationRequest(String userId) {
    return GetRoutingUserUtilizationRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get the user&#39;s max utilization settings.  If not configured, the organization-wide default is returned.
   * 
   * @param request The request object
   * @return AgentMaxUtilization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentMaxUtilization getRoutingUserUtilization(GetRoutingUserUtilizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentMaxUtilization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentMaxUtilization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the user&#39;s max utilization settings.  If not configured, the organization-wide default is returned.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentMaxUtilization> getRoutingUserUtilization(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentMaxUtilization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentMaxUtilization> response = (ApiResponse<AgentMaxUtilization>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentMaxUtilization> response = (ApiResponse<AgentMaxUtilization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get user.
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param integrationPresenceSource Gets an integration presence for a user instead of their default. (optional)
   * @param state Search for a user with this state (optional, default to active)
   * @return User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public User getUser(String userId, List<String> expand, String integrationPresenceSource, String state) throws IOException, ApiException {
    return  getUser(createGetUserRequest(userId, expand, integrationPresenceSource, state));
  }

  /**
   * Get user.
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param integrationPresenceSource Gets an integration presence for a user instead of their default. (optional)
   * @param state Search for a user with this state (optional, default to active)
   * @return User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<User> getUserWithHttpInfo(String userId, List<String> expand, String integrationPresenceSource, String state) throws IOException {
    return getUser(createGetUserRequest(userId, expand, integrationPresenceSource, state).withHttpInfo());
  }

  private GetUserRequest createGetUserRequest(String userId, List<String> expand, String integrationPresenceSource, String state) {
    return GetUserRequest.builder()
            .withUserId(userId)
    
            .withExpand(expand)
    
            .withIntegrationPresenceSource(integrationPresenceSource)
    
            .withState(state)
    
            .build();
  }

  /**
   * Get user.
   * 
   * @param request The request object
   * @return User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public User getUser(GetUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<User> getUser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<User> response = (ApiResponse<User>)(ApiResponse<?>)exception;
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
      ApiResponse<User> response = (ApiResponse<User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get adjacents
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return Adjacents
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Adjacents getUserAdjacents(String userId, List<String> expand) throws IOException, ApiException {
    return  getUserAdjacents(createGetUserAdjacentsRequest(userId, expand));
  }

  /**
   * Get adjacents
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return Adjacents
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Adjacents> getUserAdjacentsWithHttpInfo(String userId, List<String> expand) throws IOException {
    return getUserAdjacents(createGetUserAdjacentsRequest(userId, expand).withHttpInfo());
  }

  private GetUserAdjacentsRequest createGetUserAdjacentsRequest(String userId, List<String> expand) {
    return GetUserAdjacentsRequest.builder()
            .withUserId(userId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get adjacents
   * 
   * @param request The request object
   * @return Adjacents
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Adjacents getUserAdjacents(GetUserAdjacentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Adjacents> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Adjacents>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get adjacents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Adjacents> getUserAdjacents(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Adjacents>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Adjacents> response = (ApiResponse<Adjacents>)(ApiResponse<?>)exception;
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
      ApiResponse<Adjacents> response = (ApiResponse<Adjacents>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @return CallForwarding
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallForwarding getUserCallforwarding(String userId) throws IOException, ApiException {
    return  getUserCallforwarding(createGetUserCallforwardingRequest(userId));
  }

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @return CallForwarding
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallForwarding> getUserCallforwardingWithHttpInfo(String userId) throws IOException {
    return getUserCallforwarding(createGetUserCallforwardingRequest(userId).withHttpInfo());
  }

  private GetUserCallforwardingRequest createGetUserCallforwardingRequest(String userId) {
    return GetUserCallforwardingRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @param request The request object
   * @return CallForwarding
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallForwarding getUserCallforwarding(GetUserCallforwardingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallForwarding> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallForwarding>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallForwarding> getUserCallforwarding(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallForwarding>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallForwarding> response = (ApiResponse<CallForwarding>)(ApiResponse<?>)exception;
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
      ApiResponse<CallForwarding> response = (ApiResponse<CallForwarding>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get direct reports
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return List<User>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<User> getUserDirectreports(String userId, List<String> expand) throws IOException, ApiException {
    return  getUserDirectreports(createGetUserDirectreportsRequest(userId, expand));
  }

  /**
   * Get direct reports
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return List<User>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<User>> getUserDirectreportsWithHttpInfo(String userId, List<String> expand) throws IOException {
    return getUserDirectreports(createGetUserDirectreportsRequest(userId, expand).withHttpInfo());
  }

  private GetUserDirectreportsRequest createGetUserDirectreportsRequest(String userId, List<String> expand) {
    return GetUserDirectreportsRequest.builder()
            .withUserId(userId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get direct reports
   * 
   * @param request The request object
   * @return List<User>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<User> getUserDirectreports(GetUserDirectreportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<User>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<User>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get direct reports
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<User>> getUserDirectreports(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<User>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<User>> response = (ApiResponse<List<User>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<User>> response = (ApiResponse<List<User>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Deprecated; will be revived with new contract
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getUserFavorites(String userId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException, ApiException {
    return  getUserFavorites(createGetUserFavoritesRequest(userId, pageSize, pageNumber, sortOrder, expand));
  }

  /**
   * Deprecated; will be revived with new contract
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getUserFavoritesWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException {
    return getUserFavorites(createGetUserFavoritesRequest(userId, pageSize, pageNumber, sortOrder, expand).withHttpInfo());
  }

  private GetUserFavoritesRequest createGetUserFavoritesRequest(String userId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) {
    return GetUserFavoritesRequest.builder()
            .withUserId(userId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Deprecated; will be revived with new contract
   * 
   * @param request The request object
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getUserFavorites(GetUserFavoritesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Deprecated; will be revived with new contract
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getUserFavorites(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserEntityListing> response = (ApiResponse<UserEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserEntityListing> response = (ApiResponse<UserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a user&#39;s Geolocation
   * 
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @return Geolocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Geolocation getUserGeolocation(String userId, String clientId) throws IOException, ApiException {
    return  getUserGeolocation(createGetUserGeolocationRequest(userId, clientId));
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @return Geolocation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Geolocation> getUserGeolocationWithHttpInfo(String userId, String clientId) throws IOException {
    return getUserGeolocation(createGetUserGeolocationRequest(userId, clientId).withHttpInfo());
  }

  private GetUserGeolocationRequest createGetUserGeolocationRequest(String userId, String clientId) {
    return GetUserGeolocationRequest.builder()
            .withUserId(userId)
    
            .withClientId(clientId)
    
            .build();
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param request The request object
   * @return Geolocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Geolocation getUserGeolocation(GetUserGeolocationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Geolocation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Geolocation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Geolocation> getUserGeolocation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Geolocation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Geolocation> response = (ApiResponse<Geolocation>)(ApiResponse<?>)exception;
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
      ApiResponse<Geolocation> response = (ApiResponse<Geolocation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a OutOfOffice
   * 
   * @param userId User ID (required)
   * @return OutOfOffice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutOfOffice getUserOutofoffice(String userId) throws IOException, ApiException {
    return  getUserOutofoffice(createGetUserOutofofficeRequest(userId));
  }

  /**
   * Get a OutOfOffice
   * 
   * @param userId User ID (required)
   * @return OutOfOffice
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutOfOffice> getUserOutofofficeWithHttpInfo(String userId) throws IOException {
    return getUserOutofoffice(createGetUserOutofofficeRequest(userId).withHttpInfo());
  }

  private GetUserOutofofficeRequest createGetUserOutofofficeRequest(String userId) {
    return GetUserOutofofficeRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get a OutOfOffice
   * 
   * @param request The request object
   * @return OutOfOffice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutOfOffice getUserOutofoffice(GetUserOutofofficeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutOfOffice> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutOfOffice>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a OutOfOffice
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutOfOffice> getUserOutofoffice(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutOfOffice>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutOfOffice> response = (ApiResponse<OutOfOffice>)(ApiResponse<?>)exception;
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
      ApiResponse<OutOfOffice> response = (ApiResponse<OutOfOffice>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get user profile
   * This api has been deprecated. Use api/v2/users instead
   * @param userId userId (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param integrationPresenceSource Gets an integration presence for a user instead of their default. (optional)
   * @return UserProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserProfile getUserProfile(String userId, List<String> expand, String integrationPresenceSource) throws IOException, ApiException {
    return  getUserProfile(createGetUserProfileRequest(userId, expand, integrationPresenceSource));
  }

  /**
   * Get user profile
   * This api has been deprecated. Use api/v2/users instead
   * @param userId userId (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param integrationPresenceSource Gets an integration presence for a user instead of their default. (optional)
   * @return UserProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserProfile> getUserProfileWithHttpInfo(String userId, List<String> expand, String integrationPresenceSource) throws IOException {
    return getUserProfile(createGetUserProfileRequest(userId, expand, integrationPresenceSource).withHttpInfo());
  }

  private GetUserProfileRequest createGetUserProfileRequest(String userId, List<String> expand, String integrationPresenceSource) {
    return GetUserProfileRequest.builder()
            .withUserId(userId)
    
            .withExpand(expand)
    
            .withIntegrationPresenceSource(integrationPresenceSource)
    
            .build();
  }

  /**
   * Get user profile
   * This api has been deprecated. Use api/v2/users instead
   * @param request The request object
   * @return UserProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserProfile getUserProfile(GetUserProfileRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserProfile> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserProfile>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get user profile
   * This api has been deprecated. Use api/v2/users instead
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserProfile> getUserProfile(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserProfile>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserProfile> response = (ApiResponse<UserProfile>)(ApiResponse<?>)exception;
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
      ApiResponse<UserProfile> response = (ApiResponse<UserProfile>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List profile skills for a user
   * 
   * @param userId User ID (required)
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getUserProfileskills(String userId) throws IOException, ApiException {
    return  getUserProfileskills(createGetUserProfileskillsRequest(userId));
  }

  /**
   * List profile skills for a user
   * 
   * @param userId User ID (required)
   * @return List<String>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getUserProfileskillsWithHttpInfo(String userId) throws IOException {
    return getUserProfileskills(createGetUserProfileskillsRequest(userId).withHttpInfo());
  }

  private GetUserProfileskillsRequest createGetUserProfileskillsRequest(String userId) {
    return GetUserProfileskillsRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * List profile skills for a user
   * 
   * @param request The request object
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getUserProfileskills(GetUserProfileskillsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<String>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<String>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List profile skills for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getUserProfileskills(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<String>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get queues for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param joined Is joined to the queue (optional, default to true)
   * @param divisionId Division ID(s) (optional)
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing getUserQueues(String userId, Integer pageSize, Integer pageNumber, Boolean joined, List<String> divisionId) throws IOException, ApiException {
    return  getUserQueues(createGetUserQueuesRequest(userId, pageSize, pageNumber, joined, divisionId));
  }

  /**
   * Get queues for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param joined Is joined to the queue (optional, default to true)
   * @param divisionId Division ID(s) (optional)
   * @return UserQueueEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> getUserQueuesWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, Boolean joined, List<String> divisionId) throws IOException {
    return getUserQueues(createGetUserQueuesRequest(userId, pageSize, pageNumber, joined, divisionId).withHttpInfo());
  }

  private GetUserQueuesRequest createGetUserQueuesRequest(String userId, Integer pageSize, Integer pageNumber, Boolean joined, List<String> divisionId) {
    return GetUserQueuesRequest.builder()
            .withUserId(userId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withJoined(joined)
    
            .withDivisionId(divisionId)
    
            .build();
  }

  /**
   * Get queues for user
   * 
   * @param request The request object
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing getUserQueues(GetUserQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserQueueEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserQueueEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get queues for user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> getUserQueues(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserQueueEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param userId User ID (required)
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization getUserRoles(String userId) throws IOException, ApiException {
    return  getUserRoles(createGetUserRolesRequest(userId));
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param userId User ID (required)
   * @return UserAuthorization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> getUserRolesWithHttpInfo(String userId) throws IOException {
    return getUserRoles(createGetUserRolesRequest(userId).withHttpInfo());
  }

  private GetUserRolesRequest createGetUserRolesRequest(String userId) {
    return GetUserRolesRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param request The request object
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization getUserRoles(GetUserRolesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserAuthorization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserAuthorization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> getUserRoles(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserAuthorization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserAuthorization> response = (ApiResponse<UserAuthorization>)(ApiResponse<?>)exception;
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
      ApiResponse<UserAuthorization> response = (ApiResponse<UserAuthorization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List routing language for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserLanguageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserLanguageEntityListing getUserRoutinglanguages(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return  getUserRoutinglanguages(createGetUserRoutinglanguagesRequest(userId, pageSize, pageNumber, sortOrder));
  }

  /**
   * List routing language for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserLanguageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserLanguageEntityListing> getUserRoutinglanguagesWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException {
    return getUserRoutinglanguages(createGetUserRoutinglanguagesRequest(userId, pageSize, pageNumber, sortOrder).withHttpInfo());
  }

  private GetUserRoutinglanguagesRequest createGetUserRoutinglanguagesRequest(String userId, Integer pageSize, Integer pageNumber, String sortOrder) {
    return GetUserRoutinglanguagesRequest.builder()
            .withUserId(userId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * List routing language for user
   * 
   * @param request The request object
   * @return UserLanguageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserLanguageEntityListing getUserRoutinglanguages(GetUserRoutinglanguagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserLanguageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserLanguageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List routing language for user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserLanguageEntityListing> getUserRoutinglanguages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserLanguageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserLanguageEntityListing> response = (ApiResponse<UserLanguageEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserLanguageEntityListing> response = (ApiResponse<UserLanguageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List routing skills for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing getUserRoutingskills(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return  getUserRoutingskills(createGetUserRoutingskillsRequest(userId, pageSize, pageNumber, sortOrder));
  }

  /**
   * List routing skills for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserSkillEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> getUserRoutingskillsWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException {
    return getUserRoutingskills(createGetUserRoutingskillsRequest(userId, pageSize, pageNumber, sortOrder).withHttpInfo());
  }

  private GetUserRoutingskillsRequest createGetUserRoutingskillsRequest(String userId, Integer pageSize, Integer pageNumber, String sortOrder) {
    return GetUserRoutingskillsRequest.builder()
            .withUserId(userId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * List routing skills for user
   * 
   * @param request The request object
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing getUserRoutingskills(GetUserRoutingskillsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserSkillEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserSkillEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List routing skills for user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> getUserRoutingskills(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserSkillEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Fetch the routing status of a user
   * 
   * @param userId User ID (required)
   * @return RoutingStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatus getUserRoutingstatus(String userId) throws IOException, ApiException {
    return  getUserRoutingstatus(createGetUserRoutingstatusRequest(userId));
  }

  /**
   * Fetch the routing status of a user
   * 
   * @param userId User ID (required)
   * @return RoutingStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatus> getUserRoutingstatusWithHttpInfo(String userId) throws IOException {
    return getUserRoutingstatus(createGetUserRoutingstatusRequest(userId).withHttpInfo());
  }

  private GetUserRoutingstatusRequest createGetUserRoutingstatusRequest(String userId) {
    return GetUserRoutingstatusRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Fetch the routing status of a user
   * 
   * @param request The request object
   * @return RoutingStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatus getUserRoutingstatus(GetUserRoutingstatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch the routing status of a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatus> getUserRoutingstatus(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingStatus> response = (ApiResponse<RoutingStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingStatus> response = (ApiResponse<RoutingStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get user state information.
   * 
   * @param userId User ID (required)
   * @return UserState
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserState getUserState(String userId) throws IOException, ApiException {
    return  getUserState(createGetUserStateRequest(userId));
  }

  /**
   * Get user state information.
   * 
   * @param userId User ID (required)
   * @return UserState
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserState> getUserStateWithHttpInfo(String userId) throws IOException {
    return getUserState(createGetUserStateRequest(userId).withHttpInfo());
  }

  private GetUserStateRequest createGetUserStateRequest(String userId) {
    return GetUserStateRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get user state information.
   * 
   * @param request The request object
   * @return UserState
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserState getUserState(GetUserStateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserState> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserState>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get user state information.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserState> getUserState(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserState>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserState> response = (ApiResponse<UserState>)(ApiResponse<?>)exception;
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
      ApiResponse<UserState> response = (ApiResponse<UserState>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get station information for user
   * 
   * @param userId User ID (required)
   * @return UserStations
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserStations getUserStation(String userId) throws IOException, ApiException {
    return  getUserStation(createGetUserStationRequest(userId));
  }

  /**
   * Get station information for user
   * 
   * @param userId User ID (required)
   * @return UserStations
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserStations> getUserStationWithHttpInfo(String userId) throws IOException {
    return getUserStation(createGetUserStationRequest(userId).withHttpInfo());
  }

  private GetUserStationRequest createGetUserStationRequest(String userId) {
    return GetUserStationRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get station information for user
   * 
   * @param request The request object
   * @return UserStations
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserStations getUserStation(GetUserStationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserStations> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserStations>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get station information for user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserStations> getUserStation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserStations>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserStations> response = (ApiResponse<UserStations>)(ApiResponse<?>)exception;
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
      ApiResponse<UserStations> response = (ApiResponse<UserStations>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get superiors
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return List<User>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<User> getUserSuperiors(String userId, List<String> expand) throws IOException, ApiException {
    return  getUserSuperiors(createGetUserSuperiorsRequest(userId, expand));
  }

  /**
   * Get superiors
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return List<User>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<User>> getUserSuperiorsWithHttpInfo(String userId, List<String> expand) throws IOException {
    return getUserSuperiors(createGetUserSuperiorsRequest(userId, expand).withHttpInfo());
  }

  private GetUserSuperiorsRequest createGetUserSuperiorsRequest(String userId, List<String> expand) {
    return GetUserSuperiorsRequest.builder()
            .withUserId(userId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get superiors
   * 
   * @param request The request object
   * @return List<User>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<User> getUserSuperiors(GetUserSuperiorsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<User>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<User>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get superiors
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<User>> getUserSuperiors(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<User>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<User>> response = (ApiResponse<List<User>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<User>> response = (ApiResponse<List<User>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List the organizations that have authorized/trusted the user.
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TrustorEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustorEntityListing getUserTrustors(String userId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getUserTrustors(createGetUserTrustorsRequest(userId, pageSize, pageNumber));
  }

  /**
   * List the organizations that have authorized/trusted the user.
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TrustorEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustorEntityListing> getUserTrustorsWithHttpInfo(String userId, Integer pageSize, Integer pageNumber) throws IOException {
    return getUserTrustors(createGetUserTrustorsRequest(userId, pageSize, pageNumber).withHttpInfo());
  }

  private GetUserTrustorsRequest createGetUserTrustorsRequest(String userId, Integer pageSize, Integer pageNumber) {
    return GetUserTrustorsRequest.builder()
            .withUserId(userId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * List the organizations that have authorized/trusted the user.
   * 
   * @param request The request object
   * @return TrustorEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustorEntityListing getUserTrustors(GetUserTrustorsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrustorEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrustorEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List the organizations that have authorized/trusted the user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustorEntityListing> getUserTrustors(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrustorEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrustorEntityListing> response = (ApiResponse<TrustorEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TrustorEntityListing> response = (ApiResponse<TrustorEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of available users.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id A list of user IDs to fetch by bulk (optional)
   * @param jabberId A list of jabberIds to fetch by bulk (cannot be used with the \&quot;id\&quot; parameter) (optional)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @param integrationPresenceSource Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \&quot;expand\&quot;. When using this parameter the maximum number of users that can be returned is 100. (optional)
   * @param state Only list users of this state (optional, default to active)
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getUsers(Integer pageSize, Integer pageNumber, List<String> id, List<String> jabberId, String sortOrder, List<String> expand, String integrationPresenceSource, String state) throws IOException, ApiException {
    return  getUsers(createGetUsersRequest(pageSize, pageNumber, id, jabberId, sortOrder, expand, integrationPresenceSource, state));
  }

  /**
   * Get the list of available users.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id A list of user IDs to fetch by bulk (optional)
   * @param jabberId A list of jabberIds to fetch by bulk (cannot be used with the \&quot;id\&quot; parameter) (optional)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @param integrationPresenceSource Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \&quot;expand\&quot;. When using this parameter the maximum number of users that can be returned is 100. (optional)
   * @param state Only list users of this state (optional, default to active)
   * @return UserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getUsersWithHttpInfo(Integer pageSize, Integer pageNumber, List<String> id, List<String> jabberId, String sortOrder, List<String> expand, String integrationPresenceSource, String state) throws IOException {
    return getUsers(createGetUsersRequest(pageSize, pageNumber, id, jabberId, sortOrder, expand, integrationPresenceSource, state).withHttpInfo());
  }

  private GetUsersRequest createGetUsersRequest(Integer pageSize, Integer pageNumber, List<String> id, List<String> jabberId, String sortOrder, List<String> expand, String integrationPresenceSource, String state) {
    return GetUsersRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withId(id)
    
            .withJabberId(jabberId)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .withIntegrationPresenceSource(integrationPresenceSource)
    
            .withState(state)
    
            .build();
  }

  /**
   * Get the list of available users.
   * 
   * @param request The request object
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getUsers(GetUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of available users.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserEntityListing> response = (ApiResponse<UserEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserEntityListing> response = (ApiResponse<UserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of Development Activities
   * Either moduleId or userId is required. Results are filtered based on the applicable permissions.
   * @param userId Specifies the list of user IDs to be queried, up to 100 user IDs. It searches for any relationship for the userId. (optional)
   * @param moduleId Specifies the ID of the learning module. (optional)
   * @param interval Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param completionInterval Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param types Specifies the activity types. (optional)
   * @param statuses Specifies the activity statuses to filter by (optional)
   * @param relationship Specifies how the current user relation should be interpreted, and filters the activities returned to only the activities that have the specified relationship. If a value besides Attendee is specified, it will only return Coaching Appointments. If not specified, no filtering is applied. (optional)
   * @return DevelopmentActivityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivityListing getUsersDevelopmentActivities(List<String> userId, String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String sortOrder, List<String> types, List<String> statuses, List<String> relationship) throws IOException, ApiException {
    return  getUsersDevelopmentActivities(createGetUsersDevelopmentActivitiesRequest(userId, moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship));
  }

  /**
   * Get list of Development Activities
   * Either moduleId or userId is required. Results are filtered based on the applicable permissions.
   * @param userId Specifies the list of user IDs to be queried, up to 100 user IDs. It searches for any relationship for the userId. (optional)
   * @param moduleId Specifies the ID of the learning module. (optional)
   * @param interval Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param completionInterval Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param types Specifies the activity types. (optional)
   * @param statuses Specifies the activity statuses to filter by (optional)
   * @param relationship Specifies how the current user relation should be interpreted, and filters the activities returned to only the activities that have the specified relationship. If a value besides Attendee is specified, it will only return Coaching Appointments. If not specified, no filtering is applied. (optional)
   * @return DevelopmentActivityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivityListing> getUsersDevelopmentActivitiesWithHttpInfo(List<String> userId, String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String sortOrder, List<String> types, List<String> statuses, List<String> relationship) throws IOException {
    return getUsersDevelopmentActivities(createGetUsersDevelopmentActivitiesRequest(userId, moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship).withHttpInfo());
  }

  private GetUsersDevelopmentActivitiesRequest createGetUsersDevelopmentActivitiesRequest(List<String> userId, String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String sortOrder, List<String> types, List<String> statuses, List<String> relationship) {
    return GetUsersDevelopmentActivitiesRequest.builder()
            .withUserId(userId)
    
            .withModuleId(moduleId)
    
            .withInterval(interval)
    
            .withCompletionInterval(completionInterval)
    
            .withOverdue(overdue)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .withTypes(types)
    
            .withStatuses(statuses)
    
            .withRelationship(relationship)
    
            .build();
  }

  /**
   * Get list of Development Activities
   * Either moduleId or userId is required. Results are filtered based on the applicable permissions.
   * @param request The request object
   * @return DevelopmentActivityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivityListing getUsersDevelopmentActivities(GetUsersDevelopmentActivitiesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DevelopmentActivityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DevelopmentActivityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of Development Activities
   * Either moduleId or userId is required. Results are filtered based on the applicable permissions.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivityListing> getUsersDevelopmentActivities(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DevelopmentActivityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DevelopmentActivityListing> response = (ApiResponse<DevelopmentActivityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DevelopmentActivityListing> response = (ApiResponse<DevelopmentActivityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of Development Activities for current user
   * Results are filtered based on the applicable permissions.
   * @param moduleId Specifies the ID of the learning module. (optional)
   * @param interval Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param completionInterval Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param types Specifies the activity types. (optional)
   * @param statuses Specifies the activity statuses to filter by (optional)
   * @param relationship Specifies how the current user relation should be interpreted, and filters the activities returned to only the activities that have the specified relationship. If a value besides Attendee is specified, it will only return Coaching Appointments. If not specified, no filtering is applied. (optional)
   * @return DevelopmentActivityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivityListing getUsersDevelopmentActivitiesMe(String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String sortOrder, List<String> types, List<String> statuses, List<String> relationship) throws IOException, ApiException {
    return  getUsersDevelopmentActivitiesMe(createGetUsersDevelopmentActivitiesMeRequest(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship));
  }

  /**
   * Get list of Development Activities for current user
   * Results are filtered based on the applicable permissions.
   * @param moduleId Specifies the ID of the learning module. (optional)
   * @param interval Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param completionInterval Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param types Specifies the activity types. (optional)
   * @param statuses Specifies the activity statuses to filter by (optional)
   * @param relationship Specifies how the current user relation should be interpreted, and filters the activities returned to only the activities that have the specified relationship. If a value besides Attendee is specified, it will only return Coaching Appointments. If not specified, no filtering is applied. (optional)
   * @return DevelopmentActivityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivityListing> getUsersDevelopmentActivitiesMeWithHttpInfo(String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String sortOrder, List<String> types, List<String> statuses, List<String> relationship) throws IOException {
    return getUsersDevelopmentActivitiesMe(createGetUsersDevelopmentActivitiesMeRequest(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship).withHttpInfo());
  }

  private GetUsersDevelopmentActivitiesMeRequest createGetUsersDevelopmentActivitiesMeRequest(String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String sortOrder, List<String> types, List<String> statuses, List<String> relationship) {
    return GetUsersDevelopmentActivitiesMeRequest.builder()
            .withModuleId(moduleId)
    
            .withInterval(interval)
    
            .withCompletionInterval(completionInterval)
    
            .withOverdue(overdue)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .withTypes(types)
    
            .withStatuses(statuses)
    
            .withRelationship(relationship)
    
            .build();
  }

  /**
   * Get list of Development Activities for current user
   * Results are filtered based on the applicable permissions.
   * @param request The request object
   * @return DevelopmentActivityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivityListing getUsersDevelopmentActivitiesMe(GetUsersDevelopmentActivitiesMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DevelopmentActivityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DevelopmentActivityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of Development Activities for current user
   * Results are filtered based on the applicable permissions.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivityListing> getUsersDevelopmentActivitiesMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DevelopmentActivityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DevelopmentActivityListing> response = (ApiResponse<DevelopmentActivityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DevelopmentActivityListing> response = (ApiResponse<DevelopmentActivityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Development Activity
   * Permission not required if you are the attendee, creator or facilitator of the coaching appointment or you are the assigned user of the learning assignment.
   * @param activityId Specifies the activity ID, maps to either assignment or appointment ID (required)
   * @param type Specifies the activity type. (required)
   * @return DevelopmentActivity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivity getUsersDevelopmentActivity(String activityId, String type) throws IOException, ApiException {
    return  getUsersDevelopmentActivity(createGetUsersDevelopmentActivityRequest(activityId, type));
  }

  /**
   * Get a Development Activity
   * Permission not required if you are the attendee, creator or facilitator of the coaching appointment or you are the assigned user of the learning assignment.
   * @param activityId Specifies the activity ID, maps to either assignment or appointment ID (required)
   * @param type Specifies the activity type. (required)
   * @return DevelopmentActivity
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivity> getUsersDevelopmentActivityWithHttpInfo(String activityId, String type) throws IOException {
    return getUsersDevelopmentActivity(createGetUsersDevelopmentActivityRequest(activityId, type).withHttpInfo());
  }

  private GetUsersDevelopmentActivityRequest createGetUsersDevelopmentActivityRequest(String activityId, String type) {
    return GetUsersDevelopmentActivityRequest.builder()
            .withActivityId(activityId)
    
            .withType(type)
    
            .build();
  }

  /**
   * Get a Development Activity
   * Permission not required if you are the attendee, creator or facilitator of the coaching appointment or you are the assigned user of the learning assignment.
   * @param request The request object
   * @return DevelopmentActivity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivity getUsersDevelopmentActivity(GetUsersDevelopmentActivityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DevelopmentActivity> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DevelopmentActivity>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Development Activity
   * Permission not required if you are the attendee, creator or facilitator of the coaching appointment or you are the assigned user of the learning assignment.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivity> getUsersDevelopmentActivity(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DevelopmentActivity>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DevelopmentActivity> response = (ApiResponse<DevelopmentActivity>)(ApiResponse<?>)exception;
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
      ApiResponse<DevelopmentActivity> response = (ApiResponse<DevelopmentActivity>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @param expand Which fields, if any, to expand. (optional)
   * @param integrationPresenceSource Get your presence for a given integration. This parameter will only be used when presence is provided as an \&quot;expand\&quot;. (optional)
   * @return UserMe
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserMe getUsersMe(List<String> expand, String integrationPresenceSource) throws IOException, ApiException {
    return  getUsersMe(createGetUsersMeRequest(expand, integrationPresenceSource));
  }

  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @param expand Which fields, if any, to expand. (optional)
   * @param integrationPresenceSource Get your presence for a given integration. This parameter will only be used when presence is provided as an \&quot;expand\&quot;. (optional)
   * @return UserMe
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserMe> getUsersMeWithHttpInfo(List<String> expand, String integrationPresenceSource) throws IOException {
    return getUsersMe(createGetUsersMeRequest(expand, integrationPresenceSource).withHttpInfo());
  }

  private GetUsersMeRequest createGetUsersMeRequest(List<String> expand, String integrationPresenceSource) {
    return GetUsersMeRequest.builder()
            .withExpand(expand)
    
            .withIntegrationPresenceSource(integrationPresenceSource)
    
            .build();
  }

  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @param request The request object
   * @return UserMe
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserMe getUsersMe(GetUsersMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserMe> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserMe>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserMe> getUsersMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserMe>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserMe> response = (ApiResponse<UserMe>)(ApiResponse<?>)exception;
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
      ApiResponse<UserMe> response = (ApiResponse<UserMe>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @param integrationPresenceSource integrationPresenceSource (optional)
   * @return UsersSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersSearchResponse getUsersSearch(String q64, List<String> expand, String integrationPresenceSource) throws IOException, ApiException {
    return  getUsersSearch(createGetUsersSearchRequest(q64, expand, integrationPresenceSource));
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @param integrationPresenceSource integrationPresenceSource (optional)
   * @return UsersSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersSearchResponse> getUsersSearchWithHttpInfo(String q64, List<String> expand, String integrationPresenceSource) throws IOException {
    return getUsersSearch(createGetUsersSearchRequest(q64, expand, integrationPresenceSource).withHttpInfo());
  }

  private GetUsersSearchRequest createGetUsersSearchRequest(String q64, List<String> expand, String integrationPresenceSource) {
    return GetUsersSearchRequest.builder()
            .withQ64(q64)
    
            .withExpand(expand)
    
            .withIntegrationPresenceSource(integrationPresenceSource)
    
            .build();
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return UsersSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersSearchResponse getUsersSearch(GetUsersSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersSearchResponse> getUsersSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update user
   * 
   * @param userId User ID (required)
   * @param body User (required)
   * @return User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public User patchUser(String userId, UpdateUser body) throws IOException, ApiException {
    return  patchUser(createPatchUserRequest(userId, body));
  }

  /**
   * Update user
   * 
   * @param userId User ID (required)
   * @param body User (required)
   * @return User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<User> patchUserWithHttpInfo(String userId, UpdateUser body) throws IOException {
    return patchUser(createPatchUserRequest(userId, body).withHttpInfo());
  }

  private PatchUserRequest createPatchUserRequest(String userId, UpdateUser body) {
    return PatchUserRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update user
   * 
   * @param request The request object
   * @return User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public User patchUser(PatchUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<User> patchUser(ApiRequest<UpdateUser> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<User> response = (ApiResponse<User>)(ApiResponse<?>)exception;
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
      ApiResponse<User> response = (ApiResponse<User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return CallForwarding
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallForwarding patchUserCallforwarding(String userId, CallForwarding body) throws IOException, ApiException {
    return  patchUserCallforwarding(createPatchUserCallforwardingRequest(userId, body));
  }

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return CallForwarding
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallForwarding> patchUserCallforwardingWithHttpInfo(String userId, CallForwarding body) throws IOException {
    return patchUserCallforwarding(createPatchUserCallforwardingRequest(userId, body).withHttpInfo());
  }

  private PatchUserCallforwardingRequest createPatchUserCallforwardingRequest(String userId, CallForwarding body) {
    return PatchUserCallforwardingRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @param request The request object
   * @return CallForwarding
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallForwarding patchUserCallforwarding(PatchUserCallforwardingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallForwarding> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallForwarding>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallForwarding> patchUserCallforwarding(ApiRequest<CallForwarding> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallForwarding>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallForwarding> response = (ApiResponse<CallForwarding>)(ApiResponse<?>)exception;
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
      ApiResponse<CallForwarding> response = (ApiResponse<CallForwarding>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @param body Geolocation (required)
   * @return Geolocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Geolocation patchUserGeolocation(String userId, String clientId, Geolocation body) throws IOException, ApiException {
    return  patchUserGeolocation(createPatchUserGeolocationRequest(userId, clientId, body));
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @param body Geolocation (required)
   * @return Geolocation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Geolocation> patchUserGeolocationWithHttpInfo(String userId, String clientId, Geolocation body) throws IOException {
    return patchUserGeolocation(createPatchUserGeolocationRequest(userId, clientId, body).withHttpInfo());
  }

  private PatchUserGeolocationRequest createPatchUserGeolocationRequest(String userId, String clientId, Geolocation body) {
    return PatchUserGeolocationRequest.builder()
            .withUserId(userId)
    
            .withClientId(clientId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param request The request object
   * @return Geolocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Geolocation patchUserGeolocation(PatchUserGeolocationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Geolocation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Geolocation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Geolocation> patchUserGeolocation(ApiRequest<Geolocation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Geolocation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Geolocation> response = (ApiResponse<Geolocation>)(ApiResponse<?>)exception;
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
      ApiResponse<Geolocation> response = (ApiResponse<Geolocation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Join or unjoin a queue for a user
   * 
   * @param queueId Queue ID (required)
   * @param userId User ID (required)
   * @param body Queue Member (required)
   * @return UserQueue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueue patchUserQueue(String queueId, String userId, UserQueue body) throws IOException, ApiException {
    return  patchUserQueue(createPatchUserQueueRequest(queueId, userId, body));
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @param queueId Queue ID (required)
   * @param userId User ID (required)
   * @param body Queue Member (required)
   * @return UserQueue
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueue> patchUserQueueWithHttpInfo(String queueId, String userId, UserQueue body) throws IOException {
    return patchUserQueue(createPatchUserQueueRequest(queueId, userId, body).withHttpInfo());
  }

  private PatchUserQueueRequest createPatchUserQueueRequest(String queueId, String userId, UserQueue body) {
    return PatchUserQueueRequest.builder()
            .withQueueId(queueId)
    
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @param request The request object
   * @return UserQueue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueue patchUserQueue(PatchUserQueueRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserQueue> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserQueue>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueue> patchUserQueue(ApiRequest<UserQueue> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserQueue>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserQueue> response = (ApiResponse<UserQueue>)(ApiResponse<?>)exception;
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
      ApiResponse<UserQueue> response = (ApiResponse<UserQueue>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param userId User ID (required)
   * @param body User Queues (required)
   * @param divisionId Division ID(s) (optional)
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing patchUserQueues(String userId, List<UserQueue> body, List<String> divisionId) throws IOException, ApiException {
    return  patchUserQueues(createPatchUserQueuesRequest(userId, body, divisionId));
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param userId User ID (required)
   * @param body User Queues (required)
   * @param divisionId Division ID(s) (optional)
   * @return UserQueueEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> patchUserQueuesWithHttpInfo(String userId, List<UserQueue> body, List<String> divisionId) throws IOException {
    return patchUserQueues(createPatchUserQueuesRequest(userId, body, divisionId).withHttpInfo());
  }

  private PatchUserQueuesRequest createPatchUserQueuesRequest(String userId, List<UserQueue> body, List<String> divisionId) {
    return PatchUserQueuesRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .withDivisionId(divisionId)
    
            .build();
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param request The request object
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing patchUserQueues(PatchUserQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserQueueEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserQueueEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> patchUserQueues(ApiRequest<List<UserQueue>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserQueueEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update routing language proficiency or state.
   * 
   * @param userId User ID (required)
   * @param languageId languageId (required)
   * @param body Language (required)
   * @return UserRoutingLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingLanguage patchUserRoutinglanguage(String userId, String languageId, UserRoutingLanguage body) throws IOException, ApiException {
    return  patchUserRoutinglanguage(createPatchUserRoutinglanguageRequest(userId, languageId, body));
  }

  /**
   * Update routing language proficiency or state.
   * 
   * @param userId User ID (required)
   * @param languageId languageId (required)
   * @param body Language (required)
   * @return UserRoutingLanguage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingLanguage> patchUserRoutinglanguageWithHttpInfo(String userId, String languageId, UserRoutingLanguage body) throws IOException {
    return patchUserRoutinglanguage(createPatchUserRoutinglanguageRequest(userId, languageId, body).withHttpInfo());
  }

  private PatchUserRoutinglanguageRequest createPatchUserRoutinglanguageRequest(String userId, String languageId, UserRoutingLanguage body) {
    return PatchUserRoutinglanguageRequest.builder()
            .withUserId(userId)
    
            .withLanguageId(languageId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update routing language proficiency or state.
   * 
   * @param request The request object
   * @return UserRoutingLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingLanguage patchUserRoutinglanguage(PatchUserRoutinglanguageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserRoutingLanguage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserRoutingLanguage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update routing language proficiency or state.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingLanguage> patchUserRoutinglanguage(ApiRequest<UserRoutingLanguage> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserRoutingLanguage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserRoutingLanguage> response = (ApiResponse<UserRoutingLanguage>)(ApiResponse<?>)exception;
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
      ApiResponse<UserRoutingLanguage> response = (ApiResponse<UserRoutingLanguage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add bulk routing language to user. Max limit 50 languages
   * 
   * @param userId User ID (required)
   * @param body Language (required)
   * @return UserLanguageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserLanguageEntityListing patchUserRoutinglanguagesBulk(String userId, List<UserRoutingLanguagePost> body) throws IOException, ApiException {
    return  patchUserRoutinglanguagesBulk(createPatchUserRoutinglanguagesBulkRequest(userId, body));
  }

  /**
   * Add bulk routing language to user. Max limit 50 languages
   * 
   * @param userId User ID (required)
   * @param body Language (required)
   * @return UserLanguageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserLanguageEntityListing> patchUserRoutinglanguagesBulkWithHttpInfo(String userId, List<UserRoutingLanguagePost> body) throws IOException {
    return patchUserRoutinglanguagesBulk(createPatchUserRoutinglanguagesBulkRequest(userId, body).withHttpInfo());
  }

  private PatchUserRoutinglanguagesBulkRequest createPatchUserRoutinglanguagesBulkRequest(String userId, List<UserRoutingLanguagePost> body) {
    return PatchUserRoutinglanguagesBulkRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add bulk routing language to user. Max limit 50 languages
   * 
   * @param request The request object
   * @return UserLanguageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserLanguageEntityListing patchUserRoutinglanguagesBulk(PatchUserRoutinglanguagesBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserLanguageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserLanguageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add bulk routing language to user. Max limit 50 languages
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserLanguageEntityListing> patchUserRoutinglanguagesBulk(ApiRequest<List<UserRoutingLanguagePost>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserLanguageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserLanguageEntityListing> response = (ApiResponse<UserLanguageEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserLanguageEntityListing> response = (ApiResponse<UserLanguageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk add routing skills to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing patchUserRoutingskillsBulk(String userId, List<UserRoutingSkillPost> body) throws IOException, ApiException {
    return  patchUserRoutingskillsBulk(createPatchUserRoutingskillsBulkRequest(userId, body));
  }

  /**
   * Bulk add routing skills to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserSkillEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> patchUserRoutingskillsBulkWithHttpInfo(String userId, List<UserRoutingSkillPost> body) throws IOException {
    return patchUserRoutingskillsBulk(createPatchUserRoutingskillsBulkRequest(userId, body).withHttpInfo());
  }

  private PatchUserRoutingskillsBulkRequest createPatchUserRoutingskillsBulkRequest(String userId, List<UserRoutingSkillPost> body) {
    return PatchUserRoutingskillsBulkRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk add routing skills to user
   * 
   * @param request The request object
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing patchUserRoutingskillsBulk(PatchUserRoutingskillsBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserSkillEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserSkillEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk add routing skills to user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> patchUserRoutingskillsBulk(ApiRequest<List<UserRoutingSkillPost>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserSkillEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update bulk acd autoanswer on users
   * 
   * @param body Users (required)
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing patchUsersBulk(List<PatchUser> body) throws IOException, ApiException {
    return  patchUsersBulk(createPatchUsersBulkRequest(body));
  }

  /**
   * Update bulk acd autoanswer on users
   * 
   * @param body Users (required)
   * @return UserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> patchUsersBulkWithHttpInfo(List<PatchUser> body) throws IOException {
    return patchUsersBulk(createPatchUsersBulkRequest(body).withHttpInfo());
  }

  private PatchUsersBulkRequest createPatchUsersBulkRequest(List<PatchUser> body) {
    return PatchUsersBulkRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update bulk acd autoanswer on users
   * 
   * @param request The request object
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing patchUsersBulk(PatchUsersBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update bulk acd autoanswer on users
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> patchUsersBulk(ApiRequest<List<PatchUser>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserEntityListing> response = (ApiResponse<UserEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserEntityListing> response = (ApiResponse<UserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return UserAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAggregateQueryResponse postAnalyticsUsersAggregatesQuery(UserAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersAggregatesQuery(createPostAnalyticsUsersAggregatesQueryRequest(body));
  }

  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return UserAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAggregateQueryResponse> postAnalyticsUsersAggregatesQueryWithHttpInfo(UserAggregationQuery body) throws IOException {
    return postAnalyticsUsersAggregatesQuery(createPostAnalyticsUsersAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersAggregatesQueryRequest createPostAnalyticsUsersAggregatesQueryRequest(UserAggregationQuery body) {
    return PostAnalyticsUsersAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for user aggregates
   * 
   * @param request The request object
   * @return UserAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAggregateQueryResponse postAnalyticsUsersAggregatesQuery(PostAnalyticsUsersAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAggregateQueryResponse> postAnalyticsUsersAggregatesQuery(ApiRequest<UserAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserAggregateQueryResponse> response = (ApiResponse<UserAggregateQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UserAggregateQueryResponse> response = (ApiResponse<UserAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for user details asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsUsersDetailsJobs(AsyncUserDetailsQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersDetailsJobs(createPostAnalyticsUsersDetailsJobsRequest(body));
  }

  /**
   * Query for user details asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsUsersDetailsJobsWithHttpInfo(AsyncUserDetailsQuery body) throws IOException {
    return postAnalyticsUsersDetailsJobs(createPostAnalyticsUsersDetailsJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersDetailsJobsRequest createPostAnalyticsUsersDetailsJobsRequest(AsyncUserDetailsQuery body) {
    return PostAnalyticsUsersDetailsJobsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for user details asynchronously
   * 
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsUsersDetailsJobs(PostAnalyticsUsersDetailsJobsRequest request) throws IOException, ApiException {
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
   * Query for user details asynchronously
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsUsersDetailsJobs(ApiRequest<AsyncUserDetailsQuery> request) throws IOException {
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
   * Query for user details
   * 
   * @param body query (required)
   * @return AnalyticsUserDetailsQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsUserDetailsQueryResponse postAnalyticsUsersDetailsQuery(UserDetailsQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersDetailsQuery(createPostAnalyticsUsersDetailsQueryRequest(body));
  }

  /**
   * Query for user details
   * 
   * @param body query (required)
   * @return AnalyticsUserDetailsQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQueryWithHttpInfo(UserDetailsQuery body) throws IOException {
    return postAnalyticsUsersDetailsQuery(createPostAnalyticsUsersDetailsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersDetailsQueryRequest createPostAnalyticsUsersDetailsQueryRequest(UserDetailsQuery body) {
    return PostAnalyticsUsersDetailsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for user details
   * 
   * @param request The request object
   * @return AnalyticsUserDetailsQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsUserDetailsQueryResponse postAnalyticsUsersDetailsQuery(PostAnalyticsUsersDetailsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsUserDetailsQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user details
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQuery(ApiRequest<UserDetailsQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsUserDetailsQueryResponse> response = (ApiResponse<AnalyticsUserDetailsQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AnalyticsUserDetailsQueryResponse> response = (ApiResponse<AnalyticsUserDetailsQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return UserObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserObservationQueryResponse postAnalyticsUsersObservationsQuery(UserObservationQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersObservationsQuery(createPostAnalyticsUsersObservationsQueryRequest(body));
  }

  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return UserObservationQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserObservationQueryResponse> postAnalyticsUsersObservationsQueryWithHttpInfo(UserObservationQuery body) throws IOException {
    return postAnalyticsUsersObservationsQuery(createPostAnalyticsUsersObservationsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersObservationsQueryRequest createPostAnalyticsUsersObservationsQueryRequest(UserObservationQuery body) {
    return PostAnalyticsUsersObservationsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for user observations
   * 
   * @param request The request object
   * @return UserObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserObservationQueryResponse postAnalyticsUsersObservationsQuery(PostAnalyticsUsersObservationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserObservationQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserObservationQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user observations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserObservationQueryResponse> postAnalyticsUsersObservationsQuery(ApiRequest<UserObservationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserObservationQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserObservationQueryResponse> response = (ApiResponse<UserObservationQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UserObservationQueryResponse> response = (ApiResponse<UserObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk-grant roles and divisions to a subject.
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param body Pairs of role and division IDs (required)
   * @param subjectType what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) (optional, default to PC_USER)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectBulkadd(String subjectId, RoleDivisionGrants body, String subjectType) throws IOException, ApiException {
     postAuthorizationSubjectBulkadd(createPostAuthorizationSubjectBulkaddRequest(subjectId, body, subjectType));
  }

  /**
   * Bulk-grant roles and divisions to a subject.
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param body Pairs of role and division IDs (required)
   * @param subjectType what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) (optional, default to PC_USER)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectBulkaddWithHttpInfo(String subjectId, RoleDivisionGrants body, String subjectType) throws IOException {
    return postAuthorizationSubjectBulkadd(createPostAuthorizationSubjectBulkaddRequest(subjectId, body, subjectType).withHttpInfo());
  }

  private PostAuthorizationSubjectBulkaddRequest createPostAuthorizationSubjectBulkaddRequest(String subjectId, RoleDivisionGrants body, String subjectType) {
    return PostAuthorizationSubjectBulkaddRequest.builder()
            .withSubjectId(subjectId)
    
            .withBody(body)
    
            .withSubjectType(subjectType)
    
            .build();
  }

  /**
   * Bulk-grant roles and divisions to a subject.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectBulkadd(PostAuthorizationSubjectBulkaddRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Bulk-grant roles and divisions to a subject.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectBulkadd(ApiRequest<RoleDivisionGrants> request) throws IOException {
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
   * Bulk-remove grants from a subject.
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param body Pairs of role and division IDs (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectBulkremove(String subjectId, RoleDivisionGrants body) throws IOException, ApiException {
     postAuthorizationSubjectBulkremove(createPostAuthorizationSubjectBulkremoveRequest(subjectId, body));
  }

  /**
   * Bulk-remove grants from a subject.
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param body Pairs of role and division IDs (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectBulkremoveWithHttpInfo(String subjectId, RoleDivisionGrants body) throws IOException {
    return postAuthorizationSubjectBulkremove(createPostAuthorizationSubjectBulkremoveRequest(subjectId, body).withHttpInfo());
  }

  private PostAuthorizationSubjectBulkremoveRequest createPostAuthorizationSubjectBulkremoveRequest(String subjectId, RoleDivisionGrants body) {
    return PostAuthorizationSubjectBulkremoveRequest.builder()
            .withSubjectId(subjectId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk-remove grants from a subject.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectBulkremove(PostAuthorizationSubjectBulkremoveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Bulk-remove grants from a subject.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectBulkremove(ApiRequest<RoleDivisionGrants> request) throws IOException {
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
   * Replace subject&#39;s roles and divisions with the exact list supplied in the request.
   * This operation will not remove grants that are inherited from group membership. It will only set the grants directly applied to the subject.
   * @param subjectId Subject ID (user or group) (required)
   * @param body Pairs of role and division IDs (required)
   * @param subjectType what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) (optional, default to PC_USER)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectBulkreplace(String subjectId, RoleDivisionGrants body, String subjectType) throws IOException, ApiException {
     postAuthorizationSubjectBulkreplace(createPostAuthorizationSubjectBulkreplaceRequest(subjectId, body, subjectType));
  }

  /**
   * Replace subject&#39;s roles and divisions with the exact list supplied in the request.
   * This operation will not remove grants that are inherited from group membership. It will only set the grants directly applied to the subject.
   * @param subjectId Subject ID (user or group) (required)
   * @param body Pairs of role and division IDs (required)
   * @param subjectType what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) (optional, default to PC_USER)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectBulkreplaceWithHttpInfo(String subjectId, RoleDivisionGrants body, String subjectType) throws IOException {
    return postAuthorizationSubjectBulkreplace(createPostAuthorizationSubjectBulkreplaceRequest(subjectId, body, subjectType).withHttpInfo());
  }

  private PostAuthorizationSubjectBulkreplaceRequest createPostAuthorizationSubjectBulkreplaceRequest(String subjectId, RoleDivisionGrants body, String subjectType) {
    return PostAuthorizationSubjectBulkreplaceRequest.builder()
            .withSubjectId(subjectId)
    
            .withBody(body)
    
            .withSubjectType(subjectType)
    
            .build();
  }

  /**
   * Replace subject&#39;s roles and divisions with the exact list supplied in the request.
   * This operation will not remove grants that are inherited from group membership. It will only set the grants directly applied to the subject.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectBulkreplace(PostAuthorizationSubjectBulkreplaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Replace subject&#39;s roles and divisions with the exact list supplied in the request.
   * This operation will not remove grants that are inherited from group membership. It will only set the grants directly applied to the subject.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectBulkreplace(ApiRequest<RoleDivisionGrants> request) throws IOException {
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
   * Make a grant of a role in a division
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param divisionId the id of the division to which to make the grant (required)
   * @param roleId the id of the role to grant (required)
   * @param subjectType what the type of the subject is: PC_GROUP, PC_USER or PC_OAUTH_CLIENT (note: for cross-org authorization, please use the Organization Authorization endpoints) (optional, default to PC_USER)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectDivisionRole(String subjectId, String divisionId, String roleId, String subjectType) throws IOException, ApiException {
     postAuthorizationSubjectDivisionRole(createPostAuthorizationSubjectDivisionRoleRequest(subjectId, divisionId, roleId, subjectType));
  }

  /**
   * Make a grant of a role in a division
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param divisionId the id of the division to which to make the grant (required)
   * @param roleId the id of the role to grant (required)
   * @param subjectType what the type of the subject is: PC_GROUP, PC_USER or PC_OAUTH_CLIENT (note: for cross-org authorization, please use the Organization Authorization endpoints) (optional, default to PC_USER)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectDivisionRoleWithHttpInfo(String subjectId, String divisionId, String roleId, String subjectType) throws IOException {
    return postAuthorizationSubjectDivisionRole(createPostAuthorizationSubjectDivisionRoleRequest(subjectId, divisionId, roleId, subjectType).withHttpInfo());
  }

  private PostAuthorizationSubjectDivisionRoleRequest createPostAuthorizationSubjectDivisionRoleRequest(String subjectId, String divisionId, String roleId, String subjectType) {
    return PostAuthorizationSubjectDivisionRoleRequest.builder()
            .withSubjectId(subjectId)
    
            .withDivisionId(divisionId)
    
            .withRoleId(roleId)
    
            .withSubjectType(subjectType)
    
            .build();
  }

  /**
   * Make a grant of a role in a division
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectDivisionRole(PostAuthorizationSubjectDivisionRoleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Make a grant of a role in a division
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectDivisionRole(ApiRequest<Void> request) throws IOException {
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
   * Send an activation email to the user
   * 
   * @param userId User ID (required)
   * @param force Resend the invitation even if one is already outstanding (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postUserInvite(String userId, Boolean force) throws IOException, ApiException {
     postUserInvite(createPostUserInviteRequest(userId, force));
  }

  /**
   * Send an activation email to the user
   * 
   * @param userId User ID (required)
   * @param force Resend the invitation even if one is already outstanding (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postUserInviteWithHttpInfo(String userId, Boolean force) throws IOException {
    return postUserInvite(createPostUserInviteRequest(userId, force).withHttpInfo());
  }

  private PostUserInviteRequest createPostUserInviteRequest(String userId, Boolean force) {
    return PostUserInviteRequest.builder()
            .withUserId(userId)
    
            .withForce(force)
    
            .build();
  }

  /**
   * Send an activation email to the user
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postUserInvite(PostUserInviteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Send an activation email to the user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postUserInvite(ApiRequest<Void> request) throws IOException {
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
   * Change a users password
   * 
   * @param userId User ID (required)
   * @param body Password (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postUserPassword(String userId, ChangePasswordRequest body) throws IOException, ApiException {
     postUserPassword(createPostUserPasswordRequest(userId, body));
  }

  /**
   * Change a users password
   * 
   * @param userId User ID (required)
   * @param body Password (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postUserPasswordWithHttpInfo(String userId, ChangePasswordRequest body) throws IOException {
    return postUserPassword(createPostUserPasswordRequest(userId, body).withHttpInfo());
  }

  private PostUserPasswordRequest createPostUserPasswordRequest(String userId, ChangePasswordRequest body) {
    return PostUserPasswordRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Change a users password
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postUserPassword(PostUserPasswordRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Change a users password
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postUserPassword(ApiRequest<ChangePasswordRequest> request) throws IOException {
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
   * Add routing language to user
   * 
   * @param userId User ID (required)
   * @param body Language (required)
   * @return UserRoutingLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingLanguage postUserRoutinglanguages(String userId, UserRoutingLanguagePost body) throws IOException, ApiException {
    return  postUserRoutinglanguages(createPostUserRoutinglanguagesRequest(userId, body));
  }

  /**
   * Add routing language to user
   * 
   * @param userId User ID (required)
   * @param body Language (required)
   * @return UserRoutingLanguage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingLanguage> postUserRoutinglanguagesWithHttpInfo(String userId, UserRoutingLanguagePost body) throws IOException {
    return postUserRoutinglanguages(createPostUserRoutinglanguagesRequest(userId, body).withHttpInfo());
  }

  private PostUserRoutinglanguagesRequest createPostUserRoutinglanguagesRequest(String userId, UserRoutingLanguagePost body) {
    return PostUserRoutinglanguagesRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add routing language to user
   * 
   * @param request The request object
   * @return UserRoutingLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingLanguage postUserRoutinglanguages(PostUserRoutinglanguagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserRoutingLanguage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserRoutingLanguage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add routing language to user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingLanguage> postUserRoutinglanguages(ApiRequest<UserRoutingLanguagePost> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserRoutingLanguage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserRoutingLanguage> response = (ApiResponse<UserRoutingLanguage>)(ApiResponse<?>)exception;
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
      ApiResponse<UserRoutingLanguage> response = (ApiResponse<UserRoutingLanguage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add routing skill to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingSkill postUserRoutingskills(String userId, UserRoutingSkillPost body) throws IOException, ApiException {
    return  postUserRoutingskills(createPostUserRoutingskillsRequest(userId, body));
  }

  /**
   * Add routing skill to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingSkill> postUserRoutingskillsWithHttpInfo(String userId, UserRoutingSkillPost body) throws IOException {
    return postUserRoutingskills(createPostUserRoutingskillsRequest(userId, body).withHttpInfo());
  }

  private PostUserRoutingskillsRequest createPostUserRoutingskillsRequest(String userId, UserRoutingSkillPost body) {
    return PostUserRoutingskillsRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add routing skill to user
   * 
   * @param request The request object
   * @return UserRoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingSkill postUserRoutingskills(PostUserRoutingskillsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserRoutingSkill> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add routing skill to user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingSkill> postUserRoutingskills(ApiRequest<UserRoutingSkillPost> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserRoutingSkill>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)exception;
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
      ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create user
   * 
   * @param body User (required)
   * @return User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public User postUsers(CreateUser body) throws IOException, ApiException {
    return  postUsers(createPostUsersRequest(body));
  }

  /**
   * Create user
   * 
   * @param body User (required)
   * @return User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<User> postUsersWithHttpInfo(CreateUser body) throws IOException {
    return postUsers(createPostUsersRequest(body).withHttpInfo());
  }

  private PostUsersRequest createPostUsersRequest(CreateUser body) {
    return PostUsersRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create user
   * 
   * @param request The request object
   * @return User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public User postUsers(PostUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<User> postUsers(ApiRequest<CreateUser> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<User> response = (ApiResponse<User>)(ApiResponse<?>)exception;
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
      ApiResponse<User> response = (ApiResponse<User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve aggregated development activity data
   * Results are filtered based on the applicable permissions.
   * @param body Aggregate Request (required)
   * @return DevelopmentActivityAggregateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivityAggregateResponse postUsersDevelopmentActivitiesAggregatesQuery(DevelopmentActivityAggregateParam body) throws IOException, ApiException {
    return  postUsersDevelopmentActivitiesAggregatesQuery(createPostUsersDevelopmentActivitiesAggregatesQueryRequest(body));
  }

  /**
   * Retrieve aggregated development activity data
   * Results are filtered based on the applicable permissions.
   * @param body Aggregate Request (required)
   * @return DevelopmentActivityAggregateResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivityAggregateResponse> postUsersDevelopmentActivitiesAggregatesQueryWithHttpInfo(DevelopmentActivityAggregateParam body) throws IOException {
    return postUsersDevelopmentActivitiesAggregatesQuery(createPostUsersDevelopmentActivitiesAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostUsersDevelopmentActivitiesAggregatesQueryRequest createPostUsersDevelopmentActivitiesAggregatesQueryRequest(DevelopmentActivityAggregateParam body) {
    return PostUsersDevelopmentActivitiesAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Retrieve aggregated development activity data
   * Results are filtered based on the applicable permissions.
   * @param request The request object
   * @return DevelopmentActivityAggregateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivityAggregateResponse postUsersDevelopmentActivitiesAggregatesQuery(PostUsersDevelopmentActivitiesAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DevelopmentActivityAggregateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DevelopmentActivityAggregateResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve aggregated development activity data
   * Results are filtered based on the applicable permissions.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivityAggregateResponse> postUsersDevelopmentActivitiesAggregatesQuery(ApiRequest<DevelopmentActivityAggregateParam> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DevelopmentActivityAggregateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DevelopmentActivityAggregateResponse> response = (ApiResponse<DevelopmentActivityAggregateResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<DevelopmentActivityAggregateResponse> response = (ApiResponse<DevelopmentActivityAggregateResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Change your password
   * 
   * @param body Password (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postUsersMePassword(ChangeMyPasswordRequest body) throws IOException, ApiException {
     postUsersMePassword(createPostUsersMePasswordRequest(body));
  }

  /**
   * Change your password
   * 
   * @param body Password (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postUsersMePasswordWithHttpInfo(ChangeMyPasswordRequest body) throws IOException {
    return postUsersMePassword(createPostUsersMePasswordRequest(body).withHttpInfo());
  }

  private PostUsersMePasswordRequest createPostUsersMePasswordRequest(ChangeMyPasswordRequest body) {
    return PostUsersMePasswordRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Change your password
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postUsersMePassword(PostUsersMePasswordRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Change your password
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postUsersMePassword(ApiRequest<ChangeMyPasswordRequest> request) throws IOException {
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
   * Search users
   * 
   * @param body Search request options (required)
   * @return UsersSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersSearchResponse postUsersSearch(UserSearchRequest body) throws IOException, ApiException {
    return  postUsersSearch(createPostUsersSearchRequest(body));
  }

  /**
   * Search users
   * 
   * @param body Search request options (required)
   * @return UsersSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersSearchResponse> postUsersSearchWithHttpInfo(UserSearchRequest body) throws IOException {
    return postUsersSearch(createPostUsersSearchRequest(body).withHttpInfo());
  }

  private PostUsersSearchRequest createPostUsersSearchRequest(UserSearchRequest body) {
    return PostUsersSearchRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Search users
   * 
   * @param request The request object
   * @return UsersSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersSearchResponse postUsersSearch(PostUsersSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search users
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersSearchResponse> postUsersSearch(ApiRequest<UserSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update the user&#39;s max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param userId User ID (required)
   * @param body utilization (required)
   * @return AgentMaxUtilization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentMaxUtilization putRoutingUserUtilization(String userId, Utilization body) throws IOException, ApiException {
    return  putRoutingUserUtilization(createPutRoutingUserUtilizationRequest(userId, body));
  }

  /**
   * Update the user&#39;s max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param userId User ID (required)
   * @param body utilization (required)
   * @return AgentMaxUtilization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentMaxUtilization> putRoutingUserUtilizationWithHttpInfo(String userId, Utilization body) throws IOException {
    return putRoutingUserUtilization(createPutRoutingUserUtilizationRequest(userId, body).withHttpInfo());
  }

  private PutRoutingUserUtilizationRequest createPutRoutingUserUtilizationRequest(String userId, Utilization body) {
    return PutRoutingUserUtilizationRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update the user&#39;s max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param request The request object
   * @return AgentMaxUtilization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentMaxUtilization putRoutingUserUtilization(PutRoutingUserUtilizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentMaxUtilization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentMaxUtilization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the user&#39;s max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentMaxUtilization> putRoutingUserUtilization(ApiRequest<Utilization> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentMaxUtilization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentMaxUtilization> response = (ApiResponse<AgentMaxUtilization>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentMaxUtilization> response = (ApiResponse<AgentMaxUtilization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return CallForwarding
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallForwarding putUserCallforwarding(String userId, CallForwarding body) throws IOException, ApiException {
    return  putUserCallforwarding(createPutUserCallforwardingRequest(userId, body));
  }

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return CallForwarding
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallForwarding> putUserCallforwardingWithHttpInfo(String userId, CallForwarding body) throws IOException {
    return putUserCallforwarding(createPutUserCallforwardingRequest(userId, body).withHttpInfo());
  }

  private PutUserCallforwardingRequest createPutUserCallforwardingRequest(String userId, CallForwarding body) {
    return PutUserCallforwardingRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @param request The request object
   * @return CallForwarding
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallForwarding putUserCallforwarding(PutUserCallforwardingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallForwarding> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallForwarding>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallForwarding> putUserCallforwarding(ApiRequest<CallForwarding> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallForwarding>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallForwarding> response = (ApiResponse<CallForwarding>)(ApiResponse<?>)exception;
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
      ApiResponse<CallForwarding> response = (ApiResponse<CallForwarding>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an OutOfOffice
   * 
   * @param userId User ID (required)
   * @param body The updated OutOffOffice (required)
   * @return OutOfOffice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutOfOffice putUserOutofoffice(String userId, OutOfOffice body) throws IOException, ApiException {
    return  putUserOutofoffice(createPutUserOutofofficeRequest(userId, body));
  }

  /**
   * Update an OutOfOffice
   * 
   * @param userId User ID (required)
   * @param body The updated OutOffOffice (required)
   * @return OutOfOffice
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutOfOffice> putUserOutofofficeWithHttpInfo(String userId, OutOfOffice body) throws IOException {
    return putUserOutofoffice(createPutUserOutofofficeRequest(userId, body).withHttpInfo());
  }

  private PutUserOutofofficeRequest createPutUserOutofofficeRequest(String userId, OutOfOffice body) {
    return PutUserOutofofficeRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an OutOfOffice
   * 
   * @param request The request object
   * @return OutOfOffice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutOfOffice putUserOutofoffice(PutUserOutofofficeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutOfOffice> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutOfOffice>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an OutOfOffice
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutOfOffice> putUserOutofoffice(ApiRequest<OutOfOffice> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutOfOffice>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutOfOffice> response = (ApiResponse<OutOfOffice>)(ApiResponse<?>)exception;
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
      ApiResponse<OutOfOffice> response = (ApiResponse<OutOfOffice>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update profile skills for a user
   * 
   * @param userId User ID (required)
   * @param body Skills (required)
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> putUserProfileskills(String userId, List<String> body) throws IOException, ApiException {
    return  putUserProfileskills(createPutUserProfileskillsRequest(userId, body));
  }

  /**
   * Update profile skills for a user
   * 
   * @param userId User ID (required)
   * @param body Skills (required)
   * @return List<String>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> putUserProfileskillsWithHttpInfo(String userId, List<String> body) throws IOException {
    return putUserProfileskills(createPutUserProfileskillsRequest(userId, body).withHttpInfo());
  }

  private PutUserProfileskillsRequest createPutUserProfileskillsRequest(String userId, List<String> body) {
    return PutUserProfileskillsRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update profile skills for a user
   * 
   * @param request The request object
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> putUserProfileskills(PutUserProfileskillsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<String>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<String>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update profile skills for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> putUserProfileskills(ApiRequest<List<String>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<String>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Sets the user&#39;s roles
   * 
   * @param userId User ID (required)
   * @param body List of roles (required)
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization putUserRoles(String userId, List<String> body) throws IOException, ApiException {
    return  putUserRoles(createPutUserRolesRequest(userId, body));
  }

  /**
   * Sets the user&#39;s roles
   * 
   * @param userId User ID (required)
   * @param body List of roles (required)
   * @return UserAuthorization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> putUserRolesWithHttpInfo(String userId, List<String> body) throws IOException {
    return putUserRoles(createPutUserRolesRequest(userId, body).withHttpInfo());
  }

  private PutUserRolesRequest createPutUserRolesRequest(String userId, List<String> body) {
    return PutUserRolesRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Sets the user&#39;s roles
   * 
   * @param request The request object
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization putUserRoles(PutUserRolesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserAuthorization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserAuthorization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Sets the user&#39;s roles
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> putUserRoles(ApiRequest<List<String>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserAuthorization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserAuthorization> response = (ApiResponse<UserAuthorization>)(ApiResponse<?>)exception;
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
      ApiResponse<UserAuthorization> response = (ApiResponse<UserAuthorization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update routing skill proficiency or state.
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingSkill putUserRoutingskill(String userId, String skillId, UserRoutingSkill body) throws IOException, ApiException {
    return  putUserRoutingskill(createPutUserRoutingskillRequest(userId, skillId, body));
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingSkill> putUserRoutingskillWithHttpInfo(String userId, String skillId, UserRoutingSkill body) throws IOException {
    return putUserRoutingskill(createPutUserRoutingskillRequest(userId, skillId, body).withHttpInfo());
  }

  private PutUserRoutingskillRequest createPutUserRoutingskillRequest(String userId, String skillId, UserRoutingSkill body) {
    return PutUserRoutingskillRequest.builder()
            .withUserId(userId)
    
            .withSkillId(skillId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @param request The request object
   * @return UserRoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingSkill putUserRoutingskill(PutUserRoutingskillRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserRoutingSkill> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingSkill> putUserRoutingskill(ApiRequest<UserRoutingSkill> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserRoutingSkill>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)exception;
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
      ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Replace all routing skills assigned to a user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing putUserRoutingskillsBulk(String userId, List<UserRoutingSkillPost> body) throws IOException, ApiException {
    return  putUserRoutingskillsBulk(createPutUserRoutingskillsBulkRequest(userId, body));
  }

  /**
   * Replace all routing skills assigned to a user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserSkillEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> putUserRoutingskillsBulkWithHttpInfo(String userId, List<UserRoutingSkillPost> body) throws IOException {
    return putUserRoutingskillsBulk(createPutUserRoutingskillsBulkRequest(userId, body).withHttpInfo());
  }

  private PutUserRoutingskillsBulkRequest createPutUserRoutingskillsBulkRequest(String userId, List<UserRoutingSkillPost> body) {
    return PutUserRoutingskillsBulkRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Replace all routing skills assigned to a user
   * 
   * @param request The request object
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing putUserRoutingskillsBulk(PutUserRoutingskillsBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserSkillEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserSkillEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Replace all routing skills assigned to a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> putUserRoutingskillsBulk(ApiRequest<List<UserRoutingSkillPost>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserSkillEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update the routing status of a user
   * 
   * @param userId User ID (required)
   * @param body Routing Status (required)
   * @return RoutingStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatus putUserRoutingstatus(String userId, RoutingStatus body) throws IOException, ApiException {
    return  putUserRoutingstatus(createPutUserRoutingstatusRequest(userId, body));
  }

  /**
   * Update the routing status of a user
   * 
   * @param userId User ID (required)
   * @param body Routing Status (required)
   * @return RoutingStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatus> putUserRoutingstatusWithHttpInfo(String userId, RoutingStatus body) throws IOException {
    return putUserRoutingstatus(createPutUserRoutingstatusRequest(userId, body).withHttpInfo());
  }

  private PutUserRoutingstatusRequest createPutUserRoutingstatusRequest(String userId, RoutingStatus body) {
    return PutUserRoutingstatusRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update the routing status of a user
   * 
   * @param request The request object
   * @return RoutingStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatus putUserRoutingstatus(PutUserRoutingstatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the routing status of a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatus> putUserRoutingstatus(ApiRequest<RoutingStatus> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingStatus> response = (ApiResponse<RoutingStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingStatus> response = (ApiResponse<RoutingStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update user state information.
   * 
   * @param userId User ID (required)
   * @param body User (required)
   * @return UserState
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserState putUserState(String userId, UserState body) throws IOException, ApiException {
    return  putUserState(createPutUserStateRequest(userId, body));
  }

  /**
   * Update user state information.
   * 
   * @param userId User ID (required)
   * @param body User (required)
   * @return UserState
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserState> putUserStateWithHttpInfo(String userId, UserState body) throws IOException {
    return putUserState(createPutUserStateRequest(userId, body).withHttpInfo());
  }

  private PutUserStateRequest createPutUserStateRequest(String userId, UserState body) {
    return PutUserStateRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update user state information.
   * 
   * @param request The request object
   * @return UserState
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserState putUserState(PutUserStateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserState> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserState>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update user state information.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserState> putUserState(ApiRequest<UserState> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserState>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserState> response = (ApiResponse<UserState>)(ApiResponse<?>)exception;
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
      ApiResponse<UserState> response = (ApiResponse<UserState>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Set associated station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putUserStationAssociatedstationStationId(String userId, String stationId) throws IOException, ApiException {
     putUserStationAssociatedstationStationId(createPutUserStationAssociatedstationStationIdRequest(userId, stationId));
  }

  /**
   * Set associated station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putUserStationAssociatedstationStationIdWithHttpInfo(String userId, String stationId) throws IOException {
    return putUserStationAssociatedstationStationId(createPutUserStationAssociatedstationStationIdRequest(userId, stationId).withHttpInfo());
  }

  private PutUserStationAssociatedstationStationIdRequest createPutUserStationAssociatedstationStationIdRequest(String userId, String stationId) {
    return PutUserStationAssociatedstationStationIdRequest.builder()
            .withUserId(userId)
    
            .withStationId(stationId)
    
            .build();
  }

  /**
   * Set associated station
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putUserStationAssociatedstationStationId(PutUserStationAssociatedstationStationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Set associated station
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putUserStationAssociatedstationStationId(ApiRequest<Void> request) throws IOException {
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
   * Set default station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putUserStationDefaultstationStationId(String userId, String stationId) throws IOException, ApiException {
     putUserStationDefaultstationStationId(createPutUserStationDefaultstationStationIdRequest(userId, stationId));
  }

  /**
   * Set default station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putUserStationDefaultstationStationIdWithHttpInfo(String userId, String stationId) throws IOException {
    return putUserStationDefaultstationStationId(createPutUserStationDefaultstationStationIdRequest(userId, stationId).withHttpInfo());
  }

  private PutUserStationDefaultstationStationIdRequest createPutUserStationDefaultstationStationIdRequest(String userId, String stationId) {
    return PutUserStationDefaultstationStationIdRequest.builder()
            .withUserId(userId)
    
            .withStationId(stationId)
    
            .build();
  }

  /**
   * Set default station
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putUserStationDefaultstationStationId(PutUserStationDefaultstationStationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Set default station
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putUserStationDefaultstationStationId(ApiRequest<Void> request) throws IOException {
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
