package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AutoAnswerSettings;
import com.mypurecloud.sdk.v2.model.ErrorBody;


import com.mypurecloud.sdk.v2.api.request.DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgentUIApi {
  private final ApiClient pcapiClient;

  public AgentUIApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AgentUIApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete agent auto answer settings
   * 
   * @param agentId The agent to apply the auto answer settings to (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUsersAgentuiAgentsAutoanswerAgentIdSettings(String agentId) throws IOException, ApiException {
     deleteUsersAgentuiAgentsAutoanswerAgentIdSettings(createDeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest(agentId));
  }

  /**
   * Delete agent auto answer settings
   * 
   * @param agentId The agent to apply the auto answer settings to (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUsersAgentuiAgentsAutoanswerAgentIdSettingsWithHttpInfo(String agentId) throws IOException {
    return deleteUsersAgentuiAgentsAutoanswerAgentIdSettings(createDeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest(agentId).withHttpInfo());
  }

  private DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest createDeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest(String agentId) {
    return DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest.builder()
            .withAgentId(agentId)

            .build();
  }

  /**
   * Delete agent auto answer settings
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUsersAgentuiAgentsAutoanswerAgentIdSettings(DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete agent auto answer settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUsersAgentuiAgentsAutoanswerAgentIdSettings(ApiRequest<Void> request) throws IOException {
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
   * Get agent auto answer settings
   * 
   * @param agentId The agent to apply the auto answer settings to (required)
   * @return AutoAnswerSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AutoAnswerSettings getUsersAgentuiAgentsAutoanswerAgentIdSettings(String agentId) throws IOException, ApiException {
    return  getUsersAgentuiAgentsAutoanswerAgentIdSettings(createGetUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest(agentId));
  }

  /**
   * Get agent auto answer settings
   * 
   * @param agentId The agent to apply the auto answer settings to (required)
   * @return AutoAnswerSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AutoAnswerSettings> getUsersAgentuiAgentsAutoanswerAgentIdSettingsWithHttpInfo(String agentId) throws IOException {
    return getUsersAgentuiAgentsAutoanswerAgentIdSettings(createGetUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest(agentId).withHttpInfo());
  }

  private GetUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest createGetUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest(String agentId) {
    return GetUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest.builder()
            .withAgentId(agentId)

            .build();
  }

  /**
   * Get agent auto answer settings
   * 
   * @param request The request object
   * @return AutoAnswerSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AutoAnswerSettings getUsersAgentuiAgentsAutoanswerAgentIdSettings(GetUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AutoAnswerSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AutoAnswerSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get agent auto answer settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AutoAnswerSettings> getUsersAgentuiAgentsAutoanswerAgentIdSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AutoAnswerSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AutoAnswerSettings> response = (ApiResponse<AutoAnswerSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<AutoAnswerSettings> response = (ApiResponse<AutoAnswerSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update agent auto answer settings
   * 
   * @param agentId The agent to apply the auto answer settings to (required)
   * @param body AutoAnswerSettings (required)
   * @return AutoAnswerSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AutoAnswerSettings patchUsersAgentuiAgentsAutoanswerAgentIdSettings(String agentId, AutoAnswerSettings body) throws IOException, ApiException {
    return  patchUsersAgentuiAgentsAutoanswerAgentIdSettings(createPatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest(agentId, body));
  }

  /**
   * Update agent auto answer settings
   * 
   * @param agentId The agent to apply the auto answer settings to (required)
   * @param body AutoAnswerSettings (required)
   * @return AutoAnswerSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AutoAnswerSettings> patchUsersAgentuiAgentsAutoanswerAgentIdSettingsWithHttpInfo(String agentId, AutoAnswerSettings body) throws IOException {
    return patchUsersAgentuiAgentsAutoanswerAgentIdSettings(createPatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest(agentId, body).withHttpInfo());
  }

  private PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest createPatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest(String agentId, AutoAnswerSettings body) {
    return PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest.builder()
            .withAgentId(agentId)

            .withBody(body)

            .build();
  }

  /**
   * Update agent auto answer settings
   * 
   * @param request The request object
   * @return AutoAnswerSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AutoAnswerSettings patchUsersAgentuiAgentsAutoanswerAgentIdSettings(PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AutoAnswerSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AutoAnswerSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update agent auto answer settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AutoAnswerSettings> patchUsersAgentuiAgentsAutoanswerAgentIdSettings(ApiRequest<AutoAnswerSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AutoAnswerSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AutoAnswerSettings> response = (ApiResponse<AutoAnswerSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<AutoAnswerSettings> response = (ApiResponse<AutoAnswerSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Set agent auto answer settings
   * 
   * @param agentId The agent to apply the auto answer settings to (required)
   * @param body AutoAnswerSettings (required)
   * @return AutoAnswerSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AutoAnswerSettings putUsersAgentuiAgentsAutoanswerAgentIdSettings(String agentId, AutoAnswerSettings body) throws IOException, ApiException {
    return  putUsersAgentuiAgentsAutoanswerAgentIdSettings(createPutUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest(agentId, body));
  }

  /**
   * Set agent auto answer settings
   * 
   * @param agentId The agent to apply the auto answer settings to (required)
   * @param body AutoAnswerSettings (required)
   * @return AutoAnswerSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AutoAnswerSettings> putUsersAgentuiAgentsAutoanswerAgentIdSettingsWithHttpInfo(String agentId, AutoAnswerSettings body) throws IOException {
    return putUsersAgentuiAgentsAutoanswerAgentIdSettings(createPutUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest(agentId, body).withHttpInfo());
  }

  private PutUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest createPutUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest(String agentId, AutoAnswerSettings body) {
    return PutUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest.builder()
            .withAgentId(agentId)

            .withBody(body)

            .build();
  }

  /**
   * Set agent auto answer settings
   * 
   * @param request The request object
   * @return AutoAnswerSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AutoAnswerSettings putUsersAgentuiAgentsAutoanswerAgentIdSettings(PutUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AutoAnswerSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AutoAnswerSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Set agent auto answer settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AutoAnswerSettings> putUsersAgentuiAgentsAutoanswerAgentIdSettings(ApiRequest<AutoAnswerSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AutoAnswerSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AutoAnswerSettings> response = (ApiResponse<AutoAnswerSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<AutoAnswerSettings> response = (ApiResponse<AutoAnswerSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
