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
import com.mypurecloud.sdk.v2.model.AnalyticsConversation;
import com.mypurecloud.sdk.v2.model.Conversation;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.ConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallConversation;
import com.mypurecloud.sdk.v2.model.Wrapup;
import com.mypurecloud.sdk.v2.model.CallbackConversation;
import com.mypurecloud.sdk.v2.model.CallbackConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallConversationEntityListing;
import com.mypurecloud.sdk.v2.model.MaxParticipants;
import com.mypurecloud.sdk.v2.model.ChatConversation;
import com.mypurecloud.sdk.v2.model.ChatConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CobrowseConversation;
import com.mypurecloud.sdk.v2.model.CobrowseConversationEntityListing;
import com.mypurecloud.sdk.v2.model.EmailConversation;
import com.mypurecloud.sdk.v2.model.EmailMessage;
import com.mypurecloud.sdk.v2.model.EmailMessageListing;
import com.mypurecloud.sdk.v2.model.EmailConversationEntityListing;
import com.mypurecloud.sdk.v2.model.MediaParticipantRequest;
import com.mypurecloud.sdk.v2.model.ParticipantAttributes;
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ConsultTransferUpdate;
import com.mypurecloud.sdk.v2.model.ConsultTransferResponse;
import com.mypurecloud.sdk.v2.model.PropertyIndexRequest;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationQuery;
import com.mypurecloud.sdk.v2.model.CreateCallbackCommand;
import com.mypurecloud.sdk.v2.model.TransferRequest;
import com.mypurecloud.sdk.v2.model.CallCommand;
import com.mypurecloud.sdk.v2.model.ConsultTransfer;
import com.mypurecloud.sdk.v2.model.CreateCallbackResponse;
import com.mypurecloud.sdk.v2.model.CreateCallRequest;
import com.mypurecloud.sdk.v2.model.CreateCallResponse;
import com.mypurecloud.sdk.v2.model.CreateWebChatRequest;
import com.mypurecloud.sdk.v2.model.CreateEmailRequest;
import com.mypurecloud.sdk.v2.model.FaxSendResponse;
import com.mypurecloud.sdk.v2.model.FaxSendRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteConversationParticipantCodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteConversationsCallParticipantConsultRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteConversationsEmailMessagesDraftAttachmentRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationParticipantWrapupRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationParticipantWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCallRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCallParticipantWrapupRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCallParticipantWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCallbackRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCallbackParticipantWrapupRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCallbackParticipantWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCallbacksRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCallsRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCallsHistoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCallsMaximumconferencepartiesRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsChatRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsChatParticipantWrapupRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsChatParticipantWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsChatsRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCobrowsesessionRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCobrowsesessionParticipantWrapupRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCobrowsesessionParticipantWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsCobrowsesessionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsEmailRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsEmailMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsEmailMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsEmailMessagesDraftRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsEmailParticipantWrapupRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsEmailParticipantWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsEmailsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationParticipantRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationParticipantAttributesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsCallRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsCallParticipantRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsCallParticipantAttributesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsCallParticipantCommunicationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsCallParticipantConsultRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsCallbackRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsCallbackParticipantRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsCallbackParticipantAttributesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsCallbackParticipantCommunicationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsChatRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsChatParticipantRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsChatParticipantAttributesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsChatParticipantCommunicationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsCobrowsesessionRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsCobrowsesessionParticipantRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsCobrowsesessionParticipantAttributesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsCobrowsesessionParticipantCommunicationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsEmailRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsEmailParticipantRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsEmailParticipantAttributesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsEmailParticipantCommunicationRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationDetailsPropertiesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsDetailsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationParticipantCallbacksRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationParticipantReplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallParticipantConsultRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallParticipantMonitorRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallParticipantReplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallParticipantsRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallbackParticipantReplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallbacksRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallsRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsChatParticipantReplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsChatsRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCobrowsesessionParticipantReplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsEmailMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsEmailParticipantReplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsEmailsRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsFaxesRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationsEmailMessagesDraftRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ConversationsApi {
  private final ApiClient pcapiClient;

  public ConversationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConversationsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a code used to add a communication to this participant
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param addCommunicationCode addCommunicationCode (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteConversationParticipantCode(String conversationId, String participantId, String addCommunicationCode) throws ApiException {
    deleteConversationParticipantCodeWithHttpInfo(conversationId, participantId, addCommunicationCode);
  }

  /**
   * Delete a code used to add a communication to this participant
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param addCommunicationCode addCommunicationCode (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteConversationParticipantCodeWithHttpInfo(String conversationId, String participantId, String addCommunicationCode) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling deleteConversationParticipantCode");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling deleteConversationParticipantCode");
    }
    
    // verify the required parameter 'addCommunicationCode' is set
    if (addCommunicationCode == null) {
      throw new ApiException(400, "Missing the required parameter 'addCommunicationCode' when calling deleteConversationParticipantCode");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/participants/{participantId}/codes/{addCommunicationCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()))
      .replaceAll("\\{" + "addCommunicationCode" + "\\}", pcapiClient.escapeString(addCommunicationCode.toString()));

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
   * Delete a code used to add a communication to this participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteConversationParticipantCode(DeleteConversationParticipantCodeRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a code used to add a communication to this participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteConversationParticipantCode(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Cancel the transfer
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteConversationsCallParticipantConsult(String callId, String participantId) throws ApiException {
    return deleteConversationsCallParticipantConsultWithHttpInfo(callId, participantId).getBody();
  }

  /**
   * Cancel the transfer
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteConversationsCallParticipantConsultWithHttpInfo(String callId, String participantId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling deleteConversationsCallParticipantConsult");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling deleteConversationsCallParticipantConsult");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}/participants/{participantId}/consult".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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
   * Cancel the transfer
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteConversationsCallParticipantConsult(DeleteConversationsCallParticipantConsultRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Cancel the transfer
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteConversationsCallParticipantConsult(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete attachment from draft
   * 
   * @param emailId emailId (required)
   * @param attachmentId attachmentId (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteConversationsEmailMessagesDraftAttachment(String emailId, String attachmentId) throws ApiException {
    return deleteConversationsEmailMessagesDraftAttachmentWithHttpInfo(emailId, attachmentId).getBody();
  }

  /**
   * Delete attachment from draft
   * 
   * @param emailId emailId (required)
   * @param attachmentId attachmentId (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteConversationsEmailMessagesDraftAttachmentWithHttpInfo(String emailId, String attachmentId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling deleteConversationsEmailMessagesDraftAttachment");
    }
    
    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling deleteConversationsEmailMessagesDraftAttachment");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}/messages/draft/attachments/{attachmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()))
      .replaceAll("\\{" + "attachmentId" + "\\}", pcapiClient.escapeString(attachmentId.toString()));

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
   * Delete attachment from draft
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteConversationsEmailMessagesDraftAttachment(DeleteConversationsEmailMessagesDraftAttachmentRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete attachment from draft
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteConversationsEmailMessagesDraftAttachment(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return AnalyticsConversation
   * @throws ApiException if fails to make API call
   */
  public AnalyticsConversation getAnalyticsConversationDetails(String conversationId) throws ApiException {
    return getAnalyticsConversationDetailsWithHttpInfo(conversationId).getBody();
  }

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return AnalyticsConversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AnalyticsConversation> getAnalyticsConversationDetailsWithHttpInfo(String conversationId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling getAnalyticsConversationDetails");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/conversations/{conversationId}/details".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AnalyticsConversation>() {});
  }

  /**
   * Get a conversation by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AnalyticsConversation getAnalyticsConversationDetails(GetAnalyticsConversationDetailsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AnalyticsConversation>() {});
  }

  /**
   * Get a conversation by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AnalyticsConversation> getAnalyticsConversationDetails(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<AnalyticsConversation>invokeAPIVerbose(request, new TypeReference<AnalyticsConversation>() {});
  }

  /**
   * Get conversation
   * 
   * @param conversationId conversation ID (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public Conversation getConversation(String conversationId) throws ApiException {
    return getConversationWithHttpInfo(conversationId).getBody();
  }

  /**
   * Get conversation
   * 
   * @param conversationId conversation ID (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> getConversationWithHttpInfo(String conversationId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling getConversation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Conversation>() {});
  }

  /**
   * Get conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Conversation getConversation(GetConversationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Conversation>() {});
  }

  /**
   * Get conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> getConversation(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Conversation>invokeAPIVerbose(request, new TypeReference<Conversation>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return WrapupCode
   * @throws ApiException if fails to make API call
   */
  public WrapupCode getConversationParticipantWrapup(String conversationId, String participantId, Boolean provisional) throws ApiException {
    return getConversationParticipantWrapupWithHttpInfo(conversationId, participantId, provisional).getBody();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return WrapupCode
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapupCode> getConversationParticipantWrapupWithHttpInfo(String conversationId, String participantId, Boolean provisional) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling getConversationParticipantWrapup");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling getConversationParticipantWrapup");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/participants/{participantId}/wrapup".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "provisional", provisional));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<WrapupCode>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public WrapupCode getConversationParticipantWrapup(GetConversationParticipantWrapupRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<WrapupCode>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapupCode> getConversationParticipantWrapup(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<WrapupCode>invokeAPIVerbose(request, new TypeReference<WrapupCode>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> getConversationParticipantWrapupcodes(String conversationId, String participantId) throws ApiException {
    return getConversationParticipantWrapupcodesWithHttpInfo(conversationId, participantId).getBody();
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> getConversationParticipantWrapupcodesWithHttpInfo(String conversationId, String participantId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling getConversationParticipantWrapupcodes");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling getConversationParticipantWrapupcodes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/participants/{participantId}/wrapupcodes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> getConversationParticipantWrapupcodes(GetConversationParticipantWrapupcodesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> getConversationParticipantWrapupcodes(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerbose(request, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get conversations
   * 
   * @param communicationType Call or Chat communication filtering (optional)
   * @return ConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public ConversationEntityListing getConversations(String communicationType) throws ApiException {
    return getConversationsWithHttpInfo(communicationType).getBody();
  }

  /**
   * Get conversations
   * 
   * @param communicationType Call or Chat communication filtering (optional)
   * @return ConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConversationEntityListing> getConversationsWithHttpInfo(String communicationType) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "communicationType", communicationType));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ConversationEntityListing>() {});
  }

  /**
   * Get conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ConversationEntityListing getConversations(GetConversationsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ConversationEntityListing>() {});
  }

  /**
   * Get conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConversationEntityListing> getConversations(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<ConversationEntityListing>invokeAPIVerbose(request, new TypeReference<ConversationEntityListing>() {});
  }

  /**
   * Get call conversation
   * 
   * @param callId callId (required)
   * @return CallConversation
   * @throws ApiException if fails to make API call
   */
  public CallConversation getConversationsCall(String callId) throws ApiException {
    return getConversationsCallWithHttpInfo(callId).getBody();
  }

  /**
   * Get call conversation
   * 
   * @param callId callId (required)
   * @return CallConversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallConversation> getConversationsCallWithHttpInfo(String callId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling getConversationsCall");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CallConversation>() {});
  }

  /**
   * Get call conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CallConversation getConversationsCall(GetConversationsCallRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CallConversation>() {});
  }

  /**
   * Get call conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallConversation> getConversationsCall(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<CallConversation>invokeAPIVerbose(request, new TypeReference<CallConversation>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if fails to make API call
   */
  public Wrapup getConversationsCallParticipantWrapup(String callId, String participantId, Boolean provisional) throws ApiException {
    return getConversationsCallParticipantWrapupWithHttpInfo(callId, participantId, provisional).getBody();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Wrapup> getConversationsCallParticipantWrapupWithHttpInfo(String callId, String participantId, Boolean provisional) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling getConversationsCallParticipantWrapup");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling getConversationsCallParticipantWrapup");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}/participants/{participantId}/wrapup".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "provisional", provisional));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Wrapup>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Wrapup getConversationsCallParticipantWrapup(GetConversationsCallParticipantWrapupRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Wrapup>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Wrapup> getConversationsCallParticipantWrapup(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Wrapup>invokeAPIVerbose(request, new TypeReference<Wrapup>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> getConversationsCallParticipantWrapupcodes(String callId, String participantId) throws ApiException {
    return getConversationsCallParticipantWrapupcodesWithHttpInfo(callId, participantId).getBody();
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> getConversationsCallParticipantWrapupcodesWithHttpInfo(String callId, String participantId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling getConversationsCallParticipantWrapupcodes");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling getConversationsCallParticipantWrapupcodes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}/participants/{participantId}/wrapupcodes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> getConversationsCallParticipantWrapupcodes(GetConversationsCallParticipantWrapupcodesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> getConversationsCallParticipantWrapupcodes(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerbose(request, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get callback conversation
   * 
   * @param callbackId callbackId (required)
   * @return CallbackConversation
   * @throws ApiException if fails to make API call
   */
  public CallbackConversation getConversationsCallback(String callbackId) throws ApiException {
    return getConversationsCallbackWithHttpInfo(callbackId).getBody();
  }

  /**
   * Get callback conversation
   * 
   * @param callbackId callbackId (required)
   * @return CallbackConversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallbackConversation> getConversationsCallbackWithHttpInfo(String callbackId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'callbackId' is set
    if (callbackId == null) {
      throw new ApiException(400, "Missing the required parameter 'callbackId' when calling getConversationsCallback");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/callbacks/{callbackId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callbackId" + "\\}", pcapiClient.escapeString(callbackId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CallbackConversation>() {});
  }

  /**
   * Get callback conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CallbackConversation getConversationsCallback(GetConversationsCallbackRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CallbackConversation>() {});
  }

  /**
   * Get callback conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallbackConversation> getConversationsCallback(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<CallbackConversation>invokeAPIVerbose(request, new TypeReference<CallbackConversation>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if fails to make API call
   */
  public Wrapup getConversationsCallbackParticipantWrapup(String callbackId, String participantId, Boolean provisional) throws ApiException {
    return getConversationsCallbackParticipantWrapupWithHttpInfo(callbackId, participantId, provisional).getBody();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Wrapup> getConversationsCallbackParticipantWrapupWithHttpInfo(String callbackId, String participantId, Boolean provisional) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'callbackId' is set
    if (callbackId == null) {
      throw new ApiException(400, "Missing the required parameter 'callbackId' when calling getConversationsCallbackParticipantWrapup");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling getConversationsCallbackParticipantWrapup");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/wrapup".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callbackId" + "\\}", pcapiClient.escapeString(callbackId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "provisional", provisional));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Wrapup>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Wrapup getConversationsCallbackParticipantWrapup(GetConversationsCallbackParticipantWrapupRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Wrapup>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Wrapup> getConversationsCallbackParticipantWrapup(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Wrapup>invokeAPIVerbose(request, new TypeReference<Wrapup>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> getConversationsCallbackParticipantWrapupcodes(String callbackId, String participantId) throws ApiException {
    return getConversationsCallbackParticipantWrapupcodesWithHttpInfo(callbackId, participantId).getBody();
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> getConversationsCallbackParticipantWrapupcodesWithHttpInfo(String callbackId, String participantId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'callbackId' is set
    if (callbackId == null) {
      throw new ApiException(400, "Missing the required parameter 'callbackId' when calling getConversationsCallbackParticipantWrapupcodes");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling getConversationsCallbackParticipantWrapupcodes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/wrapupcodes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callbackId" + "\\}", pcapiClient.escapeString(callbackId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> getConversationsCallbackParticipantWrapupcodes(GetConversationsCallbackParticipantWrapupcodesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> getConversationsCallbackParticipantWrapupcodes(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerbose(request, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get callback conversations
   * 
   * @return CallbackConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public CallbackConversationEntityListing getConversationsCallbacks() throws ApiException {
    return getConversationsCallbacksWithHttpInfo().getBody();
  }

  /**
   * Get callback conversations
   * 
   * @return CallbackConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallbackConversationEntityListing> getConversationsCallbacksWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/callbacks".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CallbackConversationEntityListing>() {});
  }

  /**
   * Get callback conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CallbackConversationEntityListing getConversationsCallbacks(GetConversationsCallbacksRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CallbackConversationEntityListing>() {});
  }

  /**
   * Get callback conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallbackConversationEntityListing> getConversationsCallbacks(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<CallbackConversationEntityListing>invokeAPIVerbose(request, new TypeReference<CallbackConversationEntityListing>() {});
  }

  /**
   * Get recent conversations
   * 
   * @return CallConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public CallConversationEntityListing getConversationsCalls() throws ApiException {
    return getConversationsCallsWithHttpInfo().getBody();
  }

  /**
   * Get recent conversations
   * 
   * @return CallConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallConversationEntityListing> getConversationsCallsWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CallConversationEntityListing>() {});
  }

  /**
   * Get recent conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CallConversationEntityListing getConversationsCalls(GetConversationsCallsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CallConversationEntityListing>() {});
  }

  /**
   * Get recent conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallConversationEntityListing> getConversationsCalls(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<CallConversationEntityListing>invokeAPIVerbose(request, new TypeReference<CallConversationEntityListing>() {});
  }

  /**
   * Get call history
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param interval Interval string; format is ISO-8601. Separate start and end times with forward slash &#39;/&#39; (optional)
   * @return CallConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public CallConversationEntityListing getConversationsCallsHistory(Integer pageSize, Integer pageNumber, String interval) throws ApiException {
    return getConversationsCallsHistoryWithHttpInfo(pageSize, pageNumber, interval).getBody();
  }

  /**
   * Get call history
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param interval Interval string; format is ISO-8601. Separate start and end times with forward slash &#39;/&#39; (optional)
   * @return CallConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallConversationEntityListing> getConversationsCallsHistoryWithHttpInfo(Integer pageSize, Integer pageNumber, String interval) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "interval", interval));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CallConversationEntityListing>() {});
  }

  /**
   * Get call history
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CallConversationEntityListing getConversationsCallsHistory(GetConversationsCallsHistoryRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CallConversationEntityListing>() {});
  }

  /**
   * Get call history
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallConversationEntityListing> getConversationsCallsHistory(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<CallConversationEntityListing>invokeAPIVerbose(request, new TypeReference<CallConversationEntityListing>() {});
  }

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @return MaxParticipants
   * @throws ApiException if fails to make API call
   */
  public MaxParticipants getConversationsCallsMaximumconferenceparties() throws ApiException {
    return getConversationsCallsMaximumconferencepartiesWithHttpInfo().getBody();
  }

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @return MaxParticipants
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MaxParticipants> getConversationsCallsMaximumconferencepartiesWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/maximumconferenceparties".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<MaxParticipants>() {});
  }

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public MaxParticipants getConversationsCallsMaximumconferenceparties(GetConversationsCallsMaximumconferencepartiesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<MaxParticipants>() {});
  }

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MaxParticipants> getConversationsCallsMaximumconferenceparties(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<MaxParticipants>invokeAPIVerbose(request, new TypeReference<MaxParticipants>() {});
  }

  /**
   * Get chat conversation
   * 
   * @param chatId chatId (required)
   * @return ChatConversation
   * @throws ApiException if fails to make API call
   */
  public ChatConversation getConversationsChat(String chatId) throws ApiException {
    return getConversationsChatWithHttpInfo(chatId).getBody();
  }

  /**
   * Get chat conversation
   * 
   * @param chatId chatId (required)
   * @return ChatConversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChatConversation> getConversationsChatWithHttpInfo(String chatId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling getConversationsChat");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/chats/{chatId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chatId" + "\\}", pcapiClient.escapeString(chatId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ChatConversation>() {});
  }

  /**
   * Get chat conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ChatConversation getConversationsChat(GetConversationsChatRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ChatConversation>() {});
  }

  /**
   * Get chat conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChatConversation> getConversationsChat(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<ChatConversation>invokeAPIVerbose(request, new TypeReference<ChatConversation>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if fails to make API call
   */
  public Wrapup getConversationsChatParticipantWrapup(String chatId, String participantId, Boolean provisional) throws ApiException {
    return getConversationsChatParticipantWrapupWithHttpInfo(chatId, participantId, provisional).getBody();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Wrapup> getConversationsChatParticipantWrapupWithHttpInfo(String chatId, String participantId, Boolean provisional) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling getConversationsChatParticipantWrapup");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling getConversationsChatParticipantWrapup");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/chats/{chatId}/participants/{participantId}/wrapup".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chatId" + "\\}", pcapiClient.escapeString(chatId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "provisional", provisional));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Wrapup>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Wrapup getConversationsChatParticipantWrapup(GetConversationsChatParticipantWrapupRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Wrapup>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Wrapup> getConversationsChatParticipantWrapup(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Wrapup>invokeAPIVerbose(request, new TypeReference<Wrapup>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> getConversationsChatParticipantWrapupcodes(String chatId, String participantId) throws ApiException {
    return getConversationsChatParticipantWrapupcodesWithHttpInfo(chatId, participantId).getBody();
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> getConversationsChatParticipantWrapupcodesWithHttpInfo(String chatId, String participantId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling getConversationsChatParticipantWrapupcodes");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling getConversationsChatParticipantWrapupcodes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/chats/{chatId}/participants/{participantId}/wrapupcodes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chatId" + "\\}", pcapiClient.escapeString(chatId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> getConversationsChatParticipantWrapupcodes(GetConversationsChatParticipantWrapupcodesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> getConversationsChatParticipantWrapupcodes(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerbose(request, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get recent chat conversations
   * 
   * @return ChatConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public ChatConversationEntityListing getConversationsChats() throws ApiException {
    return getConversationsChatsWithHttpInfo().getBody();
  }

  /**
   * Get recent chat conversations
   * 
   * @return ChatConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChatConversationEntityListing> getConversationsChatsWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/chats".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ChatConversationEntityListing>() {});
  }

  /**
   * Get recent chat conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ChatConversationEntityListing getConversationsChats(GetConversationsChatsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ChatConversationEntityListing>() {});
  }

  /**
   * Get recent chat conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChatConversationEntityListing> getConversationsChats(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<ChatConversationEntityListing>invokeAPIVerbose(request, new TypeReference<ChatConversationEntityListing>() {});
  }

  /**
   * Get cobrowse conversation
   * 
   * @param cobrowseId cobrowseId (required)
   * @return CobrowseConversation
   * @throws ApiException if fails to make API call
   */
  public CobrowseConversation getConversationsCobrowsesession(String cobrowseId) throws ApiException {
    return getConversationsCobrowsesessionWithHttpInfo(cobrowseId).getBody();
  }

  /**
   * Get cobrowse conversation
   * 
   * @param cobrowseId cobrowseId (required)
   * @return CobrowseConversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CobrowseConversation> getConversationsCobrowsesessionWithHttpInfo(String cobrowseId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'cobrowseId' is set
    if (cobrowseId == null) {
      throw new ApiException(400, "Missing the required parameter 'cobrowseId' when calling getConversationsCobrowsesession");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/cobrowsesessions/{cobrowseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cobrowseId" + "\\}", pcapiClient.escapeString(cobrowseId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CobrowseConversation>() {});
  }

  /**
   * Get cobrowse conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CobrowseConversation getConversationsCobrowsesession(GetConversationsCobrowsesessionRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CobrowseConversation>() {});
  }

  /**
   * Get cobrowse conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CobrowseConversation> getConversationsCobrowsesession(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<CobrowseConversation>invokeAPIVerbose(request, new TypeReference<CobrowseConversation>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if fails to make API call
   */
  public Wrapup getConversationsCobrowsesessionParticipantWrapup(String cobrowseId, String participantId, Boolean provisional) throws ApiException {
    return getConversationsCobrowsesessionParticipantWrapupWithHttpInfo(cobrowseId, participantId, provisional).getBody();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Wrapup> getConversationsCobrowsesessionParticipantWrapupWithHttpInfo(String cobrowseId, String participantId, Boolean provisional) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'cobrowseId' is set
    if (cobrowseId == null) {
      throw new ApiException(400, "Missing the required parameter 'cobrowseId' when calling getConversationsCobrowsesessionParticipantWrapup");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling getConversationsCobrowsesessionParticipantWrapup");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/wrapup".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cobrowseId" + "\\}", pcapiClient.escapeString(cobrowseId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "provisional", provisional));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Wrapup>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Wrapup getConversationsCobrowsesessionParticipantWrapup(GetConversationsCobrowsesessionParticipantWrapupRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Wrapup>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Wrapup> getConversationsCobrowsesessionParticipantWrapup(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Wrapup>invokeAPIVerbose(request, new TypeReference<Wrapup>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> getConversationsCobrowsesessionParticipantWrapupcodes(String cobrowseId, String participantId) throws ApiException {
    return getConversationsCobrowsesessionParticipantWrapupcodesWithHttpInfo(cobrowseId, participantId).getBody();
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> getConversationsCobrowsesessionParticipantWrapupcodesWithHttpInfo(String cobrowseId, String participantId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'cobrowseId' is set
    if (cobrowseId == null) {
      throw new ApiException(400, "Missing the required parameter 'cobrowseId' when calling getConversationsCobrowsesessionParticipantWrapupcodes");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling getConversationsCobrowsesessionParticipantWrapupcodes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/wrapupcodes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cobrowseId" + "\\}", pcapiClient.escapeString(cobrowseId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> getConversationsCobrowsesessionParticipantWrapupcodes(GetConversationsCobrowsesessionParticipantWrapupcodesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> getConversationsCobrowsesessionParticipantWrapupcodes(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerbose(request, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get recent cobrowse conversations
   * 
   * @return CobrowseConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public CobrowseConversationEntityListing getConversationsCobrowsesessions() throws ApiException {
    return getConversationsCobrowsesessionsWithHttpInfo().getBody();
  }

  /**
   * Get recent cobrowse conversations
   * 
   * @return CobrowseConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CobrowseConversationEntityListing> getConversationsCobrowsesessionsWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/cobrowsesessions".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CobrowseConversationEntityListing>() {});
  }

  /**
   * Get recent cobrowse conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CobrowseConversationEntityListing getConversationsCobrowsesessions(GetConversationsCobrowsesessionsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CobrowseConversationEntityListing>() {});
  }

  /**
   * Get recent cobrowse conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CobrowseConversationEntityListing> getConversationsCobrowsesessions(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<CobrowseConversationEntityListing>invokeAPIVerbose(request, new TypeReference<CobrowseConversationEntityListing>() {});
  }

  /**
   * Get email conversation
   * 
   * @param emailId emailId (required)
   * @return EmailConversation
   * @throws ApiException if fails to make API call
   */
  public EmailConversation getConversationsEmail(String emailId) throws ApiException {
    return getConversationsEmailWithHttpInfo(emailId).getBody();
  }

  /**
   * Get email conversation
   * 
   * @param emailId emailId (required)
   * @return EmailConversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailConversation> getConversationsEmailWithHttpInfo(String emailId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling getConversationsEmail");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EmailConversation>() {});
  }

  /**
   * Get email conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EmailConversation getConversationsEmail(GetConversationsEmailRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EmailConversation>() {});
  }

  /**
   * Get email conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailConversation> getConversationsEmail(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EmailConversation>invokeAPIVerbose(request, new TypeReference<EmailConversation>() {});
  }

  /**
   * Get conversation message
   * 
   * @param emailId emailId (required)
   * @param messageId messageId (required)
   * @return EmailMessage
   * @throws ApiException if fails to make API call
   */
  public EmailMessage getConversationsEmailMessage(String emailId, String messageId) throws ApiException {
    return getConversationsEmailMessageWithHttpInfo(emailId, messageId).getBody();
  }

  /**
   * Get conversation message
   * 
   * @param emailId emailId (required)
   * @param messageId messageId (required)
   * @return EmailMessage
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailMessage> getConversationsEmailMessageWithHttpInfo(String emailId, String messageId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling getConversationsEmailMessage");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling getConversationsEmailMessage");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}/messages/{messageId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()))
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EmailMessage>() {});
  }

  /**
   * Get conversation message
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EmailMessage getConversationsEmailMessage(GetConversationsEmailMessageRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EmailMessage>() {});
  }

  /**
   * Get conversation message
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailMessage> getConversationsEmailMessage(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EmailMessage>invokeAPIVerbose(request, new TypeReference<EmailMessage>() {});
  }

  /**
   * Get conversation messages
   * 
   * @param emailId emailId (required)
   * @return EmailMessageListing
   * @throws ApiException if fails to make API call
   */
  public EmailMessageListing getConversationsEmailMessages(String emailId) throws ApiException {
    return getConversationsEmailMessagesWithHttpInfo(emailId).getBody();
  }

  /**
   * Get conversation messages
   * 
   * @param emailId emailId (required)
   * @return EmailMessageListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailMessageListing> getConversationsEmailMessagesWithHttpInfo(String emailId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling getConversationsEmailMessages");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}/messages".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EmailMessageListing>() {});
  }

  /**
   * Get conversation messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EmailMessageListing getConversationsEmailMessages(GetConversationsEmailMessagesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EmailMessageListing>() {});
  }

  /**
   * Get conversation messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailMessageListing> getConversationsEmailMessages(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EmailMessageListing>invokeAPIVerbose(request, new TypeReference<EmailMessageListing>() {});
  }

  /**
   * Get conversation draft reply
   * 
   * @param emailId emailId (required)
   * @return EmailMessage
   * @throws ApiException if fails to make API call
   */
  public EmailMessage getConversationsEmailMessagesDraft(String emailId) throws ApiException {
    return getConversationsEmailMessagesDraftWithHttpInfo(emailId).getBody();
  }

  /**
   * Get conversation draft reply
   * 
   * @param emailId emailId (required)
   * @return EmailMessage
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailMessage> getConversationsEmailMessagesDraftWithHttpInfo(String emailId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling getConversationsEmailMessagesDraft");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}/messages/draft".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EmailMessage>() {});
  }

  /**
   * Get conversation draft reply
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EmailMessage getConversationsEmailMessagesDraft(GetConversationsEmailMessagesDraftRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EmailMessage>() {});
  }

  /**
   * Get conversation draft reply
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailMessage> getConversationsEmailMessagesDraft(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EmailMessage>invokeAPIVerbose(request, new TypeReference<EmailMessage>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if fails to make API call
   */
  public Wrapup getConversationsEmailParticipantWrapup(String emailId, String participantId, Boolean provisional) throws ApiException {
    return getConversationsEmailParticipantWrapupWithHttpInfo(emailId, participantId, provisional).getBody();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Wrapup> getConversationsEmailParticipantWrapupWithHttpInfo(String emailId, String participantId, Boolean provisional) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling getConversationsEmailParticipantWrapup");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling getConversationsEmailParticipantWrapup");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}/participants/{participantId}/wrapup".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "provisional", provisional));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Wrapup>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Wrapup getConversationsEmailParticipantWrapup(GetConversationsEmailParticipantWrapupRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Wrapup>() {});
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Wrapup> getConversationsEmailParticipantWrapup(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Wrapup>invokeAPIVerbose(request, new TypeReference<Wrapup>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> getConversationsEmailParticipantWrapupcodes(String emailId, String participantId) throws ApiException {
    return getConversationsEmailParticipantWrapupcodesWithHttpInfo(emailId, participantId).getBody();
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> getConversationsEmailParticipantWrapupcodesWithHttpInfo(String emailId, String participantId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling getConversationsEmailParticipantWrapupcodes");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling getConversationsEmailParticipantWrapupcodes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}/participants/{participantId}/wrapupcodes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> getConversationsEmailParticipantWrapupcodes(GetConversationsEmailParticipantWrapupcodesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> getConversationsEmailParticipantWrapupcodes(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerbose(request, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Get recent email conversations
   * 
   * @return EmailConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public EmailConversationEntityListing getConversationsEmails() throws ApiException {
    return getConversationsEmailsWithHttpInfo().getBody();
  }

  /**
   * Get recent email conversations
   * 
   * @return EmailConversationEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailConversationEntityListing> getConversationsEmailsWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EmailConversationEntityListing>() {});
  }

  /**
   * Get recent email conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EmailConversationEntityListing getConversationsEmails(GetConversationsEmailsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EmailConversationEntityListing>() {});
  }

  /**
   * Get recent email conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailConversationEntityListing> getConversationsEmails(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EmailConversationEntityListing>invokeAPIVerbose(request, new TypeReference<EmailConversationEntityListing>() {});
  }

  /**
   * Update a participant.
   * Update conversation participant.
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Update request (required)
   * @throws ApiException if fails to make API call
   */
  public void patchConversationParticipant(String conversationId, String participantId, MediaParticipantRequest body) throws ApiException {
    patchConversationParticipantWithHttpInfo(conversationId, participantId, body);
  }

  /**
   * Update a participant.
   * Update conversation participant.
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Update request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationParticipantWithHttpInfo(String conversationId, String participantId, MediaParticipantRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling patchConversationParticipant");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationParticipant");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationParticipant");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/participants/{participantId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Update a participant.
   * Update conversation participant.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchConversationParticipant(PatchConversationParticipantRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Update a participant.
   * Update conversation participant.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationParticipant(ApiRequest<MediaParticipantRequest> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Participant attributes (required)
   * @throws ApiException if fails to make API call
   */
  public void patchConversationParticipantAttributes(String conversationId, String participantId, ParticipantAttributes body) throws ApiException {
    patchConversationParticipantAttributesWithHttpInfo(conversationId, participantId, body);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Participant attributes (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationParticipantAttributesWithHttpInfo(String conversationId, String participantId, ParticipantAttributes body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling patchConversationParticipantAttributes");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationParticipantAttributes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationParticipantAttributes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/participants/{participantId}/attributes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchConversationParticipantAttributes(PatchConversationParticipantAttributesRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationParticipantAttributes(ApiRequest<ParticipantAttributes> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public Conversation patchConversationsCall(String callId, Conversation body) throws ApiException {
    return patchConversationsCallWithHttpInfo(callId, body).getBody();
  }

  /**
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> patchConversationsCallWithHttpInfo(String callId, Conversation body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling patchConversationsCall");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsCall");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Conversation>() {});
  }

  /**
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Conversation patchConversationsCall(PatchConversationsCallRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Conversation>() {});
  }

  /**
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> patchConversationsCall(ApiRequest<Conversation> request) throws ApiException {
    return pcapiClient.<Conversation>invokeAPIVerbose(request, new TypeReference<Conversation>() {});
  }

  /**
   * Update conversation participant
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Participant request (required)
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsCallParticipant(String callId, String participantId, MediaParticipantRequest body) throws ApiException {
    patchConversationsCallParticipantWithHttpInfo(callId, participantId, body);
  }

  /**
   * Update conversation participant
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Participant request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsCallParticipantWithHttpInfo(String callId, String participantId, MediaParticipantRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling patchConversationsCallParticipant");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsCallParticipant");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsCallParticipant");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}/participants/{participantId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsCallParticipant(PatchConversationsCallParticipantRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsCallParticipant(ApiRequest<MediaParticipantRequest> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsCallParticipantAttributes(String callId, String participantId, ParticipantAttributes body) throws ApiException {
    patchConversationsCallParticipantAttributesWithHttpInfo(callId, participantId, body);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsCallParticipantAttributesWithHttpInfo(String callId, String participantId, ParticipantAttributes body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling patchConversationsCallParticipantAttributes");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsCallParticipantAttributes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsCallParticipantAttributes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}/participants/{participantId}/attributes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsCallParticipantAttributes(PatchConversationsCallParticipantAttributesRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsCallParticipantAttributes(ApiRequest<ParticipantAttributes> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty patchConversationsCallParticipantCommunication(String callId, String participantId, String communicationId, MediaParticipantRequest body) throws ApiException {
    return patchConversationsCallParticipantCommunicationWithHttpInfo(callId, participantId, communicationId, body).getBody();
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> patchConversationsCallParticipantCommunicationWithHttpInfo(String callId, String participantId, String communicationId, MediaParticipantRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling patchConversationsCallParticipantCommunication");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsCallParticipantCommunication");
    }
    
    // verify the required parameter 'communicationId' is set
    if (communicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'communicationId' when calling patchConversationsCallParticipantCommunication");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsCallParticipantCommunication");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}/participants/{participantId}/communications/{communicationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()))
      .replaceAll("\\{" + "communicationId" + "\\}", pcapiClient.escapeString(communicationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty patchConversationsCallParticipantCommunication(PatchConversationsCallParticipantCommunicationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> patchConversationsCallParticipantCommunication(ApiRequest<MediaParticipantRequest> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Change who can speak
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body new speak to (required)
   * @return ConsultTransferResponse
   * @throws ApiException if fails to make API call
   */
  public ConsultTransferResponse patchConversationsCallParticipantConsult(String callId, String participantId, ConsultTransferUpdate body) throws ApiException {
    return patchConversationsCallParticipantConsultWithHttpInfo(callId, participantId, body).getBody();
  }

  /**
   * Change who can speak
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body new speak to (required)
   * @return ConsultTransferResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsultTransferResponse> patchConversationsCallParticipantConsultWithHttpInfo(String callId, String participantId, ConsultTransferUpdate body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling patchConversationsCallParticipantConsult");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsCallParticipantConsult");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsCallParticipantConsult");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}/participants/{participantId}/consult".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ConsultTransferResponse>() {});
  }

  /**
   * Change who can speak
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ConsultTransferResponse patchConversationsCallParticipantConsult(PatchConversationsCallParticipantConsultRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ConsultTransferResponse>() {});
  }

  /**
   * Change who can speak
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsultTransferResponse> patchConversationsCallParticipantConsult(ApiRequest<ConsultTransferUpdate> request) throws ApiException {
    return pcapiClient.<ConsultTransferResponse>invokeAPIVerbose(request, new TypeReference<ConsultTransferResponse>() {});
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param callbackId callbackId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public Conversation patchConversationsCallback(String callbackId, Conversation body) throws ApiException {
    return patchConversationsCallbackWithHttpInfo(callbackId, body).getBody();
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param callbackId callbackId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> patchConversationsCallbackWithHttpInfo(String callbackId, Conversation body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callbackId' is set
    if (callbackId == null) {
      throw new ApiException(400, "Missing the required parameter 'callbackId' when calling patchConversationsCallback");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsCallback");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/callbacks/{callbackId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callbackId" + "\\}", pcapiClient.escapeString(callbackId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Conversation>() {});
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Conversation patchConversationsCallback(PatchConversationsCallbackRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Conversation>() {});
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> patchConversationsCallback(ApiRequest<Conversation> request) throws ApiException {
    return pcapiClient.<Conversation>invokeAPIVerbose(request, new TypeReference<Conversation>() {});
  }

  /**
   * Update conversation participant
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Participant (required)
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsCallbackParticipant(String callbackId, String participantId, MediaParticipantRequest body) throws ApiException {
    patchConversationsCallbackParticipantWithHttpInfo(callbackId, participantId, body);
  }

  /**
   * Update conversation participant
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Participant (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsCallbackParticipantWithHttpInfo(String callbackId, String participantId, MediaParticipantRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callbackId' is set
    if (callbackId == null) {
      throw new ApiException(400, "Missing the required parameter 'callbackId' when calling patchConversationsCallbackParticipant");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsCallbackParticipant");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsCallbackParticipant");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/callbacks/{callbackId}/participants/{participantId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callbackId" + "\\}", pcapiClient.escapeString(callbackId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsCallbackParticipant(PatchConversationsCallbackParticipantRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsCallbackParticipant(ApiRequest<MediaParticipantRequest> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Attributes (required)
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsCallbackParticipantAttributes(String callbackId, String participantId, ParticipantAttributes body) throws ApiException {
    patchConversationsCallbackParticipantAttributesWithHttpInfo(callbackId, participantId, body);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Attributes (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsCallbackParticipantAttributesWithHttpInfo(String callbackId, String participantId, ParticipantAttributes body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callbackId' is set
    if (callbackId == null) {
      throw new ApiException(400, "Missing the required parameter 'callbackId' when calling patchConversationsCallbackParticipantAttributes");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsCallbackParticipantAttributes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsCallbackParticipantAttributes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/attributes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callbackId" + "\\}", pcapiClient.escapeString(callbackId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsCallbackParticipantAttributes(PatchConversationsCallbackParticipantAttributesRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsCallbackParticipantAttributes(ApiRequest<ParticipantAttributes> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty patchConversationsCallbackParticipantCommunication(String callbackId, String participantId, String communicationId, MediaParticipantRequest body) throws ApiException {
    return patchConversationsCallbackParticipantCommunicationWithHttpInfo(callbackId, participantId, communicationId, body).getBody();
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> patchConversationsCallbackParticipantCommunicationWithHttpInfo(String callbackId, String participantId, String communicationId, MediaParticipantRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callbackId' is set
    if (callbackId == null) {
      throw new ApiException(400, "Missing the required parameter 'callbackId' when calling patchConversationsCallbackParticipantCommunication");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsCallbackParticipantCommunication");
    }
    
    // verify the required parameter 'communicationId' is set
    if (communicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'communicationId' when calling patchConversationsCallbackParticipantCommunication");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsCallbackParticipantCommunication");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/communications/{communicationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callbackId" + "\\}", pcapiClient.escapeString(callbackId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()))
      .replaceAll("\\{" + "communicationId" + "\\}", pcapiClient.escapeString(communicationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty patchConversationsCallbackParticipantCommunication(PatchConversationsCallbackParticipantCommunicationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> patchConversationsCallbackParticipantCommunication(ApiRequest<MediaParticipantRequest> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param chatId chatId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public Conversation patchConversationsChat(String chatId, Conversation body) throws ApiException {
    return patchConversationsChatWithHttpInfo(chatId, body).getBody();
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param chatId chatId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> patchConversationsChatWithHttpInfo(String chatId, Conversation body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling patchConversationsChat");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsChat");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/chats/{chatId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chatId" + "\\}", pcapiClient.escapeString(chatId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Conversation>() {});
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Conversation patchConversationsChat(PatchConversationsChatRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Conversation>() {});
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> patchConversationsChat(ApiRequest<Conversation> request) throws ApiException {
    return pcapiClient.<Conversation>invokeAPIVerbose(request, new TypeReference<Conversation>() {});
  }

  /**
   * Update conversation participant
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsChatParticipant(String chatId, String participantId, MediaParticipantRequest body) throws ApiException {
    patchConversationsChatParticipantWithHttpInfo(chatId, participantId, body);
  }

  /**
   * Update conversation participant
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsChatParticipantWithHttpInfo(String chatId, String participantId, MediaParticipantRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling patchConversationsChatParticipant");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsChatParticipant");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsChatParticipant");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/chats/{chatId}/participants/{participantId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chatId" + "\\}", pcapiClient.escapeString(chatId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsChatParticipant(PatchConversationsChatParticipantRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsChatParticipant(ApiRequest<MediaParticipantRequest> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsChatParticipantAttributes(String chatId, String participantId, ParticipantAttributes body) throws ApiException {
    patchConversationsChatParticipantAttributesWithHttpInfo(chatId, participantId, body);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsChatParticipantAttributesWithHttpInfo(String chatId, String participantId, ParticipantAttributes body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling patchConversationsChatParticipantAttributes");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsChatParticipantAttributes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsChatParticipantAttributes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/chats/{chatId}/participants/{participantId}/attributes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chatId" + "\\}", pcapiClient.escapeString(chatId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsChatParticipantAttributes(PatchConversationsChatParticipantAttributesRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsChatParticipantAttributes(ApiRequest<ParticipantAttributes> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty patchConversationsChatParticipantCommunication(String chatId, String participantId, String communicationId, MediaParticipantRequest body) throws ApiException {
    return patchConversationsChatParticipantCommunicationWithHttpInfo(chatId, participantId, communicationId, body).getBody();
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> patchConversationsChatParticipantCommunicationWithHttpInfo(String chatId, String participantId, String communicationId, MediaParticipantRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling patchConversationsChatParticipantCommunication");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsChatParticipantCommunication");
    }
    
    // verify the required parameter 'communicationId' is set
    if (communicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'communicationId' when calling patchConversationsChatParticipantCommunication");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsChatParticipantCommunication");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/chats/{chatId}/participants/{participantId}/communications/{communicationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chatId" + "\\}", pcapiClient.escapeString(chatId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()))
      .replaceAll("\\{" + "communicationId" + "\\}", pcapiClient.escapeString(communicationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty patchConversationsChatParticipantCommunication(PatchConversationsChatParticipantCommunicationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> patchConversationsChatParticipantCommunication(ApiRequest<MediaParticipantRequest> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param cobrowseId cobrowseId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public Conversation patchConversationsCobrowsesession(String cobrowseId, Conversation body) throws ApiException {
    return patchConversationsCobrowsesessionWithHttpInfo(cobrowseId, body).getBody();
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param cobrowseId cobrowseId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> patchConversationsCobrowsesessionWithHttpInfo(String cobrowseId, Conversation body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'cobrowseId' is set
    if (cobrowseId == null) {
      throw new ApiException(400, "Missing the required parameter 'cobrowseId' when calling patchConversationsCobrowsesession");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsCobrowsesession");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/cobrowsesessions/{cobrowseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cobrowseId" + "\\}", pcapiClient.escapeString(cobrowseId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Conversation>() {});
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Conversation patchConversationsCobrowsesession(PatchConversationsCobrowsesessionRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Conversation>() {});
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> patchConversationsCobrowsesession(ApiRequest<Conversation> request) throws ApiException {
    return pcapiClient.<Conversation>invokeAPIVerbose(request, new TypeReference<Conversation>() {});
  }

  /**
   * Update conversation participant
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsCobrowsesessionParticipant(String cobrowseId, String participantId, MediaParticipantRequest body) throws ApiException {
    patchConversationsCobrowsesessionParticipantWithHttpInfo(cobrowseId, participantId, body);
  }

  /**
   * Update conversation participant
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsCobrowsesessionParticipantWithHttpInfo(String cobrowseId, String participantId, MediaParticipantRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'cobrowseId' is set
    if (cobrowseId == null) {
      throw new ApiException(400, "Missing the required parameter 'cobrowseId' when calling patchConversationsCobrowsesessionParticipant");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsCobrowsesessionParticipant");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cobrowseId" + "\\}", pcapiClient.escapeString(cobrowseId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsCobrowsesessionParticipant(PatchConversationsCobrowsesessionParticipantRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsCobrowsesessionParticipant(ApiRequest<MediaParticipantRequest> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsCobrowsesessionParticipantAttributes(String cobrowseId, String participantId, ParticipantAttributes body) throws ApiException {
    patchConversationsCobrowsesessionParticipantAttributesWithHttpInfo(cobrowseId, participantId, body);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsCobrowsesessionParticipantAttributesWithHttpInfo(String cobrowseId, String participantId, ParticipantAttributes body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'cobrowseId' is set
    if (cobrowseId == null) {
      throw new ApiException(400, "Missing the required parameter 'cobrowseId' when calling patchConversationsCobrowsesessionParticipantAttributes");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsCobrowsesessionParticipantAttributes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/attributes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cobrowseId" + "\\}", pcapiClient.escapeString(cobrowseId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsCobrowsesessionParticipantAttributes(PatchConversationsCobrowsesessionParticipantAttributesRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsCobrowsesessionParticipantAttributes(ApiRequest<ParticipantAttributes> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty patchConversationsCobrowsesessionParticipantCommunication(String cobrowseId, String participantId, String communicationId, MediaParticipantRequest body) throws ApiException {
    return patchConversationsCobrowsesessionParticipantCommunicationWithHttpInfo(cobrowseId, participantId, communicationId, body).getBody();
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> patchConversationsCobrowsesessionParticipantCommunicationWithHttpInfo(String cobrowseId, String participantId, String communicationId, MediaParticipantRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'cobrowseId' is set
    if (cobrowseId == null) {
      throw new ApiException(400, "Missing the required parameter 'cobrowseId' when calling patchConversationsCobrowsesessionParticipantCommunication");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsCobrowsesessionParticipantCommunication");
    }
    
    // verify the required parameter 'communicationId' is set
    if (communicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'communicationId' when calling patchConversationsCobrowsesessionParticipantCommunication");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsCobrowsesessionParticipantCommunication");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/communications/{communicationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cobrowseId" + "\\}", pcapiClient.escapeString(cobrowseId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()))
      .replaceAll("\\{" + "communicationId" + "\\}", pcapiClient.escapeString(communicationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty patchConversationsCobrowsesessionParticipantCommunication(PatchConversationsCobrowsesessionParticipantCommunicationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> patchConversationsCobrowsesessionParticipantCommunication(ApiRequest<MediaParticipantRequest> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param emailId emailId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public Conversation patchConversationsEmail(String emailId, Conversation body) throws ApiException {
    return patchConversationsEmailWithHttpInfo(emailId, body).getBody();
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param emailId emailId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> patchConversationsEmailWithHttpInfo(String emailId, Conversation body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling patchConversationsEmail");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsEmail");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Conversation>() {});
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Conversation patchConversationsEmail(PatchConversationsEmailRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Conversation>() {});
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> patchConversationsEmail(ApiRequest<Conversation> request) throws ApiException {
    return pcapiClient.<Conversation>invokeAPIVerbose(request, new TypeReference<Conversation>() {});
  }

  /**
   * Update conversation participant
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsEmailParticipant(String emailId, String participantId, MediaParticipantRequest body) throws ApiException {
    patchConversationsEmailParticipantWithHttpInfo(emailId, participantId, body);
  }

  /**
   * Update conversation participant
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsEmailParticipantWithHttpInfo(String emailId, String participantId, MediaParticipantRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling patchConversationsEmailParticipant");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsEmailParticipant");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsEmailParticipant");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}/participants/{participantId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsEmailParticipant(PatchConversationsEmailParticipantRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsEmailParticipant(ApiRequest<MediaParticipantRequest> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsEmailParticipantAttributes(String emailId, String participantId, ParticipantAttributes body) throws ApiException {
    patchConversationsEmailParticipantAttributesWithHttpInfo(emailId, participantId, body);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsEmailParticipantAttributesWithHttpInfo(String emailId, String participantId, ParticipantAttributes body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling patchConversationsEmailParticipantAttributes");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsEmailParticipantAttributes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsEmailParticipantAttributes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}/participants/{participantId}/attributes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchConversationsEmailParticipantAttributes(PatchConversationsEmailParticipantAttributesRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchConversationsEmailParticipantAttributes(ApiRequest<ParticipantAttributes> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty patchConversationsEmailParticipantCommunication(String emailId, String participantId, String communicationId, MediaParticipantRequest body) throws ApiException {
    return patchConversationsEmailParticipantCommunicationWithHttpInfo(emailId, participantId, communicationId, body).getBody();
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> patchConversationsEmailParticipantCommunicationWithHttpInfo(String emailId, String participantId, String communicationId, MediaParticipantRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling patchConversationsEmailParticipantCommunication");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling patchConversationsEmailParticipantCommunication");
    }
    
    // verify the required parameter 'communicationId' is set
    if (communicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'communicationId' when calling patchConversationsEmailParticipantCommunication");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchConversationsEmailParticipantCommunication");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}/participants/{participantId}/communications/{communicationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()))
      .replaceAll("\\{" + "communicationId" + "\\}", pcapiClient.escapeString(communicationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty patchConversationsEmailParticipantCommunication(PatchConversationsEmailParticipantCommunicationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> patchConversationsEmailParticipantCommunication(ApiRequest<MediaParticipantRequest> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (required)
   * @return PropertyIndexRequest
   * @throws ApiException if fails to make API call
   */
  public PropertyIndexRequest postAnalyticsConversationDetailsProperties(String conversationId, PropertyIndexRequest body) throws ApiException {
    return postAnalyticsConversationDetailsPropertiesWithHttpInfo(conversationId, body).getBody();
  }

  /**
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (required)
   * @return PropertyIndexRequest
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PropertyIndexRequest> postAnalyticsConversationDetailsPropertiesWithHttpInfo(String conversationId, PropertyIndexRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling postAnalyticsConversationDetailsProperties");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postAnalyticsConversationDetailsProperties");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/conversations/{conversationId}/details/properties".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PropertyIndexRequest>() {});
  }

  /**
   * Index conversation properties
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PropertyIndexRequest postAnalyticsConversationDetailsProperties(PostAnalyticsConversationDetailsPropertiesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PropertyIndexRequest>() {});
  }

  /**
   * Index conversation properties
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PropertyIndexRequest> postAnalyticsConversationDetailsProperties(ApiRequest<PropertyIndexRequest> request) throws ApiException {
    return pcapiClient.<PropertyIndexRequest>invokeAPIVerbose(request, new TypeReference<PropertyIndexRequest>() {});
  }

  /**
   * Query for conversation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if fails to make API call
   */
  public AggregateQueryResponse postAnalyticsConversationsAggregatesQuery(AggregationQuery body) throws ApiException {
    return postAnalyticsConversationsAggregatesQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query for conversation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsConversationsAggregatesQueryWithHttpInfo(AggregationQuery body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postAnalyticsConversationsAggregatesQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/conversations/aggregates/query".replaceAll("\\{format\\}","json");

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
   * Query for conversation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AggregateQueryResponse postAnalyticsConversationsAggregatesQuery(PostAnalyticsConversationsAggregatesQueryRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {});
  }

  /**
   * Query for conversation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsConversationsAggregatesQuery(ApiRequest<AggregationQuery> request) throws ApiException {
    return pcapiClient.<AggregateQueryResponse>invokeAPIVerbose(request, new TypeReference<AggregateQueryResponse>() {});
  }

  /**
   * Query for conversation details
   * 
   * @param body query (required)
   * @return AnalyticsConversationQueryResponse
   * @throws ApiException if fails to make API call
   */
  public AnalyticsConversationQueryResponse postAnalyticsConversationsDetailsQuery(ConversationQuery body) throws ApiException {
    return postAnalyticsConversationsDetailsQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query for conversation details
   * 
   * @param body query (required)
   * @return AnalyticsConversationQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQueryWithHttpInfo(ConversationQuery body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postAnalyticsConversationsDetailsQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/conversations/details/query".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AnalyticsConversationQueryResponse>() {});
  }

  /**
   * Query for conversation details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AnalyticsConversationQueryResponse postAnalyticsConversationsDetailsQuery(PostAnalyticsConversationsDetailsQueryRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AnalyticsConversationQueryResponse>() {});
  }

  /**
   * Query for conversation details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQuery(ApiRequest<ConversationQuery> request) throws ApiException {
    return pcapiClient.<AnalyticsConversationQueryResponse>invokeAPIVerbose(request, new TypeReference<AnalyticsConversationQueryResponse>() {});
  }

  /**
   * Create a new callback for the specified participant on the conversation.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void postConversationParticipantCallbacks(String conversationId, String participantId, CreateCallbackCommand body) throws ApiException {
    postConversationParticipantCallbacksWithHttpInfo(conversationId, participantId, body);
  }

  /**
   * Create a new callback for the specified participant on the conversation.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationParticipantCallbacksWithHttpInfo(String conversationId, String participantId, CreateCallbackCommand body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling postConversationParticipantCallbacks");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling postConversationParticipantCallbacks");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/participants/{participantId}/callbacks".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Create a new callback for the specified participant on the conversation.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postConversationParticipantCallbacks(PostConversationParticipantCallbacksRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Create a new callback for the specified participant on the conversation.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationParticipantCallbacks(ApiRequest<CreateCallbackCommand> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Transfer request (required)
   * @throws ApiException if fails to make API call
   */
  public void postConversationParticipantReplace(String conversationId, String participantId, TransferRequest body) throws ApiException {
    postConversationParticipantReplaceWithHttpInfo(conversationId, participantId, body);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Transfer request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationParticipantReplaceWithHttpInfo(String conversationId, String participantId, TransferRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling postConversationParticipantReplace");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling postConversationParticipantReplace");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationParticipantReplace");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/participants/{participantId}/replace".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postConversationParticipantReplace(PostConversationParticipantReplaceRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationParticipantReplace(ApiRequest<TransferRequest> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Add a new call to a conversation
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public Conversation postConversationsCall(String callId, CallCommand body) throws ApiException {
    return postConversationsCallWithHttpInfo(callId, body).getBody();
  }

  /**
   * Add a new call to a conversation
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> postConversationsCallWithHttpInfo(String callId, CallCommand body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling postConversationsCall");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationsCall");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Conversation>() {});
  }

  /**
   * Add a new call to a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Conversation postConversationsCall(PostConversationsCallRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Conversation>() {});
  }

  /**
   * Add a new call to a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> postConversationsCall(ApiRequest<CallCommand> request) throws ApiException {
    return pcapiClient.<Conversation>invokeAPIVerbose(request, new TypeReference<Conversation>() {});
  }

  /**
   * Initiate and update consult transfer
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Destination address &amp; initial speak to (required)
   * @return ConsultTransferResponse
   * @throws ApiException if fails to make API call
   */
  public ConsultTransferResponse postConversationsCallParticipantConsult(String callId, String participantId, ConsultTransfer body) throws ApiException {
    return postConversationsCallParticipantConsultWithHttpInfo(callId, participantId, body).getBody();
  }

  /**
   * Initiate and update consult transfer
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Destination address &amp; initial speak to (required)
   * @return ConsultTransferResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsultTransferResponse> postConversationsCallParticipantConsultWithHttpInfo(String callId, String participantId, ConsultTransfer body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling postConversationsCallParticipantConsult");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling postConversationsCallParticipantConsult");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationsCallParticipantConsult");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}/participants/{participantId}/consult".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ConsultTransferResponse>() {});
  }

  /**
   * Initiate and update consult transfer
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ConsultTransferResponse postConversationsCallParticipantConsult(PostConversationsCallParticipantConsultRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ConsultTransferResponse>() {});
  }

  /**
   * Initiate and update consult transfer
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsultTransferResponse> postConversationsCallParticipantConsult(ApiRequest<ConsultTransfer> request) throws ApiException {
    return pcapiClient.<ConsultTransferResponse>invokeAPIVerbose(request, new TypeReference<ConsultTransferResponse>() {});
  }

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @throws ApiException if fails to make API call
   */
  public void postConversationsCallParticipantMonitor(String callId, String participantId) throws ApiException {
    postConversationsCallParticipantMonitorWithHttpInfo(callId, participantId);
  }

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationsCallParticipantMonitorWithHttpInfo(String callId, String participantId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling postConversationsCallParticipantMonitor");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling postConversationsCallParticipantMonitor");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}/participants/{participantId}/monitor".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postConversationsCallParticipantMonitor(PostConversationsCallParticipantMonitorRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationsCallParticipantMonitor(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if fails to make API call
   */
  public void postConversationsCallParticipantReplace(String callId, String participantId, TransferRequest body) throws ApiException {
    postConversationsCallParticipantReplaceWithHttpInfo(callId, participantId, body);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationsCallParticipantReplaceWithHttpInfo(String callId, String participantId, TransferRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling postConversationsCallParticipantReplace");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling postConversationsCallParticipantReplace");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationsCallParticipantReplace");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}/participants/{participantId}/replace".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postConversationsCallParticipantReplace(PostConversationsCallParticipantReplaceRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationsCallParticipantReplace(ApiRequest<TransferRequest> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Add participants to a conversation
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public Conversation postConversationsCallParticipants(String callId, Conversation body) throws ApiException {
    return postConversationsCallParticipantsWithHttpInfo(callId, body).getBody();
  }

  /**
   * Add participants to a conversation
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> postConversationsCallParticipantsWithHttpInfo(String callId, Conversation body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callId' is set
    if (callId == null) {
      throw new ApiException(400, "Missing the required parameter 'callId' when calling postConversationsCallParticipants");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationsCallParticipants");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls/{callId}/participants".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callId" + "\\}", pcapiClient.escapeString(callId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Conversation>() {});
  }

  /**
   * Add participants to a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Conversation postConversationsCallParticipants(PostConversationsCallParticipantsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Conversation>() {});
  }

  /**
   * Add participants to a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Conversation> postConversationsCallParticipants(ApiRequest<Conversation> request) throws ApiException {
    return pcapiClient.<Conversation>invokeAPIVerbose(request, new TypeReference<Conversation>() {});
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if fails to make API call
   */
  public void postConversationsCallbackParticipantReplace(String callbackId, String participantId, TransferRequest body) throws ApiException {
    postConversationsCallbackParticipantReplaceWithHttpInfo(callbackId, participantId, body);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationsCallbackParticipantReplaceWithHttpInfo(String callbackId, String participantId, TransferRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callbackId' is set
    if (callbackId == null) {
      throw new ApiException(400, "Missing the required parameter 'callbackId' when calling postConversationsCallbackParticipantReplace");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling postConversationsCallbackParticipantReplace");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationsCallbackParticipantReplace");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/replace".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callbackId" + "\\}", pcapiClient.escapeString(callbackId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postConversationsCallbackParticipantReplace(PostConversationsCallbackParticipantReplaceRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationsCallbackParticipantReplace(ApiRequest<TransferRequest> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Create a Callback
   * 
   * @param body Callback (required)
   * @return CreateCallbackResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCallbackResponse postConversationsCallbacks(CreateCallbackCommand body) throws ApiException {
    return postConversationsCallbacksWithHttpInfo(body).getBody();
  }

  /**
   * Create a Callback
   * 
   * @param body Callback (required)
   * @return CreateCallbackResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateCallbackResponse> postConversationsCallbacksWithHttpInfo(CreateCallbackCommand body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationsCallbacks");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/callbacks".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CreateCallbackResponse>() {});
  }

  /**
   * Create a Callback
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CreateCallbackResponse postConversationsCallbacks(PostConversationsCallbacksRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CreateCallbackResponse>() {});
  }

  /**
   * Create a Callback
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateCallbackResponse> postConversationsCallbacks(ApiRequest<CreateCallbackCommand> request) throws ApiException {
    return pcapiClient.<CreateCallbackResponse>invokeAPIVerbose(request, new TypeReference<CreateCallbackResponse>() {});
  }

  /**
   * Create a call conversation
   * 
   * @param body Call request (required)
   * @return CreateCallResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCallResponse postConversationsCalls(CreateCallRequest body) throws ApiException {
    return postConversationsCallsWithHttpInfo(body).getBody();
  }

  /**
   * Create a call conversation
   * 
   * @param body Call request (required)
   * @return CreateCallResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateCallResponse> postConversationsCallsWithHttpInfo(CreateCallRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationsCalls");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/calls".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CreateCallResponse>() {});
  }

  /**
   * Create a call conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CreateCallResponse postConversationsCalls(PostConversationsCallsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CreateCallResponse>() {});
  }

  /**
   * Create a call conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateCallResponse> postConversationsCalls(ApiRequest<CreateCallRequest> request) throws ApiException {
    return pcapiClient.<CreateCallResponse>invokeAPIVerbose(request, new TypeReference<CreateCallResponse>() {});
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if fails to make API call
   */
  public void postConversationsChatParticipantReplace(String chatId, String participantId, TransferRequest body) throws ApiException {
    postConversationsChatParticipantReplaceWithHttpInfo(chatId, participantId, body);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationsChatParticipantReplaceWithHttpInfo(String chatId, String participantId, TransferRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      throw new ApiException(400, "Missing the required parameter 'chatId' when calling postConversationsChatParticipantReplace");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling postConversationsChatParticipantReplace");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationsChatParticipantReplace");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/chats/{chatId}/participants/{participantId}/replace".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "chatId" + "\\}", pcapiClient.escapeString(chatId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postConversationsChatParticipantReplace(PostConversationsChatParticipantReplaceRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationsChatParticipantReplace(ApiRequest<TransferRequest> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Create a web chat conversation
   * 
   * @param body Create web chat request (required)
   * @return ChatConversation
   * @throws ApiException if fails to make API call
   */
  public ChatConversation postConversationsChats(CreateWebChatRequest body) throws ApiException {
    return postConversationsChatsWithHttpInfo(body).getBody();
  }

  /**
   * Create a web chat conversation
   * 
   * @param body Create web chat request (required)
   * @return ChatConversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChatConversation> postConversationsChatsWithHttpInfo(CreateWebChatRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationsChats");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/chats".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ChatConversation>() {});
  }

  /**
   * Create a web chat conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ChatConversation postConversationsChats(PostConversationsChatsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ChatConversation>() {});
  }

  /**
   * Create a web chat conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChatConversation> postConversationsChats(ApiRequest<CreateWebChatRequest> request) throws ApiException {
    return pcapiClient.<ChatConversation>invokeAPIVerbose(request, new TypeReference<ChatConversation>() {});
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void postConversationsCobrowsesessionParticipantReplace(String cobrowseId, String participantId, TransferRequest body) throws ApiException {
    postConversationsCobrowsesessionParticipantReplaceWithHttpInfo(cobrowseId, participantId, body);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationsCobrowsesessionParticipantReplaceWithHttpInfo(String cobrowseId, String participantId, TransferRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'cobrowseId' is set
    if (cobrowseId == null) {
      throw new ApiException(400, "Missing the required parameter 'cobrowseId' when calling postConversationsCobrowsesessionParticipantReplace");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling postConversationsCobrowsesessionParticipantReplace");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/cobrowsesessions/{cobrowseId}/participants/{participantId}/replace".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cobrowseId" + "\\}", pcapiClient.escapeString(cobrowseId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postConversationsCobrowsesessionParticipantReplace(PostConversationsCobrowsesessionParticipantReplaceRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationsCobrowsesessionParticipantReplace(ApiRequest<TransferRequest> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Send an email reply
   * 
   * @param emailId emailId (required)
   * @param body Reply (required)
   * @return EmailMessage
   * @throws ApiException if fails to make API call
   */
  public EmailMessage postConversationsEmailMessages(String emailId, EmailMessage body) throws ApiException {
    return postConversationsEmailMessagesWithHttpInfo(emailId, body).getBody();
  }

  /**
   * Send an email reply
   * 
   * @param emailId emailId (required)
   * @param body Reply (required)
   * @return EmailMessage
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailMessage> postConversationsEmailMessagesWithHttpInfo(String emailId, EmailMessage body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling postConversationsEmailMessages");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationsEmailMessages");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}/messages".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EmailMessage>() {});
  }

  /**
   * Send an email reply
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EmailMessage postConversationsEmailMessages(PostConversationsEmailMessagesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EmailMessage>() {});
  }

  /**
   * Send an email reply
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailMessage> postConversationsEmailMessages(ApiRequest<EmailMessage> request) throws ApiException {
    return pcapiClient.<EmailMessage>invokeAPIVerbose(request, new TypeReference<EmailMessage>() {});
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if fails to make API call
   */
  public void postConversationsEmailParticipantReplace(String emailId, String participantId, TransferRequest body) throws ApiException {
    postConversationsEmailParticipantReplaceWithHttpInfo(emailId, participantId, body);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationsEmailParticipantReplaceWithHttpInfo(String emailId, String participantId, TransferRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling postConversationsEmailParticipantReplace");
    }
    
    // verify the required parameter 'participantId' is set
    if (participantId == null) {
      throw new ApiException(400, "Missing the required parameter 'participantId' when calling postConversationsEmailParticipantReplace");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationsEmailParticipantReplace");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}/participants/{participantId}/replace".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()))
      .replaceAll("\\{" + "participantId" + "\\}", pcapiClient.escapeString(participantId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postConversationsEmailParticipantReplace(PostConversationsEmailParticipantReplaceRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postConversationsEmailParticipantReplace(ApiRequest<TransferRequest> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Create an email conversation
   * 
   * @param body Create email request (required)
   * @return EmailConversation
   * @throws ApiException if fails to make API call
   */
  public EmailConversation postConversationsEmails(CreateEmailRequest body) throws ApiException {
    return postConversationsEmailsWithHttpInfo(body).getBody();
  }

  /**
   * Create an email conversation
   * 
   * @param body Create email request (required)
   * @return EmailConversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailConversation> postConversationsEmailsWithHttpInfo(CreateEmailRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationsEmails");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EmailConversation>() {});
  }

  /**
   * Create an email conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EmailConversation postConversationsEmails(PostConversationsEmailsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EmailConversation>() {});
  }

  /**
   * Create an email conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailConversation> postConversationsEmails(ApiRequest<CreateEmailRequest> request) throws ApiException {
    return pcapiClient.<EmailConversation>invokeAPIVerbose(request, new TypeReference<EmailConversation>() {});
  }

  /**
   * Create Fax Conversation
   * 
   * @param body Fax (required)
   * @return FaxSendResponse
   * @throws ApiException if fails to make API call
   */
  public FaxSendResponse postConversationsFaxes(FaxSendRequest body) throws ApiException {
    return postConversationsFaxesWithHttpInfo(body).getBody();
  }

  /**
   * Create Fax Conversation
   * 
   * @param body Fax (required)
   * @return FaxSendResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaxSendResponse> postConversationsFaxesWithHttpInfo(FaxSendRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postConversationsFaxes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/faxes".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<FaxSendResponse>() {});
  }

  /**
   * Create Fax Conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public FaxSendResponse postConversationsFaxes(PostConversationsFaxesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FaxSendResponse>() {});
  }

  /**
   * Create Fax Conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaxSendResponse> postConversationsFaxes(ApiRequest<FaxSendRequest> request) throws ApiException {
    return pcapiClient.<FaxSendResponse>invokeAPIVerbose(request, new TypeReference<FaxSendResponse>() {});
  }

  /**
   * Update conversation draft reply
   * 
   * @param emailId emailId (required)
   * @param body Draft (required)
   * @return EmailMessage
   * @throws ApiException if fails to make API call
   */
  public EmailMessage putConversationsEmailMessagesDraft(String emailId, EmailMessage body) throws ApiException {
    return putConversationsEmailMessagesDraftWithHttpInfo(emailId, body).getBody();
  }

  /**
   * Update conversation draft reply
   * 
   * @param emailId emailId (required)
   * @param body Draft (required)
   * @return EmailMessage
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailMessage> putConversationsEmailMessagesDraftWithHttpInfo(String emailId, EmailMessage body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'emailId' is set
    if (emailId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailId' when calling putConversationsEmailMessagesDraft");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putConversationsEmailMessagesDraft");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/emails/{emailId}/messages/draft".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailId" + "\\}", pcapiClient.escapeString(emailId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EmailMessage>() {});
  }

  /**
   * Update conversation draft reply
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EmailMessage putConversationsEmailMessagesDraft(PutConversationsEmailMessagesDraftRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EmailMessage>() {});
  }

  /**
   * Update conversation draft reply
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailMessage> putConversationsEmailMessagesDraft(ApiRequest<EmailMessage> request) throws ApiException {
    return pcapiClient.<EmailMessage>invokeAPIVerbose(request, new TypeReference<EmailMessage>() {});
  }

}
