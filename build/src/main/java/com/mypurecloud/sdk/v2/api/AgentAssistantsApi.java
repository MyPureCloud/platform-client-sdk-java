package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.Assistant;
import com.mypurecloud.sdk.v2.model.AssistantListing;
import com.mypurecloud.sdk.v2.model.AssistantQueue;
import com.mypurecloud.sdk.v2.model.AssistantQueueListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;


import com.mypurecloud.sdk.v2.api.request.DeleteAssistantRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAssistantQueueRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAssistantQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAssistantRequest;
import com.mypurecloud.sdk.v2.api.request.GetAssistantQueueRequest;
import com.mypurecloud.sdk.v2.api.request.GetAssistantQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAssistantsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAssistantsQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAssistantRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAssistantQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAssistantsRequest;
import com.mypurecloud.sdk.v2.api.request.PutAssistantQueueRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgentAssistantsApi {
  private final ApiClient pcapiClient;

  public AgentAssistantsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AgentAssistantsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAssistant(String assistantId) throws IOException, ApiException {
     deleteAssistant(createDeleteAssistantRequest(assistantId));
  }

  /**
   * Delete an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAssistantWithHttpInfo(String assistantId) throws IOException {
    return deleteAssistant(createDeleteAssistantRequest(assistantId).withHttpInfo());
  }

  private DeleteAssistantRequest createDeleteAssistantRequest(String assistantId) {
    return DeleteAssistantRequest.builder()
            .withAssistantId(assistantId)

            .build();
  }

  /**
   * Delete an assistant.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAssistant(DeleteAssistantRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an assistant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAssistant(ApiRequest<Void> request) throws IOException {
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
   * Disassociate a queue from an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @param queueId Queue ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAssistantQueue(String assistantId, String queueId) throws IOException, ApiException {
     deleteAssistantQueue(createDeleteAssistantQueueRequest(assistantId, queueId));
  }

  /**
   * Disassociate a queue from an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @param queueId Queue ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAssistantQueueWithHttpInfo(String assistantId, String queueId) throws IOException {
    return deleteAssistantQueue(createDeleteAssistantQueueRequest(assistantId, queueId).withHttpInfo());
  }

  private DeleteAssistantQueueRequest createDeleteAssistantQueueRequest(String assistantId, String queueId) {
    return DeleteAssistantQueueRequest.builder()
            .withAssistantId(assistantId)

            .withQueueId(queueId)

            .build();
  }

  /**
   * Disassociate a queue from an assistant.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAssistantQueue(DeleteAssistantQueueRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Disassociate a queue from an assistant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAssistantQueue(ApiRequest<Void> request) throws IOException {
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
   * Disassociate the queues from an assistant for the given assistant ID and queue IDs.
   * 
   * @param assistantId Assistant ID (required)
   * @param queueIds Comma-separated identifiers of the queues that need to be deleted. (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAssistantQueues(String assistantId, String queueIds) throws IOException, ApiException {
     deleteAssistantQueues(createDeleteAssistantQueuesRequest(assistantId, queueIds));
  }

  /**
   * Disassociate the queues from an assistant for the given assistant ID and queue IDs.
   * 
   * @param assistantId Assistant ID (required)
   * @param queueIds Comma-separated identifiers of the queues that need to be deleted. (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAssistantQueuesWithHttpInfo(String assistantId, String queueIds) throws IOException {
    return deleteAssistantQueues(createDeleteAssistantQueuesRequest(assistantId, queueIds).withHttpInfo());
  }

  private DeleteAssistantQueuesRequest createDeleteAssistantQueuesRequest(String assistantId, String queueIds) {
    return DeleteAssistantQueuesRequest.builder()
            .withAssistantId(assistantId)

            .withQueueIds(queueIds)

            .build();
  }

  /**
   * Disassociate the queues from an assistant for the given assistant ID and queue IDs.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAssistantQueues(DeleteAssistantQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Disassociate the queues from an assistant for the given assistant ID and queue IDs.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAssistantQueues(ApiRequest<Void> request) throws IOException {
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
   * Get an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Assistant
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Assistant getAssistant(String assistantId, String expand) throws IOException, ApiException {
    return  getAssistant(createGetAssistantRequest(assistantId, expand));
  }

  /**
   * Get an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Assistant
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Assistant> getAssistantWithHttpInfo(String assistantId, String expand) throws IOException {
    return getAssistant(createGetAssistantRequest(assistantId, expand).withHttpInfo());
  }

  private GetAssistantRequest createGetAssistantRequest(String assistantId, String expand) {
    return GetAssistantRequest.builder()
            .withAssistantId(assistantId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get an assistant.
   * 
   * @param request The request object
   * @return Assistant
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Assistant getAssistant(GetAssistantRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Assistant> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Assistant>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an assistant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Assistant> getAssistant(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Assistant>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Assistant> response = (ApiResponse<Assistant>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Assistant> response = (ApiResponse<Assistant>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get queue Information for an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @param queueId Queue ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return AssistantQueue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantQueue getAssistantQueue(String assistantId, String queueId, String expand) throws IOException, ApiException {
    return  getAssistantQueue(createGetAssistantQueueRequest(assistantId, queueId, expand));
  }

  /**
   * Get queue Information for an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @param queueId Queue ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return AssistantQueue
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantQueue> getAssistantQueueWithHttpInfo(String assistantId, String queueId, String expand) throws IOException {
    return getAssistantQueue(createGetAssistantQueueRequest(assistantId, queueId, expand).withHttpInfo());
  }

  private GetAssistantQueueRequest createGetAssistantQueueRequest(String assistantId, String queueId, String expand) {
    return GetAssistantQueueRequest.builder()
            .withAssistantId(assistantId)

            .withQueueId(queueId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get queue Information for an assistant.
   * 
   * @param request The request object
   * @return AssistantQueue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantQueue getAssistantQueue(GetAssistantQueueRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssistantQueue> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssistantQueue>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get queue Information for an assistant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantQueue> getAssistantQueue(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssistantQueue>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantQueue> response = (ApiResponse<AssistantQueue>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantQueue> response = (ApiResponse<AssistantQueue>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all the queues associated with an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @return AssistantQueueListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantQueueListing getAssistantQueues(String assistantId, String before, String after, String pageSize, String expand) throws IOException, ApiException {
    return  getAssistantQueues(createGetAssistantQueuesRequest(assistantId, before, after, pageSize, expand));
  }

  /**
   * Get all the queues associated with an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @return AssistantQueueListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantQueueListing> getAssistantQueuesWithHttpInfo(String assistantId, String before, String after, String pageSize, String expand) throws IOException {
    return getAssistantQueues(createGetAssistantQueuesRequest(assistantId, before, after, pageSize, expand).withHttpInfo());
  }

  private GetAssistantQueuesRequest createGetAssistantQueuesRequest(String assistantId, String before, String after, String pageSize, String expand) {
    return GetAssistantQueuesRequest.builder()
            .withAssistantId(assistantId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withExpand(expand)

            .build();
  }

  /**
   * Get all the queues associated with an assistant.
   * 
   * @param request The request object
   * @return AssistantQueueListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantQueueListing getAssistantQueues(GetAssistantQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssistantQueueListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssistantQueueListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all the queues associated with an assistant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantQueueListing> getAssistantQueues(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssistantQueueListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantQueueListing> response = (ApiResponse<AssistantQueueListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantQueueListing> response = (ApiResponse<AssistantQueueListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all assistants.
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param name Return the assistant by the given name. (optional)
   * @param expand Which fields, if any, to expand (optional)
   * @return AssistantListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantListing getAssistants(String before, String after, String limit, String pageSize, String name, String expand) throws IOException, ApiException {
    return  getAssistants(createGetAssistantsRequest(before, after, limit, pageSize, name, expand));
  }

  /**
   * Get all assistants.
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param name Return the assistant by the given name. (optional)
   * @param expand Which fields, if any, to expand (optional)
   * @return AssistantListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantListing> getAssistantsWithHttpInfo(String before, String after, String limit, String pageSize, String name, String expand) throws IOException {
    return getAssistants(createGetAssistantsRequest(before, after, limit, pageSize, name, expand).withHttpInfo());
  }

  private GetAssistantsRequest createGetAssistantsRequest(String before, String after, String limit, String pageSize, String name, String expand) {
    return GetAssistantsRequest.builder()
            .withBefore(before)

            .withAfter(after)

            .withLimit(limit)

            .withPageSize(pageSize)

            .withName(name)

            .withExpand(expand)

            .build();
  }

  /**
   * Get all assistants.
   * 
   * @param request The request object
   * @return AssistantListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantListing getAssistants(GetAssistantsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssistantListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssistantListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all assistants.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantListing> getAssistants(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssistantListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantListing> response = (ApiResponse<AssistantListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantListing> response = (ApiResponse<AssistantListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all queues assigned to any assistant.
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param queueIds Comma-separated identifiers of the queues that need to be retrieved. (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @return AssistantQueueListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantQueueListing getAssistantsQueues(String before, String after, String pageSize, String queueIds, String expand) throws IOException, ApiException {
    return  getAssistantsQueues(createGetAssistantsQueuesRequest(before, after, pageSize, queueIds, expand));
  }

  /**
   * Get all queues assigned to any assistant.
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param queueIds Comma-separated identifiers of the queues that need to be retrieved. (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @return AssistantQueueListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantQueueListing> getAssistantsQueuesWithHttpInfo(String before, String after, String pageSize, String queueIds, String expand) throws IOException {
    return getAssistantsQueues(createGetAssistantsQueuesRequest(before, after, pageSize, queueIds, expand).withHttpInfo());
  }

  private GetAssistantsQueuesRequest createGetAssistantsQueuesRequest(String before, String after, String pageSize, String queueIds, String expand) {
    return GetAssistantsQueuesRequest.builder()
            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withQueueIds(queueIds)

            .withExpand(expand)

            .build();
  }

  /**
   * Get all queues assigned to any assistant.
   * 
   * @param request The request object
   * @return AssistantQueueListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantQueueListing getAssistantsQueues(GetAssistantsQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssistantQueueListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssistantQueueListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all queues assigned to any assistant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantQueueListing> getAssistantsQueues(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssistantQueueListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantQueueListing> response = (ApiResponse<AssistantQueueListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantQueueListing> response = (ApiResponse<AssistantQueueListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @param body  (required)
   * @return Assistant
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Assistant patchAssistant(String assistantId, Assistant body) throws IOException, ApiException {
    return  patchAssistant(createPatchAssistantRequest(assistantId, body));
  }

  /**
   * Update an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @param body  (required)
   * @return Assistant
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Assistant> patchAssistantWithHttpInfo(String assistantId, Assistant body) throws IOException {
    return patchAssistant(createPatchAssistantRequest(assistantId, body).withHttpInfo());
  }

  private PatchAssistantRequest createPatchAssistantRequest(String assistantId, Assistant body) {
    return PatchAssistantRequest.builder()
            .withAssistantId(assistantId)

            .withBody(body)

            .build();
  }

  /**
   * Update an assistant.
   * 
   * @param request The request object
   * @return Assistant
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Assistant patchAssistant(PatchAssistantRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Assistant> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Assistant>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an assistant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Assistant> patchAssistant(ApiRequest<Assistant> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Assistant>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Assistant> response = (ApiResponse<Assistant>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Assistant> response = (ApiResponse<Assistant>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update Queues for an Assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @param body  (required)
   * @return AssistantQueueListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantQueueListing patchAssistantQueues(String assistantId, List<AssistantQueue> body) throws IOException, ApiException {
    return  patchAssistantQueues(createPatchAssistantQueuesRequest(assistantId, body));
  }

  /**
   * Update Queues for an Assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @param body  (required)
   * @return AssistantQueueListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantQueueListing> patchAssistantQueuesWithHttpInfo(String assistantId, List<AssistantQueue> body) throws IOException {
    return patchAssistantQueues(createPatchAssistantQueuesRequest(assistantId, body).withHttpInfo());
  }

  private PatchAssistantQueuesRequest createPatchAssistantQueuesRequest(String assistantId, List<AssistantQueue> body) {
    return PatchAssistantQueuesRequest.builder()
            .withAssistantId(assistantId)

            .withBody(body)

            .build();
  }

  /**
   * Update Queues for an Assistant.
   * 
   * @param request The request object
   * @return AssistantQueueListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantQueueListing patchAssistantQueues(PatchAssistantQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssistantQueueListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssistantQueueListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Queues for an Assistant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantQueueListing> patchAssistantQueues(ApiRequest<List<AssistantQueue>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssistantQueueListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantQueueListing> response = (ApiResponse<AssistantQueueListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantQueueListing> response = (ApiResponse<AssistantQueueListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an Assistant.
   * 
   * @param body  (required)
   * @return Assistant
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Assistant postAssistants(Assistant body) throws IOException, ApiException {
    return  postAssistants(createPostAssistantsRequest(body));
  }

  /**
   * Create an Assistant.
   * 
   * @param body  (required)
   * @return Assistant
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Assistant> postAssistantsWithHttpInfo(Assistant body) throws IOException {
    return postAssistants(createPostAssistantsRequest(body).withHttpInfo());
  }

  private PostAssistantsRequest createPostAssistantsRequest(Assistant body) {
    return PostAssistantsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create an Assistant.
   * 
   * @param request The request object
   * @return Assistant
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Assistant postAssistants(PostAssistantsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Assistant> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Assistant>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an Assistant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Assistant> postAssistants(ApiRequest<Assistant> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Assistant>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Assistant> response = (ApiResponse<Assistant>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Assistant> response = (ApiResponse<Assistant>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a queue assistant association.
   * 
   * @param assistantId Assistant ID (required)
   * @param queueId Queue ID (required)
   * @param body  (required)
   * @return AssistantQueue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantQueue putAssistantQueue(String assistantId, String queueId, AssistantQueue body) throws IOException, ApiException {
    return  putAssistantQueue(createPutAssistantQueueRequest(assistantId, queueId, body));
  }

  /**
   * Create a queue assistant association.
   * 
   * @param assistantId Assistant ID (required)
   * @param queueId Queue ID (required)
   * @param body  (required)
   * @return AssistantQueue
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantQueue> putAssistantQueueWithHttpInfo(String assistantId, String queueId, AssistantQueue body) throws IOException {
    return putAssistantQueue(createPutAssistantQueueRequest(assistantId, queueId, body).withHttpInfo());
  }

  private PutAssistantQueueRequest createPutAssistantQueueRequest(String assistantId, String queueId, AssistantQueue body) {
    return PutAssistantQueueRequest.builder()
            .withAssistantId(assistantId)

            .withQueueId(queueId)

            .withBody(body)

            .build();
  }

  /**
   * Create a queue assistant association.
   * 
   * @param request The request object
   * @return AssistantQueue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantQueue putAssistantQueue(PutAssistantQueueRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssistantQueue> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssistantQueue>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a queue assistant association.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantQueue> putAssistantQueue(ApiRequest<AssistantQueue> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssistantQueue>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantQueue> response = (ApiResponse<AssistantQueue>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantQueue> response = (ApiResponse<AssistantQueue>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
