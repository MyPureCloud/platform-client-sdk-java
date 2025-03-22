package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ChatMessageEntityListing;
import com.mypurecloud.sdk.v2.model.ChatMessageResponse;
import com.mypurecloud.sdk.v2.model.ChatReactionUpdate;
import com.mypurecloud.sdk.v2.model.ChatSendMessageResponse;
import com.mypurecloud.sdk.v2.model.ChatSettings;
import com.mypurecloud.sdk.v2.model.ChatUserSettings;
import com.mypurecloud.sdk.v2.model.CreateRoomRequest;
import com.mypurecloud.sdk.v2.model.CreateRoomResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.OneOnOne;
import com.mypurecloud.sdk.v2.model.PinnedMessageRequest;
import com.mypurecloud.sdk.v2.model.Room;
import com.mypurecloud.sdk.v2.model.RoomParticipant;
import com.mypurecloud.sdk.v2.model.RoomParticipantsResponse;
import com.mypurecloud.sdk.v2.model.RoomUpdateRequest;
import com.mypurecloud.sdk.v2.model.SendMessageBody;


import com.mypurecloud.sdk.v2.api.request.DeleteChatsRoomMessageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteChatsRoomMessagesPinRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteChatsRoomParticipantRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteChatsUserMessageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteChatsUserMessagesPinRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsRoomRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsRoomMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsRoomMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsRoomParticipantRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsRoomParticipantsRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsThreadMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsUserMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsUserMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsUserSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsUsersMeSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchChatsRoomRequest;
import com.mypurecloud.sdk.v2.api.request.PatchChatsRoomMessageRequest;
import com.mypurecloud.sdk.v2.api.request.PatchChatsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchChatsUserMessageRequest;
import com.mypurecloud.sdk.v2.api.request.PatchChatsUserSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchChatsUsersMeSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostChatsRoomMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostChatsRoomMessagesPinsRequest;
import com.mypurecloud.sdk.v2.api.request.PostChatsRoomParticipantRequest;
import com.mypurecloud.sdk.v2.api.request.PostChatsRoomsRequest;
import com.mypurecloud.sdk.v2.api.request.PostChatsUserMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostChatsUserMessagesPinsRequest;
import com.mypurecloud.sdk.v2.api.request.PutChatsMessageReactionsRequest;
import com.mypurecloud.sdk.v2.api.request.PutChatsSettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatApi {
  private final ApiClient pcapiClient;

  public ChatApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChatApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a message in a room
   * 
   * @param roomJid roomId (required)
   * @param messageId messageId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteChatsRoomMessage(String roomJid, String messageId) throws IOException, ApiException {
     deleteChatsRoomMessage(createDeleteChatsRoomMessageRequest(roomJid, messageId));
  }

  /**
   * Delete a message in a room
   * 
   * @param roomJid roomId (required)
   * @param messageId messageId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteChatsRoomMessageWithHttpInfo(String roomJid, String messageId) throws IOException {
    return deleteChatsRoomMessage(createDeleteChatsRoomMessageRequest(roomJid, messageId).withHttpInfo());
  }

  private DeleteChatsRoomMessageRequest createDeleteChatsRoomMessageRequest(String roomJid, String messageId) {
    return DeleteChatsRoomMessageRequest.builder()
            .withRoomJid(roomJid)

            .withMessageId(messageId)

            .build();
  }

  /**
   * Delete a message in a room
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteChatsRoomMessage(DeleteChatsRoomMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a message in a room
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteChatsRoomMessage(ApiRequest<Void> request) throws IOException {
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
   * Remove a pinned message from a room
   * 
   * @param roomJid roomJid (required)
   * @param pinnedMessageId pinnedMessageId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteChatsRoomMessagesPin(String roomJid, String pinnedMessageId) throws IOException, ApiException {
     deleteChatsRoomMessagesPin(createDeleteChatsRoomMessagesPinRequest(roomJid, pinnedMessageId));
  }

  /**
   * Remove a pinned message from a room
   * 
   * @param roomJid roomJid (required)
   * @param pinnedMessageId pinnedMessageId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteChatsRoomMessagesPinWithHttpInfo(String roomJid, String pinnedMessageId) throws IOException {
    return deleteChatsRoomMessagesPin(createDeleteChatsRoomMessagesPinRequest(roomJid, pinnedMessageId).withHttpInfo());
  }

  private DeleteChatsRoomMessagesPinRequest createDeleteChatsRoomMessagesPinRequest(String roomJid, String pinnedMessageId) {
    return DeleteChatsRoomMessagesPinRequest.builder()
            .withRoomJid(roomJid)

            .withPinnedMessageId(pinnedMessageId)

            .build();
  }

  /**
   * Remove a pinned message from a room
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteChatsRoomMessagesPin(DeleteChatsRoomMessagesPinRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove a pinned message from a room
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteChatsRoomMessagesPin(ApiRequest<Void> request) throws IOException {
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
   * Remove a user from a room.
   * 
   * @param roomJid roomJid (required)
   * @param userId userId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteChatsRoomParticipant(String roomJid, String userId) throws IOException, ApiException {
     deleteChatsRoomParticipant(createDeleteChatsRoomParticipantRequest(roomJid, userId));
  }

  /**
   * Remove a user from a room.
   * 
   * @param roomJid roomJid (required)
   * @param userId userId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteChatsRoomParticipantWithHttpInfo(String roomJid, String userId) throws IOException {
    return deleteChatsRoomParticipant(createDeleteChatsRoomParticipantRequest(roomJid, userId).withHttpInfo());
  }

  private DeleteChatsRoomParticipantRequest createDeleteChatsRoomParticipantRequest(String roomJid, String userId) {
    return DeleteChatsRoomParticipantRequest.builder()
            .withRoomJid(roomJid)

            .withUserId(userId)

            .build();
  }

  /**
   * Remove a user from a room.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteChatsRoomParticipant(DeleteChatsRoomParticipantRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove a user from a room.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteChatsRoomParticipant(ApiRequest<Void> request) throws IOException {
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
   * Delete a message to a user
   * 
   * @param userId userId (required)
   * @param messageId messageId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteChatsUserMessage(String userId, String messageId) throws IOException, ApiException {
     deleteChatsUserMessage(createDeleteChatsUserMessageRequest(userId, messageId));
  }

  /**
   * Delete a message to a user
   * 
   * @param userId userId (required)
   * @param messageId messageId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteChatsUserMessageWithHttpInfo(String userId, String messageId) throws IOException {
    return deleteChatsUserMessage(createDeleteChatsUserMessageRequest(userId, messageId).withHttpInfo());
  }

  private DeleteChatsUserMessageRequest createDeleteChatsUserMessageRequest(String userId, String messageId) {
    return DeleteChatsUserMessageRequest.builder()
            .withUserId(userId)

            .withMessageId(messageId)

            .build();
  }

  /**
   * Delete a message to a user
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteChatsUserMessage(DeleteChatsUserMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a message to a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteChatsUserMessage(ApiRequest<Void> request) throws IOException {
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
   * Remove a pinned message from a 1on1
   * 
   * @param userId userId (required)
   * @param pinnedMessageId pinnedMessageId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteChatsUserMessagesPin(String userId, String pinnedMessageId) throws IOException, ApiException {
     deleteChatsUserMessagesPin(createDeleteChatsUserMessagesPinRequest(userId, pinnedMessageId));
  }

  /**
   * Remove a pinned message from a 1on1
   * 
   * @param userId userId (required)
   * @param pinnedMessageId pinnedMessageId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteChatsUserMessagesPinWithHttpInfo(String userId, String pinnedMessageId) throws IOException {
    return deleteChatsUserMessagesPin(createDeleteChatsUserMessagesPinRequest(userId, pinnedMessageId).withHttpInfo());
  }

  private DeleteChatsUserMessagesPinRequest createDeleteChatsUserMessagesPinRequest(String userId, String pinnedMessageId) {
    return DeleteChatsUserMessagesPinRequest.builder()
            .withUserId(userId)

            .withPinnedMessageId(pinnedMessageId)

            .build();
  }

  /**
   * Remove a pinned message from a 1on1
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteChatsUserMessagesPin(DeleteChatsUserMessagesPinRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove a pinned message from a 1on1
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteChatsUserMessagesPin(ApiRequest<Void> request) throws IOException {
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
   * Get a message
   * 
   * @param messageId messageId (required)
   * @return ChatMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageResponse getChatsMessage(String messageId) throws IOException, ApiException {
    return  getChatsMessage(createGetChatsMessageRequest(messageId));
  }

  /**
   * Get a message
   * 
   * @param messageId messageId (required)
   * @return ChatMessageResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageResponse> getChatsMessageWithHttpInfo(String messageId) throws IOException {
    return getChatsMessage(createGetChatsMessageRequest(messageId).withHttpInfo());
  }

  private GetChatsMessageRequest createGetChatsMessageRequest(String messageId) {
    return GetChatsMessageRequest.builder()
            .withMessageId(messageId)

            .build();
  }

  /**
   * Get a message
   * 
   * @param request The request object
   * @return ChatMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageResponse getChatsMessage(GetChatsMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatMessageResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatMessageResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a message
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageResponse> getChatsMessage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatMessageResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatMessageResponse> response = (ApiResponse<ChatMessageResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatMessageResponse> response = (ApiResponse<ChatMessageResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a room
   * 
   * @param roomJid roomJid (required)
   * @return Room
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Room getChatsRoom(String roomJid) throws IOException, ApiException {
    return  getChatsRoom(createGetChatsRoomRequest(roomJid));
  }

  /**
   * Get a room
   * 
   * @param roomJid roomJid (required)
   * @return Room
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Room> getChatsRoomWithHttpInfo(String roomJid) throws IOException {
    return getChatsRoom(createGetChatsRoomRequest(roomJid).withHttpInfo());
  }

  private GetChatsRoomRequest createGetChatsRoomRequest(String roomJid) {
    return GetChatsRoomRequest.builder()
            .withRoomJid(roomJid)

            .build();
  }

  /**
   * Get a room
   * 
   * @param request The request object
   * @return Room
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Room getChatsRoom(GetChatsRoomRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Room> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Room>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a room
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Room> getChatsRoom(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Room>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Room> response = (ApiResponse<Room>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Room> response = (ApiResponse<Room>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get messages by id(s) from a room
   * 
   * @param roomJid roomJid (required)
   * @param messageIds messageIds, comma separated (required)
   * @return ChatMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageEntityListing getChatsRoomMessage(String roomJid, String messageIds) throws IOException, ApiException {
    return  getChatsRoomMessage(createGetChatsRoomMessageRequest(roomJid, messageIds));
  }

  /**
   * Get messages by id(s) from a room
   * 
   * @param roomJid roomJid (required)
   * @param messageIds messageIds, comma separated (required)
   * @return ChatMessageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageEntityListing> getChatsRoomMessageWithHttpInfo(String roomJid, String messageIds) throws IOException {
    return getChatsRoomMessage(createGetChatsRoomMessageRequest(roomJid, messageIds).withHttpInfo());
  }

  private GetChatsRoomMessageRequest createGetChatsRoomMessageRequest(String roomJid, String messageIds) {
    return GetChatsRoomMessageRequest.builder()
            .withRoomJid(roomJid)

            .withMessageIds(messageIds)

            .build();
  }

  /**
   * Get messages by id(s) from a room
   * 
   * @param request The request object
   * @return ChatMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageEntityListing getChatsRoomMessage(GetChatsRoomMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatMessageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatMessageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get messages by id(s) from a room
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageEntityListing> getChatsRoomMessage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatMessageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatMessageEntityListing> response = (ApiResponse<ChatMessageEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatMessageEntityListing> response = (ApiResponse<ChatMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a room's message history
   * 
   * @param roomJid roomJid (required)
   * @param limit The maximum number of messages to retrieve (optional)
   * @param before The cutoff date for messages to retrieve (optional)
   * @param after The beginning date for messages to retrieve (optional)
   * @return ChatMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageEntityListing getChatsRoomMessages(String roomJid, String limit, String before, String after) throws IOException, ApiException {
    return  getChatsRoomMessages(createGetChatsRoomMessagesRequest(roomJid, limit, before, after));
  }

  /**
   * Get a room's message history
   * 
   * @param roomJid roomJid (required)
   * @param limit The maximum number of messages to retrieve (optional)
   * @param before The cutoff date for messages to retrieve (optional)
   * @param after The beginning date for messages to retrieve (optional)
   * @return ChatMessageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageEntityListing> getChatsRoomMessagesWithHttpInfo(String roomJid, String limit, String before, String after) throws IOException {
    return getChatsRoomMessages(createGetChatsRoomMessagesRequest(roomJid, limit, before, after).withHttpInfo());
  }

  private GetChatsRoomMessagesRequest createGetChatsRoomMessagesRequest(String roomJid, String limit, String before, String after) {
    return GetChatsRoomMessagesRequest.builder()
            .withRoomJid(roomJid)

            .withLimit(limit)

            .withBefore(before)

            .withAfter(after)

            .build();
  }

  /**
   * Get a room's message history
   * 
   * @param request The request object
   * @return ChatMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageEntityListing getChatsRoomMessages(GetChatsRoomMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatMessageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatMessageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a room's message history
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageEntityListing> getChatsRoomMessages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatMessageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatMessageEntityListing> response = (ApiResponse<ChatMessageEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatMessageEntityListing> response = (ApiResponse<ChatMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a room participant
   * 
   * @param roomJid roomJid (required)
   * @param participantJid participantJid (required)
   * @return RoomParticipant
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoomParticipant getChatsRoomParticipant(String roomJid, String participantJid) throws IOException, ApiException {
    return  getChatsRoomParticipant(createGetChatsRoomParticipantRequest(roomJid, participantJid));
  }

  /**
   * Get a room participant
   * 
   * @param roomJid roomJid (required)
   * @param participantJid participantJid (required)
   * @return RoomParticipant
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoomParticipant> getChatsRoomParticipantWithHttpInfo(String roomJid, String participantJid) throws IOException {
    return getChatsRoomParticipant(createGetChatsRoomParticipantRequest(roomJid, participantJid).withHttpInfo());
  }

  private GetChatsRoomParticipantRequest createGetChatsRoomParticipantRequest(String roomJid, String participantJid) {
    return GetChatsRoomParticipantRequest.builder()
            .withRoomJid(roomJid)

            .withParticipantJid(participantJid)

            .build();
  }

  /**
   * Get a room participant
   * 
   * @param request The request object
   * @return RoomParticipant
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoomParticipant getChatsRoomParticipant(GetChatsRoomParticipantRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoomParticipant> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoomParticipant>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a room participant
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoomParticipant> getChatsRoomParticipant(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoomParticipant>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoomParticipant> response = (ApiResponse<RoomParticipant>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RoomParticipant> response = (ApiResponse<RoomParticipant>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get room participants in a room
   * 
   * @param roomJid roomJid (required)
   * @return RoomParticipantsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoomParticipantsResponse getChatsRoomParticipants(String roomJid) throws IOException, ApiException {
    return  getChatsRoomParticipants(createGetChatsRoomParticipantsRequest(roomJid));
  }

  /**
   * Get room participants in a room
   * 
   * @param roomJid roomJid (required)
   * @return RoomParticipantsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoomParticipantsResponse> getChatsRoomParticipantsWithHttpInfo(String roomJid) throws IOException {
    return getChatsRoomParticipants(createGetChatsRoomParticipantsRequest(roomJid).withHttpInfo());
  }

  private GetChatsRoomParticipantsRequest createGetChatsRoomParticipantsRequest(String roomJid) {
    return GetChatsRoomParticipantsRequest.builder()
            .withRoomJid(roomJid)

            .build();
  }

  /**
   * Get room participants in a room
   * 
   * @param request The request object
   * @return RoomParticipantsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoomParticipantsResponse getChatsRoomParticipants(GetChatsRoomParticipantsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoomParticipantsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoomParticipantsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get room participants in a room
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoomParticipantsResponse> getChatsRoomParticipants(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoomParticipantsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoomParticipantsResponse> response = (ApiResponse<RoomParticipantsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RoomParticipantsResponse> response = (ApiResponse<RoomParticipantsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Chat Settings.
   * 
   * @return ChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSettings getChatsSettings() throws IOException, ApiException {
    return  getChatsSettings(createGetChatsSettingsRequest());
  }

  /**
   * Get Chat Settings.
   * 
   * @return ChatSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSettings> getChatsSettingsWithHttpInfo() throws IOException {
    return getChatsSettings(createGetChatsSettingsRequest().withHttpInfo());
  }

  private GetChatsSettingsRequest createGetChatsSettingsRequest() {
    return GetChatsSettingsRequest.builder()
            .build();
  }

  /**
   * Get Chat Settings.
   * 
   * @param request The request object
   * @return ChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSettings getChatsSettings(GetChatsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Chat Settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSettings> getChatsSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSettings> response = (ApiResponse<ChatSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSettings> response = (ApiResponse<ChatSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get history by thread
   * 
   * @param threadId threadId (required)
   * @param limit The maximum number of messages to retrieve (optional)
   * @param before The cutoff date for messages to retrieve (optional)
   * @param after The beginning date for messages to retrieve (optional)
   * @return ChatMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageEntityListing getChatsThreadMessages(String threadId, String limit, String before, String after) throws IOException, ApiException {
    return  getChatsThreadMessages(createGetChatsThreadMessagesRequest(threadId, limit, before, after));
  }

  /**
   * Get history by thread
   * 
   * @param threadId threadId (required)
   * @param limit The maximum number of messages to retrieve (optional)
   * @param before The cutoff date for messages to retrieve (optional)
   * @param after The beginning date for messages to retrieve (optional)
   * @return ChatMessageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageEntityListing> getChatsThreadMessagesWithHttpInfo(String threadId, String limit, String before, String after) throws IOException {
    return getChatsThreadMessages(createGetChatsThreadMessagesRequest(threadId, limit, before, after).withHttpInfo());
  }

  private GetChatsThreadMessagesRequest createGetChatsThreadMessagesRequest(String threadId, String limit, String before, String after) {
    return GetChatsThreadMessagesRequest.builder()
            .withThreadId(threadId)

            .withLimit(limit)

            .withBefore(before)

            .withAfter(after)

            .build();
  }

  /**
   * Get history by thread
   * 
   * @param request The request object
   * @return ChatMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageEntityListing getChatsThreadMessages(GetChatsThreadMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatMessageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatMessageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get history by thread
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageEntityListing> getChatsThreadMessages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatMessageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatMessageEntityListing> response = (ApiResponse<ChatMessageEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatMessageEntityListing> response = (ApiResponse<ChatMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get information for a 1on1
   * 
   * @param userId userId (required)
   * @return OneOnOne
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OneOnOne getChatsUser(String userId) throws IOException, ApiException {
    return  getChatsUser(createGetChatsUserRequest(userId));
  }

  /**
   * Get information for a 1on1
   * 
   * @param userId userId (required)
   * @return OneOnOne
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OneOnOne> getChatsUserWithHttpInfo(String userId) throws IOException {
    return getChatsUser(createGetChatsUserRequest(userId).withHttpInfo());
  }

  private GetChatsUserRequest createGetChatsUserRequest(String userId) {
    return GetChatsUserRequest.builder()
            .withUserId(userId)

            .build();
  }

  /**
   * Get information for a 1on1
   * 
   * @param request The request object
   * @return OneOnOne
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OneOnOne getChatsUser(GetChatsUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OneOnOne> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OneOnOne>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get information for a 1on1
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OneOnOne> getChatsUser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OneOnOne>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OneOnOne> response = (ApiResponse<OneOnOne>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OneOnOne> response = (ApiResponse<OneOnOne>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get messages by id(s) from a 1on1
   * 
   * @param userId userId (required)
   * @param messageIds messageIds, comma separated (required)
   * @return ChatMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageEntityListing getChatsUserMessage(String userId, String messageIds) throws IOException, ApiException {
    return  getChatsUserMessage(createGetChatsUserMessageRequest(userId, messageIds));
  }

  /**
   * Get messages by id(s) from a 1on1
   * 
   * @param userId userId (required)
   * @param messageIds messageIds, comma separated (required)
   * @return ChatMessageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageEntityListing> getChatsUserMessageWithHttpInfo(String userId, String messageIds) throws IOException {
    return getChatsUserMessage(createGetChatsUserMessageRequest(userId, messageIds).withHttpInfo());
  }

  private GetChatsUserMessageRequest createGetChatsUserMessageRequest(String userId, String messageIds) {
    return GetChatsUserMessageRequest.builder()
            .withUserId(userId)

            .withMessageIds(messageIds)

            .build();
  }

  /**
   * Get messages by id(s) from a 1on1
   * 
   * @param request The request object
   * @return ChatMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageEntityListing getChatsUserMessage(GetChatsUserMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatMessageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatMessageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get messages by id(s) from a 1on1
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageEntityListing> getChatsUserMessage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatMessageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatMessageEntityListing> response = (ApiResponse<ChatMessageEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatMessageEntityListing> response = (ApiResponse<ChatMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get 1on1 History between a user
   * 
   * @param userId userId (required)
   * @param limit The maximum number of messages to retrieve (optional)
   * @param before The cutoff date for messages to retrieve (optional)
   * @param after The beginning date for messages to retrieve (optional)
   * @return ChatMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageResponse getChatsUserMessages(String userId, String limit, String before, String after) throws IOException, ApiException {
    return  getChatsUserMessages(createGetChatsUserMessagesRequest(userId, limit, before, after));
  }

  /**
   * Get 1on1 History between a user
   * 
   * @param userId userId (required)
   * @param limit The maximum number of messages to retrieve (optional)
   * @param before The cutoff date for messages to retrieve (optional)
   * @param after The beginning date for messages to retrieve (optional)
   * @return ChatMessageResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageResponse> getChatsUserMessagesWithHttpInfo(String userId, String limit, String before, String after) throws IOException {
    return getChatsUserMessages(createGetChatsUserMessagesRequest(userId, limit, before, after).withHttpInfo());
  }

  private GetChatsUserMessagesRequest createGetChatsUserMessagesRequest(String userId, String limit, String before, String after) {
    return GetChatsUserMessagesRequest.builder()
            .withUserId(userId)

            .withLimit(limit)

            .withBefore(before)

            .withAfter(after)

            .build();
  }

  /**
   * Get 1on1 History between a user
   * 
   * @param request The request object
   * @return ChatMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageResponse getChatsUserMessages(GetChatsUserMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatMessageResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatMessageResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get 1on1 History between a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageResponse> getChatsUserMessages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatMessageResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatMessageResponse> response = (ApiResponse<ChatMessageResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatMessageResponse> response = (ApiResponse<ChatMessageResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a user's chat settings
   * 
   * @param userId User ID (required)
   * @return ChatUserSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatUserSettings getChatsUserSettings(String userId) throws IOException, ApiException {
    return  getChatsUserSettings(createGetChatsUserSettingsRequest(userId));
  }

  /**
   * Get a user's chat settings
   * 
   * @param userId User ID (required)
   * @return ChatUserSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatUserSettings> getChatsUserSettingsWithHttpInfo(String userId) throws IOException {
    return getChatsUserSettings(createGetChatsUserSettingsRequest(userId).withHttpInfo());
  }

  private GetChatsUserSettingsRequest createGetChatsUserSettingsRequest(String userId) {
    return GetChatsUserSettingsRequest.builder()
            .withUserId(userId)

            .build();
  }

  /**
   * Get a user's chat settings
   * 
   * @param request The request object
   * @return ChatUserSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatUserSettings getChatsUserSettings(GetChatsUserSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatUserSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatUserSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user's chat settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatUserSettings> getChatsUserSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatUserSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatUserSettings> response = (ApiResponse<ChatUserSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatUserSettings> response = (ApiResponse<ChatUserSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a user's chat settings
   * 
   * @return ChatUserSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatUserSettings getChatsUsersMeSettings() throws IOException, ApiException {
    return  getChatsUsersMeSettings(createGetChatsUsersMeSettingsRequest());
  }

  /**
   * Get a user's chat settings
   * 
   * @return ChatUserSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatUserSettings> getChatsUsersMeSettingsWithHttpInfo() throws IOException {
    return getChatsUsersMeSettings(createGetChatsUsersMeSettingsRequest().withHttpInfo());
  }

  private GetChatsUsersMeSettingsRequest createGetChatsUsersMeSettingsRequest() {
    return GetChatsUsersMeSettingsRequest.builder()
            .build();
  }

  /**
   * Get a user's chat settings
   * 
   * @param request The request object
   * @return ChatUserSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatUserSettings getChatsUsersMeSettings(GetChatsUsersMeSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatUserSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatUserSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user's chat settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatUserSettings> getChatsUsersMeSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatUserSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatUserSettings> response = (ApiResponse<ChatUserSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatUserSettings> response = (ApiResponse<ChatUserSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Set properties for a room
   * 
   * @param roomJid roomJid (required)
   * @param body Room properties (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchChatsRoom(String roomJid, RoomUpdateRequest body) throws IOException, ApiException {
     patchChatsRoom(createPatchChatsRoomRequest(roomJid, body));
  }

  /**
   * Set properties for a room
   * 
   * @param roomJid roomJid (required)
   * @param body Room properties (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchChatsRoomWithHttpInfo(String roomJid, RoomUpdateRequest body) throws IOException {
    return patchChatsRoom(createPatchChatsRoomRequest(roomJid, body).withHttpInfo());
  }

  private PatchChatsRoomRequest createPatchChatsRoomRequest(String roomJid, RoomUpdateRequest body) {
    return PatchChatsRoomRequest.builder()
            .withRoomJid(roomJid)

            .withBody(body)

            .build();
  }

  /**
   * Set properties for a room
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchChatsRoom(PatchChatsRoomRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Set properties for a room
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchChatsRoom(ApiRequest<RoomUpdateRequest> request) throws IOException {
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
   * Edit a message in a room
   * 
   * @param roomJid roomId (required)
   * @param messageId messageId (required)
   * @param body messageBody (required)
   * @return ChatSendMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSendMessageResponse patchChatsRoomMessage(String roomJid, String messageId, SendMessageBody body) throws IOException, ApiException {
    return  patchChatsRoomMessage(createPatchChatsRoomMessageRequest(roomJid, messageId, body));
  }

  /**
   * Edit a message in a room
   * 
   * @param roomJid roomId (required)
   * @param messageId messageId (required)
   * @param body messageBody (required)
   * @return ChatSendMessageResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSendMessageResponse> patchChatsRoomMessageWithHttpInfo(String roomJid, String messageId, SendMessageBody body) throws IOException {
    return patchChatsRoomMessage(createPatchChatsRoomMessageRequest(roomJid, messageId, body).withHttpInfo());
  }

  private PatchChatsRoomMessageRequest createPatchChatsRoomMessageRequest(String roomJid, String messageId, SendMessageBody body) {
    return PatchChatsRoomMessageRequest.builder()
            .withRoomJid(roomJid)

            .withMessageId(messageId)

            .withBody(body)

            .build();
  }

  /**
   * Edit a message in a room
   * 
   * @param request The request object
   * @return ChatSendMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSendMessageResponse patchChatsRoomMessage(PatchChatsRoomMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatSendMessageResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatSendMessageResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Edit a message in a room
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSendMessageResponse> patchChatsRoomMessage(ApiRequest<SendMessageBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatSendMessageResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSendMessageResponse> response = (ApiResponse<ChatSendMessageResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSendMessageResponse> response = (ApiResponse<ChatSendMessageResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Patch Chat Settings.
   * 
   * @param body Chat (required)
   * @return ChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSettings patchChatsSettings(ChatSettings body) throws IOException, ApiException {
    return  patchChatsSettings(createPatchChatsSettingsRequest(body));
  }

  /**
   * Patch Chat Settings.
   * 
   * @param body Chat (required)
   * @return ChatSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSettings> patchChatsSettingsWithHttpInfo(ChatSettings body) throws IOException {
    return patchChatsSettings(createPatchChatsSettingsRequest(body).withHttpInfo());
  }

  private PatchChatsSettingsRequest createPatchChatsSettingsRequest(ChatSettings body) {
    return PatchChatsSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Patch Chat Settings.
   * 
   * @param request The request object
   * @return ChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSettings patchChatsSettings(PatchChatsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch Chat Settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSettings> patchChatsSettings(ApiRequest<ChatSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSettings> response = (ApiResponse<ChatSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSettings> response = (ApiResponse<ChatSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Edit a message to a user
   * 
   * @param userId userId (required)
   * @param messageId messageId (required)
   * @param body message body (required)
   * @return ChatSendMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSendMessageResponse patchChatsUserMessage(String userId, String messageId, SendMessageBody body) throws IOException, ApiException {
    return  patchChatsUserMessage(createPatchChatsUserMessageRequest(userId, messageId, body));
  }

  /**
   * Edit a message to a user
   * 
   * @param userId userId (required)
   * @param messageId messageId (required)
   * @param body message body (required)
   * @return ChatSendMessageResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSendMessageResponse> patchChatsUserMessageWithHttpInfo(String userId, String messageId, SendMessageBody body) throws IOException {
    return patchChatsUserMessage(createPatchChatsUserMessageRequest(userId, messageId, body).withHttpInfo());
  }

  private PatchChatsUserMessageRequest createPatchChatsUserMessageRequest(String userId, String messageId, SendMessageBody body) {
    return PatchChatsUserMessageRequest.builder()
            .withUserId(userId)

            .withMessageId(messageId)

            .withBody(body)

            .build();
  }

  /**
   * Edit a message to a user
   * 
   * @param request The request object
   * @return ChatSendMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSendMessageResponse patchChatsUserMessage(PatchChatsUserMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatSendMessageResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatSendMessageResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Edit a message to a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSendMessageResponse> patchChatsUserMessage(ApiRequest<SendMessageBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatSendMessageResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSendMessageResponse> response = (ApiResponse<ChatSendMessageResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSendMessageResponse> response = (ApiResponse<ChatSendMessageResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a user's chat settings
   * 
   * @param userId User ID (required)
   * @param body  (required)
   * @return ChatUserSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatUserSettings patchChatsUserSettings(String userId, ChatUserSettings body) throws IOException, ApiException {
    return  patchChatsUserSettings(createPatchChatsUserSettingsRequest(userId, body));
  }

  /**
   * Update a user's chat settings
   * 
   * @param userId User ID (required)
   * @param body  (required)
   * @return ChatUserSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatUserSettings> patchChatsUserSettingsWithHttpInfo(String userId, ChatUserSettings body) throws IOException {
    return patchChatsUserSettings(createPatchChatsUserSettingsRequest(userId, body).withHttpInfo());
  }

  private PatchChatsUserSettingsRequest createPatchChatsUserSettingsRequest(String userId, ChatUserSettings body) {
    return PatchChatsUserSettingsRequest.builder()
            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Update a user's chat settings
   * 
   * @param request The request object
   * @return ChatUserSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatUserSettings patchChatsUserSettings(PatchChatsUserSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatUserSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatUserSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a user's chat settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatUserSettings> patchChatsUserSettings(ApiRequest<ChatUserSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatUserSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatUserSettings> response = (ApiResponse<ChatUserSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatUserSettings> response = (ApiResponse<ChatUserSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a user's chat settings
   * 
   * @param body  (required)
   * @return ChatUserSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatUserSettings patchChatsUsersMeSettings(ChatUserSettings body) throws IOException, ApiException {
    return  patchChatsUsersMeSettings(createPatchChatsUsersMeSettingsRequest(body));
  }

  /**
   * Update a user's chat settings
   * 
   * @param body  (required)
   * @return ChatUserSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatUserSettings> patchChatsUsersMeSettingsWithHttpInfo(ChatUserSettings body) throws IOException {
    return patchChatsUsersMeSettings(createPatchChatsUsersMeSettingsRequest(body).withHttpInfo());
  }

  private PatchChatsUsersMeSettingsRequest createPatchChatsUsersMeSettingsRequest(ChatUserSettings body) {
    return PatchChatsUsersMeSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update a user's chat settings
   * 
   * @param request The request object
   * @return ChatUserSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatUserSettings patchChatsUsersMeSettings(PatchChatsUsersMeSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatUserSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatUserSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a user's chat settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatUserSettings> patchChatsUsersMeSettings(ApiRequest<ChatUserSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatUserSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatUserSettings> response = (ApiResponse<ChatUserSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatUserSettings> response = (ApiResponse<ChatUserSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Send a message to a room
   * 
   * @param roomJid roomId (required)
   * @param body messageBody (required)
   * @return ChatSendMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSendMessageResponse postChatsRoomMessages(String roomJid, SendMessageBody body) throws IOException, ApiException {
    return  postChatsRoomMessages(createPostChatsRoomMessagesRequest(roomJid, body));
  }

  /**
   * Send a message to a room
   * 
   * @param roomJid roomId (required)
   * @param body messageBody (required)
   * @return ChatSendMessageResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSendMessageResponse> postChatsRoomMessagesWithHttpInfo(String roomJid, SendMessageBody body) throws IOException {
    return postChatsRoomMessages(createPostChatsRoomMessagesRequest(roomJid, body).withHttpInfo());
  }

  private PostChatsRoomMessagesRequest createPostChatsRoomMessagesRequest(String roomJid, SendMessageBody body) {
    return PostChatsRoomMessagesRequest.builder()
            .withRoomJid(roomJid)

            .withBody(body)

            .build();
  }

  /**
   * Send a message to a room
   * 
   * @param request The request object
   * @return ChatSendMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSendMessageResponse postChatsRoomMessages(PostChatsRoomMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatSendMessageResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatSendMessageResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send a message to a room
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSendMessageResponse> postChatsRoomMessages(ApiRequest<SendMessageBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatSendMessageResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSendMessageResponse> response = (ApiResponse<ChatSendMessageResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSendMessageResponse> response = (ApiResponse<ChatSendMessageResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add pinned messages for a room, up to a maximum of 5 pinned messages
   * 
   * @param roomJid roomJid (required)
   * @param body Pinned Message Ids (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postChatsRoomMessagesPins(String roomJid, PinnedMessageRequest body) throws IOException, ApiException {
     postChatsRoomMessagesPins(createPostChatsRoomMessagesPinsRequest(roomJid, body));
  }

  /**
   * Add pinned messages for a room, up to a maximum of 5 pinned messages
   * 
   * @param roomJid roomJid (required)
   * @param body Pinned Message Ids (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postChatsRoomMessagesPinsWithHttpInfo(String roomJid, PinnedMessageRequest body) throws IOException {
    return postChatsRoomMessagesPins(createPostChatsRoomMessagesPinsRequest(roomJid, body).withHttpInfo());
  }

  private PostChatsRoomMessagesPinsRequest createPostChatsRoomMessagesPinsRequest(String roomJid, PinnedMessageRequest body) {
    return PostChatsRoomMessagesPinsRequest.builder()
            .withRoomJid(roomJid)

            .withBody(body)

            .build();
  }

  /**
   * Add pinned messages for a room, up to a maximum of 5 pinned messages
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postChatsRoomMessagesPins(PostChatsRoomMessagesPinsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Add pinned messages for a room, up to a maximum of 5 pinned messages
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postChatsRoomMessagesPins(ApiRequest<PinnedMessageRequest> request) throws IOException {
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
   * Join a room
   * 
   * @param roomJid roomJid (required)
   * @param userId userId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postChatsRoomParticipant(String roomJid, String userId) throws IOException, ApiException {
     postChatsRoomParticipant(createPostChatsRoomParticipantRequest(roomJid, userId));
  }

  /**
   * Join a room
   * 
   * @param roomJid roomJid (required)
   * @param userId userId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postChatsRoomParticipantWithHttpInfo(String roomJid, String userId) throws IOException {
    return postChatsRoomParticipant(createPostChatsRoomParticipantRequest(roomJid, userId).withHttpInfo());
  }

  private PostChatsRoomParticipantRequest createPostChatsRoomParticipantRequest(String roomJid, String userId) {
    return PostChatsRoomParticipantRequest.builder()
            .withRoomJid(roomJid)

            .withUserId(userId)

            .build();
  }

  /**
   * Join a room
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postChatsRoomParticipant(PostChatsRoomParticipantRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Join a room
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postChatsRoomParticipant(ApiRequest<Void> request) throws IOException {
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
   * Create an adhoc room
   * 
   * @param body Room properties (required)
   * @return CreateRoomResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateRoomResponse postChatsRooms(CreateRoomRequest body) throws IOException, ApiException {
    return  postChatsRooms(createPostChatsRoomsRequest(body));
  }

  /**
   * Create an adhoc room
   * 
   * @param body Room properties (required)
   * @return CreateRoomResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateRoomResponse> postChatsRoomsWithHttpInfo(CreateRoomRequest body) throws IOException {
    return postChatsRooms(createPostChatsRoomsRequest(body).withHttpInfo());
  }

  private PostChatsRoomsRequest createPostChatsRoomsRequest(CreateRoomRequest body) {
    return PostChatsRoomsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create an adhoc room
   * 
   * @param request The request object
   * @return CreateRoomResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateRoomResponse postChatsRooms(PostChatsRoomsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CreateRoomResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CreateRoomResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an adhoc room
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateRoomResponse> postChatsRooms(ApiRequest<CreateRoomRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CreateRoomResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CreateRoomResponse> response = (ApiResponse<CreateRoomResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CreateRoomResponse> response = (ApiResponse<CreateRoomResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Send a message to a user
   * 
   * @param userId userId (required)
   * @param body message body (required)
   * @return ChatSendMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSendMessageResponse postChatsUserMessages(String userId, SendMessageBody body) throws IOException, ApiException {
    return  postChatsUserMessages(createPostChatsUserMessagesRequest(userId, body));
  }

  /**
   * Send a message to a user
   * 
   * @param userId userId (required)
   * @param body message body (required)
   * @return ChatSendMessageResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSendMessageResponse> postChatsUserMessagesWithHttpInfo(String userId, SendMessageBody body) throws IOException {
    return postChatsUserMessages(createPostChatsUserMessagesRequest(userId, body).withHttpInfo());
  }

  private PostChatsUserMessagesRequest createPostChatsUserMessagesRequest(String userId, SendMessageBody body) {
    return PostChatsUserMessagesRequest.builder()
            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Send a message to a user
   * 
   * @param request The request object
   * @return ChatSendMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSendMessageResponse postChatsUserMessages(PostChatsUserMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatSendMessageResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatSendMessageResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send a message to a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSendMessageResponse> postChatsUserMessages(ApiRequest<SendMessageBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatSendMessageResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSendMessageResponse> response = (ApiResponse<ChatSendMessageResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSendMessageResponse> response = (ApiResponse<ChatSendMessageResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add pinned messages for a 1on1, up to a maximum of 5 pinned messages
   * 
   * @param userId userId (required)
   * @param body Pinned Message Ids (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postChatsUserMessagesPins(String userId, PinnedMessageRequest body) throws IOException, ApiException {
     postChatsUserMessagesPins(createPostChatsUserMessagesPinsRequest(userId, body));
  }

  /**
   * Add pinned messages for a 1on1, up to a maximum of 5 pinned messages
   * 
   * @param userId userId (required)
   * @param body Pinned Message Ids (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postChatsUserMessagesPinsWithHttpInfo(String userId, PinnedMessageRequest body) throws IOException {
    return postChatsUserMessagesPins(createPostChatsUserMessagesPinsRequest(userId, body).withHttpInfo());
  }

  private PostChatsUserMessagesPinsRequest createPostChatsUserMessagesPinsRequest(String userId, PinnedMessageRequest body) {
    return PostChatsUserMessagesPinsRequest.builder()
            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Add pinned messages for a 1on1, up to a maximum of 5 pinned messages
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postChatsUserMessagesPins(PostChatsUserMessagesPinsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Add pinned messages for a 1on1, up to a maximum of 5 pinned messages
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postChatsUserMessagesPins(ApiRequest<PinnedMessageRequest> request) throws IOException {
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
   * Update reactions to a message
   * 
   * @param messageId messageId (required)
   * @param body reactionUpdate (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putChatsMessageReactions(String messageId, ChatReactionUpdate body) throws IOException, ApiException {
     putChatsMessageReactions(createPutChatsMessageReactionsRequest(messageId, body));
  }

  /**
   * Update reactions to a message
   * 
   * @param messageId messageId (required)
   * @param body reactionUpdate (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putChatsMessageReactionsWithHttpInfo(String messageId, ChatReactionUpdate body) throws IOException {
    return putChatsMessageReactions(createPutChatsMessageReactionsRequest(messageId, body).withHttpInfo());
  }

  private PutChatsMessageReactionsRequest createPutChatsMessageReactionsRequest(String messageId, ChatReactionUpdate body) {
    return PutChatsMessageReactionsRequest.builder()
            .withMessageId(messageId)

            .withBody(body)

            .build();
  }

  /**
   * Update reactions to a message
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putChatsMessageReactions(PutChatsMessageReactionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update reactions to a message
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putChatsMessageReactions(ApiRequest<ChatReactionUpdate> request) throws IOException {
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
   * Update Chat Settings.
   * 
   * @param body Chat (required)
   * @return ChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSettings putChatsSettings(ChatSettings body) throws IOException, ApiException {
    return  putChatsSettings(createPutChatsSettingsRequest(body));
  }

  /**
   * Update Chat Settings.
   * 
   * @param body Chat (required)
   * @return ChatSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSettings> putChatsSettingsWithHttpInfo(ChatSettings body) throws IOException {
    return putChatsSettings(createPutChatsSettingsRequest(body).withHttpInfo());
  }

  private PutChatsSettingsRequest createPutChatsSettingsRequest(ChatSettings body) {
    return PutChatsSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update Chat Settings.
   * 
   * @param request The request object
   * @return ChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSettings putChatsSettings(PutChatsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Chat Settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSettings> putChatsSettings(ApiRequest<ChatSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSettings> response = (ApiResponse<ChatSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSettings> response = (ApiResponse<ChatSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
