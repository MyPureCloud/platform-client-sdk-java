package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ChatSettings;
import com.mypurecloud.sdk.v2.model.ErrorBody;


import com.mypurecloud.sdk.v2.api.request.GetChatSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchChatSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutChatSettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ChatApi {
  private final ApiClient pcapiClient;

  public ChatApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChatApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get Chat Settings.
   * 
   * @return ChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSettings getChatSettings() throws IOException, ApiException {
    return  getChatSettings(createGetChatSettingsRequest());
  }

  /**
   * Get Chat Settings.
   * 
   * @return ChatSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSettings> getChatSettingsWithHttpInfo() throws IOException {
    return getChatSettings(createGetChatSettingsRequest().withHttpInfo());
  }

  private GetChatSettingsRequest createGetChatSettingsRequest() {
    return GetChatSettingsRequest.builder()
            .build();
  }

  /**
   * Get Chat Settings.
   * 
   * @param request The request object
   * @return ChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSettings getChatSettings(GetChatSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Chat Settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSettings> getChatSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSettings> response = (ApiResponse<ChatSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<ChatSettings> response = (ApiResponse<ChatSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch Chat Settings.
   * 
   * @param body Chat (required)
   * @return ChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSettings patchChatSettings(ChatSettings body) throws IOException, ApiException {
    return  patchChatSettings(createPatchChatSettingsRequest(body));
  }

  /**
   * Patch Chat Settings.
   * 
   * @param body Chat (required)
   * @return ChatSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSettings> patchChatSettingsWithHttpInfo(ChatSettings body) throws IOException {
    return patchChatSettings(createPatchChatSettingsRequest(body).withHttpInfo());
  }

  private PatchChatSettingsRequest createPatchChatSettingsRequest(ChatSettings body) {
    return PatchChatSettingsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Patch Chat Settings.
   * 
   * @param request The request object
   * @return ChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSettings patchChatSettings(PatchChatSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch Chat Settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSettings> patchChatSettings(ApiRequest<ChatSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSettings> response = (ApiResponse<ChatSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<ChatSettings> response = (ApiResponse<ChatSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update Chat Settings.
   * 
   * @param body Chat (required)
   * @return ChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSettings putChatSettings(ChatSettings body) throws IOException, ApiException {
    return  putChatSettings(createPutChatSettingsRequest(body));
  }

  /**
   * Update Chat Settings.
   * 
   * @param body Chat (required)
   * @return ChatSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSettings> putChatSettingsWithHttpInfo(ChatSettings body) throws IOException {
    return putChatSettings(createPutChatSettingsRequest(body).withHttpInfo());
  }

  private PutChatSettingsRequest createPutChatSettingsRequest(ChatSettings body) {
    return PutChatSettingsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update Chat Settings.
   * 
   * @param request The request object
   * @return ChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChatSettings putChatSettings(PutChatSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChatSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChatSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Chat Settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChatSettings> putChatSettings(ApiRequest<ChatSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChatSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChatSettings> response = (ApiResponse<ChatSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<ChatSettings> response = (ApiResponse<ChatSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
