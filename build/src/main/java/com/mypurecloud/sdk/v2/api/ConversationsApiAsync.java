package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;

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
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteConversationParticipantCodeAsync(DeleteConversationParticipantCodeRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a code used to add a communication to this participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteConversationParticipantCodeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Cancel the transfer
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteConversationsCallParticipantConsultAsync(DeleteConversationsCallParticipantConsultRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Cancel the transfer
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteConversationsCallParticipantConsultAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete attachment from draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteConversationsEmailMessagesDraftAttachmentAsync(DeleteConversationsEmailMessagesDraftAttachmentRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete attachment from draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteConversationsEmailMessagesDraftAttachmentAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a conversation by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AnalyticsConversation> getAnalyticsConversationDetailsAsync(GetAnalyticsConversationDetailsRequest request, AsyncApiCallback<AnalyticsConversation> callback) {
    try {
      SettableFuture<AnalyticsConversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversation>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversation>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a conversation by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AnalyticsConversation>> getAnalyticsConversationDetailsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<AnalyticsConversation>> callback) {
    try {
      SettableFuture<ApiResponse<AnalyticsConversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AnalyticsConversation>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversation>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversation> response = (ApiResponse<AnalyticsConversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversation> response = (ApiResponse<AnalyticsConversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Conversation> getConversationAsync(GetConversationRequest request, AsyncApiCallback<Conversation> callback) {
    try {
      SettableFuture<Conversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Conversation>> getConversationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    try {
      SettableFuture<ApiResponse<Conversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WrapupCode> getConversationParticipantWrapupAsync(GetConversationParticipantWrapupRequest request, AsyncApiCallback<WrapupCode> callback) {
    try {
      SettableFuture<WrapupCode> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WrapupCode>() {}, new AsyncApiCallback<ApiResponse<WrapupCode>>() {
        @Override
        public void onCompleted(ApiResponse<WrapupCode> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WrapupCode>> getConversationParticipantWrapupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WrapupCode>> callback) {
    try {
      SettableFuture<ApiResponse<WrapupCode>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WrapupCode>() {}, new AsyncApiCallback<ApiResponse<WrapupCode>>() {
        @Override
        public void onCompleted(ApiResponse<WrapupCode> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<WrapupCode>> getConversationParticipantWrapupcodesAsync(GetConversationParticipantWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    try {
      SettableFuture<List<WrapupCode>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<WrapupCode>>> getConversationParticipantWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    try {
      SettableFuture<ApiResponse<List<WrapupCode>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ConversationEntityListing> getConversationsAsync(GetConversationsRequest request, AsyncApiCallback<ConversationEntityListing> callback) {
    try {
      SettableFuture<ConversationEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<ConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ConversationEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ConversationEntityListing>> getConversationsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ConversationEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<ConversationEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<ConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ConversationEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ConversationEntityListing> response = (ApiResponse<ConversationEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ConversationEntityListing> response = (ApiResponse<ConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get call conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CallConversation> getConversationsCallAsync(GetConversationsCallRequest request, AsyncApiCallback<CallConversation> callback) {
    try {
      SettableFuture<CallConversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CallConversation>() {}, new AsyncApiCallback<ApiResponse<CallConversation>>() {
        @Override
        public void onCompleted(ApiResponse<CallConversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get call conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CallConversation>> getConversationsCallAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CallConversation>> callback) {
    try {
      SettableFuture<ApiResponse<CallConversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CallConversation>() {}, new AsyncApiCallback<ApiResponse<CallConversation>>() {
        @Override
        public void onCompleted(ApiResponse<CallConversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CallConversation> response = (ApiResponse<CallConversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CallConversation> response = (ApiResponse<CallConversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Wrapup> getConversationsCallParticipantWrapupAsync(GetConversationsCallParticipantWrapupRequest request, AsyncApiCallback<Wrapup> callback) {
    try {
      SettableFuture<Wrapup> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Wrapup>() {}, new AsyncApiCallback<ApiResponse<Wrapup>>() {
        @Override
        public void onCompleted(ApiResponse<Wrapup> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Wrapup>> getConversationsCallParticipantWrapupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Wrapup>> callback) {
    try {
      SettableFuture<ApiResponse<Wrapup>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Wrapup>() {}, new AsyncApiCallback<ApiResponse<Wrapup>>() {
        @Override
        public void onCompleted(ApiResponse<Wrapup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<WrapupCode>> getConversationsCallParticipantWrapupcodesAsync(GetConversationsCallParticipantWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    try {
      SettableFuture<List<WrapupCode>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<WrapupCode>>> getConversationsCallParticipantWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    try {
      SettableFuture<ApiResponse<List<WrapupCode>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get callback conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CallbackConversation> getConversationsCallbackAsync(GetConversationsCallbackRequest request, AsyncApiCallback<CallbackConversation> callback) {
    try {
      SettableFuture<CallbackConversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CallbackConversation>() {}, new AsyncApiCallback<ApiResponse<CallbackConversation>>() {
        @Override
        public void onCompleted(ApiResponse<CallbackConversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get callback conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CallbackConversation>> getConversationsCallbackAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CallbackConversation>> callback) {
    try {
      SettableFuture<ApiResponse<CallbackConversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CallbackConversation>() {}, new AsyncApiCallback<ApiResponse<CallbackConversation>>() {
        @Override
        public void onCompleted(ApiResponse<CallbackConversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CallbackConversation> response = (ApiResponse<CallbackConversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CallbackConversation> response = (ApiResponse<CallbackConversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Wrapup> getConversationsCallbackParticipantWrapupAsync(GetConversationsCallbackParticipantWrapupRequest request, AsyncApiCallback<Wrapup> callback) {
    try {
      SettableFuture<Wrapup> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Wrapup>() {}, new AsyncApiCallback<ApiResponse<Wrapup>>() {
        @Override
        public void onCompleted(ApiResponse<Wrapup> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Wrapup>> getConversationsCallbackParticipantWrapupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Wrapup>> callback) {
    try {
      SettableFuture<ApiResponse<Wrapup>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Wrapup>() {}, new AsyncApiCallback<ApiResponse<Wrapup>>() {
        @Override
        public void onCompleted(ApiResponse<Wrapup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<WrapupCode>> getConversationsCallbackParticipantWrapupcodesAsync(GetConversationsCallbackParticipantWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    try {
      SettableFuture<List<WrapupCode>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<WrapupCode>>> getConversationsCallbackParticipantWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    try {
      SettableFuture<ApiResponse<List<WrapupCode>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get callback conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CallbackConversationEntityListing> getConversationsCallbacksAsync(GetConversationsCallbacksRequest request, AsyncApiCallback<CallbackConversationEntityListing> callback) {
    try {
      SettableFuture<CallbackConversationEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CallbackConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<CallbackConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CallbackConversationEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get callback conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CallbackConversationEntityListing>> getConversationsCallbacksAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CallbackConversationEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<CallbackConversationEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CallbackConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<CallbackConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CallbackConversationEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CallbackConversationEntityListing> response = (ApiResponse<CallbackConversationEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CallbackConversationEntityListing> response = (ApiResponse<CallbackConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get recent conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CallConversationEntityListing> getConversationsCallsAsync(GetConversationsCallsRequest request, AsyncApiCallback<CallConversationEntityListing> callback) {
    try {
      SettableFuture<CallConversationEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CallConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<CallConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CallConversationEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get recent conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CallConversationEntityListing>> getConversationsCallsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CallConversationEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<CallConversationEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CallConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<CallConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CallConversationEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CallConversationEntityListing> response = (ApiResponse<CallConversationEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CallConversationEntityListing> response = (ApiResponse<CallConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get call history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CallConversationEntityListing> getConversationsCallsHistoryAsync(GetConversationsCallsHistoryRequest request, AsyncApiCallback<CallConversationEntityListing> callback) {
    try {
      SettableFuture<CallConversationEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CallConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<CallConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CallConversationEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get call history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CallConversationEntityListing>> getConversationsCallsHistoryAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CallConversationEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<CallConversationEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CallConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<CallConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CallConversationEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CallConversationEntityListing> response = (ApiResponse<CallConversationEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CallConversationEntityListing> response = (ApiResponse<CallConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MaxParticipants> getConversationsCallsMaximumconferencepartiesAsync(GetConversationsCallsMaximumconferencepartiesRequest request, AsyncApiCallback<MaxParticipants> callback) {
    try {
      SettableFuture<MaxParticipants> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MaxParticipants>() {}, new AsyncApiCallback<ApiResponse<MaxParticipants>>() {
        @Override
        public void onCompleted(ApiResponse<MaxParticipants> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MaxParticipants>> getConversationsCallsMaximumconferencepartiesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<MaxParticipants>> callback) {
    try {
      SettableFuture<ApiResponse<MaxParticipants>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MaxParticipants>() {}, new AsyncApiCallback<ApiResponse<MaxParticipants>>() {
        @Override
        public void onCompleted(ApiResponse<MaxParticipants> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MaxParticipants> response = (ApiResponse<MaxParticipants>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MaxParticipants> response = (ApiResponse<MaxParticipants>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get chat conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ChatConversation> getConversationsChatAsync(GetConversationsChatRequest request, AsyncApiCallback<ChatConversation> callback) {
    try {
      SettableFuture<ChatConversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ChatConversation>() {}, new AsyncApiCallback<ApiResponse<ChatConversation>>() {
        @Override
        public void onCompleted(ApiResponse<ChatConversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get chat conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ChatConversation>> getConversationsChatAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ChatConversation>> callback) {
    try {
      SettableFuture<ApiResponse<ChatConversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ChatConversation>() {}, new AsyncApiCallback<ApiResponse<ChatConversation>>() {
        @Override
        public void onCompleted(ApiResponse<ChatConversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ChatConversation> response = (ApiResponse<ChatConversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ChatConversation> response = (ApiResponse<ChatConversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Wrapup> getConversationsChatParticipantWrapupAsync(GetConversationsChatParticipantWrapupRequest request, AsyncApiCallback<Wrapup> callback) {
    try {
      SettableFuture<Wrapup> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Wrapup>() {}, new AsyncApiCallback<ApiResponse<Wrapup>>() {
        @Override
        public void onCompleted(ApiResponse<Wrapup> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Wrapup>> getConversationsChatParticipantWrapupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Wrapup>> callback) {
    try {
      SettableFuture<ApiResponse<Wrapup>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Wrapup>() {}, new AsyncApiCallback<ApiResponse<Wrapup>>() {
        @Override
        public void onCompleted(ApiResponse<Wrapup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<WrapupCode>> getConversationsChatParticipantWrapupcodesAsync(GetConversationsChatParticipantWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    try {
      SettableFuture<List<WrapupCode>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<WrapupCode>>> getConversationsChatParticipantWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    try {
      SettableFuture<ApiResponse<List<WrapupCode>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get recent chat conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ChatConversationEntityListing> getConversationsChatsAsync(GetConversationsChatsRequest request, AsyncApiCallback<ChatConversationEntityListing> callback) {
    try {
      SettableFuture<ChatConversationEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ChatConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<ChatConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ChatConversationEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get recent chat conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ChatConversationEntityListing>> getConversationsChatsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ChatConversationEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<ChatConversationEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ChatConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<ChatConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ChatConversationEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ChatConversationEntityListing> response = (ApiResponse<ChatConversationEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ChatConversationEntityListing> response = (ApiResponse<ChatConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get cobrowse conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CobrowseConversation> getConversationsCobrowsesessionAsync(GetConversationsCobrowsesessionRequest request, AsyncApiCallback<CobrowseConversation> callback) {
    try {
      SettableFuture<CobrowseConversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CobrowseConversation>() {}, new AsyncApiCallback<ApiResponse<CobrowseConversation>>() {
        @Override
        public void onCompleted(ApiResponse<CobrowseConversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get cobrowse conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CobrowseConversation>> getConversationsCobrowsesessionAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CobrowseConversation>> callback) {
    try {
      SettableFuture<ApiResponse<CobrowseConversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CobrowseConversation>() {}, new AsyncApiCallback<ApiResponse<CobrowseConversation>>() {
        @Override
        public void onCompleted(ApiResponse<CobrowseConversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CobrowseConversation> response = (ApiResponse<CobrowseConversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CobrowseConversation> response = (ApiResponse<CobrowseConversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Wrapup> getConversationsCobrowsesessionParticipantWrapupAsync(GetConversationsCobrowsesessionParticipantWrapupRequest request, AsyncApiCallback<Wrapup> callback) {
    try {
      SettableFuture<Wrapup> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Wrapup>() {}, new AsyncApiCallback<ApiResponse<Wrapup>>() {
        @Override
        public void onCompleted(ApiResponse<Wrapup> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Wrapup>> getConversationsCobrowsesessionParticipantWrapupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Wrapup>> callback) {
    try {
      SettableFuture<ApiResponse<Wrapup>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Wrapup>() {}, new AsyncApiCallback<ApiResponse<Wrapup>>() {
        @Override
        public void onCompleted(ApiResponse<Wrapup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<WrapupCode>> getConversationsCobrowsesessionParticipantWrapupcodesAsync(GetConversationsCobrowsesessionParticipantWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    try {
      SettableFuture<List<WrapupCode>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<WrapupCode>>> getConversationsCobrowsesessionParticipantWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    try {
      SettableFuture<ApiResponse<List<WrapupCode>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get recent cobrowse conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CobrowseConversationEntityListing> getConversationsCobrowsesessionsAsync(GetConversationsCobrowsesessionsRequest request, AsyncApiCallback<CobrowseConversationEntityListing> callback) {
    try {
      SettableFuture<CobrowseConversationEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CobrowseConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<CobrowseConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CobrowseConversationEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get recent cobrowse conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CobrowseConversationEntityListing>> getConversationsCobrowsesessionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CobrowseConversationEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<CobrowseConversationEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CobrowseConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<CobrowseConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CobrowseConversationEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CobrowseConversationEntityListing> response = (ApiResponse<CobrowseConversationEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CobrowseConversationEntityListing> response = (ApiResponse<CobrowseConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get email conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailConversation> getConversationsEmailAsync(GetConversationsEmailRequest request, AsyncApiCallback<EmailConversation> callback) {
    try {
      SettableFuture<EmailConversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailConversation>() {}, new AsyncApiCallback<ApiResponse<EmailConversation>>() {
        @Override
        public void onCompleted(ApiResponse<EmailConversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get email conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailConversation>> getConversationsEmailAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EmailConversation>> callback) {
    try {
      SettableFuture<ApiResponse<EmailConversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailConversation>() {}, new AsyncApiCallback<ApiResponse<EmailConversation>>() {
        @Override
        public void onCompleted(ApiResponse<EmailConversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailConversation> response = (ApiResponse<EmailConversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailConversation> response = (ApiResponse<EmailConversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get conversation message
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailMessage> getConversationsEmailMessageAsync(GetConversationsEmailMessageRequest request, AsyncApiCallback<EmailMessage> callback) {
    try {
      SettableFuture<EmailMessage> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailMessage>() {}, new AsyncApiCallback<ApiResponse<EmailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<EmailMessage> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get conversation message
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailMessage>> getConversationsEmailMessageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EmailMessage>> callback) {
    try {
      SettableFuture<ApiResponse<EmailMessage>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailMessage>() {}, new AsyncApiCallback<ApiResponse<EmailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<EmailMessage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get conversation messages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailMessageListing> getConversationsEmailMessagesAsync(GetConversationsEmailMessagesRequest request, AsyncApiCallback<EmailMessageListing> callback) {
    try {
      SettableFuture<EmailMessageListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailMessageListing>() {}, new AsyncApiCallback<ApiResponse<EmailMessageListing>>() {
        @Override
        public void onCompleted(ApiResponse<EmailMessageListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get conversation messages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailMessageListing>> getConversationsEmailMessagesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EmailMessageListing>> callback) {
    try {
      SettableFuture<ApiResponse<EmailMessageListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailMessageListing>() {}, new AsyncApiCallback<ApiResponse<EmailMessageListing>>() {
        @Override
        public void onCompleted(ApiResponse<EmailMessageListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailMessageListing> response = (ApiResponse<EmailMessageListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailMessageListing> response = (ApiResponse<EmailMessageListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get conversation draft reply
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailMessage> getConversationsEmailMessagesDraftAsync(GetConversationsEmailMessagesDraftRequest request, AsyncApiCallback<EmailMessage> callback) {
    try {
      SettableFuture<EmailMessage> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailMessage>() {}, new AsyncApiCallback<ApiResponse<EmailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<EmailMessage> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get conversation draft reply
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailMessage>> getConversationsEmailMessagesDraftAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EmailMessage>> callback) {
    try {
      SettableFuture<ApiResponse<EmailMessage>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailMessage>() {}, new AsyncApiCallback<ApiResponse<EmailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<EmailMessage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Wrapup> getConversationsEmailParticipantWrapupAsync(GetConversationsEmailParticipantWrapupRequest request, AsyncApiCallback<Wrapup> callback) {
    try {
      SettableFuture<Wrapup> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Wrapup>() {}, new AsyncApiCallback<ApiResponse<Wrapup>>() {
        @Override
        public void onCompleted(ApiResponse<Wrapup> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Wrapup>> getConversationsEmailParticipantWrapupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Wrapup>> callback) {
    try {
      SettableFuture<ApiResponse<Wrapup>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Wrapup>() {}, new AsyncApiCallback<ApiResponse<Wrapup>>() {
        @Override
        public void onCompleted(ApiResponse<Wrapup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Wrapup> response = (ApiResponse<Wrapup>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<WrapupCode>> getConversationsEmailParticipantWrapupcodesAsync(GetConversationsEmailParticipantWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    try {
      SettableFuture<List<WrapupCode>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<WrapupCode>>> getConversationsEmailParticipantWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    try {
      SettableFuture<ApiResponse<List<WrapupCode>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get recent email conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailConversationEntityListing> getConversationsEmailsAsync(GetConversationsEmailsRequest request, AsyncApiCallback<EmailConversationEntityListing> callback) {
    try {
      SettableFuture<EmailConversationEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<EmailConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EmailConversationEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get recent email conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailConversationEntityListing>> getConversationsEmailsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EmailConversationEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<EmailConversationEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailConversationEntityListing>() {}, new AsyncApiCallback<ApiResponse<EmailConversationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EmailConversationEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailConversationEntityListing> response = (ApiResponse<EmailConversationEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailConversationEntityListing> response = (ApiResponse<EmailConversationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a participant.
   * Update conversation participant.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchConversationParticipantAsync(PatchConversationParticipantRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a participant.
   * Update conversation participant.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchConversationParticipantAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchConversationParticipantAttributesAsync(PatchConversationParticipantAttributesRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchConversationParticipantAttributesAsync(ApiRequest<ParticipantAttributes> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Conversation> patchConversationsCallAsync(PatchConversationsCallRequest request, AsyncApiCallback<Conversation> callback) {
    try {
      SettableFuture<Conversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Conversation>> patchConversationsCallAsync(ApiRequest<Conversation> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    try {
      SettableFuture<ApiResponse<Conversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchConversationsCallParticipantAsync(PatchConversationsCallParticipantRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchConversationsCallParticipantAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchConversationsCallParticipantAttributesAsync(PatchConversationsCallParticipantAttributesRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchConversationsCallParticipantAttributesAsync(ApiRequest<ParticipantAttributes> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> patchConversationsCallParticipantCommunicationAsync(PatchConversationsCallParticipantCommunicationRequest request, AsyncApiCallback<Empty> callback) {
    try {
      SettableFuture<Empty> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> patchConversationsCallParticipantCommunicationAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Change who can speak
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ConsultTransferResponse> patchConversationsCallParticipantConsultAsync(PatchConversationsCallParticipantConsultRequest request, AsyncApiCallback<ConsultTransferResponse> callback) {
    try {
      SettableFuture<ConsultTransferResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ConsultTransferResponse>() {}, new AsyncApiCallback<ApiResponse<ConsultTransferResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ConsultTransferResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Change who can speak
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ConsultTransferResponse>> patchConversationsCallParticipantConsultAsync(ApiRequest<ConsultTransferUpdate> request, AsyncApiCallback<ApiResponse<ConsultTransferResponse>> callback) {
    try {
      SettableFuture<ApiResponse<ConsultTransferResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ConsultTransferResponse>() {}, new AsyncApiCallback<ApiResponse<ConsultTransferResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ConsultTransferResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ConsultTransferResponse> response = (ApiResponse<ConsultTransferResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ConsultTransferResponse> response = (ApiResponse<ConsultTransferResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Conversation> patchConversationsCallbackAsync(PatchConversationsCallbackRequest request, AsyncApiCallback<Conversation> callback) {
    try {
      SettableFuture<Conversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Conversation>> patchConversationsCallbackAsync(ApiRequest<Conversation> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    try {
      SettableFuture<ApiResponse<Conversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchConversationsCallbackParticipantAsync(PatchConversationsCallbackParticipantRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchConversationsCallbackParticipantAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchConversationsCallbackParticipantAttributesAsync(PatchConversationsCallbackParticipantAttributesRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchConversationsCallbackParticipantAttributesAsync(ApiRequest<ParticipantAttributes> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> patchConversationsCallbackParticipantCommunicationAsync(PatchConversationsCallbackParticipantCommunicationRequest request, AsyncApiCallback<Empty> callback) {
    try {
      SettableFuture<Empty> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> patchConversationsCallbackParticipantCommunicationAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Conversation> patchConversationsChatAsync(PatchConversationsChatRequest request, AsyncApiCallback<Conversation> callback) {
    try {
      SettableFuture<Conversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Conversation>> patchConversationsChatAsync(ApiRequest<Conversation> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    try {
      SettableFuture<ApiResponse<Conversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchConversationsChatParticipantAsync(PatchConversationsChatParticipantRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchConversationsChatParticipantAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchConversationsChatParticipantAttributesAsync(PatchConversationsChatParticipantAttributesRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchConversationsChatParticipantAttributesAsync(ApiRequest<ParticipantAttributes> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> patchConversationsChatParticipantCommunicationAsync(PatchConversationsChatParticipantCommunicationRequest request, AsyncApiCallback<Empty> callback) {
    try {
      SettableFuture<Empty> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> patchConversationsChatParticipantCommunicationAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Conversation> patchConversationsCobrowsesessionAsync(PatchConversationsCobrowsesessionRequest request, AsyncApiCallback<Conversation> callback) {
    try {
      SettableFuture<Conversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Conversation>> patchConversationsCobrowsesessionAsync(ApiRequest<Conversation> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    try {
      SettableFuture<ApiResponse<Conversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchConversationsCobrowsesessionParticipantAsync(PatchConversationsCobrowsesessionParticipantRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchConversationsCobrowsesessionParticipantAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchConversationsCobrowsesessionParticipantAttributesAsync(PatchConversationsCobrowsesessionParticipantAttributesRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchConversationsCobrowsesessionParticipantAttributesAsync(ApiRequest<ParticipantAttributes> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> patchConversationsCobrowsesessionParticipantCommunicationAsync(PatchConversationsCobrowsesessionParticipantCommunicationRequest request, AsyncApiCallback<Empty> callback) {
    try {
      SettableFuture<Empty> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> patchConversationsCobrowsesessionParticipantCommunicationAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Conversation> patchConversationsEmailAsync(PatchConversationsEmailRequest request, AsyncApiCallback<Conversation> callback) {
    try {
      SettableFuture<Conversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Conversation>> patchConversationsEmailAsync(ApiRequest<Conversation> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    try {
      SettableFuture<ApiResponse<Conversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchConversationsEmailParticipantAsync(PatchConversationsEmailParticipantRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchConversationsEmailParticipantAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchConversationsEmailParticipantAttributesAsync(PatchConversationsEmailParticipantAttributesRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchConversationsEmailParticipantAttributesAsync(ApiRequest<ParticipantAttributes> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> patchConversationsEmailParticipantCommunicationAsync(PatchConversationsEmailParticipantCommunicationRequest request, AsyncApiCallback<Empty> callback) {
    try {
      SettableFuture<Empty> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> patchConversationsEmailParticipantCommunicationAsync(ApiRequest<MediaParticipantRequest> request, AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Index conversation properties
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PropertyIndexRequest> postAnalyticsConversationDetailsPropertiesAsync(PostAnalyticsConversationDetailsPropertiesRequest request, AsyncApiCallback<PropertyIndexRequest> callback) {
    try {
      SettableFuture<PropertyIndexRequest> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PropertyIndexRequest>() {}, new AsyncApiCallback<ApiResponse<PropertyIndexRequest>>() {
        @Override
        public void onCompleted(ApiResponse<PropertyIndexRequest> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Index conversation properties
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PropertyIndexRequest>> postAnalyticsConversationDetailsPropertiesAsync(ApiRequest<PropertyIndexRequest> request, AsyncApiCallback<ApiResponse<PropertyIndexRequest>> callback) {
    try {
      SettableFuture<ApiResponse<PropertyIndexRequest>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PropertyIndexRequest>() {}, new AsyncApiCallback<ApiResponse<PropertyIndexRequest>>() {
        @Override
        public void onCompleted(ApiResponse<PropertyIndexRequest> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PropertyIndexRequest> response = (ApiResponse<PropertyIndexRequest>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PropertyIndexRequest> response = (ApiResponse<PropertyIndexRequest>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for conversation aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AggregateQueryResponse> postAnalyticsConversationsAggregatesQueryAsync(PostAnalyticsConversationsAggregatesQueryRequest request, AsyncApiCallback<AggregateQueryResponse> callback) {
    try {
      SettableFuture<AggregateQueryResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for conversation aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AggregateQueryResponse>> postAnalyticsConversationsAggregatesQueryAsync(ApiRequest<AggregationQuery> request, AsyncApiCallback<ApiResponse<AggregateQueryResponse>> callback) {
    try {
      SettableFuture<ApiResponse<AggregateQueryResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for conversation details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQueryAsync(PostAnalyticsConversationsDetailsQueryRequest request, AsyncApiCallback<AnalyticsConversationQueryResponse> callback) {
    try {
      SettableFuture<AnalyticsConversationQueryResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for conversation details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AnalyticsConversationQueryResponse>> postAnalyticsConversationsDetailsQueryAsync(ApiRequest<ConversationQuery> request, AsyncApiCallback<ApiResponse<AnalyticsConversationQueryResponse>> callback) {
    try {
      SettableFuture<ApiResponse<AnalyticsConversationQueryResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AnalyticsConversationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationQueryResponse> response = (ApiResponse<AnalyticsConversationQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationQueryResponse> response = (ApiResponse<AnalyticsConversationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new callback for the specified participant on the conversation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postConversationParticipantCallbacksAsync(PostConversationParticipantCallbacksRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new callback for the specified participant on the conversation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postConversationParticipantCallbacksAsync(ApiRequest<CreateCallbackCommand> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postConversationParticipantReplaceAsync(PostConversationParticipantReplaceRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postConversationParticipantReplaceAsync(ApiRequest<TransferRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add a new call to a conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Conversation> postConversationsCallAsync(PostConversationsCallRequest request, AsyncApiCallback<Conversation> callback) {
    try {
      SettableFuture<Conversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add a new call to a conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Conversation>> postConversationsCallAsync(ApiRequest<CallCommand> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    try {
      SettableFuture<ApiResponse<Conversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Initiate and update consult transfer
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ConsultTransferResponse> postConversationsCallParticipantConsultAsync(PostConversationsCallParticipantConsultRequest request, AsyncApiCallback<ConsultTransferResponse> callback) {
    try {
      SettableFuture<ConsultTransferResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ConsultTransferResponse>() {}, new AsyncApiCallback<ApiResponse<ConsultTransferResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ConsultTransferResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Initiate and update consult transfer
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ConsultTransferResponse>> postConversationsCallParticipantConsultAsync(ApiRequest<ConsultTransfer> request, AsyncApiCallback<ApiResponse<ConsultTransferResponse>> callback) {
    try {
      SettableFuture<ApiResponse<ConsultTransferResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ConsultTransferResponse>() {}, new AsyncApiCallback<ApiResponse<ConsultTransferResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ConsultTransferResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ConsultTransferResponse> response = (ApiResponse<ConsultTransferResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ConsultTransferResponse> response = (ApiResponse<ConsultTransferResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postConversationsCallParticipantMonitorAsync(PostConversationsCallParticipantMonitorRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postConversationsCallParticipantMonitorAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postConversationsCallParticipantReplaceAsync(PostConversationsCallParticipantReplaceRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postConversationsCallParticipantReplaceAsync(ApiRequest<TransferRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add participants to a conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Conversation> postConversationsCallParticipantsAsync(PostConversationsCallParticipantsRequest request, AsyncApiCallback<Conversation> callback) {
    try {
      SettableFuture<Conversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add participants to a conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Conversation>> postConversationsCallParticipantsAsync(ApiRequest<Conversation> request, AsyncApiCallback<ApiResponse<Conversation>> callback) {
    try {
      SettableFuture<ApiResponse<Conversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Conversation>() {}, new AsyncApiCallback<ApiResponse<Conversation>>() {
        @Override
        public void onCompleted(ApiResponse<Conversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Conversation> response = (ApiResponse<Conversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postConversationsCallbackParticipantReplaceAsync(PostConversationsCallbackParticipantReplaceRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postConversationsCallbackParticipantReplaceAsync(ApiRequest<TransferRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Callback
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CreateCallbackResponse> postConversationsCallbacksAsync(PostConversationsCallbacksRequest request, AsyncApiCallback<CreateCallbackResponse> callback) {
    try {
      SettableFuture<CreateCallbackResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CreateCallbackResponse>() {}, new AsyncApiCallback<ApiResponse<CreateCallbackResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CreateCallbackResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Callback
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CreateCallbackResponse>> postConversationsCallbacksAsync(ApiRequest<CreateCallbackCommand> request, AsyncApiCallback<ApiResponse<CreateCallbackResponse>> callback) {
    try {
      SettableFuture<ApiResponse<CreateCallbackResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CreateCallbackResponse>() {}, new AsyncApiCallback<ApiResponse<CreateCallbackResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CreateCallbackResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CreateCallbackResponse> response = (ApiResponse<CreateCallbackResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CreateCallbackResponse> response = (ApiResponse<CreateCallbackResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a call conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CreateCallResponse> postConversationsCallsAsync(PostConversationsCallsRequest request, AsyncApiCallback<CreateCallResponse> callback) {
    try {
      SettableFuture<CreateCallResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CreateCallResponse>() {}, new AsyncApiCallback<ApiResponse<CreateCallResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CreateCallResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a call conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CreateCallResponse>> postConversationsCallsAsync(ApiRequest<CreateCallRequest> request, AsyncApiCallback<ApiResponse<CreateCallResponse>> callback) {
    try {
      SettableFuture<ApiResponse<CreateCallResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CreateCallResponse>() {}, new AsyncApiCallback<ApiResponse<CreateCallResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CreateCallResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CreateCallResponse> response = (ApiResponse<CreateCallResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CreateCallResponse> response = (ApiResponse<CreateCallResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postConversationsChatParticipantReplaceAsync(PostConversationsChatParticipantReplaceRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postConversationsChatParticipantReplaceAsync(ApiRequest<TransferRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a web chat conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ChatConversation> postConversationsChatsAsync(PostConversationsChatsRequest request, AsyncApiCallback<ChatConversation> callback) {
    try {
      SettableFuture<ChatConversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ChatConversation>() {}, new AsyncApiCallback<ApiResponse<ChatConversation>>() {
        @Override
        public void onCompleted(ApiResponse<ChatConversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a web chat conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ChatConversation>> postConversationsChatsAsync(ApiRequest<CreateWebChatRequest> request, AsyncApiCallback<ApiResponse<ChatConversation>> callback) {
    try {
      SettableFuture<ApiResponse<ChatConversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ChatConversation>() {}, new AsyncApiCallback<ApiResponse<ChatConversation>>() {
        @Override
        public void onCompleted(ApiResponse<ChatConversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ChatConversation> response = (ApiResponse<ChatConversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ChatConversation> response = (ApiResponse<ChatConversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postConversationsCobrowsesessionParticipantReplaceAsync(PostConversationsCobrowsesessionParticipantReplaceRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postConversationsCobrowsesessionParticipantReplaceAsync(ApiRequest<TransferRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Send an email reply
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailMessage> postConversationsEmailMessagesAsync(PostConversationsEmailMessagesRequest request, AsyncApiCallback<EmailMessage> callback) {
    try {
      SettableFuture<EmailMessage> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailMessage>() {}, new AsyncApiCallback<ApiResponse<EmailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<EmailMessage> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Send an email reply
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailMessage>> postConversationsEmailMessagesAsync(ApiRequest<EmailMessage> request, AsyncApiCallback<ApiResponse<EmailMessage>> callback) {
    try {
      SettableFuture<ApiResponse<EmailMessage>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailMessage>() {}, new AsyncApiCallback<ApiResponse<EmailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<EmailMessage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postConversationsEmailParticipantReplaceAsync(PostConversationsEmailParticipantReplaceRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postConversationsEmailParticipantReplaceAsync(ApiRequest<TransferRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an email conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailConversation> postConversationsEmailsAsync(PostConversationsEmailsRequest request, AsyncApiCallback<EmailConversation> callback) {
    try {
      SettableFuture<EmailConversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailConversation>() {}, new AsyncApiCallback<ApiResponse<EmailConversation>>() {
        @Override
        public void onCompleted(ApiResponse<EmailConversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an email conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailConversation>> postConversationsEmailsAsync(ApiRequest<CreateEmailRequest> request, AsyncApiCallback<ApiResponse<EmailConversation>> callback) {
    try {
      SettableFuture<ApiResponse<EmailConversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailConversation>() {}, new AsyncApiCallback<ApiResponse<EmailConversation>>() {
        @Override
        public void onCompleted(ApiResponse<EmailConversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailConversation> response = (ApiResponse<EmailConversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailConversation> response = (ApiResponse<EmailConversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Fax Conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FaxSendResponse> postConversationsFaxesAsync(PostConversationsFaxesRequest request, AsyncApiCallback<FaxSendResponse> callback) {
    try {
      SettableFuture<FaxSendResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FaxSendResponse>() {}, new AsyncApiCallback<ApiResponse<FaxSendResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FaxSendResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Fax Conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FaxSendResponse>> postConversationsFaxesAsync(ApiRequest<FaxSendRequest> request, AsyncApiCallback<ApiResponse<FaxSendResponse>> callback) {
    try {
      SettableFuture<ApiResponse<FaxSendResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FaxSendResponse>() {}, new AsyncApiCallback<ApiResponse<FaxSendResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FaxSendResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FaxSendResponse> response = (ApiResponse<FaxSendResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FaxSendResponse> response = (ApiResponse<FaxSendResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation draft reply
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailMessage> putConversationsEmailMessagesDraftAsync(PutConversationsEmailMessagesDraftRequest request, AsyncApiCallback<EmailMessage> callback) {
    try {
      SettableFuture<EmailMessage> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailMessage>() {}, new AsyncApiCallback<ApiResponse<EmailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<EmailMessage> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update conversation draft reply
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailMessage>> putConversationsEmailMessagesDraftAsync(ApiRequest<EmailMessage> request, AsyncApiCallback<ApiResponse<EmailMessage>> callback) {
    try {
      SettableFuture<ApiResponse<EmailMessage>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailMessage>() {}, new AsyncApiCallback<ApiResponse<EmailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<EmailMessage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailMessage> response = (ApiResponse<EmailMessage>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }


  private <T> void notifySuccess(SettableFuture<T> future, AsyncApiCallback<T> callback, T result) {
    if (callback != null) {
      try {
        callback.onCompleted(result);
        future.set(result);
      }
      catch (Throwable exception) {
        future.setException(exception);
      }
    }
    else {
      future.set(result);
    }
  }

  private <T> void notifyFailure(SettableFuture<T> future, AsyncApiCallback<T> callback, Throwable exception) {
    if (callback != null) {
      try {
        callback.onFailed(exception);
        future.setException(exception);
      }
      catch (Throwable callbackException) {
        future.setException(callbackException);
      }
    }
    else {
      future.setException(exception);
    }
  }
}
