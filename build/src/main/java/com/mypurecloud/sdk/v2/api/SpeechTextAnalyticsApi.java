package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.Program;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Topic;
import com.mypurecloud.sdk.v2.model.CreateTopicRequest;


import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTopicRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsTopicsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SpeechTextAnalyticsApi {
  private final ApiClient pcapiClient;

  public SpeechTextAnalyticsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SpeechTextAnalyticsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get a Speech &amp; Text Analytics program by id
   * 
   * @param programId The id of the topic to get (required)
   * @return Program
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Program getSpeechandtextanalyticsProgram(String programId) throws IOException, ApiException {
    return  getSpeechandtextanalyticsProgram(createGetSpeechandtextanalyticsProgramRequest(programId));
  }

  /**
   * Get a Speech &amp; Text Analytics program by id
   * 
   * @param programId The id of the topic to get (required)
   * @return Program
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Program> getSpeechandtextanalyticsProgramWithHttpInfo(String programId) throws IOException {
    return getSpeechandtextanalyticsProgram(createGetSpeechandtextanalyticsProgramRequest(programId).withHttpInfo());
  }

  private GetSpeechandtextanalyticsProgramRequest createGetSpeechandtextanalyticsProgramRequest(String programId) {
    return GetSpeechandtextanalyticsProgramRequest.builder()
            .withProgramId(programId)
    
            .build();
  }

  /**
   * Get a Speech &amp; Text Analytics program by id
   * 
   * @param request The request object
   * @return Program
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Program getSpeechandtextanalyticsProgram(GetSpeechandtextanalyticsProgramRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Program> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Program>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Speech &amp; Text Analytics program by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Program> getSpeechandtextanalyticsProgram(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Program>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Program> response = (ApiResponse<Program>)(ApiResponse<?>)exception;
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
      ApiResponse<Program> response = (ApiResponse<Program>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Speech &amp; Text Analytics topic by id
   * 
   * @param topicId The id of the topic to get (required)
   * @return Topic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Topic getSpeechandtextanalyticsTopic(String topicId) throws IOException, ApiException {
    return  getSpeechandtextanalyticsTopic(createGetSpeechandtextanalyticsTopicRequest(topicId));
  }

  /**
   * Get a Speech &amp; Text Analytics topic by id
   * 
   * @param topicId The id of the topic to get (required)
   * @return Topic
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Topic> getSpeechandtextanalyticsTopicWithHttpInfo(String topicId) throws IOException {
    return getSpeechandtextanalyticsTopic(createGetSpeechandtextanalyticsTopicRequest(topicId).withHttpInfo());
  }

  private GetSpeechandtextanalyticsTopicRequest createGetSpeechandtextanalyticsTopicRequest(String topicId) {
    return GetSpeechandtextanalyticsTopicRequest.builder()
            .withTopicId(topicId)
    
            .build();
  }

  /**
   * Get a Speech &amp; Text Analytics topic by id
   * 
   * @param request The request object
   * @return Topic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Topic getSpeechandtextanalyticsTopic(GetSpeechandtextanalyticsTopicRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Topic> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Topic>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Speech &amp; Text Analytics topic by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Topic> getSpeechandtextanalyticsTopic(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Topic>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Topic> response = (ApiResponse<Topic>)(ApiResponse<?>)exception;
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
      ApiResponse<Topic> response = (ApiResponse<Topic>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create new Speech &amp; Text Analytics topic
   * 
   * @param body The topic to create (required)
   * @return Topic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Topic postSpeechandtextanalyticsTopics(CreateTopicRequest body) throws IOException, ApiException {
    return  postSpeechandtextanalyticsTopics(createPostSpeechandtextanalyticsTopicsRequest(body));
  }

  /**
   * Create new Speech &amp; Text Analytics topic
   * 
   * @param body The topic to create (required)
   * @return Topic
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Topic> postSpeechandtextanalyticsTopicsWithHttpInfo(CreateTopicRequest body) throws IOException {
    return postSpeechandtextanalyticsTopics(createPostSpeechandtextanalyticsTopicsRequest(body).withHttpInfo());
  }

  private PostSpeechandtextanalyticsTopicsRequest createPostSpeechandtextanalyticsTopicsRequest(CreateTopicRequest body) {
    return PostSpeechandtextanalyticsTopicsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create new Speech &amp; Text Analytics topic
   * 
   * @param request The request object
   * @return Topic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Topic postSpeechandtextanalyticsTopics(PostSpeechandtextanalyticsTopicsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Topic> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Topic>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create new Speech &amp; Text Analytics topic
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Topic> postSpeechandtextanalyticsTopics(ApiRequest<CreateTopicRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Topic>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Topic> response = (ApiResponse<Topic>)(ApiResponse<?>)exception;
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
      ApiResponse<Topic> response = (ApiResponse<Topic>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
