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
import com.mypurecloud.sdk.v2.model.EventListing;


import com.mypurecloud.sdk.v2.api.request.GetJourneySessionEventsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class JourneyApi {
  private final ApiClient pcapiClient;

  public JourneyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JourneyApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Retrieve all events for a given session.
   * 
   * @param sessionId System-generated UUID that represents the session the event is a part of. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. (optional)
   * @return EventListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EventListing getJourneySessionEvents(String sessionId, String before, String after, String limit) throws IOException, ApiException {
    return  getJourneySessionEvents(createGetJourneySessionEventsRequest(sessionId, before, after, limit));
  }

  /**
   * Retrieve all events for a given session.
   * 
   * @param sessionId System-generated UUID that represents the session the event is a part of. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. (optional)
   * @return EventListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EventListing> getJourneySessionEventsWithHttpInfo(String sessionId, String before, String after, String limit) throws IOException {
    return getJourneySessionEvents(createGetJourneySessionEventsRequest(sessionId, before, after, limit).withHttpInfo());
  }

  private GetJourneySessionEventsRequest createGetJourneySessionEventsRequest(String sessionId, String before, String after, String limit) {
    return GetJourneySessionEventsRequest.builder()
            .withSessionId(sessionId)
    
            .withBefore(before)
    
            .withAfter(after)
    
            .withLimit(limit)
    
            .build();
  }

  /**
   * Retrieve all events for a given session.
   * 
   * @param request The request object
   * @return EventListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EventListing getJourneySessionEvents(GetJourneySessionEventsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EventListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EventListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all events for a given session.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EventListing> getJourneySessionEvents(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EventListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EventListing> response = (ApiResponse<EventListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EventListing> response = (ApiResponse<EventListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
