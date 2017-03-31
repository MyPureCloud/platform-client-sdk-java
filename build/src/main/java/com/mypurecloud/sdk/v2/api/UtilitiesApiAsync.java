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
import java.util.concurrent.Future;


public class UtilitiesApiAsync {
  private final ApiClient pcapiClient;

  public UtilitiesApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public UtilitiesApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get the current system date/time
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ServerDate> getDateAsync(GetDateRequest request, AsyncApiCallback<ServerDate> callback) {
    return pcapiClient.<ServerDate>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ServerDate>() {}, callback);
  }

  /**
   * Get the current system date/time
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ServerDate>> getDateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ServerDate>> callback) {
    return pcapiClient.<ServerDate>invokeAPIVerboseAsync(request, new TypeReference<ServerDate>() {}, callback);
  }

  /**
   * Get time zones list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TimeZoneEntityListing> getTimezonesAsync(GetTimezonesRequest request, AsyncApiCallback<TimeZoneEntityListing> callback) {
    return pcapiClient.<TimeZoneEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TimeZoneEntityListing>() {}, callback);
  }

  /**
   * Get time zones list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TimeZoneEntityListing>> getTimezonesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TimeZoneEntityListing>> callback) {
    return pcapiClient.<TimeZoneEntityListing>invokeAPIVerboseAsync(request, new TypeReference<TimeZoneEntityListing>() {}, callback);
  }

  /**
   * Returns the information about an X509 PEM encoded certificate or certificate chain.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ParsedCertificate> postCertificateDetailsAsync(PostCertificateDetailsRequest request, AsyncApiCallback<ParsedCertificate> callback) {
    return pcapiClient.<ParsedCertificate>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ParsedCertificate>() {}, callback);
  }

  /**
   * Returns the information about an X509 PEM encoded certificate or certificate chain.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ParsedCertificate>> postCertificateDetailsAsync(ApiRequest<Certificate> request, AsyncApiCallback<ApiResponse<ParsedCertificate>> callback) {
    return pcapiClient.<ParsedCertificate>invokeAPIVerboseAsync(request, new TypeReference<ParsedCertificate>() {}, callback);
  }

}
