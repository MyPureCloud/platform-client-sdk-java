package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.CreateTriggerRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.TestModeEventResults;
import com.mypurecloud.sdk.v2.model.TestModeResults;
import com.mypurecloud.sdk.v2.model.TopicCursorEntityListing;
import com.mypurecloud.sdk.v2.model.Trigger;
import com.mypurecloud.sdk.v2.model.TriggerEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateTriggerRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteProcessautomationTriggerRequest;
import com.mypurecloud.sdk.v2.api.request.GetProcessautomationTriggerRequest;
import com.mypurecloud.sdk.v2.api.request.GetProcessautomationTriggersRequest;
import com.mypurecloud.sdk.v2.api.request.GetProcessautomationTriggersTopicsRequest;
import com.mypurecloud.sdk.v2.api.request.PostProcessautomationTriggerTestRequest;
import com.mypurecloud.sdk.v2.api.request.PostProcessautomationTriggersRequest;
import com.mypurecloud.sdk.v2.api.request.PostProcessautomationTriggersTopicTestRequest;
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
   * Retrieve a single Trigger matching id.
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
   * Retrieve a single Trigger matching id.
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
   * Retrieve a single Trigger matching id.
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
   * Retrieve a single Trigger matching id.
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
   * Retrieves all triggers
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param topicName Topic name (optional)
   * @param enabled Boolean indicating desired enabled state of triggers (optional)
   * @return TriggerEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TriggerEntityListing getProcessautomationTriggers(String before, String after, String pageSize, String topicName, Boolean enabled) throws IOException, ApiException {
    return  getProcessautomationTriggers(createGetProcessautomationTriggersRequest(before, after, pageSize, topicName, enabled));
  }

  /**
   * Retrieves all triggers
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param topicName Topic name (optional)
   * @param enabled Boolean indicating desired enabled state of triggers (optional)
   * @return TriggerEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TriggerEntityListing> getProcessautomationTriggersWithHttpInfo(String before, String after, String pageSize, String topicName, Boolean enabled) throws IOException {
    return getProcessautomationTriggers(createGetProcessautomationTriggersRequest(before, after, pageSize, topicName, enabled).withHttpInfo());
  }

  private GetProcessautomationTriggersRequest createGetProcessautomationTriggersRequest(String before, String after, String pageSize, String topicName, Boolean enabled) {
    return GetProcessautomationTriggersRequest.builder()
            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withTopicName(topicName)

            .withEnabled(enabled)

            .build();
  }

  /**
   * Retrieves all triggers
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
   * Retrieves all triggers
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
