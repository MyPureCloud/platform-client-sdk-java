package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.EmailSettings;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExecutionDataGlobalSettingsResponse;
import com.mypurecloud.sdk.v2.model.ExecutionDataSettingsRequest;


import com.mypurecloud.sdk.v2.api.request.GetEmailsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSettingsExecutiondataRequest;
import com.mypurecloud.sdk.v2.api.request.PatchEmailsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSettingsExecutiondataRequest;

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
   * Get the execution history enabled setting.
   * Get the execution history enabled setting.
   * getSettingsExecutiondata is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getSettingsExecutiondata is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getSettingsExecutiondata is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getSettingsExecutiondata is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Edit the execution history on off setting.
   * Edit the execution history on off setting.
   * patchSettingsExecutiondata is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchSettingsExecutiondata is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchSettingsExecutiondata is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchSettingsExecutiondata is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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

}
