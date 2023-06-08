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
import com.mypurecloud.sdk.v2.model.OrganizationPresenceDefinition;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceDefinitionEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceEntityListing;
import com.mypurecloud.sdk.v2.model.PresenceSettings;
import com.mypurecloud.sdk.v2.model.Source;
import com.mypurecloud.sdk.v2.model.SourceEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPresence;
import com.mypurecloud.sdk.v2.model.UserPresence;
import com.mypurecloud.sdk.v2.model.UserPrimarySource;


import com.mypurecloud.sdk.v2.api.request.DeletePresenceDefinition0Request;
import com.mypurecloud.sdk.v2.api.request.DeletePresenceSourceRequest;
import com.mypurecloud.sdk.v2.api.request.DeletePresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresenceDefinition0Request;
import com.mypurecloud.sdk.v2.api.request.GetPresenceDefinitions0Request;
import com.mypurecloud.sdk.v2.api.request.GetPresenceSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresenceSourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresenceSourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresenceUserPrimarysourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresencedefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSystempresencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresencesPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserPresencesPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.PostPresenceDefinitions0Request;
import com.mypurecloud.sdk.v2.api.request.PostPresenceSourcesRequest;
import com.mypurecloud.sdk.v2.api.request.PostPresencedefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.PutPresenceDefinition0Request;
import com.mypurecloud.sdk.v2.api.request.PutPresenceSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutPresenceSourceRequest;
import com.mypurecloud.sdk.v2.api.request.PutPresenceUserPrimarysourceRequest;
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
   * @param definitionId Presence Definition ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public void deletePresenceDefinition0(String definitionId) throws IOException, ApiException {
     deletePresenceDefinition0(createDeletePresenceDefinition0Request(definitionId));
  }

  /**
   * Delete a Presence Definition
   * 
   * @param definitionId Presence Definition ID (required)
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<Void> deletePresenceDefinition0WithHttpInfo(String definitionId) throws IOException {
    return deletePresenceDefinition0(createDeletePresenceDefinition0Request(definitionId).withHttpInfo());
  }

  private DeletePresenceDefinition0Request createDeletePresenceDefinition0Request(String definitionId) {
    return DeletePresenceDefinition0Request.builder()
            .withDefinitionId(definitionId)

            .build();
  }

  /**
   * Delete a Presence Definition
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public void deletePresenceDefinition0(DeletePresenceDefinition0Request request) throws IOException, ApiException {
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
	 * Preview Endpoint
   */
  public ApiResponse<Void> deletePresenceDefinition0(ApiRequest<Void> request) throws IOException {
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
   * Delete a Presence Source
   * 
   * @param sourceId Presence Source ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deletePresenceSource(String sourceId) throws IOException, ApiException {
     deletePresenceSource(createDeletePresenceSourceRequest(sourceId));
  }

  /**
   * Delete a Presence Source
   * 
   * @param sourceId Presence Source ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deletePresenceSourceWithHttpInfo(String sourceId) throws IOException {
    return deletePresenceSource(createDeletePresenceSourceRequest(sourceId).withHttpInfo());
  }

  private DeletePresenceSourceRequest createDeletePresenceSourceRequest(String sourceId) {
    return DeletePresenceSourceRequest.builder()
            .withSourceId(sourceId)

            .build();
  }

  /**
   * Delete a Presence Source
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deletePresenceSource(DeletePresenceSourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Presence Source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deletePresenceSource(ApiRequest<Void> request) throws IOException {
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
   * @param definitionId Presence Definition ID (required)
   * @return OrganizationPresenceDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OrganizationPresenceDefinition getPresenceDefinition0(String definitionId) throws IOException, ApiException {
    return  getPresenceDefinition0(createGetPresenceDefinition0Request(definitionId));
  }

  /**
   * Get a Presence Definition
   * 
   * @param definitionId Presence Definition ID (required)
   * @return OrganizationPresenceDefinition
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<OrganizationPresenceDefinition> getPresenceDefinition0WithHttpInfo(String definitionId) throws IOException {
    return getPresenceDefinition0(createGetPresenceDefinition0Request(definitionId).withHttpInfo());
  }

  private GetPresenceDefinition0Request createGetPresenceDefinition0Request(String definitionId) {
    return GetPresenceDefinition0Request.builder()
            .withDefinitionId(definitionId)

            .build();
  }

  /**
   * Get a Presence Definition
   * 
   * @param request The request object
   * @return OrganizationPresenceDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OrganizationPresenceDefinition getPresenceDefinition0(GetPresenceDefinition0Request request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationPresenceDefinition> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationPresenceDefinition>() {});
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
	 * Preview Endpoint
   */
  public ApiResponse<OrganizationPresenceDefinition> getPresenceDefinition0(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationPresenceDefinition>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationPresenceDefinition> response = (ApiResponse<OrganizationPresenceDefinition>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationPresenceDefinition> response = (ApiResponse<OrganizationPresenceDefinition>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Presence Definitions
   * 
   * @param deactivated Deactivated query can be TRUE or FALSE (optional, default to false)
   * @param divisionId One or more division IDs. If nothing is provided, the definitions associated withthe list of divisions that the user has access to will be returned. (optional)
   * @return OrganizationPresenceDefinitionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OrganizationPresenceDefinitionEntityListing getPresenceDefinitions0(String deactivated, List<String> divisionId) throws IOException, ApiException {
    return  getPresenceDefinitions0(createGetPresenceDefinitions0Request(deactivated, divisionId));
  }

  /**
   * Get a list of Presence Definitions
   * 
   * @param deactivated Deactivated query can be TRUE or FALSE (optional, default to false)
   * @param divisionId One or more division IDs. If nothing is provided, the definitions associated withthe list of divisions that the user has access to will be returned. (optional)
   * @return OrganizationPresenceDefinitionEntityListing
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<OrganizationPresenceDefinitionEntityListing> getPresenceDefinitions0WithHttpInfo(String deactivated, List<String> divisionId) throws IOException {
    return getPresenceDefinitions0(createGetPresenceDefinitions0Request(deactivated, divisionId).withHttpInfo());
  }

  private GetPresenceDefinitions0Request createGetPresenceDefinitions0Request(String deactivated, List<String> divisionId) {
    return GetPresenceDefinitions0Request.builder()
            .withDeactivated(deactivated)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a list of Presence Definitions
   * 
   * @param request The request object
   * @return OrganizationPresenceDefinitionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OrganizationPresenceDefinitionEntityListing getPresenceDefinitions0(GetPresenceDefinitions0Request request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationPresenceDefinitionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationPresenceDefinitionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Presence Definitions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<OrganizationPresenceDefinitionEntityListing> getPresenceDefinitions0(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationPresenceDefinitionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationPresenceDefinitionEntityListing> response = (ApiResponse<OrganizationPresenceDefinitionEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationPresenceDefinitionEntityListing> response = (ApiResponse<OrganizationPresenceDefinitionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the presence settings
   * 
   * @return PresenceSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PresenceSettings getPresenceSettings() throws IOException, ApiException {
    return  getPresenceSettings(createGetPresenceSettingsRequest());
  }

  /**
   * Get the presence settings
   * 
   * @return PresenceSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PresenceSettings> getPresenceSettingsWithHttpInfo() throws IOException {
    return getPresenceSettings(createGetPresenceSettingsRequest().withHttpInfo());
  }

  private GetPresenceSettingsRequest createGetPresenceSettingsRequest() {
    return GetPresenceSettingsRequest.builder()
            .build();
  }

  /**
   * Get the presence settings
   * 
   * @param request The request object
   * @return PresenceSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PresenceSettings getPresenceSettings(GetPresenceSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PresenceSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PresenceSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the presence settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PresenceSettings> getPresenceSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PresenceSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PresenceSettings> response = (ApiResponse<PresenceSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<PresenceSettings> response = (ApiResponse<PresenceSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Presence Source
   * 
   * @param sourceId Presence Source ID (required)
   * @return Source
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Source getPresenceSource(String sourceId) throws IOException, ApiException {
    return  getPresenceSource(createGetPresenceSourceRequest(sourceId));
  }

  /**
   * Get a Presence Source
   * 
   * @param sourceId Presence Source ID (required)
   * @return Source
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Source> getPresenceSourceWithHttpInfo(String sourceId) throws IOException {
    return getPresenceSource(createGetPresenceSourceRequest(sourceId).withHttpInfo());
  }

  private GetPresenceSourceRequest createGetPresenceSourceRequest(String sourceId) {
    return GetPresenceSourceRequest.builder()
            .withSourceId(sourceId)

            .build();
  }

  /**
   * Get a Presence Source
   * 
   * @param request The request object
   * @return Source
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Source getPresenceSource(GetPresenceSourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Source> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Source>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Presence Source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Source> getPresenceSource(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Source>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Source> response = (ApiResponse<Source>)(ApiResponse<?>)exception;
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
      ApiResponse<Source> response = (ApiResponse<Source>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Presence Sources
   * 
   * @param deactivated Deactivated query can be TRUE or FALSE (optional, default to false)
   * @return SourceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SourceEntityListing getPresenceSources(String deactivated) throws IOException, ApiException {
    return  getPresenceSources(createGetPresenceSourcesRequest(deactivated));
  }

  /**
   * Get a list of Presence Sources
   * 
   * @param deactivated Deactivated query can be TRUE or FALSE (optional, default to false)
   * @return SourceEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SourceEntityListing> getPresenceSourcesWithHttpInfo(String deactivated) throws IOException {
    return getPresenceSources(createGetPresenceSourcesRequest(deactivated).withHttpInfo());
  }

  private GetPresenceSourcesRequest createGetPresenceSourcesRequest(String deactivated) {
    return GetPresenceSourcesRequest.builder()
            .withDeactivated(deactivated)

            .build();
  }

  /**
   * Get a list of Presence Sources
   * 
   * @param request The request object
   * @return SourceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SourceEntityListing getPresenceSources(GetPresenceSourcesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SourceEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SourceEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Presence Sources
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SourceEntityListing> getPresenceSources(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SourceEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SourceEntityListing> response = (ApiResponse<SourceEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SourceEntityListing> response = (ApiResponse<SourceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a user's Primary Presence Source
   * 
   * @param userId user ID (required)
   * @return UserPrimarySource
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPrimarySource getPresenceUserPrimarysource(String userId) throws IOException, ApiException {
    return  getPresenceUserPrimarysource(createGetPresenceUserPrimarysourceRequest(userId));
  }

  /**
   * Get a user's Primary Presence Source
   * 
   * @param userId user ID (required)
   * @return UserPrimarySource
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPrimarySource> getPresenceUserPrimarysourceWithHttpInfo(String userId) throws IOException {
    return getPresenceUserPrimarysource(createGetPresenceUserPrimarysourceRequest(userId).withHttpInfo());
  }

  private GetPresenceUserPrimarysourceRequest createGetPresenceUserPrimarysourceRequest(String userId) {
    return GetPresenceUserPrimarysourceRequest.builder()
            .withUserId(userId)

            .build();
  }

  /**
   * Get a user's Primary Presence Source
   * 
   * @param request The request object
   * @return UserPrimarySource
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPrimarySource getPresenceUserPrimarysource(GetPresenceUserPrimarysourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserPrimarySource> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserPrimarySource>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user's Primary Presence Source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPrimarySource> getPresenceUserPrimarysource(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserPrimarySource>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserPrimarySource> response = (ApiResponse<UserPrimarySource>)(ApiResponse<?>)exception;
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
      ApiResponse<UserPrimarySource> response = (ApiResponse<UserPrimarySource>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an Organization's list of Presence Definitions
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
   * Get an Organization's list of Presence Definitions
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
   * Get an Organization's list of Presence Definitions
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
   * Get an Organization's list of Presence Definitions
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
   * Get a user's Presence
   * Get a user's presence for the specified source that is not specifically listed.  Used to support custom presence sources. This endpoint does not support registered presence sources.
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
   * Get a user's Presence
   * Get a user's presence for the specified source that is not specifically listed.  Used to support custom presence sources. This endpoint does not support registered presence sources.
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
   * Get a user's Presence
   * Get a user's presence for the specified source that is not specifically listed.  Used to support custom presence sources. This endpoint does not support registered presence sources.
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
   * Get a user's Presence
   * Get a user's presence for the specified source that is not specifically listed.  Used to support custom presence sources. This endpoint does not support registered presence sources.
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
   * Get a user's Genesys Cloud presence.
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
   * Get a user's Genesys Cloud presence.
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
   * Get a user's Genesys Cloud presence.
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
   * Get a user's Genesys Cloud presence.
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
   * Patch a user's Presence
   * Patch a user's presence for the specified source that is not specifically listed. This endpoint does not support registered presence sources. The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the 'source' defined in the path as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
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
   * Patch a user's Presence
   * Patch a user's presence for the specified source that is not specifically listed. This endpoint does not support registered presence sources. The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the 'source' defined in the path as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
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
   * Patch a user's Presence
   * Patch a user's presence for the specified source that is not specifically listed. This endpoint does not support registered presence sources. The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the 'source' defined in the path as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
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
   * Patch a user's Presence
   * Patch a user's presence for the specified source that is not specifically listed. This endpoint does not support registered presence sources. The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the 'source' defined in the path as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
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
   * Patch a Genesys Cloud user's presence
   * The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the PURECLOUD source as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
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
   * Patch a Genesys Cloud user's presence
   * The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the PURECLOUD source as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
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
   * Patch a Genesys Cloud user's presence
   * The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the PURECLOUD source as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
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
   * Patch a Genesys Cloud user's presence
   * The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the PURECLOUD source as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
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
   * @return OrganizationPresenceDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OrganizationPresenceDefinition postPresenceDefinitions0(OrganizationPresenceDefinition body) throws IOException, ApiException {
    return  postPresenceDefinitions0(createPostPresenceDefinitions0Request(body));
  }

  /**
   * Create a Presence Definition
   * 
   * @param body The Presence Definition to create (required)
   * @return OrganizationPresenceDefinition
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<OrganizationPresenceDefinition> postPresenceDefinitions0WithHttpInfo(OrganizationPresenceDefinition body) throws IOException {
    return postPresenceDefinitions0(createPostPresenceDefinitions0Request(body).withHttpInfo());
  }

  private PostPresenceDefinitions0Request createPostPresenceDefinitions0Request(OrganizationPresenceDefinition body) {
    return PostPresenceDefinitions0Request.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a Presence Definition
   * 
   * @param request The request object
   * @return OrganizationPresenceDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OrganizationPresenceDefinition postPresenceDefinitions0(PostPresenceDefinitions0Request request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationPresenceDefinition> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationPresenceDefinition>() {});
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
	 * Preview Endpoint
   */
  public ApiResponse<OrganizationPresenceDefinition> postPresenceDefinitions0(ApiRequest<OrganizationPresenceDefinition> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationPresenceDefinition>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationPresenceDefinition> response = (ApiResponse<OrganizationPresenceDefinition>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationPresenceDefinition> response = (ApiResponse<OrganizationPresenceDefinition>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Presence Source
   * 
   * @param body The Presence Source to create (required)
   * @return Source
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Source postPresenceSources(Source body) throws IOException, ApiException {
    return  postPresenceSources(createPostPresenceSourcesRequest(body));
  }

  /**
   * Create a Presence Source
   * 
   * @param body The Presence Source to create (required)
   * @return Source
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Source> postPresenceSourcesWithHttpInfo(Source body) throws IOException {
    return postPresenceSources(createPostPresenceSourcesRequest(body).withHttpInfo());
  }

  private PostPresenceSourcesRequest createPostPresenceSourcesRequest(Source body) {
    return PostPresenceSourcesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a Presence Source
   * 
   * @param request The request object
   * @return Source
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Source postPresenceSources(PostPresenceSourcesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Source> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Source>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Presence Source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Source> postPresenceSources(ApiRequest<Source> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Source>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Source> response = (ApiResponse<Source>)(ApiResponse<?>)exception;
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
      ApiResponse<Source> response = (ApiResponse<Source>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param definitionId Presence Definition ID (required)
   * @param body The updated Presence Definition (required)
   * @return OrganizationPresenceDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OrganizationPresenceDefinition putPresenceDefinition0(String definitionId, OrganizationPresenceDefinition body) throws IOException, ApiException {
    return  putPresenceDefinition0(createPutPresenceDefinition0Request(definitionId, body));
  }

  /**
   * Update a Presence Definition
   * 
   * @param definitionId Presence Definition ID (required)
   * @param body The updated Presence Definition (required)
   * @return OrganizationPresenceDefinition
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<OrganizationPresenceDefinition> putPresenceDefinition0WithHttpInfo(String definitionId, OrganizationPresenceDefinition body) throws IOException {
    return putPresenceDefinition0(createPutPresenceDefinition0Request(definitionId, body).withHttpInfo());
  }

  private PutPresenceDefinition0Request createPutPresenceDefinition0Request(String definitionId, OrganizationPresenceDefinition body) {
    return PutPresenceDefinition0Request.builder()
            .withDefinitionId(definitionId)

            .withBody(body)

            .build();
  }

  /**
   * Update a Presence Definition
   * 
   * @param request The request object
   * @return OrganizationPresenceDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OrganizationPresenceDefinition putPresenceDefinition0(PutPresenceDefinition0Request request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationPresenceDefinition> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationPresenceDefinition>() {});
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
	 * Preview Endpoint
   */
  public ApiResponse<OrganizationPresenceDefinition> putPresenceDefinition0(ApiRequest<OrganizationPresenceDefinition> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationPresenceDefinition>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationPresenceDefinition> response = (ApiResponse<OrganizationPresenceDefinition>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationPresenceDefinition> response = (ApiResponse<OrganizationPresenceDefinition>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the presence settings
   * 
   * @param body Presence Settings (required)
   * @return PresenceSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PresenceSettings putPresenceSettings(PresenceSettings body) throws IOException, ApiException {
    return  putPresenceSettings(createPutPresenceSettingsRequest(body));
  }

  /**
   * Update the presence settings
   * 
   * @param body Presence Settings (required)
   * @return PresenceSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PresenceSettings> putPresenceSettingsWithHttpInfo(PresenceSettings body) throws IOException {
    return putPresenceSettings(createPutPresenceSettingsRequest(body).withHttpInfo());
  }

  private PutPresenceSettingsRequest createPutPresenceSettingsRequest(PresenceSettings body) {
    return PutPresenceSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update the presence settings
   * 
   * @param request The request object
   * @return PresenceSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PresenceSettings putPresenceSettings(PutPresenceSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PresenceSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PresenceSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the presence settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PresenceSettings> putPresenceSettings(ApiRequest<PresenceSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PresenceSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PresenceSettings> response = (ApiResponse<PresenceSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<PresenceSettings> response = (ApiResponse<PresenceSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a Presence Source
   * 
   * @param sourceId Presence Source ID (required)
   * @param body The updated Presence Source (required)
   * @return Source
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Source putPresenceSource(String sourceId, Source body) throws IOException, ApiException {
    return  putPresenceSource(createPutPresenceSourceRequest(sourceId, body));
  }

  /**
   * Update a Presence Source
   * 
   * @param sourceId Presence Source ID (required)
   * @param body The updated Presence Source (required)
   * @return Source
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Source> putPresenceSourceWithHttpInfo(String sourceId, Source body) throws IOException {
    return putPresenceSource(createPutPresenceSourceRequest(sourceId, body).withHttpInfo());
  }

  private PutPresenceSourceRequest createPutPresenceSourceRequest(String sourceId, Source body) {
    return PutPresenceSourceRequest.builder()
            .withSourceId(sourceId)

            .withBody(body)

            .build();
  }

  /**
   * Update a Presence Source
   * 
   * @param request The request object
   * @return Source
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Source putPresenceSource(PutPresenceSourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Source> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Source>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a Presence Source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Source> putPresenceSource(ApiRequest<Source> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Source>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Source> response = (ApiResponse<Source>)(ApiResponse<?>)exception;
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
      ApiResponse<Source> response = (ApiResponse<Source>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a user's Primary Presence Source
   * 
   * @param userId user ID (required)
   * @param body Primary Source (required)
   * @return UserPrimarySource
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPrimarySource putPresenceUserPrimarysource(String userId, UserPrimarySource body) throws IOException, ApiException {
    return  putPresenceUserPrimarysource(createPutPresenceUserPrimarysourceRequest(userId, body));
  }

  /**
   * Update a user's Primary Presence Source
   * 
   * @param userId user ID (required)
   * @param body Primary Source (required)
   * @return UserPrimarySource
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPrimarySource> putPresenceUserPrimarysourceWithHttpInfo(String userId, UserPrimarySource body) throws IOException {
    return putPresenceUserPrimarysource(createPutPresenceUserPrimarysourceRequest(userId, body).withHttpInfo());
  }

  private PutPresenceUserPrimarysourceRequest createPutPresenceUserPrimarysourceRequest(String userId, UserPrimarySource body) {
    return PutPresenceUserPrimarysourceRequest.builder()
            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Update a user's Primary Presence Source
   * 
   * @param request The request object
   * @return UserPrimarySource
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPrimarySource putPresenceUserPrimarysource(PutPresenceUserPrimarysourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserPrimarySource> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserPrimarySource>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a user's Primary Presence Source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPrimarySource> putPresenceUserPrimarysource(ApiRequest<UserPrimarySource> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserPrimarySource>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserPrimarySource> response = (ApiResponse<UserPrimarySource>)(ApiResponse<?>)exception;
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
      ApiResponse<UserPrimarySource> response = (ApiResponse<UserPrimarySource>)(ApiResponse<?>)(new ApiException(exception));
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
