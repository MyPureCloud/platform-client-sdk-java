package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.CelebrationStateParam;
import com.mypurecloud.sdk.v2.model.CreateRecognition;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GetCelebrationListing;
import com.mypurecloud.sdk.v2.model.Recognition;
import com.mypurecloud.sdk.v2.model.RecognitionBase;
import com.mypurecloud.sdk.v2.model.Recognitions;


import com.mypurecloud.sdk.v2.api.request.DeleteEmployeeengagementCelebrationRequest;
import com.mypurecloud.sdk.v2.api.request.GetEmployeeengagementCelebrationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetEmployeeengagementRecognitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetEmployeeengagementRecognitionsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchEmployeeengagementCelebrationRequest;
import com.mypurecloud.sdk.v2.api.request.PostEmployeeengagementRecognitionsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeEngagementApi {
  private final ApiClient pcapiClient;

  public EmployeeEngagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EmployeeEngagementApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Deletes a celebration
   * 
   * @param celebrationId The ID of the celebration (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteEmployeeengagementCelebration(String celebrationId) throws IOException, ApiException {
     deleteEmployeeengagementCelebration(createDeleteEmployeeengagementCelebrationRequest(celebrationId));
  }

  /**
   * Deletes a celebration
   * 
   * @param celebrationId The ID of the celebration (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteEmployeeengagementCelebrationWithHttpInfo(String celebrationId) throws IOException {
    return deleteEmployeeengagementCelebration(createDeleteEmployeeengagementCelebrationRequest(celebrationId).withHttpInfo());
  }

  private DeleteEmployeeengagementCelebrationRequest createDeleteEmployeeengagementCelebrationRequest(String celebrationId) {
    return DeleteEmployeeengagementCelebrationRequest.builder()
            .withCelebrationId(celebrationId)

            .build();
  }

  /**
   * Deletes a celebration
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteEmployeeengagementCelebration(DeleteEmployeeengagementCelebrationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes a celebration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteEmployeeengagementCelebration(ApiRequest<Void> request) throws IOException {
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
   * Get all celebrations
   * 
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @return GetCelebrationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetCelebrationListing getEmployeeengagementCelebrations(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getEmployeeengagementCelebrations(createGetEmployeeengagementCelebrationsRequest(pageNumber, pageSize));
  }

  /**
   * Get all celebrations
   * 
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @return GetCelebrationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetCelebrationListing> getEmployeeengagementCelebrationsWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException {
    return getEmployeeengagementCelebrations(createGetEmployeeengagementCelebrationsRequest(pageNumber, pageSize).withHttpInfo());
  }

  private GetEmployeeengagementCelebrationsRequest createGetEmployeeengagementCelebrationsRequest(Integer pageNumber, Integer pageSize) {
    return GetEmployeeengagementCelebrationsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get all celebrations
   * 
   * @param request The request object
   * @return GetCelebrationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetCelebrationListing getEmployeeengagementCelebrations(GetEmployeeengagementCelebrationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetCelebrationListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetCelebrationListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all celebrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetCelebrationListing> getEmployeeengagementCelebrations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetCelebrationListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetCelebrationListing> response = (ApiResponse<GetCelebrationListing>)(ApiResponse<?>)exception;
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
      ApiResponse<GetCelebrationListing> response = (ApiResponse<GetCelebrationListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets a single recognition
   * 
   * @param recognitionId The Recognition ID (required)
   * @return Recognition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recognition getEmployeeengagementRecognition(String recognitionId) throws IOException, ApiException {
    return  getEmployeeengagementRecognition(createGetEmployeeengagementRecognitionRequest(recognitionId));
  }

  /**
   * Gets a single recognition
   * 
   * @param recognitionId The Recognition ID (required)
   * @return Recognition
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recognition> getEmployeeengagementRecognitionWithHttpInfo(String recognitionId) throws IOException {
    return getEmployeeengagementRecognition(createGetEmployeeengagementRecognitionRequest(recognitionId).withHttpInfo());
  }

  private GetEmployeeengagementRecognitionRequest createGetEmployeeengagementRecognitionRequest(String recognitionId) {
    return GetEmployeeengagementRecognitionRequest.builder()
            .withRecognitionId(recognitionId)

            .build();
  }

  /**
   * Gets a single recognition
   * 
   * @param request The request object
   * @return Recognition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recognition getEmployeeengagementRecognition(GetEmployeeengagementRecognitionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Recognition> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Recognition>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a single recognition
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recognition> getEmployeeengagementRecognition(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Recognition>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Recognition> response = (ApiResponse<Recognition>)(ApiResponse<?>)exception;
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
      ApiResponse<Recognition> response = (ApiResponse<Recognition>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets sent recognitions
   * 
   * @param direction The direction of the recognitions. (optional, default to received)
   * @param recipient The ID of the recipient (when direction is sent). (optional)
   * @param dateStart The start date of the search range. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param dateEnd The end date of the search range. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param pageSize Page size (optional, default to 100)
   * @param pageNumber Page number (optional, default to 1)
   * @return Recognitions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recognitions getEmployeeengagementRecognitions(String direction, String recipient, Date dateStart, Date dateEnd, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getEmployeeengagementRecognitions(createGetEmployeeengagementRecognitionsRequest(direction, recipient, dateStart, dateEnd, pageSize, pageNumber));
  }

  /**
   * Gets sent recognitions
   * 
   * @param direction The direction of the recognitions. (optional, default to received)
   * @param recipient The ID of the recipient (when direction is sent). (optional)
   * @param dateStart The start date of the search range. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param dateEnd The end date of the search range. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (optional)
   * @param pageSize Page size (optional, default to 100)
   * @param pageNumber Page number (optional, default to 1)
   * @return Recognitions
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recognitions> getEmployeeengagementRecognitionsWithHttpInfo(String direction, String recipient, Date dateStart, Date dateEnd, Integer pageSize, Integer pageNumber) throws IOException {
    return getEmployeeengagementRecognitions(createGetEmployeeengagementRecognitionsRequest(direction, recipient, dateStart, dateEnd, pageSize, pageNumber).withHttpInfo());
  }

  private GetEmployeeengagementRecognitionsRequest createGetEmployeeengagementRecognitionsRequest(String direction, String recipient, Date dateStart, Date dateEnd, Integer pageSize, Integer pageNumber) {
    return GetEmployeeengagementRecognitionsRequest.builder()
            .withDirection(direction)

            .withRecipient(recipient)

            .withDateStart(dateStart)

            .withDateEnd(dateEnd)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Gets sent recognitions
   * 
   * @param request The request object
   * @return Recognitions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recognitions getEmployeeengagementRecognitions(GetEmployeeengagementRecognitionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Recognitions> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Recognitions>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets sent recognitions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recognitions> getEmployeeengagementRecognitions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Recognitions>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Recognitions> response = (ApiResponse<Recognitions>)(ApiResponse<?>)exception;
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
      ApiResponse<Recognitions> response = (ApiResponse<Recognitions>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Set a state for a celebration
   * 
   * @param celebrationId The ID of the celebration (required)
   * @param body Patch Celebration state (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchEmployeeengagementCelebration(String celebrationId, CelebrationStateParam body) throws IOException, ApiException {
     patchEmployeeengagementCelebration(createPatchEmployeeengagementCelebrationRequest(celebrationId, body));
  }

  /**
   * Set a state for a celebration
   * 
   * @param celebrationId The ID of the celebration (required)
   * @param body Patch Celebration state (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchEmployeeengagementCelebrationWithHttpInfo(String celebrationId, CelebrationStateParam body) throws IOException {
    return patchEmployeeengagementCelebration(createPatchEmployeeengagementCelebrationRequest(celebrationId, body).withHttpInfo());
  }

  private PatchEmployeeengagementCelebrationRequest createPatchEmployeeengagementCelebrationRequest(String celebrationId, CelebrationStateParam body) {
    return PatchEmployeeengagementCelebrationRequest.builder()
            .withCelebrationId(celebrationId)

            .withBody(body)

            .build();
  }

  /**
   * Set a state for a celebration
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchEmployeeengagementCelebration(PatchEmployeeengagementCelebrationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Set a state for a celebration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchEmployeeengagementCelebration(ApiRequest<CelebrationStateParam> request) throws IOException {
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
   * Creates a recognition
   * 
   * @param body Create Recognition (required)
   * @return RecognitionBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecognitionBase postEmployeeengagementRecognitions(CreateRecognition body) throws IOException, ApiException {
    return  postEmployeeengagementRecognitions(createPostEmployeeengagementRecognitionsRequest(body));
  }

  /**
   * Creates a recognition
   * 
   * @param body Create Recognition (required)
   * @return RecognitionBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecognitionBase> postEmployeeengagementRecognitionsWithHttpInfo(CreateRecognition body) throws IOException {
    return postEmployeeengagementRecognitions(createPostEmployeeengagementRecognitionsRequest(body).withHttpInfo());
  }

  private PostEmployeeengagementRecognitionsRequest createPostEmployeeengagementRecognitionsRequest(CreateRecognition body) {
    return PostEmployeeengagementRecognitionsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Creates a recognition
   * 
   * @param request The request object
   * @return RecognitionBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecognitionBase postEmployeeengagementRecognitions(PostEmployeeengagementRecognitionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecognitionBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecognitionBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a recognition
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecognitionBase> postEmployeeengagementRecognitions(ApiRequest<CreateRecognition> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecognitionBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecognitionBase> response = (ApiResponse<RecognitionBase>)(ApiResponse<?>)exception;
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
      ApiResponse<RecognitionBase> response = (ApiResponse<RecognitionBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
