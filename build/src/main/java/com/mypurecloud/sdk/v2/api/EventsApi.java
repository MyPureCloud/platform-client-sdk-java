package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.BatchConversationEventRequest;
import com.mypurecloud.sdk.v2.model.BatchEventResponse;
import com.mypurecloud.sdk.v2.model.BatchUserPresenceEventRequest;
import com.mypurecloud.sdk.v2.model.BatchUserRoutingStatusEventRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;


import com.mypurecloud.sdk.v2.api.request.PostEventsConversationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostEventsUsersPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.PostEventsUsersRoutingstatusRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventsApi {
  private final ApiClient pcapiClient;

  public EventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Publish Conversation Batch Events
   * 
   * @param body batchRequest (required)
   * @return BatchEventResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BatchEventResponse postEventsConversations(BatchConversationEventRequest body) throws IOException, ApiException {
    return  postEventsConversations(createPostEventsConversationsRequest(body));
  }

  /**
   * Publish Conversation Batch Events
   * 
   * @param body batchRequest (required)
   * @return BatchEventResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BatchEventResponse> postEventsConversationsWithHttpInfo(BatchConversationEventRequest body) throws IOException {
    return postEventsConversations(createPostEventsConversationsRequest(body).withHttpInfo());
  }

  private PostEventsConversationsRequest createPostEventsConversationsRequest(BatchConversationEventRequest body) {
    return PostEventsConversationsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Publish Conversation Batch Events
   * 
   * @param request The request object
   * @return BatchEventResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BatchEventResponse postEventsConversations(PostEventsConversationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BatchEventResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BatchEventResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish Conversation Batch Events
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BatchEventResponse> postEventsConversations(ApiRequest<BatchConversationEventRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BatchEventResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BatchEventResponse> response = (ApiResponse<BatchEventResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BatchEventResponse> response = (ApiResponse<BatchEventResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Publish User Presence Status Batch Events
   * 
   * @param body batchRequest (required)
   * @return BatchEventResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BatchEventResponse postEventsUsersPresence(BatchUserPresenceEventRequest body) throws IOException, ApiException {
    return  postEventsUsersPresence(createPostEventsUsersPresenceRequest(body));
  }

  /**
   * Publish User Presence Status Batch Events
   * 
   * @param body batchRequest (required)
   * @return BatchEventResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BatchEventResponse> postEventsUsersPresenceWithHttpInfo(BatchUserPresenceEventRequest body) throws IOException {
    return postEventsUsersPresence(createPostEventsUsersPresenceRequest(body).withHttpInfo());
  }

  private PostEventsUsersPresenceRequest createPostEventsUsersPresenceRequest(BatchUserPresenceEventRequest body) {
    return PostEventsUsersPresenceRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Publish User Presence Status Batch Events
   * 
   * @param request The request object
   * @return BatchEventResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BatchEventResponse postEventsUsersPresence(PostEventsUsersPresenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BatchEventResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BatchEventResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish User Presence Status Batch Events
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BatchEventResponse> postEventsUsersPresence(ApiRequest<BatchUserPresenceEventRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BatchEventResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BatchEventResponse> response = (ApiResponse<BatchEventResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BatchEventResponse> response = (ApiResponse<BatchEventResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Publish Agent Routing Status Batch Events
   * 
   * @param body batchRequest (required)
   * @return BatchEventResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BatchEventResponse postEventsUsersRoutingstatus(BatchUserRoutingStatusEventRequest body) throws IOException, ApiException {
    return  postEventsUsersRoutingstatus(createPostEventsUsersRoutingstatusRequest(body));
  }

  /**
   * Publish Agent Routing Status Batch Events
   * 
   * @param body batchRequest (required)
   * @return BatchEventResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BatchEventResponse> postEventsUsersRoutingstatusWithHttpInfo(BatchUserRoutingStatusEventRequest body) throws IOException {
    return postEventsUsersRoutingstatus(createPostEventsUsersRoutingstatusRequest(body).withHttpInfo());
  }

  private PostEventsUsersRoutingstatusRequest createPostEventsUsersRoutingstatusRequest(BatchUserRoutingStatusEventRequest body) {
    return PostEventsUsersRoutingstatusRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Publish Agent Routing Status Batch Events
   * 
   * @param request The request object
   * @return BatchEventResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BatchEventResponse postEventsUsersRoutingstatus(PostEventsUsersRoutingstatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BatchEventResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BatchEventResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish Agent Routing Status Batch Events
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BatchEventResponse> postEventsUsersRoutingstatus(ApiRequest<BatchUserRoutingStatusEventRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BatchEventResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BatchEventResponse> response = (ApiResponse<BatchEventResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BatchEventResponse> response = (ApiResponse<BatchEventResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
