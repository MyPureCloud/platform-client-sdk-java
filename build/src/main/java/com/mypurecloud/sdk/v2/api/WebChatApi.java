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
import com.mypurecloud.sdk.v2.model.WebChatDeployment;
import com.mypurecloud.sdk.v2.model.WebChatDeploymentEntityListing;
import com.mypurecloud.sdk.v2.model.WebChatGuestMediaRequest;
import com.mypurecloud.sdk.v2.model.WebChatGuestMediaRequestEntityList;
import com.mypurecloud.sdk.v2.model.WebChatMemberInfo;
import com.mypurecloud.sdk.v2.model.WebChatMemberInfoEntityList;
import com.mypurecloud.sdk.v2.model.WebChatMessage;
import com.mypurecloud.sdk.v2.model.WebChatMessageEntityList;
import com.mypurecloud.sdk.v2.model.WebChatSettings;
import com.mypurecloud.sdk.v2.model.CreateWebChatMessageRequest;
import com.mypurecloud.sdk.v2.model.WebChatTyping;
import com.mypurecloud.sdk.v2.model.CreateWebChatConversationResponse;
import com.mypurecloud.sdk.v2.model.CreateWebChatConversationRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteWebchatDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWebchatGuestConversationMemberRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWebchatSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatGuestConversationMediarequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatGuestConversationMediarequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatGuestConversationMemberRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatGuestConversationMembersRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatGuestConversationMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatGuestConversationMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWebchatGuestConversationMediarequestRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebchatDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebchatGuestConversationMemberMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebchatGuestConversationMemberTypingRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebchatGuestConversationsRequest;
import com.mypurecloud.sdk.v2.api.request.PutWebchatDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.PutWebchatSettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WebChatApi {
  private final ApiClient pcapiClient;

  public WebChatApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebChatApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a WebChat deployment
   * 
   * @param deploymentId Deployment Id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebchatDeployment(String deploymentId) throws IOException, ApiException {
     deleteWebchatDeployment(createDeleteWebchatDeploymentRequest(deploymentId));
  }

  /**
   * Delete a WebChat deployment
   * 
   * @param deploymentId Deployment Id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebchatDeploymentWithHttpInfo(String deploymentId) throws IOException {
    return deleteWebchatDeployment(createDeleteWebchatDeploymentRequest(deploymentId).withHttpInfo());
  }

  private DeleteWebchatDeploymentRequest createDeleteWebchatDeploymentRequest(String deploymentId) {
    return DeleteWebchatDeploymentRequest.builder()
            .withDeploymentId(deploymentId)
    
            .build();
  }

  /**
   * Delete a WebChat deployment
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebchatDeployment(DeleteWebchatDeploymentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a WebChat deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebchatDeployment(ApiRequest<Void> request) throws IOException {
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
   * Remove a member from a chat conversation
   * 
   * @param conversationId conversationId (required)
   * @param memberId memberId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebchatGuestConversationMember(String conversationId, String memberId) throws IOException, ApiException {
     deleteWebchatGuestConversationMember(createDeleteWebchatGuestConversationMemberRequest(conversationId, memberId));
  }

  /**
   * Remove a member from a chat conversation
   * 
   * @param conversationId conversationId (required)
   * @param memberId memberId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebchatGuestConversationMemberWithHttpInfo(String conversationId, String memberId) throws IOException {
    return deleteWebchatGuestConversationMember(createDeleteWebchatGuestConversationMemberRequest(conversationId, memberId).withHttpInfo());
  }

  private DeleteWebchatGuestConversationMemberRequest createDeleteWebchatGuestConversationMemberRequest(String conversationId, String memberId) {
    return DeleteWebchatGuestConversationMemberRequest.builder()
            .withConversationId(conversationId)
    
            .withMemberId(memberId)
    
            .build();
  }

  /**
   * Remove a member from a chat conversation
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebchatGuestConversationMember(DeleteWebchatGuestConversationMemberRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove a member from a chat conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebchatGuestConversationMember(ApiRequest<Void> request) throws IOException {
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
   * Remove WebChat deployment settings
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebchatSettings() throws IOException, ApiException {
     deleteWebchatSettings(createDeleteWebchatSettingsRequest());
  }

  /**
   * Remove WebChat deployment settings
   * 
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebchatSettingsWithHttpInfo() throws IOException {
    return deleteWebchatSettings(createDeleteWebchatSettingsRequest().withHttpInfo());
  }

  private DeleteWebchatSettingsRequest createDeleteWebchatSettingsRequest() {
    return DeleteWebchatSettingsRequest.builder()
            .build();
  }

  /**
   * Remove WebChat deployment settings
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebchatSettings(DeleteWebchatSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove WebChat deployment settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebchatSettings(ApiRequest<Void> request) throws IOException {
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
   * Get a WebChat deployment
   * 
   * @param deploymentId Deployment Id (required)
   * @return WebChatDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeployment getWebchatDeployment(String deploymentId) throws IOException, ApiException {
    return  getWebchatDeployment(createGetWebchatDeploymentRequest(deploymentId));
  }

  /**
   * Get a WebChat deployment
   * 
   * @param deploymentId Deployment Id (required)
   * @return WebChatDeployment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeployment> getWebchatDeploymentWithHttpInfo(String deploymentId) throws IOException {
    return getWebchatDeployment(createGetWebchatDeploymentRequest(deploymentId).withHttpInfo());
  }

  private GetWebchatDeploymentRequest createGetWebchatDeploymentRequest(String deploymentId) {
    return GetWebchatDeploymentRequest.builder()
            .withDeploymentId(deploymentId)
    
            .build();
  }

  /**
   * Get a WebChat deployment
   * 
   * @param request The request object
   * @return WebChatDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeployment getWebchatDeployment(GetWebchatDeploymentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatDeployment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatDeployment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a WebChat deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeployment> getWebchatDeployment(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatDeployment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List WebChat deployments
   * 
   * @return WebChatDeploymentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeploymentEntityListing getWebchatDeployments() throws IOException, ApiException {
    return  getWebchatDeployments(createGetWebchatDeploymentsRequest());
  }

  /**
   * List WebChat deployments
   * 
   * @return WebChatDeploymentEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeploymentEntityListing> getWebchatDeploymentsWithHttpInfo() throws IOException {
    return getWebchatDeployments(createGetWebchatDeploymentsRequest().withHttpInfo());
  }

  private GetWebchatDeploymentsRequest createGetWebchatDeploymentsRequest() {
    return GetWebchatDeploymentsRequest.builder()
            .build();
  }

  /**
   * List WebChat deployments
   * 
   * @param request The request object
   * @return WebChatDeploymentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeploymentEntityListing getWebchatDeployments(GetWebchatDeploymentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatDeploymentEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatDeploymentEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List WebChat deployments
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeploymentEntityListing> getWebchatDeployments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatDeploymentEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatDeploymentEntityListing> response = (ApiResponse<WebChatDeploymentEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatDeploymentEntityListing> response = (ApiResponse<WebChatDeploymentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a media request in the conversation
   * 
   * @param conversationId conversationId (required)
   * @param mediaRequestId mediaRequestId (required)
   * @return WebChatGuestMediaRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatGuestMediaRequest getWebchatGuestConversationMediarequest(String conversationId, String mediaRequestId) throws IOException, ApiException {
    return  getWebchatGuestConversationMediarequest(createGetWebchatGuestConversationMediarequestRequest(conversationId, mediaRequestId));
  }

  /**
   * Get a media request in the conversation
   * 
   * @param conversationId conversationId (required)
   * @param mediaRequestId mediaRequestId (required)
   * @return WebChatGuestMediaRequest
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatGuestMediaRequest> getWebchatGuestConversationMediarequestWithHttpInfo(String conversationId, String mediaRequestId) throws IOException {
    return getWebchatGuestConversationMediarequest(createGetWebchatGuestConversationMediarequestRequest(conversationId, mediaRequestId).withHttpInfo());
  }

  private GetWebchatGuestConversationMediarequestRequest createGetWebchatGuestConversationMediarequestRequest(String conversationId, String mediaRequestId) {
    return GetWebchatGuestConversationMediarequestRequest.builder()
            .withConversationId(conversationId)
    
            .withMediaRequestId(mediaRequestId)
    
            .build();
  }

  /**
   * Get a media request in the conversation
   * 
   * @param request The request object
   * @return WebChatGuestMediaRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatGuestMediaRequest getWebchatGuestConversationMediarequest(GetWebchatGuestConversationMediarequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatGuestMediaRequest> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatGuestMediaRequest>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a media request in the conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatGuestMediaRequest> getWebchatGuestConversationMediarequest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatGuestMediaRequest>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatGuestMediaRequest> response = (ApiResponse<WebChatGuestMediaRequest>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatGuestMediaRequest> response = (ApiResponse<WebChatGuestMediaRequest>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all media requests to the guest in the conversation
   * 
   * @param conversationId conversationId (required)
   * @return WebChatGuestMediaRequestEntityList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatGuestMediaRequestEntityList getWebchatGuestConversationMediarequests(String conversationId) throws IOException, ApiException {
    return  getWebchatGuestConversationMediarequests(createGetWebchatGuestConversationMediarequestsRequest(conversationId));
  }

  /**
   * Get all media requests to the guest in the conversation
   * 
   * @param conversationId conversationId (required)
   * @return WebChatGuestMediaRequestEntityList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatGuestMediaRequestEntityList> getWebchatGuestConversationMediarequestsWithHttpInfo(String conversationId) throws IOException {
    return getWebchatGuestConversationMediarequests(createGetWebchatGuestConversationMediarequestsRequest(conversationId).withHttpInfo());
  }

  private GetWebchatGuestConversationMediarequestsRequest createGetWebchatGuestConversationMediarequestsRequest(String conversationId) {
    return GetWebchatGuestConversationMediarequestsRequest.builder()
            .withConversationId(conversationId)
    
            .build();
  }

  /**
   * Get all media requests to the guest in the conversation
   * 
   * @param request The request object
   * @return WebChatGuestMediaRequestEntityList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatGuestMediaRequestEntityList getWebchatGuestConversationMediarequests(GetWebchatGuestConversationMediarequestsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatGuestMediaRequestEntityList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatGuestMediaRequestEntityList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all media requests to the guest in the conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatGuestMediaRequestEntityList> getWebchatGuestConversationMediarequests(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatGuestMediaRequestEntityList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatGuestMediaRequestEntityList> response = (ApiResponse<WebChatGuestMediaRequestEntityList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatGuestMediaRequestEntityList> response = (ApiResponse<WebChatGuestMediaRequestEntityList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a web chat conversation member
   * 
   * @param conversationId conversationId (required)
   * @param memberId memberId (required)
   * @return WebChatMemberInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMemberInfo getWebchatGuestConversationMember(String conversationId, String memberId) throws IOException, ApiException {
    return  getWebchatGuestConversationMember(createGetWebchatGuestConversationMemberRequest(conversationId, memberId));
  }

  /**
   * Get a web chat conversation member
   * 
   * @param conversationId conversationId (required)
   * @param memberId memberId (required)
   * @return WebChatMemberInfo
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMemberInfo> getWebchatGuestConversationMemberWithHttpInfo(String conversationId, String memberId) throws IOException {
    return getWebchatGuestConversationMember(createGetWebchatGuestConversationMemberRequest(conversationId, memberId).withHttpInfo());
  }

  private GetWebchatGuestConversationMemberRequest createGetWebchatGuestConversationMemberRequest(String conversationId, String memberId) {
    return GetWebchatGuestConversationMemberRequest.builder()
            .withConversationId(conversationId)
    
            .withMemberId(memberId)
    
            .build();
  }

  /**
   * Get a web chat conversation member
   * 
   * @param request The request object
   * @return WebChatMemberInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMemberInfo getWebchatGuestConversationMember(GetWebchatGuestConversationMemberRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatMemberInfo> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatMemberInfo>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a web chat conversation member
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMemberInfo> getWebchatGuestConversationMember(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatMemberInfo>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatMemberInfo> response = (ApiResponse<WebChatMemberInfo>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatMemberInfo> response = (ApiResponse<WebChatMemberInfo>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the members of a chat conversation.
   * 
   * @param conversationId conversationId (required)
   * @param pageSize The number of entries to return per page, or omitted for the default. (optional, default to 25)
   * @param pageNumber The page number to return, or omitted for the first page. (optional, default to 1)
   * @param excludeDisconnectedMembers If true, the results will not contain members who have a DISCONNECTED state. (optional, default to false)
   * @return WebChatMemberInfoEntityList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMemberInfoEntityList getWebchatGuestConversationMembers(String conversationId, Integer pageSize, Integer pageNumber, Boolean excludeDisconnectedMembers) throws IOException, ApiException {
    return  getWebchatGuestConversationMembers(createGetWebchatGuestConversationMembersRequest(conversationId, pageSize, pageNumber, excludeDisconnectedMembers));
  }

  /**
   * Get the members of a chat conversation.
   * 
   * @param conversationId conversationId (required)
   * @param pageSize The number of entries to return per page, or omitted for the default. (optional, default to 25)
   * @param pageNumber The page number to return, or omitted for the first page. (optional, default to 1)
   * @param excludeDisconnectedMembers If true, the results will not contain members who have a DISCONNECTED state. (optional, default to false)
   * @return WebChatMemberInfoEntityList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMemberInfoEntityList> getWebchatGuestConversationMembersWithHttpInfo(String conversationId, Integer pageSize, Integer pageNumber, Boolean excludeDisconnectedMembers) throws IOException {
    return getWebchatGuestConversationMembers(createGetWebchatGuestConversationMembersRequest(conversationId, pageSize, pageNumber, excludeDisconnectedMembers).withHttpInfo());
  }

  private GetWebchatGuestConversationMembersRequest createGetWebchatGuestConversationMembersRequest(String conversationId, Integer pageSize, Integer pageNumber, Boolean excludeDisconnectedMembers) {
    return GetWebchatGuestConversationMembersRequest.builder()
            .withConversationId(conversationId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withExcludeDisconnectedMembers(excludeDisconnectedMembers)
    
            .build();
  }

  /**
   * Get the members of a chat conversation.
   * 
   * @param request The request object
   * @return WebChatMemberInfoEntityList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMemberInfoEntityList getWebchatGuestConversationMembers(GetWebchatGuestConversationMembersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatMemberInfoEntityList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatMemberInfoEntityList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the members of a chat conversation.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMemberInfoEntityList> getWebchatGuestConversationMembers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatMemberInfoEntityList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatMemberInfoEntityList> response = (ApiResponse<WebChatMemberInfoEntityList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatMemberInfoEntityList> response = (ApiResponse<WebChatMemberInfoEntityList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a web chat conversation message
   * 
   * @param conversationId conversationId (required)
   * @param messageId messageId (required)
   * @return WebChatMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMessage getWebchatGuestConversationMessage(String conversationId, String messageId) throws IOException, ApiException {
    return  getWebchatGuestConversationMessage(createGetWebchatGuestConversationMessageRequest(conversationId, messageId));
  }

  /**
   * Get a web chat conversation message
   * 
   * @param conversationId conversationId (required)
   * @param messageId messageId (required)
   * @return WebChatMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMessage> getWebchatGuestConversationMessageWithHttpInfo(String conversationId, String messageId) throws IOException {
    return getWebchatGuestConversationMessage(createGetWebchatGuestConversationMessageRequest(conversationId, messageId).withHttpInfo());
  }

  private GetWebchatGuestConversationMessageRequest createGetWebchatGuestConversationMessageRequest(String conversationId, String messageId) {
    return GetWebchatGuestConversationMessageRequest.builder()
            .withConversationId(conversationId)
    
            .withMessageId(messageId)
    
            .build();
  }

  /**
   * Get a web chat conversation message
   * 
   * @param request The request object
   * @return WebChatMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMessage getWebchatGuestConversationMessage(GetWebchatGuestConversationMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatMessage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatMessage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a web chat conversation message
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMessage> getWebchatGuestConversationMessage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatMessage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatMessage> response = (ApiResponse<WebChatMessage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatMessage> response = (ApiResponse<WebChatMessage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the messages of a chat conversation.
   * 
   * @param conversationId conversationId (required)
   * @param after If available, get the messages chronologically after the id of this message (optional)
   * @param before If available, get the messages chronologically before the id of this message (optional)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param maxResults Limit the returned number of messages, up to a maximum of 100 (optional, default to 100)
   * @return WebChatMessageEntityList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMessageEntityList getWebchatGuestConversationMessages(String conversationId, String after, String before, String sortOrder, Integer maxResults) throws IOException, ApiException {
    return  getWebchatGuestConversationMessages(createGetWebchatGuestConversationMessagesRequest(conversationId, after, before, sortOrder, maxResults));
  }

  /**
   * Get the messages of a chat conversation.
   * 
   * @param conversationId conversationId (required)
   * @param after If available, get the messages chronologically after the id of this message (optional)
   * @param before If available, get the messages chronologically before the id of this message (optional)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param maxResults Limit the returned number of messages, up to a maximum of 100 (optional, default to 100)
   * @return WebChatMessageEntityList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMessageEntityList> getWebchatGuestConversationMessagesWithHttpInfo(String conversationId, String after, String before, String sortOrder, Integer maxResults) throws IOException {
    return getWebchatGuestConversationMessages(createGetWebchatGuestConversationMessagesRequest(conversationId, after, before, sortOrder, maxResults).withHttpInfo());
  }

  private GetWebchatGuestConversationMessagesRequest createGetWebchatGuestConversationMessagesRequest(String conversationId, String after, String before, String sortOrder, Integer maxResults) {
    return GetWebchatGuestConversationMessagesRequest.builder()
            .withConversationId(conversationId)
    
            .withAfter(after)
    
            .withBefore(before)
    
            .withSortOrder(sortOrder)
    
            .withMaxResults(maxResults)
    
            .build();
  }

  /**
   * Get the messages of a chat conversation.
   * 
   * @param request The request object
   * @return WebChatMessageEntityList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMessageEntityList getWebchatGuestConversationMessages(GetWebchatGuestConversationMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatMessageEntityList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatMessageEntityList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the messages of a chat conversation.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMessageEntityList> getWebchatGuestConversationMessages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatMessageEntityList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatMessageEntityList> response = (ApiResponse<WebChatMessageEntityList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatMessageEntityList> response = (ApiResponse<WebChatMessageEntityList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get WebChat deployment settings
   * 
   * @return WebChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatSettings getWebchatSettings() throws IOException, ApiException {
    return  getWebchatSettings(createGetWebchatSettingsRequest());
  }

  /**
   * Get WebChat deployment settings
   * 
   * @return WebChatSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatSettings> getWebchatSettingsWithHttpInfo() throws IOException {
    return getWebchatSettings(createGetWebchatSettingsRequest().withHttpInfo());
  }

  private GetWebchatSettingsRequest createGetWebchatSettingsRequest() {
    return GetWebchatSettingsRequest.builder()
            .build();
  }

  /**
   * Get WebChat deployment settings
   * 
   * @param request The request object
   * @return WebChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatSettings getWebchatSettings(GetWebchatSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get WebChat deployment settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatSettings> getWebchatSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a media request in the conversation, setting the state to ACCEPTED/DECLINED/ERRORED
   * 
   * @param conversationId conversationId (required)
   * @param mediaRequestId mediaRequestId (required)
   * @param body Request (required)
   * @return WebChatGuestMediaRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatGuestMediaRequest patchWebchatGuestConversationMediarequest(String conversationId, String mediaRequestId, WebChatGuestMediaRequest body) throws IOException, ApiException {
    return  patchWebchatGuestConversationMediarequest(createPatchWebchatGuestConversationMediarequestRequest(conversationId, mediaRequestId, body));
  }

  /**
   * Update a media request in the conversation, setting the state to ACCEPTED/DECLINED/ERRORED
   * 
   * @param conversationId conversationId (required)
   * @param mediaRequestId mediaRequestId (required)
   * @param body Request (required)
   * @return WebChatGuestMediaRequest
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatGuestMediaRequest> patchWebchatGuestConversationMediarequestWithHttpInfo(String conversationId, String mediaRequestId, WebChatGuestMediaRequest body) throws IOException {
    return patchWebchatGuestConversationMediarequest(createPatchWebchatGuestConversationMediarequestRequest(conversationId, mediaRequestId, body).withHttpInfo());
  }

  private PatchWebchatGuestConversationMediarequestRequest createPatchWebchatGuestConversationMediarequestRequest(String conversationId, String mediaRequestId, WebChatGuestMediaRequest body) {
    return PatchWebchatGuestConversationMediarequestRequest.builder()
            .withConversationId(conversationId)
    
            .withMediaRequestId(mediaRequestId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a media request in the conversation, setting the state to ACCEPTED/DECLINED/ERRORED
   * 
   * @param request The request object
   * @return WebChatGuestMediaRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatGuestMediaRequest patchWebchatGuestConversationMediarequest(PatchWebchatGuestConversationMediarequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatGuestMediaRequest> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatGuestMediaRequest>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a media request in the conversation, setting the state to ACCEPTED/DECLINED/ERRORED
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatGuestMediaRequest> patchWebchatGuestConversationMediarequest(ApiRequest<WebChatGuestMediaRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatGuestMediaRequest>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatGuestMediaRequest> response = (ApiResponse<WebChatGuestMediaRequest>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatGuestMediaRequest> response = (ApiResponse<WebChatGuestMediaRequest>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create WebChat deployment
   * 
   * @param body Deployment (required)
   * @return WebChatDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeployment postWebchatDeployments(WebChatDeployment body) throws IOException, ApiException {
    return  postWebchatDeployments(createPostWebchatDeploymentsRequest(body));
  }

  /**
   * Create WebChat deployment
   * 
   * @param body Deployment (required)
   * @return WebChatDeployment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeployment> postWebchatDeploymentsWithHttpInfo(WebChatDeployment body) throws IOException {
    return postWebchatDeployments(createPostWebchatDeploymentsRequest(body).withHttpInfo());
  }

  private PostWebchatDeploymentsRequest createPostWebchatDeploymentsRequest(WebChatDeployment body) {
    return PostWebchatDeploymentsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create WebChat deployment
   * 
   * @param request The request object
   * @return WebChatDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeployment postWebchatDeployments(PostWebchatDeploymentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatDeployment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatDeployment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create WebChat deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeployment> postWebchatDeployments(ApiRequest<WebChatDeployment> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatDeployment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Send a message in a chat conversation.
   * 
   * @param conversationId conversationId (required)
   * @param memberId memberId (required)
   * @param body Message (required)
   * @return WebChatMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMessage postWebchatGuestConversationMemberMessages(String conversationId, String memberId, CreateWebChatMessageRequest body) throws IOException, ApiException {
    return  postWebchatGuestConversationMemberMessages(createPostWebchatGuestConversationMemberMessagesRequest(conversationId, memberId, body));
  }

  /**
   * Send a message in a chat conversation.
   * 
   * @param conversationId conversationId (required)
   * @param memberId memberId (required)
   * @param body Message (required)
   * @return WebChatMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMessage> postWebchatGuestConversationMemberMessagesWithHttpInfo(String conversationId, String memberId, CreateWebChatMessageRequest body) throws IOException {
    return postWebchatGuestConversationMemberMessages(createPostWebchatGuestConversationMemberMessagesRequest(conversationId, memberId, body).withHttpInfo());
  }

  private PostWebchatGuestConversationMemberMessagesRequest createPostWebchatGuestConversationMemberMessagesRequest(String conversationId, String memberId, CreateWebChatMessageRequest body) {
    return PostWebchatGuestConversationMemberMessagesRequest.builder()
            .withConversationId(conversationId)
    
            .withMemberId(memberId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Send a message in a chat conversation.
   * 
   * @param request The request object
   * @return WebChatMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMessage postWebchatGuestConversationMemberMessages(PostWebchatGuestConversationMemberMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatMessage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatMessage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send a message in a chat conversation.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMessage> postWebchatGuestConversationMemberMessages(ApiRequest<CreateWebChatMessageRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatMessage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatMessage> response = (ApiResponse<WebChatMessage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatMessage> response = (ApiResponse<WebChatMessage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Send a typing-indicator in a chat conversation.
   * 
   * @param conversationId conversationId (required)
   * @param memberId memberId (required)
   * @return WebChatTyping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatTyping postWebchatGuestConversationMemberTyping(String conversationId, String memberId) throws IOException, ApiException {
    return  postWebchatGuestConversationMemberTyping(createPostWebchatGuestConversationMemberTypingRequest(conversationId, memberId));
  }

  /**
   * Send a typing-indicator in a chat conversation.
   * 
   * @param conversationId conversationId (required)
   * @param memberId memberId (required)
   * @return WebChatTyping
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatTyping> postWebchatGuestConversationMemberTypingWithHttpInfo(String conversationId, String memberId) throws IOException {
    return postWebchatGuestConversationMemberTyping(createPostWebchatGuestConversationMemberTypingRequest(conversationId, memberId).withHttpInfo());
  }

  private PostWebchatGuestConversationMemberTypingRequest createPostWebchatGuestConversationMemberTypingRequest(String conversationId, String memberId) {
    return PostWebchatGuestConversationMemberTypingRequest.builder()
            .withConversationId(conversationId)
    
            .withMemberId(memberId)
    
            .build();
  }

  /**
   * Send a typing-indicator in a chat conversation.
   * 
   * @param request The request object
   * @return WebChatTyping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatTyping postWebchatGuestConversationMemberTyping(PostWebchatGuestConversationMemberTypingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatTyping> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatTyping>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send a typing-indicator in a chat conversation.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatTyping> postWebchatGuestConversationMemberTyping(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatTyping>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatTyping> response = (ApiResponse<WebChatTyping>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatTyping> response = (ApiResponse<WebChatTyping>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create an ACD chat conversation from an external customer.
   * This endpoint will create a new ACD Chat conversation under the specified Chat Deployment.  The conversation will begin with a guest member in it (with a role=CUSTOMER) according to the customer information that is supplied. If the guest member is authenticated, the &#39;memberAuthToken&#39; field should include his JWT as generated by the &#39;POST /api/v2/signeddata&#39; resource; if the guest member is anonymous (and the Deployment permits it) this field can be omitted.  The returned data includes the IDs of the conversation created, along with a newly-create JWT token that you can supply to all future endpoints as authentication to perform operations against that conversation. After successfully creating a conversation, you should connect a websocket to the event stream named in the &#39;eventStreamUri&#39; field of the response; the conversation is not routed until the event stream is attached.
   * @param body CreateConversationRequest (required)
   * @return CreateWebChatConversationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateWebChatConversationResponse postWebchatGuestConversations(CreateWebChatConversationRequest body) throws IOException, ApiException {
    return  postWebchatGuestConversations(createPostWebchatGuestConversationsRequest(body));
  }

  /**
   * Create an ACD chat conversation from an external customer.
   * This endpoint will create a new ACD Chat conversation under the specified Chat Deployment.  The conversation will begin with a guest member in it (with a role=CUSTOMER) according to the customer information that is supplied. If the guest member is authenticated, the &#39;memberAuthToken&#39; field should include his JWT as generated by the &#39;POST /api/v2/signeddata&#39; resource; if the guest member is anonymous (and the Deployment permits it) this field can be omitted.  The returned data includes the IDs of the conversation created, along with a newly-create JWT token that you can supply to all future endpoints as authentication to perform operations against that conversation. After successfully creating a conversation, you should connect a websocket to the event stream named in the &#39;eventStreamUri&#39; field of the response; the conversation is not routed until the event stream is attached.
   * @param body CreateConversationRequest (required)
   * @return CreateWebChatConversationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateWebChatConversationResponse> postWebchatGuestConversationsWithHttpInfo(CreateWebChatConversationRequest body) throws IOException {
    return postWebchatGuestConversations(createPostWebchatGuestConversationsRequest(body).withHttpInfo());
  }

  private PostWebchatGuestConversationsRequest createPostWebchatGuestConversationsRequest(CreateWebChatConversationRequest body) {
    return PostWebchatGuestConversationsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create an ACD chat conversation from an external customer.
   * This endpoint will create a new ACD Chat conversation under the specified Chat Deployment.  The conversation will begin with a guest member in it (with a role=CUSTOMER) according to the customer information that is supplied. If the guest member is authenticated, the &#39;memberAuthToken&#39; field should include his JWT as generated by the &#39;POST /api/v2/signeddata&#39; resource; if the guest member is anonymous (and the Deployment permits it) this field can be omitted.  The returned data includes the IDs of the conversation created, along with a newly-create JWT token that you can supply to all future endpoints as authentication to perform operations against that conversation. After successfully creating a conversation, you should connect a websocket to the event stream named in the &#39;eventStreamUri&#39; field of the response; the conversation is not routed until the event stream is attached.
   * @param request The request object
   * @return CreateWebChatConversationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateWebChatConversationResponse postWebchatGuestConversations(PostWebchatGuestConversationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CreateWebChatConversationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CreateWebChatConversationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an ACD chat conversation from an external customer.
   * This endpoint will create a new ACD Chat conversation under the specified Chat Deployment.  The conversation will begin with a guest member in it (with a role=CUSTOMER) according to the customer information that is supplied. If the guest member is authenticated, the &#39;memberAuthToken&#39; field should include his JWT as generated by the &#39;POST /api/v2/signeddata&#39; resource; if the guest member is anonymous (and the Deployment permits it) this field can be omitted.  The returned data includes the IDs of the conversation created, along with a newly-create JWT token that you can supply to all future endpoints as authentication to perform operations against that conversation. After successfully creating a conversation, you should connect a websocket to the event stream named in the &#39;eventStreamUri&#39; field of the response; the conversation is not routed until the event stream is attached.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateWebChatConversationResponse> postWebchatGuestConversations(ApiRequest<CreateWebChatConversationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CreateWebChatConversationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CreateWebChatConversationResponse> response = (ApiResponse<CreateWebChatConversationResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CreateWebChatConversationResponse> response = (ApiResponse<CreateWebChatConversationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a WebChat deployment
   * 
   * @param deploymentId Deployment Id (required)
   * @param body Deployment (required)
   * @return WebChatDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeployment putWebchatDeployment(String deploymentId, WebChatDeployment body) throws IOException, ApiException {
    return  putWebchatDeployment(createPutWebchatDeploymentRequest(deploymentId, body));
  }

  /**
   * Update a WebChat deployment
   * 
   * @param deploymentId Deployment Id (required)
   * @param body Deployment (required)
   * @return WebChatDeployment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeployment> putWebchatDeploymentWithHttpInfo(String deploymentId, WebChatDeployment body) throws IOException {
    return putWebchatDeployment(createPutWebchatDeploymentRequest(deploymentId, body).withHttpInfo());
  }

  private PutWebchatDeploymentRequest createPutWebchatDeploymentRequest(String deploymentId, WebChatDeployment body) {
    return PutWebchatDeploymentRequest.builder()
            .withDeploymentId(deploymentId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a WebChat deployment
   * 
   * @param request The request object
   * @return WebChatDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeployment putWebchatDeployment(PutWebchatDeploymentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatDeployment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatDeployment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a WebChat deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeployment> putWebchatDeployment(ApiRequest<WebChatDeployment> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatDeployment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update WebChat deployment settings
   * 
   * @param body webChatSettings (required)
   * @return WebChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatSettings putWebchatSettings(WebChatSettings body) throws IOException, ApiException {
    return  putWebchatSettings(createPutWebchatSettingsRequest(body));
  }

  /**
   * Update WebChat deployment settings
   * 
   * @param body webChatSettings (required)
   * @return WebChatSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatSettings> putWebchatSettingsWithHttpInfo(WebChatSettings body) throws IOException {
    return putWebchatSettings(createPutWebchatSettingsRequest(body).withHttpInfo());
  }

  private PutWebchatSettingsRequest createPutWebchatSettingsRequest(WebChatSettings body) {
    return PutWebchatSettingsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update WebChat deployment settings
   * 
   * @param request The request object
   * @return WebChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatSettings putWebchatSettings(PutWebchatSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update WebChat deployment settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatSettings> putWebchatSettings(ApiRequest<WebChatSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
