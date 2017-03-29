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
import com.mypurecloud.sdk.v2.model.Greeting;
import com.mypurecloud.sdk.v2.model.GreetingMediaInfo;
import com.mypurecloud.sdk.v2.model.DomainEntityListing;
import com.mypurecloud.sdk.v2.model.DefaultGreetingList;
import com.mypurecloud.sdk.v2.model.GreetingListing;


import com.mypurecloud.sdk.v2.api.request.DeleteGreetingRequest;
import com.mypurecloud.sdk.v2.api.request.GetGreetingRequest;
import com.mypurecloud.sdk.v2.api.request.GetGreetingMediaRequest;
import com.mypurecloud.sdk.v2.api.request.GetGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGroupGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutGreetingRequest;
import com.mypurecloud.sdk.v2.api.request.PutGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.PutGroupGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserGreetingsDefaultsRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class GreetingsApiAsync {
  private final ApiClient pcapiClient;

  public GreetingsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public GreetingsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Deletes a Greeting with the given GreetingId
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteGreetingAsync(DeleteGreetingRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Deletes a Greeting with the given GreetingId
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteGreetingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Get a Greeting with the given GreetingId
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Greeting> getGreetingAsync(GetGreetingRequest request, AsyncApiCallback<Greeting> callback) throws ApiException {
    return pcapiClient.<Greeting>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Greeting>() {}, callback);
  }

  /**
   * Get a Greeting with the given GreetingId
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Greeting>> getGreetingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Greeting>> callback) throws ApiException {
    return pcapiClient.<Greeting>invokeAPIVerboseAsync(request, new TypeReference<Greeting>() {}, callback);
  }

  /**
   * Get media playback URI for this greeting
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<GreetingMediaInfo> getGreetingMediaAsync(GetGreetingMediaRequest request, AsyncApiCallback<GreetingMediaInfo> callback) throws ApiException {
    return pcapiClient.<GreetingMediaInfo>invokeAPIAsync(request.withHttpInfo(), new TypeReference<GreetingMediaInfo>() {}, callback);
  }

  /**
   * Get media playback URI for this greeting
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<GreetingMediaInfo>> getGreetingMediaAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<GreetingMediaInfo>> callback) throws ApiException {
    return pcapiClient.<GreetingMediaInfo>invokeAPIVerboseAsync(request, new TypeReference<GreetingMediaInfo>() {}, callback);
  }

  /**
   * Gets an Organization&#39;s Greetings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainEntityListing> getGreetingsAsync(GetGreetingsRequest request, AsyncApiCallback<DomainEntityListing> callback) throws ApiException {
    return pcapiClient.<DomainEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainEntityListing>() {}, callback);
  }

  /**
   * Gets an Organization&#39;s Greetings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainEntityListing>> getGreetingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainEntityListing>> callback) throws ApiException {
    return pcapiClient.<DomainEntityListing>invokeAPIVerboseAsync(request, new TypeReference<DomainEntityListing>() {}, callback);
  }

  /**
   * Get an Organization&#39;s DefaultGreetingList
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DefaultGreetingList> getGreetingsDefaultsAsync(GetGreetingsDefaultsRequest request, AsyncApiCallback<DefaultGreetingList> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {}, callback);
  }

  /**
   * Get an Organization&#39;s DefaultGreetingList
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DefaultGreetingList>> getGreetingsDefaultsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DefaultGreetingList>> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerboseAsync(request, new TypeReference<DefaultGreetingList>() {}, callback);
  }

  /**
   * Get a list of the Group&#39;s Greetings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<GreetingListing> getGroupGreetingsAsync(GetGroupGreetingsRequest request, AsyncApiCallback<GreetingListing> callback) throws ApiException {
    return pcapiClient.<GreetingListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<GreetingListing>() {}, callback);
  }

  /**
   * Get a list of the Group&#39;s Greetings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<GreetingListing>> getGroupGreetingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<GreetingListing>> callback) throws ApiException {
    return pcapiClient.<GreetingListing>invokeAPIVerboseAsync(request, new TypeReference<GreetingListing>() {}, callback);
  }

  /**
   * Grabs the list of Default Greetings given a Group&#39;s ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DefaultGreetingList> getGroupGreetingsDefaultsAsync(GetGroupGreetingsDefaultsRequest request, AsyncApiCallback<DefaultGreetingList> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {}, callback);
  }

  /**
   * Grabs the list of Default Greetings given a Group&#39;s ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DefaultGreetingList>> getGroupGreetingsDefaultsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DefaultGreetingList>> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerboseAsync(request, new TypeReference<DefaultGreetingList>() {}, callback);
  }

  /**
   * Get a list of the User&#39;s Greetings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainEntityListing> getUserGreetingsAsync(GetUserGreetingsRequest request, AsyncApiCallback<DomainEntityListing> callback) throws ApiException {
    return pcapiClient.<DomainEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainEntityListing>() {}, callback);
  }

  /**
   * Get a list of the User&#39;s Greetings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainEntityListing>> getUserGreetingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainEntityListing>> callback) throws ApiException {
    return pcapiClient.<DomainEntityListing>invokeAPIVerboseAsync(request, new TypeReference<DomainEntityListing>() {}, callback);
  }

  /**
   * Grabs the list of Default Greetings given a User&#39;s ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DefaultGreetingList> getUserGreetingsDefaultsAsync(GetUserGreetingsDefaultsRequest request, AsyncApiCallback<DefaultGreetingList> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {}, callback);
  }

  /**
   * Grabs the list of Default Greetings given a User&#39;s ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DefaultGreetingList>> getUserGreetingsDefaultsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DefaultGreetingList>> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerboseAsync(request, new TypeReference<DefaultGreetingList>() {}, callback);
  }

  /**
   * Create a Greeting for an Organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DefaultGreetingList> postGreetingsAsync(PostGreetingsRequest request, AsyncApiCallback<DefaultGreetingList> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {}, callback);
  }

  /**
   * Create a Greeting for an Organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DefaultGreetingList>> postGreetingsAsync(ApiRequest<Greeting> request, AsyncApiCallback<ApiResponse<DefaultGreetingList>> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerboseAsync(request, new TypeReference<DefaultGreetingList>() {}, callback);
  }

  /**
   * Creates a Greeting for a Group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Greeting> postGroupGreetingsAsync(PostGroupGreetingsRequest request, AsyncApiCallback<Greeting> callback) throws ApiException {
    return pcapiClient.<Greeting>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Greeting>() {}, callback);
  }

  /**
   * Creates a Greeting for a Group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Greeting>> postGroupGreetingsAsync(ApiRequest<Greeting> request, AsyncApiCallback<ApiResponse<Greeting>> callback) throws ApiException {
    return pcapiClient.<Greeting>invokeAPIVerboseAsync(request, new TypeReference<Greeting>() {}, callback);
  }

  /**
   * Creates a Greeting for a User
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Greeting> postUserGreetingsAsync(PostUserGreetingsRequest request, AsyncApiCallback<Greeting> callback) throws ApiException {
    return pcapiClient.<Greeting>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Greeting>() {}, callback);
  }

  /**
   * Creates a Greeting for a User
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Greeting>> postUserGreetingsAsync(ApiRequest<Greeting> request, AsyncApiCallback<ApiResponse<Greeting>> callback) throws ApiException {
    return pcapiClient.<Greeting>invokeAPIVerboseAsync(request, new TypeReference<Greeting>() {}, callback);
  }

  /**
   * Updates the Greeting with the given GreetingId
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Greeting> putGreetingAsync(PutGreetingRequest request, AsyncApiCallback<Greeting> callback) throws ApiException {
    return pcapiClient.<Greeting>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Greeting>() {}, callback);
  }

  /**
   * Updates the Greeting with the given GreetingId
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Greeting>> putGreetingAsync(ApiRequest<Greeting> request, AsyncApiCallback<ApiResponse<Greeting>> callback) throws ApiException {
    return pcapiClient.<Greeting>invokeAPIVerboseAsync(request, new TypeReference<Greeting>() {}, callback);
  }

  /**
   * Update an Organization&#39;s DefaultGreetingList
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DefaultGreetingList> putGreetingsDefaultsAsync(PutGreetingsDefaultsRequest request, AsyncApiCallback<DefaultGreetingList> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {}, callback);
  }

  /**
   * Update an Organization&#39;s DefaultGreetingList
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DefaultGreetingList>> putGreetingsDefaultsAsync(ApiRequest<DefaultGreetingList> request, AsyncApiCallback<ApiResponse<DefaultGreetingList>> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerboseAsync(request, new TypeReference<DefaultGreetingList>() {}, callback);
  }

  /**
   * Updates the DefaultGreetingList of the specified Group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DefaultGreetingList> putGroupGreetingsDefaultsAsync(PutGroupGreetingsDefaultsRequest request, AsyncApiCallback<DefaultGreetingList> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {}, callback);
  }

  /**
   * Updates the DefaultGreetingList of the specified Group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DefaultGreetingList>> putGroupGreetingsDefaultsAsync(ApiRequest<DefaultGreetingList> request, AsyncApiCallback<ApiResponse<DefaultGreetingList>> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerboseAsync(request, new TypeReference<DefaultGreetingList>() {}, callback);
  }

  /**
   * Updates the DefaultGreetingList of the specified User
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DefaultGreetingList> putUserGreetingsDefaultsAsync(PutUserGreetingsDefaultsRequest request, AsyncApiCallback<DefaultGreetingList> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {}, callback);
  }

  /**
   * Updates the DefaultGreetingList of the specified User
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DefaultGreetingList>> putUserGreetingsDefaultsAsync(ApiRequest<DefaultGreetingList> request, AsyncApiCallback<ApiResponse<DefaultGreetingList>> callback) throws ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerboseAsync(request, new TypeReference<DefaultGreetingList>() {}, callback);
  }

}
