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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLanguage(String languageId) throws IOException, ApiException {
     deleteLanguage(createDeleteLanguageRequest(languageId));
  }

  /**
   * Delete Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @param languageId Language ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLanguageWithHttpInfo(String languageId) throws IOException {
    return deleteLanguage(createDeleteLanguageRequest(languageId).withHttpInfo());
  }

  private DeleteLanguageRequest createDeleteLanguageRequest(String languageId) {
    return DeleteLanguageRequest.builder()
            .withLanguageId(languageId)
    
            .build();
  }

  /**
   * Delete Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLanguage(DeleteLanguageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLanguage(ApiRequest<Void> request) throws IOException {
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
   * Delete Language
   * 
   * @param languageId Language ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingLanguage(String languageId) throws IOException, ApiException {
     deleteRoutingLanguage(createDeleteRoutingLanguageRequest(languageId));
  }

  /**
   * Delete Language
   * 
   * @param languageId Language ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingLanguageWithHttpInfo(String languageId) throws IOException {
    return deleteRoutingLanguage(createDeleteRoutingLanguageRequest(languageId).withHttpInfo());
  }

  private DeleteRoutingLanguageRequest createDeleteRoutingLanguageRequest(String languageId) {
    return DeleteRoutingLanguageRequest.builder()
            .withLanguageId(languageId)
    
            .build();
  }

  /**
   * Delete Language
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingLanguage(DeleteRoutingLanguageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Language
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingLanguage(ApiRequest<Void> request) throws IOException {
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
   * Get language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @param languageId Language ID (required)
   * @return Language
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Language getLanguage(String languageId) throws IOException, ApiException {
    return  getLanguage(createGetLanguageRequest(languageId));
  }

  /**
   * Get language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @param languageId Language ID (required)
   * @return Language
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Language> getLanguageWithHttpInfo(String languageId) throws IOException {
    return getLanguage(createGetLanguageRequest(languageId).withHttpInfo());
  }

  private GetLanguageRequest createGetLanguageRequest(String languageId) {
    return GetLanguageRequest.builder()
            .withLanguageId(languageId)
    
            .build();
  }

  /**
   * Get language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @param request The request object
   * @return Language
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Language getLanguage(GetLanguageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Language> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Language>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Language> getLanguage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Language>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Language> response = (ApiResponse<Language>)(ApiResponse<?>)exception;
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
      ApiResponse<Language> response = (ApiResponse<Language>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of supported languages. (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param name Name (optional)
   * @return LanguageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LanguageEntityListing getLanguages(Integer pageSize, Integer pageNumber, String sortOrder, String name) throws IOException, ApiException {
    return  getLanguages(createGetLanguagesRequest(pageSize, pageNumber, sortOrder, name));
  }

  /**
   * Get the list of supported languages. (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param name Name (optional)
   * @return LanguageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LanguageEntityListing> getLanguagesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortOrder, String name) throws IOException {
    return getLanguages(createGetLanguagesRequest(pageSize, pageNumber, sortOrder, name).withHttpInfo());
  }

  private GetLanguagesRequest createGetLanguagesRequest(Integer pageSize, Integer pageNumber, String sortOrder, String name) {
    return GetLanguagesRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .withName(name)
    
            .build();
  }

  /**
   * Get the list of supported languages. (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @param request The request object
   * @return LanguageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LanguageEntityListing getLanguages(GetLanguagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LanguageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LanguageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of supported languages. (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LanguageEntityListing> getLanguages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LanguageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LanguageEntityListing> response = (ApiResponse<LanguageEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LanguageEntityListing> response = (ApiResponse<LanguageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all available languages for translation
   * 
   * @return AvailableTranslations
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AvailableTranslations getLanguagesTranslations() throws IOException, ApiException {
    return  getLanguagesTranslations(createGetLanguagesTranslationsRequest());
  }

  /**
   * Get all available languages for translation
   * 
   * @return AvailableTranslations
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AvailableTranslations> getLanguagesTranslationsWithHttpInfo() throws IOException {
    return getLanguagesTranslations(createGetLanguagesTranslationsRequest().withHttpInfo());
  }

  private GetLanguagesTranslationsRequest createGetLanguagesTranslationsRequest() {
    return GetLanguagesTranslationsRequest.builder()
            .build();
  }

  /**
   * Get all available languages for translation
   * 
   * @param request The request object
   * @return AvailableTranslations
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AvailableTranslations getLanguagesTranslations(GetLanguagesTranslationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AvailableTranslations> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AvailableTranslations>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all available languages for translation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AvailableTranslations> getLanguagesTranslations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AvailableTranslations>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AvailableTranslations> response = (ApiResponse<AvailableTranslations>)(ApiResponse<?>)exception;
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
      ApiResponse<AvailableTranslations> response = (ApiResponse<AvailableTranslations>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the builtin translation for a language
   * 
   * @param language The language of the builtin translation to retrieve (required)
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> getLanguagesTranslationsBuiltin(String language) throws IOException, ApiException {
    return  getLanguagesTranslationsBuiltin(createGetLanguagesTranslationsBuiltinRequest(language));
  }

  /**
   * Get the builtin translation for a language
   * 
   * @param language The language of the builtin translation to retrieve (required)
   * @return Map<String, Object>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> getLanguagesTranslationsBuiltinWithHttpInfo(String language) throws IOException {
    return getLanguagesTranslationsBuiltin(createGetLanguagesTranslationsBuiltinRequest(language).withHttpInfo());
  }

  private GetLanguagesTranslationsBuiltinRequest createGetLanguagesTranslationsBuiltinRequest(String language) {
    return GetLanguagesTranslationsBuiltinRequest.builder()
            .withLanguage(language)
    
            .build();
  }

  /**
   * Get the builtin translation for a language
   * 
   * @param request The request object
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> getLanguagesTranslationsBuiltin(GetLanguagesTranslationsBuiltinRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Map<String, Object>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the builtin translation for a language
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> getLanguagesTranslationsBuiltin(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Map<String, Object>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)exception;
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
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get effective translation for an organization by language
   * 
   * @param language The language of the translation to retrieve for the organization (required)
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> getLanguagesTranslationsOrganization(String language) throws IOException, ApiException {
    return  getLanguagesTranslationsOrganization(createGetLanguagesTranslationsOrganizationRequest(language));
  }

  /**
   * Get effective translation for an organization by language
   * 
   * @param language The language of the translation to retrieve for the organization (required)
   * @return Map<String, Object>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> getLanguagesTranslationsOrganizationWithHttpInfo(String language) throws IOException {
    return getLanguagesTranslationsOrganization(createGetLanguagesTranslationsOrganizationRequest(language).withHttpInfo());
  }

  private GetLanguagesTranslationsOrganizationRequest createGetLanguagesTranslationsOrganizationRequest(String language) {
    return GetLanguagesTranslationsOrganizationRequest.builder()
            .withLanguage(language)
    
            .build();
  }

  /**
   * Get effective translation for an organization by language
   * 
   * @param request The request object
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> getLanguagesTranslationsOrganization(GetLanguagesTranslationsOrganizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Map<String, Object>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get effective translation for an organization by language
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> getLanguagesTranslationsOrganization(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Map<String, Object>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)exception;
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
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get effective language translation for a user
   * 
   * @param userId The user id (required)
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> getLanguagesTranslationsUser(String userId) throws IOException, ApiException {
    return  getLanguagesTranslationsUser(createGetLanguagesTranslationsUserRequest(userId));
  }

  /**
   * Get effective language translation for a user
   * 
   * @param userId The user id (required)
   * @return Map<String, Object>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> getLanguagesTranslationsUserWithHttpInfo(String userId) throws IOException {
    return getLanguagesTranslationsUser(createGetLanguagesTranslationsUserRequest(userId).withHttpInfo());
  }

  private GetLanguagesTranslationsUserRequest createGetLanguagesTranslationsUserRequest(String userId) {
    return GetLanguagesTranslationsUserRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get effective language translation for a user
   * 
   * @param request The request object
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> getLanguagesTranslationsUser(GetLanguagesTranslationsUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Map<String, Object>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get effective language translation for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> getLanguagesTranslationsUser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Map<String, Object>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)exception;
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
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get language
   * 
   * @param languageId Language ID (required)
   * @return Language
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Language getRoutingLanguage(String languageId) throws IOException, ApiException {
    return  getRoutingLanguage(createGetRoutingLanguageRequest(languageId));
  }

  /**
   * Get language
   * 
   * @param languageId Language ID (required)
   * @return Language
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Language> getRoutingLanguageWithHttpInfo(String languageId) throws IOException {
    return getRoutingLanguage(createGetRoutingLanguageRequest(languageId).withHttpInfo());
  }

  private GetRoutingLanguageRequest createGetRoutingLanguageRequest(String languageId) {
    return GetRoutingLanguageRequest.builder()
            .withLanguageId(languageId)
    
            .build();
  }

  /**
   * Get language
   * 
   * @param request The request object
   * @return Language
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Language getRoutingLanguage(GetRoutingLanguageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Language> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Language>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get language
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Language> getRoutingLanguage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Language>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Language> response = (ApiResponse<Language>)(ApiResponse<?>)exception;
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
      ApiResponse<Language> response = (ApiResponse<Language>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @param body Language (required)
   * @return Language
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Language postLanguages(Language body) throws IOException, ApiException {
    return  postLanguages(createPostLanguagesRequest(body));
  }

  /**
   * Create Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @param body Language (required)
   * @return Language
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Language> postLanguagesWithHttpInfo(Language body) throws IOException {
    return postLanguages(createPostLanguagesRequest(body).withHttpInfo());
  }

  private PostLanguagesRequest createPostLanguagesRequest(Language body) {
    return PostLanguagesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @param request The request object
   * @return Language
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Language postLanguages(PostLanguagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Language> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Language>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Language> postLanguages(ApiRequest<Language> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Language>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Language> response = (ApiResponse<Language>)(ApiResponse<?>)exception;
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
      ApiResponse<Language> response = (ApiResponse<Language>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
