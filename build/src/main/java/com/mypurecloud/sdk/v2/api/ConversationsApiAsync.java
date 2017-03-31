package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.AsyncApiCallback;
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
import java.util.concurrent.Future;


public class ConversationsApiAsync {
  private final ApiClient pcapiClient;

  public ConversationsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public ConversationsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a code used to add a communication to this participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteConversationParticipantCodeAsync(DeleteConversationParticipantCodeRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a code used to add a communication to this participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteConversationParticipantCodeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Cancel the transfer
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteConversationsCallParticipantConsultAsync(DeleteConversationsCallParticipantConsultRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Cancel the transfer
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteConversationsCallParticipantConsultAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete attachment from draft
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteConversationsEmailMessagesDraftAttachmentAsync(DeleteConversationsEmailMessagesDraftAttachmentRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete attachment from draft
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteConversationsEmailMessagesDraftAttachmentAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Get a conversation by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AnalyticsConversation> getAnalyticsConversationDetailsAsync(GetAnalyticsConversationDetailsRequest request, AsyncApiCallback<AnalyticsConversation> callback) {
    return pcapiClient.<AnalyticsConversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversation>() {}, callback);
  }

  /**
   * Get a conversation by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AnalyticsConversation>> getAnalyticsConversationDetailsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<AnalyticsConversation>> callback) {
    return pcapiClient.<AnalyticsConversation>invokeAPIVerboseAsync(request, new TypeReference<AnalyticsConversation>() {}, callback);
  }

  /**
   * Get conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Conversation> getConversationAsync(GetConversationRequest request, AsyncApiCallback<Conversation> callback) {
    return pcapiClient.<Conversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Get conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Conversation>> getConversationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    return pcapiClient.<Conversation>invokeAPIVerboseAsync(request, new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<WrapupCode> getConversationParticipantWrapupAsync(GetConversationParticipantWrapupRequest request, AsyncApiCallback<WrapupCode> callback) {
    return pcapiClient.<WrapupCode>invokeAPIAsync(request.withHttpInfo(), new TypeReference<WrapupCode>() {}, callback);
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<WrapupCode>> getConversationParticipantWrapupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WrapupCode>> callback) {
    return pcapiClient.<WrapupCode>invokeAPIVerboseAsync(request, new TypeReference<WrapupCode>() {}, callback);
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<WrapupCode>> getConversationParticipantWrapupcodesAsync(GetConversationParticipantWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<WrapupCode>>> getConversationParticipantWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerboseAsync(request, new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Get conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ConversationEntityListing> getConversationsAsync(GetConversationsRequest request, AsyncApiCallback<ConversationEntityListing> callback) {
    return pcapiClient.<ConversationEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ConversationEntityListing>() {}, callback);
  }

  /**
   * Get conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ConversationEntityListing>> getConversationsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ConversationEntityListing>> callback) {
    return pcapiClient.<ConversationEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ConversationEntityListing>() {}, callback);
  }

  /**
   * Get call conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CallConversation> getConversationsCallAsync(GetConversationsCallRequest request, AsyncApiCallback<CallConversation> callback) {
    return pcapiClient.<CallConversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CallConversation>() {}, callback);
  }

  /**
   * Get call conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CallConversation>> getConversationsCallAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CallConversation>> callback) {
    return pcapiClient.<CallConversation>invokeAPIVerboseAsync(request, new TypeReference<CallConversation>() {}, callback);
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Wrapup> getConversationsCallParticipantWrapupAsync(GetConversationsCallParticipantWrapupRequest request, AsyncApiCallback<Wrapup> callback) {
    return pcapiClient.<Wrapup>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Wrapup>() {}, callback);
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Wrapup>> getConversationsCallParticipantWrapupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Wrapup>> callback) {
    return pcapiClient.<Wrapup>invokeAPIVerboseAsync(request, new TypeReference<Wrapup>() {}, callback);
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<WrapupCode>> getConversationsCallParticipantWrapupcodesAsync(GetConversationsCallParticipantWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<WrapupCode>>> getConversationsCallParticipantWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerboseAsync(request, new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Get callback conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CallbackConversation> getConversationsCallbackAsync(GetConversationsCallbackRequest request, AsyncApiCallback<CallbackConversation> callback) {
    return pcapiClient.<CallbackConversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CallbackConversation>() {}, callback);
  }

  /**
   * Get callback conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CallbackConversation>> getConversationsCallbackAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CallbackConversation>> callback) {
    return pcapiClient.<CallbackConversation>invokeAPIVerboseAsync(request, new TypeReference<CallbackConversation>() {}, callback);
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Wrapup> getConversationsCallbackParticipantWrapupAsync(GetConversationsCallbackParticipantWrapupRequest request, AsyncApiCallback<Wrapup> callback) {
    return pcapiClient.<Wrapup>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Wrapup>() {}, callback);
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Wrapup>> getConversationsCallbackParticipantWrapupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Wrapup>> callback) {
    return pcapiClient.<Wrapup>invokeAPIVerboseAsync(request, new TypeReference<Wrapup>() {}, callback);
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<WrapupCode>> getConversationsCallbackParticipantWrapupcodesAsync(GetConversationsCallbackParticipantWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<WrapupCode>>> getConversationsCallbackParticipantWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerboseAsync(request, new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Get callback conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CallbackConversationEntityListing> getConversationsCallbacksAsync(GetConversationsCallbacksRequest request, AsyncApiCallback<CallbackConversationEntityListing> callback) {
    return pcapiClient.<CallbackConversationEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CallbackConversationEntityListing>() {}, callback);
  }

  /**
   * Get callback conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CallbackConversationEntityListing>> getConversationsCallbacksAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CallbackConversationEntityListing>> callback) {
    return pcapiClient.<CallbackConversationEntityListing>invokeAPIVerboseAsync(request, new TypeReference<CallbackConversationEntityListing>() {}, callback);
  }

  /**
   * Get recent conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CallConversationEntityListing> getConversationsCallsAsync(GetConversationsCallsRequest request, AsyncApiCallback<CallConversationEntityListing> callback) {
    return pcapiClient.<CallConversationEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CallConversationEntityListing>() {}, callback);
  }

  /**
   * Get recent conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CallConversationEntityListing>> getConversationsCallsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CallConversationEntityListing>> callback) {
    return pcapiClient.<CallConversationEntityListing>invokeAPIVerboseAsync(request, new TypeReference<CallConversationEntityListing>() {}, callback);
  }

  /**
   * Get call history
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CallConversationEntityListing> getConversationsCallsHistoryAsync(GetConversationsCallsHistoryRequest request, AsyncApiCallback<CallConversationEntityListing> callback) {
    return pcapiClient.<CallConversationEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CallConversationEntityListing>() {}, callback);
  }

  /**
   * Get call history
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CallConversationEntityListing>> getConversationsCallsHistoryAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CallConversationEntityListing>> callback) {
    return pcapiClient.<CallConversationEntityListing>invokeAPIVerboseAsync(request, new TypeReference<CallConversationEntityListing>() {}, callback);
  }

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<MaxParticipants> getConversationsCallsMaximumconferencepartiesAsync(GetConversationsCallsMaximumconferencepartiesRequest request, AsyncApiCallback<MaxParticipants> callback) {
    return pcapiClient.<MaxParticipants>invokeAPIAsync(request.withHttpInfo(), new TypeReference<MaxParticipants>() {}, callback);
  }

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<MaxParticipants>> getConversationsCallsMaximumconferencepartiesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<MaxParticipants>> callback) {
    return pcapiClient.<MaxParticipants>invokeAPIVerboseAsync(request, new TypeReference<MaxParticipants>() {}, callback);
  }

  /**
   * Get chat conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ChatConversation> getConversationsChatAsync(GetConversationsChatRequest request, AsyncApiCallback<ChatConversation> callback) {
    return pcapiClient.<ChatConversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ChatConversation>() {}, callback);
  }

  /**
   * Get chat conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ChatConversation>> getConversationsChatAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ChatConversation>> callback) {
    return pcapiClient.<ChatConversation>invokeAPIVerboseAsync(request, new TypeReference<ChatConversation>() {}, callback);
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Wrapup> getConversationsChatParticipantWrapupAsync(GetConversationsChatParticipantWrapupRequest request, AsyncApiCallback<Wrapup> callback) {
    return pcapiClient.<Wrapup>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Wrapup>() {}, callback);
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Wrapup>> getConversationsChatParticipantWrapupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Wrapup>> callback) {
    return pcapiClient.<Wrapup>invokeAPIVerboseAsync(request, new TypeReference<Wrapup>() {}, callback);
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<WrapupCode>> getConversationsChatParticipantWrapupcodesAsync(GetConversationsChatParticipantWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<WrapupCode>>> getConversationsChatParticipantWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerboseAsync(request, new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Get recent chat conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ChatConversationEntityListing> getConversationsChatsAsync(GetConversationsChatsRequest request, AsyncApiCallback<ChatConversationEntityListing> callback) {
    return pcapiClient.<ChatConversationEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ChatConversationEntityListing>() {}, callback);
  }

  /**
   * Get recent chat conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ChatConversationEntityListing>> getConversationsChatsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ChatConversationEntityListing>> callback) {
    return pcapiClient.<ChatConversationEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ChatConversationEntityListing>() {}, callback);
  }

  /**
   * Get cobrowse conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CobrowseConversation> getConversationsCobrowsesessionAsync(GetConversationsCobrowsesessionRequest request, AsyncApiCallback<CobrowseConversation> callback) {
    return pcapiClient.<CobrowseConversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CobrowseConversation>() {}, callback);
  }

  /**
   * Get cobrowse conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CobrowseConversation>> getConversationsCobrowsesessionAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CobrowseConversation>> callback) {
    return pcapiClient.<CobrowseConversation>invokeAPIVerboseAsync(request, new TypeReference<CobrowseConversation>() {}, callback);
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Wrapup> getConversationsCobrowsesessionParticipantWrapupAsync(GetConversationsCobrowsesessionParticipantWrapupRequest request, AsyncApiCallback<Wrapup> callback) {
    return pcapiClient.<Wrapup>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Wrapup>() {}, callback);
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Wrapup>> getConversationsCobrowsesessionParticipantWrapupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Wrapup>> callback) {
    return pcapiClient.<Wrapup>invokeAPIVerboseAsync(request, new TypeReference<Wrapup>() {}, callback);
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<WrapupCode>> getConversationsCobrowsesessionParticipantWrapupcodesAsync(GetConversationsCobrowsesessionParticipantWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<WrapupCode>>> getConversationsCobrowsesessionParticipantWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerboseAsync(request, new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Get recent cobrowse conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CobrowseConversationEntityListing> getConversationsCobrowsesessionsAsync(GetConversationsCobrowsesessionsRequest request, AsyncApiCallback<CobrowseConversationEntityListing> callback) {
    return pcapiClient.<CobrowseConversationEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CobrowseConversationEntityListing>() {}, callback);
  }

  /**
   * Get recent cobrowse conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CobrowseConversationEntityListing>> getConversationsCobrowsesessionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CobrowseConversationEntityListing>> callback) {
    return pcapiClient.<CobrowseConversationEntityListing>invokeAPIVerboseAsync(request, new TypeReference<CobrowseConversationEntityListing>() {}, callback);
  }

  /**
   * Get email conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EmailConversation> getConversationsEmailAsync(GetConversationsEmailRequest request, AsyncApiCallback<EmailConversation> callback) {
    return pcapiClient.<EmailConversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EmailConversation>() {}, callback);
  }

  /**
   * Get email conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EmailConversation>> getConversationsEmailAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EmailConversation>> callback) {
    return pcapiClient.<EmailConversation>invokeAPIVerboseAsync(request, new TypeReference<EmailConversation>() {}, callback);
  }

  /**
   * Get conversation message
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EmailMessage> getConversationsEmailMessageAsync(GetConversationsEmailMessageRequest request, AsyncApiCallback<EmailMessage> callback) {
    return pcapiClient.<EmailMessage>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EmailMessage>() {}, callback);
  }

  /**
   * Get conversation message
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EmailMessage>> getConversationsEmailMessageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EmailMessage>> callback) {
    return pcapiClient.<EmailMessage>invokeAPIVerboseAsync(request, new TypeReference<EmailMessage>() {}, callback);
  }

  /**
   * Get conversation messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EmailMessageListing> getConversationsEmailMessagesAsync(GetConversationsEmailMessagesRequest request, AsyncApiCallback<EmailMessageListing> callback) {
    return pcapiClient.<EmailMessageListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EmailMessageListing>() {}, callback);
  }

  /**
   * Get conversation messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EmailMessageListing>> getConversationsEmailMessagesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EmailMessageListing>> callback) {
    return pcapiClient.<EmailMessageListing>invokeAPIVerboseAsync(request, new TypeReference<EmailMessageListing>() {}, callback);
  }

  /**
   * Get conversation draft reply
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EmailMessage> getConversationsEmailMessagesDraftAsync(GetConversationsEmailMessagesDraftRequest request, AsyncApiCallback<EmailMessage> callback) {
    return pcapiClient.<EmailMessage>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EmailMessage>() {}, callback);
  }

  /**
   * Get conversation draft reply
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EmailMessage>> getConversationsEmailMessagesDraftAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EmailMessage>> callback) {
    return pcapiClient.<EmailMessage>invokeAPIVerboseAsync(request, new TypeReference<EmailMessage>() {}, callback);
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Wrapup> getConversationsEmailParticipantWrapupAsync(GetConversationsEmailParticipantWrapupRequest request, AsyncApiCallback<Wrapup> callback) {
    return pcapiClient.<Wrapup>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Wrapup>() {}, callback);
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Wrapup>> getConversationsEmailParticipantWrapupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Wrapup>> callback) {
    return pcapiClient.<Wrapup>invokeAPIVerboseAsync(request, new TypeReference<Wrapup>() {}, callback);
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<WrapupCode>> getConversationsEmailParticipantWrapupcodesAsync(GetConversationsEmailParticipantWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<WrapupCode>>> getConversationsEmailParticipantWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerboseAsync(request, new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Get recent email conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EmailConversationEntityListing> getConversationsEmailsAsync(GetConversationsEmailsRequest request, AsyncApiCallback<EmailConversationEntityListing> callback) {
    return pcapiClient.<EmailConversationEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EmailConversationEntityListing>() {}, callback);
  }

  /**
   * Get recent email conversations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EmailConversationEntityListing>> getConversationsEmailsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EmailConversationEntityListing>> callback) {
    return pcapiClient.<EmailConversationEntityListing>invokeAPIVerboseAsync(request, new TypeReference<EmailConversationEntityListing>() {}, callback);
  }

  /**
   * Update a participant.
   * Update conversation participant.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchConversationParticipantAsync(PatchConversationParticipantRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Update a participant.
   * Update conversation participant.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchConversationParticipantAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchConversationParticipantAttributesAsync(PatchConversationParticipantAttributesRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchConversationParticipantAttributesAsync(ApiRequest<ParticipantAttributes> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Conversation> patchConversationsCallAsync(PatchConversationsCallRequest request, AsyncApiCallback<Conversation> callback) {
    return pcapiClient.<Conversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Conversation>> patchConversationsCallAsync(ApiRequest<Conversation> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    return pcapiClient.<Conversation>invokeAPIVerboseAsync(request, new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchConversationsCallParticipantAsync(PatchConversationsCallParticipantRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchConversationsCallParticipantAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchConversationsCallParticipantAttributesAsync(PatchConversationsCallParticipantAttributesRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchConversationsCallParticipantAttributesAsync(ApiRequest<ParticipantAttributes> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> patchConversationsCallParticipantCommunicationAsync(PatchConversationsCallParticipantCommunicationRequest request, AsyncApiCallback<Empty> callback) {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> patchConversationsCallParticipantCommunicationAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Empty>> callback) {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Change who can speak
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ConsultTransferResponse> patchConversationsCallParticipantConsultAsync(PatchConversationsCallParticipantConsultRequest request, AsyncApiCallback<ConsultTransferResponse> callback) {
    return pcapiClient.<ConsultTransferResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ConsultTransferResponse>() {}, callback);
  }

  /**
   * Change who can speak
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ConsultTransferResponse>> patchConversationsCallParticipantConsultAsync(ApiRequest<ConsultTransferUpdate> request, AsyncApiCallback<ApiResponse<ConsultTransferResponse>> callback) {
    return pcapiClient.<ConsultTransferResponse>invokeAPIVerboseAsync(request, new TypeReference<ConsultTransferResponse>() {}, callback);
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Conversation> patchConversationsCallbackAsync(PatchConversationsCallbackRequest request, AsyncApiCallback<Conversation> callback) {
    return pcapiClient.<Conversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Conversation>> patchConversationsCallbackAsync(ApiRequest<Conversation> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    return pcapiClient.<Conversation>invokeAPIVerboseAsync(request, new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchConversationsCallbackParticipantAsync(PatchConversationsCallbackParticipantRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchConversationsCallbackParticipantAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchConversationsCallbackParticipantAttributesAsync(PatchConversationsCallbackParticipantAttributesRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchConversationsCallbackParticipantAttributesAsync(ApiRequest<ParticipantAttributes> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> patchConversationsCallbackParticipantCommunicationAsync(PatchConversationsCallbackParticipantCommunicationRequest request, AsyncApiCallback<Empty> callback) {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> patchConversationsCallbackParticipantCommunicationAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Empty>> callback) {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Conversation> patchConversationsChatAsync(PatchConversationsChatRequest request, AsyncApiCallback<Conversation> callback) {
    return pcapiClient.<Conversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Conversation>> patchConversationsChatAsync(ApiRequest<Conversation> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    return pcapiClient.<Conversation>invokeAPIVerboseAsync(request, new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchConversationsChatParticipantAsync(PatchConversationsChatParticipantRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchConversationsChatParticipantAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchConversationsChatParticipantAttributesAsync(PatchConversationsChatParticipantAttributesRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchConversationsChatParticipantAttributesAsync(ApiRequest<ParticipantAttributes> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> patchConversationsChatParticipantCommunicationAsync(PatchConversationsChatParticipantCommunicationRequest request, AsyncApiCallback<Empty> callback) {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> patchConversationsChatParticipantCommunicationAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Empty>> callback) {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Conversation> patchConversationsCobrowsesessionAsync(PatchConversationsCobrowsesessionRequest request, AsyncApiCallback<Conversation> callback) {
    return pcapiClient.<Conversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Conversation>> patchConversationsCobrowsesessionAsync(ApiRequest<Conversation> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    return pcapiClient.<Conversation>invokeAPIVerboseAsync(request, new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchConversationsCobrowsesessionParticipantAsync(PatchConversationsCobrowsesessionParticipantRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchConversationsCobrowsesessionParticipantAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchConversationsCobrowsesessionParticipantAttributesAsync(PatchConversationsCobrowsesessionParticipantAttributesRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchConversationsCobrowsesessionParticipantAttributesAsync(ApiRequest<ParticipantAttributes> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> patchConversationsCobrowsesessionParticipantCommunicationAsync(PatchConversationsCobrowsesessionParticipantCommunicationRequest request, AsyncApiCallback<Empty> callback) {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> patchConversationsCobrowsesessionParticipantCommunicationAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Empty>> callback) {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Conversation> patchConversationsEmailAsync(PatchConversationsEmailRequest request, AsyncApiCallback<Conversation> callback) {
    return pcapiClient.<Conversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Conversation>> patchConversationsEmailAsync(ApiRequest<Conversation> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    return pcapiClient.<Conversation>invokeAPIVerboseAsync(request, new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchConversationsEmailParticipantAsync(PatchConversationsEmailParticipantRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Update conversation participant
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchConversationsEmailParticipantAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchConversationsEmailParticipantAttributesAsync(PatchConversationsEmailParticipantAttributesRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchConversationsEmailParticipantAttributesAsync(ApiRequest<ParticipantAttributes> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> patchConversationsEmailParticipantCommunicationAsync(PatchConversationsEmailParticipantCommunicationRequest request, AsyncApiCallback<Empty> callback) {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> patchConversationsEmailParticipantCommunicationAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Empty>> callback) {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Index conversation properties
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PropertyIndexRequest> postAnalyticsConversationDetailsPropertiesAsync(PostAnalyticsConversationDetailsPropertiesRequest request, AsyncApiCallback<PropertyIndexRequest> callback) {
    return pcapiClient.<PropertyIndexRequest>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PropertyIndexRequest>() {}, callback);
  }

  /**
   * Index conversation properties
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PropertyIndexRequest>> postAnalyticsConversationDetailsPropertiesAsync(ApiRequest<PropertyIndexRequest> request, AsyncApiCallback<ApiResponse<PropertyIndexRequest>> callback) {
    return pcapiClient.<PropertyIndexRequest>invokeAPIVerboseAsync(request, new TypeReference<PropertyIndexRequest>() {}, callback);
  }

  /**
   * Query for conversation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AggregateQueryResponse> postAnalyticsConversationsAggregatesQueryAsync(PostAnalyticsConversationsAggregatesQueryRequest request, AsyncApiCallback<AggregateQueryResponse> callback) {
    return pcapiClient.<AggregateQueryResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {}, callback);
  }

  /**
   * Query for conversation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AggregateQueryResponse>> postAnalyticsConversationsAggregatesQueryAsync(ApiRequest<AggregationQuery> request, AsyncApiCallback<ApiResponse<AggregateQueryResponse>> callback) {
    return pcapiClient.<AggregateQueryResponse>invokeAPIVerboseAsync(request, new TypeReference<AggregateQueryResponse>() {}, callback);
  }

  /**
   * Query for conversation details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQueryAsync(PostAnalyticsConversationsDetailsQueryRequest request, AsyncApiCallback<AnalyticsConversationQueryResponse> callback) {
    return pcapiClient.<AnalyticsConversationQueryResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversationQueryResponse>() {}, callback);
  }

  /**
   * Query for conversation details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AnalyticsConversationQueryResponse>> postAnalyticsConversationsDetailsQueryAsync(ApiRequest<ConversationQuery> request, AsyncApiCallback<ApiResponse<AnalyticsConversationQueryResponse>> callback) {
    return pcapiClient.<AnalyticsConversationQueryResponse>invokeAPIVerboseAsync(request, new TypeReference<AnalyticsConversationQueryResponse>() {}, callback);
  }

  /**
   * Create a new callback for the specified participant on the conversation.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postConversationParticipantCallbacksAsync(PostConversationParticipantCallbacksRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Create a new callback for the specified participant on the conversation.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postConversationParticipantCallbacksAsync(ApiRequest<CreateCallbackCommand> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postConversationParticipantReplaceAsync(PostConversationParticipantReplaceRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postConversationParticipantReplaceAsync(ApiRequest<TransferRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Add a new call to a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Conversation> postConversationsCallAsync(PostConversationsCallRequest request, AsyncApiCallback<Conversation> callback) {
    return pcapiClient.<Conversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Add a new call to a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Conversation>> postConversationsCallAsync(ApiRequest<CallCommand> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    return pcapiClient.<Conversation>invokeAPIVerboseAsync(request, new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Initiate and update consult transfer
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ConsultTransferResponse> postConversationsCallParticipantConsultAsync(PostConversationsCallParticipantConsultRequest request, AsyncApiCallback<ConsultTransferResponse> callback) {
    return pcapiClient.<ConsultTransferResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ConsultTransferResponse>() {}, callback);
  }

  /**
   * Initiate and update consult transfer
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ConsultTransferResponse>> postConversationsCallParticipantConsultAsync(ApiRequest<ConsultTransfer> request, AsyncApiCallback<ApiResponse<ConsultTransferResponse>> callback) {
    return pcapiClient.<ConsultTransferResponse>invokeAPIVerboseAsync(request, new TypeReference<ConsultTransferResponse>() {}, callback);
  }

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postConversationsCallParticipantMonitorAsync(PostConversationsCallParticipantMonitorRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postConversationsCallParticipantMonitorAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postConversationsCallParticipantReplaceAsync(PostConversationsCallParticipantReplaceRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postConversationsCallParticipantReplaceAsync(ApiRequest<TransferRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Add participants to a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Conversation> postConversationsCallParticipantsAsync(PostConversationsCallParticipantsRequest request, AsyncApiCallback<Conversation> callback) {
    return pcapiClient.<Conversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Add participants to a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Conversation>> postConversationsCallParticipantsAsync(ApiRequest<Conversation> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    return pcapiClient.<Conversation>invokeAPIVerboseAsync(request, new TypeReference<Conversation>() {}, callback);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postConversationsCallbackParticipantReplaceAsync(PostConversationsCallbackParticipantReplaceRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postConversationsCallbackParticipantReplaceAsync(ApiRequest<TransferRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Create a Callback
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CreateCallbackResponse> postConversationsCallbacksAsync(PostConversationsCallbacksRequest request, AsyncApiCallback<CreateCallbackResponse> callback) {
    return pcapiClient.<CreateCallbackResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CreateCallbackResponse>() {}, callback);
  }

  /**
   * Create a Callback
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CreateCallbackResponse>> postConversationsCallbacksAsync(ApiRequest<CreateCallbackCommand> request, AsyncApiCallback<ApiResponse<CreateCallbackResponse>> callback) {
    return pcapiClient.<CreateCallbackResponse>invokeAPIVerboseAsync(request, new TypeReference<CreateCallbackResponse>() {}, callback);
  }

  /**
   * Create a call conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CreateCallResponse> postConversationsCallsAsync(PostConversationsCallsRequest request, AsyncApiCallback<CreateCallResponse> callback) {
    return pcapiClient.<CreateCallResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CreateCallResponse>() {}, callback);
  }

  /**
   * Create a call conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CreateCallResponse>> postConversationsCallsAsync(ApiRequest<CreateCallRequest> request, AsyncApiCallback<ApiResponse<CreateCallResponse>> callback) {
    return pcapiClient.<CreateCallResponse>invokeAPIVerboseAsync(request, new TypeReference<CreateCallResponse>() {}, callback);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postConversationsChatParticipantReplaceAsync(PostConversationsChatParticipantReplaceRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postConversationsChatParticipantReplaceAsync(ApiRequest<TransferRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Create a web chat conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ChatConversation> postConversationsChatsAsync(PostConversationsChatsRequest request, AsyncApiCallback<ChatConversation> callback) {
    return pcapiClient.<ChatConversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ChatConversation>() {}, callback);
  }

  /**
   * Create a web chat conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ChatConversation>> postConversationsChatsAsync(ApiRequest<CreateWebChatRequest> request, AsyncApiCallback<ApiResponse<ChatConversation>> callback) {
    return pcapiClient.<ChatConversation>invokeAPIVerboseAsync(request, new TypeReference<ChatConversation>() {}, callback);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postConversationsCobrowsesessionParticipantReplaceAsync(PostConversationsCobrowsesessionParticipantReplaceRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postConversationsCobrowsesessionParticipantReplaceAsync(ApiRequest<TransferRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Send an email reply
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EmailMessage> postConversationsEmailMessagesAsync(PostConversationsEmailMessagesRequest request, AsyncApiCallback<EmailMessage> callback) {
    return pcapiClient.<EmailMessage>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EmailMessage>() {}, callback);
  }

  /**
   * Send an email reply
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EmailMessage>> postConversationsEmailMessagesAsync(ApiRequest<EmailMessage> request, AsyncApiCallback<ApiResponse<EmailMessage>> callback) {
    return pcapiClient.<EmailMessage>invokeAPIVerboseAsync(request, new TypeReference<EmailMessage>() {}, callback);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postConversationsEmailParticipantReplaceAsync(PostConversationsEmailParticipantReplaceRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postConversationsEmailParticipantReplaceAsync(ApiRequest<TransferRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Create an email conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EmailConversation> postConversationsEmailsAsync(PostConversationsEmailsRequest request, AsyncApiCallback<EmailConversation> callback) {
    return pcapiClient.<EmailConversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EmailConversation>() {}, callback);
  }

  /**
   * Create an email conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EmailConversation>> postConversationsEmailsAsync(ApiRequest<CreateEmailRequest> request, AsyncApiCallback<ApiResponse<EmailConversation>> callback) {
    return pcapiClient.<EmailConversation>invokeAPIVerboseAsync(request, new TypeReference<EmailConversation>() {}, callback);
  }

  /**
   * Create Fax Conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<FaxSendResponse> postConversationsFaxesAsync(PostConversationsFaxesRequest request, AsyncApiCallback<FaxSendResponse> callback) {
    return pcapiClient.<FaxSendResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<FaxSendResponse>() {}, callback);
  }

  /**
   * Create Fax Conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<FaxSendResponse>> postConversationsFaxesAsync(ApiRequest<FaxSendRequest> request, AsyncApiCallback<ApiResponse<FaxSendResponse>> callback) {
    return pcapiClient.<FaxSendResponse>invokeAPIVerboseAsync(request, new TypeReference<FaxSendResponse>() {}, callback);
  }

  /**
   * Update conversation draft reply
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EmailMessage> putConversationsEmailMessagesDraftAsync(PutConversationsEmailMessagesDraftRequest request, AsyncApiCallback<EmailMessage> callback) {
    return pcapiClient.<EmailMessage>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EmailMessage>() {}, callback);
  }

  /**
   * Update conversation draft reply
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EmailMessage>> putConversationsEmailMessagesDraftAsync(ApiRequest<EmailMessage> request, AsyncApiCallback<ApiResponse<EmailMessage>> callback) {
    return pcapiClient.<EmailMessage>invokeAPIVerboseAsync(request, new TypeReference<EmailMessage>() {}, callback);
  }

}
