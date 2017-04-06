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

import java.io.IOException;
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationParticipantCode(String conversationId, String participantId, String addCommunicationCode) throws IOException, ApiException {
     deleteConversationParticipantCode(createDeleteConversationParticipantCodeRequest(conversationId, participantId, addCommunicationCode));
  }

  /**
   * Delete a code used to add a communication to this participant
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param addCommunicationCode addCommunicationCode (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationParticipantCodeWithHttpInfo(String conversationId, String participantId, String addCommunicationCode) throws IOException {
    return deleteConversationParticipantCode(createDeleteConversationParticipantCodeRequest(conversationId, participantId, addCommunicationCode).withHttpInfo());
  }

  private DeleteConversationParticipantCodeRequest createDeleteConversationParticipantCodeRequest(String conversationId, String participantId, String addCommunicationCode) {
    return DeleteConversationParticipantCodeRequest.builder()
            .withConversationId(conversationId)

            .withParticipantId(participantId)

            .withAddCommunicationCode(addCommunicationCode)
            .build();
  }

  /**
   * Delete a code used to add a communication to this participant
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationParticipantCode(DeleteConversationParticipantCodeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a code used to add a communication to this participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationParticipantCode(ApiRequest<Void> request) throws IOException {
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
   * Cancel the transfer
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String deleteConversationsCallParticipantConsult(String callId, String participantId) throws IOException, ApiException {
    return  deleteConversationsCallParticipantConsult(createDeleteConversationsCallParticipantConsultRequest(callId, participantId));
  }

  /**
   * Cancel the transfer
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> deleteConversationsCallParticipantConsultWithHttpInfo(String callId, String participantId) throws IOException {
    return deleteConversationsCallParticipantConsult(createDeleteConversationsCallParticipantConsultRequest(callId, participantId).withHttpInfo());
  }

  private DeleteConversationsCallParticipantConsultRequest createDeleteConversationsCallParticipantConsultRequest(String callId, String participantId) {
    return DeleteConversationsCallParticipantConsultRequest.builder()
            .withCallId(callId)

            .withParticipantId(participantId)
            .build();
  }

  /**
   * Cancel the transfer
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String deleteConversationsCallParticipantConsult(DeleteConversationsCallParticipantConsultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Cancel the transfer
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> deleteConversationsCallParticipantConsult(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
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
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete attachment from draft
   * 
   * @param emailId emailId (required)
   * @param attachmentId attachmentId (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String deleteConversationsEmailMessagesDraftAttachment(String emailId, String attachmentId) throws IOException, ApiException {
    return  deleteConversationsEmailMessagesDraftAttachment(createDeleteConversationsEmailMessagesDraftAttachmentRequest(emailId, attachmentId));
  }

  /**
   * Delete attachment from draft
   * 
   * @param emailId emailId (required)
   * @param attachmentId attachmentId (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> deleteConversationsEmailMessagesDraftAttachmentWithHttpInfo(String emailId, String attachmentId) throws IOException {
    return deleteConversationsEmailMessagesDraftAttachment(createDeleteConversationsEmailMessagesDraftAttachmentRequest(emailId, attachmentId).withHttpInfo());
  }

  private DeleteConversationsEmailMessagesDraftAttachmentRequest createDeleteConversationsEmailMessagesDraftAttachmentRequest(String emailId, String attachmentId) {
    return DeleteConversationsEmailMessagesDraftAttachmentRequest.builder()
            .withEmailId(emailId)

            .withAttachmentId(attachmentId)
            .build();
  }

  /**
   * Delete attachment from draft
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String deleteConversationsEmailMessagesDraftAttachment(DeleteConversationsEmailMessagesDraftAttachmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete attachment from draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> deleteConversationsEmailMessagesDraftAttachment(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
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
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return AnalyticsConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversation getAnalyticsConversationDetails(String conversationId) throws IOException, ApiException {
    return  getAnalyticsConversationDetails(createGetAnalyticsConversationDetailsRequest(conversationId));
  }

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return AnalyticsConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversation> getAnalyticsConversationDetailsWithHttpInfo(String conversationId) throws IOException {
    return getAnalyticsConversationDetails(createGetAnalyticsConversationDetailsRequest(conversationId).withHttpInfo());
  }

  private GetAnalyticsConversationDetailsRequest createGetAnalyticsConversationDetailsRequest(String conversationId) {
    return GetAnalyticsConversationDetailsRequest.builder()
            .withConversationId(conversationId)
            .build();
  }

  /**
   * Get a conversation by id
   * 
   * @param request The request object
   * @return AnalyticsConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversation getAnalyticsConversationDetails(GetAnalyticsConversationDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a conversation by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversation> getAnalyticsConversationDetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversation> response = (ApiResponse<AnalyticsConversation>)(ApiResponse<?>)exception;
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
      ApiResponse<AnalyticsConversation> response = (ApiResponse<AnalyticsConversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get conversation
   * 
   * @param conversationId conversation ID (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation getConversation(String conversationId) throws IOException, ApiException {
    return  getConversation(createGetConversationRequest(conversationId));
  }

  /**
   * Get conversation
   * 
   * @param conversationId conversation ID (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> getConversationWithHttpInfo(String conversationId) throws IOException {
    return getConversation(createGetConversationRequest(conversationId).withHttpInfo());
  }

  private GetConversationRequest createGetConversationRequest(String conversationId) {
    return GetConversationRequest.builder()
            .withConversationId(conversationId)
            .build();
  }

  /**
   * Get conversation
   * 
   * @param request The request object
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation getConversation(GetConversationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Conversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Conversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> getConversation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Conversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
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
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return WrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCode getConversationParticipantWrapup(String conversationId, String participantId, Boolean provisional) throws IOException, ApiException {
    return  getConversationParticipantWrapup(createGetConversationParticipantWrapupRequest(conversationId, participantId, provisional));
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return WrapupCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCode> getConversationParticipantWrapupWithHttpInfo(String conversationId, String participantId, Boolean provisional) throws IOException {
    return getConversationParticipantWrapup(createGetConversationParticipantWrapupRequest(conversationId, participantId, provisional).withHttpInfo());
  }

  private GetConversationParticipantWrapupRequest createGetConversationParticipantWrapupRequest(String conversationId, String participantId, Boolean provisional) {
    return GetConversationParticipantWrapupRequest.builder()
            .withConversationId(conversationId)

            .withParticipantId(participantId)

            .withProvisional(provisional)
            .build();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return WrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCode getConversationParticipantWrapup(GetConversationParticipantWrapupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WrapupCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WrapupCode>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCode> getConversationParticipantWrapup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WrapupCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)exception;
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
      ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationParticipantWrapupcodes(String conversationId, String participantId) throws IOException, ApiException {
    return  getConversationParticipantWrapupcodes(createGetConversationParticipantWrapupcodesRequest(conversationId, participantId));
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @return List<WrapupCode>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationParticipantWrapupcodesWithHttpInfo(String conversationId, String participantId) throws IOException {
    return getConversationParticipantWrapupcodes(createGetConversationParticipantWrapupcodesRequest(conversationId, participantId).withHttpInfo());
  }

  private GetConversationParticipantWrapupcodesRequest createGetConversationParticipantWrapupcodesRequest(String conversationId, String participantId) {
    return GetConversationParticipantWrapupcodesRequest.builder()
            .withConversationId(conversationId)

            .withParticipantId(participantId)
            .build();
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request The request object
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationParticipantWrapupcodes(GetConversationParticipantWrapupcodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<WrapupCode>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationParticipantWrapupcodes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<WrapupCode>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get conversations
   * 
   * @param communicationType Call or Chat communication filtering (optional)
   * @return ConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationEntityListing getConversations(String communicationType) throws IOException, ApiException {
    return  getConversations(createGetConversationsRequest(communicationType));
  }

  /**
   * Get conversations
   * 
   * @param communicationType Call or Chat communication filtering (optional)
   * @return ConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationEntityListing> getConversationsWithHttpInfo(String communicationType) throws IOException {
    return getConversations(createGetConversationsRequest(communicationType).withHttpInfo());
  }

  private GetConversationsRequest createGetConversationsRequest(String communicationType) {
    return GetConversationsRequest.builder()
            .withCommunicationType(communicationType)
            .build();
  }

  /**
   * Get conversations
   * 
   * @param request The request object
   * @return ConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationEntityListing getConversations(GetConversationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ConversationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ConversationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get conversations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationEntityListing> getConversations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ConversationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationEntityListing> response = (ApiResponse<ConversationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ConversationEntityListing> response = (ApiResponse<ConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get call conversation
   * 
   * @param callId callId (required)
   * @return CallConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallConversation getConversationsCall(String callId) throws IOException, ApiException {
    return  getConversationsCall(createGetConversationsCallRequest(callId));
  }

  /**
   * Get call conversation
   * 
   * @param callId callId (required)
   * @return CallConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallConversation> getConversationsCallWithHttpInfo(String callId) throws IOException {
    return getConversationsCall(createGetConversationsCallRequest(callId).withHttpInfo());
  }

  private GetConversationsCallRequest createGetConversationsCallRequest(String callId) {
    return GetConversationsCallRequest.builder()
            .withCallId(callId)
            .build();
  }

  /**
   * Get call conversation
   * 
   * @param request The request object
   * @return CallConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallConversation getConversationsCall(GetConversationsCallRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallConversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallConversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get call conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallConversation> getConversationsCall(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallConversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallConversation> response = (ApiResponse<CallConversation>)(ApiResponse<?>)exception;
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
      ApiResponse<CallConversation> response = (ApiResponse<CallConversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Wrapup getConversationsCallParticipantWrapup(String callId, String participantId, Boolean provisional) throws IOException, ApiException {
    return  getConversationsCallParticipantWrapup(createGetConversationsCallParticipantWrapupRequest(callId, participantId, provisional));
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Wrapup> getConversationsCallParticipantWrapupWithHttpInfo(String callId, String participantId, Boolean provisional) throws IOException {
    return getConversationsCallParticipantWrapup(createGetConversationsCallParticipantWrapupRequest(callId, participantId, provisional).withHttpInfo());
  }

  private GetConversationsCallParticipantWrapupRequest createGetConversationsCallParticipantWrapupRequest(String callId, String participantId, Boolean provisional) {
    return GetConversationsCallParticipantWrapupRequest.builder()
            .withCallId(callId)

            .withParticipantId(participantId)

            .withProvisional(provisional)
            .build();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return Wrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Wrapup getConversationsCallParticipantWrapup(GetConversationsCallParticipantWrapupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Wrapup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Wrapup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Wrapup> getConversationsCallParticipantWrapup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Wrapup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)exception;
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
      ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsCallParticipantWrapupcodes(String callId, String participantId) throws IOException, ApiException {
    return  getConversationsCallParticipantWrapupcodes(createGetConversationsCallParticipantWrapupcodesRequest(callId, participantId));
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsCallParticipantWrapupcodesWithHttpInfo(String callId, String participantId) throws IOException {
    return getConversationsCallParticipantWrapupcodes(createGetConversationsCallParticipantWrapupcodesRequest(callId, participantId).withHttpInfo());
  }

  private GetConversationsCallParticipantWrapupcodesRequest createGetConversationsCallParticipantWrapupcodesRequest(String callId, String participantId) {
    return GetConversationsCallParticipantWrapupcodesRequest.builder()
            .withCallId(callId)

            .withParticipantId(participantId)
            .build();
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request The request object
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsCallParticipantWrapupcodes(GetConversationsCallParticipantWrapupcodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<WrapupCode>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsCallParticipantWrapupcodes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<WrapupCode>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get callback conversation
   * 
   * @param callbackId callbackId (required)
   * @return CallbackConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallbackConversation getConversationsCallback(String callbackId) throws IOException, ApiException {
    return  getConversationsCallback(createGetConversationsCallbackRequest(callbackId));
  }

  /**
   * Get callback conversation
   * 
   * @param callbackId callbackId (required)
   * @return CallbackConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallbackConversation> getConversationsCallbackWithHttpInfo(String callbackId) throws IOException {
    return getConversationsCallback(createGetConversationsCallbackRequest(callbackId).withHttpInfo());
  }

  private GetConversationsCallbackRequest createGetConversationsCallbackRequest(String callbackId) {
    return GetConversationsCallbackRequest.builder()
            .withCallbackId(callbackId)
            .build();
  }

  /**
   * Get callback conversation
   * 
   * @param request The request object
   * @return CallbackConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallbackConversation getConversationsCallback(GetConversationsCallbackRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallbackConversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallbackConversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get callback conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallbackConversation> getConversationsCallback(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallbackConversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallbackConversation> response = (ApiResponse<CallbackConversation>)(ApiResponse<?>)exception;
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
      ApiResponse<CallbackConversation> response = (ApiResponse<CallbackConversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Wrapup getConversationsCallbackParticipantWrapup(String callbackId, String participantId, Boolean provisional) throws IOException, ApiException {
    return  getConversationsCallbackParticipantWrapup(createGetConversationsCallbackParticipantWrapupRequest(callbackId, participantId, provisional));
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Wrapup> getConversationsCallbackParticipantWrapupWithHttpInfo(String callbackId, String participantId, Boolean provisional) throws IOException {
    return getConversationsCallbackParticipantWrapup(createGetConversationsCallbackParticipantWrapupRequest(callbackId, participantId, provisional).withHttpInfo());
  }

  private GetConversationsCallbackParticipantWrapupRequest createGetConversationsCallbackParticipantWrapupRequest(String callbackId, String participantId, Boolean provisional) {
    return GetConversationsCallbackParticipantWrapupRequest.builder()
            .withCallbackId(callbackId)

            .withParticipantId(participantId)

            .withProvisional(provisional)
            .build();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return Wrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Wrapup getConversationsCallbackParticipantWrapup(GetConversationsCallbackParticipantWrapupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Wrapup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Wrapup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Wrapup> getConversationsCallbackParticipantWrapup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Wrapup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)exception;
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
      ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsCallbackParticipantWrapupcodes(String callbackId, String participantId) throws IOException, ApiException {
    return  getConversationsCallbackParticipantWrapupcodes(createGetConversationsCallbackParticipantWrapupcodesRequest(callbackId, participantId));
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsCallbackParticipantWrapupcodesWithHttpInfo(String callbackId, String participantId) throws IOException {
    return getConversationsCallbackParticipantWrapupcodes(createGetConversationsCallbackParticipantWrapupcodesRequest(callbackId, participantId).withHttpInfo());
  }

  private GetConversationsCallbackParticipantWrapupcodesRequest createGetConversationsCallbackParticipantWrapupcodesRequest(String callbackId, String participantId) {
    return GetConversationsCallbackParticipantWrapupcodesRequest.builder()
            .withCallbackId(callbackId)

            .withParticipantId(participantId)
            .build();
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request The request object
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsCallbackParticipantWrapupcodes(GetConversationsCallbackParticipantWrapupcodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<WrapupCode>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsCallbackParticipantWrapupcodes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<WrapupCode>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get callback conversations
   * 
   * @return CallbackConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallbackConversationEntityListing getConversationsCallbacks() throws IOException, ApiException {
    return  getConversationsCallbacks(createGetConversationsCallbacksRequest());
  }

  /**
   * Get callback conversations
   * 
   * @return CallbackConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallbackConversationEntityListing> getConversationsCallbacksWithHttpInfo() throws IOException {
    return getConversationsCallbacks(createGetConversationsCallbacksRequest().withHttpInfo());
  }

  private GetConversationsCallbacksRequest createGetConversationsCallbacksRequest() {
    return GetConversationsCallbacksRequest.builder()            .build();
  }

  /**
   * Get callback conversations
   * 
   * @param request The request object
   * @return CallbackConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallbackConversationEntityListing getConversationsCallbacks(GetConversationsCallbacksRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallbackConversationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallbackConversationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get callback conversations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallbackConversationEntityListing> getConversationsCallbacks(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallbackConversationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallbackConversationEntityListing> response = (ApiResponse<CallbackConversationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CallbackConversationEntityListing> response = (ApiResponse<CallbackConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get recent conversations
   * 
   * @return CallConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallConversationEntityListing getConversationsCalls() throws IOException, ApiException {
    return  getConversationsCalls(createGetConversationsCallsRequest());
  }

  /**
   * Get recent conversations
   * 
   * @return CallConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallConversationEntityListing> getConversationsCallsWithHttpInfo() throws IOException {
    return getConversationsCalls(createGetConversationsCallsRequest().withHttpInfo());
  }

  private GetConversationsCallsRequest createGetConversationsCallsRequest() {
    return GetConversationsCallsRequest.builder()            .build();
  }

  /**
   * Get recent conversations
   * 
   * @param request The request object
   * @return CallConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallConversationEntityListing getConversationsCalls(GetConversationsCallsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallConversationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallConversationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get recent conversations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallConversationEntityListing> getConversationsCalls(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallConversationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallConversationEntityListing> response = (ApiResponse<CallConversationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CallConversationEntityListing> response = (ApiResponse<CallConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get call history
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param interval Interval string; format is ISO-8601. Separate start and end times with forward slash &#39;/&#39; (optional)
   * @return CallConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallConversationEntityListing getConversationsCallsHistory(Integer pageSize, Integer pageNumber, String interval) throws IOException, ApiException {
    return  getConversationsCallsHistory(createGetConversationsCallsHistoryRequest(pageSize, pageNumber, interval));
  }

  /**
   * Get call history
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param interval Interval string; format is ISO-8601. Separate start and end times with forward slash &#39;/&#39; (optional)
   * @return CallConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallConversationEntityListing> getConversationsCallsHistoryWithHttpInfo(Integer pageSize, Integer pageNumber, String interval) throws IOException {
    return getConversationsCallsHistory(createGetConversationsCallsHistoryRequest(pageSize, pageNumber, interval).withHttpInfo());
  }

  private GetConversationsCallsHistoryRequest createGetConversationsCallsHistoryRequest(Integer pageSize, Integer pageNumber, String interval) {
    return GetConversationsCallsHistoryRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withInterval(interval)
            .build();
  }

  /**
   * Get call history
   * 
   * @param request The request object
   * @return CallConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallConversationEntityListing getConversationsCallsHistory(GetConversationsCallsHistoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallConversationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallConversationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get call history
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallConversationEntityListing> getConversationsCallsHistory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallConversationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallConversationEntityListing> response = (ApiResponse<CallConversationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CallConversationEntityListing> response = (ApiResponse<CallConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @return MaxParticipants
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MaxParticipants getConversationsCallsMaximumconferenceparties() throws IOException, ApiException {
    return  getConversationsCallsMaximumconferenceparties(createGetConversationsCallsMaximumconferencepartiesRequest());
  }

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @return MaxParticipants
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MaxParticipants> getConversationsCallsMaximumconferencepartiesWithHttpInfo() throws IOException {
    return getConversationsCallsMaximumconferenceparties(createGetConversationsCallsMaximumconferencepartiesRequest().withHttpInfo());
  }

  private GetConversationsCallsMaximumconferencepartiesRequest createGetConversationsCallsMaximumconferencepartiesRequest() {
    return GetConversationsCallsMaximumconferencepartiesRequest.builder()            .build();
  }

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @param request The request object
   * @return MaxParticipants
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MaxParticipants getConversationsCallsMaximumconferenceparties(GetConversationsCallsMaximumconferencepartiesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MaxParticipants> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MaxParticipants>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MaxParticipants> getConversationsCallsMaximumconferenceparties(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MaxParticipants>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MaxParticipants> response = (ApiResponse<MaxParticipants>)(ApiResponse<?>)exception;
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
      ApiResponse<MaxParticipants> response = (ApiResponse<MaxParticipants>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get chat conversation
   * 
   * @param chatId chatId (required)
   * @return ChatConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatConversation getConversationsChat(String chatId) throws IOException, ApiException {
    return  getConversationsChat(createGetConversationsChatRequest(chatId));
  }

  /**
   * Get chat conversation
   * 
   * @param chatId chatId (required)
   * @return ChatConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatConversation> getConversationsChatWithHttpInfo(String chatId) throws IOException {
    return getConversationsChat(createGetConversationsChatRequest(chatId).withHttpInfo());
  }

  private GetConversationsChatRequest createGetConversationsChatRequest(String chatId) {
    return GetConversationsChatRequest.builder()
            .withChatId(chatId)
            .build();
  }

  /**
   * Get chat conversation
   * 
   * @param request The request object
   * @return ChatConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatConversation getConversationsChat(GetConversationsChatRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatConversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatConversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get chat conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatConversation> getConversationsChat(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatConversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatConversation> response = (ApiResponse<ChatConversation>)(ApiResponse<?>)exception;
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
      ApiResponse<ChatConversation> response = (ApiResponse<ChatConversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Wrapup getConversationsChatParticipantWrapup(String chatId, String participantId, Boolean provisional) throws IOException, ApiException {
    return  getConversationsChatParticipantWrapup(createGetConversationsChatParticipantWrapupRequest(chatId, participantId, provisional));
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Wrapup> getConversationsChatParticipantWrapupWithHttpInfo(String chatId, String participantId, Boolean provisional) throws IOException {
    return getConversationsChatParticipantWrapup(createGetConversationsChatParticipantWrapupRequest(chatId, participantId, provisional).withHttpInfo());
  }

  private GetConversationsChatParticipantWrapupRequest createGetConversationsChatParticipantWrapupRequest(String chatId, String participantId, Boolean provisional) {
    return GetConversationsChatParticipantWrapupRequest.builder()
            .withChatId(chatId)

            .withParticipantId(participantId)

            .withProvisional(provisional)
            .build();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return Wrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Wrapup getConversationsChatParticipantWrapup(GetConversationsChatParticipantWrapupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Wrapup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Wrapup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Wrapup> getConversationsChatParticipantWrapup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Wrapup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)exception;
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
      ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsChatParticipantWrapupcodes(String chatId, String participantId) throws IOException, ApiException {
    return  getConversationsChatParticipantWrapupcodes(createGetConversationsChatParticipantWrapupcodesRequest(chatId, participantId));
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsChatParticipantWrapupcodesWithHttpInfo(String chatId, String participantId) throws IOException {
    return getConversationsChatParticipantWrapupcodes(createGetConversationsChatParticipantWrapupcodesRequest(chatId, participantId).withHttpInfo());
  }

  private GetConversationsChatParticipantWrapupcodesRequest createGetConversationsChatParticipantWrapupcodesRequest(String chatId, String participantId) {
    return GetConversationsChatParticipantWrapupcodesRequest.builder()
            .withChatId(chatId)

            .withParticipantId(participantId)
            .build();
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request The request object
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsChatParticipantWrapupcodes(GetConversationsChatParticipantWrapupcodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<WrapupCode>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsChatParticipantWrapupcodes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<WrapupCode>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get recent chat conversations
   * 
   * @return ChatConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatConversationEntityListing getConversationsChats() throws IOException, ApiException {
    return  getConversationsChats(createGetConversationsChatsRequest());
  }

  /**
   * Get recent chat conversations
   * 
   * @return ChatConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatConversationEntityListing> getConversationsChatsWithHttpInfo() throws IOException {
    return getConversationsChats(createGetConversationsChatsRequest().withHttpInfo());
  }

  private GetConversationsChatsRequest createGetConversationsChatsRequest() {
    return GetConversationsChatsRequest.builder()            .build();
  }

  /**
   * Get recent chat conversations
   * 
   * @param request The request object
   * @return ChatConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatConversationEntityListing getConversationsChats(GetConversationsChatsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatConversationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatConversationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get recent chat conversations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatConversationEntityListing> getConversationsChats(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatConversationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatConversationEntityListing> response = (ApiResponse<ChatConversationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ChatConversationEntityListing> response = (ApiResponse<ChatConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get cobrowse conversation
   * 
   * @param cobrowseId cobrowseId (required)
   * @return CobrowseConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CobrowseConversation getConversationsCobrowsesession(String cobrowseId) throws IOException, ApiException {
    return  getConversationsCobrowsesession(createGetConversationsCobrowsesessionRequest(cobrowseId));
  }

  /**
   * Get cobrowse conversation
   * 
   * @param cobrowseId cobrowseId (required)
   * @return CobrowseConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CobrowseConversation> getConversationsCobrowsesessionWithHttpInfo(String cobrowseId) throws IOException {
    return getConversationsCobrowsesession(createGetConversationsCobrowsesessionRequest(cobrowseId).withHttpInfo());
  }

  private GetConversationsCobrowsesessionRequest createGetConversationsCobrowsesessionRequest(String cobrowseId) {
    return GetConversationsCobrowsesessionRequest.builder()
            .withCobrowseId(cobrowseId)
            .build();
  }

  /**
   * Get cobrowse conversation
   * 
   * @param request The request object
   * @return CobrowseConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CobrowseConversation getConversationsCobrowsesession(GetConversationsCobrowsesessionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CobrowseConversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CobrowseConversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get cobrowse conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CobrowseConversation> getConversationsCobrowsesession(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CobrowseConversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CobrowseConversation> response = (ApiResponse<CobrowseConversation>)(ApiResponse<?>)exception;
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
      ApiResponse<CobrowseConversation> response = (ApiResponse<CobrowseConversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Wrapup getConversationsCobrowsesessionParticipantWrapup(String cobrowseId, String participantId, Boolean provisional) throws IOException, ApiException {
    return  getConversationsCobrowsesessionParticipantWrapup(createGetConversationsCobrowsesessionParticipantWrapupRequest(cobrowseId, participantId, provisional));
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Wrapup> getConversationsCobrowsesessionParticipantWrapupWithHttpInfo(String cobrowseId, String participantId, Boolean provisional) throws IOException {
    return getConversationsCobrowsesessionParticipantWrapup(createGetConversationsCobrowsesessionParticipantWrapupRequest(cobrowseId, participantId, provisional).withHttpInfo());
  }

  private GetConversationsCobrowsesessionParticipantWrapupRequest createGetConversationsCobrowsesessionParticipantWrapupRequest(String cobrowseId, String participantId, Boolean provisional) {
    return GetConversationsCobrowsesessionParticipantWrapupRequest.builder()
            .withCobrowseId(cobrowseId)

            .withParticipantId(participantId)

            .withProvisional(provisional)
            .build();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return Wrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Wrapup getConversationsCobrowsesessionParticipantWrapup(GetConversationsCobrowsesessionParticipantWrapupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Wrapup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Wrapup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Wrapup> getConversationsCobrowsesessionParticipantWrapup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Wrapup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)exception;
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
      ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsCobrowsesessionParticipantWrapupcodes(String cobrowseId, String participantId) throws IOException, ApiException {
    return  getConversationsCobrowsesessionParticipantWrapupcodes(createGetConversationsCobrowsesessionParticipantWrapupcodesRequest(cobrowseId, participantId));
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsCobrowsesessionParticipantWrapupcodesWithHttpInfo(String cobrowseId, String participantId) throws IOException {
    return getConversationsCobrowsesessionParticipantWrapupcodes(createGetConversationsCobrowsesessionParticipantWrapupcodesRequest(cobrowseId, participantId).withHttpInfo());
  }

  private GetConversationsCobrowsesessionParticipantWrapupcodesRequest createGetConversationsCobrowsesessionParticipantWrapupcodesRequest(String cobrowseId, String participantId) {
    return GetConversationsCobrowsesessionParticipantWrapupcodesRequest.builder()
            .withCobrowseId(cobrowseId)

            .withParticipantId(participantId)
            .build();
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request The request object
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsCobrowsesessionParticipantWrapupcodes(GetConversationsCobrowsesessionParticipantWrapupcodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<WrapupCode>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsCobrowsesessionParticipantWrapupcodes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<WrapupCode>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get recent cobrowse conversations
   * 
   * @return CobrowseConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CobrowseConversationEntityListing getConversationsCobrowsesessions() throws IOException, ApiException {
    return  getConversationsCobrowsesessions(createGetConversationsCobrowsesessionsRequest());
  }

  /**
   * Get recent cobrowse conversations
   * 
   * @return CobrowseConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CobrowseConversationEntityListing> getConversationsCobrowsesessionsWithHttpInfo() throws IOException {
    return getConversationsCobrowsesessions(createGetConversationsCobrowsesessionsRequest().withHttpInfo());
  }

  private GetConversationsCobrowsesessionsRequest createGetConversationsCobrowsesessionsRequest() {
    return GetConversationsCobrowsesessionsRequest.builder()            .build();
  }

  /**
   * Get recent cobrowse conversations
   * 
   * @param request The request object
   * @return CobrowseConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CobrowseConversationEntityListing getConversationsCobrowsesessions(GetConversationsCobrowsesessionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CobrowseConversationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CobrowseConversationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get recent cobrowse conversations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CobrowseConversationEntityListing> getConversationsCobrowsesessions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CobrowseConversationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CobrowseConversationEntityListing> response = (ApiResponse<CobrowseConversationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CobrowseConversationEntityListing> response = (ApiResponse<CobrowseConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get email conversation
   * 
   * @param emailId emailId (required)
   * @return EmailConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailConversation getConversationsEmail(String emailId) throws IOException, ApiException {
    return  getConversationsEmail(createGetConversationsEmailRequest(emailId));
  }

  /**
   * Get email conversation
   * 
   * @param emailId emailId (required)
   * @return EmailConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailConversation> getConversationsEmailWithHttpInfo(String emailId) throws IOException {
    return getConversationsEmail(createGetConversationsEmailRequest(emailId).withHttpInfo());
  }

  private GetConversationsEmailRequest createGetConversationsEmailRequest(String emailId) {
    return GetConversationsEmailRequest.builder()
            .withEmailId(emailId)
            .build();
  }

  /**
   * Get email conversation
   * 
   * @param request The request object
   * @return EmailConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailConversation getConversationsEmail(GetConversationsEmailRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailConversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailConversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get email conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailConversation> getConversationsEmail(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailConversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailConversation> response = (ApiResponse<EmailConversation>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailConversation> response = (ApiResponse<EmailConversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get conversation message
   * 
   * @param emailId emailId (required)
   * @param messageId messageId (required)
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage getConversationsEmailMessage(String emailId, String messageId) throws IOException, ApiException {
    return  getConversationsEmailMessage(createGetConversationsEmailMessageRequest(emailId, messageId));
  }

  /**
   * Get conversation message
   * 
   * @param emailId emailId (required)
   * @param messageId messageId (required)
   * @return EmailMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> getConversationsEmailMessageWithHttpInfo(String emailId, String messageId) throws IOException {
    return getConversationsEmailMessage(createGetConversationsEmailMessageRequest(emailId, messageId).withHttpInfo());
  }

  private GetConversationsEmailMessageRequest createGetConversationsEmailMessageRequest(String emailId, String messageId) {
    return GetConversationsEmailMessageRequest.builder()
            .withEmailId(emailId)

            .withMessageId(messageId)
            .build();
  }

  /**
   * Get conversation message
   * 
   * @param request The request object
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage getConversationsEmailMessage(GetConversationsEmailMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailMessage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailMessage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get conversation message
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> getConversationsEmailMessage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailMessage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get conversation messages
   * 
   * @param emailId emailId (required)
   * @return EmailMessageListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessageListing getConversationsEmailMessages(String emailId) throws IOException, ApiException {
    return  getConversationsEmailMessages(createGetConversationsEmailMessagesRequest(emailId));
  }

  /**
   * Get conversation messages
   * 
   * @param emailId emailId (required)
   * @return EmailMessageListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessageListing> getConversationsEmailMessagesWithHttpInfo(String emailId) throws IOException {
    return getConversationsEmailMessages(createGetConversationsEmailMessagesRequest(emailId).withHttpInfo());
  }

  private GetConversationsEmailMessagesRequest createGetConversationsEmailMessagesRequest(String emailId) {
    return GetConversationsEmailMessagesRequest.builder()
            .withEmailId(emailId)
            .build();
  }

  /**
   * Get conversation messages
   * 
   * @param request The request object
   * @return EmailMessageListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessageListing getConversationsEmailMessages(GetConversationsEmailMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailMessageListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailMessageListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get conversation messages
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessageListing> getConversationsEmailMessages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailMessageListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailMessageListing> response = (ApiResponse<EmailMessageListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailMessageListing> response = (ApiResponse<EmailMessageListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get conversation draft reply
   * 
   * @param emailId emailId (required)
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage getConversationsEmailMessagesDraft(String emailId) throws IOException, ApiException {
    return  getConversationsEmailMessagesDraft(createGetConversationsEmailMessagesDraftRequest(emailId));
  }

  /**
   * Get conversation draft reply
   * 
   * @param emailId emailId (required)
   * @return EmailMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> getConversationsEmailMessagesDraftWithHttpInfo(String emailId) throws IOException {
    return getConversationsEmailMessagesDraft(createGetConversationsEmailMessagesDraftRequest(emailId).withHttpInfo());
  }

  private GetConversationsEmailMessagesDraftRequest createGetConversationsEmailMessagesDraftRequest(String emailId) {
    return GetConversationsEmailMessagesDraftRequest.builder()
            .withEmailId(emailId)
            .build();
  }

  /**
   * Get conversation draft reply
   * 
   * @param request The request object
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage getConversationsEmailMessagesDraft(GetConversationsEmailMessagesDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailMessage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailMessage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get conversation draft reply
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> getConversationsEmailMessagesDraft(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailMessage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Wrapup getConversationsEmailParticipantWrapup(String emailId, String participantId, Boolean provisional) throws IOException, ApiException {
    return  getConversationsEmailParticipantWrapup(createGetConversationsEmailParticipantWrapupRequest(emailId, participantId, provisional));
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Wrapup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Wrapup> getConversationsEmailParticipantWrapupWithHttpInfo(String emailId, String participantId, Boolean provisional) throws IOException {
    return getConversationsEmailParticipantWrapup(createGetConversationsEmailParticipantWrapupRequest(emailId, participantId, provisional).withHttpInfo());
  }

  private GetConversationsEmailParticipantWrapupRequest createGetConversationsEmailParticipantWrapupRequest(String emailId, String participantId, Boolean provisional) {
    return GetConversationsEmailParticipantWrapupRequest.builder()
            .withEmailId(emailId)

            .withParticipantId(participantId)

            .withProvisional(provisional)
            .build();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return Wrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Wrapup getConversationsEmailParticipantWrapup(GetConversationsEmailParticipantWrapupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Wrapup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Wrapup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Wrapup> getConversationsEmailParticipantWrapup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Wrapup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)exception;
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
      ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsEmailParticipantWrapupcodes(String emailId, String participantId) throws IOException, ApiException {
    return  getConversationsEmailParticipantWrapupcodes(createGetConversationsEmailParticipantWrapupcodesRequest(emailId, participantId));
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsEmailParticipantWrapupcodesWithHttpInfo(String emailId, String participantId) throws IOException {
    return getConversationsEmailParticipantWrapupcodes(createGetConversationsEmailParticipantWrapupcodesRequest(emailId, participantId).withHttpInfo());
  }

  private GetConversationsEmailParticipantWrapupcodesRequest createGetConversationsEmailParticipantWrapupcodesRequest(String emailId, String participantId) {
    return GetConversationsEmailParticipantWrapupcodesRequest.builder()
            .withEmailId(emailId)

            .withParticipantId(participantId)
            .build();
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request The request object
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsEmailParticipantWrapupcodes(GetConversationsEmailParticipantWrapupcodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<WrapupCode>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsEmailParticipantWrapupcodes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<WrapupCode>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get recent email conversations
   * 
   * @return EmailConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailConversationEntityListing getConversationsEmails() throws IOException, ApiException {
    return  getConversationsEmails(createGetConversationsEmailsRequest());
  }

  /**
   * Get recent email conversations
   * 
   * @return EmailConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailConversationEntityListing> getConversationsEmailsWithHttpInfo() throws IOException {
    return getConversationsEmails(createGetConversationsEmailsRequest().withHttpInfo());
  }

  private GetConversationsEmailsRequest createGetConversationsEmailsRequest() {
    return GetConversationsEmailsRequest.builder()            .build();
  }

  /**
   * Get recent email conversations
   * 
   * @param request The request object
   * @return EmailConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailConversationEntityListing getConversationsEmails(GetConversationsEmailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailConversationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailConversationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get recent email conversations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailConversationEntityListing> getConversationsEmails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailConversationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailConversationEntityListing> response = (ApiResponse<EmailConversationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailConversationEntityListing> response = (ApiResponse<EmailConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a participant.
   * Update conversation participant.
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Update request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationParticipant(String conversationId, String participantId, MediaParticipantRequest body) throws IOException, ApiException {
     patchConversationParticipant(createPatchConversationParticipantRequest(conversationId, participantId, body));
  }

  /**
   * Update a participant.
   * Update conversation participant.
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Update request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationParticipantWithHttpInfo(String conversationId, String participantId, MediaParticipantRequest body) throws IOException {
    return patchConversationParticipant(createPatchConversationParticipantRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationParticipantRequest createPatchConversationParticipantRequest(String conversationId, String participantId, MediaParticipantRequest body) {
    return PatchConversationParticipantRequest.builder()
            .withConversationId(conversationId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Update a participant.
   * Update conversation participant.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationParticipant(PatchConversationParticipantRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update a participant.
   * Update conversation participant.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationParticipant(ApiRequest<MediaParticipantRequest> request) throws IOException {
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
   * Update the attributes on a conversation participant.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Participant attributes (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationParticipantAttributes(String conversationId, String participantId, ParticipantAttributes body) throws IOException, ApiException {
     patchConversationParticipantAttributes(createPatchConversationParticipantAttributesRequest(conversationId, participantId, body));
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Participant attributes (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationParticipantAttributesWithHttpInfo(String conversationId, String participantId, ParticipantAttributes body) throws IOException {
    return patchConversationParticipantAttributes(createPatchConversationParticipantAttributesRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationParticipantAttributesRequest createPatchConversationParticipantAttributesRequest(String conversationId, String participantId, ParticipantAttributes body) {
    return PatchConversationParticipantAttributesRequest.builder()
            .withConversationId(conversationId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationParticipantAttributes(PatchConversationParticipantAttributesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationParticipantAttributes(ApiRequest<ParticipantAttributes> request) throws IOException {
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
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsCall(String callId, Conversation body) throws IOException, ApiException {
    return  patchConversationsCall(createPatchConversationsCallRequest(callId, body));
  }

  /**
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsCallWithHttpInfo(String callId, Conversation body) throws IOException {
    return patchConversationsCall(createPatchConversationsCallRequest(callId, body).withHttpInfo());
  }

  private PatchConversationsCallRequest createPatchConversationsCallRequest(String callId, Conversation body) {
    return PatchConversationsCallRequest.builder()
            .withCallId(callId)

            .withBody(body)
            .build();
  }

  /**
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @param request The request object
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsCall(PatchConversationsCallRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Conversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Conversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsCall(ApiRequest<Conversation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Conversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
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
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update conversation participant
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Participant request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCallParticipant(String callId, String participantId, MediaParticipantRequest body) throws IOException, ApiException {
     patchConversationsCallParticipant(createPatchConversationsCallParticipantRequest(callId, participantId, body));
  }

  /**
   * Update conversation participant
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Participant request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCallParticipantWithHttpInfo(String callId, String participantId, MediaParticipantRequest body) throws IOException {
    return patchConversationsCallParticipant(createPatchConversationsCallParticipantRequest(callId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCallParticipantRequest createPatchConversationsCallParticipantRequest(String callId, String participantId, MediaParticipantRequest body) {
    return PatchConversationsCallParticipantRequest.builder()
            .withCallId(callId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Update conversation participant
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCallParticipant(PatchConversationsCallParticipantRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCallParticipant(ApiRequest<MediaParticipantRequest> request) throws IOException {
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
   * Update the attributes on a conversation participant.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCallParticipantAttributes(String callId, String participantId, ParticipantAttributes body) throws IOException, ApiException {
     patchConversationsCallParticipantAttributes(createPatchConversationsCallParticipantAttributesRequest(callId, participantId, body));
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCallParticipantAttributesWithHttpInfo(String callId, String participantId, ParticipantAttributes body) throws IOException {
    return patchConversationsCallParticipantAttributes(createPatchConversationsCallParticipantAttributesRequest(callId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCallParticipantAttributesRequest createPatchConversationsCallParticipantAttributesRequest(String callId, String participantId, ParticipantAttributes body) {
    return PatchConversationsCallParticipantAttributesRequest.builder()
            .withCallId(callId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCallParticipantAttributes(PatchConversationsCallParticipantAttributesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCallParticipantAttributes(ApiRequest<ParticipantAttributes> request) throws IOException {
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
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsCallParticipantCommunication(String callId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException, ApiException {
    return  patchConversationsCallParticipantCommunication(createPatchConversationsCallParticipantCommunicationRequest(callId, participantId, communicationId, body));
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsCallParticipantCommunicationWithHttpInfo(String callId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException {
    return patchConversationsCallParticipantCommunication(createPatchConversationsCallParticipantCommunicationRequest(callId, participantId, communicationId, body).withHttpInfo());
  }

  private PatchConversationsCallParticipantCommunicationRequest createPatchConversationsCallParticipantCommunicationRequest(String callId, String participantId, String communicationId, MediaParticipantRequest body) {
    return PatchConversationsCallParticipantCommunicationRequest.builder()
            .withCallId(callId)

            .withParticipantId(participantId)

            .withCommunicationId(communicationId)

            .withBody(body)
            .build();
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsCallParticipantCommunication(PatchConversationsCallParticipantCommunicationRequest request) throws IOException, ApiException {
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
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsCallParticipantCommunication(ApiRequest<MediaParticipantRequest> request) throws IOException {
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
   * Change who can speak
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body new speak to (required)
   * @return ConsultTransferResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConsultTransferResponse patchConversationsCallParticipantConsult(String callId, String participantId, ConsultTransferUpdate body) throws IOException, ApiException {
    return  patchConversationsCallParticipantConsult(createPatchConversationsCallParticipantConsultRequest(callId, participantId, body));
  }

  /**
   * Change who can speak
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body new speak to (required)
   * @return ConsultTransferResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConsultTransferResponse> patchConversationsCallParticipantConsultWithHttpInfo(String callId, String participantId, ConsultTransferUpdate body) throws IOException {
    return patchConversationsCallParticipantConsult(createPatchConversationsCallParticipantConsultRequest(callId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCallParticipantConsultRequest createPatchConversationsCallParticipantConsultRequest(String callId, String participantId, ConsultTransferUpdate body) {
    return PatchConversationsCallParticipantConsultRequest.builder()
            .withCallId(callId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Change who can speak
   * 
   * @param request The request object
   * @return ConsultTransferResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConsultTransferResponse patchConversationsCallParticipantConsult(PatchConversationsCallParticipantConsultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ConsultTransferResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ConsultTransferResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Change who can speak
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConsultTransferResponse> patchConversationsCallParticipantConsult(ApiRequest<ConsultTransferUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ConsultTransferResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ConsultTransferResponse> response = (ApiResponse<ConsultTransferResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ConsultTransferResponse> response = (ApiResponse<ConsultTransferResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param callbackId callbackId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsCallback(String callbackId, Conversation body) throws IOException, ApiException {
    return  patchConversationsCallback(createPatchConversationsCallbackRequest(callbackId, body));
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param callbackId callbackId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsCallbackWithHttpInfo(String callbackId, Conversation body) throws IOException {
    return patchConversationsCallback(createPatchConversationsCallbackRequest(callbackId, body).withHttpInfo());
  }

  private PatchConversationsCallbackRequest createPatchConversationsCallbackRequest(String callbackId, Conversation body) {
    return PatchConversationsCallbackRequest.builder()
            .withCallbackId(callbackId)

            .withBody(body)
            .build();
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request The request object
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsCallback(PatchConversationsCallbackRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Conversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Conversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsCallback(ApiRequest<Conversation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Conversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
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
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update conversation participant
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Participant (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCallbackParticipant(String callbackId, String participantId, MediaParticipantRequest body) throws IOException, ApiException {
     patchConversationsCallbackParticipant(createPatchConversationsCallbackParticipantRequest(callbackId, participantId, body));
  }

  /**
   * Update conversation participant
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Participant (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCallbackParticipantWithHttpInfo(String callbackId, String participantId, MediaParticipantRequest body) throws IOException {
    return patchConversationsCallbackParticipant(createPatchConversationsCallbackParticipantRequest(callbackId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCallbackParticipantRequest createPatchConversationsCallbackParticipantRequest(String callbackId, String participantId, MediaParticipantRequest body) {
    return PatchConversationsCallbackParticipantRequest.builder()
            .withCallbackId(callbackId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Update conversation participant
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCallbackParticipant(PatchConversationsCallbackParticipantRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCallbackParticipant(ApiRequest<MediaParticipantRequest> request) throws IOException {
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
   * Update the attributes on a conversation participant.
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Attributes (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCallbackParticipantAttributes(String callbackId, String participantId, ParticipantAttributes body) throws IOException, ApiException {
     patchConversationsCallbackParticipantAttributes(createPatchConversationsCallbackParticipantAttributesRequest(callbackId, participantId, body));
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Attributes (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCallbackParticipantAttributesWithHttpInfo(String callbackId, String participantId, ParticipantAttributes body) throws IOException {
    return patchConversationsCallbackParticipantAttributes(createPatchConversationsCallbackParticipantAttributesRequest(callbackId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCallbackParticipantAttributesRequest createPatchConversationsCallbackParticipantAttributesRequest(String callbackId, String participantId, ParticipantAttributes body) {
    return PatchConversationsCallbackParticipantAttributesRequest.builder()
            .withCallbackId(callbackId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCallbackParticipantAttributes(PatchConversationsCallbackParticipantAttributesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCallbackParticipantAttributes(ApiRequest<ParticipantAttributes> request) throws IOException {
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
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsCallbackParticipantCommunication(String callbackId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException, ApiException {
    return  patchConversationsCallbackParticipantCommunication(createPatchConversationsCallbackParticipantCommunicationRequest(callbackId, participantId, communicationId, body));
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsCallbackParticipantCommunicationWithHttpInfo(String callbackId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException {
    return patchConversationsCallbackParticipantCommunication(createPatchConversationsCallbackParticipantCommunicationRequest(callbackId, participantId, communicationId, body).withHttpInfo());
  }

  private PatchConversationsCallbackParticipantCommunicationRequest createPatchConversationsCallbackParticipantCommunicationRequest(String callbackId, String participantId, String communicationId, MediaParticipantRequest body) {
    return PatchConversationsCallbackParticipantCommunicationRequest.builder()
            .withCallbackId(callbackId)

            .withParticipantId(participantId)

            .withCommunicationId(communicationId)

            .withBody(body)
            .build();
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsCallbackParticipantCommunication(PatchConversationsCallbackParticipantCommunicationRequest request) throws IOException, ApiException {
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
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsCallbackParticipantCommunication(ApiRequest<MediaParticipantRequest> request) throws IOException {
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
   * Update a conversation by disconnecting all of the participants
   * 
   * @param chatId chatId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsChat(String chatId, Conversation body) throws IOException, ApiException {
    return  patchConversationsChat(createPatchConversationsChatRequest(chatId, body));
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param chatId chatId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsChatWithHttpInfo(String chatId, Conversation body) throws IOException {
    return patchConversationsChat(createPatchConversationsChatRequest(chatId, body).withHttpInfo());
  }

  private PatchConversationsChatRequest createPatchConversationsChatRequest(String chatId, Conversation body) {
    return PatchConversationsChatRequest.builder()
            .withChatId(chatId)

            .withBody(body)
            .build();
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request The request object
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsChat(PatchConversationsChatRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Conversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Conversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsChat(ApiRequest<Conversation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Conversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
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
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update conversation participant
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsChatParticipant(String chatId, String participantId, MediaParticipantRequest body) throws IOException, ApiException {
     patchConversationsChatParticipant(createPatchConversationsChatParticipantRequest(chatId, participantId, body));
  }

  /**
   * Update conversation participant
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsChatParticipantWithHttpInfo(String chatId, String participantId, MediaParticipantRequest body) throws IOException {
    return patchConversationsChatParticipant(createPatchConversationsChatParticipantRequest(chatId, participantId, body).withHttpInfo());
  }

  private PatchConversationsChatParticipantRequest createPatchConversationsChatParticipantRequest(String chatId, String participantId, MediaParticipantRequest body) {
    return PatchConversationsChatParticipantRequest.builder()
            .withChatId(chatId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Update conversation participant
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsChatParticipant(PatchConversationsChatParticipantRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsChatParticipant(ApiRequest<MediaParticipantRequest> request) throws IOException {
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
   * Update the attributes on a conversation participant.
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsChatParticipantAttributes(String chatId, String participantId, ParticipantAttributes body) throws IOException, ApiException {
     patchConversationsChatParticipantAttributes(createPatchConversationsChatParticipantAttributesRequest(chatId, participantId, body));
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsChatParticipantAttributesWithHttpInfo(String chatId, String participantId, ParticipantAttributes body) throws IOException {
    return patchConversationsChatParticipantAttributes(createPatchConversationsChatParticipantAttributesRequest(chatId, participantId, body).withHttpInfo());
  }

  private PatchConversationsChatParticipantAttributesRequest createPatchConversationsChatParticipantAttributesRequest(String chatId, String participantId, ParticipantAttributes body) {
    return PatchConversationsChatParticipantAttributesRequest.builder()
            .withChatId(chatId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsChatParticipantAttributes(PatchConversationsChatParticipantAttributesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsChatParticipantAttributes(ApiRequest<ParticipantAttributes> request) throws IOException {
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
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsChatParticipantCommunication(String chatId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException, ApiException {
    return  patchConversationsChatParticipantCommunication(createPatchConversationsChatParticipantCommunicationRequest(chatId, participantId, communicationId, body));
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsChatParticipantCommunicationWithHttpInfo(String chatId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException {
    return patchConversationsChatParticipantCommunication(createPatchConversationsChatParticipantCommunicationRequest(chatId, participantId, communicationId, body).withHttpInfo());
  }

  private PatchConversationsChatParticipantCommunicationRequest createPatchConversationsChatParticipantCommunicationRequest(String chatId, String participantId, String communicationId, MediaParticipantRequest body) {
    return PatchConversationsChatParticipantCommunicationRequest.builder()
            .withChatId(chatId)

            .withParticipantId(participantId)

            .withCommunicationId(communicationId)

            .withBody(body)
            .build();
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsChatParticipantCommunication(PatchConversationsChatParticipantCommunicationRequest request) throws IOException, ApiException {
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
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsChatParticipantCommunication(ApiRequest<MediaParticipantRequest> request) throws IOException {
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
   * Update a conversation by disconnecting all of the participants
   * 
   * @param cobrowseId cobrowseId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsCobrowsesession(String cobrowseId, Conversation body) throws IOException, ApiException {
    return  patchConversationsCobrowsesession(createPatchConversationsCobrowsesessionRequest(cobrowseId, body));
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param cobrowseId cobrowseId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsCobrowsesessionWithHttpInfo(String cobrowseId, Conversation body) throws IOException {
    return patchConversationsCobrowsesession(createPatchConversationsCobrowsesessionRequest(cobrowseId, body).withHttpInfo());
  }

  private PatchConversationsCobrowsesessionRequest createPatchConversationsCobrowsesessionRequest(String cobrowseId, Conversation body) {
    return PatchConversationsCobrowsesessionRequest.builder()
            .withCobrowseId(cobrowseId)

            .withBody(body)
            .build();
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request The request object
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsCobrowsesession(PatchConversationsCobrowsesessionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Conversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Conversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsCobrowsesession(ApiRequest<Conversation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Conversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
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
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update conversation participant
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCobrowsesessionParticipant(String cobrowseId, String participantId, MediaParticipantRequest body) throws IOException, ApiException {
     patchConversationsCobrowsesessionParticipant(createPatchConversationsCobrowsesessionParticipantRequest(cobrowseId, participantId, body));
  }

  /**
   * Update conversation participant
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCobrowsesessionParticipantWithHttpInfo(String cobrowseId, String participantId, MediaParticipantRequest body) throws IOException {
    return patchConversationsCobrowsesessionParticipant(createPatchConversationsCobrowsesessionParticipantRequest(cobrowseId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCobrowsesessionParticipantRequest createPatchConversationsCobrowsesessionParticipantRequest(String cobrowseId, String participantId, MediaParticipantRequest body) {
    return PatchConversationsCobrowsesessionParticipantRequest.builder()
            .withCobrowseId(cobrowseId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Update conversation participant
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCobrowsesessionParticipant(PatchConversationsCobrowsesessionParticipantRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCobrowsesessionParticipant(ApiRequest<MediaParticipantRequest> request) throws IOException {
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
   * Update the attributes on a conversation participant.
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCobrowsesessionParticipantAttributes(String cobrowseId, String participantId, ParticipantAttributes body) throws IOException, ApiException {
     patchConversationsCobrowsesessionParticipantAttributes(createPatchConversationsCobrowsesessionParticipantAttributesRequest(cobrowseId, participantId, body));
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCobrowsesessionParticipantAttributesWithHttpInfo(String cobrowseId, String participantId, ParticipantAttributes body) throws IOException {
    return patchConversationsCobrowsesessionParticipantAttributes(createPatchConversationsCobrowsesessionParticipantAttributesRequest(cobrowseId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCobrowsesessionParticipantAttributesRequest createPatchConversationsCobrowsesessionParticipantAttributesRequest(String cobrowseId, String participantId, ParticipantAttributes body) {
    return PatchConversationsCobrowsesessionParticipantAttributesRequest.builder()
            .withCobrowseId(cobrowseId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCobrowsesessionParticipantAttributes(PatchConversationsCobrowsesessionParticipantAttributesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCobrowsesessionParticipantAttributes(ApiRequest<ParticipantAttributes> request) throws IOException {
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
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsCobrowsesessionParticipantCommunication(String cobrowseId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException, ApiException {
    return  patchConversationsCobrowsesessionParticipantCommunication(createPatchConversationsCobrowsesessionParticipantCommunicationRequest(cobrowseId, participantId, communicationId, body));
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsCobrowsesessionParticipantCommunicationWithHttpInfo(String cobrowseId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException {
    return patchConversationsCobrowsesessionParticipantCommunication(createPatchConversationsCobrowsesessionParticipantCommunicationRequest(cobrowseId, participantId, communicationId, body).withHttpInfo());
  }

  private PatchConversationsCobrowsesessionParticipantCommunicationRequest createPatchConversationsCobrowsesessionParticipantCommunicationRequest(String cobrowseId, String participantId, String communicationId, MediaParticipantRequest body) {
    return PatchConversationsCobrowsesessionParticipantCommunicationRequest.builder()
            .withCobrowseId(cobrowseId)

            .withParticipantId(participantId)

            .withCommunicationId(communicationId)

            .withBody(body)
            .build();
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsCobrowsesessionParticipantCommunication(PatchConversationsCobrowsesessionParticipantCommunicationRequest request) throws IOException, ApiException {
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
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsCobrowsesessionParticipantCommunication(ApiRequest<MediaParticipantRequest> request) throws IOException {
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
   * Update a conversation by disconnecting all of the participants
   * 
   * @param emailId emailId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsEmail(String emailId, Conversation body) throws IOException, ApiException {
    return  patchConversationsEmail(createPatchConversationsEmailRequest(emailId, body));
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param emailId emailId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsEmailWithHttpInfo(String emailId, Conversation body) throws IOException {
    return patchConversationsEmail(createPatchConversationsEmailRequest(emailId, body).withHttpInfo());
  }

  private PatchConversationsEmailRequest createPatchConversationsEmailRequest(String emailId, Conversation body) {
    return PatchConversationsEmailRequest.builder()
            .withEmailId(emailId)

            .withBody(body)
            .build();
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request The request object
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsEmail(PatchConversationsEmailRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Conversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Conversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsEmail(ApiRequest<Conversation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Conversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
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
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update conversation participant
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsEmailParticipant(String emailId, String participantId, MediaParticipantRequest body) throws IOException, ApiException {
     patchConversationsEmailParticipant(createPatchConversationsEmailParticipantRequest(emailId, participantId, body));
  }

  /**
   * Update conversation participant
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsEmailParticipantWithHttpInfo(String emailId, String participantId, MediaParticipantRequest body) throws IOException {
    return patchConversationsEmailParticipant(createPatchConversationsEmailParticipantRequest(emailId, participantId, body).withHttpInfo());
  }

  private PatchConversationsEmailParticipantRequest createPatchConversationsEmailParticipantRequest(String emailId, String participantId, MediaParticipantRequest body) {
    return PatchConversationsEmailParticipantRequest.builder()
            .withEmailId(emailId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Update conversation participant
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsEmailParticipant(PatchConversationsEmailParticipantRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsEmailParticipant(ApiRequest<MediaParticipantRequest> request) throws IOException {
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
   * Update the attributes on a conversation participant.
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsEmailParticipantAttributes(String emailId, String participantId, ParticipantAttributes body) throws IOException, ApiException {
     patchConversationsEmailParticipantAttributes(createPatchConversationsEmailParticipantAttributesRequest(emailId, participantId, body));
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsEmailParticipantAttributesWithHttpInfo(String emailId, String participantId, ParticipantAttributes body) throws IOException {
    return patchConversationsEmailParticipantAttributes(createPatchConversationsEmailParticipantAttributesRequest(emailId, participantId, body).withHttpInfo());
  }

  private PatchConversationsEmailParticipantAttributesRequest createPatchConversationsEmailParticipantAttributesRequest(String emailId, String participantId, ParticipantAttributes body) {
    return PatchConversationsEmailParticipantAttributesRequest.builder()
            .withEmailId(emailId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsEmailParticipantAttributes(PatchConversationsEmailParticipantAttributesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsEmailParticipantAttributes(ApiRequest<ParticipantAttributes> request) throws IOException {
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
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsEmailParticipantCommunication(String emailId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException, ApiException {
    return  patchConversationsEmailParticipantCommunication(createPatchConversationsEmailParticipantCommunicationRequest(emailId, participantId, communicationId, body));
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsEmailParticipantCommunicationWithHttpInfo(String emailId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException {
    return patchConversationsEmailParticipantCommunication(createPatchConversationsEmailParticipantCommunicationRequest(emailId, participantId, communicationId, body).withHttpInfo());
  }

  private PatchConversationsEmailParticipantCommunicationRequest createPatchConversationsEmailParticipantCommunicationRequest(String emailId, String participantId, String communicationId, MediaParticipantRequest body) {
    return PatchConversationsEmailParticipantCommunicationRequest.builder()
            .withEmailId(emailId)

            .withParticipantId(participantId)

            .withCommunicationId(communicationId)

            .withBody(body)
            .build();
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsEmailParticipantCommunication(PatchConversationsEmailParticipantCommunicationRequest request) throws IOException, ApiException {
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
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsEmailParticipantCommunication(ApiRequest<MediaParticipantRequest> request) throws IOException {
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
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (required)
   * @return PropertyIndexRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PropertyIndexRequest postAnalyticsConversationDetailsProperties(String conversationId, PropertyIndexRequest body) throws IOException, ApiException {
    return  postAnalyticsConversationDetailsProperties(createPostAnalyticsConversationDetailsPropertiesRequest(conversationId, body));
  }

  /**
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (required)
   * @return PropertyIndexRequest
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PropertyIndexRequest> postAnalyticsConversationDetailsPropertiesWithHttpInfo(String conversationId, PropertyIndexRequest body) throws IOException {
    return postAnalyticsConversationDetailsProperties(createPostAnalyticsConversationDetailsPropertiesRequest(conversationId, body).withHttpInfo());
  }

  private PostAnalyticsConversationDetailsPropertiesRequest createPostAnalyticsConversationDetailsPropertiesRequest(String conversationId, PropertyIndexRequest body) {
    return PostAnalyticsConversationDetailsPropertiesRequest.builder()
            .withConversationId(conversationId)

            .withBody(body)
            .build();
  }

  /**
   * Index conversation properties
   * 
   * @param request The request object
   * @return PropertyIndexRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PropertyIndexRequest postAnalyticsConversationDetailsProperties(PostAnalyticsConversationDetailsPropertiesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PropertyIndexRequest> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PropertyIndexRequest>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Index conversation properties
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PropertyIndexRequest> postAnalyticsConversationDetailsProperties(ApiRequest<PropertyIndexRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PropertyIndexRequest>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PropertyIndexRequest> response = (ApiResponse<PropertyIndexRequest>)(ApiResponse<?>)exception;
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
      ApiResponse<PropertyIndexRequest> response = (ApiResponse<PropertyIndexRequest>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for conversation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsConversationsAggregatesQuery(AggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsConversationsAggregatesQuery(createPostAnalyticsConversationsAggregatesQueryRequest(body));
  }

  /**
   * Query for conversation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsConversationsAggregatesQueryWithHttpInfo(AggregationQuery body) throws IOException {
    return postAnalyticsConversationsAggregatesQuery(createPostAnalyticsConversationsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsConversationsAggregatesQueryRequest createPostAnalyticsConversationsAggregatesQueryRequest(AggregationQuery body) {
    return PostAnalyticsConversationsAggregatesQueryRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Query for conversation aggregates
   * 
   * @param request The request object
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsConversationsAggregatesQuery(PostAnalyticsConversationsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for conversation aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsConversationsAggregatesQuery(ApiRequest<AggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for conversation details
   * 
   * @param body query (required)
   * @return AnalyticsConversationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationQueryResponse postAnalyticsConversationsDetailsQuery(ConversationQuery body) throws IOException, ApiException {
    return  postAnalyticsConversationsDetailsQuery(createPostAnalyticsConversationsDetailsQueryRequest(body));
  }

  /**
   * Query for conversation details
   * 
   * @param body query (required)
   * @return AnalyticsConversationQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQueryWithHttpInfo(ConversationQuery body) throws IOException {
    return postAnalyticsConversationsDetailsQuery(createPostAnalyticsConversationsDetailsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsConversationsDetailsQueryRequest createPostAnalyticsConversationsDetailsQueryRequest(ConversationQuery body) {
    return PostAnalyticsConversationsDetailsQueryRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Query for conversation details
   * 
   * @param request The request object
   * @return AnalyticsConversationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationQueryResponse postAnalyticsConversationsDetailsQuery(PostAnalyticsConversationsDetailsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversationQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversationQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for conversation details
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQuery(ApiRequest<ConversationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversationQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationQueryResponse> response = (ApiResponse<AnalyticsConversationQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AnalyticsConversationQueryResponse> response = (ApiResponse<AnalyticsConversationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new callback for the specified participant on the conversation.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationParticipantCallbacks(String conversationId, String participantId, CreateCallbackCommand body) throws IOException, ApiException {
     postConversationParticipantCallbacks(createPostConversationParticipantCallbacksRequest(conversationId, participantId, body));
  }

  /**
   * Create a new callback for the specified participant on the conversation.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationParticipantCallbacksWithHttpInfo(String conversationId, String participantId, CreateCallbackCommand body) throws IOException {
    return postConversationParticipantCallbacks(createPostConversationParticipantCallbacksRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PostConversationParticipantCallbacksRequest createPostConversationParticipantCallbacksRequest(String conversationId, String participantId, CreateCallbackCommand body) {
    return PostConversationParticipantCallbacksRequest.builder()
            .withConversationId(conversationId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Create a new callback for the specified participant on the conversation.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationParticipantCallbacks(PostConversationParticipantCallbacksRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Create a new callback for the specified participant on the conversation.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationParticipantCallbacks(ApiRequest<CreateCallbackCommand> request) throws IOException {
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
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Transfer request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationParticipantReplace(String conversationId, String participantId, TransferRequest body) throws IOException, ApiException {
     postConversationParticipantReplace(createPostConversationParticipantReplaceRequest(conversationId, participantId, body));
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Transfer request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationParticipantReplaceWithHttpInfo(String conversationId, String participantId, TransferRequest body) throws IOException {
    return postConversationParticipantReplace(createPostConversationParticipantReplaceRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PostConversationParticipantReplaceRequest createPostConversationParticipantReplaceRequest(String conversationId, String participantId, TransferRequest body) {
    return PostConversationParticipantReplaceRequest.builder()
            .withConversationId(conversationId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationParticipantReplace(PostConversationParticipantReplaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationParticipantReplace(ApiRequest<TransferRequest> request) throws IOException {
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
   * Add a new call to a conversation
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation postConversationsCall(String callId, CallCommand body) throws IOException, ApiException {
    return  postConversationsCall(createPostConversationsCallRequest(callId, body));
  }

  /**
   * Add a new call to a conversation
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> postConversationsCallWithHttpInfo(String callId, CallCommand body) throws IOException {
    return postConversationsCall(createPostConversationsCallRequest(callId, body).withHttpInfo());
  }

  private PostConversationsCallRequest createPostConversationsCallRequest(String callId, CallCommand body) {
    return PostConversationsCallRequest.builder()
            .withCallId(callId)

            .withBody(body)
            .build();
  }

  /**
   * Add a new call to a conversation
   * 
   * @param request The request object
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation postConversationsCall(PostConversationsCallRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Conversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Conversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a new call to a conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> postConversationsCall(ApiRequest<CallCommand> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Conversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
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
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Initiate and update consult transfer
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Destination address &amp; initial speak to (required)
   * @return ConsultTransferResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConsultTransferResponse postConversationsCallParticipantConsult(String callId, String participantId, ConsultTransfer body) throws IOException, ApiException {
    return  postConversationsCallParticipantConsult(createPostConversationsCallParticipantConsultRequest(callId, participantId, body));
  }

  /**
   * Initiate and update consult transfer
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Destination address &amp; initial speak to (required)
   * @return ConsultTransferResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConsultTransferResponse> postConversationsCallParticipantConsultWithHttpInfo(String callId, String participantId, ConsultTransfer body) throws IOException {
    return postConversationsCallParticipantConsult(createPostConversationsCallParticipantConsultRequest(callId, participantId, body).withHttpInfo());
  }

  private PostConversationsCallParticipantConsultRequest createPostConversationsCallParticipantConsultRequest(String callId, String participantId, ConsultTransfer body) {
    return PostConversationsCallParticipantConsultRequest.builder()
            .withCallId(callId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Initiate and update consult transfer
   * 
   * @param request The request object
   * @return ConsultTransferResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConsultTransferResponse postConversationsCallParticipantConsult(PostConversationsCallParticipantConsultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ConsultTransferResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ConsultTransferResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Initiate and update consult transfer
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConsultTransferResponse> postConversationsCallParticipantConsult(ApiRequest<ConsultTransfer> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ConsultTransferResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ConsultTransferResponse> response = (ApiResponse<ConsultTransferResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ConsultTransferResponse> response = (ApiResponse<ConsultTransferResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCallParticipantMonitor(String callId, String participantId) throws IOException, ApiException {
     postConversationsCallParticipantMonitor(createPostConversationsCallParticipantMonitorRequest(callId, participantId));
  }

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCallParticipantMonitorWithHttpInfo(String callId, String participantId) throws IOException {
    return postConversationsCallParticipantMonitor(createPostConversationsCallParticipantMonitorRequest(callId, participantId).withHttpInfo());
  }

  private PostConversationsCallParticipantMonitorRequest createPostConversationsCallParticipantMonitorRequest(String callId, String participantId) {
    return PostConversationsCallParticipantMonitorRequest.builder()
            .withCallId(callId)

            .withParticipantId(participantId)
            .build();
  }

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCallParticipantMonitor(PostConversationsCallParticipantMonitorRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCallParticipantMonitor(ApiRequest<Void> request) throws IOException {
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
   * Replace this participant with the specified user and/or address
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCallParticipantReplace(String callId, String participantId, TransferRequest body) throws IOException, ApiException {
     postConversationsCallParticipantReplace(createPostConversationsCallParticipantReplaceRequest(callId, participantId, body));
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCallParticipantReplaceWithHttpInfo(String callId, String participantId, TransferRequest body) throws IOException {
    return postConversationsCallParticipantReplace(createPostConversationsCallParticipantReplaceRequest(callId, participantId, body).withHttpInfo());
  }

  private PostConversationsCallParticipantReplaceRequest createPostConversationsCallParticipantReplaceRequest(String callId, String participantId, TransferRequest body) {
    return PostConversationsCallParticipantReplaceRequest.builder()
            .withCallId(callId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCallParticipantReplace(PostConversationsCallParticipantReplaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCallParticipantReplace(ApiRequest<TransferRequest> request) throws IOException {
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
   * Add participants to a conversation
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation postConversationsCallParticipants(String callId, Conversation body) throws IOException, ApiException {
    return  postConversationsCallParticipants(createPostConversationsCallParticipantsRequest(callId, body));
  }

  /**
   * Add participants to a conversation
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> postConversationsCallParticipantsWithHttpInfo(String callId, Conversation body) throws IOException {
    return postConversationsCallParticipants(createPostConversationsCallParticipantsRequest(callId, body).withHttpInfo());
  }

  private PostConversationsCallParticipantsRequest createPostConversationsCallParticipantsRequest(String callId, Conversation body) {
    return PostConversationsCallParticipantsRequest.builder()
            .withCallId(callId)

            .withBody(body)
            .build();
  }

  /**
   * Add participants to a conversation
   * 
   * @param request The request object
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation postConversationsCallParticipants(PostConversationsCallParticipantsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Conversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Conversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add participants to a conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> postConversationsCallParticipants(ApiRequest<Conversation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Conversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
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
      ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCallbackParticipantReplace(String callbackId, String participantId, TransferRequest body) throws IOException, ApiException {
     postConversationsCallbackParticipantReplace(createPostConversationsCallbackParticipantReplaceRequest(callbackId, participantId, body));
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCallbackParticipantReplaceWithHttpInfo(String callbackId, String participantId, TransferRequest body) throws IOException {
    return postConversationsCallbackParticipantReplace(createPostConversationsCallbackParticipantReplaceRequest(callbackId, participantId, body).withHttpInfo());
  }

  private PostConversationsCallbackParticipantReplaceRequest createPostConversationsCallbackParticipantReplaceRequest(String callbackId, String participantId, TransferRequest body) {
    return PostConversationsCallbackParticipantReplaceRequest.builder()
            .withCallbackId(callbackId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCallbackParticipantReplace(PostConversationsCallbackParticipantReplaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCallbackParticipantReplace(ApiRequest<TransferRequest> request) throws IOException {
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
   * Create a Callback
   * 
   * @param body Callback (required)
   * @return CreateCallbackResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateCallbackResponse postConversationsCallbacks(CreateCallbackCommand body) throws IOException, ApiException {
    return  postConversationsCallbacks(createPostConversationsCallbacksRequest(body));
  }

  /**
   * Create a Callback
   * 
   * @param body Callback (required)
   * @return CreateCallbackResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateCallbackResponse> postConversationsCallbacksWithHttpInfo(CreateCallbackCommand body) throws IOException {
    return postConversationsCallbacks(createPostConversationsCallbacksRequest(body).withHttpInfo());
  }

  private PostConversationsCallbacksRequest createPostConversationsCallbacksRequest(CreateCallbackCommand body) {
    return PostConversationsCallbacksRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create a Callback
   * 
   * @param request The request object
   * @return CreateCallbackResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateCallbackResponse postConversationsCallbacks(PostConversationsCallbacksRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CreateCallbackResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CreateCallbackResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Callback
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateCallbackResponse> postConversationsCallbacks(ApiRequest<CreateCallbackCommand> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CreateCallbackResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CreateCallbackResponse> response = (ApiResponse<CreateCallbackResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CreateCallbackResponse> response = (ApiResponse<CreateCallbackResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a call conversation
   * 
   * @param body Call request (required)
   * @return CreateCallResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateCallResponse postConversationsCalls(CreateCallRequest body) throws IOException, ApiException {
    return  postConversationsCalls(createPostConversationsCallsRequest(body));
  }

  /**
   * Create a call conversation
   * 
   * @param body Call request (required)
   * @return CreateCallResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateCallResponse> postConversationsCallsWithHttpInfo(CreateCallRequest body) throws IOException {
    return postConversationsCalls(createPostConversationsCallsRequest(body).withHttpInfo());
  }

  private PostConversationsCallsRequest createPostConversationsCallsRequest(CreateCallRequest body) {
    return PostConversationsCallsRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create a call conversation
   * 
   * @param request The request object
   * @return CreateCallResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateCallResponse postConversationsCalls(PostConversationsCallsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CreateCallResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CreateCallResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a call conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateCallResponse> postConversationsCalls(ApiRequest<CreateCallRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CreateCallResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CreateCallResponse> response = (ApiResponse<CreateCallResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CreateCallResponse> response = (ApiResponse<CreateCallResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsChatParticipantReplace(String chatId, String participantId, TransferRequest body) throws IOException, ApiException {
     postConversationsChatParticipantReplace(createPostConversationsChatParticipantReplaceRequest(chatId, participantId, body));
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsChatParticipantReplaceWithHttpInfo(String chatId, String participantId, TransferRequest body) throws IOException {
    return postConversationsChatParticipantReplace(createPostConversationsChatParticipantReplaceRequest(chatId, participantId, body).withHttpInfo());
  }

  private PostConversationsChatParticipantReplaceRequest createPostConversationsChatParticipantReplaceRequest(String chatId, String participantId, TransferRequest body) {
    return PostConversationsChatParticipantReplaceRequest.builder()
            .withChatId(chatId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsChatParticipantReplace(PostConversationsChatParticipantReplaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsChatParticipantReplace(ApiRequest<TransferRequest> request) throws IOException {
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
   * Create a web chat conversation
   * 
   * @param body Create web chat request (required)
   * @return ChatConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatConversation postConversationsChats(CreateWebChatRequest body) throws IOException, ApiException {
    return  postConversationsChats(createPostConversationsChatsRequest(body));
  }

  /**
   * Create a web chat conversation
   * 
   * @param body Create web chat request (required)
   * @return ChatConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatConversation> postConversationsChatsWithHttpInfo(CreateWebChatRequest body) throws IOException {
    return postConversationsChats(createPostConversationsChatsRequest(body).withHttpInfo());
  }

  private PostConversationsChatsRequest createPostConversationsChatsRequest(CreateWebChatRequest body) {
    return PostConversationsChatsRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create a web chat conversation
   * 
   * @param request The request object
   * @return ChatConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatConversation postConversationsChats(PostConversationsChatsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatConversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatConversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a web chat conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatConversation> postConversationsChats(ApiRequest<CreateWebChatRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatConversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatConversation> response = (ApiResponse<ChatConversation>)(ApiResponse<?>)exception;
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
      ApiResponse<ChatConversation> response = (ApiResponse<ChatConversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCobrowsesessionParticipantReplace(String cobrowseId, String participantId, TransferRequest body) throws IOException, ApiException {
     postConversationsCobrowsesessionParticipantReplace(createPostConversationsCobrowsesessionParticipantReplaceRequest(cobrowseId, participantId, body));
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param cobrowseId cobrowseId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCobrowsesessionParticipantReplaceWithHttpInfo(String cobrowseId, String participantId, TransferRequest body) throws IOException {
    return postConversationsCobrowsesessionParticipantReplace(createPostConversationsCobrowsesessionParticipantReplaceRequest(cobrowseId, participantId, body).withHttpInfo());
  }

  private PostConversationsCobrowsesessionParticipantReplaceRequest createPostConversationsCobrowsesessionParticipantReplaceRequest(String cobrowseId, String participantId, TransferRequest body) {
    return PostConversationsCobrowsesessionParticipantReplaceRequest.builder()
            .withCobrowseId(cobrowseId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCobrowsesessionParticipantReplace(PostConversationsCobrowsesessionParticipantReplaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCobrowsesessionParticipantReplace(ApiRequest<TransferRequest> request) throws IOException {
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
   * Send an email reply
   * 
   * @param emailId emailId (required)
   * @param body Reply (required)
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage postConversationsEmailMessages(String emailId, EmailMessage body) throws IOException, ApiException {
    return  postConversationsEmailMessages(createPostConversationsEmailMessagesRequest(emailId, body));
  }

  /**
   * Send an email reply
   * 
   * @param emailId emailId (required)
   * @param body Reply (required)
   * @return EmailMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> postConversationsEmailMessagesWithHttpInfo(String emailId, EmailMessage body) throws IOException {
    return postConversationsEmailMessages(createPostConversationsEmailMessagesRequest(emailId, body).withHttpInfo());
  }

  private PostConversationsEmailMessagesRequest createPostConversationsEmailMessagesRequest(String emailId, EmailMessage body) {
    return PostConversationsEmailMessagesRequest.builder()
            .withEmailId(emailId)

            .withBody(body)
            .build();
  }

  /**
   * Send an email reply
   * 
   * @param request The request object
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage postConversationsEmailMessages(PostConversationsEmailMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailMessage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailMessage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send an email reply
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> postConversationsEmailMessages(ApiRequest<EmailMessage> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailMessage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsEmailParticipantReplace(String emailId, String participantId, TransferRequest body) throws IOException, ApiException {
     postConversationsEmailParticipantReplace(createPostConversationsEmailParticipantReplaceRequest(emailId, participantId, body));
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsEmailParticipantReplaceWithHttpInfo(String emailId, String participantId, TransferRequest body) throws IOException {
    return postConversationsEmailParticipantReplace(createPostConversationsEmailParticipantReplaceRequest(emailId, participantId, body).withHttpInfo());
  }

  private PostConversationsEmailParticipantReplaceRequest createPostConversationsEmailParticipantReplaceRequest(String emailId, String participantId, TransferRequest body) {
    return PostConversationsEmailParticipantReplaceRequest.builder()
            .withEmailId(emailId)

            .withParticipantId(participantId)

            .withBody(body)
            .build();
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsEmailParticipantReplace(PostConversationsEmailParticipantReplaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsEmailParticipantReplace(ApiRequest<TransferRequest> request) throws IOException {
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
   * Create an email conversation
   * 
   * @param body Create email request (required)
   * @return EmailConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailConversation postConversationsEmails(CreateEmailRequest body) throws IOException, ApiException {
    return  postConversationsEmails(createPostConversationsEmailsRequest(body));
  }

  /**
   * Create an email conversation
   * 
   * @param body Create email request (required)
   * @return EmailConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailConversation> postConversationsEmailsWithHttpInfo(CreateEmailRequest body) throws IOException {
    return postConversationsEmails(createPostConversationsEmailsRequest(body).withHttpInfo());
  }

  private PostConversationsEmailsRequest createPostConversationsEmailsRequest(CreateEmailRequest body) {
    return PostConversationsEmailsRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create an email conversation
   * 
   * @param request The request object
   * @return EmailConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailConversation postConversationsEmails(PostConversationsEmailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailConversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailConversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an email conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailConversation> postConversationsEmails(ApiRequest<CreateEmailRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailConversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailConversation> response = (ApiResponse<EmailConversation>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailConversation> response = (ApiResponse<EmailConversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create Fax Conversation
   * 
   * @param body Fax (required)
   * @return FaxSendResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FaxSendResponse postConversationsFaxes(FaxSendRequest body) throws IOException, ApiException {
    return  postConversationsFaxes(createPostConversationsFaxesRequest(body));
  }

  /**
   * Create Fax Conversation
   * 
   * @param body Fax (required)
   * @return FaxSendResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FaxSendResponse> postConversationsFaxesWithHttpInfo(FaxSendRequest body) throws IOException {
    return postConversationsFaxes(createPostConversationsFaxesRequest(body).withHttpInfo());
  }

  private PostConversationsFaxesRequest createPostConversationsFaxesRequest(FaxSendRequest body) {
    return PostConversationsFaxesRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create Fax Conversation
   * 
   * @param request The request object
   * @return FaxSendResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FaxSendResponse postConversationsFaxes(PostConversationsFaxesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FaxSendResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FaxSendResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Fax Conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FaxSendResponse> postConversationsFaxes(ApiRequest<FaxSendRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FaxSendResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FaxSendResponse> response = (ApiResponse<FaxSendResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<FaxSendResponse> response = (ApiResponse<FaxSendResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update conversation draft reply
   * 
   * @param emailId emailId (required)
   * @param body Draft (required)
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage putConversationsEmailMessagesDraft(String emailId, EmailMessage body) throws IOException, ApiException {
    return  putConversationsEmailMessagesDraft(createPutConversationsEmailMessagesDraftRequest(emailId, body));
  }

  /**
   * Update conversation draft reply
   * 
   * @param emailId emailId (required)
   * @param body Draft (required)
   * @return EmailMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> putConversationsEmailMessagesDraftWithHttpInfo(String emailId, EmailMessage body) throws IOException {
    return putConversationsEmailMessagesDraft(createPutConversationsEmailMessagesDraftRequest(emailId, body).withHttpInfo());
  }

  private PutConversationsEmailMessagesDraftRequest createPutConversationsEmailMessagesDraftRequest(String emailId, EmailMessage body) {
    return PutConversationsEmailMessagesDraftRequest.builder()
            .withEmailId(emailId)

            .withBody(body)
            .build();
  }

  /**
   * Update conversation draft reply
   * 
   * @param request The request object
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage putConversationsEmailMessagesDraft(PutConversationsEmailMessagesDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailMessage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailMessage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update conversation draft reply
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> putConversationsEmailMessagesDraft(ApiRequest<EmailMessage> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailMessage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
