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
import com.mypurecloud.sdk.v2.model.MessagingConfigListing;
import com.mypurecloud.sdk.v2.model.MessagingSetting;
import com.mypurecloud.sdk.v2.model.MessagingSettingDefaultRequest;
import com.mypurecloud.sdk.v2.model.MessagingSettingRequest;
import com.mypurecloud.sdk.v2.model.SupportedContent;
import com.mypurecloud.sdk.v2.model.SupportedContentListing;


import com.mypurecloud.sdk.v2.api.request.DeleteMessagingSettingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteMessagingSettingsDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteMessagingSupportedcontentSupportedContentIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingSettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingSettingsDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingSupportedcontentRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingSupportedcontentSupportedContentIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchMessagingSettingRequest;
import com.mypurecloud.sdk.v2.api.request.PatchMessagingSupportedcontentSupportedContentIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostMessagingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostMessagingSupportedcontentRequest;
import com.mypurecloud.sdk.v2.api.request.PutMessagingSettingsDefaultRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagingApi {
  private final ApiClient pcapiClient;

  public MessagingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagingApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a messaging setting
   * 
   * @param messageSettingId Message Settings ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public void deleteMessagingSetting(String messageSettingId) throws IOException, ApiException {
     deleteMessagingSetting(createDeleteMessagingSettingRequest(messageSettingId));
  }

  /**
   * Delete a messaging setting
   * 
   * @param messageSettingId Message Settings ID (required)
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<Void> deleteMessagingSettingWithHttpInfo(String messageSettingId) throws IOException {
    return deleteMessagingSetting(createDeleteMessagingSettingRequest(messageSettingId).withHttpInfo());
  }

  private DeleteMessagingSettingRequest createDeleteMessagingSettingRequest(String messageSettingId) {
    return DeleteMessagingSettingRequest.builder()
            .withMessageSettingId(messageSettingId)

            .build();
  }

  /**
   * Delete a messaging setting
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public void deleteMessagingSetting(DeleteMessagingSettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a messaging setting
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<Void> deleteMessagingSetting(ApiRequest<Void> request) throws IOException {
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
   * Delete the organization's default setting, a global default will be applied to integrations without settings
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public void deleteMessagingSettingsDefault() throws IOException, ApiException {
     deleteMessagingSettingsDefault(createDeleteMessagingSettingsDefaultRequest());
  }

  /**
   * Delete the organization's default setting, a global default will be applied to integrations without settings
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<Void> deleteMessagingSettingsDefaultWithHttpInfo() throws IOException {
    return deleteMessagingSettingsDefault(createDeleteMessagingSettingsDefaultRequest().withHttpInfo());
  }

  private DeleteMessagingSettingsDefaultRequest createDeleteMessagingSettingsDefaultRequest() {
    return DeleteMessagingSettingsDefaultRequest.builder()
            .build();
  }

  /**
   * Delete the organization's default setting, a global default will be applied to integrations without settings
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public void deleteMessagingSettingsDefault(DeleteMessagingSettingsDefaultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete the organization's default setting, a global default will be applied to integrations without settings
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<Void> deleteMessagingSettingsDefault(ApiRequest<Void> request) throws IOException {
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
   * Delete a supported content profile
   * Deprecated - use DELETE /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param supportedContentId Supported Content ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public void deleteMessagingSupportedcontentSupportedContentId(String supportedContentId) throws IOException, ApiException {
     deleteMessagingSupportedcontentSupportedContentId(createDeleteMessagingSupportedcontentSupportedContentIdRequest(supportedContentId));
  }

  /**
   * Delete a supported content profile
   * Deprecated - use DELETE /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param supportedContentId Supported Content ID (required)
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<Void> deleteMessagingSupportedcontentSupportedContentIdWithHttpInfo(String supportedContentId) throws IOException {
    return deleteMessagingSupportedcontentSupportedContentId(createDeleteMessagingSupportedcontentSupportedContentIdRequest(supportedContentId).withHttpInfo());
  }

  private DeleteMessagingSupportedcontentSupportedContentIdRequest createDeleteMessagingSupportedcontentSupportedContentIdRequest(String supportedContentId) {
    return DeleteMessagingSupportedcontentSupportedContentIdRequest.builder()
            .withSupportedContentId(supportedContentId)

            .build();
  }

  /**
   * Delete a supported content profile
   * Deprecated - use DELETE /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public void deleteMessagingSupportedcontentSupportedContentId(DeleteMessagingSupportedcontentSupportedContentIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a supported content profile
   * Deprecated - use DELETE /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<Void> deleteMessagingSupportedcontentSupportedContentId(ApiRequest<Void> request) throws IOException {
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
   * Get a messaging setting
   * 
   * @param messageSettingId Message Settings ID (required)
   * @return MessagingSetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public MessagingSetting getMessagingSetting(String messageSettingId) throws IOException, ApiException {
    return  getMessagingSetting(createGetMessagingSettingRequest(messageSettingId));
  }

  /**
   * Get a messaging setting
   * 
   * @param messageSettingId Message Settings ID (required)
   * @return MessagingSetting
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<MessagingSetting> getMessagingSettingWithHttpInfo(String messageSettingId) throws IOException {
    return getMessagingSetting(createGetMessagingSettingRequest(messageSettingId).withHttpInfo());
  }

  private GetMessagingSettingRequest createGetMessagingSettingRequest(String messageSettingId) {
    return GetMessagingSettingRequest.builder()
            .withMessageSettingId(messageSettingId)

            .build();
  }

  /**
   * Get a messaging setting
   * 
   * @param request The request object
   * @return MessagingSetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public MessagingSetting getMessagingSetting(GetMessagingSettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingSetting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingSetting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a messaging setting
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<MessagingSetting> getMessagingSetting(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingSetting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)exception;
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
      ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of messaging settings
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return MessagingConfigListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public MessagingConfigListing getMessagingSettings(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getMessagingSettings(createGetMessagingSettingsRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of messaging settings
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return MessagingConfigListing
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<MessagingConfigListing> getMessagingSettingsWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getMessagingSettings(createGetMessagingSettingsRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetMessagingSettingsRequest createGetMessagingSettingsRequest(Integer pageSize, Integer pageNumber) {
    return GetMessagingSettingsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Get a list of messaging settings
   * 
   * @param request The request object
   * @return MessagingConfigListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public MessagingConfigListing getMessagingSettings(GetMessagingSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingConfigListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingConfigListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of messaging settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<MessagingConfigListing> getMessagingSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingConfigListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingConfigListing> response = (ApiResponse<MessagingConfigListing>)(ApiResponse<?>)exception;
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
      ApiResponse<MessagingConfigListing> response = (ApiResponse<MessagingConfigListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the organization's default settings that will be used as the default when creating an integration.
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @return MessagingSetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public MessagingSetting getMessagingSettingsDefault() throws IOException, ApiException {
    return  getMessagingSettingsDefault(createGetMessagingSettingsDefaultRequest());
  }

  /**
   * Get the organization's default settings that will be used as the default when creating an integration.
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @return MessagingSetting
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<MessagingSetting> getMessagingSettingsDefaultWithHttpInfo() throws IOException {
    return getMessagingSettingsDefault(createGetMessagingSettingsDefaultRequest().withHttpInfo());
  }

  private GetMessagingSettingsDefaultRequest createGetMessagingSettingsDefaultRequest() {
    return GetMessagingSettingsDefaultRequest.builder()
            .build();
  }

  /**
   * Get the organization's default settings that will be used as the default when creating an integration.
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param request The request object
   * @return MessagingSetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public MessagingSetting getMessagingSettingsDefault(GetMessagingSettingsDefaultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingSetting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingSetting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the organization's default settings that will be used as the default when creating an integration.
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<MessagingSetting> getMessagingSettingsDefault(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingSetting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)exception;
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
      ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Supported Content profiles
   * Deprecated - use GET /api/v2/conversations/messaging/supportedcontent as replacement
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SupportedContentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public SupportedContentListing getMessagingSupportedcontent(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getMessagingSupportedcontent(createGetMessagingSupportedcontentRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of Supported Content profiles
   * Deprecated - use GET /api/v2/conversations/messaging/supportedcontent as replacement
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SupportedContentListing
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<SupportedContentListing> getMessagingSupportedcontentWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getMessagingSupportedcontent(createGetMessagingSupportedcontentRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetMessagingSupportedcontentRequest createGetMessagingSupportedcontentRequest(Integer pageSize, Integer pageNumber) {
    return GetMessagingSupportedcontentRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Get a list of Supported Content profiles
   * Deprecated - use GET /api/v2/conversations/messaging/supportedcontent as replacement
   * @param request The request object
   * @return SupportedContentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public SupportedContentListing getMessagingSupportedcontent(GetMessagingSupportedcontentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SupportedContentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SupportedContentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Supported Content profiles
   * Deprecated - use GET /api/v2/conversations/messaging/supportedcontent as replacement
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<SupportedContentListing> getMessagingSupportedcontent(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SupportedContentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SupportedContentListing> response = (ApiResponse<SupportedContentListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SupportedContentListing> response = (ApiResponse<SupportedContentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a supported content profile
   * Deprecated - use GET /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param supportedContentId Supported Content ID (required)
   * @return SupportedContent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public SupportedContent getMessagingSupportedcontentSupportedContentId(String supportedContentId) throws IOException, ApiException {
    return  getMessagingSupportedcontentSupportedContentId(createGetMessagingSupportedcontentSupportedContentIdRequest(supportedContentId));
  }

  /**
   * Get a supported content profile
   * Deprecated - use GET /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param supportedContentId Supported Content ID (required)
   * @return SupportedContent
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<SupportedContent> getMessagingSupportedcontentSupportedContentIdWithHttpInfo(String supportedContentId) throws IOException {
    return getMessagingSupportedcontentSupportedContentId(createGetMessagingSupportedcontentSupportedContentIdRequest(supportedContentId).withHttpInfo());
  }

  private GetMessagingSupportedcontentSupportedContentIdRequest createGetMessagingSupportedcontentSupportedContentIdRequest(String supportedContentId) {
    return GetMessagingSupportedcontentSupportedContentIdRequest.builder()
            .withSupportedContentId(supportedContentId)

            .build();
  }

  /**
   * Get a supported content profile
   * Deprecated - use GET /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param request The request object
   * @return SupportedContent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public SupportedContent getMessagingSupportedcontentSupportedContentId(GetMessagingSupportedcontentSupportedContentIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SupportedContent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SupportedContent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a supported content profile
   * Deprecated - use GET /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<SupportedContent> getMessagingSupportedcontentSupportedContentId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SupportedContent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)exception;
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
      ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a messaging setting
   * 
   * @param messageSettingId Message Settings ID (required)
   * @param body MessagingSetting (required)
   * @return MessagingSetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public MessagingSetting patchMessagingSetting(String messageSettingId, MessagingSettingRequest body) throws IOException, ApiException {
    return  patchMessagingSetting(createPatchMessagingSettingRequest(messageSettingId, body));
  }

  /**
   * Update a messaging setting
   * 
   * @param messageSettingId Message Settings ID (required)
   * @param body MessagingSetting (required)
   * @return MessagingSetting
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<MessagingSetting> patchMessagingSettingWithHttpInfo(String messageSettingId, MessagingSettingRequest body) throws IOException {
    return patchMessagingSetting(createPatchMessagingSettingRequest(messageSettingId, body).withHttpInfo());
  }

  private PatchMessagingSettingRequest createPatchMessagingSettingRequest(String messageSettingId, MessagingSettingRequest body) {
    return PatchMessagingSettingRequest.builder()
            .withMessageSettingId(messageSettingId)

            .withBody(body)

            .build();
  }

  /**
   * Update a messaging setting
   * 
   * @param request The request object
   * @return MessagingSetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public MessagingSetting patchMessagingSetting(PatchMessagingSettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingSetting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingSetting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a messaging setting
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<MessagingSetting> patchMessagingSetting(ApiRequest<MessagingSettingRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingSetting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)exception;
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
      ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a supported content profile
   * Deprecated - use PATCH /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param supportedContentId Supported Content ID (required)
   * @param body SupportedContent (required)
   * @return SupportedContent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public SupportedContent patchMessagingSupportedcontentSupportedContentId(String supportedContentId, SupportedContent body) throws IOException, ApiException {
    return  patchMessagingSupportedcontentSupportedContentId(createPatchMessagingSupportedcontentSupportedContentIdRequest(supportedContentId, body));
  }

  /**
   * Update a supported content profile
   * Deprecated - use PATCH /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param supportedContentId Supported Content ID (required)
   * @param body SupportedContent (required)
   * @return SupportedContent
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<SupportedContent> patchMessagingSupportedcontentSupportedContentIdWithHttpInfo(String supportedContentId, SupportedContent body) throws IOException {
    return patchMessagingSupportedcontentSupportedContentId(createPatchMessagingSupportedcontentSupportedContentIdRequest(supportedContentId, body).withHttpInfo());
  }

  private PatchMessagingSupportedcontentSupportedContentIdRequest createPatchMessagingSupportedcontentSupportedContentIdRequest(String supportedContentId, SupportedContent body) {
    return PatchMessagingSupportedcontentSupportedContentIdRequest.builder()
            .withSupportedContentId(supportedContentId)

            .withBody(body)

            .build();
  }

  /**
   * Update a supported content profile
   * Deprecated - use PATCH /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param request The request object
   * @return SupportedContent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public SupportedContent patchMessagingSupportedcontentSupportedContentId(PatchMessagingSupportedcontentSupportedContentIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SupportedContent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SupportedContent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a supported content profile
   * Deprecated - use PATCH /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<SupportedContent> patchMessagingSupportedcontentSupportedContentId(ApiRequest<SupportedContent> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SupportedContent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)exception;
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
      ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a messaging setting
   * 
   * @param body MessagingSetting (required)
   * @return MessagingSetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public MessagingSetting postMessagingSettings(MessagingSettingRequest body) throws IOException, ApiException {
    return  postMessagingSettings(createPostMessagingSettingsRequest(body));
  }

  /**
   * Create a messaging setting
   * 
   * @param body MessagingSetting (required)
   * @return MessagingSetting
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<MessagingSetting> postMessagingSettingsWithHttpInfo(MessagingSettingRequest body) throws IOException {
    return postMessagingSettings(createPostMessagingSettingsRequest(body).withHttpInfo());
  }

  private PostMessagingSettingsRequest createPostMessagingSettingsRequest(MessagingSettingRequest body) {
    return PostMessagingSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a messaging setting
   * 
   * @param request The request object
   * @return MessagingSetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public MessagingSetting postMessagingSettings(PostMessagingSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingSetting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingSetting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a messaging setting
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<MessagingSetting> postMessagingSettings(ApiRequest<MessagingSettingRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingSetting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)exception;
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
      ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Supported Content profile
   * Deprecated - use POST /api/v2/conversations/messaging/supportedcontent as replacement
   * @param body SupportedContent (required)
   * @return SupportedContent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public SupportedContent postMessagingSupportedcontent(SupportedContent body) throws IOException, ApiException {
    return  postMessagingSupportedcontent(createPostMessagingSupportedcontentRequest(body));
  }

  /**
   * Create a Supported Content profile
   * Deprecated - use POST /api/v2/conversations/messaging/supportedcontent as replacement
   * @param body SupportedContent (required)
   * @return SupportedContent
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<SupportedContent> postMessagingSupportedcontentWithHttpInfo(SupportedContent body) throws IOException {
    return postMessagingSupportedcontent(createPostMessagingSupportedcontentRequest(body).withHttpInfo());
  }

  private PostMessagingSupportedcontentRequest createPostMessagingSupportedcontentRequest(SupportedContent body) {
    return PostMessagingSupportedcontentRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a Supported Content profile
   * Deprecated - use POST /api/v2/conversations/messaging/supportedcontent as replacement
   * @param request The request object
   * @return SupportedContent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public SupportedContent postMessagingSupportedcontent(PostMessagingSupportedcontentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SupportedContent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SupportedContent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Supported Content profile
   * Deprecated - use POST /api/v2/conversations/messaging/supportedcontent as replacement
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<SupportedContent> postMessagingSupportedcontent(ApiRequest<SupportedContent> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SupportedContent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)exception;
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
      ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Set the organization's default settings that may be applied to an integration when it is created.
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param body Messaging Setting ID (required)
   * @return MessagingSetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public MessagingSetting putMessagingSettingsDefault(MessagingSettingDefaultRequest body) throws IOException, ApiException {
    return  putMessagingSettingsDefault(createPutMessagingSettingsDefaultRequest(body));
  }

  /**
   * Set the organization's default settings that may be applied to an integration when it is created.
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param body Messaging Setting ID (required)
   * @return MessagingSetting
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<MessagingSetting> putMessagingSettingsDefaultWithHttpInfo(MessagingSettingDefaultRequest body) throws IOException {
    return putMessagingSettingsDefault(createPutMessagingSettingsDefaultRequest(body).withHttpInfo());
  }

  private PutMessagingSettingsDefaultRequest createPutMessagingSettingsDefaultRequest(MessagingSettingDefaultRequest body) {
    return PutMessagingSettingsDefaultRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Set the organization's default settings that may be applied to an integration when it is created.
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param request The request object
   * @return MessagingSetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public MessagingSetting putMessagingSettingsDefault(PutMessagingSettingsDefaultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingSetting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingSetting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Set the organization's default settings that may be applied to an integration when it is created.
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<MessagingSetting> putMessagingSettingsDefault(ApiRequest<MessagingSettingDefaultRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingSetting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)exception;
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
      ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
