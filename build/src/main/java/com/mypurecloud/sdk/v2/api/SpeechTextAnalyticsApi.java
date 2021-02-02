package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ConversationMetrics;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.TranscriptUrl;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsSettingsResponse;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.model.TranscriptSearchRequest;
import com.mypurecloud.sdk.v2.model.JsonSearchResponse;


import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsConversationRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsConversationCommunicationTranscripturlRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSpeechandtextanalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsTranscriptsSearchRequest;

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
   * Get Speech and Text Analytics for a specific conversation
   * 
   * @param conversationId Conversation Id (required)
   * @return ConversationMetrics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationMetrics getSpeechandtextanalyticsConversation(String conversationId) throws IOException, ApiException {
    return  getSpeechandtextanalyticsConversation(createGetSpeechandtextanalyticsConversationRequest(conversationId));
  }

  /**
   * Get Speech and Text Analytics for a specific conversation
   * 
   * @param conversationId Conversation Id (required)
   * @return ConversationMetrics
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationMetrics> getSpeechandtextanalyticsConversationWithHttpInfo(String conversationId) throws IOException {
    return getSpeechandtextanalyticsConversation(createGetSpeechandtextanalyticsConversationRequest(conversationId).withHttpInfo());
  }

  private GetSpeechandtextanalyticsConversationRequest createGetSpeechandtextanalyticsConversationRequest(String conversationId) {
    return GetSpeechandtextanalyticsConversationRequest.builder()
            .withConversationId(conversationId)
    
            .build();
  }

  /**
   * Get Speech and Text Analytics for a specific conversation
   * 
   * @param request The request object
   * @return ConversationMetrics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationMetrics getSpeechandtextanalyticsConversation(GetSpeechandtextanalyticsConversationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ConversationMetrics> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ConversationMetrics>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Speech and Text Analytics for a specific conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationMetrics> getSpeechandtextanalyticsConversation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ConversationMetrics>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationMetrics> response = (ApiResponse<ConversationMetrics>)(ApiResponse<?>)exception;
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
      ApiResponse<ConversationMetrics> response = (ApiResponse<ConversationMetrics>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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

  
  /**
   * Get Speech And Text Analytics Settings
   * 
   * @return SpeechTextAnalyticsSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SpeechTextAnalyticsSettingsResponse getSpeechandtextanalyticsSettings() throws IOException, ApiException {
    return  getSpeechandtextanalyticsSettings(createGetSpeechandtextanalyticsSettingsRequest());
  }

  /**
   * Get Speech And Text Analytics Settings
   * 
   * @return SpeechTextAnalyticsSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SpeechTextAnalyticsSettingsResponse> getSpeechandtextanalyticsSettingsWithHttpInfo() throws IOException {
    return getSpeechandtextanalyticsSettings(createGetSpeechandtextanalyticsSettingsRequest().withHttpInfo());
  }

  private GetSpeechandtextanalyticsSettingsRequest createGetSpeechandtextanalyticsSettingsRequest() {
    return GetSpeechandtextanalyticsSettingsRequest.builder()
            .build();
  }

  /**
   * Get Speech And Text Analytics Settings
   * 
   * @param request The request object
   * @return SpeechTextAnalyticsSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SpeechTextAnalyticsSettingsResponse getSpeechandtextanalyticsSettings(GetSpeechandtextanalyticsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SpeechTextAnalyticsSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SpeechTextAnalyticsSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Speech And Text Analytics Settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SpeechTextAnalyticsSettingsResponse> getSpeechandtextanalyticsSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SpeechTextAnalyticsSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SpeechTextAnalyticsSettingsResponse> response = (ApiResponse<SpeechTextAnalyticsSettingsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SpeechTextAnalyticsSettingsResponse> response = (ApiResponse<SpeechTextAnalyticsSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch Speech And Text Analytics Settings
   * 
   * @param body Speech And Text Analytics Settings (required)
   * @return SpeechTextAnalyticsSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SpeechTextAnalyticsSettingsResponse patchSpeechandtextanalyticsSettings(SpeechTextAnalyticsSettingsRequest body) throws IOException, ApiException {
    return  patchSpeechandtextanalyticsSettings(createPatchSpeechandtextanalyticsSettingsRequest(body));
  }

  /**
   * Patch Speech And Text Analytics Settings
   * 
   * @param body Speech And Text Analytics Settings (required)
   * @return SpeechTextAnalyticsSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SpeechTextAnalyticsSettingsResponse> patchSpeechandtextanalyticsSettingsWithHttpInfo(SpeechTextAnalyticsSettingsRequest body) throws IOException {
    return patchSpeechandtextanalyticsSettings(createPatchSpeechandtextanalyticsSettingsRequest(body).withHttpInfo());
  }

  private PatchSpeechandtextanalyticsSettingsRequest createPatchSpeechandtextanalyticsSettingsRequest(SpeechTextAnalyticsSettingsRequest body) {
    return PatchSpeechandtextanalyticsSettingsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Patch Speech And Text Analytics Settings
   * 
   * @param request The request object
   * @return SpeechTextAnalyticsSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SpeechTextAnalyticsSettingsResponse patchSpeechandtextanalyticsSettings(PatchSpeechandtextanalyticsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SpeechTextAnalyticsSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SpeechTextAnalyticsSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch Speech And Text Analytics Settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SpeechTextAnalyticsSettingsResponse> patchSpeechandtextanalyticsSettings(ApiRequest<SpeechTextAnalyticsSettingsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SpeechTextAnalyticsSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SpeechTextAnalyticsSettingsResponse> response = (ApiResponse<SpeechTextAnalyticsSettingsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SpeechTextAnalyticsSettingsResponse> response = (ApiResponse<SpeechTextAnalyticsSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @return JsonSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSearchResponse postSpeechandtextanalyticsTranscriptsSearch(TranscriptSearchRequest body) throws IOException, ApiException {
    return  postSpeechandtextanalyticsTranscriptsSearch(createPostSpeechandtextanalyticsTranscriptsSearchRequest(body));
  }

  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @return JsonSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSearchResponse> postSpeechandtextanalyticsTranscriptsSearchWithHttpInfo(TranscriptSearchRequest body) throws IOException {
    return postSpeechandtextanalyticsTranscriptsSearch(createPostSpeechandtextanalyticsTranscriptsSearchRequest(body).withHttpInfo());
  }

  private PostSpeechandtextanalyticsTranscriptsSearchRequest createPostSpeechandtextanalyticsTranscriptsSearchRequest(TranscriptSearchRequest body) {
    return PostSpeechandtextanalyticsTranscriptsSearchRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return JsonSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSearchResponse postSpeechandtextanalyticsTranscriptsSearch(PostSpeechandtextanalyticsTranscriptsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSearchResponse> postSpeechandtextanalyticsTranscriptsSearch(ApiRequest<TranscriptSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonSearchResponse> response = (ApiResponse<JsonSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<JsonSearchResponse> response = (ApiResponse<JsonSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
