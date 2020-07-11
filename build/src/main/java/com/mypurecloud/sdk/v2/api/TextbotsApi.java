package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.PostTextResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.PostTextRequest;


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
