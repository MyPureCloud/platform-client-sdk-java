package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.CreateScheduledTriggerRequest;
import com.mypurecloud.sdk.v2.model.CreateTriggerRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ScheduledTrigger;
import com.mypurecloud.sdk.v2.model.ScheduledTriggerEntityListing;
import com.mypurecloud.sdk.v2.model.TestModeEventResults;
import com.mypurecloud.sdk.v2.model.TestModeResults;
import com.mypurecloud.sdk.v2.model.TopicCursorEntityListing;
import com.mypurecloud.sdk.v2.model.Trigger;
import com.mypurecloud.sdk.v2.model.TriggerEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateScheduledTriggerRequest;
import com.mypurecloud.sdk.v2.model.UpdateTriggerRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteProcessautomationScheduledtriggerRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteProcessautomationTriggerRequest;
import com.mypurecloud.sdk.v2.api.request.GetProcessautomationScheduledtriggerRequest;
import com.mypurecloud.sdk.v2.api.request.GetProcessautomationScheduledtriggersRequest;
import com.mypurecloud.sdk.v2.api.request.GetProcessautomationTriggerRequest;
import com.mypurecloud.sdk.v2.api.request.GetProcessautomationTriggersRequest;
import com.mypurecloud.sdk.v2.api.request.GetProcessautomationTriggersTopicsRequest;
import com.mypurecloud.sdk.v2.api.request.PostProcessautomationScheduledtriggersRequest;
import com.mypurecloud.sdk.v2.api.request.PostProcessautomationTriggerTestRequest;
import com.mypurecloud.sdk.v2.api.request.PostProcessautomationTriggersRequest;
import com.mypurecloud.sdk.v2.api.request.PostProcessautomationTriggersTopicTestRequest;
import com.mypurecloud.sdk.v2.api.request.PutProcessautomationScheduledtriggerRequest;
import com.mypurecloud.sdk.v2.api.request.PutProcessautomationTriggerRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessAutomationApi {
  private final ApiClient pcapiClient;

  public ProcessAutomationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProcessAutomationApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a Scheduled Trigger
   * 
   * @param scheduledTriggerId scheduledTriggerId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteProcessautomationScheduledtrigger(String scheduledTriggerId) throws IOException, ApiException {
     deleteProcessautomationScheduledtrigger(createDeleteProcessautomationScheduledtriggerRequest(scheduledTriggerId));
  }

  /**
   * Delete a Scheduled Trigger
   * 
   * @param scheduledTriggerId scheduledTriggerId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteProcessautomationScheduledtriggerWithHttpInfo(String scheduledTriggerId) throws IOException {
    return deleteProcessautomationScheduledtrigger(createDeleteProcessautomationScheduledtriggerRequest(scheduledTriggerId).withHttpInfo());
  }

  private DeleteProcessautomationScheduledtriggerRequest createDeleteProcessautomationScheduledtriggerRequest(String scheduledTriggerId) {
    return DeleteProcessautomationScheduledtriggerRequest.builder()
            .withScheduledTriggerId(scheduledTriggerId)

            .build();
  }

  /**
   * Delete a Scheduled Trigger
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteProcessautomationScheduledtrigger(DeleteProcessautomationScheduledtriggerRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Scheduled Trigger
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteProcessautomationScheduledtrigger(ApiRequest<Void> request) throws IOException {
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
   * Delete a Trigger
   * 
   * @param triggerId triggerId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteProcessautomationTrigger(String triggerId) throws IOException, ApiException {
     deleteProcessautomationTrigger(createDeleteProcessautomationTriggerRequest(triggerId));
  }

  /**
   * Delete a Trigger
   * 
   * @param triggerId triggerId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteProcessautomationTriggerWithHttpInfo(String triggerId) throws IOException {
    return deleteProcessautomationTrigger(createDeleteProcessautomationTriggerRequest(triggerId).withHttpInfo());
  }

  private DeleteProcessautomationTriggerRequest createDeleteProcessautomationTriggerRequest(String triggerId) {
    return DeleteProcessautomationTriggerRequest.builder()
            .withTriggerId(triggerId)

            .build();
  }

  /**
   * Delete a Trigger
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteProcessautomationTrigger(DeleteProcessautomationTriggerRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Trigger
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteProcessautomationTrigger(ApiRequest<Void> request) throws IOException {
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
   * Retrieve a single Scheduled Trigger matching id
   * 
   * @param scheduledTriggerId scheduledTriggerId (required)
   * @return ScheduledTrigger
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduledTrigger getProcessautomationScheduledtrigger(String scheduledTriggerId) throws IOException, ApiException {
    return  getProcessautomationScheduledtrigger(createGetProcessautomationScheduledtriggerRequest(scheduledTriggerId));
  }

  /**
   * Retrieve a single Scheduled Trigger matching id
   * 
   * @param scheduledTriggerId scheduledTriggerId (required)
   * @return ScheduledTrigger
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduledTrigger> getProcessautomationScheduledtriggerWithHttpInfo(String scheduledTriggerId) throws IOException {
    return getProcessautomationScheduledtrigger(createGetProcessautomationScheduledtriggerRequest(scheduledTriggerId).withHttpInfo());
  }

  private GetProcessautomationScheduledtriggerRequest createGetProcessautomationScheduledtriggerRequest(String scheduledTriggerId) {
    return GetProcessautomationScheduledtriggerRequest.builder()
            .withScheduledTriggerId(scheduledTriggerId)

            .build();
  }

  /**
   * Retrieve a single Scheduled Trigger matching id
   * 
   * @param request The request object
   * @return ScheduledTrigger
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduledTrigger getProcessautomationScheduledtrigger(GetProcessautomationScheduledtriggerRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScheduledTrigger> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScheduledTrigger>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a single Scheduled Trigger matching id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduledTrigger> getProcessautomationScheduledtrigger(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScheduledTrigger>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduledTrigger> response = (ApiResponse<ScheduledTrigger>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduledTrigger> response = (ApiResponse<ScheduledTrigger>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieves all scheduled triggers, optionally filtered by query parameters.
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param enabled Boolean indicating desired enabled state of scheduled triggers (optional)
   * @return ScheduledTriggerEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduledTriggerEntityListing getProcessautomationScheduledtriggers(String before, String after, String pageSize, Boolean enabled) throws IOException, ApiException {
    return  getProcessautomationScheduledtriggers(createGetProcessautomationScheduledtriggersRequest(before, after, pageSize, enabled));
  }

  /**
   * Retrieves all scheduled triggers, optionally filtered by query parameters.
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param enabled Boolean indicating desired enabled state of scheduled triggers (optional)
   * @return ScheduledTriggerEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduledTriggerEntityListing> getProcessautomationScheduledtriggersWithHttpInfo(String before, String after, String pageSize, Boolean enabled) throws IOException {
    return getProcessautomationScheduledtriggers(createGetProcessautomationScheduledtriggersRequest(before, after, pageSize, enabled).withHttpInfo());
  }

  private GetProcessautomationScheduledtriggersRequest createGetProcessautomationScheduledtriggersRequest(String before, String after, String pageSize, Boolean enabled) {
    return GetProcessautomationScheduledtriggersRequest.builder()
            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withEnabled(enabled)

            .build();
  }

  /**
   * Retrieves all scheduled triggers, optionally filtered by query parameters.
   * 
   * @param request The request object
   * @return ScheduledTriggerEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduledTriggerEntityListing getProcessautomationScheduledtriggers(GetProcessautomationScheduledtriggersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScheduledTriggerEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScheduledTriggerEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves all scheduled triggers, optionally filtered by query parameters.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduledTriggerEntityListing> getProcessautomationScheduledtriggers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScheduledTriggerEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduledTriggerEntityListing> response = (ApiResponse<ScheduledTriggerEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduledTriggerEntityListing> response = (ApiResponse<ScheduledTriggerEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve a single Trigger matching id
   * 
   * @param triggerId triggerId (required)
   * @return Trigger
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trigger getProcessautomationTrigger(String triggerId) throws IOException, ApiException {
    return  getProcessautomationTrigger(createGetProcessautomationTriggerRequest(triggerId));
  }

  /**
   * Retrieve a single Trigger matching id
   * 
   * @param triggerId triggerId (required)
   * @return Trigger
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trigger> getProcessautomationTriggerWithHttpInfo(String triggerId) throws IOException {
    return getProcessautomationTrigger(createGetProcessautomationTriggerRequest(triggerId).withHttpInfo());
  }

  private GetProcessautomationTriggerRequest createGetProcessautomationTriggerRequest(String triggerId) {
    return GetProcessautomationTriggerRequest.builder()
            .withTriggerId(triggerId)

            .build();
  }

  /**
   * Retrieve a single Trigger matching id
   * 
   * @param request The request object
   * @return Trigger
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trigger getProcessautomationTrigger(GetProcessautomationTriggerRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Trigger> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Trigger>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a single Trigger matching id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trigger> getProcessautomationTrigger(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Trigger>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Trigger> response = (ApiResponse<Trigger>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Trigger> response = (ApiResponse<Trigger>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieves all triggers, optionally filtered by query parameters.
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param topicName Topic name(s). Separated by commas (optional)
   * @param enabled Boolean indicating desired enabled state of triggers (optional)
   * @param hasDelayBy Boolean to filter based on delayBySeconds being set in triggers. Default returns all, true returns only those with delayBySeconds set, false returns those without delayBySeconds set. (optional)
   * @return TriggerEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TriggerEntityListing getProcessautomationTriggers(String before, String after, String pageSize, String topicName, Boolean enabled, Boolean hasDelayBy) throws IOException, ApiException {
    return  getProcessautomationTriggers(createGetProcessautomationTriggersRequest(before, after, pageSize, topicName, enabled, hasDelayBy));
  }

  /**
   * Retrieves all triggers, optionally filtered by query parameters.
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param topicName Topic name(s). Separated by commas (optional)
   * @param enabled Boolean indicating desired enabled state of triggers (optional)
   * @param hasDelayBy Boolean to filter based on delayBySeconds being set in triggers. Default returns all, true returns only those with delayBySeconds set, false returns those without delayBySeconds set. (optional)
   * @return TriggerEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TriggerEntityListing> getProcessautomationTriggersWithHttpInfo(String before, String after, String pageSize, String topicName, Boolean enabled, Boolean hasDelayBy) throws IOException {
    return getProcessautomationTriggers(createGetProcessautomationTriggersRequest(before, after, pageSize, topicName, enabled, hasDelayBy).withHttpInfo());
  }

  private GetProcessautomationTriggersRequest createGetProcessautomationTriggersRequest(String before, String after, String pageSize, String topicName, Boolean enabled, Boolean hasDelayBy) {
    return GetProcessautomationTriggersRequest.builder()
            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withTopicName(topicName)

            .withEnabled(enabled)

            .withHasDelayBy(hasDelayBy)

            .build();
  }

  /**
   * Retrieves all triggers, optionally filtered by query parameters.
   * 
   * @param request The request object
   * @return TriggerEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TriggerEntityListing getProcessautomationTriggers(GetProcessautomationTriggersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TriggerEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TriggerEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves all triggers, optionally filtered by query parameters.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TriggerEntityListing> getProcessautomationTriggers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TriggerEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TriggerEntityListing> response = (ApiResponse<TriggerEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TriggerEntityListing> response = (ApiResponse<TriggerEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get topics available for organization
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return TopicCursorEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TopicCursorEntityListing getProcessautomationTriggersTopics(String before, String after, String pageSize) throws IOException, ApiException {
    return  getProcessautomationTriggersTopics(createGetProcessautomationTriggersTopicsRequest(before, after, pageSize));
  }

  /**
   * Get topics available for organization
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return TopicCursorEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TopicCursorEntityListing> getProcessautomationTriggersTopicsWithHttpInfo(String before, String after, String pageSize) throws IOException {
    return getProcessautomationTriggersTopics(createGetProcessautomationTriggersTopicsRequest(before, after, pageSize).withHttpInfo());
  }

  private GetProcessautomationTriggersTopicsRequest createGetProcessautomationTriggersTopicsRequest(String before, String after, String pageSize) {
    return GetProcessautomationTriggersTopicsRequest.builder()
            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get topics available for organization
   * 
   * @param request The request object
   * @return TopicCursorEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TopicCursorEntityListing getProcessautomationTriggersTopics(GetProcessautomationTriggersTopicsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TopicCursorEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TopicCursorEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get topics available for organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TopicCursorEntityListing> getProcessautomationTriggersTopics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TopicCursorEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TopicCursorEntityListing> response = (ApiResponse<TopicCursorEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TopicCursorEntityListing> response = (ApiResponse<TopicCursorEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a scheduled Trigger
   * 
   * @param body Input used to create a Scheduled Trigger (required)
   * @return ScheduledTrigger
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduledTrigger postProcessautomationScheduledtriggers(CreateScheduledTriggerRequest body) throws IOException, ApiException {
    return  postProcessautomationScheduledtriggers(createPostProcessautomationScheduledtriggersRequest(body));
  }

  /**
   * Create a scheduled Trigger
   * 
   * @param body Input used to create a Scheduled Trigger (required)
   * @return ScheduledTrigger
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduledTrigger> postProcessautomationScheduledtriggersWithHttpInfo(CreateScheduledTriggerRequest body) throws IOException {
    return postProcessautomationScheduledtriggers(createPostProcessautomationScheduledtriggersRequest(body).withHttpInfo());
  }

  private PostProcessautomationScheduledtriggersRequest createPostProcessautomationScheduledtriggersRequest(CreateScheduledTriggerRequest body) {
    return PostProcessautomationScheduledtriggersRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a scheduled Trigger
   * 
   * @param request The request object
   * @return ScheduledTrigger
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduledTrigger postProcessautomationScheduledtriggers(PostProcessautomationScheduledtriggersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScheduledTrigger> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScheduledTrigger>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a scheduled Trigger
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduledTrigger> postProcessautomationScheduledtriggers(ApiRequest<CreateScheduledTriggerRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScheduledTrigger>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduledTrigger> response = (ApiResponse<ScheduledTrigger>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduledTrigger> response = (ApiResponse<ScheduledTrigger>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Test the matching of a Trigger based on provided event body
   * 
   * @param triggerId triggerId (required)
   * @param body eventBody (optional)
   * @return TestModeResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestModeResults postProcessautomationTriggerTest(String triggerId, String body) throws IOException, ApiException {
    return  postProcessautomationTriggerTest(createPostProcessautomationTriggerTestRequest(triggerId, body));
  }

  /**
   * Test the matching of a Trigger based on provided event body
   * 
   * @param triggerId triggerId (required)
   * @param body eventBody (optional)
   * @return TestModeResults
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestModeResults> postProcessautomationTriggerTestWithHttpInfo(String triggerId, String body) throws IOException {
    return postProcessautomationTriggerTest(createPostProcessautomationTriggerTestRequest(triggerId, body).withHttpInfo());
  }

  private PostProcessautomationTriggerTestRequest createPostProcessautomationTriggerTestRequest(String triggerId, String body) {
    return PostProcessautomationTriggerTestRequest.builder()
            .withTriggerId(triggerId)

            .withBody(body)

            .build();
  }

  /**
   * Test the matching of a Trigger based on provided event body
   * 
   * @param request The request object
   * @return TestModeResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestModeResults postProcessautomationTriggerTest(PostProcessautomationTriggerTestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TestModeResults> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TestModeResults>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Test the matching of a Trigger based on provided event body
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestModeResults> postProcessautomationTriggerTest(ApiRequest<String> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TestModeResults>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TestModeResults> response = (ApiResponse<TestModeResults>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TestModeResults> response = (ApiResponse<TestModeResults>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Trigger
   * 
   * @param body Input used to create a Trigger. (required)
   * @return Trigger
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trigger postProcessautomationTriggers(CreateTriggerRequest body) throws IOException, ApiException {
    return  postProcessautomationTriggers(createPostProcessautomationTriggersRequest(body));
  }

  /**
   * Create a Trigger
   * 
   * @param body Input used to create a Trigger. (required)
   * @return Trigger
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trigger> postProcessautomationTriggersWithHttpInfo(CreateTriggerRequest body) throws IOException {
    return postProcessautomationTriggers(createPostProcessautomationTriggersRequest(body).withHttpInfo());
  }

  private PostProcessautomationTriggersRequest createPostProcessautomationTriggersRequest(CreateTriggerRequest body) {
    return PostProcessautomationTriggersRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a Trigger
   * 
   * @param request The request object
   * @return Trigger
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trigger postProcessautomationTriggers(PostProcessautomationTriggersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Trigger> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Trigger>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Trigger
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trigger> postProcessautomationTriggers(ApiRequest<CreateTriggerRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Trigger>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Trigger> response = (ApiResponse<Trigger>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Trigger> response = (ApiResponse<Trigger>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Test the matching of all organization Triggers on given topic using provided event body
   * 
   * @param topicName topicName (required)
   * @param body eventBody (optional)
   * @return TestModeEventResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestModeEventResults postProcessautomationTriggersTopicTest(String topicName, String body) throws IOException, ApiException {
    return  postProcessautomationTriggersTopicTest(createPostProcessautomationTriggersTopicTestRequest(topicName, body));
  }

  /**
   * Test the matching of all organization Triggers on given topic using provided event body
   * 
   * @param topicName topicName (required)
   * @param body eventBody (optional)
   * @return TestModeEventResults
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestModeEventResults> postProcessautomationTriggersTopicTestWithHttpInfo(String topicName, String body) throws IOException {
    return postProcessautomationTriggersTopicTest(createPostProcessautomationTriggersTopicTestRequest(topicName, body).withHttpInfo());
  }

  private PostProcessautomationTriggersTopicTestRequest createPostProcessautomationTriggersTopicTestRequest(String topicName, String body) {
    return PostProcessautomationTriggersTopicTestRequest.builder()
            .withTopicName(topicName)

            .withBody(body)

            .build();
  }

  /**
   * Test the matching of all organization Triggers on given topic using provided event body
   * 
   * @param request The request object
   * @return TestModeEventResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestModeEventResults postProcessautomationTriggersTopicTest(PostProcessautomationTriggersTopicTestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TestModeEventResults> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TestModeEventResults>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Test the matching of all organization Triggers on given topic using provided event body
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestModeEventResults> postProcessautomationTriggersTopicTest(ApiRequest<String> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TestModeEventResults>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TestModeEventResults> response = (ApiResponse<TestModeEventResults>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TestModeEventResults> response = (ApiResponse<TestModeEventResults>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a Scheduled Trigger
   * 
   * @param scheduledTriggerId scheduledTriggerId (required)
   * @param body Input to update Scheduled Trigger. (required)
   * @return ScheduledTrigger
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduledTrigger putProcessautomationScheduledtrigger(String scheduledTriggerId, UpdateScheduledTriggerRequest body) throws IOException, ApiException {
    return  putProcessautomationScheduledtrigger(createPutProcessautomationScheduledtriggerRequest(scheduledTriggerId, body));
  }

  /**
   * Update a Scheduled Trigger
   * 
   * @param scheduledTriggerId scheduledTriggerId (required)
   * @param body Input to update Scheduled Trigger. (required)
   * @return ScheduledTrigger
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduledTrigger> putProcessautomationScheduledtriggerWithHttpInfo(String scheduledTriggerId, UpdateScheduledTriggerRequest body) throws IOException {
    return putProcessautomationScheduledtrigger(createPutProcessautomationScheduledtriggerRequest(scheduledTriggerId, body).withHttpInfo());
  }

  private PutProcessautomationScheduledtriggerRequest createPutProcessautomationScheduledtriggerRequest(String scheduledTriggerId, UpdateScheduledTriggerRequest body) {
    return PutProcessautomationScheduledtriggerRequest.builder()
            .withScheduledTriggerId(scheduledTriggerId)

            .withBody(body)

            .build();
  }

  /**
   * Update a Scheduled Trigger
   * 
   * @param request The request object
   * @return ScheduledTrigger
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduledTrigger putProcessautomationScheduledtrigger(PutProcessautomationScheduledtriggerRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScheduledTrigger> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScheduledTrigger>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a Scheduled Trigger
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduledTrigger> putProcessautomationScheduledtrigger(ApiRequest<UpdateScheduledTriggerRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScheduledTrigger>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduledTrigger> response = (ApiResponse<ScheduledTrigger>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduledTrigger> response = (ApiResponse<ScheduledTrigger>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a Trigger
   * 
   * @param triggerId triggerId (required)
   * @param body Input to update Trigger. (topicName cannot be updated, a new trigger must be created to use a new topicName) (required)
   * @return Trigger
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trigger putProcessautomationTrigger(String triggerId, UpdateTriggerRequest body) throws IOException, ApiException {
    return  putProcessautomationTrigger(createPutProcessautomationTriggerRequest(triggerId, body));
  }

  /**
   * Update a Trigger
   * 
   * @param triggerId triggerId (required)
   * @param body Input to update Trigger. (topicName cannot be updated, a new trigger must be created to use a new topicName) (required)
   * @return Trigger
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trigger> putProcessautomationTriggerWithHttpInfo(String triggerId, UpdateTriggerRequest body) throws IOException {
    return putProcessautomationTrigger(createPutProcessautomationTriggerRequest(triggerId, body).withHttpInfo());
  }

  private PutProcessautomationTriggerRequest createPutProcessautomationTriggerRequest(String triggerId, UpdateTriggerRequest body) {
    return PutProcessautomationTriggerRequest.builder()
            .withTriggerId(triggerId)

            .withBody(body)

            .build();
  }

  /**
   * Update a Trigger
   * 
   * @param request The request object
   * @return Trigger
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trigger putProcessautomationTrigger(PutProcessautomationTriggerRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Trigger> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Trigger>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a Trigger
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trigger> putProcessautomationTrigger(ApiRequest<UpdateTriggerRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Trigger>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Trigger> response = (ApiResponse<Trigger>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Trigger> response = (ApiResponse<Trigger>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
