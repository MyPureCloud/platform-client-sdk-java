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
import com.mypurecloud.sdk.v2.model.TranscriptProperty;


import com.mypurecloud.sdk.v2.api.request.GetConversationTranscriptpropertyRequest;

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
   * Get the pre-signed S3 URL for the transcript of a specific communication of a conversation
   * 
   * @param conversationId Conversation ID (required)
   * @param communicationId Communication ID (required)
   * @return TranscriptProperty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptProperty getConversationTranscriptproperty(String conversationId, String communicationId) throws IOException, ApiException {
    return  getConversationTranscriptproperty(createGetConversationTranscriptpropertyRequest(conversationId, communicationId));
  }

  /**
   * Get the pre-signed S3 URL for the transcript of a specific communication of a conversation
   * 
   * @param conversationId Conversation ID (required)
   * @param communicationId Communication ID (required)
   * @return TranscriptProperty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TranscriptProperty> getConversationTranscriptpropertyWithHttpInfo(String conversationId, String communicationId) throws IOException {
    return getConversationTranscriptproperty(createGetConversationTranscriptpropertyRequest(conversationId, communicationId).withHttpInfo());
  }

  private GetConversationTranscriptpropertyRequest createGetConversationTranscriptpropertyRequest(String conversationId, String communicationId) {
    return GetConversationTranscriptpropertyRequest.builder()
            .withConversationId(conversationId)
    
            .withCommunicationId(communicationId)
    
            .build();
  }

  /**
   * Get the pre-signed S3 URL for the transcript of a specific communication of a conversation
   * 
   * @param request The request object
   * @return TranscriptProperty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptProperty getConversationTranscriptproperty(GetConversationTranscriptpropertyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TranscriptProperty> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TranscriptProperty>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the pre-signed S3 URL for the transcript of a specific communication of a conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TranscriptProperty> getConversationTranscriptproperty(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TranscriptProperty>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TranscriptProperty> response = (ApiResponse<TranscriptProperty>)(ApiResponse<?>)exception;
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
      ApiResponse<TranscriptProperty> response = (ApiResponse<TranscriptProperty>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
