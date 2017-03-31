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
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.LanguageEntityListing;
import com.mypurecloud.sdk.v2.model.AvailableTranslations;


import com.mypurecloud.sdk.v2.api.request.DeleteLanguageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingLanguageRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguagesTranslationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguagesTranslationsBuiltinRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguagesTranslationsOrganizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguagesTranslationsUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingLanguageRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguagesRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LanguagesApi {
  private final ApiClient pcapiClient;

  public LanguagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LanguagesApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @param languageId Language ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLanguage(String languageId) throws IOException, ApiException {
    deleteLanguageWithHttpInfo(languageId);
  }

  /**
   * Delete Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @param languageId Language ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteLanguageWithHttpInfo(String languageId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'languageId' is set
    if (languageId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'languageId' when calling deleteLanguage");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/languages/{languageId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "languageId" + "\\}", pcapiClient.escapeString(languageId.toString()));

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
   * Delete Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteLanguage(DeleteLanguageRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteLanguage(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete Language
   * 
   * @param languageId Language ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRoutingLanguage(String languageId) throws IOException, ApiException {
    deleteRoutingLanguageWithHttpInfo(languageId);
  }

  /**
   * Delete Language
   * 
   * @param languageId Language ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteRoutingLanguageWithHttpInfo(String languageId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'languageId' is set
    if (languageId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'languageId' when calling deleteRoutingLanguage");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/languages/{languageId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "languageId" + "\\}", pcapiClient.escapeString(languageId.toString()));

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
   * Delete Language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteRoutingLanguage(DeleteRoutingLanguageRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete Language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteRoutingLanguage(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Get language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @param languageId Language ID (required)
   * @return Language
   * @throws ApiException if fails to make API call
   */
  public Language getLanguage(String languageId) throws IOException, ApiException {
    return getLanguageWithHttpInfo(languageId).getBody();
  }

  /**
   * Get language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @param languageId Language ID (required)
   * @return Language
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Language> getLanguageWithHttpInfo(String languageId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'languageId' is set
    if (languageId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'languageId' when calling getLanguage");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/languages/{languageId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "languageId" + "\\}", pcapiClient.escapeString(languageId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Language>() {});
  }

  /**
   * Get language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Language getLanguage(GetLanguageRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Language>() {});
  }

  /**
   * Get language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Language> getLanguage(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Language>invokeAPIVerbose(request, new TypeReference<Language>() {});
  }

  /**
   * Get the list of supported languages. (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param name Name (optional)
   * @return LanguageEntityListing
   * @throws ApiException if fails to make API call
   */
  public LanguageEntityListing getLanguages(Integer pageSize, Integer pageNumber, String sortOrder, String name) throws IOException, ApiException {
    return getLanguagesWithHttpInfo(pageSize, pageNumber, sortOrder, name).getBody();
  }

  /**
   * Get the list of supported languages. (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param name Name (optional)
   * @return LanguageEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LanguageEntityListing> getLanguagesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortOrder, String name) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/languages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LanguageEntityListing>() {});
  }

  /**
   * Get the list of supported languages. (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LanguageEntityListing getLanguages(GetLanguagesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LanguageEntityListing>() {});
  }

  /**
   * Get the list of supported languages. (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LanguageEntityListing> getLanguages(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<LanguageEntityListing>invokeAPIVerbose(request, new TypeReference<LanguageEntityListing>() {});
  }

  /**
   * Get all available languages for translation
   * 
   * @return AvailableTranslations
   * @throws ApiException if fails to make API call
   */
  public AvailableTranslations getLanguagesTranslations() throws IOException, ApiException {
    return getLanguagesTranslationsWithHttpInfo().getBody();
  }

  /**
   * Get all available languages for translation
   * 
   * @return AvailableTranslations
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AvailableTranslations> getLanguagesTranslationsWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/languages/translations".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AvailableTranslations>() {});
  }

  /**
   * Get all available languages for translation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AvailableTranslations getLanguagesTranslations(GetLanguagesTranslationsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AvailableTranslations>() {});
  }

  /**
   * Get all available languages for translation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AvailableTranslations> getLanguagesTranslations(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<AvailableTranslations>invokeAPIVerbose(request, new TypeReference<AvailableTranslations>() {});
  }

  /**
   * Get the builtin translation for a language
   * 
   * @param language The language of the builtin translation to retrieve (required)
   * @return Map<String, Object>
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> getLanguagesTranslationsBuiltin(String language) throws IOException, ApiException {
    return getLanguagesTranslationsBuiltinWithHttpInfo(language).getBody();
  }

  /**
   * Get the builtin translation for a language
   * 
   * @param language The language of the builtin translation to retrieve (required)
   * @return Map<String, Object>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, Object>> getLanguagesTranslationsBuiltinWithHttpInfo(String language) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'language' is set
    if (language == null) {
      throw new IllegalArgumentException("Missing the required parameter 'language' when calling getLanguagesTranslationsBuiltin");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/languages/translations/builtin".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "language", language));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Map<String, Object>>() {});
  }

  /**
   * Get the builtin translation for a language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> getLanguagesTranslationsBuiltin(GetLanguagesTranslationsBuiltinRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {});
  }

  /**
   * Get the builtin translation for a language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, Object>> getLanguagesTranslationsBuiltin(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Map<String, Object>>invokeAPIVerbose(request, new TypeReference<Map<String, Object>>() {});
  }

  /**
   * Get effective translation for an organization by language
   * 
   * @param language The language of the translation to retrieve for the organization (required)
   * @return Map<String, Object>
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> getLanguagesTranslationsOrganization(String language) throws IOException, ApiException {
    return getLanguagesTranslationsOrganizationWithHttpInfo(language).getBody();
  }

  /**
   * Get effective translation for an organization by language
   * 
   * @param language The language of the translation to retrieve for the organization (required)
   * @return Map<String, Object>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, Object>> getLanguagesTranslationsOrganizationWithHttpInfo(String language) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'language' is set
    if (language == null) {
      throw new IllegalArgumentException("Missing the required parameter 'language' when calling getLanguagesTranslationsOrganization");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/languages/translations/organization".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "language", language));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Map<String, Object>>() {});
  }

  /**
   * Get effective translation for an organization by language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> getLanguagesTranslationsOrganization(GetLanguagesTranslationsOrganizationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {});
  }

  /**
   * Get effective translation for an organization by language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, Object>> getLanguagesTranslationsOrganization(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Map<String, Object>>invokeAPIVerbose(request, new TypeReference<Map<String, Object>>() {});
  }

  /**
   * Get effective language translation for a user
   * 
   * @param userId The user id (required)
   * @return Map<String, Object>
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> getLanguagesTranslationsUser(String userId) throws IOException, ApiException {
    return getLanguagesTranslationsUserWithHttpInfo(userId).getBody();
  }

  /**
   * Get effective language translation for a user
   * 
   * @param userId The user id (required)
   * @return Map<String, Object>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, Object>> getLanguagesTranslationsUserWithHttpInfo(String userId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling getLanguagesTranslationsUser");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/languages/translations/users/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Map<String, Object>>() {});
  }

  /**
   * Get effective language translation for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> getLanguagesTranslationsUser(GetLanguagesTranslationsUserRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {});
  }

  /**
   * Get effective language translation for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, Object>> getLanguagesTranslationsUser(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Map<String, Object>>invokeAPIVerbose(request, new TypeReference<Map<String, Object>>() {});
  }

  /**
   * Get language
   * 
   * @param languageId Language ID (required)
   * @return Language
   * @throws ApiException if fails to make API call
   */
  public Language getRoutingLanguage(String languageId) throws IOException, ApiException {
    return getRoutingLanguageWithHttpInfo(languageId).getBody();
  }

  /**
   * Get language
   * 
   * @param languageId Language ID (required)
   * @return Language
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Language> getRoutingLanguageWithHttpInfo(String languageId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'languageId' is set
    if (languageId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'languageId' when calling getRoutingLanguage");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/languages/{languageId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "languageId" + "\\}", pcapiClient.escapeString(languageId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Language>() {});
  }

  /**
   * Get language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Language getRoutingLanguage(GetRoutingLanguageRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Language>() {});
  }

  /**
   * Get language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Language> getRoutingLanguage(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Language>invokeAPIVerbose(request, new TypeReference<Language>() {});
  }

  /**
   * Create Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @param body Language (required)
   * @return Language
   * @throws ApiException if fails to make API call
   */
  public Language postLanguages(Language body) throws IOException, ApiException {
    return postLanguagesWithHttpInfo(body).getBody();
  }

  /**
   * Create Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @param body Language (required)
   * @return Language
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Language> postLanguagesWithHttpInfo(Language body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postLanguages");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/languages".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Language>() {});
  }

  /**
   * Create Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Language postLanguages(PostLanguagesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Language>() {});
  }

  /**
   * Create Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Language> postLanguages(ApiRequest<Language> request) throws IOException, ApiException {
    return pcapiClient.<Language>invokeAPIVerbose(request, new TypeReference<Language>() {});
  }

}
