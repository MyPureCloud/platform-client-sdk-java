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
import com.mypurecloud.sdk.v2.model.Attribute;
import com.mypurecloud.sdk.v2.model.AttributeEntityListing;
import com.mypurecloud.sdk.v2.model.AttributeQueryRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteAttributeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAttributeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAttributesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAttributesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAttributesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutAttributeRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AttributesApi {
  private final ApiClient pcapiClient;

  public AttributesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AttributesApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete an existing Attribute.
   * This will remove attribute.
   * @param attributeId Attribute ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAttribute(String attributeId) throws IOException, ApiException {
     deleteAttribute(createDeleteAttributeRequest(attributeId));
  }

  /**
   * Delete an existing Attribute.
   * This will remove attribute.
   * @param attributeId Attribute ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAttributeWithHttpInfo(String attributeId) throws IOException {
    return deleteAttribute(createDeleteAttributeRequest(attributeId).withHttpInfo());
  }

  private DeleteAttributeRequest createDeleteAttributeRequest(String attributeId) {
    return DeleteAttributeRequest.builder()
            .withAttributeId(attributeId)
    
            .build();
  }

  /**
   * Delete an existing Attribute.
   * This will remove attribute.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAttribute(DeleteAttributeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an existing Attribute.
   * This will remove attribute.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAttribute(ApiRequest<Void> request) throws IOException {
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
   * Get details about an existing attribute.
   * 
   * @param attributeId Attribute ID (required)
   * @return Attribute
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Attribute getAttribute(String attributeId) throws IOException, ApiException {
    return  getAttribute(createGetAttributeRequest(attributeId));
  }

  /**
   * Get details about an existing attribute.
   * 
   * @param attributeId Attribute ID (required)
   * @return Attribute
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Attribute> getAttributeWithHttpInfo(String attributeId) throws IOException {
    return getAttribute(createGetAttributeRequest(attributeId).withHttpInfo());
  }

  private GetAttributeRequest createGetAttributeRequest(String attributeId) {
    return GetAttributeRequest.builder()
            .withAttributeId(attributeId)
    
            .build();
  }

  /**
   * Get details about an existing attribute.
   * 
   * @param request The request object
   * @return Attribute
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Attribute getAttribute(GetAttributeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Attribute> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Attribute>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get details about an existing attribute.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Attribute> getAttribute(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Attribute>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Attribute> response = (ApiResponse<Attribute>)(ApiResponse<?>)exception;
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
      ApiResponse<Attribute> response = (ApiResponse<Attribute>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets a list of existing attributes.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return AttributeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttributeEntityListing getAttributes(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getAttributes(createGetAttributesRequest(pageNumber, pageSize));
  }

  /**
   * Gets a list of existing attributes.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return AttributeEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttributeEntityListing> getAttributesWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException {
    return getAttributes(createGetAttributesRequest(pageNumber, pageSize).withHttpInfo());
  }

  private GetAttributesRequest createGetAttributesRequest(Integer pageNumber, Integer pageSize) {
    return GetAttributesRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Gets a list of existing attributes.
   * 
   * @param request The request object
   * @return AttributeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttributeEntityListing getAttributes(GetAttributesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AttributeEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AttributeEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a list of existing attributes.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttributeEntityListing> getAttributes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AttributeEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AttributeEntityListing> response = (ApiResponse<AttributeEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AttributeEntityListing> response = (ApiResponse<AttributeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create an attribute.
   * 
   * @param body Attribute (required)
   * @return Attribute
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Attribute postAttributes(Attribute body) throws IOException, ApiException {
    return  postAttributes(createPostAttributesRequest(body));
  }

  /**
   * Create an attribute.
   * 
   * @param body Attribute (required)
   * @return Attribute
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Attribute> postAttributesWithHttpInfo(Attribute body) throws IOException {
    return postAttributes(createPostAttributesRequest(body).withHttpInfo());
  }

  private PostAttributesRequest createPostAttributesRequest(Attribute body) {
    return PostAttributesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create an attribute.
   * 
   * @param request The request object
   * @return Attribute
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Attribute postAttributes(PostAttributesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Attribute> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Attribute>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an attribute.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Attribute> postAttributes(ApiRequest<Attribute> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Attribute>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Attribute> response = (ApiResponse<Attribute>)(ApiResponse<?>)exception;
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
      ApiResponse<Attribute> response = (ApiResponse<Attribute>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query attributes
   * 
   * @param body query (required)
   * @return AttributeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttributeEntityListing postAttributesQuery(AttributeQueryRequest body) throws IOException, ApiException {
    return  postAttributesQuery(createPostAttributesQueryRequest(body));
  }

  /**
   * Query attributes
   * 
   * @param body query (required)
   * @return AttributeEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttributeEntityListing> postAttributesQueryWithHttpInfo(AttributeQueryRequest body) throws IOException {
    return postAttributesQuery(createPostAttributesQueryRequest(body).withHttpInfo());
  }

  private PostAttributesQueryRequest createPostAttributesQueryRequest(AttributeQueryRequest body) {
    return PostAttributesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query attributes
   * 
   * @param request The request object
   * @return AttributeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttributeEntityListing postAttributesQuery(PostAttributesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AttributeEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AttributeEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query attributes
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttributeEntityListing> postAttributesQuery(ApiRequest<AttributeQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AttributeEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AttributeEntityListing> response = (ApiResponse<AttributeEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AttributeEntityListing> response = (ApiResponse<AttributeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an existing attribute.
   * Fields that can be updated: name, description. The most recent version is required for updates.
   * @param attributeId Attribute ID (required)
   * @param body Attribute (required)
   * @return Attribute
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Attribute putAttribute(String attributeId, Attribute body) throws IOException, ApiException {
    return  putAttribute(createPutAttributeRequest(attributeId, body));
  }

  /**
   * Update an existing attribute.
   * Fields that can be updated: name, description. The most recent version is required for updates.
   * @param attributeId Attribute ID (required)
   * @param body Attribute (required)
   * @return Attribute
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Attribute> putAttributeWithHttpInfo(String attributeId, Attribute body) throws IOException {
    return putAttribute(createPutAttributeRequest(attributeId, body).withHttpInfo());
  }

  private PutAttributeRequest createPutAttributeRequest(String attributeId, Attribute body) {
    return PutAttributeRequest.builder()
            .withAttributeId(attributeId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an existing attribute.
   * Fields that can be updated: name, description. The most recent version is required for updates.
   * @param request The request object
   * @return Attribute
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Attribute putAttribute(PutAttributeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Attribute> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Attribute>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an existing attribute.
   * Fields that can be updated: name, description. The most recent version is required for updates.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Attribute> putAttribute(ApiRequest<Attribute> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Attribute>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Attribute> response = (ApiResponse<Attribute>)(ApiResponse<?>)exception;
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
      ApiResponse<Attribute> response = (ApiResponse<Attribute>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
