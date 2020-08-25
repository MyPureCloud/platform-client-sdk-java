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
import com.mypurecloud.sdk.v2.model.TranscriptUrl;


import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsConversationCommunicationTranscripturlRequest;

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
   * @return TranscriptUrl
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptUrl getSpeechandtextanalyticsConversationCommunicationTranscripturl(String conversationId, String communicationId) throws IOException, ApiException {
    return  getSpeechandtextanalyticsConversationCommunicationTranscripturl(createGetSpeechandtextanalyticsConversationCommunicationTranscripturlRequest(conversationId, communicationId));
  }

  /**
   * Get the pre-signed S3 URL for the transcript of a specific communication of a conversation
   * 
   * @param conversationId Conversation ID (required)
   * @param communicationId Communication ID (required)
   * @return TranscriptUrl
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TranscriptUrl> getSpeechandtextanalyticsConversationCommunicationTranscripturlWithHttpInfo(String conversationId, String communicationId) throws IOException {
    return getSpeechandtextanalyticsConversationCommunicationTranscripturl(createGetSpeechandtextanalyticsConversationCommunicationTranscripturlRequest(conversationId, communicationId).withHttpInfo());
  }

  private GetSpeechandtextanalyticsConversationCommunicationTranscripturlRequest createGetSpeechandtextanalyticsConversationCommunicationTranscripturlRequest(String conversationId, String communicationId) {
    return GetSpeechandtextanalyticsConversationCommunicationTranscripturlRequest.builder()
            .withConversationId(conversationId)
    
            .withCommunicationId(communicationId)
    
            .build();
  }

  /**
   * Get the pre-signed S3 URL for the transcript of a specific communication of a conversation
   * 
   * @param request The request object
   * @return TranscriptUrl
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptUrl getSpeechandtextanalyticsConversationCommunicationTranscripturl(GetSpeechandtextanalyticsConversationCommunicationTranscripturlRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TranscriptUrl> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TranscriptUrl>() {});
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
  public ApiResponse<TranscriptUrl> getSpeechandtextanalyticsConversationCommunicationTranscripturl(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TranscriptUrl>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TranscriptUrl> response = (ApiResponse<TranscriptUrl>)(ApiResponse<?>)exception;
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
      ApiResponse<TranscriptUrl> response = (ApiResponse<TranscriptUrl>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
