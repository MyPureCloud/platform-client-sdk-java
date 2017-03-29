package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.AsyncApiCallback;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class LanguagesApiAsync {
  private final ApiClient pcapiClient;

  public LanguagesApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public LanguagesApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteLanguageAsync(DeleteLanguageRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteLanguageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete Language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteRoutingLanguageAsync(DeleteRoutingLanguageRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete Language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteRoutingLanguageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Get language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Language> getLanguageAsync(GetLanguageRequest request, AsyncApiCallback<Language> callback) throws ApiException {
    return pcapiClient.<Language>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Language>() {}, callback);
  }

  /**
   * Get language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages/{languageId}
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Language>> getLanguageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Language>> callback) throws ApiException {
    return pcapiClient.<Language>invokeAPIVerboseAsync(request, new TypeReference<Language>() {}, callback);
  }

  /**
   * Get the list of supported languages. (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LanguageEntityListing> getLanguagesAsync(GetLanguagesRequest request, AsyncApiCallback<LanguageEntityListing> callback) throws ApiException {
    return pcapiClient.<LanguageEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LanguageEntityListing>() {}, callback);
  }

  /**
   * Get the list of supported languages. (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LanguageEntityListing>> getLanguagesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LanguageEntityListing>> callback) throws ApiException {
    return pcapiClient.<LanguageEntityListing>invokeAPIVerboseAsync(request, new TypeReference<LanguageEntityListing>() {}, callback);
  }

  /**
   * Get all available languages for translation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AvailableTranslations> getLanguagesTranslationsAsync(GetLanguagesTranslationsRequest request, AsyncApiCallback<AvailableTranslations> callback) throws ApiException {
    return pcapiClient.<AvailableTranslations>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AvailableTranslations>() {}, callback);
  }

  /**
   * Get all available languages for translation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AvailableTranslations>> getLanguagesTranslationsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<AvailableTranslations>> callback) throws ApiException {
    return pcapiClient.<AvailableTranslations>invokeAPIVerboseAsync(request, new TypeReference<AvailableTranslations>() {}, callback);
  }

  /**
   * Get the builtin translation for a language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Map<String, Object>> getLanguagesTranslationsBuiltinAsync(GetLanguagesTranslationsBuiltinRequest request, AsyncApiCallback<Map<String, Object>> callback) throws ApiException {
    return pcapiClient.<Map<String, Object>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {}, callback);
  }

  /**
   * Get the builtin translation for a language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Map<String, Object>>> getLanguagesTranslationsBuiltinAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Map<String, Object>>> callback) throws ApiException {
    return pcapiClient.<Map<String, Object>>invokeAPIVerboseAsync(request, new TypeReference<Map<String, Object>>() {}, callback);
  }

  /**
   * Get effective translation for an organization by language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Map<String, Object>> getLanguagesTranslationsOrganizationAsync(GetLanguagesTranslationsOrganizationRequest request, AsyncApiCallback<Map<String, Object>> callback) throws ApiException {
    return pcapiClient.<Map<String, Object>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {}, callback);
  }

  /**
   * Get effective translation for an organization by language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Map<String, Object>>> getLanguagesTranslationsOrganizationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Map<String, Object>>> callback) throws ApiException {
    return pcapiClient.<Map<String, Object>>invokeAPIVerboseAsync(request, new TypeReference<Map<String, Object>>() {}, callback);
  }

  /**
   * Get effective language translation for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Map<String, Object>> getLanguagesTranslationsUserAsync(GetLanguagesTranslationsUserRequest request, AsyncApiCallback<Map<String, Object>> callback) throws ApiException {
    return pcapiClient.<Map<String, Object>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {}, callback);
  }

  /**
   * Get effective language translation for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Map<String, Object>>> getLanguagesTranslationsUserAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Map<String, Object>>> callback) throws ApiException {
    return pcapiClient.<Map<String, Object>>invokeAPIVerboseAsync(request, new TypeReference<Map<String, Object>>() {}, callback);
  }

  /**
   * Get language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Language> getRoutingLanguageAsync(GetRoutingLanguageRequest request, AsyncApiCallback<Language> callback) throws ApiException {
    return pcapiClient.<Language>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Language>() {}, callback);
  }

  /**
   * Get language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Language>> getRoutingLanguageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Language>> callback) throws ApiException {
    return pcapiClient.<Language>invokeAPIVerboseAsync(request, new TypeReference<Language>() {}, callback);
  }

  /**
   * Create Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Language> postLanguagesAsync(PostLanguagesRequest request, AsyncApiCallback<Language> callback) throws ApiException {
    return pcapiClient.<Language>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Language>() {}, callback);
  }

  /**
   * Create Language (Deprecated)
   * This endpoint is deprecated. It has been moved to /routing/languages
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Language>> postLanguagesAsync(ApiRequest<Language> request, AsyncApiCallback<ApiResponse<Language>> callback) throws ApiException {
    return pcapiClient.<Language>invokeAPIVerboseAsync(request, new TypeReference<Language>() {}, callback);
  }

}
