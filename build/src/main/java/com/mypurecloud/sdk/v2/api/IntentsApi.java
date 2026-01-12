package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.BulkAddSourceIntentsRequest;
import com.mypurecloud.sdk.v2.model.BulkRemoveSourceIntentsRequest;
import com.mypurecloud.sdk.v2.model.BulkSourceIntentsResponse;
import com.mypurecloud.sdk.v2.model.CustomerIntent;
import com.mypurecloud.sdk.v2.model.CustomerIntentAssignmentListing;
import com.mypurecloud.sdk.v2.model.CustomerIntentAssignmentRequest;
import com.mypurecloud.sdk.v2.model.CustomerIntentAssignmentResponse;
import com.mypurecloud.sdk.v2.model.CustomerIntentListing;
import com.mypurecloud.sdk.v2.model.CustomerIntentPatch;
import com.mypurecloud.sdk.v2.model.CustomerIntentResponse;
import com.mypurecloud.sdk.v2.model.CustomerSourceIntentListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.IntentsCategory;
import com.mypurecloud.sdk.v2.model.IntentsCategoryListing;
import com.mypurecloud.sdk.v2.model.IntentsCategoryPatch;


import com.mypurecloud.sdk.v2.api.request.DeleteIntentsCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIntentsCustomerintentRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsAssignmentsExternalcontactRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsCustomerintentRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsCustomerintentSourceintentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsCustomerintentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsSourceintentsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntentsCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntentsCustomerintentRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntentsAssignmentsExternalcontactCustomerintentAssignmentRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntentsCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntentsCustomerintentSourceintentsBulkAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntentsCustomerintentSourceintentsBulkRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntentsCustomerintentsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntentsApi {
  private final ApiClient pcapiClient;

  public IntentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IntentsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete category for categoryId
   * 
   * @param categoryId Category id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntentsCategory(String categoryId) throws IOException, ApiException {
     deleteIntentsCategory(createDeleteIntentsCategoryRequest(categoryId));
  }

  /**
   * Delete category for categoryId
   * 
   * @param categoryId Category id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntentsCategoryWithHttpInfo(String categoryId) throws IOException {
    return deleteIntentsCategory(createDeleteIntentsCategoryRequest(categoryId).withHttpInfo());
  }

  private DeleteIntentsCategoryRequest createDeleteIntentsCategoryRequest(String categoryId) {
    return DeleteIntentsCategoryRequest.builder()
            .withCategoryId(categoryId)

            .build();
  }

  /**
   * Delete category for categoryId
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntentsCategory(DeleteIntentsCategoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete category for categoryId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntentsCategory(ApiRequest<Void> request) throws IOException {
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
   * Delete customer intent for customerIntentId
   * 
   * @param customerIntentId Customer Intent id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntentsCustomerintent(String customerIntentId) throws IOException, ApiException {
     deleteIntentsCustomerintent(createDeleteIntentsCustomerintentRequest(customerIntentId));
  }

  /**
   * Delete customer intent for customerIntentId
   * 
   * @param customerIntentId Customer Intent id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntentsCustomerintentWithHttpInfo(String customerIntentId) throws IOException {
    return deleteIntentsCustomerintent(createDeleteIntentsCustomerintentRequest(customerIntentId).withHttpInfo());
  }

  private DeleteIntentsCustomerintentRequest createDeleteIntentsCustomerintentRequest(String customerIntentId) {
    return DeleteIntentsCustomerintentRequest.builder()
            .withCustomerIntentId(customerIntentId)

            .build();
  }

  /**
   * Delete customer intent for customerIntentId
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntentsCustomerintent(DeleteIntentsCustomerintentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete customer intent for customerIntentId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntentsCustomerintent(ApiRequest<Void> request) throws IOException {
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
   * Get customer intent assignments for externalContactId
   * 
   * @param externalContactId External Contact id (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @return CustomerIntentAssignmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerIntentAssignmentListing getIntentsAssignmentsExternalcontact(String externalContactId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getIntentsAssignmentsExternalcontact(createGetIntentsAssignmentsExternalcontactRequest(externalContactId, pageSize, pageNumber));
  }

  /**
   * Get customer intent assignments for externalContactId
   * 
   * @param externalContactId External Contact id (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @return CustomerIntentAssignmentListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerIntentAssignmentListing> getIntentsAssignmentsExternalcontactWithHttpInfo(String externalContactId, Integer pageSize, Integer pageNumber) throws IOException {
    return getIntentsAssignmentsExternalcontact(createGetIntentsAssignmentsExternalcontactRequest(externalContactId, pageSize, pageNumber).withHttpInfo());
  }

  private GetIntentsAssignmentsExternalcontactRequest createGetIntentsAssignmentsExternalcontactRequest(String externalContactId, Integer pageSize, Integer pageNumber) {
    return GetIntentsAssignmentsExternalcontactRequest.builder()
            .withExternalContactId(externalContactId)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Get customer intent assignments for externalContactId
   * 
   * @param request The request object
   * @return CustomerIntentAssignmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerIntentAssignmentListing getIntentsAssignmentsExternalcontact(GetIntentsAssignmentsExternalcontactRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CustomerIntentAssignmentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CustomerIntentAssignmentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get customer intent assignments for externalContactId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerIntentAssignmentListing> getIntentsAssignmentsExternalcontact(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CustomerIntentAssignmentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CustomerIntentAssignmentListing> response = (ApiResponse<CustomerIntentAssignmentListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CustomerIntentAssignmentListing> response = (ApiResponse<CustomerIntentAssignmentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get categories
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param queryValue Search query value to filter results by (optional)
   * @return IntentsCategoryListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntentsCategoryListing getIntentsCategories(Integer pageSize, Integer pageNumber, String queryValue) throws IOException, ApiException {
    return  getIntentsCategories(createGetIntentsCategoriesRequest(pageSize, pageNumber, queryValue));
  }

  /**
   * Get categories
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param queryValue Search query value to filter results by (optional)
   * @return IntentsCategoryListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntentsCategoryListing> getIntentsCategoriesWithHttpInfo(Integer pageSize, Integer pageNumber, String queryValue) throws IOException {
    return getIntentsCategories(createGetIntentsCategoriesRequest(pageSize, pageNumber, queryValue).withHttpInfo());
  }

  private GetIntentsCategoriesRequest createGetIntentsCategoriesRequest(Integer pageSize, Integer pageNumber, String queryValue) {
    return GetIntentsCategoriesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withQueryValue(queryValue)

            .build();
  }

  /**
   * Get categories
   * 
   * @param request The request object
   * @return IntentsCategoryListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntentsCategoryListing getIntentsCategories(GetIntentsCategoriesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntentsCategoryListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntentsCategoryListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get categories
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntentsCategoryListing> getIntentsCategories(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntentsCategoryListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntentsCategoryListing> response = (ApiResponse<IntentsCategoryListing>)(ApiResponse<?>)exception;
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
      ApiResponse<IntentsCategoryListing> response = (ApiResponse<IntentsCategoryListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get category for categoryId
   * 
   * @param categoryId Category id (required)
   * @return IntentsCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntentsCategory getIntentsCategory(String categoryId) throws IOException, ApiException {
    return  getIntentsCategory(createGetIntentsCategoryRequest(categoryId));
  }

  /**
   * Get category for categoryId
   * 
   * @param categoryId Category id (required)
   * @return IntentsCategory
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntentsCategory> getIntentsCategoryWithHttpInfo(String categoryId) throws IOException {
    return getIntentsCategory(createGetIntentsCategoryRequest(categoryId).withHttpInfo());
  }

  private GetIntentsCategoryRequest createGetIntentsCategoryRequest(String categoryId) {
    return GetIntentsCategoryRequest.builder()
            .withCategoryId(categoryId)

            .build();
  }

  /**
   * Get category for categoryId
   * 
   * @param request The request object
   * @return IntentsCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntentsCategory getIntentsCategory(GetIntentsCategoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntentsCategory> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntentsCategory>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get category for categoryId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntentsCategory> getIntentsCategory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntentsCategory>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntentsCategory> response = (ApiResponse<IntentsCategory>)(ApiResponse<?>)exception;
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
      ApiResponse<IntentsCategory> response = (ApiResponse<IntentsCategory>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get customer intent for customerIntentId
   * 
   * @param customerIntentId Customer Intent id (required)
   * @return CustomerIntentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerIntentResponse getIntentsCustomerintent(String customerIntentId) throws IOException, ApiException {
    return  getIntentsCustomerintent(createGetIntentsCustomerintentRequest(customerIntentId));
  }

  /**
   * Get customer intent for customerIntentId
   * 
   * @param customerIntentId Customer Intent id (required)
   * @return CustomerIntentResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerIntentResponse> getIntentsCustomerintentWithHttpInfo(String customerIntentId) throws IOException {
    return getIntentsCustomerintent(createGetIntentsCustomerintentRequest(customerIntentId).withHttpInfo());
  }

  private GetIntentsCustomerintentRequest createGetIntentsCustomerintentRequest(String customerIntentId) {
    return GetIntentsCustomerintentRequest.builder()
            .withCustomerIntentId(customerIntentId)

            .build();
  }

  /**
   * Get customer intent for customerIntentId
   * 
   * @param request The request object
   * @return CustomerIntentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerIntentResponse getIntentsCustomerintent(GetIntentsCustomerintentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CustomerIntentResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CustomerIntentResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get customer intent for customerIntentId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerIntentResponse> getIntentsCustomerintent(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CustomerIntentResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CustomerIntentResponse> response = (ApiResponse<CustomerIntentResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CustomerIntentResponse> response = (ApiResponse<CustomerIntentResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get source intents mapped to a customer intent
   * 
   * @param customerIntentId Customer Intent id (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param queryValue Search query value to filter results by (optional)
   * @return CustomerSourceIntentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerSourceIntentListing getIntentsCustomerintentSourceintents(String customerIntentId, Integer pageSize, Integer pageNumber, String queryValue) throws IOException, ApiException {
    return  getIntentsCustomerintentSourceintents(createGetIntentsCustomerintentSourceintentsRequest(customerIntentId, pageSize, pageNumber, queryValue));
  }

  /**
   * Get source intents mapped to a customer intent
   * 
   * @param customerIntentId Customer Intent id (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param queryValue Search query value to filter results by (optional)
   * @return CustomerSourceIntentListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerSourceIntentListing> getIntentsCustomerintentSourceintentsWithHttpInfo(String customerIntentId, Integer pageSize, Integer pageNumber, String queryValue) throws IOException {
    return getIntentsCustomerintentSourceintents(createGetIntentsCustomerintentSourceintentsRequest(customerIntentId, pageSize, pageNumber, queryValue).withHttpInfo());
  }

  private GetIntentsCustomerintentSourceintentsRequest createGetIntentsCustomerintentSourceintentsRequest(String customerIntentId, Integer pageSize, Integer pageNumber, String queryValue) {
    return GetIntentsCustomerintentSourceintentsRequest.builder()
            .withCustomerIntentId(customerIntentId)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withQueryValue(queryValue)

            .build();
  }

  /**
   * Get source intents mapped to a customer intent
   * 
   * @param request The request object
   * @return CustomerSourceIntentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerSourceIntentListing getIntentsCustomerintentSourceintents(GetIntentsCustomerintentSourceintentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CustomerSourceIntentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CustomerSourceIntentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get source intents mapped to a customer intent
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerSourceIntentListing> getIntentsCustomerintentSourceintents(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CustomerSourceIntentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CustomerSourceIntentListing> response = (ApiResponse<CustomerSourceIntentListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CustomerSourceIntentListing> response = (ApiResponse<CustomerSourceIntentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get customer intents
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param queryValue Search query value to filter results by (optional)
   * @param categoryId CategoryId to filter query by (optional)
   * @return CustomerIntentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerIntentListing getIntentsCustomerintents(Integer pageSize, Integer pageNumber, String queryValue, String categoryId) throws IOException, ApiException {
    return  getIntentsCustomerintents(createGetIntentsCustomerintentsRequest(pageSize, pageNumber, queryValue, categoryId));
  }

  /**
   * Get customer intents
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param queryValue Search query value to filter results by (optional)
   * @param categoryId CategoryId to filter query by (optional)
   * @return CustomerIntentListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerIntentListing> getIntentsCustomerintentsWithHttpInfo(Integer pageSize, Integer pageNumber, String queryValue, String categoryId) throws IOException {
    return getIntentsCustomerintents(createGetIntentsCustomerintentsRequest(pageSize, pageNumber, queryValue, categoryId).withHttpInfo());
  }

  private GetIntentsCustomerintentsRequest createGetIntentsCustomerintentsRequest(Integer pageSize, Integer pageNumber, String queryValue, String categoryId) {
    return GetIntentsCustomerintentsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withQueryValue(queryValue)

            .withCategoryId(categoryId)

            .build();
  }

  /**
   * Get customer intents
   * 
   * @param request The request object
   * @return CustomerIntentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerIntentListing getIntentsCustomerintents(GetIntentsCustomerintentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CustomerIntentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CustomerIntentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get customer intents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerIntentListing> getIntentsCustomerintents(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CustomerIntentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CustomerIntentListing> response = (ApiResponse<CustomerIntentListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CustomerIntentListing> response = (ApiResponse<CustomerIntentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all mapped source intents by type. If no type selected default is type Segment
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param type Source Type to query by. If none selected default response will be for type Segment. (optional)
   * @param sourceId Source Id to query by. Only required for sourceType: Copilot, Bot, Digitalbot (optional)
   * @return CustomerSourceIntentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerSourceIntentListing getIntentsSourceintents(Integer pageSize, Integer pageNumber, String type, String sourceId) throws IOException, ApiException {
    return  getIntentsSourceintents(createGetIntentsSourceintentsRequest(pageSize, pageNumber, type, sourceId));
  }

  /**
   * Get all mapped source intents by type. If no type selected default is type Segment
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param type Source Type to query by. If none selected default response will be for type Segment. (optional)
   * @param sourceId Source Id to query by. Only required for sourceType: Copilot, Bot, Digitalbot (optional)
   * @return CustomerSourceIntentListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerSourceIntentListing> getIntentsSourceintentsWithHttpInfo(Integer pageSize, Integer pageNumber, String type, String sourceId) throws IOException {
    return getIntentsSourceintents(createGetIntentsSourceintentsRequest(pageSize, pageNumber, type, sourceId).withHttpInfo());
  }

  private GetIntentsSourceintentsRequest createGetIntentsSourceintentsRequest(Integer pageSize, Integer pageNumber, String type, String sourceId) {
    return GetIntentsSourceintentsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withType(type)

            .withSourceId(sourceId)

            .build();
  }

  /**
   * Get all mapped source intents by type. If no type selected default is type Segment
   * 
   * @param request The request object
   * @return CustomerSourceIntentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerSourceIntentListing getIntentsSourceintents(GetIntentsSourceintentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CustomerSourceIntentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CustomerSourceIntentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all mapped source intents by type. If no type selected default is type Segment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerSourceIntentListing> getIntentsSourceintents(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CustomerSourceIntentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CustomerSourceIntentListing> response = (ApiResponse<CustomerSourceIntentListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CustomerSourceIntentListing> response = (ApiResponse<CustomerSourceIntentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Patch category for categoryId
   * 
   * @param categoryId Category id (required)
   * @param body category (required)
   * @return IntentsCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntentsCategory patchIntentsCategory(String categoryId, IntentsCategoryPatch body) throws IOException, ApiException {
    return  patchIntentsCategory(createPatchIntentsCategoryRequest(categoryId, body));
  }

  /**
   * Patch category for categoryId
   * 
   * @param categoryId Category id (required)
   * @param body category (required)
   * @return IntentsCategory
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntentsCategory> patchIntentsCategoryWithHttpInfo(String categoryId, IntentsCategoryPatch body) throws IOException {
    return patchIntentsCategory(createPatchIntentsCategoryRequest(categoryId, body).withHttpInfo());
  }

  private PatchIntentsCategoryRequest createPatchIntentsCategoryRequest(String categoryId, IntentsCategoryPatch body) {
    return PatchIntentsCategoryRequest.builder()
            .withCategoryId(categoryId)

            .withBody(body)

            .build();
  }

  /**
   * Patch category for categoryId
   * 
   * @param request The request object
   * @return IntentsCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntentsCategory patchIntentsCategory(PatchIntentsCategoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntentsCategory> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntentsCategory>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch category for categoryId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntentsCategory> patchIntentsCategory(ApiRequest<IntentsCategoryPatch> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntentsCategory>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntentsCategory> response = (ApiResponse<IntentsCategory>)(ApiResponse<?>)exception;
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
      ApiResponse<IntentsCategory> response = (ApiResponse<IntentsCategory>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Patch customer intent for customerIntentId
   * 
   * @param customerIntentId Customer Intent id (required)
   * @param body Customer intent (required)
   * @return CustomerIntentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerIntentResponse patchIntentsCustomerintent(String customerIntentId, CustomerIntentPatch body) throws IOException, ApiException {
    return  patchIntentsCustomerintent(createPatchIntentsCustomerintentRequest(customerIntentId, body));
  }

  /**
   * Patch customer intent for customerIntentId
   * 
   * @param customerIntentId Customer Intent id (required)
   * @param body Customer intent (required)
   * @return CustomerIntentResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerIntentResponse> patchIntentsCustomerintentWithHttpInfo(String customerIntentId, CustomerIntentPatch body) throws IOException {
    return patchIntentsCustomerintent(createPatchIntentsCustomerintentRequest(customerIntentId, body).withHttpInfo());
  }

  private PatchIntentsCustomerintentRequest createPatchIntentsCustomerintentRequest(String customerIntentId, CustomerIntentPatch body) {
    return PatchIntentsCustomerintentRequest.builder()
            .withCustomerIntentId(customerIntentId)

            .withBody(body)

            .build();
  }

  /**
   * Patch customer intent for customerIntentId
   * 
   * @param request The request object
   * @return CustomerIntentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerIntentResponse patchIntentsCustomerintent(PatchIntentsCustomerintentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CustomerIntentResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CustomerIntentResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch customer intent for customerIntentId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerIntentResponse> patchIntentsCustomerintent(ApiRequest<CustomerIntentPatch> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CustomerIntentResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CustomerIntentResponse> response = (ApiResponse<CustomerIntentResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CustomerIntentResponse> response = (ApiResponse<CustomerIntentResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create customer intent assignment for external contact
   * 
   * @param externalContactId External Contact id (required)
   * @param customerIntentId Customer Intent id (required)
   * @param body Customer intent assignment (required)
   * @return CustomerIntentAssignmentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerIntentAssignmentResponse postIntentsAssignmentsExternalcontactCustomerintentAssignment(String externalContactId, String customerIntentId, CustomerIntentAssignmentRequest body) throws IOException, ApiException {
    return  postIntentsAssignmentsExternalcontactCustomerintentAssignment(createPostIntentsAssignmentsExternalcontactCustomerintentAssignmentRequest(externalContactId, customerIntentId, body));
  }

  /**
   * Create customer intent assignment for external contact
   * 
   * @param externalContactId External Contact id (required)
   * @param customerIntentId Customer Intent id (required)
   * @param body Customer intent assignment (required)
   * @return CustomerIntentAssignmentResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerIntentAssignmentResponse> postIntentsAssignmentsExternalcontactCustomerintentAssignmentWithHttpInfo(String externalContactId, String customerIntentId, CustomerIntentAssignmentRequest body) throws IOException {
    return postIntentsAssignmentsExternalcontactCustomerintentAssignment(createPostIntentsAssignmentsExternalcontactCustomerintentAssignmentRequest(externalContactId, customerIntentId, body).withHttpInfo());
  }

  private PostIntentsAssignmentsExternalcontactCustomerintentAssignmentRequest createPostIntentsAssignmentsExternalcontactCustomerintentAssignmentRequest(String externalContactId, String customerIntentId, CustomerIntentAssignmentRequest body) {
    return PostIntentsAssignmentsExternalcontactCustomerintentAssignmentRequest.builder()
            .withExternalContactId(externalContactId)

            .withCustomerIntentId(customerIntentId)

            .withBody(body)

            .build();
  }

  /**
   * Create customer intent assignment for external contact
   * 
   * @param request The request object
   * @return CustomerIntentAssignmentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerIntentAssignmentResponse postIntentsAssignmentsExternalcontactCustomerintentAssignment(PostIntentsAssignmentsExternalcontactCustomerintentAssignmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CustomerIntentAssignmentResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CustomerIntentAssignmentResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create customer intent assignment for external contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerIntentAssignmentResponse> postIntentsAssignmentsExternalcontactCustomerintentAssignment(ApiRequest<CustomerIntentAssignmentRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CustomerIntentAssignmentResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CustomerIntentAssignmentResponse> response = (ApiResponse<CustomerIntentAssignmentResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CustomerIntentAssignmentResponse> response = (ApiResponse<CustomerIntentAssignmentResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create category
   * 
   * @param body category (required)
   * @return IntentsCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntentsCategory postIntentsCategories(IntentsCategory body) throws IOException, ApiException {
    return  postIntentsCategories(createPostIntentsCategoriesRequest(body));
  }

  /**
   * Create category
   * 
   * @param body category (required)
   * @return IntentsCategory
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntentsCategory> postIntentsCategoriesWithHttpInfo(IntentsCategory body) throws IOException {
    return postIntentsCategories(createPostIntentsCategoriesRequest(body).withHttpInfo());
  }

  private PostIntentsCategoriesRequest createPostIntentsCategoriesRequest(IntentsCategory body) {
    return PostIntentsCategoriesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create category
   * 
   * @param request The request object
   * @return IntentsCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntentsCategory postIntentsCategories(PostIntentsCategoriesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntentsCategory> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntentsCategory>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create category
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntentsCategory> postIntentsCategories(ApiRequest<IntentsCategory> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntentsCategory>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntentsCategory> response = (ApiResponse<IntentsCategory>)(ApiResponse<?>)exception;
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
      ApiResponse<IntentsCategory> response = (ApiResponse<IntentsCategory>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Bulk add source intents to a customer intent
   * 
   * @param customerIntentId Customer Intent id (required)
   * @param body Source intents to be added (required)
   * @return BulkSourceIntentsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkSourceIntentsResponse postIntentsCustomerintentSourceintentsBulkAdd(String customerIntentId, BulkAddSourceIntentsRequest body) throws IOException, ApiException {
    return  postIntentsCustomerintentSourceintentsBulkAdd(createPostIntentsCustomerintentSourceintentsBulkAddRequest(customerIntentId, body));
  }

  /**
   * Bulk add source intents to a customer intent
   * 
   * @param customerIntentId Customer Intent id (required)
   * @param body Source intents to be added (required)
   * @return BulkSourceIntentsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkSourceIntentsResponse> postIntentsCustomerintentSourceintentsBulkAddWithHttpInfo(String customerIntentId, BulkAddSourceIntentsRequest body) throws IOException {
    return postIntentsCustomerintentSourceintentsBulkAdd(createPostIntentsCustomerintentSourceintentsBulkAddRequest(customerIntentId, body).withHttpInfo());
  }

  private PostIntentsCustomerintentSourceintentsBulkAddRequest createPostIntentsCustomerintentSourceintentsBulkAddRequest(String customerIntentId, BulkAddSourceIntentsRequest body) {
    return PostIntentsCustomerintentSourceintentsBulkAddRequest.builder()
            .withCustomerIntentId(customerIntentId)

            .withBody(body)

            .build();
  }

  /**
   * Bulk add source intents to a customer intent
   * 
   * @param request The request object
   * @return BulkSourceIntentsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkSourceIntentsResponse postIntentsCustomerintentSourceintentsBulkAdd(PostIntentsCustomerintentSourceintentsBulkAddRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkSourceIntentsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkSourceIntentsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk add source intents to a customer intent
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkSourceIntentsResponse> postIntentsCustomerintentSourceintentsBulkAdd(ApiRequest<BulkAddSourceIntentsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkSourceIntentsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkSourceIntentsResponse> response = (ApiResponse<BulkSourceIntentsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkSourceIntentsResponse> response = (ApiResponse<BulkSourceIntentsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Bulk remove source intents mapped to a customer intent
   * 
   * @param customerIntentId Customer Intent id (required)
   * @param body Source intents to be removed (required)
   * @return BulkSourceIntentsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkSourceIntentsResponse postIntentsCustomerintentSourceintentsBulkRemove(String customerIntentId, BulkRemoveSourceIntentsRequest body) throws IOException, ApiException {
    return  postIntentsCustomerintentSourceintentsBulkRemove(createPostIntentsCustomerintentSourceintentsBulkRemoveRequest(customerIntentId, body));
  }

  /**
   * Bulk remove source intents mapped to a customer intent
   * 
   * @param customerIntentId Customer Intent id (required)
   * @param body Source intents to be removed (required)
   * @return BulkSourceIntentsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkSourceIntentsResponse> postIntentsCustomerintentSourceintentsBulkRemoveWithHttpInfo(String customerIntentId, BulkRemoveSourceIntentsRequest body) throws IOException {
    return postIntentsCustomerintentSourceintentsBulkRemove(createPostIntentsCustomerintentSourceintentsBulkRemoveRequest(customerIntentId, body).withHttpInfo());
  }

  private PostIntentsCustomerintentSourceintentsBulkRemoveRequest createPostIntentsCustomerintentSourceintentsBulkRemoveRequest(String customerIntentId, BulkRemoveSourceIntentsRequest body) {
    return PostIntentsCustomerintentSourceintentsBulkRemoveRequest.builder()
            .withCustomerIntentId(customerIntentId)

            .withBody(body)

            .build();
  }

  /**
   * Bulk remove source intents mapped to a customer intent
   * 
   * @param request The request object
   * @return BulkSourceIntentsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkSourceIntentsResponse postIntentsCustomerintentSourceintentsBulkRemove(PostIntentsCustomerintentSourceintentsBulkRemoveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkSourceIntentsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkSourceIntentsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk remove source intents mapped to a customer intent
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkSourceIntentsResponse> postIntentsCustomerintentSourceintentsBulkRemove(ApiRequest<BulkRemoveSourceIntentsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkSourceIntentsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkSourceIntentsResponse> response = (ApiResponse<BulkSourceIntentsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkSourceIntentsResponse> response = (ApiResponse<BulkSourceIntentsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create customer intents
   * 
   * @param body Customer intent (required)
   * @return CustomerIntentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerIntentResponse postIntentsCustomerintents(CustomerIntent body) throws IOException, ApiException {
    return  postIntentsCustomerintents(createPostIntentsCustomerintentsRequest(body));
  }

  /**
   * Create customer intents
   * 
   * @param body Customer intent (required)
   * @return CustomerIntentResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerIntentResponse> postIntentsCustomerintentsWithHttpInfo(CustomerIntent body) throws IOException {
    return postIntentsCustomerintents(createPostIntentsCustomerintentsRequest(body).withHttpInfo());
  }

  private PostIntentsCustomerintentsRequest createPostIntentsCustomerintentsRequest(CustomerIntent body) {
    return PostIntentsCustomerintentsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create customer intents
   * 
   * @param request The request object
   * @return CustomerIntentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerIntentResponse postIntentsCustomerintents(PostIntentsCustomerintentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CustomerIntentResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CustomerIntentResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create customer intents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerIntentResponse> postIntentsCustomerintents(ApiRequest<CustomerIntent> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CustomerIntentResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CustomerIntentResponse> response = (ApiResponse<CustomerIntentResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CustomerIntentResponse> response = (ApiResponse<CustomerIntentResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
