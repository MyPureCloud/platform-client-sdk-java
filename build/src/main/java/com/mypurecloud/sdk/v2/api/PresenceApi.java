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
import com.mypurecloud.sdk.v2.model.OrganizationPresence;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPresence;
import com.mypurecloud.sdk.v2.model.UserPresence;
import com.mypurecloud.sdk.v2.model.PresenceExpand;


import com.mypurecloud.sdk.v2.api.request.DeletePresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresencedefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSystempresencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresencesMicrosoftteamsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresencesPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresencesZoomphoneRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserPresencesPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.PostPresencedefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.PutPresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.PutUsersPresencesBulkRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PresenceApi {
  private final ApiClient pcapiClient;

  public PresenceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PresenceApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deletePresencedefinition(String presenceId) throws IOException, ApiException {
     deletePresencedefinition(createDeletePresencedefinitionRequest(presenceId));
  }

  /**
   * Delete a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deletePresencedefinitionWithHttpInfo(String presenceId) throws IOException {
    return deletePresencedefinition(createDeletePresencedefinitionRequest(presenceId).withHttpInfo());
  }

  private DeletePresencedefinitionRequest createDeletePresencedefinitionRequest(String presenceId) {
    return DeletePresencedefinitionRequest.builder()
            .withPresenceId(presenceId)
    
            .build();
  }

  /**
   * Delete a Presence Definition
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deletePresencedefinition(DeletePresencedefinitionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Presence Definition
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deletePresencedefinition(ApiRequest<Void> request) throws IOException {
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
   * Get a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @param localeCode The locale code to fetch for the presence definition. Use ALL to fetch everything. (optional)
   * @return OrganizationPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationPresence getPresencedefinition(String presenceId, String localeCode) throws IOException, ApiException {
    return  getPresencedefinition(createGetPresencedefinitionRequest(presenceId, localeCode));
  }

  /**
   * Get a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @param localeCode The locale code to fetch for the presence definition. Use ALL to fetch everything. (optional)
   * @return OrganizationPresence
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationPresence> getPresencedefinitionWithHttpInfo(String presenceId, String localeCode) throws IOException {
    return getPresencedefinition(createGetPresencedefinitionRequest(presenceId, localeCode).withHttpInfo());
  }

  private GetPresencedefinitionRequest createGetPresencedefinitionRequest(String presenceId, String localeCode) {
    return GetPresencedefinitionRequest.builder()
            .withPresenceId(presenceId)
    
            .withLocaleCode(localeCode)
    
            .build();
  }

  /**
   * Get a Presence Definition
   * 
   * @param request The request object
   * @return OrganizationPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationPresence getPresencedefinition(GetPresencedefinitionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationPresence> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationPresence>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Presence Definition
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationPresence> getPresencedefinition(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationPresence>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationPresence> response = (ApiResponse<OrganizationPresence>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationPresence> response = (ApiResponse<OrganizationPresence>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get an Organization&#39;s list of Presence Definitions
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param deleted Deleted query can be TRUE, FALSE or ALL (optional, default to false)
   * @param localeCode The locale code to fetch for each presence definition. Use ALL to fetch everything. (optional)
   * @return OrganizationPresenceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationPresenceEntityListing getPresencedefinitions(Integer pageNumber, Integer pageSize, String deleted, String localeCode) throws IOException, ApiException {
    return  getPresencedefinitions(createGetPresencedefinitionsRequest(pageNumber, pageSize, deleted, localeCode));
  }

  /**
   * Get an Organization&#39;s list of Presence Definitions
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param deleted Deleted query can be TRUE, FALSE or ALL (optional, default to false)
   * @param localeCode The locale code to fetch for each presence definition. Use ALL to fetch everything. (optional)
   * @return OrganizationPresenceEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationPresenceEntityListing> getPresencedefinitionsWithHttpInfo(Integer pageNumber, Integer pageSize, String deleted, String localeCode) throws IOException {
    return getPresencedefinitions(createGetPresencedefinitionsRequest(pageNumber, pageSize, deleted, localeCode).withHttpInfo());
  }

  private GetPresencedefinitionsRequest createGetPresencedefinitionsRequest(Integer pageNumber, Integer pageSize, String deleted, String localeCode) {
    return GetPresencedefinitionsRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withDeleted(deleted)
    
            .withLocaleCode(localeCode)
    
            .build();
  }

  /**
   * Get an Organization&#39;s list of Presence Definitions
   * 
   * @param request The request object
   * @return OrganizationPresenceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationPresenceEntityListing getPresencedefinitions(GetPresencedefinitionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationPresenceEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationPresenceEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an Organization&#39;s list of Presence Definitions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationPresenceEntityListing> getPresencedefinitions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationPresenceEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationPresenceEntityListing> response = (ApiResponse<OrganizationPresenceEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationPresenceEntityListing> response = (ApiResponse<OrganizationPresenceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of SystemPresences
   * 
   * @return List<SystemPresence>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<SystemPresence> getSystempresences() throws IOException, ApiException {
    return  getSystempresences(createGetSystempresencesRequest());
  }

  /**
   * Get the list of SystemPresences
   * 
   * @return List<SystemPresence>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<SystemPresence>> getSystempresencesWithHttpInfo() throws IOException {
    return getSystempresences(createGetSystempresencesRequest().withHttpInfo());
  }

  private GetSystempresencesRequest createGetSystempresencesRequest() {
    return GetSystempresencesRequest.builder()
            .build();
  }

  /**
   * Get the list of SystemPresences
   * 
   * @param request The request object
   * @return List<SystemPresence>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<SystemPresence> getSystempresences(GetSystempresencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<SystemPresence>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<SystemPresence>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of SystemPresences
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<SystemPresence>> getSystempresences(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<SystemPresence>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<SystemPresence>> response = (ApiResponse<List<SystemPresence>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<SystemPresence>> response = (ApiResponse<List<SystemPresence>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a user&#39;s Presence
   * Get a user&#39;s presence for the specified source that is not specifically listed.  Used to support custom presence sources.
   * @param userId user Id (required)
   * @param sourceId Presence source ID (required)
   * @return UserPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresence getUserPresence(String userId, String sourceId) throws IOException, ApiException {
    return  getUserPresence(createGetUserPresenceRequest(userId, sourceId));
  }

  /**
   * Get a user&#39;s Presence
   * Get a user&#39;s presence for the specified source that is not specifically listed.  Used to support custom presence sources.
   * @param userId user Id (required)
   * @param sourceId Presence source ID (required)
   * @return UserPresence
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresence> getUserPresenceWithHttpInfo(String userId, String sourceId) throws IOException {
    return getUserPresence(createGetUserPresenceRequest(userId, sourceId).withHttpInfo());
  }

  private GetUserPresenceRequest createGetUserPresenceRequest(String userId, String sourceId) {
    return GetUserPresenceRequest.builder()
            .withUserId(userId)
    
            .withSourceId(sourceId)
    
            .build();
  }

  /**
   * Get a user&#39;s Presence
   * Get a user&#39;s presence for the specified source that is not specifically listed.  Used to support custom presence sources.
   * @param request The request object
   * @return UserPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresence getUserPresence(GetUserPresenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserPresence> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserPresence>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user&#39;s Presence
   * Get a user&#39;s presence for the specified source that is not specifically listed.  Used to support custom presence sources.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresence> getUserPresence(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserPresence>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)exception;
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
      ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a user&#39;s Microsoft Teams presence.
   * Gets the presence for a Microsoft Teams user.  This will return the Microsoft Teams presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.
   * @param userId user Id (required)
   * @return PresenceExpand
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PresenceExpand getUserPresencesMicrosoftteams(String userId) throws IOException, ApiException {
    return  getUserPresencesMicrosoftteams(createGetUserPresencesMicrosoftteamsRequest(userId));
  }

  /**
   * Get a user&#39;s Microsoft Teams presence.
   * Gets the presence for a Microsoft Teams user.  This will return the Microsoft Teams presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.
   * @param userId user Id (required)
   * @return PresenceExpand
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PresenceExpand> getUserPresencesMicrosoftteamsWithHttpInfo(String userId) throws IOException {
    return getUserPresencesMicrosoftteams(createGetUserPresencesMicrosoftteamsRequest(userId).withHttpInfo());
  }

  private GetUserPresencesMicrosoftteamsRequest createGetUserPresencesMicrosoftteamsRequest(String userId) {
    return GetUserPresencesMicrosoftteamsRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get a user&#39;s Microsoft Teams presence.
   * Gets the presence for a Microsoft Teams user.  This will return the Microsoft Teams presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.
   * @param request The request object
   * @return PresenceExpand
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PresenceExpand getUserPresencesMicrosoftteams(GetUserPresencesMicrosoftteamsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PresenceExpand> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PresenceExpand>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user&#39;s Microsoft Teams presence.
   * Gets the presence for a Microsoft Teams user.  This will return the Microsoft Teams presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PresenceExpand> getUserPresencesMicrosoftteams(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PresenceExpand>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PresenceExpand> response = (ApiResponse<PresenceExpand>)(ApiResponse<?>)exception;
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
      ApiResponse<PresenceExpand> response = (ApiResponse<PresenceExpand>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a user&#39;s Genesys Cloud presence.
   * Get the default Genesys Cloud user presence source PURECLOUD
   * @param userId user Id (required)
   * @return UserPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresence getUserPresencesPurecloud(String userId) throws IOException, ApiException {
    return  getUserPresencesPurecloud(createGetUserPresencesPurecloudRequest(userId));
  }

  /**
   * Get a user&#39;s Genesys Cloud presence.
   * Get the default Genesys Cloud user presence source PURECLOUD
   * @param userId user Id (required)
   * @return UserPresence
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresence> getUserPresencesPurecloudWithHttpInfo(String userId) throws IOException {
    return getUserPresencesPurecloud(createGetUserPresencesPurecloudRequest(userId).withHttpInfo());
  }

  private GetUserPresencesPurecloudRequest createGetUserPresencesPurecloudRequest(String userId) {
    return GetUserPresencesPurecloudRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get a user&#39;s Genesys Cloud presence.
   * Get the default Genesys Cloud user presence source PURECLOUD
   * @param request The request object
   * @return UserPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresence getUserPresencesPurecloud(GetUserPresencesPurecloudRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserPresence> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserPresence>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user&#39;s Genesys Cloud presence.
   * Get the default Genesys Cloud user presence source PURECLOUD
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresence> getUserPresencesPurecloud(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserPresence>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)exception;
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
      ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a user&#39;s Zoom Phone presence.
   * Gets the presence for a Zoom user.  This will return the Zoom Phone presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.
   * @param userId user Id (required)
   * @return PresenceExpand
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PresenceExpand getUserPresencesZoomphone(String userId) throws IOException, ApiException {
    return  getUserPresencesZoomphone(createGetUserPresencesZoomphoneRequest(userId));
  }

  /**
   * Get a user&#39;s Zoom Phone presence.
   * Gets the presence for a Zoom user.  This will return the Zoom Phone presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.
   * @param userId user Id (required)
   * @return PresenceExpand
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PresenceExpand> getUserPresencesZoomphoneWithHttpInfo(String userId) throws IOException {
    return getUserPresencesZoomphone(createGetUserPresencesZoomphoneRequest(userId).withHttpInfo());
  }

  private GetUserPresencesZoomphoneRequest createGetUserPresencesZoomphoneRequest(String userId) {
    return GetUserPresencesZoomphoneRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get a user&#39;s Zoom Phone presence.
   * Gets the presence for a Zoom user.  This will return the Zoom Phone presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.
   * @param request The request object
   * @return PresenceExpand
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PresenceExpand getUserPresencesZoomphone(GetUserPresencesZoomphoneRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PresenceExpand> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PresenceExpand>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user&#39;s Zoom Phone presence.
   * Gets the presence for a Zoom user.  This will return the Zoom Phone presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PresenceExpand> getUserPresencesZoomphone(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PresenceExpand>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PresenceExpand> response = (ApiResponse<PresenceExpand>)(ApiResponse<?>)exception;
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
      ApiResponse<PresenceExpand> response = (ApiResponse<PresenceExpand>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch a user&#39;s Presence
   * Patch a user&#39;s presence for the specified source that is not specifically listed. The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param userId user Id (required)
   * @param sourceId Presence source ID (required)
   * @param body User presence (required)
   * @return UserPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresence patchUserPresence(String userId, String sourceId, UserPresence body) throws IOException, ApiException {
    return  patchUserPresence(createPatchUserPresenceRequest(userId, sourceId, body));
  }

  /**
   * Patch a user&#39;s Presence
   * Patch a user&#39;s presence for the specified source that is not specifically listed. The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param userId user Id (required)
   * @param sourceId Presence source ID (required)
   * @param body User presence (required)
   * @return UserPresence
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresence> patchUserPresenceWithHttpInfo(String userId, String sourceId, UserPresence body) throws IOException {
    return patchUserPresence(createPatchUserPresenceRequest(userId, sourceId, body).withHttpInfo());
  }

  private PatchUserPresenceRequest createPatchUserPresenceRequest(String userId, String sourceId, UserPresence body) {
    return PatchUserPresenceRequest.builder()
            .withUserId(userId)
    
            .withSourceId(sourceId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Patch a user&#39;s Presence
   * Patch a user&#39;s presence for the specified source that is not specifically listed. The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param request The request object
   * @return UserPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresence patchUserPresence(PatchUserPresenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserPresence> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserPresence>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch a user&#39;s Presence
   * Patch a user&#39;s presence for the specified source that is not specifically listed. The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresence> patchUserPresence(ApiRequest<UserPresence> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserPresence>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)exception;
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
      ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch a Genesys Cloud user&#39;s presence
   * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the PURECLOUD source as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param userId user Id (required)
   * @param body User presence (required)
   * @return UserPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresence patchUserPresencesPurecloud(String userId, UserPresence body) throws IOException, ApiException {
    return  patchUserPresencesPurecloud(createPatchUserPresencesPurecloudRequest(userId, body));
  }

  /**
   * Patch a Genesys Cloud user&#39;s presence
   * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the PURECLOUD source as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param userId user Id (required)
   * @param body User presence (required)
   * @return UserPresence
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresence> patchUserPresencesPurecloudWithHttpInfo(String userId, UserPresence body) throws IOException {
    return patchUserPresencesPurecloud(createPatchUserPresencesPurecloudRequest(userId, body).withHttpInfo());
  }

  private PatchUserPresencesPurecloudRequest createPatchUserPresencesPurecloudRequest(String userId, UserPresence body) {
    return PatchUserPresencesPurecloudRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Patch a Genesys Cloud user&#39;s presence
   * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the PURECLOUD source as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param request The request object
   * @return UserPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresence patchUserPresencesPurecloud(PatchUserPresencesPurecloudRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserPresence> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserPresence>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch a Genesys Cloud user&#39;s presence
   * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the PURECLOUD source as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresence> patchUserPresencesPurecloud(ApiRequest<UserPresence> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserPresence>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)exception;
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
      ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a Presence Definition
   * 
   * @param body The Presence Definition to create (required)
   * @return OrganizationPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationPresence postPresencedefinitions(OrganizationPresence body) throws IOException, ApiException {
    return  postPresencedefinitions(createPostPresencedefinitionsRequest(body));
  }

  /**
   * Create a Presence Definition
   * 
   * @param body The Presence Definition to create (required)
   * @return OrganizationPresence
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationPresence> postPresencedefinitionsWithHttpInfo(OrganizationPresence body) throws IOException {
    return postPresencedefinitions(createPostPresencedefinitionsRequest(body).withHttpInfo());
  }

  private PostPresencedefinitionsRequest createPostPresencedefinitionsRequest(OrganizationPresence body) {
    return PostPresencedefinitionsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a Presence Definition
   * 
   * @param request The request object
   * @return OrganizationPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationPresence postPresencedefinitions(PostPresencedefinitionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationPresence> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationPresence>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Presence Definition
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationPresence> postPresencedefinitions(ApiRequest<OrganizationPresence> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationPresence>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationPresence> response = (ApiResponse<OrganizationPresence>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationPresence> response = (ApiResponse<OrganizationPresence>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @param body The OrganizationPresence to update (required)
   * @return OrganizationPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationPresence putPresencedefinition(String presenceId, OrganizationPresence body) throws IOException, ApiException {
    return  putPresencedefinition(createPutPresencedefinitionRequest(presenceId, body));
  }

  /**
   * Update a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @param body The OrganizationPresence to update (required)
   * @return OrganizationPresence
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationPresence> putPresencedefinitionWithHttpInfo(String presenceId, OrganizationPresence body) throws IOException {
    return putPresencedefinition(createPutPresencedefinitionRequest(presenceId, body).withHttpInfo());
  }

  private PutPresencedefinitionRequest createPutPresencedefinitionRequest(String presenceId, OrganizationPresence body) {
    return PutPresencedefinitionRequest.builder()
            .withPresenceId(presenceId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a Presence Definition
   * 
   * @param request The request object
   * @return OrganizationPresence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationPresence putPresencedefinition(PutPresencedefinitionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationPresence> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationPresence>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a Presence Definition
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationPresence> putPresencedefinition(ApiRequest<OrganizationPresence> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationPresence>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationPresence> response = (ApiResponse<OrganizationPresence>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationPresence> response = (ApiResponse<OrganizationPresence>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update bulk user Presences
   * 
   * @param body List of User presences (required)
   * @return List<UserPresence>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<UserPresence> putUsersPresencesBulk(List<UserPresence> body) throws IOException, ApiException {
    return  putUsersPresencesBulk(createPutUsersPresencesBulkRequest(body));
  }

  /**
   * Update bulk user Presences
   * 
   * @param body List of User presences (required)
   * @return List<UserPresence>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<UserPresence>> putUsersPresencesBulkWithHttpInfo(List<UserPresence> body) throws IOException {
    return putUsersPresencesBulk(createPutUsersPresencesBulkRequest(body).withHttpInfo());
  }

  private PutUsersPresencesBulkRequest createPutUsersPresencesBulkRequest(List<UserPresence> body) {
    return PutUsersPresencesBulkRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update bulk user Presences
   * 
   * @param request The request object
   * @return List<UserPresence>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<UserPresence> putUsersPresencesBulk(PutUsersPresencesBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<UserPresence>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<UserPresence>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update bulk user Presences
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<UserPresence>> putUsersPresencesBulk(ApiRequest<List<UserPresence>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<UserPresence>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<UserPresence>> response = (ApiResponse<List<UserPresence>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<UserPresence>> response = (ApiResponse<List<UserPresence>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
