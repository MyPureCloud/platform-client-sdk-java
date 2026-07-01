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
import com.mypurecloud.sdk.v2.model.ScreenMonitorSettings;
import com.mypurecloud.sdk.v2.model.ScreenMonitoringDetails;
import com.mypurecloud.sdk.v2.model.ScreenMonitoringSession;
import com.mypurecloud.sdk.v2.model.ScreenMonitoringSessionEntityListing;
import com.mypurecloud.sdk.v2.model.ScreenMonitoringUserDetailsEntityListing;
import com.mypurecloud.sdk.v2.model.StartScreenMonitorResponseBody;


import com.mypurecloud.sdk.v2.api.request.DeleteConversationParticipantScreenmonitorsSessionRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserScreenmonitorsSessionRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationParticipantScreenmonitorsSessionRequest;
import com.mypurecloud.sdk.v2.api.request.GetScreenmonitorsSessionsDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetScreenmonitorsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetScreenmonitorsUserSessionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserScreenmonitorsSessionRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationParticipantScreenmonitorsSessionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostScreenmonitorsSessionsUsersDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserScreenmonitorsSessionsRequest;
import com.mypurecloud.sdk.v2.api.request.PutScreenmonitorsSettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScreenMonitoringApi {
  private final ApiClient pcapiClient;

  public ScreenMonitoringApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScreenMonitoringApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Stop a conversation-level screen monitoring session.
   * 
   * @param conversationId Conversation ID (required)
   * @param participantId Participant ID (required)
   * @param screenMonitoringId Screen Monitoring ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationParticipantScreenmonitorsSession(String conversationId, String participantId, String screenMonitoringId) throws IOException, ApiException {
     deleteConversationParticipantScreenmonitorsSession(createDeleteConversationParticipantScreenmonitorsSessionRequest(conversationId, participantId, screenMonitoringId));
  }

  /**
   * Stop a conversation-level screen monitoring session.
   * 
   * @param conversationId Conversation ID (required)
   * @param participantId Participant ID (required)
   * @param screenMonitoringId Screen Monitoring ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationParticipantScreenmonitorsSessionWithHttpInfo(String conversationId, String participantId, String screenMonitoringId) throws IOException {
    return deleteConversationParticipantScreenmonitorsSession(createDeleteConversationParticipantScreenmonitorsSessionRequest(conversationId, participantId, screenMonitoringId).withHttpInfo());
  }

  private DeleteConversationParticipantScreenmonitorsSessionRequest createDeleteConversationParticipantScreenmonitorsSessionRequest(String conversationId, String participantId, String screenMonitoringId) {
    return DeleteConversationParticipantScreenmonitorsSessionRequest.builder()
            .withConversationId(conversationId)

            .withParticipantId(participantId)

            .withScreenMonitoringId(screenMonitoringId)

            .build();
  }

  /**
   * Stop a conversation-level screen monitoring session.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationParticipantScreenmonitorsSession(DeleteConversationParticipantScreenmonitorsSessionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Stop a conversation-level screen monitoring session.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationParticipantScreenmonitorsSession(ApiRequest<Void> request) throws IOException {
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
   * Stop an agent-level screen monitoring session.
   * 
   * @param userId User ID (required)
   * @param screenMonitoringId Screen Monitoring ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserScreenmonitorsSession(String userId, String screenMonitoringId) throws IOException, ApiException {
     deleteUserScreenmonitorsSession(createDeleteUserScreenmonitorsSessionRequest(userId, screenMonitoringId));
  }

  /**
   * Stop an agent-level screen monitoring session.
   * 
   * @param userId User ID (required)
   * @param screenMonitoringId Screen Monitoring ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserScreenmonitorsSessionWithHttpInfo(String userId, String screenMonitoringId) throws IOException {
    return deleteUserScreenmonitorsSession(createDeleteUserScreenmonitorsSessionRequest(userId, screenMonitoringId).withHttpInfo());
  }

  private DeleteUserScreenmonitorsSessionRequest createDeleteUserScreenmonitorsSessionRequest(String userId, String screenMonitoringId) {
    return DeleteUserScreenmonitorsSessionRequest.builder()
            .withUserId(userId)

            .withScreenMonitoringId(screenMonitoringId)

            .build();
  }

  /**
   * Stop an agent-level screen monitoring session.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserScreenmonitorsSession(DeleteUserScreenmonitorsSessionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Stop an agent-level screen monitoring session.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserScreenmonitorsSession(ApiRequest<Void> request) throws IOException {
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
   * Get a conversation-level screen monitoring session object using the supplied screenMonitoringId.
   * 
   * @param conversationId Conversation ID (required)
   * @param participantId Participant ID (required)
   * @param screenMonitoringId Screen Monitoring ID (required)
   * @return ScreenMonitoringSession
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenMonitoringSession getConversationParticipantScreenmonitorsSession(String conversationId, String participantId, String screenMonitoringId) throws IOException, ApiException {
    return  getConversationParticipantScreenmonitorsSession(createGetConversationParticipantScreenmonitorsSessionRequest(conversationId, participantId, screenMonitoringId));
  }

  /**
   * Get a conversation-level screen monitoring session object using the supplied screenMonitoringId.
   * 
   * @param conversationId Conversation ID (required)
   * @param participantId Participant ID (required)
   * @param screenMonitoringId Screen Monitoring ID (required)
   * @return ScreenMonitoringSession
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenMonitoringSession> getConversationParticipantScreenmonitorsSessionWithHttpInfo(String conversationId, String participantId, String screenMonitoringId) throws IOException {
    return getConversationParticipantScreenmonitorsSession(createGetConversationParticipantScreenmonitorsSessionRequest(conversationId, participantId, screenMonitoringId).withHttpInfo());
  }

  private GetConversationParticipantScreenmonitorsSessionRequest createGetConversationParticipantScreenmonitorsSessionRequest(String conversationId, String participantId, String screenMonitoringId) {
    return GetConversationParticipantScreenmonitorsSessionRequest.builder()
            .withConversationId(conversationId)

            .withParticipantId(participantId)

            .withScreenMonitoringId(screenMonitoringId)

            .build();
  }

  /**
   * Get a conversation-level screen monitoring session object using the supplied screenMonitoringId.
   * 
   * @param request The request object
   * @return ScreenMonitoringSession
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenMonitoringSession getConversationParticipantScreenmonitorsSession(GetConversationParticipantScreenmonitorsSessionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScreenMonitoringSession> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScreenMonitoringSession>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a conversation-level screen monitoring session object using the supplied screenMonitoringId.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenMonitoringSession> getConversationParticipantScreenmonitorsSession(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScreenMonitoringSession>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenMonitoringSession> response = (ApiResponse<ScreenMonitoringSession>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenMonitoringSession> response = (ApiResponse<ScreenMonitoringSession>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the details of all screen monitoring sessions for the current organization.
   * 
   * @return ScreenMonitoringDetails
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenMonitoringDetails getScreenmonitorsSessionsDetails() throws IOException, ApiException {
    return  getScreenmonitorsSessionsDetails(createGetScreenmonitorsSessionsDetailsRequest());
  }

  /**
   * Get the details of all screen monitoring sessions for the current organization.
   * 
   * @return ScreenMonitoringDetails
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenMonitoringDetails> getScreenmonitorsSessionsDetailsWithHttpInfo() throws IOException {
    return getScreenmonitorsSessionsDetails(createGetScreenmonitorsSessionsDetailsRequest().withHttpInfo());
  }

  private GetScreenmonitorsSessionsDetailsRequest createGetScreenmonitorsSessionsDetailsRequest() {
    return GetScreenmonitorsSessionsDetailsRequest.builder()
            .build();
  }

  /**
   * Get the details of all screen monitoring sessions for the current organization.
   * 
   * @param request The request object
   * @return ScreenMonitoringDetails
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenMonitoringDetails getScreenmonitorsSessionsDetails(GetScreenmonitorsSessionsDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScreenMonitoringDetails> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScreenMonitoringDetails>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the details of all screen monitoring sessions for the current organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenMonitoringDetails> getScreenmonitorsSessionsDetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScreenMonitoringDetails>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenMonitoringDetails> response = (ApiResponse<ScreenMonitoringDetails>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenMonitoringDetails> response = (ApiResponse<ScreenMonitoringDetails>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the Screen Monitor Settings for the Organization
   * 
   * @return ScreenMonitorSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenMonitorSettings getScreenmonitorsSettings() throws IOException, ApiException {
    return  getScreenmonitorsSettings(createGetScreenmonitorsSettingsRequest());
  }

  /**
   * Get the Screen Monitor Settings for the Organization
   * 
   * @return ScreenMonitorSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenMonitorSettings> getScreenmonitorsSettingsWithHttpInfo() throws IOException {
    return getScreenmonitorsSettings(createGetScreenmonitorsSettingsRequest().withHttpInfo());
  }

  private GetScreenmonitorsSettingsRequest createGetScreenmonitorsSettingsRequest() {
    return GetScreenmonitorsSettingsRequest.builder()
            .build();
  }

  /**
   * Get the Screen Monitor Settings for the Organization
   * 
   * @param request The request object
   * @return ScreenMonitorSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenMonitorSettings getScreenmonitorsSettings(GetScreenmonitorsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScreenMonitorSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScreenMonitorSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the Screen Monitor Settings for the Organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenMonitorSettings> getScreenmonitorsSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScreenMonitorSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenMonitorSettings> response = (ApiResponse<ScreenMonitorSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenMonitorSettings> response = (ApiResponse<ScreenMonitorSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all screen monitoring sessions for the supplied userId.
   * 
   * @param userId User ID (required)
   * @return ScreenMonitoringSessionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenMonitoringSessionEntityListing getScreenmonitorsUserSessions(String userId) throws IOException, ApiException {
    return  getScreenmonitorsUserSessions(createGetScreenmonitorsUserSessionsRequest(userId));
  }

  /**
   * Get all screen monitoring sessions for the supplied userId.
   * 
   * @param userId User ID (required)
   * @return ScreenMonitoringSessionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenMonitoringSessionEntityListing> getScreenmonitorsUserSessionsWithHttpInfo(String userId) throws IOException {
    return getScreenmonitorsUserSessions(createGetScreenmonitorsUserSessionsRequest(userId).withHttpInfo());
  }

  private GetScreenmonitorsUserSessionsRequest createGetScreenmonitorsUserSessionsRequest(String userId) {
    return GetScreenmonitorsUserSessionsRequest.builder()
            .withUserId(userId)

            .build();
  }

  /**
   * Get all screen monitoring sessions for the supplied userId.
   * 
   * @param request The request object
   * @return ScreenMonitoringSessionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenMonitoringSessionEntityListing getScreenmonitorsUserSessions(GetScreenmonitorsUserSessionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScreenMonitoringSessionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScreenMonitoringSessionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all screen monitoring sessions for the supplied userId.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenMonitoringSessionEntityListing> getScreenmonitorsUserSessions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScreenMonitoringSessionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenMonitoringSessionEntityListing> response = (ApiResponse<ScreenMonitoringSessionEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenMonitoringSessionEntityListing> response = (ApiResponse<ScreenMonitoringSessionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an agent-level screen monitoring session object using the supplied screenMonitoringId.
   * 
   * @param userId User ID (required)
   * @param screenMonitoringId Screen Monitoring ID (required)
   * @return ScreenMonitoringSession
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenMonitoringSession getUserScreenmonitorsSession(String userId, String screenMonitoringId) throws IOException, ApiException {
    return  getUserScreenmonitorsSession(createGetUserScreenmonitorsSessionRequest(userId, screenMonitoringId));
  }

  /**
   * Get an agent-level screen monitoring session object using the supplied screenMonitoringId.
   * 
   * @param userId User ID (required)
   * @param screenMonitoringId Screen Monitoring ID (required)
   * @return ScreenMonitoringSession
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenMonitoringSession> getUserScreenmonitorsSessionWithHttpInfo(String userId, String screenMonitoringId) throws IOException {
    return getUserScreenmonitorsSession(createGetUserScreenmonitorsSessionRequest(userId, screenMonitoringId).withHttpInfo());
  }

  private GetUserScreenmonitorsSessionRequest createGetUserScreenmonitorsSessionRequest(String userId, String screenMonitoringId) {
    return GetUserScreenmonitorsSessionRequest.builder()
            .withUserId(userId)

            .withScreenMonitoringId(screenMonitoringId)

            .build();
  }

  /**
   * Get an agent-level screen monitoring session object using the supplied screenMonitoringId.
   * 
   * @param request The request object
   * @return ScreenMonitoringSession
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenMonitoringSession getUserScreenmonitorsSession(GetUserScreenmonitorsSessionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScreenMonitoringSession> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScreenMonitoringSession>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an agent-level screen monitoring session object using the supplied screenMonitoringId.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenMonitoringSession> getUserScreenmonitorsSession(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScreenMonitoringSession>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenMonitoringSession> response = (ApiResponse<ScreenMonitoringSession>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenMonitoringSession> response = (ApiResponse<ScreenMonitoringSession>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start a conversation-level screen monitoring session.
   * 
   * @param conversationId Conversation ID (required)
   * @param participantId Participant ID (required)
   * @return StartScreenMonitorResponseBody
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StartScreenMonitorResponseBody postConversationParticipantScreenmonitorsSessions(String conversationId, String participantId) throws IOException, ApiException {
    return  postConversationParticipantScreenmonitorsSessions(createPostConversationParticipantScreenmonitorsSessionsRequest(conversationId, participantId));
  }

  /**
   * Start a conversation-level screen monitoring session.
   * 
   * @param conversationId Conversation ID (required)
   * @param participantId Participant ID (required)
   * @return StartScreenMonitorResponseBody
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StartScreenMonitorResponseBody> postConversationParticipantScreenmonitorsSessionsWithHttpInfo(String conversationId, String participantId) throws IOException {
    return postConversationParticipantScreenmonitorsSessions(createPostConversationParticipantScreenmonitorsSessionsRequest(conversationId, participantId).withHttpInfo());
  }

  private PostConversationParticipantScreenmonitorsSessionsRequest createPostConversationParticipantScreenmonitorsSessionsRequest(String conversationId, String participantId) {
    return PostConversationParticipantScreenmonitorsSessionsRequest.builder()
            .withConversationId(conversationId)

            .withParticipantId(participantId)

            .build();
  }

  /**
   * Start a conversation-level screen monitoring session.
   * 
   * @param request The request object
   * @return StartScreenMonitorResponseBody
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StartScreenMonitorResponseBody postConversationParticipantScreenmonitorsSessions(PostConversationParticipantScreenmonitorsSessionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<StartScreenMonitorResponseBody> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<StartScreenMonitorResponseBody>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start a conversation-level screen monitoring session.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StartScreenMonitorResponseBody> postConversationParticipantScreenmonitorsSessions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<StartScreenMonitorResponseBody>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<StartScreenMonitorResponseBody> response = (ApiResponse<StartScreenMonitorResponseBody>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<StartScreenMonitorResponseBody> response = (ApiResponse<StartScreenMonitorResponseBody>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get screen monitor session details for one or more users.
   * 
   * @param body List of target user IDs (required)
   * @return ScreenMonitoringUserDetailsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenMonitoringUserDetailsEntityListing postScreenmonitorsSessionsUsersDetails(List<String> body) throws IOException, ApiException {
    return  postScreenmonitorsSessionsUsersDetails(createPostScreenmonitorsSessionsUsersDetailsRequest(body));
  }

  /**
   * Get screen monitor session details for one or more users.
   * 
   * @param body List of target user IDs (required)
   * @return ScreenMonitoringUserDetailsEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenMonitoringUserDetailsEntityListing> postScreenmonitorsSessionsUsersDetailsWithHttpInfo(List<String> body) throws IOException {
    return postScreenmonitorsSessionsUsersDetails(createPostScreenmonitorsSessionsUsersDetailsRequest(body).withHttpInfo());
  }

  private PostScreenmonitorsSessionsUsersDetailsRequest createPostScreenmonitorsSessionsUsersDetailsRequest(List<String> body) {
    return PostScreenmonitorsSessionsUsersDetailsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Get screen monitor session details for one or more users.
   * 
   * @param request The request object
   * @return ScreenMonitoringUserDetailsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenMonitoringUserDetailsEntityListing postScreenmonitorsSessionsUsersDetails(PostScreenmonitorsSessionsUsersDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScreenMonitoringUserDetailsEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScreenMonitoringUserDetailsEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get screen monitor session details for one or more users.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenMonitoringUserDetailsEntityListing> postScreenmonitorsSessionsUsersDetails(ApiRequest<List<String>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScreenMonitoringUserDetailsEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenMonitoringUserDetailsEntityListing> response = (ApiResponse<ScreenMonitoringUserDetailsEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenMonitoringUserDetailsEntityListing> response = (ApiResponse<ScreenMonitoringUserDetailsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start an agent-level screen monitoring session.
   * 
   * @param userId User ID (required)
   * @return StartScreenMonitorResponseBody
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StartScreenMonitorResponseBody postUserScreenmonitorsSessions(String userId) throws IOException, ApiException {
    return  postUserScreenmonitorsSessions(createPostUserScreenmonitorsSessionsRequest(userId));
  }

  /**
   * Start an agent-level screen monitoring session.
   * 
   * @param userId User ID (required)
   * @return StartScreenMonitorResponseBody
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StartScreenMonitorResponseBody> postUserScreenmonitorsSessionsWithHttpInfo(String userId) throws IOException {
    return postUserScreenmonitorsSessions(createPostUserScreenmonitorsSessionsRequest(userId).withHttpInfo());
  }

  private PostUserScreenmonitorsSessionsRequest createPostUserScreenmonitorsSessionsRequest(String userId) {
    return PostUserScreenmonitorsSessionsRequest.builder()
            .withUserId(userId)

            .build();
  }

  /**
   * Start an agent-level screen monitoring session.
   * 
   * @param request The request object
   * @return StartScreenMonitorResponseBody
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StartScreenMonitorResponseBody postUserScreenmonitorsSessions(PostUserScreenmonitorsSessionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<StartScreenMonitorResponseBody> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<StartScreenMonitorResponseBody>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start an agent-level screen monitoring session.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StartScreenMonitorResponseBody> postUserScreenmonitorsSessions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<StartScreenMonitorResponseBody>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<StartScreenMonitorResponseBody> response = (ApiResponse<StartScreenMonitorResponseBody>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<StartScreenMonitorResponseBody> response = (ApiResponse<StartScreenMonitorResponseBody>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the Screen Monitor Settings for the Organization
   * 
   * @param body Screen Monitor settings (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putScreenmonitorsSettings(ScreenMonitorSettings body) throws IOException, ApiException {
     putScreenmonitorsSettings(createPutScreenmonitorsSettingsRequest(body));
  }

  /**
   * Update the Screen Monitor Settings for the Organization
   * 
   * @param body Screen Monitor settings (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putScreenmonitorsSettingsWithHttpInfo(ScreenMonitorSettings body) throws IOException {
    return putScreenmonitorsSettings(createPutScreenmonitorsSettingsRequest(body).withHttpInfo());
  }

  private PutScreenmonitorsSettingsRequest createPutScreenmonitorsSettingsRequest(ScreenMonitorSettings body) {
    return PutScreenmonitorsSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update the Screen Monitor Settings for the Organization
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putScreenmonitorsSettings(PutScreenmonitorsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update the Screen Monitor Settings for the Organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putScreenmonitorsSettings(ApiRequest<ScreenMonitorSettings> request) throws IOException {
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
