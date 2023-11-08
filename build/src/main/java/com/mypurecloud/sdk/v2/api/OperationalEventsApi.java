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
import com.mypurecloud.sdk.v2.model.EventDefinition;
import com.mypurecloud.sdk.v2.model.EventDefinitionListing;


import com.mypurecloud.sdk.v2.api.request.GetUsageEventsDefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsageEventsDefinitionsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationalEventsApi {
  private final ApiClient pcapiClient;

  public OperationalEventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OperationalEventsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get an operational event definition by its id
   * 
   * @param eventDefinitionId EventDefinition id (required)
   * @return EventDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EventDefinition getUsageEventsDefinition(String eventDefinitionId) throws IOException, ApiException {
    return  getUsageEventsDefinition(createGetUsageEventsDefinitionRequest(eventDefinitionId));
  }

  /**
   * Get an operational event definition by its id
   * 
   * @param eventDefinitionId EventDefinition id (required)
   * @return EventDefinition
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EventDefinition> getUsageEventsDefinitionWithHttpInfo(String eventDefinitionId) throws IOException {
    return getUsageEventsDefinition(createGetUsageEventsDefinitionRequest(eventDefinitionId).withHttpInfo());
  }

  private GetUsageEventsDefinitionRequest createGetUsageEventsDefinitionRequest(String eventDefinitionId) {
    return GetUsageEventsDefinitionRequest.builder()
            .withEventDefinitionId(eventDefinitionId)

            .build();
  }

  /**
   * Get an operational event definition by its id
   * 
   * @param request The request object
   * @return EventDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EventDefinition getUsageEventsDefinition(GetUsageEventsDefinitionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EventDefinition> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EventDefinition>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an operational event definition by its id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EventDefinition> getUsageEventsDefinition(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EventDefinition>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EventDefinition> response = (ApiResponse<EventDefinition>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EventDefinition> response = (ApiResponse<EventDefinition>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all operational event definitions
   * 
   * @return EventDefinitionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EventDefinitionListing getUsageEventsDefinitions() throws IOException, ApiException {
    return  getUsageEventsDefinitions(createGetUsageEventsDefinitionsRequest());
  }

  /**
   * Get all operational event definitions
   * 
   * @return EventDefinitionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EventDefinitionListing> getUsageEventsDefinitionsWithHttpInfo() throws IOException {
    return getUsageEventsDefinitions(createGetUsageEventsDefinitionsRequest().withHttpInfo());
  }

  private GetUsageEventsDefinitionsRequest createGetUsageEventsDefinitionsRequest() {
    return GetUsageEventsDefinitionsRequest.builder()
            .build();
  }

  /**
   * Get all operational event definitions
   * 
   * @param request The request object
   * @return EventDefinitionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EventDefinitionListing getUsageEventsDefinitions(GetUsageEventsDefinitionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EventDefinitionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EventDefinitionListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all operational event definitions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EventDefinitionListing> getUsageEventsDefinitions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EventDefinitionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EventDefinitionListing> response = (ApiResponse<EventDefinitionListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EventDefinitionListing> response = (ApiResponse<EventDefinitionListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
