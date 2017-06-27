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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GreetingsApi {
  private final ApiClient pcapiClient;

  public GreetingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GreetingsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Deletes a Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteGreeting(String greetingId) throws IOException, ApiException {
     deleteGreeting(createDeleteGreetingRequest(greetingId));
  }

  /**
   * Deletes a Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteGreetingWithHttpInfo(String greetingId) throws IOException {
    return deleteGreeting(createDeleteGreetingRequest(greetingId).withHttpInfo());
  }

  private DeleteGreetingRequest createDeleteGreetingRequest(String greetingId) {
    return DeleteGreetingRequest.builder()
            .withGreetingId(greetingId)
    
            .build();
  }

  /**
   * Deletes a Greeting with the given GreetingId
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteGreeting(DeleteGreetingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes a Greeting with the given GreetingId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteGreeting(ApiRequest<Void> request) throws IOException {
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
   * Get a Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @return Greeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Greeting getGreeting(String greetingId) throws IOException, ApiException {
    return  getGreeting(createGetGreetingRequest(greetingId));
  }

  /**
   * Get a Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @return Greeting
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Greeting> getGreetingWithHttpInfo(String greetingId) throws IOException {
    return getGreeting(createGetGreetingRequest(greetingId).withHttpInfo());
  }

  private GetGreetingRequest createGetGreetingRequest(String greetingId) {
    return GetGreetingRequest.builder()
            .withGreetingId(greetingId)
    
            .build();
  }

  /**
   * Get a Greeting with the given GreetingId
   * 
   * @param request The request object
   * @return Greeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Greeting getGreeting(GetGreetingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Greeting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Greeting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Greeting with the given GreetingId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Greeting> getGreeting(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Greeting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)exception;
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
      ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get media playback URI for this greeting
   * 
   * @param greetingId Greeting ID (required)
   * @param formatId The desired media format. (optional, default to WAV)
   * @return GreetingMediaInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GreetingMediaInfo getGreetingMedia(String greetingId, String formatId) throws IOException, ApiException {
    return  getGreetingMedia(createGetGreetingMediaRequest(greetingId, formatId));
  }

  /**
   * Get media playback URI for this greeting
   * 
   * @param greetingId Greeting ID (required)
   * @param formatId The desired media format. (optional, default to WAV)
   * @return GreetingMediaInfo
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GreetingMediaInfo> getGreetingMediaWithHttpInfo(String greetingId, String formatId) throws IOException {
    return getGreetingMedia(createGetGreetingMediaRequest(greetingId, formatId).withHttpInfo());
  }

  private GetGreetingMediaRequest createGetGreetingMediaRequest(String greetingId, String formatId) {
    return GetGreetingMediaRequest.builder()
            .withGreetingId(greetingId)
    
            .withFormatId(formatId)
    
            .build();
  }

  /**
   * Get media playback URI for this greeting
   * 
   * @param request The request object
   * @return GreetingMediaInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GreetingMediaInfo getGreetingMedia(GetGreetingMediaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GreetingMediaInfo> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GreetingMediaInfo>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get media playback URI for this greeting
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GreetingMediaInfo> getGreetingMedia(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GreetingMediaInfo>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GreetingMediaInfo> response = (ApiResponse<GreetingMediaInfo>)(ApiResponse<?>)exception;
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
      ApiResponse<GreetingMediaInfo> response = (ApiResponse<GreetingMediaInfo>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets an Organization&#39;s Greetings
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return DomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEntityListing getGreetings(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getGreetings(createGetGreetingsRequest(pageSize, pageNumber));
  }

  /**
   * Gets an Organization&#39;s Greetings
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return DomainEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEntityListing> getGreetingsWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getGreetings(createGetGreetingsRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetGreetingsRequest createGetGreetingsRequest(Integer pageSize, Integer pageNumber) {
    return GetGreetingsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Gets an Organization&#39;s Greetings
   * 
   * @param request The request object
   * @return DomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEntityListing getGreetings(GetGreetingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets an Organization&#39;s Greetings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEntityListing> getGreetings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainEntityListing> response = (ApiResponse<DomainEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainEntityListing> response = (ApiResponse<DomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get an Organization&#39;s DefaultGreetingList
   * 
   * @return DefaultGreetingList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DefaultGreetingList getGreetingsDefaults() throws IOException, ApiException {
    return  getGreetingsDefaults(createGetGreetingsDefaultsRequest());
  }

  /**
   * Get an Organization&#39;s DefaultGreetingList
   * 
   * @return DefaultGreetingList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DefaultGreetingList> getGreetingsDefaultsWithHttpInfo() throws IOException {
    return getGreetingsDefaults(createGetGreetingsDefaultsRequest().withHttpInfo());
  }

  private GetGreetingsDefaultsRequest createGetGreetingsDefaultsRequest() {
    return GetGreetingsDefaultsRequest.builder()
            .build();
  }

  /**
   * Get an Organization&#39;s DefaultGreetingList
   * 
   * @param request The request object
   * @return DefaultGreetingList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DefaultGreetingList getGreetingsDefaults(GetGreetingsDefaultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DefaultGreetingList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an Organization&#39;s DefaultGreetingList
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DefaultGreetingList> getGreetingsDefaults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DefaultGreetingList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)exception;
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
      ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of the Group&#39;s Greetings
   * 
   * @param groupId Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return GreetingListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GreetingListing getGroupGreetings(String groupId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getGroupGreetings(createGetGroupGreetingsRequest(groupId, pageSize, pageNumber));
  }

  /**
   * Get a list of the Group&#39;s Greetings
   * 
   * @param groupId Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return GreetingListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GreetingListing> getGroupGreetingsWithHttpInfo(String groupId, Integer pageSize, Integer pageNumber) throws IOException {
    return getGroupGreetings(createGetGroupGreetingsRequest(groupId, pageSize, pageNumber).withHttpInfo());
  }

  private GetGroupGreetingsRequest createGetGroupGreetingsRequest(String groupId, Integer pageSize, Integer pageNumber) {
    return GetGroupGreetingsRequest.builder()
            .withGroupId(groupId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of the Group&#39;s Greetings
   * 
   * @param request The request object
   * @return GreetingListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GreetingListing getGroupGreetings(GetGroupGreetingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GreetingListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GreetingListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of the Group&#39;s Greetings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GreetingListing> getGroupGreetings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GreetingListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GreetingListing> response = (ApiResponse<GreetingListing>)(ApiResponse<?>)exception;
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
      ApiResponse<GreetingListing> response = (ApiResponse<GreetingListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Grabs the list of Default Greetings given a Group&#39;s ID
   * 
   * @param groupId Group ID (required)
   * @return DefaultGreetingList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DefaultGreetingList getGroupGreetingsDefaults(String groupId) throws IOException, ApiException {
    return  getGroupGreetingsDefaults(createGetGroupGreetingsDefaultsRequest(groupId));
  }

  /**
   * Grabs the list of Default Greetings given a Group&#39;s ID
   * 
   * @param groupId Group ID (required)
   * @return DefaultGreetingList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DefaultGreetingList> getGroupGreetingsDefaultsWithHttpInfo(String groupId) throws IOException {
    return getGroupGreetingsDefaults(createGetGroupGreetingsDefaultsRequest(groupId).withHttpInfo());
  }

  private GetGroupGreetingsDefaultsRequest createGetGroupGreetingsDefaultsRequest(String groupId) {
    return GetGroupGreetingsDefaultsRequest.builder()
            .withGroupId(groupId)
    
            .build();
  }

  /**
   * Grabs the list of Default Greetings given a Group&#39;s ID
   * 
   * @param request The request object
   * @return DefaultGreetingList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DefaultGreetingList getGroupGreetingsDefaults(GetGroupGreetingsDefaultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DefaultGreetingList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Grabs the list of Default Greetings given a Group&#39;s ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DefaultGreetingList> getGroupGreetingsDefaults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DefaultGreetingList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)exception;
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
      ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of the User&#39;s Greetings
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return DomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEntityListing getUserGreetings(String userId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getUserGreetings(createGetUserGreetingsRequest(userId, pageSize, pageNumber));
  }

  /**
   * Get a list of the User&#39;s Greetings
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return DomainEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEntityListing> getUserGreetingsWithHttpInfo(String userId, Integer pageSize, Integer pageNumber) throws IOException {
    return getUserGreetings(createGetUserGreetingsRequest(userId, pageSize, pageNumber).withHttpInfo());
  }

  private GetUserGreetingsRequest createGetUserGreetingsRequest(String userId, Integer pageSize, Integer pageNumber) {
    return GetUserGreetingsRequest.builder()
            .withUserId(userId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of the User&#39;s Greetings
   * 
   * @param request The request object
   * @return DomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEntityListing getUserGreetings(GetUserGreetingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of the User&#39;s Greetings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEntityListing> getUserGreetings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainEntityListing> response = (ApiResponse<DomainEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainEntityListing> response = (ApiResponse<DomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Grabs the list of Default Greetings given a User&#39;s ID
   * 
   * @param userId User ID (required)
   * @return DefaultGreetingList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DefaultGreetingList getUserGreetingsDefaults(String userId) throws IOException, ApiException {
    return  getUserGreetingsDefaults(createGetUserGreetingsDefaultsRequest(userId));
  }

  /**
   * Grabs the list of Default Greetings given a User&#39;s ID
   * 
   * @param userId User ID (required)
   * @return DefaultGreetingList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DefaultGreetingList> getUserGreetingsDefaultsWithHttpInfo(String userId) throws IOException {
    return getUserGreetingsDefaults(createGetUserGreetingsDefaultsRequest(userId).withHttpInfo());
  }

  private GetUserGreetingsDefaultsRequest createGetUserGreetingsDefaultsRequest(String userId) {
    return GetUserGreetingsDefaultsRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Grabs the list of Default Greetings given a User&#39;s ID
   * 
   * @param request The request object
   * @return DefaultGreetingList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DefaultGreetingList getUserGreetingsDefaults(GetUserGreetingsDefaultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DefaultGreetingList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Grabs the list of Default Greetings given a User&#39;s ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DefaultGreetingList> getUserGreetingsDefaults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DefaultGreetingList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)exception;
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
      ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a Greeting for an Organization
   * 
   * @param body The Greeting to create (required)
   * @return Greeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Greeting postGreetings(Greeting body) throws IOException, ApiException {
    return  postGreetings(createPostGreetingsRequest(body));
  }

  /**
   * Create a Greeting for an Organization
   * 
   * @param body The Greeting to create (required)
   * @return Greeting
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Greeting> postGreetingsWithHttpInfo(Greeting body) throws IOException {
    return postGreetings(createPostGreetingsRequest(body).withHttpInfo());
  }

  private PostGreetingsRequest createPostGreetingsRequest(Greeting body) {
    return PostGreetingsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a Greeting for an Organization
   * 
   * @param request The request object
   * @return Greeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Greeting postGreetings(PostGreetingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Greeting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Greeting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Greeting for an Organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Greeting> postGreetings(ApiRequest<Greeting> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Greeting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)exception;
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
      ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates a Greeting for a Group
   * 
   * @param groupId Group ID (required)
   * @param body The Greeting to create (required)
   * @return Greeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Greeting postGroupGreetings(String groupId, Greeting body) throws IOException, ApiException {
    return  postGroupGreetings(createPostGroupGreetingsRequest(groupId, body));
  }

  /**
   * Creates a Greeting for a Group
   * 
   * @param groupId Group ID (required)
   * @param body The Greeting to create (required)
   * @return Greeting
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Greeting> postGroupGreetingsWithHttpInfo(String groupId, Greeting body) throws IOException {
    return postGroupGreetings(createPostGroupGreetingsRequest(groupId, body).withHttpInfo());
  }

  private PostGroupGreetingsRequest createPostGroupGreetingsRequest(String groupId, Greeting body) {
    return PostGroupGreetingsRequest.builder()
            .withGroupId(groupId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Creates a Greeting for a Group
   * 
   * @param request The request object
   * @return Greeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Greeting postGroupGreetings(PostGroupGreetingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Greeting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Greeting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a Greeting for a Group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Greeting> postGroupGreetings(ApiRequest<Greeting> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Greeting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)exception;
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
      ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates a Greeting for a User
   * 
   * @param userId User ID (required)
   * @param body The Greeting to create (required)
   * @return Greeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Greeting postUserGreetings(String userId, Greeting body) throws IOException, ApiException {
    return  postUserGreetings(createPostUserGreetingsRequest(userId, body));
  }

  /**
   * Creates a Greeting for a User
   * 
   * @param userId User ID (required)
   * @param body The Greeting to create (required)
   * @return Greeting
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Greeting> postUserGreetingsWithHttpInfo(String userId, Greeting body) throws IOException {
    return postUserGreetings(createPostUserGreetingsRequest(userId, body).withHttpInfo());
  }

  private PostUserGreetingsRequest createPostUserGreetingsRequest(String userId, Greeting body) {
    return PostUserGreetingsRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Creates a Greeting for a User
   * 
   * @param request The request object
   * @return Greeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Greeting postUserGreetings(PostUserGreetingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Greeting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Greeting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a Greeting for a User
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Greeting> postUserGreetings(ApiRequest<Greeting> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Greeting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)exception;
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
      ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Updates the Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @param body The updated Greeting (required)
   * @return Greeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Greeting putGreeting(String greetingId, Greeting body) throws IOException, ApiException {
    return  putGreeting(createPutGreetingRequest(greetingId, body));
  }

  /**
   * Updates the Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @param body The updated Greeting (required)
   * @return Greeting
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Greeting> putGreetingWithHttpInfo(String greetingId, Greeting body) throws IOException {
    return putGreeting(createPutGreetingRequest(greetingId, body).withHttpInfo());
  }

  private PutGreetingRequest createPutGreetingRequest(String greetingId, Greeting body) {
    return PutGreetingRequest.builder()
            .withGreetingId(greetingId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Updates the Greeting with the given GreetingId
   * 
   * @param request The request object
   * @return Greeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Greeting putGreeting(PutGreetingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Greeting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Greeting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates the Greeting with the given GreetingId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Greeting> putGreeting(ApiRequest<Greeting> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Greeting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)exception;
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
      ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an Organization&#39;s DefaultGreetingList
   * 
   * @param body The updated defaultGreetingList (required)
   * @return DefaultGreetingList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DefaultGreetingList putGreetingsDefaults(DefaultGreetingList body) throws IOException, ApiException {
    return  putGreetingsDefaults(createPutGreetingsDefaultsRequest(body));
  }

  /**
   * Update an Organization&#39;s DefaultGreetingList
   * 
   * @param body The updated defaultGreetingList (required)
   * @return DefaultGreetingList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DefaultGreetingList> putGreetingsDefaultsWithHttpInfo(DefaultGreetingList body) throws IOException {
    return putGreetingsDefaults(createPutGreetingsDefaultsRequest(body).withHttpInfo());
  }

  private PutGreetingsDefaultsRequest createPutGreetingsDefaultsRequest(DefaultGreetingList body) {
    return PutGreetingsDefaultsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update an Organization&#39;s DefaultGreetingList
   * 
   * @param request The request object
   * @return DefaultGreetingList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DefaultGreetingList putGreetingsDefaults(PutGreetingsDefaultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DefaultGreetingList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an Organization&#39;s DefaultGreetingList
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DefaultGreetingList> putGreetingsDefaults(ApiRequest<DefaultGreetingList> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DefaultGreetingList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)exception;
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
      ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Updates the DefaultGreetingList of the specified Group
   * 
   * @param groupId Group ID (required)
   * @param body The updated defaultGreetingList (required)
   * @return DefaultGreetingList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DefaultGreetingList putGroupGreetingsDefaults(String groupId, DefaultGreetingList body) throws IOException, ApiException {
    return  putGroupGreetingsDefaults(createPutGroupGreetingsDefaultsRequest(groupId, body));
  }

  /**
   * Updates the DefaultGreetingList of the specified Group
   * 
   * @param groupId Group ID (required)
   * @param body The updated defaultGreetingList (required)
   * @return DefaultGreetingList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DefaultGreetingList> putGroupGreetingsDefaultsWithHttpInfo(String groupId, DefaultGreetingList body) throws IOException {
    return putGroupGreetingsDefaults(createPutGroupGreetingsDefaultsRequest(groupId, body).withHttpInfo());
  }

  private PutGroupGreetingsDefaultsRequest createPutGroupGreetingsDefaultsRequest(String groupId, DefaultGreetingList body) {
    return PutGroupGreetingsDefaultsRequest.builder()
            .withGroupId(groupId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Updates the DefaultGreetingList of the specified Group
   * 
   * @param request The request object
   * @return DefaultGreetingList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DefaultGreetingList putGroupGreetingsDefaults(PutGroupGreetingsDefaultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DefaultGreetingList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates the DefaultGreetingList of the specified Group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DefaultGreetingList> putGroupGreetingsDefaults(ApiRequest<DefaultGreetingList> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DefaultGreetingList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)exception;
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
      ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Updates the DefaultGreetingList of the specified User
   * 
   * @param userId User ID (required)
   * @param body The updated defaultGreetingList (required)
   * @return DefaultGreetingList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DefaultGreetingList putUserGreetingsDefaults(String userId, DefaultGreetingList body) throws IOException, ApiException {
    return  putUserGreetingsDefaults(createPutUserGreetingsDefaultsRequest(userId, body));
  }

  /**
   * Updates the DefaultGreetingList of the specified User
   * 
   * @param userId User ID (required)
   * @param body The updated defaultGreetingList (required)
   * @return DefaultGreetingList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DefaultGreetingList> putUserGreetingsDefaultsWithHttpInfo(String userId, DefaultGreetingList body) throws IOException {
    return putUserGreetingsDefaults(createPutUserGreetingsDefaultsRequest(userId, body).withHttpInfo());
  }

  private PutUserGreetingsDefaultsRequest createPutUserGreetingsDefaultsRequest(String userId, DefaultGreetingList body) {
    return PutUserGreetingsDefaultsRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Updates the DefaultGreetingList of the specified User
   * 
   * @param request The request object
   * @return DefaultGreetingList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DefaultGreetingList putUserGreetingsDefaults(PutUserGreetingsDefaultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DefaultGreetingList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates the DefaultGreetingList of the specified User
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DefaultGreetingList> putUserGreetingsDefaults(ApiRequest<DefaultGreetingList> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DefaultGreetingList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)exception;
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
      ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
