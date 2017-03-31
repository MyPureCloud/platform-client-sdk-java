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
   * @throws ApiException if fails to make API call
   */
  public void deleteAttribute(String attributeId) throws IOException, ApiException {
    deleteAttributeWithHttpInfo(attributeId);
  }

  /**
   * Delete an existing Attribute.
   * This will remove attribute.
   * @param attributeId Attribute ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAttributeWithHttpInfo(String attributeId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'attributeId' is set
    if (attributeId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'attributeId' when calling deleteAttribute");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/attributes/{attributeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "attributeId" + "\\}", pcapiClient.escapeString(attributeId.toString()));

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
   * Delete an existing Attribute.
   * This will remove attribute.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteAttribute(DeleteAttributeRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete an existing Attribute.
   * This will remove attribute.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAttribute(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Get details about an existing attribute.
   * 
   * @param attributeId Attribute ID (required)
   * @return Attribute
   * @throws ApiException if fails to make API call
   */
  public Attribute getAttribute(String attributeId) throws IOException, ApiException {
    return getAttributeWithHttpInfo(attributeId).getBody();
  }

  /**
   * Get details about an existing attribute.
   * 
   * @param attributeId Attribute ID (required)
   * @return Attribute
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Attribute> getAttributeWithHttpInfo(String attributeId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'attributeId' is set
    if (attributeId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'attributeId' when calling getAttribute");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/attributes/{attributeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "attributeId" + "\\}", pcapiClient.escapeString(attributeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Attribute>() {});
  }

  /**
   * Get details about an existing attribute.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Attribute getAttribute(GetAttributeRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Attribute>() {});
  }

  /**
   * Get details about an existing attribute.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Attribute> getAttribute(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Attribute>invokeAPIVerbose(request, new TypeReference<Attribute>() {});
  }

  /**
   * Gets a list of existing attributes.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return AttributeEntityListing
   * @throws ApiException if fails to make API call
   */
  public AttributeEntityListing getAttributes(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return getAttributesWithHttpInfo(pageNumber, pageSize).getBody();
  }

  /**
   * Gets a list of existing attributes.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return AttributeEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AttributeEntityListing> getAttributesWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/attributes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AttributeEntityListing>() {});
  }

  /**
   * Gets a list of existing attributes.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AttributeEntityListing getAttributes(GetAttributesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AttributeEntityListing>() {});
  }

  /**
   * Gets a list of existing attributes.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AttributeEntityListing> getAttributes(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<AttributeEntityListing>invokeAPIVerbose(request, new TypeReference<AttributeEntityListing>() {});
  }

  /**
   * Create an attribute.
   * 
   * @param body Attribute (required)
   * @return Attribute
   * @throws ApiException if fails to make API call
   */
  public Attribute postAttributes(Attribute body) throws IOException, ApiException {
    return postAttributesWithHttpInfo(body).getBody();
  }

  /**
   * Create an attribute.
   * 
   * @param body Attribute (required)
   * @return Attribute
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Attribute> postAttributesWithHttpInfo(Attribute body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postAttributes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/attributes".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Attribute>() {});
  }

  /**
   * Create an attribute.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Attribute postAttributes(PostAttributesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Attribute>() {});
  }

  /**
   * Create an attribute.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Attribute> postAttributes(ApiRequest<Attribute> request) throws IOException, ApiException {
    return pcapiClient.<Attribute>invokeAPIVerbose(request, new TypeReference<Attribute>() {});
  }

  /**
   * Query attributes
   * 
   * @param body query (required)
   * @return AttributeEntityListing
   * @throws ApiException if fails to make API call
   */
  public AttributeEntityListing postAttributesQuery(AttributeQueryRequest body) throws IOException, ApiException {
    return postAttributesQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query attributes
   * 
   * @param body query (required)
   * @return AttributeEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AttributeEntityListing> postAttributesQueryWithHttpInfo(AttributeQueryRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postAttributesQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/attributes/query".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AttributeEntityListing>() {});
  }

  /**
   * Query attributes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AttributeEntityListing postAttributesQuery(PostAttributesQueryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AttributeEntityListing>() {});
  }

  /**
   * Query attributes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AttributeEntityListing> postAttributesQuery(ApiRequest<AttributeQueryRequest> request) throws IOException, ApiException {
    return pcapiClient.<AttributeEntityListing>invokeAPIVerbose(request, new TypeReference<AttributeEntityListing>() {});
  }

  /**
   * Update an existing attribute.
   * Fields that can be updated: name, description. The most recent version is required for updates.
   * @param attributeId Attribute ID (required)
   * @param body Attribute (required)
   * @return Attribute
   * @throws ApiException if fails to make API call
   */
  public Attribute putAttribute(String attributeId, Attribute body) throws IOException, ApiException {
    return putAttributeWithHttpInfo(attributeId, body).getBody();
  }

  /**
   * Update an existing attribute.
   * Fields that can be updated: name, description. The most recent version is required for updates.
   * @param attributeId Attribute ID (required)
   * @param body Attribute (required)
   * @return Attribute
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Attribute> putAttributeWithHttpInfo(String attributeId, Attribute body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'attributeId' is set
    if (attributeId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'attributeId' when calling putAttribute");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putAttribute");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/attributes/{attributeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "attributeId" + "\\}", pcapiClient.escapeString(attributeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Attribute>() {});
  }

  /**
   * Update an existing attribute.
   * Fields that can be updated: name, description. The most recent version is required for updates.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Attribute putAttribute(PutAttributeRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Attribute>() {});
  }

  /**
   * Update an existing attribute.
   * Fields that can be updated: name, description. The most recent version is required for updates.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Attribute> putAttribute(ApiRequest<Attribute> request) throws IOException, ApiException {
    return pcapiClient.<Attribute>invokeAPIVerbose(request, new TypeReference<Attribute>() {});
  }

}
