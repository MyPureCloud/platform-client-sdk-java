package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.SipSearchResult;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.SignedUrlResponse;
import com.mypurecloud.sdk.v2.model.SIPSearchPublicRequest;
import com.mypurecloud.sdk.v2.model.SipDownloadResponse;


import com.mypurecloud.sdk.v2.api.request.GetTelephonySiptracesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonySiptracesDownloadDownloadIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonySiptracesDownloadRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TelephonyApi {
  private final ApiClient pcapiClient;

  public TelephonyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TelephonyApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Fetch SIP metadata
   * Fetch SIP metadata that matches a given parameter. If exactMatch is passed as a parameter only sip records that have exactly that value will be returned. For example, some records contain conversationId but not all relevant records for that call may contain the conversationId so only a partial view of the call will be reflected
   * @param dateStart Start date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (required)
   * @param dateEnd End date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (required)
   * @param callId unique identification of the placed call (optional)
   * @param toUser User to who the call was placed (optional)
   * @param fromUser user who placed the call (optional)
   * @param conversationId Unique identification of the conversation (optional)
   * @return SipSearchResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SipSearchResult getTelephonySiptraces(Date dateStart, Date dateEnd, String callId, String toUser, String fromUser, String conversationId) throws IOException, ApiException {
    return  getTelephonySiptraces(createGetTelephonySiptracesRequest(dateStart, dateEnd, callId, toUser, fromUser, conversationId));
  }

  /**
   * Fetch SIP metadata
   * Fetch SIP metadata that matches a given parameter. If exactMatch is passed as a parameter only sip records that have exactly that value will be returned. For example, some records contain conversationId but not all relevant records for that call may contain the conversationId so only a partial view of the call will be reflected
   * @param dateStart Start date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (required)
   * @param dateEnd End date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (required)
   * @param callId unique identification of the placed call (optional)
   * @param toUser User to who the call was placed (optional)
   * @param fromUser user who placed the call (optional)
   * @param conversationId Unique identification of the conversation (optional)
   * @return SipSearchResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SipSearchResult> getTelephonySiptracesWithHttpInfo(Date dateStart, Date dateEnd, String callId, String toUser, String fromUser, String conversationId) throws IOException {
    return getTelephonySiptraces(createGetTelephonySiptracesRequest(dateStart, dateEnd, callId, toUser, fromUser, conversationId).withHttpInfo());
  }

  private GetTelephonySiptracesRequest createGetTelephonySiptracesRequest(Date dateStart, Date dateEnd, String callId, String toUser, String fromUser, String conversationId) {
    return GetTelephonySiptracesRequest.builder()
            .withDateStart(dateStart)
    
            .withDateEnd(dateEnd)
    
            .withCallId(callId)
    
            .withToUser(toUser)
    
            .withFromUser(fromUser)
    
            .withConversationId(conversationId)
    
            .build();
  }

  /**
   * Fetch SIP metadata
   * Fetch SIP metadata that matches a given parameter. If exactMatch is passed as a parameter only sip records that have exactly that value will be returned. For example, some records contain conversationId but not all relevant records for that call may contain the conversationId so only a partial view of the call will be reflected
   * @param request The request object
   * @return SipSearchResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SipSearchResult getTelephonySiptraces(GetTelephonySiptracesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SipSearchResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SipSearchResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch SIP metadata
   * Fetch SIP metadata that matches a given parameter. If exactMatch is passed as a parameter only sip records that have exactly that value will be returned. For example, some records contain conversationId but not all relevant records for that call may contain the conversationId so only a partial view of the call will be reflected
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SipSearchResult> getTelephonySiptraces(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SipSearchResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SipSearchResult> response = (ApiResponse<SipSearchResult>)(ApiResponse<?>)exception;
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
      ApiResponse<SipSearchResult> response = (ApiResponse<SipSearchResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get signed S3 URL for a pcap download
   * 
   * @param downloadId unique id for the downloaded file in S3 (required)
   * @return SignedUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SignedUrlResponse getTelephonySiptracesDownloadDownloadId(String downloadId) throws IOException, ApiException {
    return  getTelephonySiptracesDownloadDownloadId(createGetTelephonySiptracesDownloadDownloadIdRequest(downloadId));
  }

  /**
   * Get signed S3 URL for a pcap download
   * 
   * @param downloadId unique id for the downloaded file in S3 (required)
   * @return SignedUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SignedUrlResponse> getTelephonySiptracesDownloadDownloadIdWithHttpInfo(String downloadId) throws IOException {
    return getTelephonySiptracesDownloadDownloadId(createGetTelephonySiptracesDownloadDownloadIdRequest(downloadId).withHttpInfo());
  }

  private GetTelephonySiptracesDownloadDownloadIdRequest createGetTelephonySiptracesDownloadDownloadIdRequest(String downloadId) {
    return GetTelephonySiptracesDownloadDownloadIdRequest.builder()
            .withDownloadId(downloadId)
    
            .build();
  }

  /**
   * Get signed S3 URL for a pcap download
   * 
   * @param request The request object
   * @return SignedUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SignedUrlResponse getTelephonySiptracesDownloadDownloadId(GetTelephonySiptracesDownloadDownloadIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SignedUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SignedUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get signed S3 URL for a pcap download
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SignedUrlResponse> getTelephonySiptracesDownloadDownloadId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SignedUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SignedUrlResponse> response = (ApiResponse<SignedUrlResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SignedUrlResponse> response = (ApiResponse<SignedUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Request a download of a pcap file to S3
   * 
   * @param sIPSearchPublicRequest  (required)
   * @return SipDownloadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SipDownloadResponse postTelephonySiptracesDownload(SIPSearchPublicRequest sIPSearchPublicRequest) throws IOException, ApiException {
    return  postTelephonySiptracesDownload(createPostTelephonySiptracesDownloadRequest(sIPSearchPublicRequest));
  }

  /**
   * Request a download of a pcap file to S3
   * 
   * @param sIPSearchPublicRequest  (required)
   * @return SipDownloadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SipDownloadResponse> postTelephonySiptracesDownloadWithHttpInfo(SIPSearchPublicRequest sIPSearchPublicRequest) throws IOException {
    return postTelephonySiptracesDownload(createPostTelephonySiptracesDownloadRequest(sIPSearchPublicRequest).withHttpInfo());
  }

  private PostTelephonySiptracesDownloadRequest createPostTelephonySiptracesDownloadRequest(SIPSearchPublicRequest sIPSearchPublicRequest) {
    return PostTelephonySiptracesDownloadRequest.builder()
            .withSIPSearchPublicRequest(sIPSearchPublicRequest)
    
            .build();
  }

  /**
   * Request a download of a pcap file to S3
   * 
   * @param request The request object
   * @return SipDownloadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SipDownloadResponse postTelephonySiptracesDownload(PostTelephonySiptracesDownloadRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SipDownloadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SipDownloadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request a download of a pcap file to S3
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SipDownloadResponse> postTelephonySiptracesDownload(ApiRequest<SIPSearchPublicRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SipDownloadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SipDownloadResponse> response = (ApiResponse<SipDownloadResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SipDownloadResponse> response = (ApiResponse<SipDownloadResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
