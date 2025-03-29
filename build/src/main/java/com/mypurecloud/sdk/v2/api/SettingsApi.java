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
import com.mypurecloud.sdk.v2.model.EmailSettings;
import com.mypurecloud.sdk.v2.model.EmailThreadingSettings;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExecutionDataGlobalSettingsResponse;
import com.mypurecloud.sdk.v2.model.ExecutionDataSettingsRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteEmailsSettingsThreadingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetEmailsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetEmailsSettingsThreadingRequest;
import com.mypurecloud.sdk.v2.api.request.GetSettingsExecutiondataRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchEmailsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchEmailsSettingsThreadingRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSettingsExecutiondataRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SettingsApi {
  private final ApiClient pcapiClient;

  public SettingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SettingsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Reset email threading settings to default
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteEmailsSettingsThreading() throws IOException, ApiException {
     deleteEmailsSettingsThreading(createDeleteEmailsSettingsThreadingRequest());
  }

  /**
   * Reset email threading settings to default
   * 
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteEmailsSettingsThreadingWithHttpInfo() throws IOException {
    return deleteEmailsSettingsThreading(createDeleteEmailsSettingsThreadingRequest().withHttpInfo());
  }

  private DeleteEmailsSettingsThreadingRequest createDeleteEmailsSettingsThreadingRequest() {
    return DeleteEmailsSettingsThreadingRequest.builder()
            .build();
  }

  /**
   * Reset email threading settings to default
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteEmailsSettingsThreading(DeleteEmailsSettingsThreadingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Reset email threading settings to default
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteEmailsSettingsThreading(ApiRequest<Void> request) throws IOException {
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
   * Get email Contact Center settings
   * 
   * @return EmailSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailSettings getEmailsSettings() throws IOException, ApiException {
    return  getEmailsSettings(createGetEmailsSettingsRequest());
  }

  /**
   * Get email Contact Center settings
   * 
   * @return EmailSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailSettings> getEmailsSettingsWithHttpInfo() throws IOException {
    return getEmailsSettings(createGetEmailsSettingsRequest().withHttpInfo());
  }

  private GetEmailsSettingsRequest createGetEmailsSettingsRequest() {
    return GetEmailsSettingsRequest.builder()
            .build();
  }

  /**
   * Get email Contact Center settings
   * 
   * @param request The request object
   * @return EmailSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailSettings getEmailsSettings(GetEmailsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get email Contact Center settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailSettings> getEmailsSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailSettings> response = (ApiResponse<EmailSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailSettings> response = (ApiResponse<EmailSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get email threading settings
   * 
   * @return EmailThreadingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailThreadingSettings getEmailsSettingsThreading() throws IOException, ApiException {
    return  getEmailsSettingsThreading(createGetEmailsSettingsThreadingRequest());
  }

  /**
   * Get email threading settings
   * 
   * @return EmailThreadingSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailThreadingSettings> getEmailsSettingsThreadingWithHttpInfo() throws IOException {
    return getEmailsSettingsThreading(createGetEmailsSettingsThreadingRequest().withHttpInfo());
  }

  private GetEmailsSettingsThreadingRequest createGetEmailsSettingsThreadingRequest() {
    return GetEmailsSettingsThreadingRequest.builder()
            .build();
  }

  /**
   * Get email threading settings
   * 
   * @param request The request object
   * @return EmailThreadingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailThreadingSettings getEmailsSettingsThreading(GetEmailsSettingsThreadingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailThreadingSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailThreadingSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get email threading settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailThreadingSettings> getEmailsSettingsThreading(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailThreadingSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailThreadingSettings> response = (ApiResponse<EmailThreadingSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailThreadingSettings> response = (ApiResponse<EmailThreadingSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the execution history enabled setting.
   * Get the execution history enabled setting.
   * @return ExecutionDataGlobalSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExecutionDataGlobalSettingsResponse getSettingsExecutiondata() throws IOException, ApiException {
    return  getSettingsExecutiondata(createGetSettingsExecutiondataRequest());
  }

  /**
   * Get the execution history enabled setting.
   * Get the execution history enabled setting.
   * @return ExecutionDataGlobalSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExecutionDataGlobalSettingsResponse> getSettingsExecutiondataWithHttpInfo() throws IOException {
    return getSettingsExecutiondata(createGetSettingsExecutiondataRequest().withHttpInfo());
  }

  private GetSettingsExecutiondataRequest createGetSettingsExecutiondataRequest() {
    return GetSettingsExecutiondataRequest.builder()
            .build();
  }

  /**
   * Get the execution history enabled setting.
   * Get the execution history enabled setting.
   * @param request The request object
   * @return ExecutionDataGlobalSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExecutionDataGlobalSettingsResponse getSettingsExecutiondata(GetSettingsExecutiondataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExecutionDataGlobalSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExecutionDataGlobalSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the execution history enabled setting.
   * Get the execution history enabled setting.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExecutionDataGlobalSettingsResponse> getSettingsExecutiondata(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExecutionDataGlobalSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExecutionDataGlobalSettingsResponse> response = (ApiResponse<ExecutionDataGlobalSettingsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ExecutionDataGlobalSettingsResponse> response = (ApiResponse<ExecutionDataGlobalSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Patch email Contact Center settings
   * 
   * @param body  (optional)
   * @return EmailSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailSettings patchEmailsSettings(EmailSettings body) throws IOException, ApiException {
    return  patchEmailsSettings(createPatchEmailsSettingsRequest(body));
  }

  /**
   * Patch email Contact Center settings
   * 
   * @param body  (optional)
   * @return EmailSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailSettings> patchEmailsSettingsWithHttpInfo(EmailSettings body) throws IOException {
    return patchEmailsSettings(createPatchEmailsSettingsRequest(body).withHttpInfo());
  }

  private PatchEmailsSettingsRequest createPatchEmailsSettingsRequest(EmailSettings body) {
    return PatchEmailsSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Patch email Contact Center settings
   * 
   * @param request The request object
   * @return EmailSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailSettings patchEmailsSettings(PatchEmailsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch email Contact Center settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailSettings> patchEmailsSettings(ApiRequest<EmailSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailSettings> response = (ApiResponse<EmailSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailSettings> response = (ApiResponse<EmailSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Patch email threading settings
   * 
   * @param body  (optional)
   * @return EmailThreadingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailThreadingSettings patchEmailsSettingsThreading(EmailThreadingSettings body) throws IOException, ApiException {
    return  patchEmailsSettingsThreading(createPatchEmailsSettingsThreadingRequest(body));
  }

  /**
   * Patch email threading settings
   * 
   * @param body  (optional)
   * @return EmailThreadingSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailThreadingSettings> patchEmailsSettingsThreadingWithHttpInfo(EmailThreadingSettings body) throws IOException {
    return patchEmailsSettingsThreading(createPatchEmailsSettingsThreadingRequest(body).withHttpInfo());
  }

  private PatchEmailsSettingsThreadingRequest createPatchEmailsSettingsThreadingRequest(EmailThreadingSettings body) {
    return PatchEmailsSettingsThreadingRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Patch email threading settings
   * 
   * @param request The request object
   * @return EmailThreadingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailThreadingSettings patchEmailsSettingsThreading(PatchEmailsSettingsThreadingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailThreadingSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailThreadingSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch email threading settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailThreadingSettings> patchEmailsSettingsThreading(ApiRequest<EmailThreadingSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailThreadingSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailThreadingSettings> response = (ApiResponse<EmailThreadingSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailThreadingSettings> response = (ApiResponse<EmailThreadingSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Edit the execution history on off setting.
   * Edit the execution history on off setting.
   * @param body New Execution Data Setting (required)
   * @return ExecutionDataGlobalSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExecutionDataGlobalSettingsResponse patchSettingsExecutiondata(ExecutionDataSettingsRequest body) throws IOException, ApiException {
    return  patchSettingsExecutiondata(createPatchSettingsExecutiondataRequest(body));
  }

  /**
   * Edit the execution history on off setting.
   * Edit the execution history on off setting.
   * @param body New Execution Data Setting (required)
   * @return ExecutionDataGlobalSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExecutionDataGlobalSettingsResponse> patchSettingsExecutiondataWithHttpInfo(ExecutionDataSettingsRequest body) throws IOException {
    return patchSettingsExecutiondata(createPatchSettingsExecutiondataRequest(body).withHttpInfo());
  }

  private PatchSettingsExecutiondataRequest createPatchSettingsExecutiondataRequest(ExecutionDataSettingsRequest body) {
    return PatchSettingsExecutiondataRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Edit the execution history on off setting.
   * Edit the execution history on off setting.
   * @param request The request object
   * @return ExecutionDataGlobalSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExecutionDataGlobalSettingsResponse patchSettingsExecutiondata(PatchSettingsExecutiondataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExecutionDataGlobalSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExecutionDataGlobalSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Edit the execution history on off setting.
   * Edit the execution history on off setting.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExecutionDataGlobalSettingsResponse> patchSettingsExecutiondata(ApiRequest<ExecutionDataSettingsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExecutionDataGlobalSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExecutionDataGlobalSettingsResponse> response = (ApiResponse<ExecutionDataGlobalSettingsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ExecutionDataGlobalSettingsResponse> response = (ApiResponse<ExecutionDataGlobalSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
