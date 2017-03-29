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


import com.mypurecloud.sdk.v2.api.request.DeletePresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresencedefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSystempresencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.PostPresencedefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.PutPresencedefinitionRequest;

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
   * @throws ApiException if fails to make API call
   */
  public void deletePresencedefinition(String presenceId) throws ApiException {
    deletePresencedefinitionWithHttpInfo(presenceId);
  }

  /**
   * Delete a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deletePresencedefinitionWithHttpInfo(String presenceId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'presenceId' is set
    if (presenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'presenceId' when calling deletePresencedefinition");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/presencedefinitions/{presenceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "presenceId" + "\\}", pcapiClient.escapeString(presenceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deletePresencedefinition(DeletePresencedefinitionRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deletePresencedefinition(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Get a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @param localeCode The locale code to fetch for the presence definition. Use ALL to fetch everything. (optional)
   * @return OrganizationPresence
   * @throws ApiException if fails to make API call
   */
  public OrganizationPresence getPresencedefinition(String presenceId, String localeCode) throws ApiException {
    return getPresencedefinitionWithHttpInfo(presenceId, localeCode).getBody();
  }

  /**
   * Get a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @param localeCode The locale code to fetch for the presence definition. Use ALL to fetch everything. (optional)
   * @return OrganizationPresence
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationPresence> getPresencedefinitionWithHttpInfo(String presenceId, String localeCode) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'presenceId' is set
    if (presenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'presenceId' when calling getPresencedefinition");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/presencedefinitions/{presenceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "presenceId" + "\\}", pcapiClient.escapeString(presenceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "localeCode", localeCode));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OrganizationPresence>() {});
  }

  /**
   * Get a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OrganizationPresence getPresencedefinition(GetPresencedefinitionRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OrganizationPresence>() {});
  }

  /**
   * Get a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationPresence> getPresencedefinition(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OrganizationPresence>invokeAPIVerbose(request, new TypeReference<OrganizationPresence>() {});
  }

  /**
   * Get an Organization&#39;s list of Presence Definitions
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param deleted Deleted query can be TRUE, FALSE or ALL (optional, default to false)
   * @param localeCode The locale code to fetch for each presence definition. Use ALL to fetch everything. (optional)
   * @return OrganizationPresenceEntityListing
   * @throws ApiException if fails to make API call
   */
  public OrganizationPresenceEntityListing getPresencedefinitions(Integer pageNumber, Integer pageSize, String deleted, String localeCode) throws ApiException {
    return getPresencedefinitionsWithHttpInfo(pageNumber, pageSize, deleted, localeCode).getBody();
  }

  /**
   * Get an Organization&#39;s list of Presence Definitions
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param deleted Deleted query can be TRUE, FALSE or ALL (optional, default to false)
   * @param localeCode The locale code to fetch for each presence definition. Use ALL to fetch everything. (optional)
   * @return OrganizationPresenceEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationPresenceEntityListing> getPresencedefinitionsWithHttpInfo(Integer pageNumber, Integer pageSize, String deleted, String localeCode) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/presencedefinitions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "deleted", deleted));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "localeCode", localeCode));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OrganizationPresenceEntityListing>() {});
  }

  /**
   * Get an Organization&#39;s list of Presence Definitions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OrganizationPresenceEntityListing getPresencedefinitions(GetPresencedefinitionsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OrganizationPresenceEntityListing>() {});
  }

  /**
   * Get an Organization&#39;s list of Presence Definitions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationPresenceEntityListing> getPresencedefinitions(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OrganizationPresenceEntityListing>invokeAPIVerbose(request, new TypeReference<OrganizationPresenceEntityListing>() {});
  }

  /**
   * Get the list of SystemPresences
   * 
   * @return List<SystemPresence>
   * @throws ApiException if fails to make API call
   */
  public List<SystemPresence> getSystempresences() throws ApiException {
    return getSystempresencesWithHttpInfo().getBody();
  }

  /**
   * Get the list of SystemPresences
   * 
   * @return List<SystemPresence>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SystemPresence>> getSystempresencesWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/systempresences".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<SystemPresence>>() {});
  }

  /**
   * Get the list of SystemPresences
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<SystemPresence> getSystempresences(GetSystempresencesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<SystemPresence>>() {});
  }

  /**
   * Get the list of SystemPresences
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SystemPresence>> getSystempresences(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<SystemPresence>>invokeAPIVerbose(request, new TypeReference<List<SystemPresence>>() {});
  }

  /**
   * Get a user&#39;s Presence
   * 
   * @param userId user Id (required)
   * @param sourceId Source (required)
   * @return UserPresence
   * @throws ApiException if fails to make API call
   */
  public UserPresence getUserPresence(String userId, String sourceId) throws ApiException {
    return getUserPresenceWithHttpInfo(userId, sourceId).getBody();
  }

  /**
   * Get a user&#39;s Presence
   * 
   * @param userId user Id (required)
   * @param sourceId Source (required)
   * @return UserPresence
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresence> getUserPresenceWithHttpInfo(String userId, String sourceId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserPresence");
    }
    
    // verify the required parameter 'sourceId' is set
    if (sourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceId' when calling getUserPresence");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/presences/{sourceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "sourceId" + "\\}", pcapiClient.escapeString(sourceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserPresence>() {});
  }

  /**
   * Get a user&#39;s Presence
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserPresence getUserPresence(GetUserPresenceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserPresence>() {});
  }

  /**
   * Get a user&#39;s Presence
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresence> getUserPresence(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserPresence>invokeAPIVerbose(request, new TypeReference<UserPresence>() {});
  }

  /**
   * Patch a user&#39;s Presence
   * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param userId user Id (required)
   * @param sourceId Source (required)
   * @param body User presence (required)
   * @return UserPresence
   * @throws ApiException if fails to make API call
   */
  public UserPresence patchUserPresence(String userId, String sourceId, UserPresence body) throws ApiException {
    return patchUserPresenceWithHttpInfo(userId, sourceId, body).getBody();
  }

  /**
   * Patch a user&#39;s Presence
   * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param userId user Id (required)
   * @param sourceId Source (required)
   * @param body User presence (required)
   * @return UserPresence
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresence> patchUserPresenceWithHttpInfo(String userId, String sourceId, UserPresence body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling patchUserPresence");
    }
    
    // verify the required parameter 'sourceId' is set
    if (sourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceId' when calling patchUserPresence");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchUserPresence");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/presences/{sourceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "sourceId" + "\\}", pcapiClient.escapeString(sourceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserPresence>() {});
  }

  /**
   * Patch a user&#39;s Presence
   * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserPresence patchUserPresence(PatchUserPresenceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserPresence>() {});
  }

  /**
   * Patch a user&#39;s Presence
   * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresence> patchUserPresence(ApiRequest<UserPresence> request) throws ApiException {
    return pcapiClient.<UserPresence>invokeAPIVerbose(request, new TypeReference<UserPresence>() {});
  }

  /**
   * Create a Presence Definition
   * 
   * @param body The Presence Definition to create (required)
   * @return OrganizationPresence
   * @throws ApiException if fails to make API call
   */
  public OrganizationPresence postPresencedefinitions(OrganizationPresence body) throws ApiException {
    return postPresencedefinitionsWithHttpInfo(body).getBody();
  }

  /**
   * Create a Presence Definition
   * 
   * @param body The Presence Definition to create (required)
   * @return OrganizationPresence
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationPresence> postPresencedefinitionsWithHttpInfo(OrganizationPresence body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postPresencedefinitions");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/presencedefinitions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OrganizationPresence>() {});
  }

  /**
   * Create a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OrganizationPresence postPresencedefinitions(PostPresencedefinitionsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OrganizationPresence>() {});
  }

  /**
   * Create a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationPresence> postPresencedefinitions(ApiRequest<OrganizationPresence> request) throws ApiException {
    return pcapiClient.<OrganizationPresence>invokeAPIVerbose(request, new TypeReference<OrganizationPresence>() {});
  }

  /**
   * Update a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @param body The OrganizationPresence to update (required)
   * @return OrganizationPresence
   * @throws ApiException if fails to make API call
   */
  public OrganizationPresence putPresencedefinition(String presenceId, OrganizationPresence body) throws ApiException {
    return putPresencedefinitionWithHttpInfo(presenceId, body).getBody();
  }

  /**
   * Update a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @param body The OrganizationPresence to update (required)
   * @return OrganizationPresence
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationPresence> putPresencedefinitionWithHttpInfo(String presenceId, OrganizationPresence body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'presenceId' is set
    if (presenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'presenceId' when calling putPresencedefinition");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putPresencedefinition");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/presencedefinitions/{presenceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "presenceId" + "\\}", pcapiClient.escapeString(presenceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OrganizationPresence>() {});
  }

  /**
   * Update a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OrganizationPresence putPresencedefinition(PutPresencedefinitionRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OrganizationPresence>() {});
  }

  /**
   * Update a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationPresence> putPresencedefinition(ApiRequest<OrganizationPresence> request) throws ApiException {
    return pcapiClient.<OrganizationPresence>invokeAPIVerbose(request, new TypeReference<OrganizationPresence>() {});
  }

}
