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
import com.mypurecloud.sdk.v2.model.ConversationMetrics;
import com.mypurecloud.sdk.v2.model.TranscriptUrl;
import com.mypurecloud.sdk.v2.model.Program;
import com.mypurecloud.sdk.v2.model.ProgramMappings;
import com.mypurecloud.sdk.v2.model.ProgramsEntityListing;
import com.mypurecloud.sdk.v2.model.GeneralProgramJob;
import com.mypurecloud.sdk.v2.model.ProgramsMappingsEntityListing;
import com.mypurecloud.sdk.v2.model.ProgramJob;
import com.mypurecloud.sdk.v2.model.UnpublishedProgramsEntityListing;
import com.mypurecloud.sdk.v2.model.EntityListing;
import com.mypurecloud.sdk.v2.model.SentimentFeedbackEntityListing;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsSettingsResponse;
import com.mypurecloud.sdk.v2.model.Topic;
import com.mypurecloud.sdk.v2.model.TopicsEntityListing;
import com.mypurecloud.sdk.v2.model.GeneralTopicsEntityListing;
import com.mypurecloud.sdk.v2.model.TopicJob;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.model.ProgramRequest;
import com.mypurecloud.sdk.v2.model.GeneralProgramJobRequest;
import com.mypurecloud.sdk.v2.model.ProgramJobRequest;
import com.mypurecloud.sdk.v2.model.SentimentFeedback;
import com.mypurecloud.sdk.v2.model.TopicRequest;
import com.mypurecloud.sdk.v2.model.TopicJobRequest;
import com.mypurecloud.sdk.v2.model.TranscriptSearchRequest;
import com.mypurecloud.sdk.v2.model.JsonSearchResponse;
import com.mypurecloud.sdk.v2.model.ProgramMappingsRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteSpeechandtextanalyticsProgramRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSpeechandtextanalyticsSentimentfeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSpeechandtextanalyticsTopicRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsConversationRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsConversationCommunicationTranscripturlRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsDialectsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramMappingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramsGeneralJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramsMappingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramsPublishjobRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramsUnpublishedRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsSentimentDialectsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsSentimentfeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTopicRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTopicsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTopicsDialectsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTopicsGeneralRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTopicsPublishjobRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSpeechandtextanalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsProgramsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsProgramsGeneralJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsProgramsPublishjobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsSentimentfeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsTopicsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsTopicsPublishjobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsTranscriptsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PutSpeechandtextanalyticsProgramRequest;
import com.mypurecloud.sdk.v2.api.request.PutSpeechandtextanalyticsProgramMappingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutSpeechandtextanalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutSpeechandtextanalyticsTopicRequest;

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
   * Delete a Speech &amp; Text Analytics program by id
   * 
   * @param programId The id of the program (required)
   * @param forceDelete Indicates whether the program is forced to be deleted or not. Required when the program to delete is the default program. (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSpeechandtextanalyticsProgram(String programId, Boolean forceDelete) throws IOException, ApiException {
     deleteSpeechandtextanalyticsProgram(createDeleteSpeechandtextanalyticsProgramRequest(programId, forceDelete));
  }

  /**
   * Delete a Speech &amp; Text Analytics program by id
   * 
   * @param programId The id of the program (required)
   * @param forceDelete Indicates whether the program is forced to be deleted or not. Required when the program to delete is the default program. (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSpeechandtextanalyticsProgramWithHttpInfo(String programId, Boolean forceDelete) throws IOException {
    return deleteSpeechandtextanalyticsProgram(createDeleteSpeechandtextanalyticsProgramRequest(programId, forceDelete).withHttpInfo());
  }

  private DeleteSpeechandtextanalyticsProgramRequest createDeleteSpeechandtextanalyticsProgramRequest(String programId, Boolean forceDelete) {
    return DeleteSpeechandtextanalyticsProgramRequest.builder()
            .withProgramId(programId)
    
            .withForceDelete(forceDelete)
    
            .build();
  }

  /**
   * Delete a Speech &amp; Text Analytics program by id
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSpeechandtextanalyticsProgram(DeleteSpeechandtextanalyticsProgramRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Speech &amp; Text Analytics program by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSpeechandtextanalyticsProgram(ApiRequest<Void> request) throws IOException {
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
   * Delete All Speech &amp; Text Analytics SentimentFeedback
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSpeechandtextanalyticsSentimentfeedback() throws IOException, ApiException {
     deleteSpeechandtextanalyticsSentimentfeedback(createDeleteSpeechandtextanalyticsSentimentfeedbackRequest());
  }

  /**
   * Delete All Speech &amp; Text Analytics SentimentFeedback
   * 
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSpeechandtextanalyticsSentimentfeedbackWithHttpInfo() throws IOException {
    return deleteSpeechandtextanalyticsSentimentfeedback(createDeleteSpeechandtextanalyticsSentimentfeedbackRequest().withHttpInfo());
  }

  private DeleteSpeechandtextanalyticsSentimentfeedbackRequest createDeleteSpeechandtextanalyticsSentimentfeedbackRequest() {
    return DeleteSpeechandtextanalyticsSentimentfeedbackRequest.builder()
            .build();
  }

  /**
   * Delete All Speech &amp; Text Analytics SentimentFeedback
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSpeechandtextanalyticsSentimentfeedback(DeleteSpeechandtextanalyticsSentimentfeedbackRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete All Speech &amp; Text Analytics SentimentFeedback
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSpeechandtextanalyticsSentimentfeedback(ApiRequest<Void> request) throws IOException {
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
   * Delete a Speech &amp; Text Analytics SentimentFeedback by Id
   * 
   * @param sentimentFeedbackId The Id of the SentimentFeedback (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId(String sentimentFeedbackId) throws IOException, ApiException {
     deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId(createDeleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackIdRequest(sentimentFeedbackId));
  }

  /**
   * Delete a Speech &amp; Text Analytics SentimentFeedback by Id
   * 
   * @param sentimentFeedbackId The Id of the SentimentFeedback (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackIdWithHttpInfo(String sentimentFeedbackId) throws IOException {
    return deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId(createDeleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackIdRequest(sentimentFeedbackId).withHttpInfo());
  }

  private DeleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackIdRequest createDeleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackIdRequest(String sentimentFeedbackId) {
    return DeleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackIdRequest.builder()
            .withSentimentFeedbackId(sentimentFeedbackId)
    
            .build();
  }

  /**
   * Delete a Speech &amp; Text Analytics SentimentFeedback by Id
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId(DeleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Speech &amp; Text Analytics SentimentFeedback by Id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId(ApiRequest<Void> request) throws IOException {
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
   * Delete a Speech &amp; Text Analytics topic by id
   * 
   * @param topicId The id of the topic (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSpeechandtextanalyticsTopic(String topicId) throws IOException, ApiException {
     deleteSpeechandtextanalyticsTopic(createDeleteSpeechandtextanalyticsTopicRequest(topicId));
  }

  /**
   * Delete a Speech &amp; Text Analytics topic by id
   * 
   * @param topicId The id of the topic (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSpeechandtextanalyticsTopicWithHttpInfo(String topicId) throws IOException {
    return deleteSpeechandtextanalyticsTopic(createDeleteSpeechandtextanalyticsTopicRequest(topicId).withHttpInfo());
  }

  private DeleteSpeechandtextanalyticsTopicRequest createDeleteSpeechandtextanalyticsTopicRequest(String topicId) {
    return DeleteSpeechandtextanalyticsTopicRequest.builder()
            .withTopicId(topicId)
    
            .build();
  }

  /**
   * Delete a Speech &amp; Text Analytics topic by id
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSpeechandtextanalyticsTopic(DeleteSpeechandtextanalyticsTopicRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Speech &amp; Text Analytics topic by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSpeechandtextanalyticsTopic(ApiRequest<Void> request) throws IOException {
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
   * Get list of supported Speech &amp; Text Analytics dialects
   * This api has been deprecated. Use api/v2/topics/dialects instead
   * @return List<Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Object> getSpeechandtextanalyticsDialects() throws IOException, ApiException {
    return  getSpeechandtextanalyticsDialects(createGetSpeechandtextanalyticsDialectsRequest());
  }

  /**
   * Get list of supported Speech &amp; Text Analytics dialects
   * This api has been deprecated. Use api/v2/topics/dialects instead
   * @return List<Object>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Object>> getSpeechandtextanalyticsDialectsWithHttpInfo() throws IOException {
    return getSpeechandtextanalyticsDialects(createGetSpeechandtextanalyticsDialectsRequest().withHttpInfo());
  }

  private GetSpeechandtextanalyticsDialectsRequest createGetSpeechandtextanalyticsDialectsRequest() {
    return GetSpeechandtextanalyticsDialectsRequest.builder()
            .build();
  }

  /**
   * Get list of supported Speech &amp; Text Analytics dialects
   * This api has been deprecated. Use api/v2/topics/dialects instead
   * @param request The request object
   * @return List<Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Object> getSpeechandtextanalyticsDialects(GetSpeechandtextanalyticsDialectsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<Object>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<Object>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of supported Speech &amp; Text Analytics dialects
   * This api has been deprecated. Use api/v2/topics/dialects instead
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Object>> getSpeechandtextanalyticsDialects(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<Object>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<Object>> response = (ApiResponse<List<Object>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<Object>> response = (ApiResponse<List<Object>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Speech &amp; Text Analytics program by id
   * 
   * @param programId The id of the program (required)
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
   * @param programId The id of the program (required)
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
   * Get Speech &amp; Text Analytics program mappings to queues and flows by id
   * 
   * @param programId The id of the program (required)
   * @return ProgramMappings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ProgramMappings getSpeechandtextanalyticsProgramMappings(String programId) throws IOException, ApiException {
    return  getSpeechandtextanalyticsProgramMappings(createGetSpeechandtextanalyticsProgramMappingsRequest(programId));
  }

  /**
   * Get Speech &amp; Text Analytics program mappings to queues and flows by id
   * 
   * @param programId The id of the program (required)
   * @return ProgramMappings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ProgramMappings> getSpeechandtextanalyticsProgramMappingsWithHttpInfo(String programId) throws IOException {
    return getSpeechandtextanalyticsProgramMappings(createGetSpeechandtextanalyticsProgramMappingsRequest(programId).withHttpInfo());
  }

  private GetSpeechandtextanalyticsProgramMappingsRequest createGetSpeechandtextanalyticsProgramMappingsRequest(String programId) {
    return GetSpeechandtextanalyticsProgramMappingsRequest.builder()
            .withProgramId(programId)
    
            .build();
  }

  /**
   * Get Speech &amp; Text Analytics program mappings to queues and flows by id
   * 
   * @param request The request object
   * @return ProgramMappings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ProgramMappings getSpeechandtextanalyticsProgramMappings(GetSpeechandtextanalyticsProgramMappingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ProgramMappings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ProgramMappings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Speech &amp; Text Analytics program mappings to queues and flows by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ProgramMappings> getSpeechandtextanalyticsProgramMappings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ProgramMappings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ProgramMappings> response = (ApiResponse<ProgramMappings>)(ApiResponse<?>)exception;
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
      ApiResponse<ProgramMappings> response = (ApiResponse<ProgramMappings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of Speech &amp; Text Analytics programs
   * 
   * @param nextPage The key for listing the next page (optional)
   * @param pageSize The page size for the listing (optional, default to 20)
   * @return ProgramsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ProgramsEntityListing getSpeechandtextanalyticsPrograms(String nextPage, Integer pageSize) throws IOException, ApiException {
    return  getSpeechandtextanalyticsPrograms(createGetSpeechandtextanalyticsProgramsRequest(nextPage, pageSize));
  }

  /**
   * Get the list of Speech &amp; Text Analytics programs
   * 
   * @param nextPage The key for listing the next page (optional)
   * @param pageSize The page size for the listing (optional, default to 20)
   * @return ProgramsEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ProgramsEntityListing> getSpeechandtextanalyticsProgramsWithHttpInfo(String nextPage, Integer pageSize) throws IOException {
    return getSpeechandtextanalyticsPrograms(createGetSpeechandtextanalyticsProgramsRequest(nextPage, pageSize).withHttpInfo());
  }

  private GetSpeechandtextanalyticsProgramsRequest createGetSpeechandtextanalyticsProgramsRequest(String nextPage, Integer pageSize) {
    return GetSpeechandtextanalyticsProgramsRequest.builder()
            .withNextPage(nextPage)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Get the list of Speech &amp; Text Analytics programs
   * 
   * @param request The request object
   * @return ProgramsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ProgramsEntityListing getSpeechandtextanalyticsPrograms(GetSpeechandtextanalyticsProgramsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ProgramsEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ProgramsEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of Speech &amp; Text Analytics programs
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ProgramsEntityListing> getSpeechandtextanalyticsPrograms(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ProgramsEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ProgramsEntityListing> response = (ApiResponse<ProgramsEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ProgramsEntityListing> response = (ApiResponse<ProgramsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Speech &amp; Text Analytics general program job by id
   * 
   * @param jobId The id of the publish programs job (required)
   * @return GeneralProgramJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GeneralProgramJob getSpeechandtextanalyticsProgramsGeneralJob(String jobId) throws IOException, ApiException {
    return  getSpeechandtextanalyticsProgramsGeneralJob(createGetSpeechandtextanalyticsProgramsGeneralJobRequest(jobId));
  }

  /**
   * Get a Speech &amp; Text Analytics general program job by id
   * 
   * @param jobId The id of the publish programs job (required)
   * @return GeneralProgramJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GeneralProgramJob> getSpeechandtextanalyticsProgramsGeneralJobWithHttpInfo(String jobId) throws IOException {
    return getSpeechandtextanalyticsProgramsGeneralJob(createGetSpeechandtextanalyticsProgramsGeneralJobRequest(jobId).withHttpInfo());
  }

  private GetSpeechandtextanalyticsProgramsGeneralJobRequest createGetSpeechandtextanalyticsProgramsGeneralJobRequest(String jobId) {
    return GetSpeechandtextanalyticsProgramsGeneralJobRequest.builder()
            .withJobId(jobId)
    
            .build();
  }

  /**
   * Get a Speech &amp; Text Analytics general program job by id
   * 
   * @param request The request object
   * @return GeneralProgramJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GeneralProgramJob getSpeechandtextanalyticsProgramsGeneralJob(GetSpeechandtextanalyticsProgramsGeneralJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GeneralProgramJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GeneralProgramJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Speech &amp; Text Analytics general program job by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GeneralProgramJob> getSpeechandtextanalyticsProgramsGeneralJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GeneralProgramJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GeneralProgramJob> response = (ApiResponse<GeneralProgramJob>)(ApiResponse<?>)exception;
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
      ApiResponse<GeneralProgramJob> response = (ApiResponse<GeneralProgramJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of Speech &amp; Text Analytics programs mappings to queues and flows
   * 
   * @param nextPage The key for listing the next page (optional)
   * @param pageSize The page size for the listing (optional, default to 20)
   * @return ProgramsMappingsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ProgramsMappingsEntityListing getSpeechandtextanalyticsProgramsMappings(String nextPage, Integer pageSize) throws IOException, ApiException {
    return  getSpeechandtextanalyticsProgramsMappings(createGetSpeechandtextanalyticsProgramsMappingsRequest(nextPage, pageSize));
  }

  /**
   * Get the list of Speech &amp; Text Analytics programs mappings to queues and flows
   * 
   * @param nextPage The key for listing the next page (optional)
   * @param pageSize The page size for the listing (optional, default to 20)
   * @return ProgramsMappingsEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ProgramsMappingsEntityListing> getSpeechandtextanalyticsProgramsMappingsWithHttpInfo(String nextPage, Integer pageSize) throws IOException {
    return getSpeechandtextanalyticsProgramsMappings(createGetSpeechandtextanalyticsProgramsMappingsRequest(nextPage, pageSize).withHttpInfo());
  }

  private GetSpeechandtextanalyticsProgramsMappingsRequest createGetSpeechandtextanalyticsProgramsMappingsRequest(String nextPage, Integer pageSize) {
    return GetSpeechandtextanalyticsProgramsMappingsRequest.builder()
            .withNextPage(nextPage)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Get the list of Speech &amp; Text Analytics programs mappings to queues and flows
   * 
   * @param request The request object
   * @return ProgramsMappingsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ProgramsMappingsEntityListing getSpeechandtextanalyticsProgramsMappings(GetSpeechandtextanalyticsProgramsMappingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ProgramsMappingsEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ProgramsMappingsEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of Speech &amp; Text Analytics programs mappings to queues and flows
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ProgramsMappingsEntityListing> getSpeechandtextanalyticsProgramsMappings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ProgramsMappingsEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ProgramsMappingsEntityListing> response = (ApiResponse<ProgramsMappingsEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ProgramsMappingsEntityListing> response = (ApiResponse<ProgramsMappingsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Speech &amp; Text Analytics publish programs job by id
   * 
   * @param jobId The id of the publish programs job (required)
   * @return ProgramJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ProgramJob getSpeechandtextanalyticsProgramsPublishjob(String jobId) throws IOException, ApiException {
    return  getSpeechandtextanalyticsProgramsPublishjob(createGetSpeechandtextanalyticsProgramsPublishjobRequest(jobId));
  }

  /**
   * Get a Speech &amp; Text Analytics publish programs job by id
   * 
   * @param jobId The id of the publish programs job (required)
   * @return ProgramJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ProgramJob> getSpeechandtextanalyticsProgramsPublishjobWithHttpInfo(String jobId) throws IOException {
    return getSpeechandtextanalyticsProgramsPublishjob(createGetSpeechandtextanalyticsProgramsPublishjobRequest(jobId).withHttpInfo());
  }

  private GetSpeechandtextanalyticsProgramsPublishjobRequest createGetSpeechandtextanalyticsProgramsPublishjobRequest(String jobId) {
    return GetSpeechandtextanalyticsProgramsPublishjobRequest.builder()
            .withJobId(jobId)
    
            .build();
  }

  /**
   * Get a Speech &amp; Text Analytics publish programs job by id
   * 
   * @param request The request object
   * @return ProgramJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ProgramJob getSpeechandtextanalyticsProgramsPublishjob(GetSpeechandtextanalyticsProgramsPublishjobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ProgramJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ProgramJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Speech &amp; Text Analytics publish programs job by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ProgramJob> getSpeechandtextanalyticsProgramsPublishjob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ProgramJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ProgramJob> response = (ApiResponse<ProgramJob>)(ApiResponse<?>)exception;
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
      ApiResponse<ProgramJob> response = (ApiResponse<ProgramJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of Speech &amp; Text Analytics unpublished programs
   * 
   * @param nextPage The key for listing the next page (optional)
   * @param pageSize The page size for the listing (optional, default to 20)
   * @return UnpublishedProgramsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnpublishedProgramsEntityListing getSpeechandtextanalyticsProgramsUnpublished(String nextPage, Integer pageSize) throws IOException, ApiException {
    return  getSpeechandtextanalyticsProgramsUnpublished(createGetSpeechandtextanalyticsProgramsUnpublishedRequest(nextPage, pageSize));
  }

  /**
   * Get the list of Speech &amp; Text Analytics unpublished programs
   * 
   * @param nextPage The key for listing the next page (optional)
   * @param pageSize The page size for the listing (optional, default to 20)
   * @return UnpublishedProgramsEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnpublishedProgramsEntityListing> getSpeechandtextanalyticsProgramsUnpublishedWithHttpInfo(String nextPage, Integer pageSize) throws IOException {
    return getSpeechandtextanalyticsProgramsUnpublished(createGetSpeechandtextanalyticsProgramsUnpublishedRequest(nextPage, pageSize).withHttpInfo());
  }

  private GetSpeechandtextanalyticsProgramsUnpublishedRequest createGetSpeechandtextanalyticsProgramsUnpublishedRequest(String nextPage, Integer pageSize) {
    return GetSpeechandtextanalyticsProgramsUnpublishedRequest.builder()
            .withNextPage(nextPage)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Get the list of Speech &amp; Text Analytics unpublished programs
   * 
   * @param request The request object
   * @return UnpublishedProgramsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnpublishedProgramsEntityListing getSpeechandtextanalyticsProgramsUnpublished(GetSpeechandtextanalyticsProgramsUnpublishedRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UnpublishedProgramsEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UnpublishedProgramsEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of Speech &amp; Text Analytics unpublished programs
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnpublishedProgramsEntityListing> getSpeechandtextanalyticsProgramsUnpublished(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UnpublishedProgramsEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UnpublishedProgramsEntityListing> response = (ApiResponse<UnpublishedProgramsEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UnpublishedProgramsEntityListing> response = (ApiResponse<UnpublishedProgramsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of Speech &amp; Text Analytics sentiment supported dialects
   * 
   * @return EntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EntityListing getSpeechandtextanalyticsSentimentDialects() throws IOException, ApiException {
    return  getSpeechandtextanalyticsSentimentDialects(createGetSpeechandtextanalyticsSentimentDialectsRequest());
  }

  /**
   * Get the list of Speech &amp; Text Analytics sentiment supported dialects
   * 
   * @return EntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EntityListing> getSpeechandtextanalyticsSentimentDialectsWithHttpInfo() throws IOException {
    return getSpeechandtextanalyticsSentimentDialects(createGetSpeechandtextanalyticsSentimentDialectsRequest().withHttpInfo());
  }

  private GetSpeechandtextanalyticsSentimentDialectsRequest createGetSpeechandtextanalyticsSentimentDialectsRequest() {
    return GetSpeechandtextanalyticsSentimentDialectsRequest.builder()
            .build();
  }

  /**
   * Get the list of Speech &amp; Text Analytics sentiment supported dialects
   * 
   * @param request The request object
   * @return EntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EntityListing getSpeechandtextanalyticsSentimentDialects(GetSpeechandtextanalyticsSentimentDialectsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of Speech &amp; Text Analytics sentiment supported dialects
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EntityListing> getSpeechandtextanalyticsSentimentDialects(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EntityListing> response = (ApiResponse<EntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EntityListing> response = (ApiResponse<EntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of Speech &amp; Text Analytics SentimentFeedback
   * 
   * @param dialect The key for filter the listing by dialect, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard (optional)
   * @return SentimentFeedbackEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SentimentFeedbackEntityListing getSpeechandtextanalyticsSentimentfeedback(String dialect) throws IOException, ApiException {
    return  getSpeechandtextanalyticsSentimentfeedback(createGetSpeechandtextanalyticsSentimentfeedbackRequest(dialect));
  }

  /**
   * Get the list of Speech &amp; Text Analytics SentimentFeedback
   * 
   * @param dialect The key for filter the listing by dialect, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard (optional)
   * @return SentimentFeedbackEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SentimentFeedbackEntityListing> getSpeechandtextanalyticsSentimentfeedbackWithHttpInfo(String dialect) throws IOException {
    return getSpeechandtextanalyticsSentimentfeedback(createGetSpeechandtextanalyticsSentimentfeedbackRequest(dialect).withHttpInfo());
  }

  private GetSpeechandtextanalyticsSentimentfeedbackRequest createGetSpeechandtextanalyticsSentimentfeedbackRequest(String dialect) {
    return GetSpeechandtextanalyticsSentimentfeedbackRequest.builder()
            .withDialect(dialect)
    
            .build();
  }

  /**
   * Get the list of Speech &amp; Text Analytics SentimentFeedback
   * 
   * @param request The request object
   * @return SentimentFeedbackEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SentimentFeedbackEntityListing getSpeechandtextanalyticsSentimentfeedback(GetSpeechandtextanalyticsSentimentfeedbackRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SentimentFeedbackEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SentimentFeedbackEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of Speech &amp; Text Analytics SentimentFeedback
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SentimentFeedbackEntityListing> getSpeechandtextanalyticsSentimentfeedback(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SentimentFeedbackEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SentimentFeedbackEntityListing> response = (ApiResponse<SentimentFeedbackEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SentimentFeedbackEntityListing> response = (ApiResponse<SentimentFeedbackEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a Speech &amp; Text Analytics topic by id
   * 
   * @param topicId The id of the topic (required)
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
   * @param topicId The id of the topic (required)
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
   * Get the list of Speech &amp; Text Analytics topics
   * 
   * @param nextPage The key for listing the next page (optional)
   * @param pageSize The page size for the listing (optional, default to 20)
   * @param state Topic state. Defaults to latest (optional)
   * @param name Case insensitive partial name to filter by (optional)
   * @param ids Comma separated Topic IDs to filter by. Cannot be used with other filters. Maximum of 50 IDs allowed. (optional)
   * @param sortBy Sort results by. Defaults to name (optional)
   * @param sortOrder Sort order. Defaults to asc (optional)
   * @return TopicsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TopicsEntityListing getSpeechandtextanalyticsTopics(String nextPage, Integer pageSize, String state, String name, List<String> ids, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getSpeechandtextanalyticsTopics(createGetSpeechandtextanalyticsTopicsRequest(nextPage, pageSize, state, name, ids, sortBy, sortOrder));
  }

  /**
   * Get the list of Speech &amp; Text Analytics topics
   * 
   * @param nextPage The key for listing the next page (optional)
   * @param pageSize The page size for the listing (optional, default to 20)
   * @param state Topic state. Defaults to latest (optional)
   * @param name Case insensitive partial name to filter by (optional)
   * @param ids Comma separated Topic IDs to filter by. Cannot be used with other filters. Maximum of 50 IDs allowed. (optional)
   * @param sortBy Sort results by. Defaults to name (optional)
   * @param sortOrder Sort order. Defaults to asc (optional)
   * @return TopicsEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TopicsEntityListing> getSpeechandtextanalyticsTopicsWithHttpInfo(String nextPage, Integer pageSize, String state, String name, List<String> ids, String sortBy, String sortOrder) throws IOException {
    return getSpeechandtextanalyticsTopics(createGetSpeechandtextanalyticsTopicsRequest(nextPage, pageSize, state, name, ids, sortBy, sortOrder).withHttpInfo());
  }

  private GetSpeechandtextanalyticsTopicsRequest createGetSpeechandtextanalyticsTopicsRequest(String nextPage, Integer pageSize, String state, String name, List<String> ids, String sortBy, String sortOrder) {
    return GetSpeechandtextanalyticsTopicsRequest.builder()
            .withNextPage(nextPage)
    
            .withPageSize(pageSize)
    
            .withState(state)
    
            .withName(name)
    
            .withIds(ids)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get the list of Speech &amp; Text Analytics topics
   * 
   * @param request The request object
   * @return TopicsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TopicsEntityListing getSpeechandtextanalyticsTopics(GetSpeechandtextanalyticsTopicsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TopicsEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TopicsEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of Speech &amp; Text Analytics topics
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TopicsEntityListing> getSpeechandtextanalyticsTopics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TopicsEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TopicsEntityListing> response = (ApiResponse<TopicsEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TopicsEntityListing> response = (ApiResponse<TopicsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of supported Speech &amp; Text Analytics topics dialects
   * 
   * @return EntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EntityListing getSpeechandtextanalyticsTopicsDialects() throws IOException, ApiException {
    return  getSpeechandtextanalyticsTopicsDialects(createGetSpeechandtextanalyticsTopicsDialectsRequest());
  }

  /**
   * Get list of supported Speech &amp; Text Analytics topics dialects
   * 
   * @return EntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EntityListing> getSpeechandtextanalyticsTopicsDialectsWithHttpInfo() throws IOException {
    return getSpeechandtextanalyticsTopicsDialects(createGetSpeechandtextanalyticsTopicsDialectsRequest().withHttpInfo());
  }

  private GetSpeechandtextanalyticsTopicsDialectsRequest createGetSpeechandtextanalyticsTopicsDialectsRequest() {
    return GetSpeechandtextanalyticsTopicsDialectsRequest.builder()
            .build();
  }

  /**
   * Get list of supported Speech &amp; Text Analytics topics dialects
   * 
   * @param request The request object
   * @return EntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EntityListing getSpeechandtextanalyticsTopicsDialects(GetSpeechandtextanalyticsTopicsDialectsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of supported Speech &amp; Text Analytics topics dialects
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EntityListing> getSpeechandtextanalyticsTopicsDialects(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EntityListing> response = (ApiResponse<EntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EntityListing> response = (ApiResponse<EntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the Speech &amp; Text Analytics general topics for a given dialect
   * 
   * @param dialect The dialect of the general topics, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard (optional)
   * @return GeneralTopicsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GeneralTopicsEntityListing getSpeechandtextanalyticsTopicsGeneral(String dialect) throws IOException, ApiException {
    return  getSpeechandtextanalyticsTopicsGeneral(createGetSpeechandtextanalyticsTopicsGeneralRequest(dialect));
  }

  /**
   * Get the Speech &amp; Text Analytics general topics for a given dialect
   * 
   * @param dialect The dialect of the general topics, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard (optional)
   * @return GeneralTopicsEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GeneralTopicsEntityListing> getSpeechandtextanalyticsTopicsGeneralWithHttpInfo(String dialect) throws IOException {
    return getSpeechandtextanalyticsTopicsGeneral(createGetSpeechandtextanalyticsTopicsGeneralRequest(dialect).withHttpInfo());
  }

  private GetSpeechandtextanalyticsTopicsGeneralRequest createGetSpeechandtextanalyticsTopicsGeneralRequest(String dialect) {
    return GetSpeechandtextanalyticsTopicsGeneralRequest.builder()
            .withDialect(dialect)
    
            .build();
  }

  /**
   * Get the Speech &amp; Text Analytics general topics for a given dialect
   * 
   * @param request The request object
   * @return GeneralTopicsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GeneralTopicsEntityListing getSpeechandtextanalyticsTopicsGeneral(GetSpeechandtextanalyticsTopicsGeneralRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GeneralTopicsEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GeneralTopicsEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the Speech &amp; Text Analytics general topics for a given dialect
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GeneralTopicsEntityListing> getSpeechandtextanalyticsTopicsGeneral(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GeneralTopicsEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GeneralTopicsEntityListing> response = (ApiResponse<GeneralTopicsEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<GeneralTopicsEntityListing> response = (ApiResponse<GeneralTopicsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Speech &amp; Text Analytics publish topics job by id
   * 
   * @param jobId The id of the publish topics job (required)
   * @return TopicJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TopicJob getSpeechandtextanalyticsTopicsPublishjob(String jobId) throws IOException, ApiException {
    return  getSpeechandtextanalyticsTopicsPublishjob(createGetSpeechandtextanalyticsTopicsPublishjobRequest(jobId));
  }

  /**
   * Get a Speech &amp; Text Analytics publish topics job by id
   * 
   * @param jobId The id of the publish topics job (required)
   * @return TopicJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TopicJob> getSpeechandtextanalyticsTopicsPublishjobWithHttpInfo(String jobId) throws IOException {
    return getSpeechandtextanalyticsTopicsPublishjob(createGetSpeechandtextanalyticsTopicsPublishjobRequest(jobId).withHttpInfo());
  }

  private GetSpeechandtextanalyticsTopicsPublishjobRequest createGetSpeechandtextanalyticsTopicsPublishjobRequest(String jobId) {
    return GetSpeechandtextanalyticsTopicsPublishjobRequest.builder()
            .withJobId(jobId)
    
            .build();
  }

  /**
   * Get a Speech &amp; Text Analytics publish topics job by id
   * 
   * @param request The request object
   * @return TopicJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TopicJob getSpeechandtextanalyticsTopicsPublishjob(GetSpeechandtextanalyticsTopicsPublishjobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TopicJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TopicJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Speech &amp; Text Analytics publish topics job by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TopicJob> getSpeechandtextanalyticsTopicsPublishjob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TopicJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TopicJob> response = (ApiResponse<TopicJob>)(ApiResponse<?>)exception;
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
      ApiResponse<TopicJob> response = (ApiResponse<TopicJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create new Speech &amp; Text Analytics program
   * 
   * @param body The program to create (required)
   * @return Program
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Program postSpeechandtextanalyticsPrograms(ProgramRequest body) throws IOException, ApiException {
    return  postSpeechandtextanalyticsPrograms(createPostSpeechandtextanalyticsProgramsRequest(body));
  }

  /**
   * Create new Speech &amp; Text Analytics program
   * 
   * @param body The program to create (required)
   * @return Program
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Program> postSpeechandtextanalyticsProgramsWithHttpInfo(ProgramRequest body) throws IOException {
    return postSpeechandtextanalyticsPrograms(createPostSpeechandtextanalyticsProgramsRequest(body).withHttpInfo());
  }

  private PostSpeechandtextanalyticsProgramsRequest createPostSpeechandtextanalyticsProgramsRequest(ProgramRequest body) {
    return PostSpeechandtextanalyticsProgramsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create new Speech &amp; Text Analytics program
   * 
   * @param request The request object
   * @return Program
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Program postSpeechandtextanalyticsPrograms(PostSpeechandtextanalyticsProgramsRequest request) throws IOException, ApiException {
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
   * Create new Speech &amp; Text Analytics program
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Program> postSpeechandtextanalyticsPrograms(ApiRequest<ProgramRequest> request) throws IOException {
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
   * Create new Speech &amp; Text Analytics general program job
   * 
   * @param body The general programs job to create (required)
   * @return GeneralProgramJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GeneralProgramJob postSpeechandtextanalyticsProgramsGeneralJobs(GeneralProgramJobRequest body) throws IOException, ApiException {
    return  postSpeechandtextanalyticsProgramsGeneralJobs(createPostSpeechandtextanalyticsProgramsGeneralJobsRequest(body));
  }

  /**
   * Create new Speech &amp; Text Analytics general program job
   * 
   * @param body The general programs job to create (required)
   * @return GeneralProgramJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GeneralProgramJob> postSpeechandtextanalyticsProgramsGeneralJobsWithHttpInfo(GeneralProgramJobRequest body) throws IOException {
    return postSpeechandtextanalyticsProgramsGeneralJobs(createPostSpeechandtextanalyticsProgramsGeneralJobsRequest(body).withHttpInfo());
  }

  private PostSpeechandtextanalyticsProgramsGeneralJobsRequest createPostSpeechandtextanalyticsProgramsGeneralJobsRequest(GeneralProgramJobRequest body) {
    return PostSpeechandtextanalyticsProgramsGeneralJobsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create new Speech &amp; Text Analytics general program job
   * 
   * @param request The request object
   * @return GeneralProgramJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GeneralProgramJob postSpeechandtextanalyticsProgramsGeneralJobs(PostSpeechandtextanalyticsProgramsGeneralJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GeneralProgramJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GeneralProgramJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create new Speech &amp; Text Analytics general program job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GeneralProgramJob> postSpeechandtextanalyticsProgramsGeneralJobs(ApiRequest<GeneralProgramJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GeneralProgramJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GeneralProgramJob> response = (ApiResponse<GeneralProgramJob>)(ApiResponse<?>)exception;
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
      ApiResponse<GeneralProgramJob> response = (ApiResponse<GeneralProgramJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create new Speech &amp; Text Analytics publish programs job
   * 
   * @param body The publish programs job to create (required)
   * @return ProgramJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ProgramJob postSpeechandtextanalyticsProgramsPublishjobs(ProgramJobRequest body) throws IOException, ApiException {
    return  postSpeechandtextanalyticsProgramsPublishjobs(createPostSpeechandtextanalyticsProgramsPublishjobsRequest(body));
  }

  /**
   * Create new Speech &amp; Text Analytics publish programs job
   * 
   * @param body The publish programs job to create (required)
   * @return ProgramJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ProgramJob> postSpeechandtextanalyticsProgramsPublishjobsWithHttpInfo(ProgramJobRequest body) throws IOException {
    return postSpeechandtextanalyticsProgramsPublishjobs(createPostSpeechandtextanalyticsProgramsPublishjobsRequest(body).withHttpInfo());
  }

  private PostSpeechandtextanalyticsProgramsPublishjobsRequest createPostSpeechandtextanalyticsProgramsPublishjobsRequest(ProgramJobRequest body) {
    return PostSpeechandtextanalyticsProgramsPublishjobsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create new Speech &amp; Text Analytics publish programs job
   * 
   * @param request The request object
   * @return ProgramJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ProgramJob postSpeechandtextanalyticsProgramsPublishjobs(PostSpeechandtextanalyticsProgramsPublishjobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ProgramJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ProgramJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create new Speech &amp; Text Analytics publish programs job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ProgramJob> postSpeechandtextanalyticsProgramsPublishjobs(ApiRequest<ProgramJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ProgramJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ProgramJob> response = (ApiResponse<ProgramJob>)(ApiResponse<?>)exception;
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
      ApiResponse<ProgramJob> response = (ApiResponse<ProgramJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a Speech &amp; Text Analytics SentimentFeedback
   * 
   * @param body The SentimentFeedback to create (required)
   * @return SentimentFeedback
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SentimentFeedback postSpeechandtextanalyticsSentimentfeedback(SentimentFeedback body) throws IOException, ApiException {
    return  postSpeechandtextanalyticsSentimentfeedback(createPostSpeechandtextanalyticsSentimentfeedbackRequest(body));
  }

  /**
   * Create a Speech &amp; Text Analytics SentimentFeedback
   * 
   * @param body The SentimentFeedback to create (required)
   * @return SentimentFeedback
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SentimentFeedback> postSpeechandtextanalyticsSentimentfeedbackWithHttpInfo(SentimentFeedback body) throws IOException {
    return postSpeechandtextanalyticsSentimentfeedback(createPostSpeechandtextanalyticsSentimentfeedbackRequest(body).withHttpInfo());
  }

  private PostSpeechandtextanalyticsSentimentfeedbackRequest createPostSpeechandtextanalyticsSentimentfeedbackRequest(SentimentFeedback body) {
    return PostSpeechandtextanalyticsSentimentfeedbackRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a Speech &amp; Text Analytics SentimentFeedback
   * 
   * @param request The request object
   * @return SentimentFeedback
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SentimentFeedback postSpeechandtextanalyticsSentimentfeedback(PostSpeechandtextanalyticsSentimentfeedbackRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SentimentFeedback> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SentimentFeedback>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Speech &amp; Text Analytics SentimentFeedback
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SentimentFeedback> postSpeechandtextanalyticsSentimentfeedback(ApiRequest<SentimentFeedback> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SentimentFeedback>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SentimentFeedback> response = (ApiResponse<SentimentFeedback>)(ApiResponse<?>)exception;
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
      ApiResponse<SentimentFeedback> response = (ApiResponse<SentimentFeedback>)(ApiResponse<?>)(new ApiException(exception));
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
  public Topic postSpeechandtextanalyticsTopics(TopicRequest body) throws IOException, ApiException {
    return  postSpeechandtextanalyticsTopics(createPostSpeechandtextanalyticsTopicsRequest(body));
  }

  /**
   * Create new Speech &amp; Text Analytics topic
   * 
   * @param body The topic to create (required)
   * @return Topic
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Topic> postSpeechandtextanalyticsTopicsWithHttpInfo(TopicRequest body) throws IOException {
    return postSpeechandtextanalyticsTopics(createPostSpeechandtextanalyticsTopicsRequest(body).withHttpInfo());
  }

  private PostSpeechandtextanalyticsTopicsRequest createPostSpeechandtextanalyticsTopicsRequest(TopicRequest body) {
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
  public ApiResponse<Topic> postSpeechandtextanalyticsTopics(ApiRequest<TopicRequest> request) throws IOException {
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
   * Create new Speech &amp; Text Analytics publish topics job
   * 
   * @param body The publish topics job to create (required)
   * @return TopicJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TopicJob postSpeechandtextanalyticsTopicsPublishjobs(TopicJobRequest body) throws IOException, ApiException {
    return  postSpeechandtextanalyticsTopicsPublishjobs(createPostSpeechandtextanalyticsTopicsPublishjobsRequest(body));
  }

  /**
   * Create new Speech &amp; Text Analytics publish topics job
   * 
   * @param body The publish topics job to create (required)
   * @return TopicJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TopicJob> postSpeechandtextanalyticsTopicsPublishjobsWithHttpInfo(TopicJobRequest body) throws IOException {
    return postSpeechandtextanalyticsTopicsPublishjobs(createPostSpeechandtextanalyticsTopicsPublishjobsRequest(body).withHttpInfo());
  }

  private PostSpeechandtextanalyticsTopicsPublishjobsRequest createPostSpeechandtextanalyticsTopicsPublishjobsRequest(TopicJobRequest body) {
    return PostSpeechandtextanalyticsTopicsPublishjobsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create new Speech &amp; Text Analytics publish topics job
   * 
   * @param request The request object
   * @return TopicJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TopicJob postSpeechandtextanalyticsTopicsPublishjobs(PostSpeechandtextanalyticsTopicsPublishjobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TopicJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TopicJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create new Speech &amp; Text Analytics publish topics job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TopicJob> postSpeechandtextanalyticsTopicsPublishjobs(ApiRequest<TopicJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TopicJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TopicJob> response = (ApiResponse<TopicJob>)(ApiResponse<?>)exception;
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
      ApiResponse<TopicJob> response = (ApiResponse<TopicJob>)(ApiResponse<?>)(new ApiException(exception));
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

  
  /**
   * Update existing Speech &amp; Text Analytics program
   * 
   * @param programId The id of the program (required)
   * @param body The program to update (required)
   * @return Program
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Program putSpeechandtextanalyticsProgram(String programId, ProgramRequest body) throws IOException, ApiException {
    return  putSpeechandtextanalyticsProgram(createPutSpeechandtextanalyticsProgramRequest(programId, body));
  }

  /**
   * Update existing Speech &amp; Text Analytics program
   * 
   * @param programId The id of the program (required)
   * @param body The program to update (required)
   * @return Program
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Program> putSpeechandtextanalyticsProgramWithHttpInfo(String programId, ProgramRequest body) throws IOException {
    return putSpeechandtextanalyticsProgram(createPutSpeechandtextanalyticsProgramRequest(programId, body).withHttpInfo());
  }

  private PutSpeechandtextanalyticsProgramRequest createPutSpeechandtextanalyticsProgramRequest(String programId, ProgramRequest body) {
    return PutSpeechandtextanalyticsProgramRequest.builder()
            .withProgramId(programId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update existing Speech &amp; Text Analytics program
   * 
   * @param request The request object
   * @return Program
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Program putSpeechandtextanalyticsProgram(PutSpeechandtextanalyticsProgramRequest request) throws IOException, ApiException {
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
   * Update existing Speech &amp; Text Analytics program
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Program> putSpeechandtextanalyticsProgram(ApiRequest<ProgramRequest> request) throws IOException {
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
   * Set Speech &amp; Text Analytics program mappings to queues and flows
   * 
   * @param programId The id of the program (required)
   * @param body The program to set mappings for (required)
   * @return ProgramMappings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ProgramMappings putSpeechandtextanalyticsProgramMappings(String programId, ProgramMappingsRequest body) throws IOException, ApiException {
    return  putSpeechandtextanalyticsProgramMappings(createPutSpeechandtextanalyticsProgramMappingsRequest(programId, body));
  }

  /**
   * Set Speech &amp; Text Analytics program mappings to queues and flows
   * 
   * @param programId The id of the program (required)
   * @param body The program to set mappings for (required)
   * @return ProgramMappings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ProgramMappings> putSpeechandtextanalyticsProgramMappingsWithHttpInfo(String programId, ProgramMappingsRequest body) throws IOException {
    return putSpeechandtextanalyticsProgramMappings(createPutSpeechandtextanalyticsProgramMappingsRequest(programId, body).withHttpInfo());
  }

  private PutSpeechandtextanalyticsProgramMappingsRequest createPutSpeechandtextanalyticsProgramMappingsRequest(String programId, ProgramMappingsRequest body) {
    return PutSpeechandtextanalyticsProgramMappingsRequest.builder()
            .withProgramId(programId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Set Speech &amp; Text Analytics program mappings to queues and flows
   * 
   * @param request The request object
   * @return ProgramMappings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ProgramMappings putSpeechandtextanalyticsProgramMappings(PutSpeechandtextanalyticsProgramMappingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ProgramMappings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ProgramMappings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Set Speech &amp; Text Analytics program mappings to queues and flows
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ProgramMappings> putSpeechandtextanalyticsProgramMappings(ApiRequest<ProgramMappingsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ProgramMappings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ProgramMappings> response = (ApiResponse<ProgramMappings>)(ApiResponse<?>)exception;
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
      ApiResponse<ProgramMappings> response = (ApiResponse<ProgramMappings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update Speech And Text Analytics Settings
   * 
   * @param body Speech And Text Analytics Settings (required)
   * @return SpeechTextAnalyticsSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SpeechTextAnalyticsSettingsResponse putSpeechandtextanalyticsSettings(SpeechTextAnalyticsSettingsRequest body) throws IOException, ApiException {
    return  putSpeechandtextanalyticsSettings(createPutSpeechandtextanalyticsSettingsRequest(body));
  }

  /**
   * Update Speech And Text Analytics Settings
   * 
   * @param body Speech And Text Analytics Settings (required)
   * @return SpeechTextAnalyticsSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SpeechTextAnalyticsSettingsResponse> putSpeechandtextanalyticsSettingsWithHttpInfo(SpeechTextAnalyticsSettingsRequest body) throws IOException {
    return putSpeechandtextanalyticsSettings(createPutSpeechandtextanalyticsSettingsRequest(body).withHttpInfo());
  }

  private PutSpeechandtextanalyticsSettingsRequest createPutSpeechandtextanalyticsSettingsRequest(SpeechTextAnalyticsSettingsRequest body) {
    return PutSpeechandtextanalyticsSettingsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update Speech And Text Analytics Settings
   * 
   * @param request The request object
   * @return SpeechTextAnalyticsSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SpeechTextAnalyticsSettingsResponse putSpeechandtextanalyticsSettings(PutSpeechandtextanalyticsSettingsRequest request) throws IOException, ApiException {
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
   * Update Speech And Text Analytics Settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SpeechTextAnalyticsSettingsResponse> putSpeechandtextanalyticsSettings(ApiRequest<SpeechTextAnalyticsSettingsRequest> request) throws IOException {
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
   * Update existing Speech &amp; Text Analytics topic
   * 
   * @param topicId The id of the topic (required)
   * @param body The topic to update (required)
   * @return Topic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Topic putSpeechandtextanalyticsTopic(String topicId, TopicRequest body) throws IOException, ApiException {
    return  putSpeechandtextanalyticsTopic(createPutSpeechandtextanalyticsTopicRequest(topicId, body));
  }

  /**
   * Update existing Speech &amp; Text Analytics topic
   * 
   * @param topicId The id of the topic (required)
   * @param body The topic to update (required)
   * @return Topic
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Topic> putSpeechandtextanalyticsTopicWithHttpInfo(String topicId, TopicRequest body) throws IOException {
    return putSpeechandtextanalyticsTopic(createPutSpeechandtextanalyticsTopicRequest(topicId, body).withHttpInfo());
  }

  private PutSpeechandtextanalyticsTopicRequest createPutSpeechandtextanalyticsTopicRequest(String topicId, TopicRequest body) {
    return PutSpeechandtextanalyticsTopicRequest.builder()
            .withTopicId(topicId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update existing Speech &amp; Text Analytics topic
   * 
   * @param request The request object
   * @return Topic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Topic putSpeechandtextanalyticsTopic(PutSpeechandtextanalyticsTopicRequest request) throws IOException, ApiException {
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
   * Update existing Speech &amp; Text Analytics topic
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Topic> putSpeechandtextanalyticsTopic(ApiRequest<TopicRequest> request) throws IOException {
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
