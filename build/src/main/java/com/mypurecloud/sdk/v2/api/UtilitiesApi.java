package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ServerDate;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.TimeZoneEntityListing;
import com.mypurecloud.sdk.v2.model.ParsedCertificate;
import com.mypurecloud.sdk.v2.model.Certificate;


import com.mypurecloud.sdk.v2.api.request.GetDateRequest;
import com.mypurecloud.sdk.v2.api.request.GetTimezonesRequest;
import com.mypurecloud.sdk.v2.api.request.PostCertificateDetailsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UtilitiesApi {
  private final ApiClient pcapiClient;

  public UtilitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UtilitiesApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get the current system date/time
   * 
   * @return ServerDate
   * @throws ApiException if fails to make API call
   */
  public ServerDate getDate() throws IOException, ApiException {
    return getDateWithHttpInfo().getBody();
  }

  /**
   * Get the current system date/time
   * 
   * @return ServerDate
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ServerDate> getDateWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/date".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ServerDate>() {});
  }

  /**
   * Get the current system date/time
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ServerDate getDate(GetDateRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ServerDate>() {});
  }

  /**
   * Get the current system date/time
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ServerDate> getDate(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ServerDate>invokeAPIVerbose(request, new TypeReference<ServerDate>() {});
  }

  /**
   * Get time zones list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TimeZoneEntityListing
   * @throws ApiException if fails to make API call
   */
  public TimeZoneEntityListing getTimezones(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return getTimezonesWithHttpInfo(pageSize, pageNumber).getBody();
  }

  /**
   * Get time zones list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TimeZoneEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TimeZoneEntityListing> getTimezonesWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/timezones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TimeZoneEntityListing>() {});
  }

  /**
   * Get time zones list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TimeZoneEntityListing getTimezones(GetTimezonesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TimeZoneEntityListing>() {});
  }

  /**
   * Get time zones list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TimeZoneEntityListing> getTimezones(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<TimeZoneEntityListing>invokeAPIVerbose(request, new TypeReference<TimeZoneEntityListing>() {});
  }

  /**
   * Returns the information about an X509 PEM encoded certificate or certificate chain.
   * 
   * @param body Certificate (required)
   * @return ParsedCertificate
   * @throws ApiException if fails to make API call
   */
  public ParsedCertificate postCertificateDetails(Certificate body) throws IOException, ApiException {
    return postCertificateDetailsWithHttpInfo(body).getBody();
  }

  /**
   * Returns the information about an X509 PEM encoded certificate or certificate chain.
   * 
   * @param body Certificate (required)
   * @return ParsedCertificate
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ParsedCertificate> postCertificateDetailsWithHttpInfo(Certificate body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postCertificateDetails");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/certificate/details".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ParsedCertificate>() {});
  }

  /**
   * Returns the information about an X509 PEM encoded certificate or certificate chain.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ParsedCertificate postCertificateDetails(PostCertificateDetailsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ParsedCertificate>() {});
  }

  /**
   * Returns the information about an X509 PEM encoded certificate or certificate chain.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ParsedCertificate> postCertificateDetails(ApiRequest<Certificate> request) throws IOException, ApiException {
    return pcapiClient.<ParsedCertificate>invokeAPIVerbose(request, new TypeReference<ParsedCertificate>() {});
  }

}
