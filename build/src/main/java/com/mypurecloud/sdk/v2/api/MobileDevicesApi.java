package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.DirectoryUserDevicesListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.UserDevice;


import com.mypurecloud.sdk.v2.api.request.DeleteMobiledeviceRequest;
import com.mypurecloud.sdk.v2.api.request.GetMobiledeviceRequest;
import com.mypurecloud.sdk.v2.api.request.GetMobiledevicesRequest;
import com.mypurecloud.sdk.v2.api.request.PostMobiledevicesRequest;
import com.mypurecloud.sdk.v2.api.request.PutMobiledeviceRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MobileDevicesApi {
  private final ApiClient pcapiClient;

  public MobileDevicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MobileDevicesApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * (Deprecated, see https://apicentral.genesys.cloud/api-explorer#webmessaging for alternative) Delete device
   * 
   * @param deviceId Device ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public void deleteMobiledevice(String deviceId) throws IOException, ApiException {
     deleteMobiledevice(createDeleteMobiledeviceRequest(deviceId));
  }

  /**
   * (Deprecated, see https://apicentral.genesys.cloud/api-explorer#webmessaging for alternative) Delete device
   * 
   * @param deviceId Device ID (required)
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<Void> deleteMobiledeviceWithHttpInfo(String deviceId) throws IOException {
    return deleteMobiledevice(createDeleteMobiledeviceRequest(deviceId).withHttpInfo());
  }

  private DeleteMobiledeviceRequest createDeleteMobiledeviceRequest(String deviceId) {
    return DeleteMobiledeviceRequest.builder()
            .withDeviceId(deviceId)

            .build();
  }

  /**
   * (Deprecated, see https://apicentral.genesys.cloud/api-explorer#webmessaging for alternative) Delete device
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public void deleteMobiledevice(DeleteMobiledeviceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * (Deprecated, see https://apicentral.genesys.cloud/api-explorer#webmessaging for alternative) Delete device
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<Void> deleteMobiledevice(ApiRequest<Void> request) throws IOException {
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
   * (Deprecated) Get device
   * 
   * @param deviceId Device ID (required)
   * @return UserDevice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public UserDevice getMobiledevice(String deviceId) throws IOException, ApiException {
    return  getMobiledevice(createGetMobiledeviceRequest(deviceId));
  }

  /**
   * (Deprecated) Get device
   * 
   * @param deviceId Device ID (required)
   * @return UserDevice
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<UserDevice> getMobiledeviceWithHttpInfo(String deviceId) throws IOException {
    return getMobiledevice(createGetMobiledeviceRequest(deviceId).withHttpInfo());
  }

  private GetMobiledeviceRequest createGetMobiledeviceRequest(String deviceId) {
    return GetMobiledeviceRequest.builder()
            .withDeviceId(deviceId)

            .build();
  }

  /**
   * (Deprecated) Get device
   * 
   * @param request The request object
   * @return UserDevice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public UserDevice getMobiledevice(GetMobiledeviceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserDevice> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserDevice>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * (Deprecated) Get device
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<UserDevice> getMobiledevice(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserDevice>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserDevice> response = (ApiResponse<UserDevice>)(ApiResponse<?>)exception;
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
      ApiResponse<UserDevice> response = (ApiResponse<UserDevice>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * (Deprecated) Get a list of all devices.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ascending)
   * @return DirectoryUserDevicesListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public DirectoryUserDevicesListing getMobiledevices(Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return  getMobiledevices(createGetMobiledevicesRequest(pageSize, pageNumber, sortOrder));
  }

  /**
   * (Deprecated) Get a list of all devices.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ascending)
   * @return DirectoryUserDevicesListing
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<DirectoryUserDevicesListing> getMobiledevicesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortOrder) throws IOException {
    return getMobiledevices(createGetMobiledevicesRequest(pageSize, pageNumber, sortOrder).withHttpInfo());
  }

  private GetMobiledevicesRequest createGetMobiledevicesRequest(Integer pageSize, Integer pageNumber, String sortOrder) {
    return GetMobiledevicesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * (Deprecated) Get a list of all devices.
   * 
   * @param request The request object
   * @return DirectoryUserDevicesListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public DirectoryUserDevicesListing getMobiledevices(GetMobiledevicesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DirectoryUserDevicesListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DirectoryUserDevicesListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * (Deprecated) Get a list of all devices.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<DirectoryUserDevicesListing> getMobiledevices(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DirectoryUserDevicesListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DirectoryUserDevicesListing> response = (ApiResponse<DirectoryUserDevicesListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DirectoryUserDevicesListing> response = (ApiResponse<DirectoryUserDevicesListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * (Deprecated, see https://apicentral.genesys.cloud/api-explorer#webmessaging for alternative) Create User device
   * 
   * @param body Device (required)
   * @return UserDevice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public UserDevice postMobiledevices(UserDevice body) throws IOException, ApiException {
    return  postMobiledevices(createPostMobiledevicesRequest(body));
  }

  /**
   * (Deprecated, see https://apicentral.genesys.cloud/api-explorer#webmessaging for alternative) Create User device
   * 
   * @param body Device (required)
   * @return UserDevice
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<UserDevice> postMobiledevicesWithHttpInfo(UserDevice body) throws IOException {
    return postMobiledevices(createPostMobiledevicesRequest(body).withHttpInfo());
  }

  private PostMobiledevicesRequest createPostMobiledevicesRequest(UserDevice body) {
    return PostMobiledevicesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * (Deprecated, see https://apicentral.genesys.cloud/api-explorer#webmessaging for alternative) Create User device
   * 
   * @param request The request object
   * @return UserDevice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public UserDevice postMobiledevices(PostMobiledevicesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserDevice> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserDevice>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * (Deprecated, see https://apicentral.genesys.cloud/api-explorer#webmessaging for alternative) Create User device
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<UserDevice> postMobiledevices(ApiRequest<UserDevice> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserDevice>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserDevice> response = (ApiResponse<UserDevice>)(ApiResponse<?>)exception;
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
      ApiResponse<UserDevice> response = (ApiResponse<UserDevice>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * (Deprecated, see https://apicentral.genesys.cloud/api-explorer#webmessaging for alternative) Update device
   * 
   * @param deviceId Device ID (required)
   * @param body Device (optional)
   * @return UserDevice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public UserDevice putMobiledevice(String deviceId, UserDevice body) throws IOException, ApiException {
    return  putMobiledevice(createPutMobiledeviceRequest(deviceId, body));
  }

  /**
   * (Deprecated, see https://apicentral.genesys.cloud/api-explorer#webmessaging for alternative) Update device
   * 
   * @param deviceId Device ID (required)
   * @param body Device (optional)
   * @return UserDevice
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<UserDevice> putMobiledeviceWithHttpInfo(String deviceId, UserDevice body) throws IOException {
    return putMobiledevice(createPutMobiledeviceRequest(deviceId, body).withHttpInfo());
  }

  private PutMobiledeviceRequest createPutMobiledeviceRequest(String deviceId, UserDevice body) {
    return PutMobiledeviceRequest.builder()
            .withDeviceId(deviceId)

            .withBody(body)

            .build();
  }

  /**
   * (Deprecated, see https://apicentral.genesys.cloud/api-explorer#webmessaging for alternative) Update device
   * 
   * @param request The request object
   * @return UserDevice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public UserDevice putMobiledevice(PutMobiledeviceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserDevice> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserDevice>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * (Deprecated, see https://apicentral.genesys.cloud/api-explorer#webmessaging for alternative) Update device
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<UserDevice> putMobiledevice(ApiRequest<UserDevice> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserDevice>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserDevice> response = (ApiResponse<UserDevice>)(ApiResponse<?>)exception;
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
      ApiResponse<UserDevice> response = (ApiResponse<UserDevice>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
