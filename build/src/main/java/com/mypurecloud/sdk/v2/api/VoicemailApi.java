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
import com.mypurecloud.sdk.v2.api.request.GetVoicemailSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailUserpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailGroupPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailMePolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailUserpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PostVoicemailMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostVoicemailSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PutVoicemailMessageRequest;
import com.mypurecloud.sdk.v2.api.request.PutVoicemailPolicyRequest;

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
   * Delete a message.
   * 
   * @param messageId Message ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteVoicemailMessage(String messageId) throws ApiException {
    return deleteVoicemailMessageWithHttpInfo(messageId).getBody();
  }

  /**
   * Delete a message.
   * 
   * @param messageId Message ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteVoicemailMessageWithHttpInfo(String messageId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling deleteVoicemailMessage");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/messages/{messageId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageId" + "\\}", pcapiClient.escapeString(messageId.toString()));

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
   * Delete a message.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteVoicemailMessage(DeleteVoicemailMessageRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a message.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteVoicemailMessage(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete all voicemail messages
   * 
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteVoicemailMessages() throws ApiException {
    return deleteVoicemailMessagesWithHttpInfo().getBody();
  }

  /**
   * Delete all voicemail messages
   * 
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteVoicemailMessagesWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/messages".replaceAll("\\{format\\}","json");

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
   * Delete all voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteVoicemailMessages(DeleteVoicemailMessagesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete all voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteVoicemailMessages(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Get the group&#39;s mailbox information
   * 
   * @param groupId groupId (required)
   * @return VoicemailMailboxInfo
   * @throws ApiException if fails to make API call
   */
  public VoicemailMailboxInfo getVoicemailGroupMailbox(String groupId) throws ApiException {
    return getVoicemailGroupMailboxWithHttpInfo(groupId).getBody();
  }

  /**
   * Get the group&#39;s mailbox information
   * 
   * @param groupId groupId (required)
   * @return VoicemailMailboxInfo
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMailboxInfo> getVoicemailGroupMailboxWithHttpInfo(String groupId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getVoicemailGroupMailbox");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/groups/{groupId}/mailbox".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailMailboxInfo>() {});
  }

  /**
   * Get the group&#39;s mailbox information
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailMailboxInfo getVoicemailGroupMailbox(GetVoicemailGroupMailboxRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailMailboxInfo>() {});
  }

  /**
   * Get the group&#39;s mailbox information
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMailboxInfo> getVoicemailGroupMailbox(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VoicemailMailboxInfo>invokeAPIVerbose(request, new TypeReference<VoicemailMailboxInfo>() {});
  }

  /**
   * List voicemail messages
   * 
   * @param groupId Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return VoicemailMessageEntityListing
   * @throws ApiException if fails to make API call
   */
  public VoicemailMessageEntityListing getVoicemailGroupMessages(String groupId, Integer pageSize, Integer pageNumber) throws ApiException {
    return getVoicemailGroupMessagesWithHttpInfo(groupId, pageSize, pageNumber).getBody();
  }

  /**
   * List voicemail messages
   * 
   * @param groupId Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return VoicemailMessageEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailGroupMessagesWithHttpInfo(String groupId, Integer pageSize, Integer pageNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getVoicemailGroupMessages");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/groups/{groupId}/messages".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailMessageEntityListing>() {});
  }

  /**
   * List voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailMessageEntityListing getVoicemailGroupMessages(GetVoicemailGroupMessagesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {});
  }

  /**
   * List voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailGroupMessages(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VoicemailMessageEntityListing>invokeAPIVerbose(request, new TypeReference<VoicemailMessageEntityListing>() {});
  }

  /**
   * Get a group&#39;s voicemail policy
   * 
   * @param groupId Group ID (required)
   * @return VoicemailGroupPolicy
   * @throws ApiException if fails to make API call
   */
  public VoicemailGroupPolicy getVoicemailGroupPolicy(String groupId) throws ApiException {
    return getVoicemailGroupPolicyWithHttpInfo(groupId).getBody();
  }

  /**
   * Get a group&#39;s voicemail policy
   * 
   * @param groupId Group ID (required)
   * @return VoicemailGroupPolicy
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailGroupPolicy> getVoicemailGroupPolicyWithHttpInfo(String groupId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getVoicemailGroupPolicy");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/groups/{groupId}/policy".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailGroupPolicy>() {});
  }

  /**
   * Get a group&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailGroupPolicy getVoicemailGroupPolicy(GetVoicemailGroupPolicyRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailGroupPolicy>() {});
  }

  /**
   * Get a group&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailGroupPolicy> getVoicemailGroupPolicy(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VoicemailGroupPolicy>invokeAPIVerbose(request, new TypeReference<VoicemailGroupPolicy>() {});
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @return VoicemailMailboxInfo
   * @throws ApiException if fails to make API call
   */
  public VoicemailMailboxInfo getVoicemailMailbox() throws ApiException {
    return getVoicemailMailboxWithHttpInfo().getBody();
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @return VoicemailMailboxInfo
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMailboxInfo> getVoicemailMailboxWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/mailbox".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailMailboxInfo>() {});
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailMailboxInfo getVoicemailMailbox(GetVoicemailMailboxRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailMailboxInfo>() {});
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMailboxInfo> getVoicemailMailbox(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VoicemailMailboxInfo>invokeAPIVerbose(request, new TypeReference<VoicemailMailboxInfo>() {});
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @return VoicemailMailboxInfo
   * @throws ApiException if fails to make API call
   */
  public VoicemailMailboxInfo getVoicemailMeMailbox() throws ApiException {
    return getVoicemailMeMailboxWithHttpInfo().getBody();
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @return VoicemailMailboxInfo
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMailboxInfo> getVoicemailMeMailboxWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/me/mailbox".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailMailboxInfo>() {});
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailMailboxInfo getVoicemailMeMailbox(GetVoicemailMeMailboxRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailMailboxInfo>() {});
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMailboxInfo> getVoicemailMeMailbox(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VoicemailMailboxInfo>invokeAPIVerbose(request, new TypeReference<VoicemailMailboxInfo>() {});
  }

  /**
   * List voicemail messages
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return VoicemailMessageEntityListing
   * @throws ApiException if fails to make API call
   */
  public VoicemailMessageEntityListing getVoicemailMeMessages(Integer pageSize, Integer pageNumber) throws ApiException {
    return getVoicemailMeMessagesWithHttpInfo(pageSize, pageNumber).getBody();
  }

  /**
   * List voicemail messages
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return VoicemailMessageEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailMeMessagesWithHttpInfo(Integer pageSize, Integer pageNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/me/messages".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailMessageEntityListing>() {});
  }

  /**
   * List voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailMessageEntityListing getVoicemailMeMessages(GetVoicemailMeMessagesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {});
  }

  /**
   * List voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailMeMessages(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VoicemailMessageEntityListing>invokeAPIVerbose(request, new TypeReference<VoicemailMessageEntityListing>() {});
  }

  /**
   * Get the current user&#39;s voicemail policy
   * 
   * @return VoicemailUserPolicy
   * @throws ApiException if fails to make API call
   */
  public VoicemailUserPolicy getVoicemailMePolicy() throws ApiException {
    return getVoicemailMePolicyWithHttpInfo().getBody();
  }

  /**
   * Get the current user&#39;s voicemail policy
   * 
   * @return VoicemailUserPolicy
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailUserPolicy> getVoicemailMePolicyWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/me/policy".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailUserPolicy>() {});
  }

  /**
   * Get the current user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailUserPolicy getVoicemailMePolicy(GetVoicemailMePolicyRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {});
  }

  /**
   * Get the current user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailUserPolicy> getVoicemailMePolicy(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VoicemailUserPolicy>invokeAPIVerbose(request, new TypeReference<VoicemailUserPolicy>() {});
  }

  /**
   * Get message.
   * 
   * @param messageId Message ID (required)
   * @param expand If the caller is a known user, which fields, if any, to expand (optional)
   * @return VoicemailMessage
   * @throws ApiException if fails to make API call
   */
  public VoicemailMessage getVoicemailMessage(String messageId, List<String> expand) throws ApiException {
    return getVoicemailMessageWithHttpInfo(messageId, expand).getBody();
  }

  /**
   * Get message.
   * 
   * @param messageId Message ID (required)
   * @param expand If the caller is a known user, which fields, if any, to expand (optional)
   * @return VoicemailMessage
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMessage> getVoicemailMessageWithHttpInfo(String messageId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling getVoicemailMessage");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/messages/{messageId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageId" + "\\}", pcapiClient.escapeString(messageId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailMessage>() {});
  }

  /**
   * Get message.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailMessage getVoicemailMessage(GetVoicemailMessageRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {});
  }

  /**
   * Get message.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMessage> getVoicemailMessage(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VoicemailMessage>invokeAPIVerbose(request, new TypeReference<VoicemailMessage>() {});
  }

  /**
   * Get media playback URI for this message
   * 
   * @param messageId Message ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @return VoicemailMediaInfo
   * @throws ApiException if fails to make API call
   */
  public VoicemailMediaInfo getVoicemailMessageMedia(String messageId, String formatId) throws ApiException {
    return getVoicemailMessageMediaWithHttpInfo(messageId, formatId).getBody();
  }

  /**
   * Get media playback URI for this message
   * 
   * @param messageId Message ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @return VoicemailMediaInfo
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMediaInfo> getVoicemailMessageMediaWithHttpInfo(String messageId, String formatId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling getVoicemailMessageMedia");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/messages/{messageId}/media".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageId" + "\\}", pcapiClient.escapeString(messageId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "formatId", formatId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailMediaInfo>() {});
  }

  /**
   * Get media playback URI for this message
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailMediaInfo getVoicemailMessageMedia(GetVoicemailMessageMediaRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailMediaInfo>() {});
  }

  /**
   * Get media playback URI for this message
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMediaInfo> getVoicemailMessageMedia(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VoicemailMediaInfo>invokeAPIVerbose(request, new TypeReference<VoicemailMediaInfo>() {});
  }

  /**
   * List voicemail messages
   * 
   * @param ids An optional comma separated list of VoicemailMessage ids (optional)
   * @param expand If the caller is a known user, which fields, if any, to expand (optional)
   * @return VoicemailMessageEntityListing
   * @throws ApiException if fails to make API call
   */
  public VoicemailMessageEntityListing getVoicemailMessages(String ids, List<String> expand) throws ApiException {
    return getVoicemailMessagesWithHttpInfo(ids, expand).getBody();
  }

  /**
   * List voicemail messages
   * 
   * @param ids An optional comma separated list of VoicemailMessage ids (optional)
   * @param expand If the caller is a known user, which fields, if any, to expand (optional)
   * @return VoicemailMessageEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailMessagesWithHttpInfo(String ids, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/messages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "ids", ids));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailMessageEntityListing>() {});
  }

  /**
   * List voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailMessageEntityListing getVoicemailMessages(GetVoicemailMessagesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {});
  }

  /**
   * List voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMessageEntityListing> getVoicemailMessages(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VoicemailMessageEntityListing>invokeAPIVerbose(request, new TypeReference<VoicemailMessageEntityListing>() {});
  }

  /**
   * Get a policy
   * 
   * @return VoicemailOrganizationPolicy
   * @throws ApiException if fails to make API call
   */
  public VoicemailOrganizationPolicy getVoicemailPolicy() throws ApiException {
    return getVoicemailPolicyWithHttpInfo().getBody();
  }

  /**
   * Get a policy
   * 
   * @return VoicemailOrganizationPolicy
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailOrganizationPolicy> getVoicemailPolicyWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/policy".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailOrganizationPolicy>() {});
  }

  /**
   * Get a policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailOrganizationPolicy getVoicemailPolicy(GetVoicemailPolicyRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailOrganizationPolicy>() {});
  }

  /**
   * Get a policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailOrganizationPolicy> getVoicemailPolicy(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VoicemailOrganizationPolicy>invokeAPIVerbose(request, new TypeReference<VoicemailOrganizationPolicy>() {});
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return VoicemailsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public VoicemailsSearchResponse getVoicemailSearch(String q64, List<String> expand) throws ApiException {
    return getVoicemailSearchWithHttpInfo(q64, expand).getBody();
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return VoicemailsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailsSearchResponse> getVoicemailSearchWithHttpInfo(String q64, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'q64' is set
    if (q64 == null) {
      throw new ApiException(400, "Missing the required parameter 'q64' when calling getVoicemailSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q64", q64));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailsSearchResponse>() {});
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailsSearchResponse getVoicemailSearch(GetVoicemailSearchRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {});
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailsSearchResponse> getVoicemailSearch(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VoicemailsSearchResponse>invokeAPIVerbose(request, new TypeReference<VoicemailsSearchResponse>() {});
  }

  /**
   * Get a user&#39;s voicemail policy
   * 
   * @param userId User ID (required)
   * @return VoicemailUserPolicy
   * @throws ApiException if fails to make API call
   */
  public VoicemailUserPolicy getVoicemailUserpolicy(String userId) throws ApiException {
    return getVoicemailUserpolicyWithHttpInfo(userId).getBody();
  }

  /**
   * Get a user&#39;s voicemail policy
   * 
   * @param userId User ID (required)
   * @return VoicemailUserPolicy
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailUserPolicy> getVoicemailUserpolicyWithHttpInfo(String userId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getVoicemailUserpolicy");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/userpolicies/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailUserPolicy>() {});
  }

  /**
   * Get a user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailUserPolicy getVoicemailUserpolicy(GetVoicemailUserpolicyRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {});
  }

  /**
   * Get a user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailUserPolicy> getVoicemailUserpolicy(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VoicemailUserPolicy>invokeAPIVerbose(request, new TypeReference<VoicemailUserPolicy>() {});
  }

  /**
   * Update a group&#39;s voicemail policy
   * 
   * @param groupId Group ID (required)
   * @param body The group&#39;s voicemail policy (required)
   * @return VoicemailGroupPolicy
   * @throws ApiException if fails to make API call
   */
  public VoicemailGroupPolicy patchVoicemailGroupPolicy(String groupId, VoicemailGroupPolicy body) throws ApiException {
    return patchVoicemailGroupPolicyWithHttpInfo(groupId, body).getBody();
  }

  /**
   * Update a group&#39;s voicemail policy
   * 
   * @param groupId Group ID (required)
   * @param body The group&#39;s voicemail policy (required)
   * @return VoicemailGroupPolicy
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailGroupPolicy> patchVoicemailGroupPolicyWithHttpInfo(String groupId, VoicemailGroupPolicy body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling patchVoicemailGroupPolicy");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchVoicemailGroupPolicy");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/groups/{groupId}/policy".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailGroupPolicy>() {});
  }

  /**
   * Update a group&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailGroupPolicy patchVoicemailGroupPolicy(PatchVoicemailGroupPolicyRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailGroupPolicy>() {});
  }

  /**
   * Update a group&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailGroupPolicy> patchVoicemailGroupPolicy(ApiRequest<VoicemailGroupPolicy> request) throws ApiException {
    return pcapiClient.<VoicemailGroupPolicy>invokeAPIVerbose(request, new TypeReference<VoicemailGroupPolicy>() {});
  }

  /**
   * Update the current user&#39;s voicemail policy
   * 
   * @param body The user&#39;s voicemail policy (required)
   * @return VoicemailUserPolicy
   * @throws ApiException if fails to make API call
   */
  public VoicemailUserPolicy patchVoicemailMePolicy(VoicemailUserPolicy body) throws ApiException {
    return patchVoicemailMePolicyWithHttpInfo(body).getBody();
  }

  /**
   * Update the current user&#39;s voicemail policy
   * 
   * @param body The user&#39;s voicemail policy (required)
   * @return VoicemailUserPolicy
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailUserPolicy> patchVoicemailMePolicyWithHttpInfo(VoicemailUserPolicy body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchVoicemailMePolicy");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/me/policy".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailUserPolicy>() {});
  }

  /**
   * Update the current user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailUserPolicy patchVoicemailMePolicy(PatchVoicemailMePolicyRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {});
  }

  /**
   * Update the current user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailUserPolicy> patchVoicemailMePolicy(ApiRequest<VoicemailUserPolicy> request) throws ApiException {
    return pcapiClient.<VoicemailUserPolicy>invokeAPIVerbose(request, new TypeReference<VoicemailUserPolicy>() {});
  }

  /**
   * Update a user&#39;s voicemail policy
   * 
   * @param userId User ID (required)
   * @param body The user&#39;s voicemail policy (required)
   * @return VoicemailUserPolicy
   * @throws ApiException if fails to make API call
   */
  public VoicemailUserPolicy patchVoicemailUserpolicy(String userId, VoicemailUserPolicy body) throws ApiException {
    return patchVoicemailUserpolicyWithHttpInfo(userId, body).getBody();
  }

  /**
   * Update a user&#39;s voicemail policy
   * 
   * @param userId User ID (required)
   * @param body The user&#39;s voicemail policy (required)
   * @return VoicemailUserPolicy
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailUserPolicy> patchVoicemailUserpolicyWithHttpInfo(String userId, VoicemailUserPolicy body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling patchVoicemailUserpolicy");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchVoicemailUserpolicy");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/userpolicies/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailUserPolicy>() {});
  }

  /**
   * Update a user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailUserPolicy patchVoicemailUserpolicy(PatchVoicemailUserpolicyRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {});
  }

  /**
   * Update a user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailUserPolicy> patchVoicemailUserpolicy(ApiRequest<VoicemailUserPolicy> request) throws ApiException {
    return pcapiClient.<VoicemailUserPolicy>invokeAPIVerbose(request, new TypeReference<VoicemailUserPolicy>() {});
  }

  /**
   * Copy a voicemail message to a user or group
   * 
   * @param body  (optional)
   * @return VoicemailMessage
   * @throws ApiException if fails to make API call
   */
  public VoicemailMessage postVoicemailMessages(CopyVoicemailMessage body) throws ApiException {
    return postVoicemailMessagesWithHttpInfo(body).getBody();
  }

  /**
   * Copy a voicemail message to a user or group
   * 
   * @param body  (optional)
   * @return VoicemailMessage
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMessage> postVoicemailMessagesWithHttpInfo(CopyVoicemailMessage body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/messages".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailMessage>() {});
  }

  /**
   * Copy a voicemail message to a user or group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailMessage postVoicemailMessages(PostVoicemailMessagesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {});
  }

  /**
   * Copy a voicemail message to a user or group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMessage> postVoicemailMessages(ApiRequest<CopyVoicemailMessage> request) throws ApiException {
    return pcapiClient.<VoicemailMessage>invokeAPIVerbose(request, new TypeReference<VoicemailMessage>() {});
  }

  /**
   * Search voicemails
   * 
   * @param body Search request options (required)
   * @return VoicemailsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public VoicemailsSearchResponse postVoicemailSearch(VoicemailSearchRequest body) throws ApiException {
    return postVoicemailSearchWithHttpInfo(body).getBody();
  }

  /**
   * Search voicemails
   * 
   * @param body Search request options (required)
   * @return VoicemailsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailsSearchResponse> postVoicemailSearchWithHttpInfo(VoicemailSearchRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postVoicemailSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/search".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailsSearchResponse>() {});
  }

  /**
   * Search voicemails
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailsSearchResponse postVoicemailSearch(PostVoicemailSearchRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {});
  }

  /**
   * Search voicemails
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailsSearchResponse> postVoicemailSearch(ApiRequest<VoicemailSearchRequest> request) throws ApiException {
    return pcapiClient.<VoicemailsSearchResponse>invokeAPIVerbose(request, new TypeReference<VoicemailsSearchResponse>() {});
  }

  /**
   * Update a message.
   * 
   * @param messageId Message ID (required)
   * @param body VoicemailMessage (required)
   * @return VoicemailMessage
   * @throws ApiException if fails to make API call
   */
  public VoicemailMessage putVoicemailMessage(String messageId, VoicemailMessage body) throws ApiException {
    return putVoicemailMessageWithHttpInfo(messageId, body).getBody();
  }

  /**
   * Update a message.
   * 
   * @param messageId Message ID (required)
   * @param body VoicemailMessage (required)
   * @return VoicemailMessage
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMessage> putVoicemailMessageWithHttpInfo(String messageId, VoicemailMessage body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling putVoicemailMessage");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putVoicemailMessage");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/messages/{messageId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageId" + "\\}", pcapiClient.escapeString(messageId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailMessage>() {});
  }

  /**
   * Update a message.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailMessage putVoicemailMessage(PutVoicemailMessageRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {});
  }

  /**
   * Update a message.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailMessage> putVoicemailMessage(ApiRequest<VoicemailMessage> request) throws ApiException {
    return pcapiClient.<VoicemailMessage>invokeAPIVerbose(request, new TypeReference<VoicemailMessage>() {});
  }

  /**
   * Update a policy
   * 
   * @param body Policy (required)
   * @return VoicemailOrganizationPolicy
   * @throws ApiException if fails to make API call
   */
  public VoicemailOrganizationPolicy putVoicemailPolicy(VoicemailOrganizationPolicy body) throws ApiException {
    return putVoicemailPolicyWithHttpInfo(body).getBody();
  }

  /**
   * Update a policy
   * 
   * @param body Policy (required)
   * @return VoicemailOrganizationPolicy
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailOrganizationPolicy> putVoicemailPolicyWithHttpInfo(VoicemailOrganizationPolicy body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putVoicemailPolicy");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/policy".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailOrganizationPolicy>() {});
  }

  /**
   * Update a policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailOrganizationPolicy putVoicemailPolicy(PutVoicemailPolicyRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailOrganizationPolicy>() {});
  }

  /**
   * Update a policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailOrganizationPolicy> putVoicemailPolicy(ApiRequest<VoicemailOrganizationPolicy> request) throws ApiException {
    return pcapiClient.<VoicemailOrganizationPolicy>invokeAPIVerbose(request, new TypeReference<VoicemailOrganizationPolicy>() {});
  }

}
