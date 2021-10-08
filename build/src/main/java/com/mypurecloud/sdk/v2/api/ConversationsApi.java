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
import com.mypurecloud.sdk.v2.model.WhatsAppIntegration;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributes;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributesMultiGetResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.DataAvailabilityResponse;
import com.mypurecloud.sdk.v2.model.Conversation;
import com.mypurecloud.sdk.v2.model.SecureSession;
import com.mypurecloud.sdk.v2.model.SecureSessionEntityListing;
import com.mypurecloud.sdk.v2.model.AssignedWrapupCode;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.ConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallConversation;
import com.mypurecloud.sdk.v2.model.CallbackConversation;
import com.mypurecloud.sdk.v2.model.CallbackConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallHistoryConversationEntityListing;
import com.mypurecloud.sdk.v2.model.MaxParticipants;
import com.mypurecloud.sdk.v2.model.ChatConversation;
import com.mypurecloud.sdk.v2.model.WebChatMessage;
import com.mypurecloud.sdk.v2.model.WebChatMessageEntityList;
import com.mypurecloud.sdk.v2.model.ChatConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CobrowseConversation;
import com.mypurecloud.sdk.v2.model.CobrowseConversationEntityListing;
import com.mypurecloud.sdk.v2.model.EmailConversation;
import com.mypurecloud.sdk.v2.model.EmailMessage;
import com.mypurecloud.sdk.v2.model.EmailMessageListing;
import com.mypurecloud.sdk.v2.model.EmailConversationEntityListing;
import com.mypurecloud.sdk.v2.model.MessageConversation;
import com.mypurecloud.sdk.v2.model.MessageMediaData;
import com.mypurecloud.sdk.v2.model.MessageData;
import com.mypurecloud.sdk.v2.model.MessageConversationEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookAppCredentials;
import com.mypurecloud.sdk.v2.model.MessagingIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookIntegration;
import com.mypurecloud.sdk.v2.model.LineIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.LineIntegration;
import com.mypurecloud.sdk.v2.model.OpenIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.OpenIntegration;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.TwitterIntegration;
import com.mypurecloud.sdk.v2.model.WhatsAppIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.MessagingStickerEntityListing;
import com.mypurecloud.sdk.v2.model.ConversationThreadingWindow;
import com.mypurecloud.sdk.v2.model.MediaParticipantRequest;
import com.mypurecloud.sdk.v2.model.ParticipantAttributes;
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ConsultTransferUpdate;
import com.mypurecloud.sdk.v2.model.ConsultTransferResponse;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationUpdateRequest;
import com.mypurecloud.sdk.v2.model.OpenIntegrationUpdateRequest;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationRequest;
import com.mypurecloud.sdk.v2.model.WhatsAppIntegrationUpdateRequest;
import com.mypurecloud.sdk.v2.model.PropertyIndexRequest;
import com.mypurecloud.sdk.v2.model.ConversationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationAggregationQuery;
import com.mypurecloud.sdk.v2.model.AsyncConversationQuery;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationQuery;
import com.mypurecloud.sdk.v2.model.ConversationUser;
import com.mypurecloud.sdk.v2.model.CreateCallbackOnConversationCommand;
import com.mypurecloud.sdk.v2.model.Digits;
import com.mypurecloud.sdk.v2.model.TransferRequest;
import com.mypurecloud.sdk.v2.model.CreateSecureSession;
import com.mypurecloud.sdk.v2.model.CallCommand;
import com.mypurecloud.sdk.v2.model.ConsultTransfer;
import com.mypurecloud.sdk.v2.model.CreateCallbackResponse;
import com.mypurecloud.sdk.v2.model.CreateCallbackCommand;
import com.mypurecloud.sdk.v2.model.CreateCallRequest;
import com.mypurecloud.sdk.v2.model.CreateCallResponse;
import com.mypurecloud.sdk.v2.model.CreateWebChatMessageRequest;
import com.mypurecloud.sdk.v2.model.WebChatTyping;
import com.mypurecloud.sdk.v2.model.CreateWebChatRequest;
import com.mypurecloud.sdk.v2.model.InboundMessageRequest;
import com.mypurecloud.sdk.v2.model.CopyAttachmentsRequest;
import com.mypurecloud.sdk.v2.model.CreateEmailRequest;
import com.mypurecloud.sdk.v2.model.FaxSendResponse;
import com.mypurecloud.sdk.v2.model.FaxSendRequest;
import com.mypurecloud.sdk.v2.model.AdditionalMessage;
import com.mypurecloud.sdk.v2.model.TextMessageListing;
import com.mypurecloud.sdk.v2.model.CreateOutboundMessagingConversationRequest;
import com.mypurecloud.sdk.v2.model.SendAgentlessOutboundMessageRequest;
import com.mypurecloud.sdk.v2.model.SendAgentlessOutboundMessageResponse;
import com.mypurecloud.sdk.v2.model.OpenNormalizedMessage;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationRequest;
import com.mypurecloud.sdk.v2.model.LineIntegrationRequest;
import com.mypurecloud.sdk.v2.model.OpenIntegrationRequest;
import com.mypurecloud.sdk.v2.model.WhatsAppIntegrationRequest;
import com.mypurecloud.sdk.v2.model.ConversationTagsUpdate;
import com.mypurecloud.sdk.v2.model.SetUuiDataRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteAnalyticsConversationsDetailsJobRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteConversationParticipantCodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteConversationParticipantFlaggedreasonRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteConversationsCallParticipantConsultRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteConversationsEmailMessagesDraftAttachmentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteConversationsMessagingIntegrationsOpenIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteConversationsMessagingIntegrationsWhatsappIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsDetailsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsDetailsJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsDetailsJobsAvailabilityRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationParticipantSecureivrsessionRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationParticipantSecureivrsessionsRequest;
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
import com.mypurecloud.sdk.v2.api.request.GetConversationsChatMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsChatMessagesRequest;
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
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessageCommunicationMessagesMediaMediaIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessageDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessageMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessageParticipantWrapupRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessageParticipantWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingFacebookAppRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsFacebookRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsFacebookIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsLineRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsLineIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsOpenRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsOpenIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsTwitterRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsTwitterIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsWhatsappRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsWhatsappIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingStickerRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingThreadingtimelineRequest;
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
import com.mypurecloud.sdk.v2.api.request.PatchConversationsMessageRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsMessageParticipantRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsMessageParticipantAttributesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsMessageParticipantCommunicationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsMessagingIntegrationsFacebookIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsMessagingIntegrationsOpenIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsMessagingIntegrationsTwitterIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchConversationsMessagingIntegrationsWhatsappIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationDetailsPropertiesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsDetailsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsDetailsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationAssignRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationDisconnectRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationParticipantCallbacksRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationParticipantDigitsRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationParticipantReplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationParticipantSecureivrsessionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallParticipantCoachRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallParticipantConsultRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallParticipantMonitorRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallParticipantReplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallParticipantsRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallbackParticipantReplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallbacksRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCallsRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsChatCommunicationMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsChatCommunicationTypingRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsChatParticipantReplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsChatsRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsCobrowsesessionParticipantReplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsEmailInboundmessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsEmailMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsEmailMessagesDraftAttachmentsCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsEmailParticipantReplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsEmailsRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsFaxesRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessageCommunicationMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessageCommunicationMessagesMediaRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessageMessagesBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessageParticipantReplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessagesAgentlessRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessagesInboundOpenRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessagingIntegrationsFacebookRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessagingIntegrationsLineRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessagingIntegrationsOpenRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessagingIntegrationsTwitterRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessagingIntegrationsWhatsappRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationParticipantFlaggedreasonRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationTagsRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationsCallParticipantCommunicationUuidataRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationsEmailMessagesDraftRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationsMessagingIntegrationsLineIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationsMessagingThreadingtimelineRequest;

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
   * Delete/cancel an async request
   * 
   * @param jobId jobId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsConversationsDetailsJob(String jobId) throws IOException, ApiException {
     deleteAnalyticsConversationsDetailsJob(createDeleteAnalyticsConversationsDetailsJobRequest(jobId));
  }

  /**
   * Delete/cancel an async request
   * 
   * @param jobId jobId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAnalyticsConversationsDetailsJobWithHttpInfo(String jobId) throws IOException {
    return deleteAnalyticsConversationsDetailsJob(createDeleteAnalyticsConversationsDetailsJobRequest(jobId).withHttpInfo());
  }

  private DeleteAnalyticsConversationsDetailsJobRequest createDeleteAnalyticsConversationsDetailsJobRequest(String jobId) {
    return DeleteAnalyticsConversationsDetailsJobRequest.builder()
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
  public void deleteAnalyticsConversationsDetailsJob(DeleteAnalyticsConversationsDetailsJobRequest request) throws IOException, ApiException {
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
  public ApiResponse<Void> deleteAnalyticsConversationsDetailsJob(ApiRequest<Void> request) throws IOException {
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
   * Remove flagged reason from conversation participant.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationParticipantFlaggedreason(String conversationId, String participantId) throws IOException, ApiException {
     deleteConversationParticipantFlaggedreason(createDeleteConversationParticipantFlaggedreasonRequest(conversationId, participantId));
  }

  /**
   * Remove flagged reason from conversation participant.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationParticipantFlaggedreasonWithHttpInfo(String conversationId, String participantId) throws IOException {
    return deleteConversationParticipantFlaggedreason(createDeleteConversationParticipantFlaggedreasonRequest(conversationId, participantId).withHttpInfo());
  }

  private DeleteConversationParticipantFlaggedreasonRequest createDeleteConversationParticipantFlaggedreasonRequest(String conversationId, String participantId) {
    return DeleteConversationParticipantFlaggedreasonRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .build();
  }

  /**
   * Remove flagged reason from conversation participant.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationParticipantFlaggedreason(DeleteConversationParticipantFlaggedreasonRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove flagged reason from conversation participant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationParticipantFlaggedreason(ApiRequest<Void> request) throws IOException {
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsCallParticipantConsult(String conversationId, String participantId) throws IOException, ApiException {
     deleteConversationsCallParticipantConsult(createDeleteConversationsCallParticipantConsultRequest(conversationId, participantId));
  }

  /**
   * Cancel the transfer
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsCallParticipantConsultWithHttpInfo(String conversationId, String participantId) throws IOException {
    return deleteConversationsCallParticipantConsult(createDeleteConversationsCallParticipantConsultRequest(conversationId, participantId).withHttpInfo());
  }

  private DeleteConversationsCallParticipantConsultRequest createDeleteConversationsCallParticipantConsultRequest(String conversationId, String participantId) {
    return DeleteConversationsCallParticipantConsultRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .build();
  }

  /**
   * Cancel the transfer
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsCallParticipantConsult(DeleteConversationsCallParticipantConsultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Cancel the transfer
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsCallParticipantConsult(ApiRequest<Void> request) throws IOException {
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
   * Delete attachment from draft
   * 
   * @param conversationId conversationId (required)
   * @param attachmentId attachmentId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsEmailMessagesDraftAttachment(String conversationId, String attachmentId) throws IOException, ApiException {
     deleteConversationsEmailMessagesDraftAttachment(createDeleteConversationsEmailMessagesDraftAttachmentRequest(conversationId, attachmentId));
  }

  /**
   * Delete attachment from draft
   * 
   * @param conversationId conversationId (required)
   * @param attachmentId attachmentId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsEmailMessagesDraftAttachmentWithHttpInfo(String conversationId, String attachmentId) throws IOException {
    return deleteConversationsEmailMessagesDraftAttachment(createDeleteConversationsEmailMessagesDraftAttachmentRequest(conversationId, attachmentId).withHttpInfo());
  }

  private DeleteConversationsEmailMessagesDraftAttachmentRequest createDeleteConversationsEmailMessagesDraftAttachmentRequest(String conversationId, String attachmentId) {
    return DeleteConversationsEmailMessagesDraftAttachmentRequest.builder()
            .withConversationId(conversationId)
    
            .withAttachmentId(attachmentId)
    
            .build();
  }

  /**
   * Delete attachment from draft
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsEmailMessagesDraftAttachment(DeleteConversationsEmailMessagesDraftAttachmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete attachment from draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsEmailMessagesDraftAttachment(ApiRequest<Void> request) throws IOException {
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
   * Delete a Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsFacebookIntegrationId(String integrationId) throws IOException, ApiException {
     deleteConversationsMessagingIntegrationsFacebookIntegrationId(createDeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest(integrationId));
  }

  /**
   * Delete a Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsFacebookIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return deleteConversationsMessagingIntegrationsFacebookIntegrationId(createDeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private DeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest createDeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest(String integrationId) {
    return DeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Delete a Facebook messaging integration
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsFacebookIntegrationId(DeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Facebook messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsFacebookIntegrationId(ApiRequest<Void> request) throws IOException {
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
   * Delete a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsLineIntegrationId(String integrationId) throws IOException, ApiException {
     deleteConversationsMessagingIntegrationsLineIntegrationId(createDeleteConversationsMessagingIntegrationsLineIntegrationIdRequest(integrationId));
  }

  /**
   * Delete a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsLineIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return deleteConversationsMessagingIntegrationsLineIntegrationId(createDeleteConversationsMessagingIntegrationsLineIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest createDeleteConversationsMessagingIntegrationsLineIntegrationIdRequest(String integrationId) {
    return DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Delete a LINE messenger integration
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsLineIntegrationId(DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a LINE messenger integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsLineIntegrationId(ApiRequest<Void> request) throws IOException {
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
   * Delete an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param integrationId Integration ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsOpenIntegrationId(String integrationId) throws IOException, ApiException {
     deleteConversationsMessagingIntegrationsOpenIntegrationId(createDeleteConversationsMessagingIntegrationsOpenIntegrationIdRequest(integrationId));
  }

  /**
   * Delete an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param integrationId Integration ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsOpenIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return deleteConversationsMessagingIntegrationsOpenIntegrationId(createDeleteConversationsMessagingIntegrationsOpenIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private DeleteConversationsMessagingIntegrationsOpenIntegrationIdRequest createDeleteConversationsMessagingIntegrationsOpenIntegrationIdRequest(String integrationId) {
    return DeleteConversationsMessagingIntegrationsOpenIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Delete an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsOpenIntegrationId(DeleteConversationsMessagingIntegrationsOpenIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsOpenIntegrationId(ApiRequest<Void> request) throws IOException {
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
   * Delete a Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsTwitterIntegrationId(String integrationId) throws IOException, ApiException {
     deleteConversationsMessagingIntegrationsTwitterIntegrationId(createDeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest(integrationId));
  }

  /**
   * Delete a Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsTwitterIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return deleteConversationsMessagingIntegrationsTwitterIntegrationId(createDeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private DeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest createDeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest(String integrationId) {
    return DeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Delete a Twitter messaging integration
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsTwitterIntegrationId(DeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Twitter messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsTwitterIntegrationId(ApiRequest<Void> request) throws IOException {
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
   * Delete a WhatsApp messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @return WhatsAppIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WhatsAppIntegration deleteConversationsMessagingIntegrationsWhatsappIntegrationId(String integrationId) throws IOException, ApiException {
    return  deleteConversationsMessagingIntegrationsWhatsappIntegrationId(createDeleteConversationsMessagingIntegrationsWhatsappIntegrationIdRequest(integrationId));
  }

  /**
   * Delete a WhatsApp messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @return WhatsAppIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WhatsAppIntegration> deleteConversationsMessagingIntegrationsWhatsappIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return deleteConversationsMessagingIntegrationsWhatsappIntegrationId(createDeleteConversationsMessagingIntegrationsWhatsappIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private DeleteConversationsMessagingIntegrationsWhatsappIntegrationIdRequest createDeleteConversationsMessagingIntegrationsWhatsappIntegrationIdRequest(String integrationId) {
    return DeleteConversationsMessagingIntegrationsWhatsappIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Delete a WhatsApp messaging integration
   * 
   * @param request The request object
   * @return WhatsAppIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WhatsAppIntegration deleteConversationsMessagingIntegrationsWhatsappIntegrationId(DeleteConversationsMessagingIntegrationsWhatsappIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WhatsAppIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WhatsAppIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete a WhatsApp messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WhatsAppIntegration> deleteConversationsMessagingIntegrationsWhatsappIntegrationId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WhatsAppIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WhatsAppIntegration> response = (ApiResponse<WhatsAppIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WhatsAppIntegration> response = (ApiResponse<WhatsAppIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return AnalyticsConversationWithoutAttributes
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationWithoutAttributes getAnalyticsConversationDetails(String conversationId) throws IOException, ApiException {
    return  getAnalyticsConversationDetails(createGetAnalyticsConversationDetailsRequest(conversationId));
  }

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return AnalyticsConversationWithoutAttributes
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationWithoutAttributes> getAnalyticsConversationDetailsWithHttpInfo(String conversationId) throws IOException {
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
   * @return AnalyticsConversationWithoutAttributes
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationWithoutAttributes getAnalyticsConversationDetails(GetAnalyticsConversationDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversationWithoutAttributes> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversationWithoutAttributes>() {});
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
  public ApiResponse<AnalyticsConversationWithoutAttributes> getAnalyticsConversationDetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversationWithoutAttributes>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationWithoutAttributes> response = (ApiResponse<AnalyticsConversationWithoutAttributes>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationWithoutAttributes> response = (ApiResponse<AnalyticsConversationWithoutAttributes>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets multiple conversations by id
   * 
   * @param id Comma-separated conversation ids (optional)
   * @return AnalyticsConversationWithoutAttributesMultiGetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationWithoutAttributesMultiGetResponse getAnalyticsConversationsDetails(List<String> id) throws IOException, ApiException {
    return  getAnalyticsConversationsDetails(createGetAnalyticsConversationsDetailsRequest(id));
  }

  /**
   * Gets multiple conversations by id
   * 
   * @param id Comma-separated conversation ids (optional)
   * @return AnalyticsConversationWithoutAttributesMultiGetResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> getAnalyticsConversationsDetailsWithHttpInfo(List<String> id) throws IOException {
    return getAnalyticsConversationsDetails(createGetAnalyticsConversationsDetailsRequest(id).withHttpInfo());
  }

  private GetAnalyticsConversationsDetailsRequest createGetAnalyticsConversationsDetailsRequest(List<String> id) {
    return GetAnalyticsConversationsDetailsRequest.builder()
            .withId(id)
    
            .build();
  }

  /**
   * Gets multiple conversations by id
   * 
   * @param request The request object
   * @return AnalyticsConversationWithoutAttributesMultiGetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationWithoutAttributesMultiGetResponse getAnalyticsConversationsDetails(GetAnalyticsConversationsDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets multiple conversations by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> getAnalyticsConversationsDetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get status for async query for conversation details
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsConversationsDetailsJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsConversationsDetailsJob(createGetAnalyticsConversationsDetailsJobRequest(jobId));
  }

  /**
   * Get status for async query for conversation details
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsConversationsDetailsJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsConversationsDetailsJob(createGetAnalyticsConversationsDetailsJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsConversationsDetailsJobRequest createGetAnalyticsConversationsDetailsJobRequest(String jobId) {
    return GetAnalyticsConversationsDetailsJobRequest.builder()
            .withJobId(jobId)
    
            .build();
  }

  /**
   * Get status for async query for conversation details
   * 
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsConversationsDetailsJob(GetAnalyticsConversationsDetailsJobRequest request) throws IOException, ApiException {
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
   * Get status for async query for conversation details
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsConversationsDetailsJob(ApiRequest<Void> request) throws IOException {
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
   * @return AnalyticsConversationAsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationAsyncQueryResponse getAnalyticsConversationsDetailsJobResults(String jobId, String cursor, Integer pageSize) throws IOException, ApiException {
    return  getAnalyticsConversationsDetailsJobResults(createGetAnalyticsConversationsDetailsJobResultsRequest(jobId, cursor, pageSize));
  }

  /**
   * Fetch a page of results for an async query
   * 
   * @param jobId jobId (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize The desired maximum number of results (optional)
   * @return AnalyticsConversationAsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationAsyncQueryResponse> getAnalyticsConversationsDetailsJobResultsWithHttpInfo(String jobId, String cursor, Integer pageSize) throws IOException {
    return getAnalyticsConversationsDetailsJobResults(createGetAnalyticsConversationsDetailsJobResultsRequest(jobId, cursor, pageSize).withHttpInfo());
  }

  private GetAnalyticsConversationsDetailsJobResultsRequest createGetAnalyticsConversationsDetailsJobResultsRequest(String jobId, String cursor, Integer pageSize) {
    return GetAnalyticsConversationsDetailsJobResultsRequest.builder()
            .withJobId(jobId)
    
            .withCursor(cursor)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Fetch a page of results for an async query
   * 
   * @param request The request object
   * @return AnalyticsConversationAsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationAsyncQueryResponse getAnalyticsConversationsDetailsJobResults(GetAnalyticsConversationsDetailsJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversationAsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversationAsyncQueryResponse>() {});
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
  public ApiResponse<AnalyticsConversationAsyncQueryResponse> getAnalyticsConversationsDetailsJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversationAsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationAsyncQueryResponse> response = (ApiResponse<AnalyticsConversationAsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationAsyncQueryResponse> response = (ApiResponse<AnalyticsConversationAsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
  public DataAvailabilityResponse getAnalyticsConversationsDetailsJobsAvailability() throws IOException, ApiException {
    return  getAnalyticsConversationsDetailsJobsAvailability(createGetAnalyticsConversationsDetailsJobsAvailabilityRequest());
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @return DataAvailabilityResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataAvailabilityResponse> getAnalyticsConversationsDetailsJobsAvailabilityWithHttpInfo() throws IOException {
    return getAnalyticsConversationsDetailsJobsAvailability(createGetAnalyticsConversationsDetailsJobsAvailabilityRequest().withHttpInfo());
  }

  private GetAnalyticsConversationsDetailsJobsAvailabilityRequest createGetAnalyticsConversationsDetailsJobsAvailabilityRequest() {
    return GetAnalyticsConversationsDetailsJobsAvailabilityRequest.builder()
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
  public DataAvailabilityResponse getAnalyticsConversationsDetailsJobsAvailability(GetAnalyticsConversationsDetailsJobsAvailabilityRequest request) throws IOException, ApiException {
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
  public ApiResponse<DataAvailabilityResponse> getAnalyticsConversationsDetailsJobsAvailability(ApiRequest<Void> request) throws IOException {
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
   * Fetch info on a secure session
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param secureSessionId secure IVR session ID (required)
   * @return SecureSession
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SecureSession getConversationParticipantSecureivrsession(String conversationId, String participantId, String secureSessionId) throws IOException, ApiException {
    return  getConversationParticipantSecureivrsession(createGetConversationParticipantSecureivrsessionRequest(conversationId, participantId, secureSessionId));
  }

  /**
   * Fetch info on a secure session
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param secureSessionId secure IVR session ID (required)
   * @return SecureSession
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SecureSession> getConversationParticipantSecureivrsessionWithHttpInfo(String conversationId, String participantId, String secureSessionId) throws IOException {
    return getConversationParticipantSecureivrsession(createGetConversationParticipantSecureivrsessionRequest(conversationId, participantId, secureSessionId).withHttpInfo());
  }

  private GetConversationParticipantSecureivrsessionRequest createGetConversationParticipantSecureivrsessionRequest(String conversationId, String participantId, String secureSessionId) {
    return GetConversationParticipantSecureivrsessionRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .withSecureSessionId(secureSessionId)
    
            .build();
  }

  /**
   * Fetch info on a secure session
   * 
   * @param request The request object
   * @return SecureSession
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SecureSession getConversationParticipantSecureivrsession(GetConversationParticipantSecureivrsessionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SecureSession> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SecureSession>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch info on a secure session
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SecureSession> getConversationParticipantSecureivrsession(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SecureSession>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SecureSession> response = (ApiResponse<SecureSession>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SecureSession> response = (ApiResponse<SecureSession>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of secure sessions for this participant.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @return SecureSessionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SecureSessionEntityListing getConversationParticipantSecureivrsessions(String conversationId, String participantId) throws IOException, ApiException {
    return  getConversationParticipantSecureivrsessions(createGetConversationParticipantSecureivrsessionsRequest(conversationId, participantId));
  }

  /**
   * Get a list of secure sessions for this participant.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @return SecureSessionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SecureSessionEntityListing> getConversationParticipantSecureivrsessionsWithHttpInfo(String conversationId, String participantId) throws IOException {
    return getConversationParticipantSecureivrsessions(createGetConversationParticipantSecureivrsessionsRequest(conversationId, participantId).withHttpInfo());
  }

  private GetConversationParticipantSecureivrsessionsRequest createGetConversationParticipantSecureivrsessionsRequest(String conversationId, String participantId) {
    return GetConversationParticipantSecureivrsessionsRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .build();
  }

  /**
   * Get a list of secure sessions for this participant.
   * 
   * @param request The request object
   * @return SecureSessionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SecureSessionEntityListing getConversationParticipantSecureivrsessions(GetConversationParticipantSecureivrsessionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SecureSessionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SecureSessionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of secure sessions for this participant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SecureSessionEntityListing> getConversationParticipantSecureivrsessions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SecureSessionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SecureSessionEntityListing> response = (ApiResponse<SecureSessionEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SecureSessionEntityListing> response = (ApiResponse<SecureSessionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationParticipantWrapup(String conversationId, String participantId, Boolean provisional) throws IOException, ApiException {
    return  getConversationParticipantWrapup(createGetConversationParticipantWrapupRequest(conversationId, participantId, provisional));
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssignedWrapupCode> getConversationParticipantWrapupWithHttpInfo(String conversationId, String participantId, Boolean provisional) throws IOException {
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
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationParticipantWrapup(GetConversationParticipantWrapupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssignedWrapupCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssignedWrapupCode>() {});
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
  public ApiResponse<AssignedWrapupCode> getConversationParticipantWrapup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssignedWrapupCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get active conversations for the logged in user
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
   * Get active conversations for the logged in user
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
   * Get active conversations for the logged in user
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
   * Get active conversations for the logged in user
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
   * @param conversationId conversationId (required)
   * @return CallConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallConversation getConversationsCall(String conversationId) throws IOException, ApiException {
    return  getConversationsCall(createGetConversationsCallRequest(conversationId));
  }

  /**
   * Get call conversation
   * 
   * @param conversationId conversationId (required)
   * @return CallConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallConversation> getConversationsCallWithHttpInfo(String conversationId) throws IOException {
    return getConversationsCall(createGetConversationsCallRequest(conversationId).withHttpInfo());
  }

  private GetConversationsCallRequest createGetConversationsCallRequest(String conversationId) {
    return GetConversationsCallRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationsCallParticipantWrapup(String conversationId, String participantId, Boolean provisional) throws IOException, ApiException {
    return  getConversationsCallParticipantWrapup(createGetConversationsCallParticipantWrapupRequest(conversationId, participantId, provisional));
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssignedWrapupCode> getConversationsCallParticipantWrapupWithHttpInfo(String conversationId, String participantId, Boolean provisional) throws IOException {
    return getConversationsCallParticipantWrapup(createGetConversationsCallParticipantWrapupRequest(conversationId, participantId, provisional).withHttpInfo());
  }

  private GetConversationsCallParticipantWrapupRequest createGetConversationsCallParticipantWrapupRequest(String conversationId, String participantId, Boolean provisional) {
    return GetConversationsCallParticipantWrapupRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .withProvisional(provisional)
    
            .build();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationsCallParticipantWrapup(GetConversationsCallParticipantWrapupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssignedWrapupCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssignedWrapupCode>() {});
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
  public ApiResponse<AssignedWrapupCode> getConversationsCallParticipantWrapup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssignedWrapupCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsCallParticipantWrapupcodes(String conversationId, String participantId) throws IOException, ApiException {
    return  getConversationsCallParticipantWrapupcodes(createGetConversationsCallParticipantWrapupcodesRequest(conversationId, participantId));
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsCallParticipantWrapupcodesWithHttpInfo(String conversationId, String participantId) throws IOException {
    return getConversationsCallParticipantWrapupcodes(createGetConversationsCallParticipantWrapupcodesRequest(conversationId, participantId).withHttpInfo());
  }

  private GetConversationsCallParticipantWrapupcodesRequest createGetConversationsCallParticipantWrapupcodesRequest(String conversationId, String participantId) {
    return GetConversationsCallParticipantWrapupcodesRequest.builder()
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
   * @param conversationId conversationId (required)
   * @return CallbackConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallbackConversation getConversationsCallback(String conversationId) throws IOException, ApiException {
    return  getConversationsCallback(createGetConversationsCallbackRequest(conversationId));
  }

  /**
   * Get callback conversation
   * 
   * @param conversationId conversationId (required)
   * @return CallbackConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallbackConversation> getConversationsCallbackWithHttpInfo(String conversationId) throws IOException {
    return getConversationsCallback(createGetConversationsCallbackRequest(conversationId).withHttpInfo());
  }

  private GetConversationsCallbackRequest createGetConversationsCallbackRequest(String conversationId) {
    return GetConversationsCallbackRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationsCallbackParticipantWrapup(String conversationId, String participantId, Boolean provisional) throws IOException, ApiException {
    return  getConversationsCallbackParticipantWrapup(createGetConversationsCallbackParticipantWrapupRequest(conversationId, participantId, provisional));
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssignedWrapupCode> getConversationsCallbackParticipantWrapupWithHttpInfo(String conversationId, String participantId, Boolean provisional) throws IOException {
    return getConversationsCallbackParticipantWrapup(createGetConversationsCallbackParticipantWrapupRequest(conversationId, participantId, provisional).withHttpInfo());
  }

  private GetConversationsCallbackParticipantWrapupRequest createGetConversationsCallbackParticipantWrapupRequest(String conversationId, String participantId, Boolean provisional) {
    return GetConversationsCallbackParticipantWrapupRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .withProvisional(provisional)
    
            .build();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationsCallbackParticipantWrapup(GetConversationsCallbackParticipantWrapupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssignedWrapupCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssignedWrapupCode>() {});
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
  public ApiResponse<AssignedWrapupCode> getConversationsCallbackParticipantWrapup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssignedWrapupCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsCallbackParticipantWrapupcodes(String conversationId, String participantId) throws IOException, ApiException {
    return  getConversationsCallbackParticipantWrapupcodes(createGetConversationsCallbackParticipantWrapupcodesRequest(conversationId, participantId));
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsCallbackParticipantWrapupcodesWithHttpInfo(String conversationId, String participantId) throws IOException {
    return getConversationsCallbackParticipantWrapupcodes(createGetConversationsCallbackParticipantWrapupcodesRequest(conversationId, participantId).withHttpInfo());
  }

  private GetConversationsCallbackParticipantWrapupcodesRequest createGetConversationsCallbackParticipantWrapupcodesRequest(String conversationId, String participantId) {
    return GetConversationsCallbackParticipantWrapupcodesRequest.builder()
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
   * Get active callback conversations for the logged in user
   * 
   * @return CallbackConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallbackConversationEntityListing getConversationsCallbacks() throws IOException, ApiException {
    return  getConversationsCallbacks(createGetConversationsCallbacksRequest());
  }

  /**
   * Get active callback conversations for the logged in user
   * 
   * @return CallbackConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallbackConversationEntityListing> getConversationsCallbacksWithHttpInfo() throws IOException {
    return getConversationsCallbacks(createGetConversationsCallbacksRequest().withHttpInfo());
  }

  private GetConversationsCallbacksRequest createGetConversationsCallbacksRequest() {
    return GetConversationsCallbacksRequest.builder()
            .build();
  }

  /**
   * Get active callback conversations for the logged in user
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
   * Get active callback conversations for the logged in user
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
   * Get active call conversations for the logged in user
   * 
   * @return CallConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallConversationEntityListing getConversationsCalls() throws IOException, ApiException {
    return  getConversationsCalls(createGetConversationsCallsRequest());
  }

  /**
   * Get active call conversations for the logged in user
   * 
   * @return CallConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallConversationEntityListing> getConversationsCallsWithHttpInfo() throws IOException {
    return getConversationsCalls(createGetConversationsCallsRequest().withHttpInfo());
  }

  private GetConversationsCallsRequest createGetConversationsCallsRequest() {
    return GetConversationsCallsRequest.builder()
            .build();
  }

  /**
   * Get active call conversations for the logged in user
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
   * Get active call conversations for the logged in user
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
   * @param pageSize Page size, maximum 50 (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param interval Interval string; format is ISO-8601. Separate start and end times with forward slash &#39;/&#39; (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @return CallHistoryConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallHistoryConversationEntityListing getConversationsCallsHistory(Integer pageSize, Integer pageNumber, String interval, List<String> expand) throws IOException, ApiException {
    return  getConversationsCallsHistory(createGetConversationsCallsHistoryRequest(pageSize, pageNumber, interval, expand));
  }

  /**
   * Get call history
   * 
   * @param pageSize Page size, maximum 50 (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param interval Interval string; format is ISO-8601. Separate start and end times with forward slash &#39;/&#39; (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @return CallHistoryConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallHistoryConversationEntityListing> getConversationsCallsHistoryWithHttpInfo(Integer pageSize, Integer pageNumber, String interval, List<String> expand) throws IOException {
    return getConversationsCallsHistory(createGetConversationsCallsHistoryRequest(pageSize, pageNumber, interval, expand).withHttpInfo());
  }

  private GetConversationsCallsHistoryRequest createGetConversationsCallsHistoryRequest(Integer pageSize, Integer pageNumber, String interval, List<String> expand) {
    return GetConversationsCallsHistoryRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withInterval(interval)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get call history
   * 
   * @param request The request object
   * @return CallHistoryConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallHistoryConversationEntityListing getConversationsCallsHistory(GetConversationsCallsHistoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallHistoryConversationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallHistoryConversationEntityListing>() {});
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
  public ApiResponse<CallHistoryConversationEntityListing> getConversationsCallsHistory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallHistoryConversationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallHistoryConversationEntityListing> response = (ApiResponse<CallHistoryConversationEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CallHistoryConversationEntityListing> response = (ApiResponse<CallHistoryConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
    return GetConversationsCallsMaximumconferencepartiesRequest.builder()
            .build();
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
   * @param conversationId conversationId (required)
   * @return ChatConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatConversation getConversationsChat(String conversationId) throws IOException, ApiException {
    return  getConversationsChat(createGetConversationsChatRequest(conversationId));
  }

  /**
   * Get chat conversation
   * 
   * @param conversationId conversationId (required)
   * @return ChatConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatConversation> getConversationsChatWithHttpInfo(String conversationId) throws IOException {
    return getConversationsChat(createGetConversationsChatRequest(conversationId).withHttpInfo());
  }

  private GetConversationsChatRequest createGetConversationsChatRequest(String conversationId) {
    return GetConversationsChatRequest.builder()
            .withConversationId(conversationId)
    
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
   * Get a web chat conversation message
   * The current user must be involved with the conversation to get its messages.
   * @param conversationId conversationId (required)
   * @param messageId messageId (required)
   * @return WebChatMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMessage getConversationsChatMessage(String conversationId, String messageId) throws IOException, ApiException {
    return  getConversationsChatMessage(createGetConversationsChatMessageRequest(conversationId, messageId));
  }

  /**
   * Get a web chat conversation message
   * The current user must be involved with the conversation to get its messages.
   * @param conversationId conversationId (required)
   * @param messageId messageId (required)
   * @return WebChatMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMessage> getConversationsChatMessageWithHttpInfo(String conversationId, String messageId) throws IOException {
    return getConversationsChatMessage(createGetConversationsChatMessageRequest(conversationId, messageId).withHttpInfo());
  }

  private GetConversationsChatMessageRequest createGetConversationsChatMessageRequest(String conversationId, String messageId) {
    return GetConversationsChatMessageRequest.builder()
            .withConversationId(conversationId)
    
            .withMessageId(messageId)
    
            .build();
  }

  /**
   * Get a web chat conversation message
   * The current user must be involved with the conversation to get its messages.
   * @param request The request object
   * @return WebChatMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMessage getConversationsChatMessage(GetConversationsChatMessageRequest request) throws IOException, ApiException {
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
   * The current user must be involved with the conversation to get its messages.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMessage> getConversationsChatMessage(ApiRequest<Void> request) throws IOException {
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
   * The current user must be involved with the conversation to get its messages.
   * @param conversationId conversationId (required)
   * @param after If specified, get the messages chronologically after the id of this message (optional)
   * @param before If specified, get the messages chronologically before the id of this message (optional)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param maxResults Limit the returned number of messages, up to a maximum of 100 (optional, default to 100)
   * @return WebChatMessageEntityList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMessageEntityList getConversationsChatMessages(String conversationId, String after, String before, String sortOrder, Integer maxResults) throws IOException, ApiException {
    return  getConversationsChatMessages(createGetConversationsChatMessagesRequest(conversationId, after, before, sortOrder, maxResults));
  }

  /**
   * Get the messages of a chat conversation.
   * The current user must be involved with the conversation to get its messages.
   * @param conversationId conversationId (required)
   * @param after If specified, get the messages chronologically after the id of this message (optional)
   * @param before If specified, get the messages chronologically before the id of this message (optional)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param maxResults Limit the returned number of messages, up to a maximum of 100 (optional, default to 100)
   * @return WebChatMessageEntityList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMessageEntityList> getConversationsChatMessagesWithHttpInfo(String conversationId, String after, String before, String sortOrder, Integer maxResults) throws IOException {
    return getConversationsChatMessages(createGetConversationsChatMessagesRequest(conversationId, after, before, sortOrder, maxResults).withHttpInfo());
  }

  private GetConversationsChatMessagesRequest createGetConversationsChatMessagesRequest(String conversationId, String after, String before, String sortOrder, Integer maxResults) {
    return GetConversationsChatMessagesRequest.builder()
            .withConversationId(conversationId)
    
            .withAfter(after)
    
            .withBefore(before)
    
            .withSortOrder(sortOrder)
    
            .withMaxResults(maxResults)
    
            .build();
  }

  /**
   * Get the messages of a chat conversation.
   * The current user must be involved with the conversation to get its messages.
   * @param request The request object
   * @return WebChatMessageEntityList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMessageEntityList getConversationsChatMessages(GetConversationsChatMessagesRequest request) throws IOException, ApiException {
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
   * The current user must be involved with the conversation to get its messages.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMessageEntityList> getConversationsChatMessages(ApiRequest<Void> request) throws IOException {
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
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationsChatParticipantWrapup(String conversationId, String participantId, Boolean provisional) throws IOException, ApiException {
    return  getConversationsChatParticipantWrapup(createGetConversationsChatParticipantWrapupRequest(conversationId, participantId, provisional));
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssignedWrapupCode> getConversationsChatParticipantWrapupWithHttpInfo(String conversationId, String participantId, Boolean provisional) throws IOException {
    return getConversationsChatParticipantWrapup(createGetConversationsChatParticipantWrapupRequest(conversationId, participantId, provisional).withHttpInfo());
  }

  private GetConversationsChatParticipantWrapupRequest createGetConversationsChatParticipantWrapupRequest(String conversationId, String participantId, Boolean provisional) {
    return GetConversationsChatParticipantWrapupRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .withProvisional(provisional)
    
            .build();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationsChatParticipantWrapup(GetConversationsChatParticipantWrapupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssignedWrapupCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssignedWrapupCode>() {});
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
  public ApiResponse<AssignedWrapupCode> getConversationsChatParticipantWrapup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssignedWrapupCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsChatParticipantWrapupcodes(String conversationId, String participantId) throws IOException, ApiException {
    return  getConversationsChatParticipantWrapupcodes(createGetConversationsChatParticipantWrapupcodesRequest(conversationId, participantId));
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsChatParticipantWrapupcodesWithHttpInfo(String conversationId, String participantId) throws IOException {
    return getConversationsChatParticipantWrapupcodes(createGetConversationsChatParticipantWrapupcodesRequest(conversationId, participantId).withHttpInfo());
  }

  private GetConversationsChatParticipantWrapupcodesRequest createGetConversationsChatParticipantWrapupcodesRequest(String conversationId, String participantId) {
    return GetConversationsChatParticipantWrapupcodesRequest.builder()
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
   * Get active chat conversations for the logged in user
   * 
   * @return ChatConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatConversationEntityListing getConversationsChats() throws IOException, ApiException {
    return  getConversationsChats(createGetConversationsChatsRequest());
  }

  /**
   * Get active chat conversations for the logged in user
   * 
   * @return ChatConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatConversationEntityListing> getConversationsChatsWithHttpInfo() throws IOException {
    return getConversationsChats(createGetConversationsChatsRequest().withHttpInfo());
  }

  private GetConversationsChatsRequest createGetConversationsChatsRequest() {
    return GetConversationsChatsRequest.builder()
            .build();
  }

  /**
   * Get active chat conversations for the logged in user
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
   * Get active chat conversations for the logged in user
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
   * @param conversationId conversationId (required)
   * @return CobrowseConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CobrowseConversation getConversationsCobrowsesession(String conversationId) throws IOException, ApiException {
    return  getConversationsCobrowsesession(createGetConversationsCobrowsesessionRequest(conversationId));
  }

  /**
   * Get cobrowse conversation
   * 
   * @param conversationId conversationId (required)
   * @return CobrowseConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CobrowseConversation> getConversationsCobrowsesessionWithHttpInfo(String conversationId) throws IOException {
    return getConversationsCobrowsesession(createGetConversationsCobrowsesessionRequest(conversationId).withHttpInfo());
  }

  private GetConversationsCobrowsesessionRequest createGetConversationsCobrowsesessionRequest(String conversationId) {
    return GetConversationsCobrowsesessionRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationsCobrowsesessionParticipantWrapup(String conversationId, String participantId, Boolean provisional) throws IOException, ApiException {
    return  getConversationsCobrowsesessionParticipantWrapup(createGetConversationsCobrowsesessionParticipantWrapupRequest(conversationId, participantId, provisional));
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssignedWrapupCode> getConversationsCobrowsesessionParticipantWrapupWithHttpInfo(String conversationId, String participantId, Boolean provisional) throws IOException {
    return getConversationsCobrowsesessionParticipantWrapup(createGetConversationsCobrowsesessionParticipantWrapupRequest(conversationId, participantId, provisional).withHttpInfo());
  }

  private GetConversationsCobrowsesessionParticipantWrapupRequest createGetConversationsCobrowsesessionParticipantWrapupRequest(String conversationId, String participantId, Boolean provisional) {
    return GetConversationsCobrowsesessionParticipantWrapupRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .withProvisional(provisional)
    
            .build();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationsCobrowsesessionParticipantWrapup(GetConversationsCobrowsesessionParticipantWrapupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssignedWrapupCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssignedWrapupCode>() {});
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
  public ApiResponse<AssignedWrapupCode> getConversationsCobrowsesessionParticipantWrapup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssignedWrapupCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsCobrowsesessionParticipantWrapupcodes(String conversationId, String participantId) throws IOException, ApiException {
    return  getConversationsCobrowsesessionParticipantWrapupcodes(createGetConversationsCobrowsesessionParticipantWrapupcodesRequest(conversationId, participantId));
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsCobrowsesessionParticipantWrapupcodesWithHttpInfo(String conversationId, String participantId) throws IOException {
    return getConversationsCobrowsesessionParticipantWrapupcodes(createGetConversationsCobrowsesessionParticipantWrapupcodesRequest(conversationId, participantId).withHttpInfo());
  }

  private GetConversationsCobrowsesessionParticipantWrapupcodesRequest createGetConversationsCobrowsesessionParticipantWrapupcodesRequest(String conversationId, String participantId) {
    return GetConversationsCobrowsesessionParticipantWrapupcodesRequest.builder()
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
   * Get active cobrowse conversations for the logged in user
   * 
   * @return CobrowseConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CobrowseConversationEntityListing getConversationsCobrowsesessions() throws IOException, ApiException {
    return  getConversationsCobrowsesessions(createGetConversationsCobrowsesessionsRequest());
  }

  /**
   * Get active cobrowse conversations for the logged in user
   * 
   * @return CobrowseConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CobrowseConversationEntityListing> getConversationsCobrowsesessionsWithHttpInfo() throws IOException {
    return getConversationsCobrowsesessions(createGetConversationsCobrowsesessionsRequest().withHttpInfo());
  }

  private GetConversationsCobrowsesessionsRequest createGetConversationsCobrowsesessionsRequest() {
    return GetConversationsCobrowsesessionsRequest.builder()
            .build();
  }

  /**
   * Get active cobrowse conversations for the logged in user
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
   * Get active cobrowse conversations for the logged in user
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
   * @param conversationId conversationId (required)
   * @return EmailConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailConversation getConversationsEmail(String conversationId) throws IOException, ApiException {
    return  getConversationsEmail(createGetConversationsEmailRequest(conversationId));
  }

  /**
   * Get email conversation
   * 
   * @param conversationId conversationId (required)
   * @return EmailConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailConversation> getConversationsEmailWithHttpInfo(String conversationId) throws IOException {
    return getConversationsEmail(createGetConversationsEmailRequest(conversationId).withHttpInfo());
  }

  private GetConversationsEmailRequest createGetConversationsEmailRequest(String conversationId) {
    return GetConversationsEmailRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param messageId messageId (required)
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage getConversationsEmailMessage(String conversationId, String messageId) throws IOException, ApiException {
    return  getConversationsEmailMessage(createGetConversationsEmailMessageRequest(conversationId, messageId));
  }

  /**
   * Get conversation message
   * 
   * @param conversationId conversationId (required)
   * @param messageId messageId (required)
   * @return EmailMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> getConversationsEmailMessageWithHttpInfo(String conversationId, String messageId) throws IOException {
    return getConversationsEmailMessage(createGetConversationsEmailMessageRequest(conversationId, messageId).withHttpInfo());
  }

  private GetConversationsEmailMessageRequest createGetConversationsEmailMessageRequest(String conversationId, String messageId) {
    return GetConversationsEmailMessageRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @return EmailMessageListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessageListing getConversationsEmailMessages(String conversationId) throws IOException, ApiException {
    return  getConversationsEmailMessages(createGetConversationsEmailMessagesRequest(conversationId));
  }

  /**
   * Get conversation messages
   * 
   * @param conversationId conversationId (required)
   * @return EmailMessageListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessageListing> getConversationsEmailMessagesWithHttpInfo(String conversationId) throws IOException {
    return getConversationsEmailMessages(createGetConversationsEmailMessagesRequest(conversationId).withHttpInfo());
  }

  private GetConversationsEmailMessagesRequest createGetConversationsEmailMessagesRequest(String conversationId) {
    return GetConversationsEmailMessagesRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage getConversationsEmailMessagesDraft(String conversationId) throws IOException, ApiException {
    return  getConversationsEmailMessagesDraft(createGetConversationsEmailMessagesDraftRequest(conversationId));
  }

  /**
   * Get conversation draft reply
   * 
   * @param conversationId conversationId (required)
   * @return EmailMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> getConversationsEmailMessagesDraftWithHttpInfo(String conversationId) throws IOException {
    return getConversationsEmailMessagesDraft(createGetConversationsEmailMessagesDraftRequest(conversationId).withHttpInfo());
  }

  private GetConversationsEmailMessagesDraftRequest createGetConversationsEmailMessagesDraftRequest(String conversationId) {
    return GetConversationsEmailMessagesDraftRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationsEmailParticipantWrapup(String conversationId, String participantId, Boolean provisional) throws IOException, ApiException {
    return  getConversationsEmailParticipantWrapup(createGetConversationsEmailParticipantWrapupRequest(conversationId, participantId, provisional));
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssignedWrapupCode> getConversationsEmailParticipantWrapupWithHttpInfo(String conversationId, String participantId, Boolean provisional) throws IOException {
    return getConversationsEmailParticipantWrapup(createGetConversationsEmailParticipantWrapupRequest(conversationId, participantId, provisional).withHttpInfo());
  }

  private GetConversationsEmailParticipantWrapupRequest createGetConversationsEmailParticipantWrapupRequest(String conversationId, String participantId, Boolean provisional) {
    return GetConversationsEmailParticipantWrapupRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .withProvisional(provisional)
    
            .build();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationsEmailParticipantWrapup(GetConversationsEmailParticipantWrapupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssignedWrapupCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssignedWrapupCode>() {});
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
  public ApiResponse<AssignedWrapupCode> getConversationsEmailParticipantWrapup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssignedWrapupCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsEmailParticipantWrapupcodes(String conversationId, String participantId) throws IOException, ApiException {
    return  getConversationsEmailParticipantWrapupcodes(createGetConversationsEmailParticipantWrapupcodesRequest(conversationId, participantId));
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsEmailParticipantWrapupcodesWithHttpInfo(String conversationId, String participantId) throws IOException {
    return getConversationsEmailParticipantWrapupcodes(createGetConversationsEmailParticipantWrapupcodesRequest(conversationId, participantId).withHttpInfo());
  }

  private GetConversationsEmailParticipantWrapupcodesRequest createGetConversationsEmailParticipantWrapupcodesRequest(String conversationId, String participantId) {
    return GetConversationsEmailParticipantWrapupcodesRequest.builder()
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
   * Get active email conversations for the logged in user
   * 
   * @return EmailConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailConversationEntityListing getConversationsEmails() throws IOException, ApiException {
    return  getConversationsEmails(createGetConversationsEmailsRequest());
  }

  /**
   * Get active email conversations for the logged in user
   * 
   * @return EmailConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailConversationEntityListing> getConversationsEmailsWithHttpInfo() throws IOException {
    return getConversationsEmails(createGetConversationsEmailsRequest().withHttpInfo());
  }

  private GetConversationsEmailsRequest createGetConversationsEmailsRequest() {
    return GetConversationsEmailsRequest.builder()
            .build();
  }

  /**
   * Get active email conversations for the logged in user
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
   * Get active email conversations for the logged in user
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
   * Get message conversation
   * 
   * @param conversationId conversationId (required)
   * @return MessageConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageConversation getConversationsMessage(String conversationId) throws IOException, ApiException {
    return  getConversationsMessage(createGetConversationsMessageRequest(conversationId));
  }

  /**
   * Get message conversation
   * 
   * @param conversationId conversationId (required)
   * @return MessageConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageConversation> getConversationsMessageWithHttpInfo(String conversationId) throws IOException {
    return getConversationsMessage(createGetConversationsMessageRequest(conversationId).withHttpInfo());
  }

  private GetConversationsMessageRequest createGetConversationsMessageRequest(String conversationId) {
    return GetConversationsMessageRequest.builder()
            .withConversationId(conversationId)
    
            .build();
  }

  /**
   * Get message conversation
   * 
   * @param request The request object
   * @return MessageConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageConversation getConversationsMessage(GetConversationsMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessageConversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessageConversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get message conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageConversation> getConversationsMessage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessageConversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessageConversation> response = (ApiResponse<MessageConversation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessageConversation> response = (ApiResponse<MessageConversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get media
   * See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.
   * @param conversationId conversationId (required)
   * @param communicationId communicationId (required)
   * @param mediaId mediaId (required)
   * @return MessageMediaData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageMediaData getConversationsMessageCommunicationMessagesMediaMediaId(String conversationId, String communicationId, String mediaId) throws IOException, ApiException {
    return  getConversationsMessageCommunicationMessagesMediaMediaId(createGetConversationsMessageCommunicationMessagesMediaMediaIdRequest(conversationId, communicationId, mediaId));
  }

  /**
   * Get media
   * See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.
   * @param conversationId conversationId (required)
   * @param communicationId communicationId (required)
   * @param mediaId mediaId (required)
   * @return MessageMediaData
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageMediaData> getConversationsMessageCommunicationMessagesMediaMediaIdWithHttpInfo(String conversationId, String communicationId, String mediaId) throws IOException {
    return getConversationsMessageCommunicationMessagesMediaMediaId(createGetConversationsMessageCommunicationMessagesMediaMediaIdRequest(conversationId, communicationId, mediaId).withHttpInfo());
  }

  private GetConversationsMessageCommunicationMessagesMediaMediaIdRequest createGetConversationsMessageCommunicationMessagesMediaMediaIdRequest(String conversationId, String communicationId, String mediaId) {
    return GetConversationsMessageCommunicationMessagesMediaMediaIdRequest.builder()
            .withConversationId(conversationId)
    
            .withCommunicationId(communicationId)
    
            .withMediaId(mediaId)
    
            .build();
  }

  /**
   * Get media
   * See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.
   * @param request The request object
   * @return MessageMediaData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageMediaData getConversationsMessageCommunicationMessagesMediaMediaId(GetConversationsMessageCommunicationMessagesMediaMediaIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessageMediaData> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessageMediaData>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get media
   * See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageMediaData> getConversationsMessageCommunicationMessagesMediaMediaId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessageMediaData>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessageMediaData> response = (ApiResponse<MessageMediaData>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessageMediaData> response = (ApiResponse<MessageMediaData>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get message
   * 
   * @param messageId messageId (required)
   * @return MessageData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageData getConversationsMessageDetails(String messageId) throws IOException, ApiException {
    return  getConversationsMessageDetails(createGetConversationsMessageDetailsRequest(messageId));
  }

  /**
   * Get message
   * 
   * @param messageId messageId (required)
   * @return MessageData
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageData> getConversationsMessageDetailsWithHttpInfo(String messageId) throws IOException {
    return getConversationsMessageDetails(createGetConversationsMessageDetailsRequest(messageId).withHttpInfo());
  }

  private GetConversationsMessageDetailsRequest createGetConversationsMessageDetailsRequest(String messageId) {
    return GetConversationsMessageDetailsRequest.builder()
            .withMessageId(messageId)
    
            .build();
  }

  /**
   * Get message
   * 
   * @param request The request object
   * @return MessageData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageData getConversationsMessageDetails(GetConversationsMessageDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessageData> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessageData>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get message
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageData> getConversationsMessageDetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessageData>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessageData> response = (ApiResponse<MessageData>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessageData> response = (ApiResponse<MessageData>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get conversation message
   * 
   * @param conversationId conversationId (required)
   * @param messageId messageId (required)
   * @return MessageData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageData getConversationsMessageMessage(String conversationId, String messageId) throws IOException, ApiException {
    return  getConversationsMessageMessage(createGetConversationsMessageMessageRequest(conversationId, messageId));
  }

  /**
   * Get conversation message
   * 
   * @param conversationId conversationId (required)
   * @param messageId messageId (required)
   * @return MessageData
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageData> getConversationsMessageMessageWithHttpInfo(String conversationId, String messageId) throws IOException {
    return getConversationsMessageMessage(createGetConversationsMessageMessageRequest(conversationId, messageId).withHttpInfo());
  }

  private GetConversationsMessageMessageRequest createGetConversationsMessageMessageRequest(String conversationId, String messageId) {
    return GetConversationsMessageMessageRequest.builder()
            .withConversationId(conversationId)
    
            .withMessageId(messageId)
    
            .build();
  }

  /**
   * Get conversation message
   * 
   * @param request The request object
   * @return MessageData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageData getConversationsMessageMessage(GetConversationsMessageMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessageData> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessageData>() {});
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
  public ApiResponse<MessageData> getConversationsMessageMessage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessageData>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessageData> response = (ApiResponse<MessageData>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessageData> response = (ApiResponse<MessageData>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationsMessageParticipantWrapup(String conversationId, String participantId, Boolean provisional) throws IOException, ApiException {
    return  getConversationsMessageParticipantWrapup(createGetConversationsMessageParticipantWrapupRequest(conversationId, participantId, provisional));
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return AssignedWrapupCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssignedWrapupCode> getConversationsMessageParticipantWrapupWithHttpInfo(String conversationId, String participantId, Boolean provisional) throws IOException {
    return getConversationsMessageParticipantWrapup(createGetConversationsMessageParticipantWrapupRequest(conversationId, participantId, provisional).withHttpInfo());
  }

  private GetConversationsMessageParticipantWrapupRequest createGetConversationsMessageParticipantWrapupRequest(String conversationId, String participantId, Boolean provisional) {
    return GetConversationsMessageParticipantWrapupRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .withProvisional(provisional)
    
            .build();
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request The request object
   * @return AssignedWrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignedWrapupCode getConversationsMessageParticipantWrapup(GetConversationsMessageParticipantWrapupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssignedWrapupCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssignedWrapupCode>() {});
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
  public ApiResponse<AssignedWrapupCode> getConversationsMessageParticipantWrapup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssignedWrapupCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AssignedWrapupCode> response = (ApiResponse<AssignedWrapupCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId  conversationId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> getConversationsMessageParticipantWrapupcodes(String conversationId, String participantId) throws IOException, ApiException {
    return  getConversationsMessageParticipantWrapupcodes(createGetConversationsMessageParticipantWrapupcodesRequest(conversationId, participantId));
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId  conversationId (required)
   * @param participantId participantId (required)
   * @return List<WrapupCode>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> getConversationsMessageParticipantWrapupcodesWithHttpInfo(String conversationId, String participantId) throws IOException {
    return getConversationsMessageParticipantWrapupcodes(createGetConversationsMessageParticipantWrapupcodesRequest(conversationId, participantId).withHttpInfo());
  }

  private GetConversationsMessageParticipantWrapupcodesRequest createGetConversationsMessageParticipantWrapupcodesRequest(String conversationId, String participantId) {
    return GetConversationsMessageParticipantWrapupcodesRequest.builder()
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
  public List<WrapupCode> getConversationsMessageParticipantWrapupcodes(GetConversationsMessageParticipantWrapupcodesRequest request) throws IOException, ApiException {
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
  public ApiResponse<List<WrapupCode>> getConversationsMessageParticipantWrapupcodes(ApiRequest<Void> request) throws IOException {
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
   * Get active message conversations for the logged in user
   * 
   * @return MessageConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageConversationEntityListing getConversationsMessages() throws IOException, ApiException {
    return  getConversationsMessages(createGetConversationsMessagesRequest());
  }

  /**
   * Get active message conversations for the logged in user
   * 
   * @return MessageConversationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageConversationEntityListing> getConversationsMessagesWithHttpInfo() throws IOException {
    return getConversationsMessages(createGetConversationsMessagesRequest().withHttpInfo());
  }

  private GetConversationsMessagesRequest createGetConversationsMessagesRequest() {
    return GetConversationsMessagesRequest.builder()
            .build();
  }

  /**
   * Get active message conversations for the logged in user
   * 
   * @param request The request object
   * @return MessageConversationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageConversationEntityListing getConversationsMessages(GetConversationsMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessageConversationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessageConversationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get active message conversations for the logged in user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageConversationEntityListing> getConversationsMessages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessageConversationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessageConversationEntityListing> response = (ApiResponse<MessageConversationEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessageConversationEntityListing> response = (ApiResponse<MessageConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Genesys Facebook App Id
   * 
   * @return FacebookAppCredentials
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookAppCredentials getConversationsMessagingFacebookApp() throws IOException, ApiException {
    return  getConversationsMessagingFacebookApp(createGetConversationsMessagingFacebookAppRequest());
  }

  /**
   * Get Genesys Facebook App Id
   * 
   * @return FacebookAppCredentials
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookAppCredentials> getConversationsMessagingFacebookAppWithHttpInfo() throws IOException {
    return getConversationsMessagingFacebookApp(createGetConversationsMessagingFacebookAppRequest().withHttpInfo());
  }

  private GetConversationsMessagingFacebookAppRequest createGetConversationsMessagingFacebookAppRequest() {
    return GetConversationsMessagingFacebookAppRequest.builder()
            .build();
  }

  /**
   * Get Genesys Facebook App Id
   * 
   * @param request The request object
   * @return FacebookAppCredentials
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookAppCredentials getConversationsMessagingFacebookApp(GetConversationsMessagingFacebookAppRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookAppCredentials> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookAppCredentials>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Genesys Facebook App Id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookAppCredentials> getConversationsMessagingFacebookApp(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookAppCredentials>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookAppCredentials> response = (ApiResponse<FacebookAppCredentials>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookAppCredentials> response = (ApiResponse<FacebookAppCredentials>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand instructions for the return value. (optional)
   * @param supportedContentId Filter integrations returned based on the supported content ID (optional)
   * @return MessagingIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingIntegrationEntityListing getConversationsMessagingIntegrations(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) throws IOException, ApiException {
    return  getConversationsMessagingIntegrations(createGetConversationsMessagingIntegrationsRequest(pageSize, pageNumber, expand, supportedContentId));
  }

  /**
   * Get a list of Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand instructions for the return value. (optional)
   * @param supportedContentId Filter integrations returned based on the supported content ID (optional)
   * @return MessagingIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingIntegrationEntityListing> getConversationsMessagingIntegrationsWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) throws IOException {
    return getConversationsMessagingIntegrations(createGetConversationsMessagingIntegrationsRequest(pageSize, pageNumber, expand, supportedContentId).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsRequest createGetConversationsMessagingIntegrationsRequest(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) {
    return GetConversationsMessagingIntegrationsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withExpand(expand)
    
            .withSupportedContentId(supportedContentId)
    
            .build();
  }

  /**
   * Get a list of Integrations
   * 
   * @param request The request object
   * @return MessagingIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingIntegrationEntityListing getConversationsMessagingIntegrations(GetConversationsMessagingIntegrationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingIntegrationEntityListing> getConversationsMessagingIntegrations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingIntegrationEntityListing> response = (ApiResponse<MessagingIntegrationEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingIntegrationEntityListing> response = (ApiResponse<MessagingIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Facebook Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand instructions for the return value. (optional)
   * @param supportedContentId Filter integrations returned based on the supported content ID (optional)
   * @return FacebookIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegrationEntityListing getConversationsMessagingIntegrationsFacebook(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsFacebook(createGetConversationsMessagingIntegrationsFacebookRequest(pageSize, pageNumber, expand, supportedContentId));
  }

  /**
   * Get a list of Facebook Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand instructions for the return value. (optional)
   * @param supportedContentId Filter integrations returned based on the supported content ID (optional)
   * @return FacebookIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegrationEntityListing> getConversationsMessagingIntegrationsFacebookWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) throws IOException {
    return getConversationsMessagingIntegrationsFacebook(createGetConversationsMessagingIntegrationsFacebookRequest(pageSize, pageNumber, expand, supportedContentId).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsFacebookRequest createGetConversationsMessagingIntegrationsFacebookRequest(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) {
    return GetConversationsMessagingIntegrationsFacebookRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withExpand(expand)
    
            .withSupportedContentId(supportedContentId)
    
            .build();
  }

  /**
   * Get a list of Facebook Integrations
   * 
   * @param request The request object
   * @return FacebookIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegrationEntityListing getConversationsMessagingIntegrationsFacebook(GetConversationsMessagingIntegrationsFacebookRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Facebook Integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegrationEntityListing> getConversationsMessagingIntegrationsFacebook(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegrationEntityListing> response = (ApiResponse<FacebookIntegrationEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegrationEntityListing> response = (ApiResponse<FacebookIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration getConversationsMessagingIntegrationsFacebookIntegrationId(String integrationId, String expand) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsFacebookIntegrationId(createGetConversationsMessagingIntegrationsFacebookIntegrationIdRequest(integrationId, expand));
  }

  /**
   * Get a Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return FacebookIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> getConversationsMessagingIntegrationsFacebookIntegrationIdWithHttpInfo(String integrationId, String expand) throws IOException {
    return getConversationsMessagingIntegrationsFacebookIntegrationId(createGetConversationsMessagingIntegrationsFacebookIntegrationIdRequest(integrationId, expand).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsFacebookIntegrationIdRequest createGetConversationsMessagingIntegrationsFacebookIntegrationIdRequest(String integrationId, String expand) {
    return GetConversationsMessagingIntegrationsFacebookIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a Facebook messaging integration
   * 
   * @param request The request object
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration getConversationsMessagingIntegrationsFacebookIntegrationId(GetConversationsMessagingIntegrationsFacebookIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Facebook messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> getConversationsMessagingIntegrationsFacebookIntegrationId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of LINE messenger Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand instructions for the return value. (optional)
   * @param supportedContentId Filter integrations returned based on the supported content ID (optional)
   * @return LineIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegrationEntityListing getConversationsMessagingIntegrationsLine(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsLine(createGetConversationsMessagingIntegrationsLineRequest(pageSize, pageNumber, expand, supportedContentId));
  }

  /**
   * Get a list of LINE messenger Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand instructions for the return value. (optional)
   * @param supportedContentId Filter integrations returned based on the supported content ID (optional)
   * @return LineIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegrationEntityListing> getConversationsMessagingIntegrationsLineWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) throws IOException {
    return getConversationsMessagingIntegrationsLine(createGetConversationsMessagingIntegrationsLineRequest(pageSize, pageNumber, expand, supportedContentId).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsLineRequest createGetConversationsMessagingIntegrationsLineRequest(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) {
    return GetConversationsMessagingIntegrationsLineRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withExpand(expand)
    
            .withSupportedContentId(supportedContentId)
    
            .build();
  }

  /**
   * Get a list of LINE messenger Integrations
   * 
   * @param request The request object
   * @return LineIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegrationEntityListing getConversationsMessagingIntegrationsLine(GetConversationsMessagingIntegrationsLineRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of LINE messenger Integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegrationEntityListing> getConversationsMessagingIntegrationsLine(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegrationEntityListing> response = (ApiResponse<LineIntegrationEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegrationEntityListing> response = (ApiResponse<LineIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration getConversationsMessagingIntegrationsLineIntegrationId(String integrationId, String expand) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsLineIntegrationId(createGetConversationsMessagingIntegrationsLineIntegrationIdRequest(integrationId, expand));
  }

  /**
   * Get a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return LineIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> getConversationsMessagingIntegrationsLineIntegrationIdWithHttpInfo(String integrationId, String expand) throws IOException {
    return getConversationsMessagingIntegrationsLineIntegrationId(createGetConversationsMessagingIntegrationsLineIntegrationIdRequest(integrationId, expand).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsLineIntegrationIdRequest createGetConversationsMessagingIntegrationsLineIntegrationIdRequest(String integrationId, String expand) {
    return GetConversationsMessagingIntegrationsLineIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a LINE messenger integration
   * 
   * @param request The request object
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration getConversationsMessagingIntegrationsLineIntegrationId(GetConversationsMessagingIntegrationsLineIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a LINE messenger integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> getConversationsMessagingIntegrationsLineIntegrationId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Open messaging integrations
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand instructions for the return value. (optional)
   * @param supportedContentId Filter integrations returned based on the supported content ID (optional)
   * @return OpenIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenIntegrationEntityListing getConversationsMessagingIntegrationsOpen(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsOpen(createGetConversationsMessagingIntegrationsOpenRequest(pageSize, pageNumber, expand, supportedContentId));
  }

  /**
   * Get a list of Open messaging integrations
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand instructions for the return value. (optional)
   * @param supportedContentId Filter integrations returned based on the supported content ID (optional)
   * @return OpenIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenIntegrationEntityListing> getConversationsMessagingIntegrationsOpenWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) throws IOException {
    return getConversationsMessagingIntegrationsOpen(createGetConversationsMessagingIntegrationsOpenRequest(pageSize, pageNumber, expand, supportedContentId).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsOpenRequest createGetConversationsMessagingIntegrationsOpenRequest(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) {
    return GetConversationsMessagingIntegrationsOpenRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withExpand(expand)
    
            .withSupportedContentId(supportedContentId)
    
            .build();
  }

  /**
   * Get a list of Open messaging integrations
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param request The request object
   * @return OpenIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenIntegrationEntityListing getConversationsMessagingIntegrationsOpen(GetConversationsMessagingIntegrationsOpenRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OpenIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OpenIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Open messaging integrations
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenIntegrationEntityListing> getConversationsMessagingIntegrationsOpen(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OpenIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OpenIntegrationEntityListing> response = (ApiResponse<OpenIntegrationEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OpenIntegrationEntityListing> response = (ApiResponse<OpenIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param integrationId Integration ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return OpenIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenIntegration getConversationsMessagingIntegrationsOpenIntegrationId(String integrationId, String expand) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsOpenIntegrationId(createGetConversationsMessagingIntegrationsOpenIntegrationIdRequest(integrationId, expand));
  }

  /**
   * Get an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param integrationId Integration ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return OpenIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenIntegration> getConversationsMessagingIntegrationsOpenIntegrationIdWithHttpInfo(String integrationId, String expand) throws IOException {
    return getConversationsMessagingIntegrationsOpenIntegrationId(createGetConversationsMessagingIntegrationsOpenIntegrationIdRequest(integrationId, expand).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsOpenIntegrationIdRequest createGetConversationsMessagingIntegrationsOpenIntegrationIdRequest(String integrationId, String expand) {
    return GetConversationsMessagingIntegrationsOpenIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param request The request object
   * @return OpenIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenIntegration getConversationsMessagingIntegrationsOpenIntegrationId(GetConversationsMessagingIntegrationsOpenIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OpenIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OpenIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenIntegration> getConversationsMessagingIntegrationsOpenIntegrationId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OpenIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OpenIntegration> response = (ApiResponse<OpenIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OpenIntegration> response = (ApiResponse<OpenIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Twitter Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand instructions for the return value. (optional)
   * @param supportedContentId Filter integrations returned based on the supported content ID (optional)
   * @return TwitterIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegrationEntityListing getConversationsMessagingIntegrationsTwitter(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsTwitter(createGetConversationsMessagingIntegrationsTwitterRequest(pageSize, pageNumber, expand, supportedContentId));
  }

  /**
   * Get a list of Twitter Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand instructions for the return value. (optional)
   * @param supportedContentId Filter integrations returned based on the supported content ID (optional)
   * @return TwitterIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegrationEntityListing> getConversationsMessagingIntegrationsTwitterWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) throws IOException {
    return getConversationsMessagingIntegrationsTwitter(createGetConversationsMessagingIntegrationsTwitterRequest(pageSize, pageNumber, expand, supportedContentId).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsTwitterRequest createGetConversationsMessagingIntegrationsTwitterRequest(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) {
    return GetConversationsMessagingIntegrationsTwitterRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withExpand(expand)
    
            .withSupportedContentId(supportedContentId)
    
            .build();
  }

  /**
   * Get a list of Twitter Integrations
   * 
   * @param request The request object
   * @return TwitterIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegrationEntityListing getConversationsMessagingIntegrationsTwitter(GetConversationsMessagingIntegrationsTwitterRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Twitter Integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegrationEntityListing> getConversationsMessagingIntegrationsTwitter(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegrationEntityListing> response = (ApiResponse<TwitterIntegrationEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegrationEntityListing> response = (ApiResponse<TwitterIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration getConversationsMessagingIntegrationsTwitterIntegrationId(String integrationId, String expand) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsTwitterIntegrationId(createGetConversationsMessagingIntegrationsTwitterIntegrationIdRequest(integrationId, expand));
  }

  /**
   * Get a Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return TwitterIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> getConversationsMessagingIntegrationsTwitterIntegrationIdWithHttpInfo(String integrationId, String expand) throws IOException {
    return getConversationsMessagingIntegrationsTwitterIntegrationId(createGetConversationsMessagingIntegrationsTwitterIntegrationIdRequest(integrationId, expand).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsTwitterIntegrationIdRequest createGetConversationsMessagingIntegrationsTwitterIntegrationIdRequest(String integrationId, String expand) {
    return GetConversationsMessagingIntegrationsTwitterIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a Twitter messaging integration
   * 
   * @param request The request object
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration getConversationsMessagingIntegrationsTwitterIntegrationId(GetConversationsMessagingIntegrationsTwitterIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Twitter messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> getConversationsMessagingIntegrationsTwitterIntegrationId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of WhatsApp Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand instructions for the return value. (optional)
   * @param supportedContentId Filter integrations returned based on the supported content ID (optional)
   * @return WhatsAppIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WhatsAppIntegrationEntityListing getConversationsMessagingIntegrationsWhatsapp(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsWhatsapp(createGetConversationsMessagingIntegrationsWhatsappRequest(pageSize, pageNumber, expand, supportedContentId));
  }

  /**
   * Get a list of WhatsApp Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand instructions for the return value. (optional)
   * @param supportedContentId Filter integrations returned based on the supported content ID (optional)
   * @return WhatsAppIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WhatsAppIntegrationEntityListing> getConversationsMessagingIntegrationsWhatsappWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) throws IOException {
    return getConversationsMessagingIntegrationsWhatsapp(createGetConversationsMessagingIntegrationsWhatsappRequest(pageSize, pageNumber, expand, supportedContentId).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsWhatsappRequest createGetConversationsMessagingIntegrationsWhatsappRequest(Integer pageSize, Integer pageNumber, String expand, String supportedContentId) {
    return GetConversationsMessagingIntegrationsWhatsappRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withExpand(expand)
    
            .withSupportedContentId(supportedContentId)
    
            .build();
  }

  /**
   * Get a list of WhatsApp Integrations
   * 
   * @param request The request object
   * @return WhatsAppIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WhatsAppIntegrationEntityListing getConversationsMessagingIntegrationsWhatsapp(GetConversationsMessagingIntegrationsWhatsappRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WhatsAppIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WhatsAppIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of WhatsApp Integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WhatsAppIntegrationEntityListing> getConversationsMessagingIntegrationsWhatsapp(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WhatsAppIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WhatsAppIntegrationEntityListing> response = (ApiResponse<WhatsAppIntegrationEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WhatsAppIntegrationEntityListing> response = (ApiResponse<WhatsAppIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a WhatsApp messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return WhatsAppIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WhatsAppIntegration getConversationsMessagingIntegrationsWhatsappIntegrationId(String integrationId, String expand) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsWhatsappIntegrationId(createGetConversationsMessagingIntegrationsWhatsappIntegrationIdRequest(integrationId, expand));
  }

  /**
   * Get a WhatsApp messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return WhatsAppIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WhatsAppIntegration> getConversationsMessagingIntegrationsWhatsappIntegrationIdWithHttpInfo(String integrationId, String expand) throws IOException {
    return getConversationsMessagingIntegrationsWhatsappIntegrationId(createGetConversationsMessagingIntegrationsWhatsappIntegrationIdRequest(integrationId, expand).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsWhatsappIntegrationIdRequest createGetConversationsMessagingIntegrationsWhatsappIntegrationIdRequest(String integrationId, String expand) {
    return GetConversationsMessagingIntegrationsWhatsappIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a WhatsApp messaging integration
   * 
   * @param request The request object
   * @return WhatsAppIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WhatsAppIntegration getConversationsMessagingIntegrationsWhatsappIntegrationId(GetConversationsMessagingIntegrationsWhatsappIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WhatsAppIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WhatsAppIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a WhatsApp messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WhatsAppIntegration> getConversationsMessagingIntegrationsWhatsappIntegrationId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WhatsAppIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WhatsAppIntegration> response = (ApiResponse<WhatsAppIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WhatsAppIntegration> response = (ApiResponse<WhatsAppIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Messaging Stickers
   * 
   * @param messengerType Messenger Type (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return MessagingStickerEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingStickerEntityListing getConversationsMessagingSticker(String messengerType, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getConversationsMessagingSticker(createGetConversationsMessagingStickerRequest(messengerType, pageSize, pageNumber));
  }

  /**
   * Get a list of Messaging Stickers
   * 
   * @param messengerType Messenger Type (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return MessagingStickerEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingStickerEntityListing> getConversationsMessagingStickerWithHttpInfo(String messengerType, Integer pageSize, Integer pageNumber) throws IOException {
    return getConversationsMessagingSticker(createGetConversationsMessagingStickerRequest(messengerType, pageSize, pageNumber).withHttpInfo());
  }

  private GetConversationsMessagingStickerRequest createGetConversationsMessagingStickerRequest(String messengerType, Integer pageSize, Integer pageNumber) {
    return GetConversationsMessagingStickerRequest.builder()
            .withMessengerType(messengerType)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of Messaging Stickers
   * 
   * @param request The request object
   * @return MessagingStickerEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingStickerEntityListing getConversationsMessagingSticker(GetConversationsMessagingStickerRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingStickerEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingStickerEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Messaging Stickers
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingStickerEntityListing> getConversationsMessagingSticker(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingStickerEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingStickerEntityListing> response = (ApiResponse<MessagingStickerEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingStickerEntityListing> response = (ApiResponse<MessagingStickerEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get conversation threading window timeline for each messaging type
   * Conversation messaging threading timeline is a setting defined for each messenger type in your organization. This setting will dictate whether a new message is added to the most recent existing conversation, or creates a new Conversation. If the existing Conversation is still in a connected state the threading timeline setting will never play a role. After the conversation is disconnected, if an inbound message is received or an outbound message is sent after the setting for threading timeline expires, a new conversation is created.
   * @return ConversationThreadingWindow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationThreadingWindow getConversationsMessagingThreadingtimeline() throws IOException, ApiException {
    return  getConversationsMessagingThreadingtimeline(createGetConversationsMessagingThreadingtimelineRequest());
  }

  /**
   * Get conversation threading window timeline for each messaging type
   * Conversation messaging threading timeline is a setting defined for each messenger type in your organization. This setting will dictate whether a new message is added to the most recent existing conversation, or creates a new Conversation. If the existing Conversation is still in a connected state the threading timeline setting will never play a role. After the conversation is disconnected, if an inbound message is received or an outbound message is sent after the setting for threading timeline expires, a new conversation is created.
   * @return ConversationThreadingWindow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationThreadingWindow> getConversationsMessagingThreadingtimelineWithHttpInfo() throws IOException {
    return getConversationsMessagingThreadingtimeline(createGetConversationsMessagingThreadingtimelineRequest().withHttpInfo());
  }

  private GetConversationsMessagingThreadingtimelineRequest createGetConversationsMessagingThreadingtimelineRequest() {
    return GetConversationsMessagingThreadingtimelineRequest.builder()
            .build();
  }

  /**
   * Get conversation threading window timeline for each messaging type
   * Conversation messaging threading timeline is a setting defined for each messenger type in your organization. This setting will dictate whether a new message is added to the most recent existing conversation, or creates a new Conversation. If the existing Conversation is still in a connected state the threading timeline setting will never play a role. After the conversation is disconnected, if an inbound message is received or an outbound message is sent after the setting for threading timeline expires, a new conversation is created.
   * @param request The request object
   * @return ConversationThreadingWindow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationThreadingWindow getConversationsMessagingThreadingtimeline(GetConversationsMessagingThreadingtimelineRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ConversationThreadingWindow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ConversationThreadingWindow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get conversation threading window timeline for each messaging type
   * Conversation messaging threading timeline is a setting defined for each messenger type in your organization. This setting will dictate whether a new message is added to the most recent existing conversation, or creates a new Conversation. If the existing Conversation is still in a connected state the threading timeline setting will never play a role. After the conversation is disconnected, if an inbound message is received or an outbound message is sent after the setting for threading timeline expires, a new conversation is created.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationThreadingWindow> getConversationsMessagingThreadingtimeline(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ConversationThreadingWindow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationThreadingWindow> response = (ApiResponse<ConversationThreadingWindow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationThreadingWindow> response = (ApiResponse<ConversationThreadingWindow>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsCall(String conversationId, Conversation body) throws IOException, ApiException {
    return  patchConversationsCall(createPatchConversationsCallRequest(conversationId, body));
  }

  /**
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsCallWithHttpInfo(String conversationId, Conversation body) throws IOException {
    return patchConversationsCall(createPatchConversationsCallRequest(conversationId, body).withHttpInfo());
  }

  private PatchConversationsCallRequest createPatchConversationsCallRequest(String conversationId, Conversation body) {
    return PatchConversationsCallRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Participant request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCallParticipant(String conversationId, String participantId, MediaParticipantRequest body) throws IOException, ApiException {
     patchConversationsCallParticipant(createPatchConversationsCallParticipantRequest(conversationId, participantId, body));
  }

  /**
   * Update conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Participant request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCallParticipantWithHttpInfo(String conversationId, String participantId, MediaParticipantRequest body) throws IOException {
    return patchConversationsCallParticipant(createPatchConversationsCallParticipantRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCallParticipantRequest createPatchConversationsCallParticipantRequest(String conversationId, String participantId, MediaParticipantRequest body) {
    return PatchConversationsCallParticipantRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCallParticipantAttributes(String conversationId, String participantId, ParticipantAttributes body) throws IOException, ApiException {
     patchConversationsCallParticipantAttributes(createPatchConversationsCallParticipantAttributesRequest(conversationId, participantId, body));
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCallParticipantAttributesWithHttpInfo(String conversationId, String participantId, ParticipantAttributes body) throws IOException {
    return patchConversationsCallParticipantAttributes(createPatchConversationsCallParticipantAttributesRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCallParticipantAttributesRequest createPatchConversationsCallParticipantAttributesRequest(String conversationId, String participantId, ParticipantAttributes body) {
    return PatchConversationsCallParticipantAttributesRequest.builder()
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsCallParticipantCommunication(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException, ApiException {
    return  patchConversationsCallParticipantCommunication(createPatchConversationsCallParticipantCommunicationRequest(conversationId, participantId, communicationId, body));
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsCallParticipantCommunicationWithHttpInfo(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException {
    return patchConversationsCallParticipantCommunication(createPatchConversationsCallParticipantCommunicationRequest(conversationId, participantId, communicationId, body).withHttpInfo());
  }

  private PatchConversationsCallParticipantCommunicationRequest createPatchConversationsCallParticipantCommunicationRequest(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) {
    return PatchConversationsCallParticipantCommunicationRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body new speak to (required)
   * @return ConsultTransferResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConsultTransferResponse patchConversationsCallParticipantConsult(String conversationId, String participantId, ConsultTransferUpdate body) throws IOException, ApiException {
    return  patchConversationsCallParticipantConsult(createPatchConversationsCallParticipantConsultRequest(conversationId, participantId, body));
  }

  /**
   * Change who can speak
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body new speak to (required)
   * @return ConsultTransferResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConsultTransferResponse> patchConversationsCallParticipantConsultWithHttpInfo(String conversationId, String participantId, ConsultTransferUpdate body) throws IOException {
    return patchConversationsCallParticipantConsult(createPatchConversationsCallParticipantConsultRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCallParticipantConsultRequest createPatchConversationsCallParticipantConsultRequest(String conversationId, String participantId, ConsultTransferUpdate body) {
    return PatchConversationsCallParticipantConsultRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsCallback(String conversationId, Conversation body) throws IOException, ApiException {
    return  patchConversationsCallback(createPatchConversationsCallbackRequest(conversationId, body));
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsCallbackWithHttpInfo(String conversationId, Conversation body) throws IOException {
    return patchConversationsCallback(createPatchConversationsCallbackRequest(conversationId, body).withHttpInfo());
  }

  private PatchConversationsCallbackRequest createPatchConversationsCallbackRequest(String conversationId, Conversation body) {
    return PatchConversationsCallbackRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Participant (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCallbackParticipant(String conversationId, String participantId, MediaParticipantRequest body) throws IOException, ApiException {
     patchConversationsCallbackParticipant(createPatchConversationsCallbackParticipantRequest(conversationId, participantId, body));
  }

  /**
   * Update conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Participant (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCallbackParticipantWithHttpInfo(String conversationId, String participantId, MediaParticipantRequest body) throws IOException {
    return patchConversationsCallbackParticipant(createPatchConversationsCallbackParticipantRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCallbackParticipantRequest createPatchConversationsCallbackParticipantRequest(String conversationId, String participantId, MediaParticipantRequest body) {
    return PatchConversationsCallbackParticipantRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Attributes (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCallbackParticipantAttributes(String conversationId, String participantId, ParticipantAttributes body) throws IOException, ApiException {
     patchConversationsCallbackParticipantAttributes(createPatchConversationsCallbackParticipantAttributesRequest(conversationId, participantId, body));
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Attributes (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCallbackParticipantAttributesWithHttpInfo(String conversationId, String participantId, ParticipantAttributes body) throws IOException {
    return patchConversationsCallbackParticipantAttributes(createPatchConversationsCallbackParticipantAttributesRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCallbackParticipantAttributesRequest createPatchConversationsCallbackParticipantAttributesRequest(String conversationId, String participantId, ParticipantAttributes body) {
    return PatchConversationsCallbackParticipantAttributesRequest.builder()
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsCallbackParticipantCommunication(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException, ApiException {
    return  patchConversationsCallbackParticipantCommunication(createPatchConversationsCallbackParticipantCommunicationRequest(conversationId, participantId, communicationId, body));
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsCallbackParticipantCommunicationWithHttpInfo(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException {
    return patchConversationsCallbackParticipantCommunication(createPatchConversationsCallbackParticipantCommunicationRequest(conversationId, participantId, communicationId, body).withHttpInfo());
  }

  private PatchConversationsCallbackParticipantCommunicationRequest createPatchConversationsCallbackParticipantCommunicationRequest(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) {
    return PatchConversationsCallbackParticipantCommunicationRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsChat(String conversationId, Conversation body) throws IOException, ApiException {
    return  patchConversationsChat(createPatchConversationsChatRequest(conversationId, body));
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsChatWithHttpInfo(String conversationId, Conversation body) throws IOException {
    return patchConversationsChat(createPatchConversationsChatRequest(conversationId, body).withHttpInfo());
  }

  private PatchConversationsChatRequest createPatchConversationsChatRequest(String conversationId, Conversation body) {
    return PatchConversationsChatRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsChatParticipant(String conversationId, String participantId, MediaParticipantRequest body) throws IOException, ApiException {
     patchConversationsChatParticipant(createPatchConversationsChatParticipantRequest(conversationId, participantId, body));
  }

  /**
   * Update conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsChatParticipantWithHttpInfo(String conversationId, String participantId, MediaParticipantRequest body) throws IOException {
    return patchConversationsChatParticipant(createPatchConversationsChatParticipantRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationsChatParticipantRequest createPatchConversationsChatParticipantRequest(String conversationId, String participantId, MediaParticipantRequest body) {
    return PatchConversationsChatParticipantRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsChatParticipantAttributes(String conversationId, String participantId, ParticipantAttributes body) throws IOException, ApiException {
     patchConversationsChatParticipantAttributes(createPatchConversationsChatParticipantAttributesRequest(conversationId, participantId, body));
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsChatParticipantAttributesWithHttpInfo(String conversationId, String participantId, ParticipantAttributes body) throws IOException {
    return patchConversationsChatParticipantAttributes(createPatchConversationsChatParticipantAttributesRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationsChatParticipantAttributesRequest createPatchConversationsChatParticipantAttributesRequest(String conversationId, String participantId, ParticipantAttributes body) {
    return PatchConversationsChatParticipantAttributesRequest.builder()
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsChatParticipantCommunication(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException, ApiException {
    return  patchConversationsChatParticipantCommunication(createPatchConversationsChatParticipantCommunicationRequest(conversationId, participantId, communicationId, body));
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsChatParticipantCommunicationWithHttpInfo(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException {
    return patchConversationsChatParticipantCommunication(createPatchConversationsChatParticipantCommunicationRequest(conversationId, participantId, communicationId, body).withHttpInfo());
  }

  private PatchConversationsChatParticipantCommunicationRequest createPatchConversationsChatParticipantCommunicationRequest(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) {
    return PatchConversationsChatParticipantCommunicationRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsCobrowsesession(String conversationId, Conversation body) throws IOException, ApiException {
    return  patchConversationsCobrowsesession(createPatchConversationsCobrowsesessionRequest(conversationId, body));
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsCobrowsesessionWithHttpInfo(String conversationId, Conversation body) throws IOException {
    return patchConversationsCobrowsesession(createPatchConversationsCobrowsesessionRequest(conversationId, body).withHttpInfo());
  }

  private PatchConversationsCobrowsesessionRequest createPatchConversationsCobrowsesessionRequest(String conversationId, Conversation body) {
    return PatchConversationsCobrowsesessionRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCobrowsesessionParticipant(String conversationId, String participantId, MediaParticipantRequest body) throws IOException, ApiException {
     patchConversationsCobrowsesessionParticipant(createPatchConversationsCobrowsesessionParticipantRequest(conversationId, participantId, body));
  }

  /**
   * Update conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCobrowsesessionParticipantWithHttpInfo(String conversationId, String participantId, MediaParticipantRequest body) throws IOException {
    return patchConversationsCobrowsesessionParticipant(createPatchConversationsCobrowsesessionParticipantRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCobrowsesessionParticipantRequest createPatchConversationsCobrowsesessionParticipantRequest(String conversationId, String participantId, MediaParticipantRequest body) {
    return PatchConversationsCobrowsesessionParticipantRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsCobrowsesessionParticipantAttributes(String conversationId, String participantId, ParticipantAttributes body) throws IOException, ApiException {
     patchConversationsCobrowsesessionParticipantAttributes(createPatchConversationsCobrowsesessionParticipantAttributesRequest(conversationId, participantId, body));
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsCobrowsesessionParticipantAttributesWithHttpInfo(String conversationId, String participantId, ParticipantAttributes body) throws IOException {
    return patchConversationsCobrowsesessionParticipantAttributes(createPatchConversationsCobrowsesessionParticipantAttributesRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationsCobrowsesessionParticipantAttributesRequest createPatchConversationsCobrowsesessionParticipantAttributesRequest(String conversationId, String participantId, ParticipantAttributes body) {
    return PatchConversationsCobrowsesessionParticipantAttributesRequest.builder()
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsCobrowsesessionParticipantCommunication(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException, ApiException {
    return  patchConversationsCobrowsesessionParticipantCommunication(createPatchConversationsCobrowsesessionParticipantCommunicationRequest(conversationId, participantId, communicationId, body));
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsCobrowsesessionParticipantCommunicationWithHttpInfo(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException {
    return patchConversationsCobrowsesessionParticipantCommunication(createPatchConversationsCobrowsesessionParticipantCommunicationRequest(conversationId, participantId, communicationId, body).withHttpInfo());
  }

  private PatchConversationsCobrowsesessionParticipantCommunicationRequest createPatchConversationsCobrowsesessionParticipantCommunicationRequest(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) {
    return PatchConversationsCobrowsesessionParticipantCommunicationRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsEmail(String conversationId, Conversation body) throws IOException, ApiException {
    return  patchConversationsEmail(createPatchConversationsEmailRequest(conversationId, body));
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsEmailWithHttpInfo(String conversationId, Conversation body) throws IOException {
    return patchConversationsEmail(createPatchConversationsEmailRequest(conversationId, body).withHttpInfo());
  }

  private PatchConversationsEmailRequest createPatchConversationsEmailRequest(String conversationId, Conversation body) {
    return PatchConversationsEmailRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsEmailParticipant(String conversationId, String participantId, MediaParticipantRequest body) throws IOException, ApiException {
     patchConversationsEmailParticipant(createPatchConversationsEmailParticipantRequest(conversationId, participantId, body));
  }

  /**
   * Update conversation participant
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsEmailParticipantWithHttpInfo(String conversationId, String participantId, MediaParticipantRequest body) throws IOException {
    return patchConversationsEmailParticipant(createPatchConversationsEmailParticipantRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationsEmailParticipantRequest createPatchConversationsEmailParticipantRequest(String conversationId, String participantId, MediaParticipantRequest body) {
    return PatchConversationsEmailParticipantRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsEmailParticipantAttributes(String conversationId, String participantId, ParticipantAttributes body) throws IOException, ApiException {
     patchConversationsEmailParticipantAttributes(createPatchConversationsEmailParticipantAttributesRequest(conversationId, participantId, body));
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsEmailParticipantAttributesWithHttpInfo(String conversationId, String participantId, ParticipantAttributes body) throws IOException {
    return patchConversationsEmailParticipantAttributes(createPatchConversationsEmailParticipantAttributesRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationsEmailParticipantAttributesRequest createPatchConversationsEmailParticipantAttributesRequest(String conversationId, String participantId, ParticipantAttributes body) {
    return PatchConversationsEmailParticipantAttributesRequest.builder()
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsEmailParticipantCommunication(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException, ApiException {
    return  patchConversationsEmailParticipantCommunication(createPatchConversationsEmailParticipantCommunicationRequest(conversationId, participantId, communicationId, body));
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsEmailParticipantCommunicationWithHttpInfo(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException {
    return patchConversationsEmailParticipantCommunication(createPatchConversationsEmailParticipantCommunicationRequest(conversationId, participantId, communicationId, body).withHttpInfo());
  }

  private PatchConversationsEmailParticipantCommunicationRequest createPatchConversationsEmailParticipantCommunicationRequest(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) {
    return PatchConversationsEmailParticipantCommunicationRequest.builder()
            .withConversationId(conversationId)
    
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
   * Update a conversation by disconnecting all of the participants
   * 
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation patchConversationsMessage(String conversationId, Conversation body) throws IOException, ApiException {
    return  patchConversationsMessage(createPatchConversationsMessageRequest(conversationId, body));
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> patchConversationsMessageWithHttpInfo(String conversationId, Conversation body) throws IOException {
    return patchConversationsMessage(createPatchConversationsMessageRequest(conversationId, body).withHttpInfo());
  }

  private PatchConversationsMessageRequest createPatchConversationsMessageRequest(String conversationId, Conversation body) {
    return PatchConversationsMessageRequest.builder()
            .withConversationId(conversationId)
    
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
  public Conversation patchConversationsMessage(PatchConversationsMessageRequest request) throws IOException, ApiException {
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
  public ApiResponse<Conversation> patchConversationsMessage(ApiRequest<Conversation> request) throws IOException {
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
   * @param conversationId  conversationId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsMessageParticipant(String conversationId, String participantId, MediaParticipantRequest body) throws IOException, ApiException {
     patchConversationsMessageParticipant(createPatchConversationsMessageParticipantRequest(conversationId, participantId, body));
  }

  /**
   * Update conversation participant
   * 
   * @param conversationId  conversationId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsMessageParticipantWithHttpInfo(String conversationId, String participantId, MediaParticipantRequest body) throws IOException {
    return patchConversationsMessageParticipant(createPatchConversationsMessageParticipantRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationsMessageParticipantRequest createPatchConversationsMessageParticipantRequest(String conversationId, String participantId, MediaParticipantRequest body) {
    return PatchConversationsMessageParticipantRequest.builder()
            .withConversationId(conversationId)
    
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
  public void patchConversationsMessageParticipant(PatchConversationsMessageParticipantRequest request) throws IOException, ApiException {
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
  public ApiResponse<Void> patchConversationsMessageParticipant(ApiRequest<MediaParticipantRequest> request) throws IOException {
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
   * @param conversationId  conversationId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchConversationsMessageParticipantAttributes(String conversationId, String participantId, ParticipantAttributes body) throws IOException, ApiException {
     patchConversationsMessageParticipantAttributes(createPatchConversationsMessageParticipantAttributesRequest(conversationId, participantId, body));
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param conversationId  conversationId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchConversationsMessageParticipantAttributesWithHttpInfo(String conversationId, String participantId, ParticipantAttributes body) throws IOException {
    return patchConversationsMessageParticipantAttributes(createPatchConversationsMessageParticipantAttributesRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PatchConversationsMessageParticipantAttributesRequest createPatchConversationsMessageParticipantAttributesRequest(String conversationId, String participantId, ParticipantAttributes body) {
    return PatchConversationsMessageParticipantAttributesRequest.builder()
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
  public void patchConversationsMessageParticipantAttributes(PatchConversationsMessageParticipantAttributesRequest request) throws IOException, ApiException {
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
  public ApiResponse<Void> patchConversationsMessageParticipantAttributes(ApiRequest<ParticipantAttributes> request) throws IOException {
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
   * @param conversationId  conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchConversationsMessageParticipantCommunication(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException, ApiException {
    return  patchConversationsMessageParticipantCommunication(createPatchConversationsMessageParticipantCommunicationRequest(conversationId, participantId, communicationId, body));
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param conversationId  conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchConversationsMessageParticipantCommunicationWithHttpInfo(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) throws IOException {
    return patchConversationsMessageParticipantCommunication(createPatchConversationsMessageParticipantCommunicationRequest(conversationId, participantId, communicationId, body).withHttpInfo());
  }

  private PatchConversationsMessageParticipantCommunicationRequest createPatchConversationsMessageParticipantCommunicationRequest(String conversationId, String participantId, String communicationId, MediaParticipantRequest body) {
    return PatchConversationsMessageParticipantCommunicationRequest.builder()
            .withConversationId(conversationId)
    
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
  public Empty patchConversationsMessageParticipantCommunication(PatchConversationsMessageParticipantCommunicationRequest request) throws IOException, ApiException {
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
  public ApiResponse<Empty> patchConversationsMessageParticipantCommunication(ApiRequest<MediaParticipantRequest> request) throws IOException {
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
   * Update Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @param body FacebookIntegrationUpdateRequest (required)
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration patchConversationsMessagingIntegrationsFacebookIntegrationId(String integrationId, FacebookIntegrationUpdateRequest body) throws IOException, ApiException {
    return  patchConversationsMessagingIntegrationsFacebookIntegrationId(createPatchConversationsMessagingIntegrationsFacebookIntegrationIdRequest(integrationId, body));
  }

  /**
   * Update Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @param body FacebookIntegrationUpdateRequest (required)
   * @return FacebookIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> patchConversationsMessagingIntegrationsFacebookIntegrationIdWithHttpInfo(String integrationId, FacebookIntegrationUpdateRequest body) throws IOException {
    return patchConversationsMessagingIntegrationsFacebookIntegrationId(createPatchConversationsMessagingIntegrationsFacebookIntegrationIdRequest(integrationId, body).withHttpInfo());
  }

  private PatchConversationsMessagingIntegrationsFacebookIntegrationIdRequest createPatchConversationsMessagingIntegrationsFacebookIntegrationIdRequest(String integrationId, FacebookIntegrationUpdateRequest body) {
    return PatchConversationsMessagingIntegrationsFacebookIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update Facebook messaging integration
   * 
   * @param request The request object
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration patchConversationsMessagingIntegrationsFacebookIntegrationId(PatchConversationsMessagingIntegrationsFacebookIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Facebook messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> patchConversationsMessagingIntegrationsFacebookIntegrationId(ApiRequest<FacebookIntegrationUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param integrationId Integration ID (required)
   * @param body OpenIntegrationUpdateRequest (required)
   * @return OpenIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenIntegration patchConversationsMessagingIntegrationsOpenIntegrationId(String integrationId, OpenIntegrationUpdateRequest body) throws IOException, ApiException {
    return  patchConversationsMessagingIntegrationsOpenIntegrationId(createPatchConversationsMessagingIntegrationsOpenIntegrationIdRequest(integrationId, body));
  }

  /**
   * Update an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param integrationId Integration ID (required)
   * @param body OpenIntegrationUpdateRequest (required)
   * @return OpenIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenIntegration> patchConversationsMessagingIntegrationsOpenIntegrationIdWithHttpInfo(String integrationId, OpenIntegrationUpdateRequest body) throws IOException {
    return patchConversationsMessagingIntegrationsOpenIntegrationId(createPatchConversationsMessagingIntegrationsOpenIntegrationIdRequest(integrationId, body).withHttpInfo());
  }

  private PatchConversationsMessagingIntegrationsOpenIntegrationIdRequest createPatchConversationsMessagingIntegrationsOpenIntegrationIdRequest(String integrationId, OpenIntegrationUpdateRequest body) {
    return PatchConversationsMessagingIntegrationsOpenIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param request The request object
   * @return OpenIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenIntegration patchConversationsMessagingIntegrationsOpenIntegrationId(PatchConversationsMessagingIntegrationsOpenIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OpenIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OpenIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenIntegration> patchConversationsMessagingIntegrationsOpenIntegrationId(ApiRequest<OpenIntegrationUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OpenIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OpenIntegration> response = (ApiResponse<OpenIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OpenIntegration> response = (ApiResponse<OpenIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @param body TwitterIntegrationRequest (required)
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration patchConversationsMessagingIntegrationsTwitterIntegrationId(String integrationId, TwitterIntegrationRequest body) throws IOException, ApiException {
    return  patchConversationsMessagingIntegrationsTwitterIntegrationId(createPatchConversationsMessagingIntegrationsTwitterIntegrationIdRequest(integrationId, body));
  }

  /**
   * Update Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @param body TwitterIntegrationRequest (required)
   * @return TwitterIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> patchConversationsMessagingIntegrationsTwitterIntegrationIdWithHttpInfo(String integrationId, TwitterIntegrationRequest body) throws IOException {
    return patchConversationsMessagingIntegrationsTwitterIntegrationId(createPatchConversationsMessagingIntegrationsTwitterIntegrationIdRequest(integrationId, body).withHttpInfo());
  }

  private PatchConversationsMessagingIntegrationsTwitterIntegrationIdRequest createPatchConversationsMessagingIntegrationsTwitterIntegrationIdRequest(String integrationId, TwitterIntegrationRequest body) {
    return PatchConversationsMessagingIntegrationsTwitterIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update Twitter messaging integration
   * 
   * @param request The request object
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration patchConversationsMessagingIntegrationsTwitterIntegrationId(PatchConversationsMessagingIntegrationsTwitterIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Twitter messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> patchConversationsMessagingIntegrationsTwitterIntegrationId(ApiRequest<TwitterIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update or activate a WhatsApp messaging integration.
   * The following steps are required in order to fully activate a Whatsapp Integration: Initially, you will need to get an activation code by sending: an action set to Activate, and an authenticationMethod choosing from Sms or Voice. Finally, once you have been informed of an activation code on selected authenticationMethod, you will need to confirm the code by sending: an action set to Confirm, and the confirmationCode you have received from Whatsapp.
   * @param integrationId Integration ID (required)
   * @param body WhatsAppIntegrationUpdateRequest (required)
   * @return WhatsAppIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WhatsAppIntegration patchConversationsMessagingIntegrationsWhatsappIntegrationId(String integrationId, WhatsAppIntegrationUpdateRequest body) throws IOException, ApiException {
    return  patchConversationsMessagingIntegrationsWhatsappIntegrationId(createPatchConversationsMessagingIntegrationsWhatsappIntegrationIdRequest(integrationId, body));
  }

  /**
   * Update or activate a WhatsApp messaging integration.
   * The following steps are required in order to fully activate a Whatsapp Integration: Initially, you will need to get an activation code by sending: an action set to Activate, and an authenticationMethod choosing from Sms or Voice. Finally, once you have been informed of an activation code on selected authenticationMethod, you will need to confirm the code by sending: an action set to Confirm, and the confirmationCode you have received from Whatsapp.
   * @param integrationId Integration ID (required)
   * @param body WhatsAppIntegrationUpdateRequest (required)
   * @return WhatsAppIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WhatsAppIntegration> patchConversationsMessagingIntegrationsWhatsappIntegrationIdWithHttpInfo(String integrationId, WhatsAppIntegrationUpdateRequest body) throws IOException {
    return patchConversationsMessagingIntegrationsWhatsappIntegrationId(createPatchConversationsMessagingIntegrationsWhatsappIntegrationIdRequest(integrationId, body).withHttpInfo());
  }

  private PatchConversationsMessagingIntegrationsWhatsappIntegrationIdRequest createPatchConversationsMessagingIntegrationsWhatsappIntegrationIdRequest(String integrationId, WhatsAppIntegrationUpdateRequest body) {
    return PatchConversationsMessagingIntegrationsWhatsappIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update or activate a WhatsApp messaging integration.
   * The following steps are required in order to fully activate a Whatsapp Integration: Initially, you will need to get an activation code by sending: an action set to Activate, and an authenticationMethod choosing from Sms or Voice. Finally, once you have been informed of an activation code on selected authenticationMethod, you will need to confirm the code by sending: an action set to Confirm, and the confirmationCode you have received from Whatsapp.
   * @param request The request object
   * @return WhatsAppIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WhatsAppIntegration patchConversationsMessagingIntegrationsWhatsappIntegrationId(PatchConversationsMessagingIntegrationsWhatsappIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WhatsAppIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WhatsAppIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update or activate a WhatsApp messaging integration.
   * The following steps are required in order to fully activate a Whatsapp Integration: Initially, you will need to get an activation code by sending: an action set to Activate, and an authenticationMethod choosing from Sms or Voice. Finally, once you have been informed of an activation code on selected authenticationMethod, you will need to confirm the code by sending: an action set to Confirm, and the confirmationCode you have received from Whatsapp.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WhatsAppIntegration> patchConversationsMessagingIntegrationsWhatsappIntegrationId(ApiRequest<WhatsAppIntegrationUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WhatsAppIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WhatsAppIntegration> response = (ApiResponse<WhatsAppIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WhatsAppIntegration> response = (ApiResponse<WhatsAppIntegration>)(ApiResponse<?>)(new ApiException(exception));
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
   * @return ConversationAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationAggregateQueryResponse postAnalyticsConversationsAggregatesQuery(ConversationAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsConversationsAggregatesQuery(createPostAnalyticsConversationsAggregatesQueryRequest(body));
  }

  /**
   * Query for conversation aggregates
   * 
   * @param body query (required)
   * @return ConversationAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationAggregateQueryResponse> postAnalyticsConversationsAggregatesQueryWithHttpInfo(ConversationAggregationQuery body) throws IOException {
    return postAnalyticsConversationsAggregatesQuery(createPostAnalyticsConversationsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsConversationsAggregatesQueryRequest createPostAnalyticsConversationsAggregatesQueryRequest(ConversationAggregationQuery body) {
    return PostAnalyticsConversationsAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for conversation aggregates
   * 
   * @param request The request object
   * @return ConversationAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationAggregateQueryResponse postAnalyticsConversationsAggregatesQuery(PostAnalyticsConversationsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ConversationAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ConversationAggregateQueryResponse>() {});
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
  public ApiResponse<ConversationAggregateQueryResponse> postAnalyticsConversationsAggregatesQuery(ApiRequest<ConversationAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ConversationAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationAggregateQueryResponse> response = (ApiResponse<ConversationAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationAggregateQueryResponse> response = (ApiResponse<ConversationAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for conversation details asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsConversationsDetailsJobs(AsyncConversationQuery body) throws IOException, ApiException {
    return  postAnalyticsConversationsDetailsJobs(createPostAnalyticsConversationsDetailsJobsRequest(body));
  }

  /**
   * Query for conversation details asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsConversationsDetailsJobsWithHttpInfo(AsyncConversationQuery body) throws IOException {
    return postAnalyticsConversationsDetailsJobs(createPostAnalyticsConversationsDetailsJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsConversationsDetailsJobsRequest createPostAnalyticsConversationsDetailsJobsRequest(AsyncConversationQuery body) {
    return PostAnalyticsConversationsDetailsJobsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for conversation details asynchronously
   * 
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsConversationsDetailsJobs(PostAnalyticsConversationsDetailsJobsRequest request) throws IOException, ApiException {
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
   * Query for conversation details asynchronously
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsConversationsDetailsJobs(ApiRequest<AsyncConversationQuery> request) throws IOException {
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
   * Attempts to manually assign a specified conversation to a specified user.  Ignores bullseye ring, PAR score, skills, and languages.
   * 
   * @param conversationId conversation ID (required)
   * @param body Targeted user (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String postConversationAssign(String conversationId, ConversationUser body) throws IOException, ApiException {
    return  postConversationAssign(createPostConversationAssignRequest(conversationId, body));
  }

  /**
   * Attempts to manually assign a specified conversation to a specified user.  Ignores bullseye ring, PAR score, skills, and languages.
   * 
   * @param conversationId conversation ID (required)
   * @param body Targeted user (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> postConversationAssignWithHttpInfo(String conversationId, ConversationUser body) throws IOException {
    return postConversationAssign(createPostConversationAssignRequest(conversationId, body).withHttpInfo());
  }

  private PostConversationAssignRequest createPostConversationAssignRequest(String conversationId, ConversationUser body) {
    return PostConversationAssignRequest.builder()
            .withConversationId(conversationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Attempts to manually assign a specified conversation to a specified user.  Ignores bullseye ring, PAR score, skills, and languages.
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String postConversationAssign(PostConversationAssignRequest request) throws IOException, ApiException {
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
   * Attempts to manually assign a specified conversation to a specified user.  Ignores bullseye ring, PAR score, skills, and languages.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> postConversationAssign(ApiRequest<ConversationUser> request) throws IOException {
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
   * Performs a full conversation teardown. Issues disconnect requests for any connected media. Applies a system wrap-up code to any participants that are pending wrap-up. This is not intended to be the normal way of ending interactions but is available in the event of problems with the application to allow a resynchronization of state across all components. It is recommended that users submit a support case if they are relying on this endpoint systematically as there is likely something that needs investigation.
   * 
   * @param conversationId conversation ID (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String postConversationDisconnect(String conversationId) throws IOException, ApiException {
    return  postConversationDisconnect(createPostConversationDisconnectRequest(conversationId));
  }

  /**
   * Performs a full conversation teardown. Issues disconnect requests for any connected media. Applies a system wrap-up code to any participants that are pending wrap-up. This is not intended to be the normal way of ending interactions but is available in the event of problems with the application to allow a resynchronization of state across all components. It is recommended that users submit a support case if they are relying on this endpoint systematically as there is likely something that needs investigation.
   * 
   * @param conversationId conversation ID (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> postConversationDisconnectWithHttpInfo(String conversationId) throws IOException {
    return postConversationDisconnect(createPostConversationDisconnectRequest(conversationId).withHttpInfo());
  }

  private PostConversationDisconnectRequest createPostConversationDisconnectRequest(String conversationId) {
    return PostConversationDisconnectRequest.builder()
            .withConversationId(conversationId)
    
            .build();
  }

  /**
   * Performs a full conversation teardown. Issues disconnect requests for any connected media. Applies a system wrap-up code to any participants that are pending wrap-up. This is not intended to be the normal way of ending interactions but is available in the event of problems with the application to allow a resynchronization of state across all components. It is recommended that users submit a support case if they are relying on this endpoint systematically as there is likely something that needs investigation.
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String postConversationDisconnect(PostConversationDisconnectRequest request) throws IOException, ApiException {
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
   * Performs a full conversation teardown. Issues disconnect requests for any connected media. Applies a system wrap-up code to any participants that are pending wrap-up. This is not intended to be the normal way of ending interactions but is available in the event of problems with the application to allow a resynchronization of state across all components. It is recommended that users submit a support case if they are relying on this endpoint systematically as there is likely something that needs investigation.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> postConversationDisconnect(ApiRequest<Void> request) throws IOException {
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
   * Create a new callback for the specified participant on the conversation.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationParticipantCallbacks(String conversationId, String participantId, CreateCallbackOnConversationCommand body) throws IOException, ApiException {
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
  public ApiResponse<Void> postConversationParticipantCallbacksWithHttpInfo(String conversationId, String participantId, CreateCallbackOnConversationCommand body) throws IOException {
    return postConversationParticipantCallbacks(createPostConversationParticipantCallbacksRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PostConversationParticipantCallbacksRequest createPostConversationParticipantCallbacksRequest(String conversationId, String participantId, CreateCallbackOnConversationCommand body) {
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
  public ApiResponse<Void> postConversationParticipantCallbacks(ApiRequest<CreateCallbackOnConversationCommand> request) throws IOException {
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
   * Sends DTMF to the participant
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Digits (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationParticipantDigits(String conversationId, String participantId, Digits body) throws IOException, ApiException {
     postConversationParticipantDigits(createPostConversationParticipantDigitsRequest(conversationId, participantId, body));
  }

  /**
   * Sends DTMF to the participant
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Digits (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationParticipantDigitsWithHttpInfo(String conversationId, String participantId, Digits body) throws IOException {
    return postConversationParticipantDigits(createPostConversationParticipantDigitsRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PostConversationParticipantDigitsRequest createPostConversationParticipantDigitsRequest(String conversationId, String participantId, Digits body) {
    return PostConversationParticipantDigitsRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Sends DTMF to the participant
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationParticipantDigits(PostConversationParticipantDigitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Sends DTMF to the participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationParticipantDigits(ApiRequest<Digits> request) throws IOException {
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
   * Create secure IVR session. Only a participant in the conversation can invoke a secure IVR.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body  (optional)
   * @return SecureSession
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SecureSession postConversationParticipantSecureivrsessions(String conversationId, String participantId, CreateSecureSession body) throws IOException, ApiException {
    return  postConversationParticipantSecureivrsessions(createPostConversationParticipantSecureivrsessionsRequest(conversationId, participantId, body));
  }

  /**
   * Create secure IVR session. Only a participant in the conversation can invoke a secure IVR.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body  (optional)
   * @return SecureSession
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SecureSession> postConversationParticipantSecureivrsessionsWithHttpInfo(String conversationId, String participantId, CreateSecureSession body) throws IOException {
    return postConversationParticipantSecureivrsessions(createPostConversationParticipantSecureivrsessionsRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PostConversationParticipantSecureivrsessionsRequest createPostConversationParticipantSecureivrsessionsRequest(String conversationId, String participantId, CreateSecureSession body) {
    return PostConversationParticipantSecureivrsessionsRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create secure IVR session. Only a participant in the conversation can invoke a secure IVR.
   * 
   * @param request The request object
   * @return SecureSession
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SecureSession postConversationParticipantSecureivrsessions(PostConversationParticipantSecureivrsessionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SecureSession> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SecureSession>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create secure IVR session. Only a participant in the conversation can invoke a secure IVR.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SecureSession> postConversationParticipantSecureivrsessions(ApiRequest<CreateSecureSession> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SecureSession>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SecureSession> response = (ApiResponse<SecureSession>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SecureSession> response = (ApiResponse<SecureSession>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Place a new call as part of a callback conversation.
   * 
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation postConversationsCall(String conversationId, CallCommand body) throws IOException, ApiException {
    return  postConversationsCall(createPostConversationsCallRequest(conversationId, body));
  }

  /**
   * Place a new call as part of a callback conversation.
   * 
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> postConversationsCallWithHttpInfo(String conversationId, CallCommand body) throws IOException {
    return postConversationsCall(createPostConversationsCallRequest(conversationId, body).withHttpInfo());
  }

  private PostConversationsCallRequest createPostConversationsCallRequest(String conversationId, CallCommand body) {
    return PostConversationsCallRequest.builder()
            .withConversationId(conversationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Place a new call as part of a callback conversation.
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
   * Place a new call as part of a callback conversation.
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
   * Listen in on the conversation from the point of view of a given participant while speaking to just the given participant.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCallParticipantCoach(String conversationId, String participantId) throws IOException, ApiException {
     postConversationsCallParticipantCoach(createPostConversationsCallParticipantCoachRequest(conversationId, participantId));
  }

  /**
   * Listen in on the conversation from the point of view of a given participant while speaking to just the given participant.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCallParticipantCoachWithHttpInfo(String conversationId, String participantId) throws IOException {
    return postConversationsCallParticipantCoach(createPostConversationsCallParticipantCoachRequest(conversationId, participantId).withHttpInfo());
  }

  private PostConversationsCallParticipantCoachRequest createPostConversationsCallParticipantCoachRequest(String conversationId, String participantId) {
    return PostConversationsCallParticipantCoachRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .build();
  }

  /**
   * Listen in on the conversation from the point of view of a given participant while speaking to just the given participant.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCallParticipantCoach(PostConversationsCallParticipantCoachRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Listen in on the conversation from the point of view of a given participant while speaking to just the given participant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCallParticipantCoach(ApiRequest<Void> request) throws IOException {
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
   * Initiate and update consult transfer
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Destination address &amp; initial speak to (required)
   * @return ConsultTransferResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConsultTransferResponse postConversationsCallParticipantConsult(String conversationId, String participantId, ConsultTransfer body) throws IOException, ApiException {
    return  postConversationsCallParticipantConsult(createPostConversationsCallParticipantConsultRequest(conversationId, participantId, body));
  }

  /**
   * Initiate and update consult transfer
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Destination address &amp; initial speak to (required)
   * @return ConsultTransferResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConsultTransferResponse> postConversationsCallParticipantConsultWithHttpInfo(String conversationId, String participantId, ConsultTransfer body) throws IOException {
    return postConversationsCallParticipantConsult(createPostConversationsCallParticipantConsultRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PostConversationsCallParticipantConsultRequest createPostConversationsCallParticipantConsultRequest(String conversationId, String participantId, ConsultTransfer body) {
    return PostConversationsCallParticipantConsultRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCallParticipantMonitor(String conversationId, String participantId) throws IOException, ApiException {
     postConversationsCallParticipantMonitor(createPostConversationsCallParticipantMonitorRequest(conversationId, participantId));
  }

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCallParticipantMonitorWithHttpInfo(String conversationId, String participantId) throws IOException {
    return postConversationsCallParticipantMonitor(createPostConversationsCallParticipantMonitorRequest(conversationId, participantId).withHttpInfo());
  }

  private PostConversationsCallParticipantMonitorRequest createPostConversationsCallParticipantMonitorRequest(String conversationId, String participantId) {
    return PostConversationsCallParticipantMonitorRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCallParticipantReplace(String conversationId, String participantId, TransferRequest body) throws IOException, ApiException {
     postConversationsCallParticipantReplace(createPostConversationsCallParticipantReplaceRequest(conversationId, participantId, body));
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCallParticipantReplaceWithHttpInfo(String conversationId, String participantId, TransferRequest body) throws IOException {
    return postConversationsCallParticipantReplace(createPostConversationsCallParticipantReplaceRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PostConversationsCallParticipantReplaceRequest createPostConversationsCallParticipantReplaceRequest(String conversationId, String participantId, TransferRequest body) {
    return PostConversationsCallParticipantReplaceRequest.builder()
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
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Conversation postConversationsCallParticipants(String conversationId, Conversation body) throws IOException, ApiException {
    return  postConversationsCallParticipants(createPostConversationsCallParticipantsRequest(conversationId, body));
  }

  /**
   * Add participants to a conversation
   * 
   * @param conversationId conversationId (required)
   * @param body Conversation (required)
   * @return Conversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Conversation> postConversationsCallParticipantsWithHttpInfo(String conversationId, Conversation body) throws IOException {
    return postConversationsCallParticipants(createPostConversationsCallParticipantsRequest(conversationId, body).withHttpInfo());
  }

  private PostConversationsCallParticipantsRequest createPostConversationsCallParticipantsRequest(String conversationId, Conversation body) {
    return PostConversationsCallParticipantsRequest.builder()
            .withConversationId(conversationId)
    
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCallbackParticipantReplace(String conversationId, String participantId, TransferRequest body) throws IOException, ApiException {
     postConversationsCallbackParticipantReplace(createPostConversationsCallbackParticipantReplaceRequest(conversationId, participantId, body));
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCallbackParticipantReplaceWithHttpInfo(String conversationId, String participantId, TransferRequest body) throws IOException {
    return postConversationsCallbackParticipantReplace(createPostConversationsCallbackParticipantReplaceRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PostConversationsCallbackParticipantReplaceRequest createPostConversationsCallbackParticipantReplaceRequest(String conversationId, String participantId, TransferRequest body) {
    return PostConversationsCallbackParticipantReplaceRequest.builder()
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
   * Send a message on behalf of a communication in a chat conversation.
   * 
   * @param conversationId conversationId (required)
   * @param communicationId communicationId (required)
   * @param body Message (required)
   * @return WebChatMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMessage postConversationsChatCommunicationMessages(String conversationId, String communicationId, CreateWebChatMessageRequest body) throws IOException, ApiException {
    return  postConversationsChatCommunicationMessages(createPostConversationsChatCommunicationMessagesRequest(conversationId, communicationId, body));
  }

  /**
   * Send a message on behalf of a communication in a chat conversation.
   * 
   * @param conversationId conversationId (required)
   * @param communicationId communicationId (required)
   * @param body Message (required)
   * @return WebChatMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMessage> postConversationsChatCommunicationMessagesWithHttpInfo(String conversationId, String communicationId, CreateWebChatMessageRequest body) throws IOException {
    return postConversationsChatCommunicationMessages(createPostConversationsChatCommunicationMessagesRequest(conversationId, communicationId, body).withHttpInfo());
  }

  private PostConversationsChatCommunicationMessagesRequest createPostConversationsChatCommunicationMessagesRequest(String conversationId, String communicationId, CreateWebChatMessageRequest body) {
    return PostConversationsChatCommunicationMessagesRequest.builder()
            .withConversationId(conversationId)
    
            .withCommunicationId(communicationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Send a message on behalf of a communication in a chat conversation.
   * 
   * @param request The request object
   * @return WebChatMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatMessage postConversationsChatCommunicationMessages(PostConversationsChatCommunicationMessagesRequest request) throws IOException, ApiException {
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
   * Send a message on behalf of a communication in a chat conversation.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatMessage> postConversationsChatCommunicationMessages(ApiRequest<CreateWebChatMessageRequest> request) throws IOException {
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
   * Send a typing-indicator on behalf of a communication in a chat conversation.
   * 
   * @param conversationId conversationId (required)
   * @param communicationId communicationId (required)
   * @return WebChatTyping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatTyping postConversationsChatCommunicationTyping(String conversationId, String communicationId) throws IOException, ApiException {
    return  postConversationsChatCommunicationTyping(createPostConversationsChatCommunicationTypingRequest(conversationId, communicationId));
  }

  /**
   * Send a typing-indicator on behalf of a communication in a chat conversation.
   * 
   * @param conversationId conversationId (required)
   * @param communicationId communicationId (required)
   * @return WebChatTyping
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatTyping> postConversationsChatCommunicationTypingWithHttpInfo(String conversationId, String communicationId) throws IOException {
    return postConversationsChatCommunicationTyping(createPostConversationsChatCommunicationTypingRequest(conversationId, communicationId).withHttpInfo());
  }

  private PostConversationsChatCommunicationTypingRequest createPostConversationsChatCommunicationTypingRequest(String conversationId, String communicationId) {
    return PostConversationsChatCommunicationTypingRequest.builder()
            .withConversationId(conversationId)
    
            .withCommunicationId(communicationId)
    
            .build();
  }

  /**
   * Send a typing-indicator on behalf of a communication in a chat conversation.
   * 
   * @param request The request object
   * @return WebChatTyping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatTyping postConversationsChatCommunicationTyping(PostConversationsChatCommunicationTypingRequest request) throws IOException, ApiException {
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
   * Send a typing-indicator on behalf of a communication in a chat conversation.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatTyping> postConversationsChatCommunicationTyping(ApiRequest<Void> request) throws IOException {
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
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsChatParticipantReplace(String conversationId, String participantId, TransferRequest body) throws IOException, ApiException {
     postConversationsChatParticipantReplace(createPostConversationsChatParticipantReplaceRequest(conversationId, participantId, body));
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsChatParticipantReplaceWithHttpInfo(String conversationId, String participantId, TransferRequest body) throws IOException {
    return postConversationsChatParticipantReplace(createPostConversationsChatParticipantReplaceRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PostConversationsChatParticipantReplaceRequest createPostConversationsChatParticipantReplaceRequest(String conversationId, String participantId, TransferRequest body) {
    return PostConversationsChatParticipantReplaceRequest.builder()
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsCobrowsesessionParticipantReplace(String conversationId, String participantId, TransferRequest body) throws IOException, ApiException {
     postConversationsCobrowsesessionParticipantReplace(createPostConversationsCobrowsesessionParticipantReplaceRequest(conversationId, participantId, body));
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsCobrowsesessionParticipantReplaceWithHttpInfo(String conversationId, String participantId, TransferRequest body) throws IOException {
    return postConversationsCobrowsesessionParticipantReplace(createPostConversationsCobrowsesessionParticipantReplaceRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PostConversationsCobrowsesessionParticipantReplaceRequest createPostConversationsCobrowsesessionParticipantReplaceRequest(String conversationId, String participantId, TransferRequest body) {
    return PostConversationsCobrowsesessionParticipantReplaceRequest.builder()
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
   * Send an email to an external conversation. An external conversation is one where the provider is not PureCloud based. This endpoint allows the sender of the external email to reply or send a new message to the existing conversation. The new message will be treated as part of the existing conversation and chained to it.
   * 
   * @param conversationId conversationId (required)
   * @param body Send external email reply (required)
   * @return EmailConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailConversation postConversationsEmailInboundmessages(String conversationId, InboundMessageRequest body) throws IOException, ApiException {
    return  postConversationsEmailInboundmessages(createPostConversationsEmailInboundmessagesRequest(conversationId, body));
  }

  /**
   * Send an email to an external conversation. An external conversation is one where the provider is not PureCloud based. This endpoint allows the sender of the external email to reply or send a new message to the existing conversation. The new message will be treated as part of the existing conversation and chained to it.
   * 
   * @param conversationId conversationId (required)
   * @param body Send external email reply (required)
   * @return EmailConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailConversation> postConversationsEmailInboundmessagesWithHttpInfo(String conversationId, InboundMessageRequest body) throws IOException {
    return postConversationsEmailInboundmessages(createPostConversationsEmailInboundmessagesRequest(conversationId, body).withHttpInfo());
  }

  private PostConversationsEmailInboundmessagesRequest createPostConversationsEmailInboundmessagesRequest(String conversationId, InboundMessageRequest body) {
    return PostConversationsEmailInboundmessagesRequest.builder()
            .withConversationId(conversationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Send an email to an external conversation. An external conversation is one where the provider is not PureCloud based. This endpoint allows the sender of the external email to reply or send a new message to the existing conversation. The new message will be treated as part of the existing conversation and chained to it.
   * 
   * @param request The request object
   * @return EmailConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailConversation postConversationsEmailInboundmessages(PostConversationsEmailInboundmessagesRequest request) throws IOException, ApiException {
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
   * Send an email to an external conversation. An external conversation is one where the provider is not PureCloud based. This endpoint allows the sender of the external email to reply or send a new message to the existing conversation. The new message will be treated as part of the existing conversation and chained to it.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailConversation> postConversationsEmailInboundmessages(ApiRequest<InboundMessageRequest> request) throws IOException {
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
   * Send an email reply
   * 
   * @param conversationId conversationId (required)
   * @param body Reply (required)
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage postConversationsEmailMessages(String conversationId, EmailMessage body) throws IOException, ApiException {
    return  postConversationsEmailMessages(createPostConversationsEmailMessagesRequest(conversationId, body));
  }

  /**
   * Send an email reply
   * 
   * @param conversationId conversationId (required)
   * @param body Reply (required)
   * @return EmailMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> postConversationsEmailMessagesWithHttpInfo(String conversationId, EmailMessage body) throws IOException {
    return postConversationsEmailMessages(createPostConversationsEmailMessagesRequest(conversationId, body).withHttpInfo());
  }

  private PostConversationsEmailMessagesRequest createPostConversationsEmailMessagesRequest(String conversationId, EmailMessage body) {
    return PostConversationsEmailMessagesRequest.builder()
            .withConversationId(conversationId)
    
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
   * Copy attachments from an email message to the current draft.
   * 
   * @param conversationId conversationId (required)
   * @param body Copy Attachment Request (required)
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage postConversationsEmailMessagesDraftAttachmentsCopy(String conversationId, CopyAttachmentsRequest body) throws IOException, ApiException {
    return  postConversationsEmailMessagesDraftAttachmentsCopy(createPostConversationsEmailMessagesDraftAttachmentsCopyRequest(conversationId, body));
  }

  /**
   * Copy attachments from an email message to the current draft.
   * 
   * @param conversationId conversationId (required)
   * @param body Copy Attachment Request (required)
   * @return EmailMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> postConversationsEmailMessagesDraftAttachmentsCopyWithHttpInfo(String conversationId, CopyAttachmentsRequest body) throws IOException {
    return postConversationsEmailMessagesDraftAttachmentsCopy(createPostConversationsEmailMessagesDraftAttachmentsCopyRequest(conversationId, body).withHttpInfo());
  }

  private PostConversationsEmailMessagesDraftAttachmentsCopyRequest createPostConversationsEmailMessagesDraftAttachmentsCopyRequest(String conversationId, CopyAttachmentsRequest body) {
    return PostConversationsEmailMessagesDraftAttachmentsCopyRequest.builder()
            .withConversationId(conversationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Copy attachments from an email message to the current draft.
   * 
   * @param request The request object
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage postConversationsEmailMessagesDraftAttachmentsCopy(PostConversationsEmailMessagesDraftAttachmentsCopyRequest request) throws IOException, ApiException {
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
   * Copy attachments from an email message to the current draft.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> postConversationsEmailMessagesDraftAttachmentsCopy(ApiRequest<CopyAttachmentsRequest> request) throws IOException {
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
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsEmailParticipantReplace(String conversationId, String participantId, TransferRequest body) throws IOException, ApiException {
     postConversationsEmailParticipantReplace(createPostConversationsEmailParticipantReplaceRequest(conversationId, participantId, body));
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsEmailParticipantReplaceWithHttpInfo(String conversationId, String participantId, TransferRequest body) throws IOException {
    return postConversationsEmailParticipantReplace(createPostConversationsEmailParticipantReplaceRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PostConversationsEmailParticipantReplaceRequest createPostConversationsEmailParticipantReplaceRequest(String conversationId, String participantId, TransferRequest body) {
    return PostConversationsEmailParticipantReplaceRequest.builder()
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
   * If the direction of the request is INBOUND, this will create an external conversation with a third party provider. If the direction of the the request is OUTBOUND, this will create a conversation to send outbound emails on behalf of a queue.
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
   * If the direction of the request is INBOUND, this will create an external conversation with a third party provider. If the direction of the the request is OUTBOUND, this will create a conversation to send outbound emails on behalf of a queue.
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
   * If the direction of the request is INBOUND, this will create an external conversation with a third party provider. If the direction of the the request is OUTBOUND, this will create a conversation to send outbound emails on behalf of a queue.
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
   * If the direction of the request is INBOUND, this will create an external conversation with a third party provider. If the direction of the the request is OUTBOUND, this will create a conversation to send outbound emails on behalf of a queue.
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
   * Send message
   * Send message on existing conversation/communication. Only one message body field can be accepted, per request. Example: 1 textBody, 1 mediaId, 1 stickerId, or 1 messageTemplate.
   * @param conversationId conversationId (required)
   * @param communicationId communicationId (required)
   * @param body Message (required)
   * @return MessageData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageData postConversationsMessageCommunicationMessages(String conversationId, String communicationId, AdditionalMessage body) throws IOException, ApiException {
    return  postConversationsMessageCommunicationMessages(createPostConversationsMessageCommunicationMessagesRequest(conversationId, communicationId, body));
  }

  /**
   * Send message
   * Send message on existing conversation/communication. Only one message body field can be accepted, per request. Example: 1 textBody, 1 mediaId, 1 stickerId, or 1 messageTemplate.
   * @param conversationId conversationId (required)
   * @param communicationId communicationId (required)
   * @param body Message (required)
   * @return MessageData
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageData> postConversationsMessageCommunicationMessagesWithHttpInfo(String conversationId, String communicationId, AdditionalMessage body) throws IOException {
    return postConversationsMessageCommunicationMessages(createPostConversationsMessageCommunicationMessagesRequest(conversationId, communicationId, body).withHttpInfo());
  }

  private PostConversationsMessageCommunicationMessagesRequest createPostConversationsMessageCommunicationMessagesRequest(String conversationId, String communicationId, AdditionalMessage body) {
    return PostConversationsMessageCommunicationMessagesRequest.builder()
            .withConversationId(conversationId)
    
            .withCommunicationId(communicationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Send message
   * Send message on existing conversation/communication. Only one message body field can be accepted, per request. Example: 1 textBody, 1 mediaId, 1 stickerId, or 1 messageTemplate.
   * @param request The request object
   * @return MessageData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageData postConversationsMessageCommunicationMessages(PostConversationsMessageCommunicationMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessageData> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessageData>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send message
   * Send message on existing conversation/communication. Only one message body field can be accepted, per request. Example: 1 textBody, 1 mediaId, 1 stickerId, or 1 messageTemplate.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageData> postConversationsMessageCommunicationMessages(ApiRequest<AdditionalMessage> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessageData>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessageData> response = (ApiResponse<MessageData>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessageData> response = (ApiResponse<MessageData>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create media
   * See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.
   * @param conversationId conversationId (required)
   * @param communicationId communicationId (required)
   * @return MessageMediaData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageMediaData postConversationsMessageCommunicationMessagesMedia(String conversationId, String communicationId) throws IOException, ApiException {
    return  postConversationsMessageCommunicationMessagesMedia(createPostConversationsMessageCommunicationMessagesMediaRequest(conversationId, communicationId));
  }

  /**
   * Create media
   * See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.
   * @param conversationId conversationId (required)
   * @param communicationId communicationId (required)
   * @return MessageMediaData
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageMediaData> postConversationsMessageCommunicationMessagesMediaWithHttpInfo(String conversationId, String communicationId) throws IOException {
    return postConversationsMessageCommunicationMessagesMedia(createPostConversationsMessageCommunicationMessagesMediaRequest(conversationId, communicationId).withHttpInfo());
  }

  private PostConversationsMessageCommunicationMessagesMediaRequest createPostConversationsMessageCommunicationMessagesMediaRequest(String conversationId, String communicationId) {
    return PostConversationsMessageCommunicationMessagesMediaRequest.builder()
            .withConversationId(conversationId)
    
            .withCommunicationId(communicationId)
    
            .build();
  }

  /**
   * Create media
   * See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.
   * @param request The request object
   * @return MessageMediaData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageMediaData postConversationsMessageCommunicationMessagesMedia(PostConversationsMessageCommunicationMessagesMediaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessageMediaData> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessageMediaData>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create media
   * See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageMediaData> postConversationsMessageCommunicationMessagesMedia(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessageMediaData>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessageMediaData> response = (ApiResponse<MessageMediaData>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessageMediaData> response = (ApiResponse<MessageMediaData>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get messages in batch
   * The path parameter [conversationId] should contain the conversationId of the conversation being filtered. The body should contain the messageId(s) of messages being requested. For example: [\&quot;a3069a33b-bbb1-4703-9d68-061d9e9db96e\&quot;, \&quot;55bc6be3-078c-4a49-a4e6-1e05776ed7e8\&quot;]
   * @param conversationId  (required)
   * @param body messageIds (optional)
   * @return TextMessageListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TextMessageListing postConversationsMessageMessagesBulk(String conversationId, List<String> body) throws IOException, ApiException {
    return  postConversationsMessageMessagesBulk(createPostConversationsMessageMessagesBulkRequest(conversationId, body));
  }

  /**
   * Get messages in batch
   * The path parameter [conversationId] should contain the conversationId of the conversation being filtered. The body should contain the messageId(s) of messages being requested. For example: [\&quot;a3069a33b-bbb1-4703-9d68-061d9e9db96e\&quot;, \&quot;55bc6be3-078c-4a49-a4e6-1e05776ed7e8\&quot;]
   * @param conversationId  (required)
   * @param body messageIds (optional)
   * @return TextMessageListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TextMessageListing> postConversationsMessageMessagesBulkWithHttpInfo(String conversationId, List<String> body) throws IOException {
    return postConversationsMessageMessagesBulk(createPostConversationsMessageMessagesBulkRequest(conversationId, body).withHttpInfo());
  }

  private PostConversationsMessageMessagesBulkRequest createPostConversationsMessageMessagesBulkRequest(String conversationId, List<String> body) {
    return PostConversationsMessageMessagesBulkRequest.builder()
            .withConversationId(conversationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Get messages in batch
   * The path parameter [conversationId] should contain the conversationId of the conversation being filtered. The body should contain the messageId(s) of messages being requested. For example: [\&quot;a3069a33b-bbb1-4703-9d68-061d9e9db96e\&quot;, \&quot;55bc6be3-078c-4a49-a4e6-1e05776ed7e8\&quot;]
   * @param request The request object
   * @return TextMessageListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TextMessageListing postConversationsMessageMessagesBulk(PostConversationsMessageMessagesBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TextMessageListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TextMessageListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get messages in batch
   * The path parameter [conversationId] should contain the conversationId of the conversation being filtered. The body should contain the messageId(s) of messages being requested. For example: [\&quot;a3069a33b-bbb1-4703-9d68-061d9e9db96e\&quot;, \&quot;55bc6be3-078c-4a49-a4e6-1e05776ed7e8\&quot;]
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TextMessageListing> postConversationsMessageMessagesBulk(ApiRequest<List<String>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TextMessageListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TextMessageListing> response = (ApiResponse<TextMessageListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TextMessageListing> response = (ApiResponse<TextMessageListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsMessageParticipantReplace(String conversationId, String participantId, TransferRequest body) throws IOException, ApiException {
     postConversationsMessageParticipantReplace(createPostConversationsMessageParticipantReplaceRequest(conversationId, participantId, body));
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsMessageParticipantReplaceWithHttpInfo(String conversationId, String participantId, TransferRequest body) throws IOException {
    return postConversationsMessageParticipantReplace(createPostConversationsMessageParticipantReplaceRequest(conversationId, participantId, body).withHttpInfo());
  }

  private PostConversationsMessageParticipantReplaceRequest createPostConversationsMessageParticipantReplaceRequest(String conversationId, String participantId, TransferRequest body) {
    return PostConversationsMessageParticipantReplaceRequest.builder()
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
  public void postConversationsMessageParticipantReplace(PostConversationsMessageParticipantReplaceRequest request) throws IOException, ApiException {
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
  public ApiResponse<Void> postConversationsMessageParticipantReplace(ApiRequest<TransferRequest> request) throws IOException {
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
   * Create an outbound messaging conversation.
   * If there is an existing conversation between the remote address and the address associated with the queue specified in createOutboundRequest then the result of this request depends on the state of that conversation and the useExistingConversation field of createOutboundRequest. If the existing conversation is in alerting or connected state, then the request will fail. If the existing conversation is disconnected but still within the conversation window then the request will fail unless useExistingConversation is set to true.
   * @param body Create outbound messaging conversation (required)
   * @return MessageConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageConversation postConversationsMessages(CreateOutboundMessagingConversationRequest body) throws IOException, ApiException {
    return  postConversationsMessages(createPostConversationsMessagesRequest(body));
  }

  /**
   * Create an outbound messaging conversation.
   * If there is an existing conversation between the remote address and the address associated with the queue specified in createOutboundRequest then the result of this request depends on the state of that conversation and the useExistingConversation field of createOutboundRequest. If the existing conversation is in alerting or connected state, then the request will fail. If the existing conversation is disconnected but still within the conversation window then the request will fail unless useExistingConversation is set to true.
   * @param body Create outbound messaging conversation (required)
   * @return MessageConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageConversation> postConversationsMessagesWithHttpInfo(CreateOutboundMessagingConversationRequest body) throws IOException {
    return postConversationsMessages(createPostConversationsMessagesRequest(body).withHttpInfo());
  }

  private PostConversationsMessagesRequest createPostConversationsMessagesRequest(CreateOutboundMessagingConversationRequest body) {
    return PostConversationsMessagesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create an outbound messaging conversation.
   * If there is an existing conversation between the remote address and the address associated with the queue specified in createOutboundRequest then the result of this request depends on the state of that conversation and the useExistingConversation field of createOutboundRequest. If the existing conversation is in alerting or connected state, then the request will fail. If the existing conversation is disconnected but still within the conversation window then the request will fail unless useExistingConversation is set to true.
   * @param request The request object
   * @return MessageConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessageConversation postConversationsMessages(PostConversationsMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessageConversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessageConversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an outbound messaging conversation.
   * If there is an existing conversation between the remote address and the address associated with the queue specified in createOutboundRequest then the result of this request depends on the state of that conversation and the useExistingConversation field of createOutboundRequest. If the existing conversation is in alerting or connected state, then the request will fail. If the existing conversation is disconnected but still within the conversation window then the request will fail unless useExistingConversation is set to true.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessageConversation> postConversationsMessages(ApiRequest<CreateOutboundMessagingConversationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessageConversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessageConversation> response = (ApiResponse<MessageConversation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessageConversation> response = (ApiResponse<MessageConversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Send an agentless outbound message
   * Send an agentlesss (api participant) outbound message using a client credential grant. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will generate a new Conversation, if there is an existing active Conversation between the fromAddress and toAddress already, then this POST will fail.
   * @param body Create agentless outbound messaging request (required)
   * @return SendAgentlessOutboundMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SendAgentlessOutboundMessageResponse postConversationsMessagesAgentless(SendAgentlessOutboundMessageRequest body) throws IOException, ApiException {
    return  postConversationsMessagesAgentless(createPostConversationsMessagesAgentlessRequest(body));
  }

  /**
   * Send an agentless outbound message
   * Send an agentlesss (api participant) outbound message using a client credential grant. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will generate a new Conversation, if there is an existing active Conversation between the fromAddress and toAddress already, then this POST will fail.
   * @param body Create agentless outbound messaging request (required)
   * @return SendAgentlessOutboundMessageResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SendAgentlessOutboundMessageResponse> postConversationsMessagesAgentlessWithHttpInfo(SendAgentlessOutboundMessageRequest body) throws IOException {
    return postConversationsMessagesAgentless(createPostConversationsMessagesAgentlessRequest(body).withHttpInfo());
  }

  private PostConversationsMessagesAgentlessRequest createPostConversationsMessagesAgentlessRequest(SendAgentlessOutboundMessageRequest body) {
    return PostConversationsMessagesAgentlessRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Send an agentless outbound message
   * Send an agentlesss (api participant) outbound message using a client credential grant. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will generate a new Conversation, if there is an existing active Conversation between the fromAddress and toAddress already, then this POST will fail.
   * @param request The request object
   * @return SendAgentlessOutboundMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SendAgentlessOutboundMessageResponse postConversationsMessagesAgentless(PostConversationsMessagesAgentlessRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SendAgentlessOutboundMessageResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SendAgentlessOutboundMessageResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send an agentless outbound message
   * Send an agentlesss (api participant) outbound message using a client credential grant. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will generate a new Conversation, if there is an existing active Conversation between the fromAddress and toAddress already, then this POST will fail.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SendAgentlessOutboundMessageResponse> postConversationsMessagesAgentless(ApiRequest<SendAgentlessOutboundMessageRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SendAgentlessOutboundMessageResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SendAgentlessOutboundMessageResponse> response = (ApiResponse<SendAgentlessOutboundMessageResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SendAgentlessOutboundMessageResponse> response = (ApiResponse<SendAgentlessOutboundMessageResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Send an inbound Open Message
   * Send an inbound message to an Open Messaging integration. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will either generate a new Conversation, or be a part of an existing conversation. See https://developer.genesys.cloud/api/digital/openmessaging/ for example usage.
   * @param body NormalizedMessage (required)
   * @return OpenNormalizedMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenNormalizedMessage postConversationsMessagesInboundOpen(OpenNormalizedMessage body) throws IOException, ApiException {
    return  postConversationsMessagesInboundOpen(createPostConversationsMessagesInboundOpenRequest(body));
  }

  /**
   * Send an inbound Open Message
   * Send an inbound message to an Open Messaging integration. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will either generate a new Conversation, or be a part of an existing conversation. See https://developer.genesys.cloud/api/digital/openmessaging/ for example usage.
   * @param body NormalizedMessage (required)
   * @return OpenNormalizedMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenNormalizedMessage> postConversationsMessagesInboundOpenWithHttpInfo(OpenNormalizedMessage body) throws IOException {
    return postConversationsMessagesInboundOpen(createPostConversationsMessagesInboundOpenRequest(body).withHttpInfo());
  }

  private PostConversationsMessagesInboundOpenRequest createPostConversationsMessagesInboundOpenRequest(OpenNormalizedMessage body) {
    return PostConversationsMessagesInboundOpenRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Send an inbound Open Message
   * Send an inbound message to an Open Messaging integration. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will either generate a new Conversation, or be a part of an existing conversation. See https://developer.genesys.cloud/api/digital/openmessaging/ for example usage.
   * @param request The request object
   * @return OpenNormalizedMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenNormalizedMessage postConversationsMessagesInboundOpen(PostConversationsMessagesInboundOpenRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OpenNormalizedMessage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OpenNormalizedMessage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send an inbound Open Message
   * Send an inbound message to an Open Messaging integration. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will either generate a new Conversation, or be a part of an existing conversation. See https://developer.genesys.cloud/api/digital/openmessaging/ for example usage.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenNormalizedMessage> postConversationsMessagesInboundOpen(ApiRequest<OpenNormalizedMessage> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OpenNormalizedMessage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OpenNormalizedMessage> response = (ApiResponse<OpenNormalizedMessage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OpenNormalizedMessage> response = (ApiResponse<OpenNormalizedMessage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a Facebook Integration
   * 
   * @param body FacebookIntegrationRequest (required)
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration postConversationsMessagingIntegrationsFacebook(FacebookIntegrationRequest body) throws IOException, ApiException {
    return  postConversationsMessagingIntegrationsFacebook(createPostConversationsMessagingIntegrationsFacebookRequest(body));
  }

  /**
   * Create a Facebook Integration
   * 
   * @param body FacebookIntegrationRequest (required)
   * @return FacebookIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> postConversationsMessagingIntegrationsFacebookWithHttpInfo(FacebookIntegrationRequest body) throws IOException {
    return postConversationsMessagingIntegrationsFacebook(createPostConversationsMessagingIntegrationsFacebookRequest(body).withHttpInfo());
  }

  private PostConversationsMessagingIntegrationsFacebookRequest createPostConversationsMessagingIntegrationsFacebookRequest(FacebookIntegrationRequest body) {
    return PostConversationsMessagingIntegrationsFacebookRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a Facebook Integration
   * 
   * @param request The request object
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration postConversationsMessagingIntegrationsFacebook(PostConversationsMessagingIntegrationsFacebookRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Facebook Integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> postConversationsMessagingIntegrationsFacebook(ApiRequest<FacebookIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a LINE messenger Integration
   * 
   * @param body LineIntegrationRequest (required)
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration postConversationsMessagingIntegrationsLine(LineIntegrationRequest body) throws IOException, ApiException {
    return  postConversationsMessagingIntegrationsLine(createPostConversationsMessagingIntegrationsLineRequest(body));
  }

  /**
   * Create a LINE messenger Integration
   * 
   * @param body LineIntegrationRequest (required)
   * @return LineIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> postConversationsMessagingIntegrationsLineWithHttpInfo(LineIntegrationRequest body) throws IOException {
    return postConversationsMessagingIntegrationsLine(createPostConversationsMessagingIntegrationsLineRequest(body).withHttpInfo());
  }

  private PostConversationsMessagingIntegrationsLineRequest createPostConversationsMessagingIntegrationsLineRequest(LineIntegrationRequest body) {
    return PostConversationsMessagingIntegrationsLineRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a LINE messenger Integration
   * 
   * @param request The request object
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration postConversationsMessagingIntegrationsLine(PostConversationsMessagingIntegrationsLineRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a LINE messenger Integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> postConversationsMessagingIntegrationsLine(ApiRequest<LineIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param body OpenIntegrationRequest (required)
   * @return OpenIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenIntegration postConversationsMessagingIntegrationsOpen(OpenIntegrationRequest body) throws IOException, ApiException {
    return  postConversationsMessagingIntegrationsOpen(createPostConversationsMessagingIntegrationsOpenRequest(body));
  }

  /**
   * Create an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param body OpenIntegrationRequest (required)
   * @return OpenIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenIntegration> postConversationsMessagingIntegrationsOpenWithHttpInfo(OpenIntegrationRequest body) throws IOException {
    return postConversationsMessagingIntegrationsOpen(createPostConversationsMessagingIntegrationsOpenRequest(body).withHttpInfo());
  }

  private PostConversationsMessagingIntegrationsOpenRequest createPostConversationsMessagingIntegrationsOpenRequest(OpenIntegrationRequest body) {
    return PostConversationsMessagingIntegrationsOpenRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param request The request object
   * @return OpenIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenIntegration postConversationsMessagingIntegrationsOpen(PostConversationsMessagingIntegrationsOpenRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OpenIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OpenIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an Open messaging integration
   * See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenIntegration> postConversationsMessagingIntegrationsOpen(ApiRequest<OpenIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OpenIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OpenIntegration> response = (ApiResponse<OpenIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OpenIntegration> response = (ApiResponse<OpenIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a Twitter Integration
   * 
   * @param body TwitterIntegrationRequest (required)
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration postConversationsMessagingIntegrationsTwitter(TwitterIntegrationRequest body) throws IOException, ApiException {
    return  postConversationsMessagingIntegrationsTwitter(createPostConversationsMessagingIntegrationsTwitterRequest(body));
  }

  /**
   * Create a Twitter Integration
   * 
   * @param body TwitterIntegrationRequest (required)
   * @return TwitterIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> postConversationsMessagingIntegrationsTwitterWithHttpInfo(TwitterIntegrationRequest body) throws IOException {
    return postConversationsMessagingIntegrationsTwitter(createPostConversationsMessagingIntegrationsTwitterRequest(body).withHttpInfo());
  }

  private PostConversationsMessagingIntegrationsTwitterRequest createPostConversationsMessagingIntegrationsTwitterRequest(TwitterIntegrationRequest body) {
    return PostConversationsMessagingIntegrationsTwitterRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a Twitter Integration
   * 
   * @param request The request object
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration postConversationsMessagingIntegrationsTwitter(PostConversationsMessagingIntegrationsTwitterRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Twitter Integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> postConversationsMessagingIntegrationsTwitter(ApiRequest<TwitterIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a WhatsApp Integration
   * You must be approved by WhatsApp to use this feature. Your approved e164-formatted phone number and valid WhatsApp certificate for your number are required. Your WhatsApp certificate must have valid base64 encoding. Please paste carefully and do not add any leading or trailing spaces. Do not alter any characters. An integration must be activated within 7 days of certificate generation. If you cannot complete the addition and activation of the number within 7 days, please obtain a new certificate before creating the integration. Integrations created with an invalid number or certificate may immediately incur additional integration fees. Please carefully enter your number and certificate as described.
   * @param body WhatsAppIntegrationRequest (required)
   * @return WhatsAppIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WhatsAppIntegration postConversationsMessagingIntegrationsWhatsapp(WhatsAppIntegrationRequest body) throws IOException, ApiException {
    return  postConversationsMessagingIntegrationsWhatsapp(createPostConversationsMessagingIntegrationsWhatsappRequest(body));
  }

  /**
   * Create a WhatsApp Integration
   * You must be approved by WhatsApp to use this feature. Your approved e164-formatted phone number and valid WhatsApp certificate for your number are required. Your WhatsApp certificate must have valid base64 encoding. Please paste carefully and do not add any leading or trailing spaces. Do not alter any characters. An integration must be activated within 7 days of certificate generation. If you cannot complete the addition and activation of the number within 7 days, please obtain a new certificate before creating the integration. Integrations created with an invalid number or certificate may immediately incur additional integration fees. Please carefully enter your number and certificate as described.
   * @param body WhatsAppIntegrationRequest (required)
   * @return WhatsAppIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WhatsAppIntegration> postConversationsMessagingIntegrationsWhatsappWithHttpInfo(WhatsAppIntegrationRequest body) throws IOException {
    return postConversationsMessagingIntegrationsWhatsapp(createPostConversationsMessagingIntegrationsWhatsappRequest(body).withHttpInfo());
  }

  private PostConversationsMessagingIntegrationsWhatsappRequest createPostConversationsMessagingIntegrationsWhatsappRequest(WhatsAppIntegrationRequest body) {
    return PostConversationsMessagingIntegrationsWhatsappRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a WhatsApp Integration
   * You must be approved by WhatsApp to use this feature. Your approved e164-formatted phone number and valid WhatsApp certificate for your number are required. Your WhatsApp certificate must have valid base64 encoding. Please paste carefully and do not add any leading or trailing spaces. Do not alter any characters. An integration must be activated within 7 days of certificate generation. If you cannot complete the addition and activation of the number within 7 days, please obtain a new certificate before creating the integration. Integrations created with an invalid number or certificate may immediately incur additional integration fees. Please carefully enter your number and certificate as described.
   * @param request The request object
   * @return WhatsAppIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WhatsAppIntegration postConversationsMessagingIntegrationsWhatsapp(PostConversationsMessagingIntegrationsWhatsappRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WhatsAppIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WhatsAppIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a WhatsApp Integration
   * You must be approved by WhatsApp to use this feature. Your approved e164-formatted phone number and valid WhatsApp certificate for your number are required. Your WhatsApp certificate must have valid base64 encoding. Please paste carefully and do not add any leading or trailing spaces. Do not alter any characters. An integration must be activated within 7 days of certificate generation. If you cannot complete the addition and activation of the number within 7 days, please obtain a new certificate before creating the integration. Integrations created with an invalid number or certificate may immediately incur additional integration fees. Please carefully enter your number and certificate as described.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WhatsAppIntegration> postConversationsMessagingIntegrationsWhatsapp(ApiRequest<WhatsAppIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WhatsAppIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WhatsAppIntegration> response = (ApiResponse<WhatsAppIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WhatsAppIntegration> response = (ApiResponse<WhatsAppIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Set flagged reason on conversation participant to indicate bad conversation quality.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putConversationParticipantFlaggedreason(String conversationId, String participantId) throws IOException, ApiException {
     putConversationParticipantFlaggedreason(createPutConversationParticipantFlaggedreasonRequest(conversationId, participantId));
  }

  /**
   * Set flagged reason on conversation participant to indicate bad conversation quality.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putConversationParticipantFlaggedreasonWithHttpInfo(String conversationId, String participantId) throws IOException {
    return putConversationParticipantFlaggedreason(createPutConversationParticipantFlaggedreasonRequest(conversationId, participantId).withHttpInfo());
  }

  private PutConversationParticipantFlaggedreasonRequest createPutConversationParticipantFlaggedreasonRequest(String conversationId, String participantId) {
    return PutConversationParticipantFlaggedreasonRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .build();
  }

  /**
   * Set flagged reason on conversation participant to indicate bad conversation quality.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putConversationParticipantFlaggedreason(PutConversationParticipantFlaggedreasonRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Set flagged reason on conversation participant to indicate bad conversation quality.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putConversationParticipantFlaggedreason(ApiRequest<Void> request) throws IOException {
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
   * Update the tags on a conversation.
   * 
   * @param conversationId conversation ID (required)
   * @param body Conversation Tags (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String putConversationTags(String conversationId, ConversationTagsUpdate body) throws IOException, ApiException {
    return  putConversationTags(createPutConversationTagsRequest(conversationId, body));
  }

  /**
   * Update the tags on a conversation.
   * 
   * @param conversationId conversation ID (required)
   * @param body Conversation Tags (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> putConversationTagsWithHttpInfo(String conversationId, ConversationTagsUpdate body) throws IOException {
    return putConversationTags(createPutConversationTagsRequest(conversationId, body).withHttpInfo());
  }

  private PutConversationTagsRequest createPutConversationTagsRequest(String conversationId, ConversationTagsUpdate body) {
    return PutConversationTagsRequest.builder()
            .withConversationId(conversationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update the tags on a conversation.
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String putConversationTags(PutConversationTagsRequest request) throws IOException, ApiException {
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
   * Update the tags on a conversation.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> putConversationTags(ApiRequest<ConversationTagsUpdate> request) throws IOException {
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
   * Set uuiData to be sent on future commands.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body UUIData Request (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty putConversationsCallParticipantCommunicationUuidata(String conversationId, String participantId, String communicationId, SetUuiDataRequest body) throws IOException, ApiException {
    return  putConversationsCallParticipantCommunicationUuidata(createPutConversationsCallParticipantCommunicationUuidataRequest(conversationId, participantId, communicationId, body));
  }

  /**
   * Set uuiData to be sent on future commands.
   * 
   * @param conversationId conversationId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body UUIData Request (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> putConversationsCallParticipantCommunicationUuidataWithHttpInfo(String conversationId, String participantId, String communicationId, SetUuiDataRequest body) throws IOException {
    return putConversationsCallParticipantCommunicationUuidata(createPutConversationsCallParticipantCommunicationUuidataRequest(conversationId, participantId, communicationId, body).withHttpInfo());
  }

  private PutConversationsCallParticipantCommunicationUuidataRequest createPutConversationsCallParticipantCommunicationUuidataRequest(String conversationId, String participantId, String communicationId, SetUuiDataRequest body) {
    return PutConversationsCallParticipantCommunicationUuidataRequest.builder()
            .withConversationId(conversationId)
    
            .withParticipantId(participantId)
    
            .withCommunicationId(communicationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Set uuiData to be sent on future commands.
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty putConversationsCallParticipantCommunicationUuidata(PutConversationsCallParticipantCommunicationUuidataRequest request) throws IOException, ApiException {
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
   * Set uuiData to be sent on future commands.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> putConversationsCallParticipantCommunicationUuidata(ApiRequest<SetUuiDataRequest> request) throws IOException {
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
   * Update conversation draft reply
   * 
   * @param conversationId conversationId (required)
   * @param body Draft (required)
   * @return EmailMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailMessage putConversationsEmailMessagesDraft(String conversationId, EmailMessage body) throws IOException, ApiException {
    return  putConversationsEmailMessagesDraft(createPutConversationsEmailMessagesDraftRequest(conversationId, body));
  }

  /**
   * Update conversation draft reply
   * 
   * @param conversationId conversationId (required)
   * @param body Draft (required)
   * @return EmailMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailMessage> putConversationsEmailMessagesDraftWithHttpInfo(String conversationId, EmailMessage body) throws IOException {
    return putConversationsEmailMessagesDraft(createPutConversationsEmailMessagesDraftRequest(conversationId, body).withHttpInfo());
  }

  private PutConversationsEmailMessagesDraftRequest createPutConversationsEmailMessagesDraftRequest(String conversationId, EmailMessage body) {
    return PutConversationsEmailMessagesDraftRequest.builder()
            .withConversationId(conversationId)
    
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

  
  /**
   * Update a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @param body LineIntegrationRequest (required)
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration putConversationsMessagingIntegrationsLineIntegrationId(String integrationId, LineIntegrationRequest body) throws IOException, ApiException {
    return  putConversationsMessagingIntegrationsLineIntegrationId(createPutConversationsMessagingIntegrationsLineIntegrationIdRequest(integrationId, body));
  }

  /**
   * Update a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @param body LineIntegrationRequest (required)
   * @return LineIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> putConversationsMessagingIntegrationsLineIntegrationIdWithHttpInfo(String integrationId, LineIntegrationRequest body) throws IOException {
    return putConversationsMessagingIntegrationsLineIntegrationId(createPutConversationsMessagingIntegrationsLineIntegrationIdRequest(integrationId, body).withHttpInfo());
  }

  private PutConversationsMessagingIntegrationsLineIntegrationIdRequest createPutConversationsMessagingIntegrationsLineIntegrationIdRequest(String integrationId, LineIntegrationRequest body) {
    return PutConversationsMessagingIntegrationsLineIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a LINE messenger integration
   * 
   * @param request The request object
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration putConversationsMessagingIntegrationsLineIntegrationId(PutConversationsMessagingIntegrationsLineIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a LINE messenger integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> putConversationsMessagingIntegrationsLineIntegrationId(ApiRequest<LineIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update conversation threading window timeline for each messaging type
   * PUT Conversation messaging threading timeline is intended to set the conversation threading settings for ALL messengerTypes. If you omit a messengerType in the request body then the setting for that messengerType will use the platform default value. The PUT replaces the existing setting(s) that were previously set for each messengerType.
   * @param body ConversationThreadingWindowRequest (required)
   * @return ConversationThreadingWindow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationThreadingWindow putConversationsMessagingThreadingtimeline(ConversationThreadingWindow body) throws IOException, ApiException {
    return  putConversationsMessagingThreadingtimeline(createPutConversationsMessagingThreadingtimelineRequest(body));
  }

  /**
   * Update conversation threading window timeline for each messaging type
   * PUT Conversation messaging threading timeline is intended to set the conversation threading settings for ALL messengerTypes. If you omit a messengerType in the request body then the setting for that messengerType will use the platform default value. The PUT replaces the existing setting(s) that were previously set for each messengerType.
   * @param body ConversationThreadingWindowRequest (required)
   * @return ConversationThreadingWindow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationThreadingWindow> putConversationsMessagingThreadingtimelineWithHttpInfo(ConversationThreadingWindow body) throws IOException {
    return putConversationsMessagingThreadingtimeline(createPutConversationsMessagingThreadingtimelineRequest(body).withHttpInfo());
  }

  private PutConversationsMessagingThreadingtimelineRequest createPutConversationsMessagingThreadingtimelineRequest(ConversationThreadingWindow body) {
    return PutConversationsMessagingThreadingtimelineRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update conversation threading window timeline for each messaging type
   * PUT Conversation messaging threading timeline is intended to set the conversation threading settings for ALL messengerTypes. If you omit a messengerType in the request body then the setting for that messengerType will use the platform default value. The PUT replaces the existing setting(s) that were previously set for each messengerType.
   * @param request The request object
   * @return ConversationThreadingWindow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationThreadingWindow putConversationsMessagingThreadingtimeline(PutConversationsMessagingThreadingtimelineRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ConversationThreadingWindow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ConversationThreadingWindow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update conversation threading window timeline for each messaging type
   * PUT Conversation messaging threading timeline is intended to set the conversation threading settings for ALL messengerTypes. If you omit a messengerType in the request body then the setting for that messengerType will use the platform default value. The PUT replaces the existing setting(s) that were previously set for each messengerType.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationThreadingWindow> putConversationsMessagingThreadingtimeline(ApiRequest<ConversationThreadingWindow> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ConversationThreadingWindow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationThreadingWindow> response = (ApiResponse<ConversationThreadingWindow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationThreadingWindow> response = (ApiResponse<ConversationThreadingWindow>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
