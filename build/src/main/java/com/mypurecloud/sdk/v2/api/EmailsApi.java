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
import com.mypurecloud.sdk.v2.model.EmailThreadingSettings;
import com.mypurecloud.sdk.v2.model.ErrorBody;


import com.mypurecloud.sdk.v2.api.request.DeleteEmailsSettingsThreadingRequest;
import com.mypurecloud.sdk.v2.api.request.GetEmailsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetEmailsSettingsThreadingRequest;
import com.mypurecloud.sdk.v2.api.request.PatchEmailsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchEmailsSettingsThreadingRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailsApi {
  private final ApiClient pcapiClient;

  public EmailsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EmailsApi(ApiClient apiClient) {
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

}
