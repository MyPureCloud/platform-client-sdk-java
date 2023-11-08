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
import com.mypurecloud.sdk.v2.model.ChatSendMessageResponse;
import com.mypurecloud.sdk.v2.model.ChatSettings;
import com.mypurecloud.sdk.v2.model.CreateRoomRequest;
import com.mypurecloud.sdk.v2.model.CreateRoomResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.PinnedMessageRequest;
import com.mypurecloud.sdk.v2.model.Room;
import com.mypurecloud.sdk.v2.model.RoomUpdateRequest;
import com.mypurecloud.sdk.v2.model.SendMessageBody;


import com.mypurecloud.sdk.v2.api.request.DeleteChatsRoomMessageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteChatsRoomParticipantRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteChatsRoomPinnedmessageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteChatsUserMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsRoomRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsRoomMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsRoomMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsThreadMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsUserMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetChatsUserMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchChatsRoomRequest;
import com.mypurecloud.sdk.v2.api.request.PatchChatsRoomMessageRequest;
import com.mypurecloud.sdk.v2.api.request.PatchChatsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchChatsUserMessageRequest;
import com.mypurecloud.sdk.v2.api.request.PostChatsRoomMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostChatsRoomParticipantRequest;
import com.mypurecloud.sdk.v2.api.request.PostChatsRoomPinnedmessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostChatsRoomsRequest;
import com.mypurecloud.sdk.v2.api.request.PostChatsUserMessagesRequest;
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
   * deleteChatsRoomMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteChatsRoomMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteChatsRoomMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteChatsRoomMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Remove a user from a room.
   * 
   * deleteChatsRoomParticipant is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteChatsRoomParticipant is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteChatsRoomParticipant is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteChatsRoomParticipant is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Remove a pinned message from a room
   * 
   * deleteChatsRoomPinnedmessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param roomJid roomJid (required)
   * @param pinnedMessageId pinnedMessageId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteChatsRoomPinnedmessage(String roomJid, String pinnedMessageId) throws IOException, ApiException {
     deleteChatsRoomPinnedmessage(createDeleteChatsRoomPinnedmessageRequest(roomJid, pinnedMessageId));
  }

  /**
   * Remove a pinned message from a room
   * 
   * deleteChatsRoomPinnedmessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param roomJid roomJid (required)
   * @param pinnedMessageId pinnedMessageId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteChatsRoomPinnedmessageWithHttpInfo(String roomJid, String pinnedMessageId) throws IOException {
    return deleteChatsRoomPinnedmessage(createDeleteChatsRoomPinnedmessageRequest(roomJid, pinnedMessageId).withHttpInfo());
  }

  private DeleteChatsRoomPinnedmessageRequest createDeleteChatsRoomPinnedmessageRequest(String roomJid, String pinnedMessageId) {
    return DeleteChatsRoomPinnedmessageRequest.builder()
            .withRoomJid(roomJid)

            .withPinnedMessageId(pinnedMessageId)

            .build();
  }

  /**
   * Remove a pinned message from a room
   * 
   * deleteChatsRoomPinnedmessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteChatsRoomPinnedmessage(DeleteChatsRoomPinnedmessageRequest request) throws IOException, ApiException {
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
   * deleteChatsRoomPinnedmessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteChatsRoomPinnedmessage(ApiRequest<Void> request) throws IOException {
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
   * deleteChatsUserMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteChatsUserMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteChatsUserMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteChatsUserMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Get a message
   * 
   * getChatsMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsRoom is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsRoom is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsRoom is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsRoom is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsRoomMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsRoomMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsRoomMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsRoomMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsRoomMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param roomJid roomJid (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param limit The maximum number of messages to retrieve (optional)
   * @param before The cutoff date for messages to retrieve (optional)
   * @param after The beginning date for messages to retrieve (optional)
   * @return ChatMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageEntityListing getChatsRoomMessages(String roomJid, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String limit, String before, String after) throws IOException, ApiException {
    return  getChatsRoomMessages(createGetChatsRoomMessagesRequest(roomJid, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, limit, before, after));
  }

  /**
   * Get a room's message history
   * 
   * getChatsRoomMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param roomJid roomJid (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param limit The maximum number of messages to retrieve (optional)
   * @param before The cutoff date for messages to retrieve (optional)
   * @param after The beginning date for messages to retrieve (optional)
   * @return ChatMessageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageEntityListing> getChatsRoomMessagesWithHttpInfo(String roomJid, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String limit, String before, String after) throws IOException {
    return getChatsRoomMessages(createGetChatsRoomMessagesRequest(roomJid, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, limit, before, after).withHttpInfo());
  }

  private GetChatsRoomMessagesRequest createGetChatsRoomMessagesRequest(String roomJid, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String limit, String before, String after) {
    return GetChatsRoomMessagesRequest.builder()
            .withRoomJid(roomJid)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withLimit(limit)

            .withBefore(before)

            .withAfter(after)

            .build();
  }

  /**
   * Get a room's message history
   * 
   * getChatsRoomMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsRoomMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsThreadMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param threadId threadId (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param limit The maximum number of messages to retrieve (optional)
   * @param before The cutoff date for messages to retrieve (optional)
   * @param after The beginning date for messages to retrieve (optional)
   * @return ChatMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageEntityListing getChatsThreadMessages(String threadId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String limit, String before, String after) throws IOException, ApiException {
    return  getChatsThreadMessages(createGetChatsThreadMessagesRequest(threadId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, limit, before, after));
  }

  /**
   * Get history by thread
   * 
   * getChatsThreadMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param threadId threadId (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param limit The maximum number of messages to retrieve (optional)
   * @param before The cutoff date for messages to retrieve (optional)
   * @param after The beginning date for messages to retrieve (optional)
   * @return ChatMessageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageEntityListing> getChatsThreadMessagesWithHttpInfo(String threadId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String limit, String before, String after) throws IOException {
    return getChatsThreadMessages(createGetChatsThreadMessagesRequest(threadId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, limit, before, after).withHttpInfo());
  }

  private GetChatsThreadMessagesRequest createGetChatsThreadMessagesRequest(String threadId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String limit, String before, String after) {
    return GetChatsThreadMessagesRequest.builder()
            .withThreadId(threadId)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withLimit(limit)

            .withBefore(before)

            .withAfter(after)

            .build();
  }

  /**
   * Get history by thread
   * 
   * getChatsThreadMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsThreadMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Get messages by id(s) from a 1on1
   * 
   * getChatsUserMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsUserMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsUserMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsUserMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsUserMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param userId userId (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param limit The maximum number of messages to retrieve (optional)
   * @param before The cutoff date for messages to retrieve (optional)
   * @param after The beginning date for messages to retrieve (optional)
   * @return ChatMessageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatMessageResponse getChatsUserMessages(String userId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String limit, String before, String after) throws IOException, ApiException {
    return  getChatsUserMessages(createGetChatsUserMessagesRequest(userId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, limit, before, after));
  }

  /**
   * Get 1on1 History between a user
   * 
   * getChatsUserMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param userId userId (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param limit The maximum number of messages to retrieve (optional)
   * @param before The cutoff date for messages to retrieve (optional)
   * @param after The beginning date for messages to retrieve (optional)
   * @return ChatMessageResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatMessageResponse> getChatsUserMessagesWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String limit, String before, String after) throws IOException {
    return getChatsUserMessages(createGetChatsUserMessagesRequest(userId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, limit, before, after).withHttpInfo());
  }

  private GetChatsUserMessagesRequest createGetChatsUserMessagesRequest(String userId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String limit, String before, String after) {
    return GetChatsUserMessagesRequest.builder()
            .withUserId(userId)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withLimit(limit)

            .withBefore(before)

            .withAfter(after)

            .build();
  }

  /**
   * Get 1on1 History between a user
   * 
   * getChatsUserMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getChatsUserMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Set properties for a room
   * 
   * patchChatsRoom is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchChatsRoom is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchChatsRoom is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchChatsRoom is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchChatsRoomMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchChatsRoomMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchChatsRoomMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchChatsRoomMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchChatsUserMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchChatsUserMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchChatsUserMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchChatsUserMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Send a message to a room
   * 
   * postChatsRoomMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postChatsRoomMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postChatsRoomMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postChatsRoomMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Join a room
   * 
   * postChatsRoomParticipant is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postChatsRoomParticipant is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postChatsRoomParticipant is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postChatsRoomParticipant is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Add pinned messages for a room, up to a maximum of 5 pinned messages
   * 
   * postChatsRoomPinnedmessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param roomJid roomJid (required)
   * @param body Pinned Message Ids (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postChatsRoomPinnedmessages(String roomJid, PinnedMessageRequest body) throws IOException, ApiException {
     postChatsRoomPinnedmessages(createPostChatsRoomPinnedmessagesRequest(roomJid, body));
  }

  /**
   * Add pinned messages for a room, up to a maximum of 5 pinned messages
   * 
   * postChatsRoomPinnedmessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param roomJid roomJid (required)
   * @param body Pinned Message Ids (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postChatsRoomPinnedmessagesWithHttpInfo(String roomJid, PinnedMessageRequest body) throws IOException {
    return postChatsRoomPinnedmessages(createPostChatsRoomPinnedmessagesRequest(roomJid, body).withHttpInfo());
  }

  private PostChatsRoomPinnedmessagesRequest createPostChatsRoomPinnedmessagesRequest(String roomJid, PinnedMessageRequest body) {
    return PostChatsRoomPinnedmessagesRequest.builder()
            .withRoomJid(roomJid)

            .withBody(body)

            .build();
  }

  /**
   * Add pinned messages for a room, up to a maximum of 5 pinned messages
   * 
   * postChatsRoomPinnedmessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postChatsRoomPinnedmessages(PostChatsRoomPinnedmessagesRequest request) throws IOException, ApiException {
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
   * postChatsRoomPinnedmessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postChatsRoomPinnedmessages(ApiRequest<PinnedMessageRequest> request) throws IOException {
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
   * postChatsRooms is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postChatsRooms is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postChatsRooms is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postChatsRooms is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postChatsUserMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postChatsUserMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postChatsUserMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postChatsUserMessages is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
