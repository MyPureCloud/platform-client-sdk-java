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
import com.mypurecloud.sdk.v2.model.VoicemailMailboxInfo;
import com.mypurecloud.sdk.v2.model.VoicemailMessageEntityListing;
import com.mypurecloud.sdk.v2.model.VoicemailGroupPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailUserPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailMediaInfo;
import com.mypurecloud.sdk.v2.model.VoicemailOrganizationPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailsSearchResponse;
import com.mypurecloud.sdk.v2.model.CopyVoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailSearchRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteVoicemailMessageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteVoicemailMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailGroupMailboxRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailGroupMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailGroupPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMailboxRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMeMailboxRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMeMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMePolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMessageMediaRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailQueueMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailUserpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailGroupPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailMePolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailMessageRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailUserpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PostVoicemailMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostVoicemailSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PutVoicemailMessageRequest;
import com.mypurecloud.sdk.v2.api.request.PutVoicemailPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PutVoicemailUserpolicyRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VoicemailApi {
  private final ApiClient pcapiClient;

  public VoicemailApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VoicemailApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a voicemail message.
   * A user voicemail can only be deleted by its associated user. A group voicemail can only be deleted by a user that is a member of the group. A queue voicemail can only be deleted by a user with the acd voicemail delete permission.
   * @param messageId Message ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteVoicemailMessage(String messageId) throws IOException, ApiException {
     deleteVoicemailMessage(createDeleteVoicemailMessageRequest(messageId));
  }

  /**
   * Delete a voicemail message.
   * A user voicemail can only be deleted by its associated user. A group voicemail can only be deleted by a user that is a member of the group. A queue voicemail can only be deleted by a user with the acd voicemail delete permission.
   * @param messageId Message ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteVoicemailMessageWithHttpInfo(String messageId) throws IOException {
    return deleteVoicemailMessage(createDeleteVoicemailMessageRequest(messageId).withHttpInfo());
  }

  private DeleteVoicemailMessageRequest createDeleteVoicemailMessageRequest(String messageId) {
    return DeleteVoicemailMessageRequest.builder()
            .withMessageId(messageId)
    
            .build();
  }

  /**
   * Delete a voicemail message.
   * A user voicemail can only be deleted by its associated user. A group voicemail can only be deleted by a user that is a member of the group. A queue voicemail can only be deleted by a user with the acd voicemail delete permission.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteVoicemailMessage(DeleteVoicemailMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a voicemail message.
   * A user voicemail can only be deleted by its associated user. A group voicemail can only be deleted by a user that is a member of the group. A queue voicemail can only be deleted by a user with the acd voicemail delete permission.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteVoicemailMessage(ApiRequest<Void> request) throws IOException {
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
   * Delete all voicemail messages
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteVoicemailMessages() throws IOException, ApiException {
     deleteVoicemailMessages(createDeleteVoicemailMessagesRequest());
  }

  /**
   * Delete all voicemail messages
   * 
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteVoicemailMessagesWithHttpInfo() throws IOException {
    return deleteVoicemailMessages(createDeleteVoicemailMessagesRequest().withHttpInfo());
  }

  private DeleteVoicemailMessagesRequest createDeleteVoicemailMessagesRequest() {
    return DeleteVoicemailMessagesRequest.builder()
            .build();
  }

  /**
   * Delete all voicemail messages
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteVoicemailMessages(DeleteVoicemailMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete all voicemail messages
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteVoicemailMessages(ApiRequest<Void> request) throws IOException {
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
   * Get the group&#39;s mailbox information
   * 
   * @param groupId groupId (required)
   * @return VoicemailMailboxInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMailboxInfo getVoicemailGroupMailbox(String groupId) throws IOException, ApiException {
    return  getVoicemailGroupMailbox(createGetVoicemailGroupMailboxRequest(groupId));
  }

  /**
   * Get the group&#39;s mailbox information
   * 
   * @param groupId groupId (required)
   * @return VoicemailMailboxInfo
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMailboxInfo> getVoicemailGroupMailboxWithHttpInfo(String groupId) throws IOException {
    return getVoicemailGroupMailbox(createGetVoicemailGroupMailboxRequest(groupId).withHttpInfo());
  }

  private GetVoicemailGroupMailboxRequest createGetVoicemailGroupMailboxRequest(String groupId) {
    return GetVoicemailGroupMailboxRequest.builder()
            .withGroupId(groupId)
    
            .build();
  }

  /**
   * Get the group&#39;s mailbox information
   * 
   * @param request The request object
   * @return VoicemailMailboxInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMailboxInfo getVoicemailGroupMailbox(GetVoicemailGroupMailboxRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailMailboxInfo> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailMailboxInfo>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the group&#39;s mailbox information
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMailboxInfo> getVoicemailGroupMailbox(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailMailboxInfo>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMailboxInfo> response = (ApiResponse<VoicemailMailboxInfo>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMailboxInfo> response = (ApiResponse<VoicemailMailboxInfo>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List voicemail messages
   * 
   * @param groupId Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return VoicemailMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessageEntityListing getVoicemailGroupMessages(String groupId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getVoicemailGroupMessages(createGetVoicemailGroupMessagesRequest(groupId, pageSize, pageNumber));
  }

  /**
   * List voicemail messages
   * 
   * @param groupId Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return VoicemailMessageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailGroupMessagesWithHttpInfo(String groupId, Integer pageSize, Integer pageNumber) throws IOException {
    return getVoicemailGroupMessages(createGetVoicemailGroupMessagesRequest(groupId, pageSize, pageNumber).withHttpInfo());
  }

  private GetVoicemailGroupMessagesRequest createGetVoicemailGroupMessagesRequest(String groupId, Integer pageSize, Integer pageNumber) {
    return GetVoicemailGroupMessagesRequest.builder()
            .withGroupId(groupId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * List voicemail messages
   * 
   * @param request The request object
   * @return VoicemailMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessageEntityListing getVoicemailGroupMessages(GetVoicemailGroupMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailMessageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List voicemail messages
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailGroupMessages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailMessageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a group&#39;s voicemail policy
   * 
   * @param groupId Group ID (required)
   * @return VoicemailGroupPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailGroupPolicy getVoicemailGroupPolicy(String groupId) throws IOException, ApiException {
    return  getVoicemailGroupPolicy(createGetVoicemailGroupPolicyRequest(groupId));
  }

  /**
   * Get a group&#39;s voicemail policy
   * 
   * @param groupId Group ID (required)
   * @return VoicemailGroupPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailGroupPolicy> getVoicemailGroupPolicyWithHttpInfo(String groupId) throws IOException {
    return getVoicemailGroupPolicy(createGetVoicemailGroupPolicyRequest(groupId).withHttpInfo());
  }

  private GetVoicemailGroupPolicyRequest createGetVoicemailGroupPolicyRequest(String groupId) {
    return GetVoicemailGroupPolicyRequest.builder()
            .withGroupId(groupId)
    
            .build();
  }

  /**
   * Get a group&#39;s voicemail policy
   * 
   * @param request The request object
   * @return VoicemailGroupPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailGroupPolicy getVoicemailGroupPolicy(GetVoicemailGroupPolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailGroupPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailGroupPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a group&#39;s voicemail policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailGroupPolicy> getVoicemailGroupPolicy(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailGroupPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailGroupPolicy> response = (ApiResponse<VoicemailGroupPolicy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailGroupPolicy> response = (ApiResponse<VoicemailGroupPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the current user&#39;s mailbox information
   * 
   * @return VoicemailMailboxInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMailboxInfo getVoicemailMailbox() throws IOException, ApiException {
    return  getVoicemailMailbox(createGetVoicemailMailboxRequest());
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @return VoicemailMailboxInfo
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMailboxInfo> getVoicemailMailboxWithHttpInfo() throws IOException {
    return getVoicemailMailbox(createGetVoicemailMailboxRequest().withHttpInfo());
  }

  private GetVoicemailMailboxRequest createGetVoicemailMailboxRequest() {
    return GetVoicemailMailboxRequest.builder()
            .build();
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @param request The request object
   * @return VoicemailMailboxInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMailboxInfo getVoicemailMailbox(GetVoicemailMailboxRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailMailboxInfo> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailMailboxInfo>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMailboxInfo> getVoicemailMailbox(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailMailboxInfo>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMailboxInfo> response = (ApiResponse<VoicemailMailboxInfo>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMailboxInfo> response = (ApiResponse<VoicemailMailboxInfo>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the current user&#39;s mailbox information
   * 
   * @return VoicemailMailboxInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMailboxInfo getVoicemailMeMailbox() throws IOException, ApiException {
    return  getVoicemailMeMailbox(createGetVoicemailMeMailboxRequest());
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @return VoicemailMailboxInfo
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMailboxInfo> getVoicemailMeMailboxWithHttpInfo() throws IOException {
    return getVoicemailMeMailbox(createGetVoicemailMeMailboxRequest().withHttpInfo());
  }

  private GetVoicemailMeMailboxRequest createGetVoicemailMeMailboxRequest() {
    return GetVoicemailMeMailboxRequest.builder()
            .build();
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @param request The request object
   * @return VoicemailMailboxInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMailboxInfo getVoicemailMeMailbox(GetVoicemailMeMailboxRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailMailboxInfo> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailMailboxInfo>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMailboxInfo> getVoicemailMeMailbox(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailMailboxInfo>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMailboxInfo> response = (ApiResponse<VoicemailMailboxInfo>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMailboxInfo> response = (ApiResponse<VoicemailMailboxInfo>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List voicemail messages
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return VoicemailMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessageEntityListing getVoicemailMeMessages(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getVoicemailMeMessages(createGetVoicemailMeMessagesRequest(pageSize, pageNumber));
  }

  /**
   * List voicemail messages
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return VoicemailMessageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailMeMessagesWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getVoicemailMeMessages(createGetVoicemailMeMessagesRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetVoicemailMeMessagesRequest createGetVoicemailMeMessagesRequest(Integer pageSize, Integer pageNumber) {
    return GetVoicemailMeMessagesRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * List voicemail messages
   * 
   * @param request The request object
   * @return VoicemailMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessageEntityListing getVoicemailMeMessages(GetVoicemailMeMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailMessageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List voicemail messages
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailMeMessages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailMessageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the current user&#39;s voicemail policy
   * 
   * @return VoicemailUserPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailUserPolicy getVoicemailMePolicy() throws IOException, ApiException {
    return  getVoicemailMePolicy(createGetVoicemailMePolicyRequest());
  }

  /**
   * Get the current user&#39;s voicemail policy
   * 
   * @return VoicemailUserPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailUserPolicy> getVoicemailMePolicyWithHttpInfo() throws IOException {
    return getVoicemailMePolicy(createGetVoicemailMePolicyRequest().withHttpInfo());
  }

  private GetVoicemailMePolicyRequest createGetVoicemailMePolicyRequest() {
    return GetVoicemailMePolicyRequest.builder()
            .build();
  }

  /**
   * Get the current user&#39;s voicemail policy
   * 
   * @param request The request object
   * @return VoicemailUserPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailUserPolicy getVoicemailMePolicy(GetVoicemailMePolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailUserPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the current user&#39;s voicemail policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailUserPolicy> getVoicemailMePolicy(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailUserPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a voicemail message
   * 
   * @param messageId Message ID (required)
   * @param expand If the caller is a known user, which fields, if any, to expand (optional)
   * @return VoicemailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessage getVoicemailMessage(String messageId, List<String> expand) throws IOException, ApiException {
    return  getVoicemailMessage(createGetVoicemailMessageRequest(messageId, expand));
  }

  /**
   * Get a voicemail message
   * 
   * @param messageId Message ID (required)
   * @param expand If the caller is a known user, which fields, if any, to expand (optional)
   * @return VoicemailMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessage> getVoicemailMessageWithHttpInfo(String messageId, List<String> expand) throws IOException {
    return getVoicemailMessage(createGetVoicemailMessageRequest(messageId, expand).withHttpInfo());
  }

  private GetVoicemailMessageRequest createGetVoicemailMessageRequest(String messageId, List<String> expand) {
    return GetVoicemailMessageRequest.builder()
            .withMessageId(messageId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a voicemail message
   * 
   * @param request The request object
   * @return VoicemailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessage getVoicemailMessage(GetVoicemailMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailMessage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a voicemail message
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessage> getVoicemailMessage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailMessage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get media playback URI for this voicemail message
   * 
   * @param messageId Message ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @return VoicemailMediaInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMediaInfo getVoicemailMessageMedia(String messageId, String formatId) throws IOException, ApiException {
    return  getVoicemailMessageMedia(createGetVoicemailMessageMediaRequest(messageId, formatId));
  }

  /**
   * Get media playback URI for this voicemail message
   * 
   * @param messageId Message ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @return VoicemailMediaInfo
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMediaInfo> getVoicemailMessageMediaWithHttpInfo(String messageId, String formatId) throws IOException {
    return getVoicemailMessageMedia(createGetVoicemailMessageMediaRequest(messageId, formatId).withHttpInfo());
  }

  private GetVoicemailMessageMediaRequest createGetVoicemailMessageMediaRequest(String messageId, String formatId) {
    return GetVoicemailMessageMediaRequest.builder()
            .withMessageId(messageId)
    
            .withFormatId(formatId)
    
            .build();
  }

  /**
   * Get media playback URI for this voicemail message
   * 
   * @param request The request object
   * @return VoicemailMediaInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMediaInfo getVoicemailMessageMedia(GetVoicemailMessageMediaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailMediaInfo> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailMediaInfo>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get media playback URI for this voicemail message
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMediaInfo> getVoicemailMessageMedia(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailMediaInfo>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMediaInfo> response = (ApiResponse<VoicemailMediaInfo>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMediaInfo> response = (ApiResponse<VoicemailMediaInfo>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List voicemail messages
   * 
   * @param ids An optional comma separated list of VoicemailMessage ids (optional)
   * @param expand If the caller is a known user, which fields, if any, to expand (optional)
   * @return VoicemailMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessageEntityListing getVoicemailMessages(String ids, List<String> expand) throws IOException, ApiException {
    return  getVoicemailMessages(createGetVoicemailMessagesRequest(ids, expand));
  }

  /**
   * List voicemail messages
   * 
   * @param ids An optional comma separated list of VoicemailMessage ids (optional)
   * @param expand If the caller is a known user, which fields, if any, to expand (optional)
   * @return VoicemailMessageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailMessagesWithHttpInfo(String ids, List<String> expand) throws IOException {
    return getVoicemailMessages(createGetVoicemailMessagesRequest(ids, expand).withHttpInfo());
  }

  private GetVoicemailMessagesRequest createGetVoicemailMessagesRequest(String ids, List<String> expand) {
    return GetVoicemailMessagesRequest.builder()
            .withIds(ids)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * List voicemail messages
   * 
   * @param request The request object
   * @return VoicemailMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessageEntityListing getVoicemailMessages(GetVoicemailMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailMessageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List voicemail messages
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailMessages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailMessageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a policy
   * 
   * @return VoicemailOrganizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailOrganizationPolicy getVoicemailPolicy() throws IOException, ApiException {
    return  getVoicemailPolicy(createGetVoicemailPolicyRequest());
  }

  /**
   * Get a policy
   * 
   * @return VoicemailOrganizationPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailOrganizationPolicy> getVoicemailPolicyWithHttpInfo() throws IOException {
    return getVoicemailPolicy(createGetVoicemailPolicyRequest().withHttpInfo());
  }

  private GetVoicemailPolicyRequest createGetVoicemailPolicyRequest() {
    return GetVoicemailPolicyRequest.builder()
            .build();
  }

  /**
   * Get a policy
   * 
   * @param request The request object
   * @return VoicemailOrganizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailOrganizationPolicy getVoicemailPolicy(GetVoicemailPolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailOrganizationPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailOrganizationPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailOrganizationPolicy> getVoicemailPolicy(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailOrganizationPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailOrganizationPolicy> response = (ApiResponse<VoicemailOrganizationPolicy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailOrganizationPolicy> response = (ApiResponse<VoicemailOrganizationPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List voicemail messages
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return VoicemailMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessageEntityListing getVoicemailQueueMessages(String queueId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getVoicemailQueueMessages(createGetVoicemailQueueMessagesRequest(queueId, pageSize, pageNumber));
  }

  /**
   * List voicemail messages
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return VoicemailMessageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailQueueMessagesWithHttpInfo(String queueId, Integer pageSize, Integer pageNumber) throws IOException {
    return getVoicemailQueueMessages(createGetVoicemailQueueMessagesRequest(queueId, pageSize, pageNumber).withHttpInfo());
  }

  private GetVoicemailQueueMessagesRequest createGetVoicemailQueueMessagesRequest(String queueId, Integer pageSize, Integer pageNumber) {
    return GetVoicemailQueueMessagesRequest.builder()
            .withQueueId(queueId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * List voicemail messages
   * 
   * @param request The request object
   * @return VoicemailMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessageEntityListing getVoicemailQueueMessages(GetVoicemailQueueMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailMessageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List voicemail messages
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailQueueMessages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailMessageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return VoicemailsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailsSearchResponse getVoicemailSearch(String q64, List<String> expand) throws IOException, ApiException {
    return  getVoicemailSearch(createGetVoicemailSearchRequest(q64, expand));
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return VoicemailsSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailsSearchResponse> getVoicemailSearchWithHttpInfo(String q64, List<String> expand) throws IOException {
    return getVoicemailSearch(createGetVoicemailSearchRequest(q64, expand).withHttpInfo());
  }

  private GetVoicemailSearchRequest createGetVoicemailSearchRequest(String q64, List<String> expand) {
    return GetVoicemailSearchRequest.builder()
            .withQ64(q64)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return VoicemailsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailsSearchResponse getVoicemailSearch(GetVoicemailSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailsSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailsSearchResponse> getVoicemailSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailsSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailsSearchResponse> response = (ApiResponse<VoicemailsSearchResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailsSearchResponse> response = (ApiResponse<VoicemailsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a user&#39;s voicemail policy
   * 
   * @param userId User ID (required)
   * @return VoicemailUserPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailUserPolicy getVoicemailUserpolicy(String userId) throws IOException, ApiException {
    return  getVoicemailUserpolicy(createGetVoicemailUserpolicyRequest(userId));
  }

  /**
   * Get a user&#39;s voicemail policy
   * 
   * @param userId User ID (required)
   * @return VoicemailUserPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailUserPolicy> getVoicemailUserpolicyWithHttpInfo(String userId) throws IOException {
    return getVoicemailUserpolicy(createGetVoicemailUserpolicyRequest(userId).withHttpInfo());
  }

  private GetVoicemailUserpolicyRequest createGetVoicemailUserpolicyRequest(String userId) {
    return GetVoicemailUserpolicyRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get a user&#39;s voicemail policy
   * 
   * @param request The request object
   * @return VoicemailUserPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailUserPolicy getVoicemailUserpolicy(GetVoicemailUserpolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailUserPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user&#39;s voicemail policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailUserPolicy> getVoicemailUserpolicy(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailUserPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a group&#39;s voicemail policy
   * 
   * @param groupId Group ID (required)
   * @param body The group&#39;s voicemail policy (required)
   * @return VoicemailGroupPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailGroupPolicy patchVoicemailGroupPolicy(String groupId, VoicemailGroupPolicy body) throws IOException, ApiException {
    return  patchVoicemailGroupPolicy(createPatchVoicemailGroupPolicyRequest(groupId, body));
  }

  /**
   * Update a group&#39;s voicemail policy
   * 
   * @param groupId Group ID (required)
   * @param body The group&#39;s voicemail policy (required)
   * @return VoicemailGroupPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailGroupPolicy> patchVoicemailGroupPolicyWithHttpInfo(String groupId, VoicemailGroupPolicy body) throws IOException {
    return patchVoicemailGroupPolicy(createPatchVoicemailGroupPolicyRequest(groupId, body).withHttpInfo());
  }

  private PatchVoicemailGroupPolicyRequest createPatchVoicemailGroupPolicyRequest(String groupId, VoicemailGroupPolicy body) {
    return PatchVoicemailGroupPolicyRequest.builder()
            .withGroupId(groupId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a group&#39;s voicemail policy
   * 
   * @param request The request object
   * @return VoicemailGroupPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailGroupPolicy patchVoicemailGroupPolicy(PatchVoicemailGroupPolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailGroupPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailGroupPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a group&#39;s voicemail policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailGroupPolicy> patchVoicemailGroupPolicy(ApiRequest<VoicemailGroupPolicy> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailGroupPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailGroupPolicy> response = (ApiResponse<VoicemailGroupPolicy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailGroupPolicy> response = (ApiResponse<VoicemailGroupPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update the current user&#39;s voicemail policy
   * 
   * @param body The user&#39;s voicemail policy (required)
   * @return VoicemailUserPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailUserPolicy patchVoicemailMePolicy(VoicemailUserPolicy body) throws IOException, ApiException {
    return  patchVoicemailMePolicy(createPatchVoicemailMePolicyRequest(body));
  }

  /**
   * Update the current user&#39;s voicemail policy
   * 
   * @param body The user&#39;s voicemail policy (required)
   * @return VoicemailUserPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailUserPolicy> patchVoicemailMePolicyWithHttpInfo(VoicemailUserPolicy body) throws IOException {
    return patchVoicemailMePolicy(createPatchVoicemailMePolicyRequest(body).withHttpInfo());
  }

  private PatchVoicemailMePolicyRequest createPatchVoicemailMePolicyRequest(VoicemailUserPolicy body) {
    return PatchVoicemailMePolicyRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update the current user&#39;s voicemail policy
   * 
   * @param request The request object
   * @return VoicemailUserPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailUserPolicy patchVoicemailMePolicy(PatchVoicemailMePolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailUserPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the current user&#39;s voicemail policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailUserPolicy> patchVoicemailMePolicy(ApiRequest<VoicemailUserPolicy> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailUserPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a voicemail message
   * A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.
   * @param messageId Message ID (required)
   * @param body VoicemailMessage (required)
   * @return VoicemailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessage patchVoicemailMessage(String messageId, VoicemailMessage body) throws IOException, ApiException {
    return  patchVoicemailMessage(createPatchVoicemailMessageRequest(messageId, body));
  }

  /**
   * Update a voicemail message
   * A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.
   * @param messageId Message ID (required)
   * @param body VoicemailMessage (required)
   * @return VoicemailMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessage> patchVoicemailMessageWithHttpInfo(String messageId, VoicemailMessage body) throws IOException {
    return patchVoicemailMessage(createPatchVoicemailMessageRequest(messageId, body).withHttpInfo());
  }

  private PatchVoicemailMessageRequest createPatchVoicemailMessageRequest(String messageId, VoicemailMessage body) {
    return PatchVoicemailMessageRequest.builder()
            .withMessageId(messageId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a voicemail message
   * A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.
   * @param request The request object
   * @return VoicemailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessage patchVoicemailMessage(PatchVoicemailMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailMessage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a voicemail message
   * A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessage> patchVoicemailMessage(ApiRequest<VoicemailMessage> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailMessage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a user&#39;s voicemail policy
   * 
   * @param userId User ID (required)
   * @param body The user&#39;s voicemail policy (required)
   * @return VoicemailUserPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailUserPolicy patchVoicemailUserpolicy(String userId, VoicemailUserPolicy body) throws IOException, ApiException {
    return  patchVoicemailUserpolicy(createPatchVoicemailUserpolicyRequest(userId, body));
  }

  /**
   * Update a user&#39;s voicemail policy
   * 
   * @param userId User ID (required)
   * @param body The user&#39;s voicemail policy (required)
   * @return VoicemailUserPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailUserPolicy> patchVoicemailUserpolicyWithHttpInfo(String userId, VoicemailUserPolicy body) throws IOException {
    return patchVoicemailUserpolicy(createPatchVoicemailUserpolicyRequest(userId, body).withHttpInfo());
  }

  private PatchVoicemailUserpolicyRequest createPatchVoicemailUserpolicyRequest(String userId, VoicemailUserPolicy body) {
    return PatchVoicemailUserpolicyRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a user&#39;s voicemail policy
   * 
   * @param request The request object
   * @return VoicemailUserPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailUserPolicy patchVoicemailUserpolicy(PatchVoicemailUserpolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailUserPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a user&#39;s voicemail policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailUserPolicy> patchVoicemailUserpolicy(ApiRequest<VoicemailUserPolicy> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailUserPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Copy a voicemail message to a user or group
   * 
   * @param body  (optional)
   * @return VoicemailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessage postVoicemailMessages(CopyVoicemailMessage body) throws IOException, ApiException {
    return  postVoicemailMessages(createPostVoicemailMessagesRequest(body));
  }

  /**
   * Copy a voicemail message to a user or group
   * 
   * @param body  (optional)
   * @return VoicemailMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessage> postVoicemailMessagesWithHttpInfo(CopyVoicemailMessage body) throws IOException {
    return postVoicemailMessages(createPostVoicemailMessagesRequest(body).withHttpInfo());
  }

  private PostVoicemailMessagesRequest createPostVoicemailMessagesRequest(CopyVoicemailMessage body) {
    return PostVoicemailMessagesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Copy a voicemail message to a user or group
   * 
   * @param request The request object
   * @return VoicemailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessage postVoicemailMessages(PostVoicemailMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailMessage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Copy a voicemail message to a user or group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessage> postVoicemailMessages(ApiRequest<CopyVoicemailMessage> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailMessage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search voicemails
   * 
   * @param body Search request options (required)
   * @return VoicemailsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailsSearchResponse postVoicemailSearch(VoicemailSearchRequest body) throws IOException, ApiException {
    return  postVoicemailSearch(createPostVoicemailSearchRequest(body));
  }

  /**
   * Search voicemails
   * 
   * @param body Search request options (required)
   * @return VoicemailsSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailsSearchResponse> postVoicemailSearchWithHttpInfo(VoicemailSearchRequest body) throws IOException {
    return postVoicemailSearch(createPostVoicemailSearchRequest(body).withHttpInfo());
  }

  private PostVoicemailSearchRequest createPostVoicemailSearchRequest(VoicemailSearchRequest body) {
    return PostVoicemailSearchRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Search voicemails
   * 
   * @param request The request object
   * @return VoicemailsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailsSearchResponse postVoicemailSearch(PostVoicemailSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailsSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search voicemails
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailsSearchResponse> postVoicemailSearch(ApiRequest<VoicemailSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailsSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailsSearchResponse> response = (ApiResponse<VoicemailsSearchResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailsSearchResponse> response = (ApiResponse<VoicemailsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a voicemail message
   * A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.
   * @param messageId Message ID (required)
   * @param body VoicemailMessage (required)
   * @return VoicemailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessage putVoicemailMessage(String messageId, VoicemailMessage body) throws IOException, ApiException {
    return  putVoicemailMessage(createPutVoicemailMessageRequest(messageId, body));
  }

  /**
   * Update a voicemail message
   * A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.
   * @param messageId Message ID (required)
   * @param body VoicemailMessage (required)
   * @return VoicemailMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessage> putVoicemailMessageWithHttpInfo(String messageId, VoicemailMessage body) throws IOException {
    return putVoicemailMessage(createPutVoicemailMessageRequest(messageId, body).withHttpInfo());
  }

  private PutVoicemailMessageRequest createPutVoicemailMessageRequest(String messageId, VoicemailMessage body) {
    return PutVoicemailMessageRequest.builder()
            .withMessageId(messageId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a voicemail message
   * A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.
   * @param request The request object
   * @return VoicemailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailMessage putVoicemailMessage(PutVoicemailMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailMessage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a voicemail message
   * A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailMessage> putVoicemailMessage(ApiRequest<VoicemailMessage> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailMessage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a policy
   * 
   * @param body Policy (required)
   * @return VoicemailOrganizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailOrganizationPolicy putVoicemailPolicy(VoicemailOrganizationPolicy body) throws IOException, ApiException {
    return  putVoicemailPolicy(createPutVoicemailPolicyRequest(body));
  }

  /**
   * Update a policy
   * 
   * @param body Policy (required)
   * @return VoicemailOrganizationPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailOrganizationPolicy> putVoicemailPolicyWithHttpInfo(VoicemailOrganizationPolicy body) throws IOException {
    return putVoicemailPolicy(createPutVoicemailPolicyRequest(body).withHttpInfo());
  }

  private PutVoicemailPolicyRequest createPutVoicemailPolicyRequest(VoicemailOrganizationPolicy body) {
    return PutVoicemailPolicyRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update a policy
   * 
   * @param request The request object
   * @return VoicemailOrganizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailOrganizationPolicy putVoicemailPolicy(PutVoicemailPolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailOrganizationPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailOrganizationPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailOrganizationPolicy> putVoicemailPolicy(ApiRequest<VoicemailOrganizationPolicy> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailOrganizationPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailOrganizationPolicy> response = (ApiResponse<VoicemailOrganizationPolicy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailOrganizationPolicy> response = (ApiResponse<VoicemailOrganizationPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a user&#39;s voicemail policy
   * 
   * @param userId User ID (required)
   * @param body The user&#39;s voicemail policy (required)
   * @return VoicemailUserPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailUserPolicy putVoicemailUserpolicy(String userId, VoicemailUserPolicy body) throws IOException, ApiException {
    return  putVoicemailUserpolicy(createPutVoicemailUserpolicyRequest(userId, body));
  }

  /**
   * Update a user&#39;s voicemail policy
   * 
   * @param userId User ID (required)
   * @param body The user&#39;s voicemail policy (required)
   * @return VoicemailUserPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailUserPolicy> putVoicemailUserpolicyWithHttpInfo(String userId, VoicemailUserPolicy body) throws IOException {
    return putVoicemailUserpolicy(createPutVoicemailUserpolicyRequest(userId, body).withHttpInfo());
  }

  private PutVoicemailUserpolicyRequest createPutVoicemailUserpolicyRequest(String userId, VoicemailUserPolicy body) {
    return PutVoicemailUserpolicyRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a user&#39;s voicemail policy
   * 
   * @param request The request object
   * @return VoicemailUserPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailUserPolicy putVoicemailUserpolicy(PutVoicemailUserpolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailUserPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a user&#39;s voicemail policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailUserPolicy> putVoicemailUserpolicy(ApiRequest<VoicemailUserPolicy> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailUserPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
