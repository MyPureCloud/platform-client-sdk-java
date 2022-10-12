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
import com.mypurecloud.sdk.v2.model.UrlResponse;


import com.mypurecloud.sdk.v2.api.request.GetDownloadRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DownloadsApi {
  private final ApiClient pcapiClient;

  public DownloadsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DownloadsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Issues a redirect to a signed secure download URL for specified download
   * this method will issue a redirect to the url to the content
   * @param downloadId Download ID (required)
   * @param contentDisposition  (optional)
   * @param issueRedirect  (optional, default to true)
   * @param redirectToAuth  (optional, default to true)
   * @return UrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UrlResponse getDownload(String downloadId, String contentDisposition, Boolean issueRedirect, Boolean redirectToAuth) throws IOException, ApiException {
    return  getDownload(createGetDownloadRequest(downloadId, contentDisposition, issueRedirect, redirectToAuth));
  }

  /**
   * Issues a redirect to a signed secure download URL for specified download
   * this method will issue a redirect to the url to the content
   * @param downloadId Download ID (required)
   * @param contentDisposition  (optional)
   * @param issueRedirect  (optional, default to true)
   * @param redirectToAuth  (optional, default to true)
   * @return UrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UrlResponse> getDownloadWithHttpInfo(String downloadId, String contentDisposition, Boolean issueRedirect, Boolean redirectToAuth) throws IOException {
    return getDownload(createGetDownloadRequest(downloadId, contentDisposition, issueRedirect, redirectToAuth).withHttpInfo());
  }

  private GetDownloadRequest createGetDownloadRequest(String downloadId, String contentDisposition, Boolean issueRedirect, Boolean redirectToAuth) {
    return GetDownloadRequest.builder()
            .withDownloadId(downloadId)

            .withContentDisposition(contentDisposition)

            .withIssueRedirect(issueRedirect)

            .withRedirectToAuth(redirectToAuth)

            .build();
  }

  /**
   * Issues a redirect to a signed secure download URL for specified download
   * this method will issue a redirect to the url to the content
   * @param request The request object
   * @return UrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UrlResponse getDownload(GetDownloadRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Issues a redirect to a signed secure download URL for specified download
   * this method will issue a redirect to the url to the content
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UrlResponse> getDownload(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UrlResponse> response = (ApiResponse<UrlResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UrlResponse> response = (ApiResponse<UrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
