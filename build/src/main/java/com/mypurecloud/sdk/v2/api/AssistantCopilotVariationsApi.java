package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AssistantCopilotVariation;
import com.mypurecloud.sdk.v2.model.AssistantCopilotVariationListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;


import com.mypurecloud.sdk.v2.api.request.DeleteAssistantVariationRequest;
import com.mypurecloud.sdk.v2.api.request.GetAssistantVariationRequest;
import com.mypurecloud.sdk.v2.api.request.GetAssistantVariationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAssistantVariationsRequest;
import com.mypurecloud.sdk.v2.api.request.PutAssistantVariationRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssistantCopilotVariationsApi {
  private final ApiClient pcapiClient;

  public AssistantCopilotVariationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AssistantCopilotVariationsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete assistant copilot variation by id
   * 
   * @param assistantId Assistant ID (required)
   * @param variationId Variation ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAssistantVariation(String assistantId, String variationId) throws IOException, ApiException {
     deleteAssistantVariation(createDeleteAssistantVariationRequest(assistantId, variationId));
  }

  /**
   * Delete assistant copilot variation by id
   * 
   * @param assistantId Assistant ID (required)
   * @param variationId Variation ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAssistantVariationWithHttpInfo(String assistantId, String variationId) throws IOException {
    return deleteAssistantVariation(createDeleteAssistantVariationRequest(assistantId, variationId).withHttpInfo());
  }

  private DeleteAssistantVariationRequest createDeleteAssistantVariationRequest(String assistantId, String variationId) {
    return DeleteAssistantVariationRequest.builder()
            .withAssistantId(assistantId)

            .withVariationId(variationId)

            .build();
  }

  /**
   * Delete assistant copilot variation by id
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAssistantVariation(DeleteAssistantVariationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete assistant copilot variation by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAssistantVariation(ApiRequest<Void> request) throws IOException {
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
   * Get assistant copilot variation by id
   * 
   * @param assistantId Assistant ID (required)
   * @param variationId Variation ID (required)
   * @return AssistantCopilotVariation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantCopilotVariation getAssistantVariation(String assistantId, String variationId) throws IOException, ApiException {
    return  getAssistantVariation(createGetAssistantVariationRequest(assistantId, variationId));
  }

  /**
   * Get assistant copilot variation by id
   * 
   * @param assistantId Assistant ID (required)
   * @param variationId Variation ID (required)
   * @return AssistantCopilotVariation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantCopilotVariation> getAssistantVariationWithHttpInfo(String assistantId, String variationId) throws IOException {
    return getAssistantVariation(createGetAssistantVariationRequest(assistantId, variationId).withHttpInfo());
  }

  private GetAssistantVariationRequest createGetAssistantVariationRequest(String assistantId, String variationId) {
    return GetAssistantVariationRequest.builder()
            .withAssistantId(assistantId)

            .withVariationId(variationId)

            .build();
  }

  /**
   * Get assistant copilot variation by id
   * 
   * @param request The request object
   * @return AssistantCopilotVariation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantCopilotVariation getAssistantVariation(GetAssistantVariationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssistantCopilotVariation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssistantCopilotVariation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get assistant copilot variation by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantCopilotVariation> getAssistantVariation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssistantCopilotVariation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantCopilotVariation> response = (ApiResponse<AssistantCopilotVariation>)(ApiResponse<?>)exception;
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
      ApiResponse<AssistantCopilotVariation> response = (ApiResponse<AssistantCopilotVariation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get variations of an assistant copilot
   * 
   * @param assistantId Assistant ID (required)
   * @return AssistantCopilotVariationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantCopilotVariationListing getAssistantVariations(String assistantId) throws IOException, ApiException {
    return  getAssistantVariations(createGetAssistantVariationsRequest(assistantId));
  }

  /**
   * Get variations of an assistant copilot
   * 
   * @param assistantId Assistant ID (required)
   * @return AssistantCopilotVariationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantCopilotVariationListing> getAssistantVariationsWithHttpInfo(String assistantId) throws IOException {
    return getAssistantVariations(createGetAssistantVariationsRequest(assistantId).withHttpInfo());
  }

  private GetAssistantVariationsRequest createGetAssistantVariationsRequest(String assistantId) {
    return GetAssistantVariationsRequest.builder()
            .withAssistantId(assistantId)

            .build();
  }

  /**
   * Get variations of an assistant copilot
   * 
   * @param request The request object
   * @return AssistantCopilotVariationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantCopilotVariationListing getAssistantVariations(GetAssistantVariationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssistantCopilotVariationListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssistantCopilotVariationListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get variations of an assistant copilot
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantCopilotVariationListing> getAssistantVariations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssistantCopilotVariationListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantCopilotVariationListing> response = (ApiResponse<AssistantCopilotVariationListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AssistantCopilotVariationListing> response = (ApiResponse<AssistantCopilotVariationListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create assistant copilot variation
   * 
   * @param assistantId Assistant ID (required)
   * @param body  (required)
   * @return AssistantCopilotVariation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantCopilotVariation postAssistantVariations(String assistantId, AssistantCopilotVariation body) throws IOException, ApiException {
    return  postAssistantVariations(createPostAssistantVariationsRequest(assistantId, body));
  }

  /**
   * Create assistant copilot variation
   * 
   * @param assistantId Assistant ID (required)
   * @param body  (required)
   * @return AssistantCopilotVariation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantCopilotVariation> postAssistantVariationsWithHttpInfo(String assistantId, AssistantCopilotVariation body) throws IOException {
    return postAssistantVariations(createPostAssistantVariationsRequest(assistantId, body).withHttpInfo());
  }

  private PostAssistantVariationsRequest createPostAssistantVariationsRequest(String assistantId, AssistantCopilotVariation body) {
    return PostAssistantVariationsRequest.builder()
            .withAssistantId(assistantId)

            .withBody(body)

            .build();
  }

  /**
   * Create assistant copilot variation
   * 
   * @param request The request object
   * @return AssistantCopilotVariation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantCopilotVariation postAssistantVariations(PostAssistantVariationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssistantCopilotVariation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssistantCopilotVariation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create assistant copilot variation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantCopilotVariation> postAssistantVariations(ApiRequest<AssistantCopilotVariation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssistantCopilotVariation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantCopilotVariation> response = (ApiResponse<AssistantCopilotVariation>)(ApiResponse<?>)exception;
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
      ApiResponse<AssistantCopilotVariation> response = (ApiResponse<AssistantCopilotVariation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update assistant copilot variation by id
   * 
   * @param assistantId Assistant ID (required)
   * @param variationId Variation ID (required)
   * @param body  (required)
   * @return AssistantCopilotVariation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantCopilotVariation putAssistantVariation(String assistantId, String variationId, AssistantCopilotVariation body) throws IOException, ApiException {
    return  putAssistantVariation(createPutAssistantVariationRequest(assistantId, variationId, body));
  }

  /**
   * Update assistant copilot variation by id
   * 
   * @param assistantId Assistant ID (required)
   * @param variationId Variation ID (required)
   * @param body  (required)
   * @return AssistantCopilotVariation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantCopilotVariation> putAssistantVariationWithHttpInfo(String assistantId, String variationId, AssistantCopilotVariation body) throws IOException {
    return putAssistantVariation(createPutAssistantVariationRequest(assistantId, variationId, body).withHttpInfo());
  }

  private PutAssistantVariationRequest createPutAssistantVariationRequest(String assistantId, String variationId, AssistantCopilotVariation body) {
    return PutAssistantVariationRequest.builder()
            .withAssistantId(assistantId)

            .withVariationId(variationId)

            .withBody(body)

            .build();
  }

  /**
   * Update assistant copilot variation by id
   * 
   * @param request The request object
   * @return AssistantCopilotVariation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantCopilotVariation putAssistantVariation(PutAssistantVariationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssistantCopilotVariation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssistantCopilotVariation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update assistant copilot variation by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantCopilotVariation> putAssistantVariation(ApiRequest<AssistantCopilotVariation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssistantCopilotVariation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantCopilotVariation> response = (ApiResponse<AssistantCopilotVariation>)(ApiResponse<?>)exception;
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
      ApiResponse<AssistantCopilotVariation> response = (ApiResponse<AssistantCopilotVariation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
