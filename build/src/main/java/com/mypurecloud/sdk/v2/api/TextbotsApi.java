package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.TextBotFlowTurnRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.TextBotFlowTurnResponse;
import com.mypurecloud.sdk.v2.model.TextBotFlowLaunchRequest;
import com.mypurecloud.sdk.v2.model.TextBotFlowLaunchResponse;
import com.mypurecloud.sdk.v2.model.PostTextResponse;
import com.mypurecloud.sdk.v2.model.PostTextRequest;


import com.mypurecloud.sdk.v2.api.request.PostTextbotsBotflowsSessionTurnsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTextbotsBotflowsSessionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTextbotsBotsExecuteRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TextbotsApi {
  private final ApiClient pcapiClient;

  public TextbotsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TextbotsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Issue a bot flow turn event
   * Send a turn event to an executing bot flow and produce the next action to take.
   * @param sessionId The bot flow session ID, typically obtained from &#39;POST /api/v2/textbots/botflows/sessions&#39; (required)
   * @param turnRequest  (required)
   * @return TextBotFlowTurnResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TextBotFlowTurnResponse postTextbotsBotflowsSessionTurns(String sessionId, TextBotFlowTurnRequest turnRequest) throws IOException, ApiException {
    return  postTextbotsBotflowsSessionTurns(createPostTextbotsBotflowsSessionTurnsRequest(sessionId, turnRequest));
  }

  /**
   * Issue a bot flow turn event
   * Send a turn event to an executing bot flow and produce the next action to take.
   * @param sessionId The bot flow session ID, typically obtained from &#39;POST /api/v2/textbots/botflows/sessions&#39; (required)
   * @param turnRequest  (required)
   * @return TextBotFlowTurnResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TextBotFlowTurnResponse> postTextbotsBotflowsSessionTurnsWithHttpInfo(String sessionId, TextBotFlowTurnRequest turnRequest) throws IOException {
    return postTextbotsBotflowsSessionTurns(createPostTextbotsBotflowsSessionTurnsRequest(sessionId, turnRequest).withHttpInfo());
  }

  private PostTextbotsBotflowsSessionTurnsRequest createPostTextbotsBotflowsSessionTurnsRequest(String sessionId, TextBotFlowTurnRequest turnRequest) {
    return PostTextbotsBotflowsSessionTurnsRequest.builder()
            .withSessionId(sessionId)
    
            .withTurnRequest(turnRequest)
    
            .build();
  }

  /**
   * Issue a bot flow turn event
   * Send a turn event to an executing bot flow and produce the next action to take.
   * @param request The request object
   * @return TextBotFlowTurnResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TextBotFlowTurnResponse postTextbotsBotflowsSessionTurns(PostTextbotsBotflowsSessionTurnsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TextBotFlowTurnResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TextBotFlowTurnResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Issue a bot flow turn event
   * Send a turn event to an executing bot flow and produce the next action to take.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TextBotFlowTurnResponse> postTextbotsBotflowsSessionTurns(ApiRequest<TextBotFlowTurnRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TextBotFlowTurnResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TextBotFlowTurnResponse> response = (ApiResponse<TextBotFlowTurnResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TextBotFlowTurnResponse> response = (ApiResponse<TextBotFlowTurnResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create an execution instance of a bot flow definition.
   * The launch is asynchronous; use the returned instance ID to post turns to it using &#39;POST /api/v2/textbots/botflows/sessions/{sessionId}/turns&#39;.
   * @param launchRequest  (required)
   * @return TextBotFlowLaunchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TextBotFlowLaunchResponse postTextbotsBotflowsSessions(TextBotFlowLaunchRequest launchRequest) throws IOException, ApiException {
    return  postTextbotsBotflowsSessions(createPostTextbotsBotflowsSessionsRequest(launchRequest));
  }

  /**
   * Create an execution instance of a bot flow definition.
   * The launch is asynchronous; use the returned instance ID to post turns to it using &#39;POST /api/v2/textbots/botflows/sessions/{sessionId}/turns&#39;.
   * @param launchRequest  (required)
   * @return TextBotFlowLaunchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TextBotFlowLaunchResponse> postTextbotsBotflowsSessionsWithHttpInfo(TextBotFlowLaunchRequest launchRequest) throws IOException {
    return postTextbotsBotflowsSessions(createPostTextbotsBotflowsSessionsRequest(launchRequest).withHttpInfo());
  }

  private PostTextbotsBotflowsSessionsRequest createPostTextbotsBotflowsSessionsRequest(TextBotFlowLaunchRequest launchRequest) {
    return PostTextbotsBotflowsSessionsRequest.builder()
            .withLaunchRequest(launchRequest)
    
            .build();
  }

  /**
   * Create an execution instance of a bot flow definition.
   * The launch is asynchronous; use the returned instance ID to post turns to it using &#39;POST /api/v2/textbots/botflows/sessions/{sessionId}/turns&#39;.
   * @param request The request object
   * @return TextBotFlowLaunchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TextBotFlowLaunchResponse postTextbotsBotflowsSessions(PostTextbotsBotflowsSessionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TextBotFlowLaunchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TextBotFlowLaunchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an execution instance of a bot flow definition.
   * The launch is asynchronous; use the returned instance ID to post turns to it using &#39;POST /api/v2/textbots/botflows/sessions/{sessionId}/turns&#39;.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TextBotFlowLaunchResponse> postTextbotsBotflowsSessions(ApiRequest<TextBotFlowLaunchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TextBotFlowLaunchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TextBotFlowLaunchResponse> response = (ApiResponse<TextBotFlowLaunchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TextBotFlowLaunchResponse> response = (ApiResponse<TextBotFlowLaunchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Send an intent to a bot to start a dialog/interact with it via text
   * This will either start a bot with the given id or relay a communication to an existing bot session.
   * @param postTextRequest  (required)
   * @return PostTextResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PostTextResponse postTextbotsBotsExecute(PostTextRequest postTextRequest) throws IOException, ApiException {
    return  postTextbotsBotsExecute(createPostTextbotsBotsExecuteRequest(postTextRequest));
  }

  /**
   * Send an intent to a bot to start a dialog/interact with it via text
   * This will either start a bot with the given id or relay a communication to an existing bot session.
   * @param postTextRequest  (required)
   * @return PostTextResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PostTextResponse> postTextbotsBotsExecuteWithHttpInfo(PostTextRequest postTextRequest) throws IOException {
    return postTextbotsBotsExecute(createPostTextbotsBotsExecuteRequest(postTextRequest).withHttpInfo());
  }

  private PostTextbotsBotsExecuteRequest createPostTextbotsBotsExecuteRequest(PostTextRequest postTextRequest) {
    return PostTextbotsBotsExecuteRequest.builder()
            .withPostTextRequest(postTextRequest)
    
            .build();
  }

  /**
   * Send an intent to a bot to start a dialog/interact with it via text
   * This will either start a bot with the given id or relay a communication to an existing bot session.
   * @param request The request object
   * @return PostTextResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PostTextResponse postTextbotsBotsExecute(PostTextbotsBotsExecuteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PostTextResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PostTextResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send an intent to a bot to start a dialog/interact with it via text
   * This will either start a bot with the given id or relay a communication to an existing bot session.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PostTextResponse> postTextbotsBotsExecute(ApiRequest<PostTextRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PostTextResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PostTextResponse> response = (ApiResponse<PostTextResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<PostTextResponse> response = (ApiResponse<PostTextResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
