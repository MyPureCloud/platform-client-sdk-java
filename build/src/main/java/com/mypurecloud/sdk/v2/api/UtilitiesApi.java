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
import com.mypurecloud.sdk.v2.model.IpAddressRangeListing;
import com.mypurecloud.sdk.v2.model.TimeZoneEntityListing;
import com.mypurecloud.sdk.v2.model.ParsedCertificate;
import com.mypurecloud.sdk.v2.model.Certificate;


import com.mypurecloud.sdk.v2.api.request.GetDateRequest;
import com.mypurecloud.sdk.v2.api.request.GetIprangesRequest;
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServerDate getDate() throws IOException, ApiException {
    return  getDate(createGetDateRequest());
  }

  /**
   * Get the current system date/time
   * 
   * @return ServerDate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServerDate> getDateWithHttpInfo() throws IOException {
    return getDate(createGetDateRequest().withHttpInfo());
  }

  private GetDateRequest createGetDateRequest() {
    return GetDateRequest.builder()
            .build();
  }

  /**
   * Get the current system date/time
   * 
   * @param request The request object
   * @return ServerDate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServerDate getDate(GetDateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ServerDate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ServerDate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the current system date/time
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServerDate> getDate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ServerDate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ServerDate> response = (ApiResponse<ServerDate>)(ApiResponse<?>)exception;
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
      ApiResponse<ServerDate> response = (ApiResponse<ServerDate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get public ip address ranges for PureCloud
   * 
   * @return IpAddressRangeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IpAddressRangeListing getIpranges() throws IOException, ApiException {
    return  getIpranges(createGetIprangesRequest());
  }

  /**
   * Get public ip address ranges for PureCloud
   * 
   * @return IpAddressRangeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IpAddressRangeListing> getIprangesWithHttpInfo() throws IOException {
    return getIpranges(createGetIprangesRequest().withHttpInfo());
  }

  private GetIprangesRequest createGetIprangesRequest() {
    return GetIprangesRequest.builder()
            .build();
  }

  /**
   * Get public ip address ranges for PureCloud
   * 
   * @param request The request object
   * @return IpAddressRangeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IpAddressRangeListing getIpranges(GetIprangesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IpAddressRangeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IpAddressRangeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get public ip address ranges for PureCloud
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IpAddressRangeListing> getIpranges(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IpAddressRangeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IpAddressRangeListing> response = (ApiResponse<IpAddressRangeListing>)(ApiResponse<?>)exception;
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
      ApiResponse<IpAddressRangeListing> response = (ApiResponse<IpAddressRangeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get time zones list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TimeZoneEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeZoneEntityListing getTimezones(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getTimezones(createGetTimezonesRequest(pageSize, pageNumber));
  }

  /**
   * Get time zones list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TimeZoneEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeZoneEntityListing> getTimezonesWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getTimezones(createGetTimezonesRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetTimezonesRequest createGetTimezonesRequest(Integer pageSize, Integer pageNumber) {
    return GetTimezonesRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get time zones list
   * 
   * @param request The request object
   * @return TimeZoneEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeZoneEntityListing getTimezones(GetTimezonesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeZoneEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeZoneEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get time zones list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeZoneEntityListing> getTimezones(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeZoneEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeZoneEntityListing> response = (ApiResponse<TimeZoneEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TimeZoneEntityListing> response = (ApiResponse<TimeZoneEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Returns the information about an X509 PEM encoded certificate or certificate chain.
   * 
   * @param body Certificate (required)
   * @return ParsedCertificate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ParsedCertificate postCertificateDetails(Certificate body) throws IOException, ApiException {
    return  postCertificateDetails(createPostCertificateDetailsRequest(body));
  }

  /**
   * Returns the information about an X509 PEM encoded certificate or certificate chain.
   * 
   * @param body Certificate (required)
   * @return ParsedCertificate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ParsedCertificate> postCertificateDetailsWithHttpInfo(Certificate body) throws IOException {
    return postCertificateDetails(createPostCertificateDetailsRequest(body).withHttpInfo());
  }

  private PostCertificateDetailsRequest createPostCertificateDetailsRequest(Certificate body) {
    return PostCertificateDetailsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Returns the information about an X509 PEM encoded certificate or certificate chain.
   * 
   * @param request The request object
   * @return ParsedCertificate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ParsedCertificate postCertificateDetails(PostCertificateDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ParsedCertificate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ParsedCertificate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns the information about an X509 PEM encoded certificate or certificate chain.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ParsedCertificate> postCertificateDetails(ApiRequest<Certificate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ParsedCertificate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ParsedCertificate> response = (ApiResponse<ParsedCertificate>)(ApiResponse<?>)exception;
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
      ApiResponse<ParsedCertificate> response = (ApiResponse<ParsedCertificate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
