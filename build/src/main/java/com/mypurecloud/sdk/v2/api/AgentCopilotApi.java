package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.Copilot;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.LanguageSupportResponse;


import com.mypurecloud.sdk.v2.api.request.GetAssistantCopilotRequest;
import com.mypurecloud.sdk.v2.api.request.GetAssistantsCopilotFeaturesupportRequest;
import com.mypurecloud.sdk.v2.api.request.PutAssistantCopilotRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgentCopilotApi {
  private final ApiClient pcapiClient;

  public AgentCopilotApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AgentCopilotApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get copilot configuration of an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @return Copilot
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Copilot getAssistantCopilot(String assistantId) throws IOException, ApiException {
    return  getAssistantCopilot(createGetAssistantCopilotRequest(assistantId));
  }

  /**
   * Get copilot configuration of an assistant.
   * 
   * @param assistantId Assistant ID (required)
   * @return Copilot
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Copilot> getAssistantCopilotWithHttpInfo(String assistantId) throws IOException {
    return getAssistantCopilot(createGetAssistantCopilotRequest(assistantId).withHttpInfo());
  }

  private GetAssistantCopilotRequest createGetAssistantCopilotRequest(String assistantId) {
    return GetAssistantCopilotRequest.builder()
            .withAssistantId(assistantId)

            .build();
  }

  /**
   * Get copilot configuration of an assistant.
   * 
   * @param request The request object
   * @return Copilot
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Copilot getAssistantCopilot(GetAssistantCopilotRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Copilot> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Copilot>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get copilot configuration of an assistant.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Copilot> getAssistantCopilot(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Copilot>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Copilot> response = (ApiResponse<Copilot>)(ApiResponse<?>)exception;
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
      ApiResponse<Copilot> response = (ApiResponse<Copilot>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get information about the support of features for all the languages or only for a certain language.
   * 
   * @param language Which language are the features supported for (optional)
   * @return LanguageSupportResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LanguageSupportResponse getAssistantsCopilotFeaturesupport(String language) throws IOException, ApiException {
    return  getAssistantsCopilotFeaturesupport(createGetAssistantsCopilotFeaturesupportRequest(language));
  }

  /**
   * Get information about the support of features for all the languages or only for a certain language.
   * 
   * @param language Which language are the features supported for (optional)
   * @return LanguageSupportResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LanguageSupportResponse> getAssistantsCopilotFeaturesupportWithHttpInfo(String language) throws IOException {
    return getAssistantsCopilotFeaturesupport(createGetAssistantsCopilotFeaturesupportRequest(language).withHttpInfo());
  }

  private GetAssistantsCopilotFeaturesupportRequest createGetAssistantsCopilotFeaturesupportRequest(String language) {
    return GetAssistantsCopilotFeaturesupportRequest.builder()
            .withLanguage(language)

            .build();
  }

  /**
   * Get information about the support of features for all the languages or only for a certain language.
   * 
   * @param request The request object
   * @return LanguageSupportResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LanguageSupportResponse getAssistantsCopilotFeaturesupport(GetAssistantsCopilotFeaturesupportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LanguageSupportResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LanguageSupportResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get information about the support of features for all the languages or only for a certain language.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LanguageSupportResponse> getAssistantsCopilotFeaturesupport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LanguageSupportResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LanguageSupportResponse> response = (ApiResponse<LanguageSupportResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LanguageSupportResponse> response = (ApiResponse<LanguageSupportResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update agent copilot configuration
   * 
   * @param assistantId Assistant ID (required)
   * @param body  (required)
   * @return Copilot
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Copilot putAssistantCopilot(String assistantId, Copilot body) throws IOException, ApiException {
    return  putAssistantCopilot(createPutAssistantCopilotRequest(assistantId, body));
  }

  /**
   * Update agent copilot configuration
   * 
   * @param assistantId Assistant ID (required)
   * @param body  (required)
   * @return Copilot
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Copilot> putAssistantCopilotWithHttpInfo(String assistantId, Copilot body) throws IOException {
    return putAssistantCopilot(createPutAssistantCopilotRequest(assistantId, body).withHttpInfo());
  }

  private PutAssistantCopilotRequest createPutAssistantCopilotRequest(String assistantId, Copilot body) {
    return PutAssistantCopilotRequest.builder()
            .withAssistantId(assistantId)

            .withBody(body)

            .build();
  }

  /**
   * Update agent copilot configuration
   * 
   * @param request The request object
   * @return Copilot
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Copilot putAssistantCopilot(PutAssistantCopilotRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Copilot> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Copilot>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update agent copilot configuration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Copilot> putAssistantCopilot(ApiRequest<Copilot> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Copilot>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Copilot> response = (ApiResponse<Copilot>)(ApiResponse<?>)exception;
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
      ApiResponse<Copilot> response = (ApiResponse<Copilot>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
