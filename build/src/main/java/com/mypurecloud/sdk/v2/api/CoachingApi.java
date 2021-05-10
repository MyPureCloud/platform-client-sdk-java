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
import com.mypurecloud.sdk.v2.model.CoachingAppointmentReference;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentResponse;
import com.mypurecloud.sdk.v2.model.CoachingAnnotation;
import com.mypurecloud.sdk.v2.model.CoachingAnnotationList;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentStatusResponseList;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentResponseList;
import com.mypurecloud.sdk.v2.model.CoachingNotification;
import com.mypurecloud.sdk.v2.model.CoachingNotificationList;
import com.mypurecloud.sdk.v2.model.UpdateCoachingAppointmentRequest;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentStatusRequest;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentStatusResponse;
import com.mypurecloud.sdk.v2.model.CoachingAnnotationCreateRequest;
import com.mypurecloud.sdk.v2.model.AddConversationResponse;
import com.mypurecloud.sdk.v2.model.AddConversationRequest;
import com.mypurecloud.sdk.v2.model.CreateCoachingAppointmentRequest;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentAggregateRequest;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentAggregateResponse;
import com.mypurecloud.sdk.v2.model.CoachingSlotsRequest;
import com.mypurecloud.sdk.v2.model.CoachingSlotsResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteCoachingAppointmentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteCoachingAppointmentAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.GetCoachingAppointmentRequest;
import com.mypurecloud.sdk.v2.api.request.GetCoachingAppointmentAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.GetCoachingAppointmentAnnotationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetCoachingAppointmentStatusesRequest;
import com.mypurecloud.sdk.v2.api.request.GetCoachingAppointmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetCoachingAppointmentsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetCoachingNotificationRequest;
import com.mypurecloud.sdk.v2.api.request.GetCoachingNotificationsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchCoachingAppointmentRequest;
import com.mypurecloud.sdk.v2.api.request.PatchCoachingAppointmentAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchCoachingAppointmentStatusRequest;
import com.mypurecloud.sdk.v2.api.request.PatchCoachingNotificationRequest;
import com.mypurecloud.sdk.v2.api.request.PostCoachingAppointmentAnnotationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostCoachingAppointmentConversationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostCoachingAppointmentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostCoachingAppointmentsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostCoachingScheduleslotsQueryRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CoachingApi {
  private final ApiClient pcapiClient;

  public CoachingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CoachingApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete an existing appointment
   * Permission not required if you are the creator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @return CoachingAppointmentReference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentReference deleteCoachingAppointment(String appointmentId) throws IOException, ApiException {
    return  deleteCoachingAppointment(createDeleteCoachingAppointmentRequest(appointmentId));
  }

  /**
   * Delete an existing appointment
   * Permission not required if you are the creator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @return CoachingAppointmentReference
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentReference> deleteCoachingAppointmentWithHttpInfo(String appointmentId) throws IOException {
    return deleteCoachingAppointment(createDeleteCoachingAppointmentRequest(appointmentId).withHttpInfo());
  }

  private DeleteCoachingAppointmentRequest createDeleteCoachingAppointmentRequest(String appointmentId) {
    return DeleteCoachingAppointmentRequest.builder()
            .withAppointmentId(appointmentId)
    
            .build();
  }

  /**
   * Delete an existing appointment
   * Permission not required if you are the creator of the appointment
   * @param request The request object
   * @return CoachingAppointmentReference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentReference deleteCoachingAppointment(DeleteCoachingAppointmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingAppointmentReference> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingAppointmentReference>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete an existing appointment
   * Permission not required if you are the creator of the appointment
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentReference> deleteCoachingAppointment(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingAppointmentReference>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingAppointmentReference> response = (ApiResponse<CoachingAppointmentReference>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingAppointmentReference> response = (ApiResponse<CoachingAppointmentReference>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete an existing annotation
   * You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param annotationId The ID of the annotation. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteCoachingAppointmentAnnotation(String appointmentId, String annotationId) throws IOException, ApiException {
     deleteCoachingAppointmentAnnotation(createDeleteCoachingAppointmentAnnotationRequest(appointmentId, annotationId));
  }

  /**
   * Delete an existing annotation
   * You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param annotationId The ID of the annotation. (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteCoachingAppointmentAnnotationWithHttpInfo(String appointmentId, String annotationId) throws IOException {
    return deleteCoachingAppointmentAnnotation(createDeleteCoachingAppointmentAnnotationRequest(appointmentId, annotationId).withHttpInfo());
  }

  private DeleteCoachingAppointmentAnnotationRequest createDeleteCoachingAppointmentAnnotationRequest(String appointmentId, String annotationId) {
    return DeleteCoachingAppointmentAnnotationRequest.builder()
            .withAppointmentId(appointmentId)
    
            .withAnnotationId(annotationId)
    
            .build();
  }

  /**
   * Delete an existing annotation
   * You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteCoachingAppointmentAnnotation(DeleteCoachingAppointmentAnnotationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an existing annotation
   * You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteCoachingAppointmentAnnotation(ApiRequest<Void> request) throws IOException {
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
   * Retrieve an appointment
   * Permission not required if you are the attendee, creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @return CoachingAppointmentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentResponse getCoachingAppointment(String appointmentId) throws IOException, ApiException {
    return  getCoachingAppointment(createGetCoachingAppointmentRequest(appointmentId));
  }

  /**
   * Retrieve an appointment
   * Permission not required if you are the attendee, creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @return CoachingAppointmentResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentResponse> getCoachingAppointmentWithHttpInfo(String appointmentId) throws IOException {
    return getCoachingAppointment(createGetCoachingAppointmentRequest(appointmentId).withHttpInfo());
  }

  private GetCoachingAppointmentRequest createGetCoachingAppointmentRequest(String appointmentId) {
    return GetCoachingAppointmentRequest.builder()
            .withAppointmentId(appointmentId)
    
            .build();
  }

  /**
   * Retrieve an appointment
   * Permission not required if you are the attendee, creator or facilitator of the appointment
   * @param request The request object
   * @return CoachingAppointmentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentResponse getCoachingAppointment(GetCoachingAppointmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingAppointmentResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingAppointmentResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve an appointment
   * Permission not required if you are the attendee, creator or facilitator of the appointment
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentResponse> getCoachingAppointment(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingAppointmentResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingAppointmentResponse> response = (ApiResponse<CoachingAppointmentResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingAppointmentResponse> response = (ApiResponse<CoachingAppointmentResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve an annotation.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param annotationId The ID of the annotation. (required)
   * @return CoachingAnnotation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAnnotation getCoachingAppointmentAnnotation(String appointmentId, String annotationId) throws IOException, ApiException {
    return  getCoachingAppointmentAnnotation(createGetCoachingAppointmentAnnotationRequest(appointmentId, annotationId));
  }

  /**
   * Retrieve an annotation.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param annotationId The ID of the annotation. (required)
   * @return CoachingAnnotation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAnnotation> getCoachingAppointmentAnnotationWithHttpInfo(String appointmentId, String annotationId) throws IOException {
    return getCoachingAppointmentAnnotation(createGetCoachingAppointmentAnnotationRequest(appointmentId, annotationId).withHttpInfo());
  }

  private GetCoachingAppointmentAnnotationRequest createGetCoachingAppointmentAnnotationRequest(String appointmentId, String annotationId) {
    return GetCoachingAppointmentAnnotationRequest.builder()
            .withAppointmentId(appointmentId)
    
            .withAnnotationId(annotationId)
    
            .build();
  }

  /**
   * Retrieve an annotation.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).
   * @param request The request object
   * @return CoachingAnnotation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAnnotation getCoachingAppointmentAnnotation(GetCoachingAppointmentAnnotationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingAnnotation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingAnnotation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve an annotation.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAnnotation> getCoachingAppointmentAnnotation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingAnnotation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingAnnotation> response = (ApiResponse<CoachingAnnotation>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingAnnotation> response = (ApiResponse<CoachingAnnotation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of annotations.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return CoachingAnnotationList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAnnotationList getCoachingAppointmentAnnotations(String appointmentId, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getCoachingAppointmentAnnotations(createGetCoachingAppointmentAnnotationsRequest(appointmentId, pageNumber, pageSize));
  }

  /**
   * Get a list of annotations.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return CoachingAnnotationList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAnnotationList> getCoachingAppointmentAnnotationsWithHttpInfo(String appointmentId, Integer pageNumber, Integer pageSize) throws IOException {
    return getCoachingAppointmentAnnotations(createGetCoachingAppointmentAnnotationsRequest(appointmentId, pageNumber, pageSize).withHttpInfo());
  }

  private GetCoachingAppointmentAnnotationsRequest createGetCoachingAppointmentAnnotationsRequest(String appointmentId, Integer pageNumber, Integer pageSize) {
    return GetCoachingAppointmentAnnotationsRequest.builder()
            .withAppointmentId(appointmentId)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Get a list of annotations.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).
   * @param request The request object
   * @return CoachingAnnotationList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAnnotationList getCoachingAppointmentAnnotations(GetCoachingAppointmentAnnotationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingAnnotationList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingAnnotationList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of annotations.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAnnotationList> getCoachingAppointmentAnnotations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingAnnotationList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingAnnotationList> response = (ApiResponse<CoachingAnnotationList>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingAnnotationList> response = (ApiResponse<CoachingAnnotationList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of status changes for a coaching appointment.
   * Permission not required if you are an attendee, creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return CoachingAppointmentStatusResponseList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentStatusResponseList getCoachingAppointmentStatuses(String appointmentId, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getCoachingAppointmentStatuses(createGetCoachingAppointmentStatusesRequest(appointmentId, pageNumber, pageSize));
  }

  /**
   * Get the list of status changes for a coaching appointment.
   * Permission not required if you are an attendee, creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return CoachingAppointmentStatusResponseList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentStatusResponseList> getCoachingAppointmentStatusesWithHttpInfo(String appointmentId, Integer pageNumber, Integer pageSize) throws IOException {
    return getCoachingAppointmentStatuses(createGetCoachingAppointmentStatusesRequest(appointmentId, pageNumber, pageSize).withHttpInfo());
  }

  private GetCoachingAppointmentStatusesRequest createGetCoachingAppointmentStatusesRequest(String appointmentId, Integer pageNumber, Integer pageSize) {
    return GetCoachingAppointmentStatusesRequest.builder()
            .withAppointmentId(appointmentId)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Get the list of status changes for a coaching appointment.
   * Permission not required if you are an attendee, creator or facilitator of the appointment
   * @param request The request object
   * @return CoachingAppointmentStatusResponseList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentStatusResponseList getCoachingAppointmentStatuses(GetCoachingAppointmentStatusesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingAppointmentStatusResponseList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingAppointmentStatusResponseList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of status changes for a coaching appointment.
   * Permission not required if you are an attendee, creator or facilitator of the appointment
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentStatusResponseList> getCoachingAppointmentStatuses(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingAppointmentStatusResponseList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingAppointmentStatusResponseList> response = (ApiResponse<CoachingAppointmentStatusResponseList>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingAppointmentStatusResponseList> response = (ApiResponse<CoachingAppointmentStatusResponseList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get appointments for users and optional date range
   * 
   * @param userIds The user IDs for which to retrieve appointments (required)
   * @param interval Interval to filter data by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param statuses Appointment Statuses to filter by (optional)
   * @param facilitatorIds The facilitator IDs for which to retrieve appointments (optional)
   * @param sortOrder Sort (by due date) either Asc or Desc (optional)
   * @param relationships Relationships to filter by (optional)
   * @param completionInterval Appointment completion start and end to filter by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Overdue status to filter by (optional)
   * @return CoachingAppointmentResponseList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentResponseList getCoachingAppointments(List<String> userIds, String interval, Integer pageNumber, Integer pageSize, List<String> statuses, List<String> facilitatorIds, String sortOrder, List<String> relationships, String completionInterval, String overdue) throws IOException, ApiException {
    return  getCoachingAppointments(createGetCoachingAppointmentsRequest(userIds, interval, pageNumber, pageSize, statuses, facilitatorIds, sortOrder, relationships, completionInterval, overdue));
  }

  /**
   * Get appointments for users and optional date range
   * 
   * @param userIds The user IDs for which to retrieve appointments (required)
   * @param interval Interval to filter data by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param statuses Appointment Statuses to filter by (optional)
   * @param facilitatorIds The facilitator IDs for which to retrieve appointments (optional)
   * @param sortOrder Sort (by due date) either Asc or Desc (optional)
   * @param relationships Relationships to filter by (optional)
   * @param completionInterval Appointment completion start and end to filter by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Overdue status to filter by (optional)
   * @return CoachingAppointmentResponseList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentResponseList> getCoachingAppointmentsWithHttpInfo(List<String> userIds, String interval, Integer pageNumber, Integer pageSize, List<String> statuses, List<String> facilitatorIds, String sortOrder, List<String> relationships, String completionInterval, String overdue) throws IOException {
    return getCoachingAppointments(createGetCoachingAppointmentsRequest(userIds, interval, pageNumber, pageSize, statuses, facilitatorIds, sortOrder, relationships, completionInterval, overdue).withHttpInfo());
  }

  private GetCoachingAppointmentsRequest createGetCoachingAppointmentsRequest(List<String> userIds, String interval, Integer pageNumber, Integer pageSize, List<String> statuses, List<String> facilitatorIds, String sortOrder, List<String> relationships, String completionInterval, String overdue) {
    return GetCoachingAppointmentsRequest.builder()
            .withUserIds(userIds)
    
            .withInterval(interval)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withStatuses(statuses)
    
            .withFacilitatorIds(facilitatorIds)
    
            .withSortOrder(sortOrder)
    
            .withRelationships(relationships)
    
            .withCompletionInterval(completionInterval)
    
            .withOverdue(overdue)
    
            .build();
  }

  /**
   * Get appointments for users and optional date range
   * 
   * @param request The request object
   * @return CoachingAppointmentResponseList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentResponseList getCoachingAppointments(GetCoachingAppointmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingAppointmentResponseList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingAppointmentResponseList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get appointments for users and optional date range
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentResponseList> getCoachingAppointments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingAppointmentResponseList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingAppointmentResponseList> response = (ApiResponse<CoachingAppointmentResponseList>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingAppointmentResponseList> response = (ApiResponse<CoachingAppointmentResponseList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get my appointments for a given date range
   * 
   * @param interval Interval to filter data by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param statuses Appointment Statuses to filter by (optional)
   * @param facilitatorIds The facilitator IDs for which to retrieve appointments (optional)
   * @param sortOrder Sort (by due date) either Asc or Desc (optional)
   * @param relationships Relationships to filter by (optional)
   * @param completionInterval Appointment completion start and end to filter by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Overdue status to filter by (optional)
   * @return CoachingAppointmentResponseList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentResponseList getCoachingAppointmentsMe(String interval, Integer pageNumber, Integer pageSize, List<String> statuses, List<String> facilitatorIds, String sortOrder, List<String> relationships, String completionInterval, String overdue) throws IOException, ApiException {
    return  getCoachingAppointmentsMe(createGetCoachingAppointmentsMeRequest(interval, pageNumber, pageSize, statuses, facilitatorIds, sortOrder, relationships, completionInterval, overdue));
  }

  /**
   * Get my appointments for a given date range
   * 
   * @param interval Interval to filter data by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param statuses Appointment Statuses to filter by (optional)
   * @param facilitatorIds The facilitator IDs for which to retrieve appointments (optional)
   * @param sortOrder Sort (by due date) either Asc or Desc (optional)
   * @param relationships Relationships to filter by (optional)
   * @param completionInterval Appointment completion start and end to filter by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Overdue status to filter by (optional)
   * @return CoachingAppointmentResponseList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentResponseList> getCoachingAppointmentsMeWithHttpInfo(String interval, Integer pageNumber, Integer pageSize, List<String> statuses, List<String> facilitatorIds, String sortOrder, List<String> relationships, String completionInterval, String overdue) throws IOException {
    return getCoachingAppointmentsMe(createGetCoachingAppointmentsMeRequest(interval, pageNumber, pageSize, statuses, facilitatorIds, sortOrder, relationships, completionInterval, overdue).withHttpInfo());
  }

  private GetCoachingAppointmentsMeRequest createGetCoachingAppointmentsMeRequest(String interval, Integer pageNumber, Integer pageSize, List<String> statuses, List<String> facilitatorIds, String sortOrder, List<String> relationships, String completionInterval, String overdue) {
    return GetCoachingAppointmentsMeRequest.builder()
            .withInterval(interval)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withStatuses(statuses)
    
            .withFacilitatorIds(facilitatorIds)
    
            .withSortOrder(sortOrder)
    
            .withRelationships(relationships)
    
            .withCompletionInterval(completionInterval)
    
            .withOverdue(overdue)
    
            .build();
  }

  /**
   * Get my appointments for a given date range
   * 
   * @param request The request object
   * @return CoachingAppointmentResponseList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentResponseList getCoachingAppointmentsMe(GetCoachingAppointmentsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingAppointmentResponseList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingAppointmentResponseList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get my appointments for a given date range
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentResponseList> getCoachingAppointmentsMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingAppointmentResponseList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingAppointmentResponseList> response = (ApiResponse<CoachingAppointmentResponseList>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingAppointmentResponseList> response = (ApiResponse<CoachingAppointmentResponseList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get an existing notification
   * Permission not required if you are the owner of the notification.
   * @param notificationId The ID of the notification. (required)
   * @param expand Indicates a field in the response which should be expanded. (optional)
   * @return CoachingNotification
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingNotification getCoachingNotification(String notificationId, List<String> expand) throws IOException, ApiException {
    return  getCoachingNotification(createGetCoachingNotificationRequest(notificationId, expand));
  }

  /**
   * Get an existing notification
   * Permission not required if you are the owner of the notification.
   * @param notificationId The ID of the notification. (required)
   * @param expand Indicates a field in the response which should be expanded. (optional)
   * @return CoachingNotification
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingNotification> getCoachingNotificationWithHttpInfo(String notificationId, List<String> expand) throws IOException {
    return getCoachingNotification(createGetCoachingNotificationRequest(notificationId, expand).withHttpInfo());
  }

  private GetCoachingNotificationRequest createGetCoachingNotificationRequest(String notificationId, List<String> expand) {
    return GetCoachingNotificationRequest.builder()
            .withNotificationId(notificationId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get an existing notification
   * Permission not required if you are the owner of the notification.
   * @param request The request object
   * @return CoachingNotification
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingNotification getCoachingNotification(GetCoachingNotificationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingNotification> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingNotification>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an existing notification
   * Permission not required if you are the owner of the notification.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingNotification> getCoachingNotification(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingNotification>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingNotification> response = (ApiResponse<CoachingNotification>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingNotification> response = (ApiResponse<CoachingNotification>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve the list of your notifications.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param expand Indicates a field in the response which should be expanded. (optional)
   * @return CoachingNotificationList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingNotificationList getCoachingNotifications(Integer pageNumber, Integer pageSize, List<String> expand) throws IOException, ApiException {
    return  getCoachingNotifications(createGetCoachingNotificationsRequest(pageNumber, pageSize, expand));
  }

  /**
   * Retrieve the list of your notifications.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param expand Indicates a field in the response which should be expanded. (optional)
   * @return CoachingNotificationList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingNotificationList> getCoachingNotificationsWithHttpInfo(Integer pageNumber, Integer pageSize, List<String> expand) throws IOException {
    return getCoachingNotifications(createGetCoachingNotificationsRequest(pageNumber, pageSize, expand).withHttpInfo());
  }

  private GetCoachingNotificationsRequest createGetCoachingNotificationsRequest(Integer pageNumber, Integer pageSize, List<String> expand) {
    return GetCoachingNotificationsRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Retrieve the list of your notifications.
   * 
   * @param request The request object
   * @return CoachingNotificationList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingNotificationList getCoachingNotifications(GetCoachingNotificationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingNotificationList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingNotificationList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve the list of your notifications.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingNotificationList> getCoachingNotifications(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingNotificationList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingNotificationList> response = (ApiResponse<CoachingNotificationList>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingNotificationList> response = (ApiResponse<CoachingNotificationList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an existing appointment
   * Permission not required if you are the creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param body The new version of the appointment (required)
   * @return CoachingAppointmentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentResponse patchCoachingAppointment(String appointmentId, UpdateCoachingAppointmentRequest body) throws IOException, ApiException {
    return  patchCoachingAppointment(createPatchCoachingAppointmentRequest(appointmentId, body));
  }

  /**
   * Update an existing appointment
   * Permission not required if you are the creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param body The new version of the appointment (required)
   * @return CoachingAppointmentResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentResponse> patchCoachingAppointmentWithHttpInfo(String appointmentId, UpdateCoachingAppointmentRequest body) throws IOException {
    return patchCoachingAppointment(createPatchCoachingAppointmentRequest(appointmentId, body).withHttpInfo());
  }

  private PatchCoachingAppointmentRequest createPatchCoachingAppointmentRequest(String appointmentId, UpdateCoachingAppointmentRequest body) {
    return PatchCoachingAppointmentRequest.builder()
            .withAppointmentId(appointmentId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an existing appointment
   * Permission not required if you are the creator or facilitator of the appointment
   * @param request The request object
   * @return CoachingAppointmentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentResponse patchCoachingAppointment(PatchCoachingAppointmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingAppointmentResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingAppointmentResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an existing appointment
   * Permission not required if you are the creator or facilitator of the appointment
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentResponse> patchCoachingAppointment(ApiRequest<UpdateCoachingAppointmentRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingAppointmentResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingAppointmentResponse> response = (ApiResponse<CoachingAppointmentResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingAppointmentResponse> response = (ApiResponse<CoachingAppointmentResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an existing annotation.
   * You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param annotationId The ID of the annotation. (required)
   * @param body The new version of the annotation (required)
   * @return CoachingAnnotation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAnnotation patchCoachingAppointmentAnnotation(String appointmentId, String annotationId, CoachingAnnotation body) throws IOException, ApiException {
    return  patchCoachingAppointmentAnnotation(createPatchCoachingAppointmentAnnotationRequest(appointmentId, annotationId, body));
  }

  /**
   * Update an existing annotation.
   * You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param annotationId The ID of the annotation. (required)
   * @param body The new version of the annotation (required)
   * @return CoachingAnnotation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAnnotation> patchCoachingAppointmentAnnotationWithHttpInfo(String appointmentId, String annotationId, CoachingAnnotation body) throws IOException {
    return patchCoachingAppointmentAnnotation(createPatchCoachingAppointmentAnnotationRequest(appointmentId, annotationId, body).withHttpInfo());
  }

  private PatchCoachingAppointmentAnnotationRequest createPatchCoachingAppointmentAnnotationRequest(String appointmentId, String annotationId, CoachingAnnotation body) {
    return PatchCoachingAppointmentAnnotationRequest.builder()
            .withAppointmentId(appointmentId)
    
            .withAnnotationId(annotationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an existing annotation.
   * You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment
   * @param request The request object
   * @return CoachingAnnotation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAnnotation patchCoachingAppointmentAnnotation(PatchCoachingAppointmentAnnotationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingAnnotation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingAnnotation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an existing annotation.
   * You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAnnotation> patchCoachingAppointmentAnnotation(ApiRequest<CoachingAnnotation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingAnnotation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingAnnotation> response = (ApiResponse<CoachingAnnotation>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingAnnotation> response = (ApiResponse<CoachingAnnotation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update the status of a coaching appointment
   * Permission not required if you are an attendee, creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param body Updated status of the coaching appointment (required)
   * @return CoachingAppointmentStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentStatusResponse patchCoachingAppointmentStatus(String appointmentId, CoachingAppointmentStatusRequest body) throws IOException, ApiException {
    return  patchCoachingAppointmentStatus(createPatchCoachingAppointmentStatusRequest(appointmentId, body));
  }

  /**
   * Update the status of a coaching appointment
   * Permission not required if you are an attendee, creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param body Updated status of the coaching appointment (required)
   * @return CoachingAppointmentStatusResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentStatusResponse> patchCoachingAppointmentStatusWithHttpInfo(String appointmentId, CoachingAppointmentStatusRequest body) throws IOException {
    return patchCoachingAppointmentStatus(createPatchCoachingAppointmentStatusRequest(appointmentId, body).withHttpInfo());
  }

  private PatchCoachingAppointmentStatusRequest createPatchCoachingAppointmentStatusRequest(String appointmentId, CoachingAppointmentStatusRequest body) {
    return PatchCoachingAppointmentStatusRequest.builder()
            .withAppointmentId(appointmentId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update the status of a coaching appointment
   * Permission not required if you are an attendee, creator or facilitator of the appointment
   * @param request The request object
   * @return CoachingAppointmentStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentStatusResponse patchCoachingAppointmentStatus(PatchCoachingAppointmentStatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingAppointmentStatusResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingAppointmentStatusResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the status of a coaching appointment
   * Permission not required if you are an attendee, creator or facilitator of the appointment
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentStatusResponse> patchCoachingAppointmentStatus(ApiRequest<CoachingAppointmentStatusRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingAppointmentStatusResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingAppointmentStatusResponse> response = (ApiResponse<CoachingAppointmentStatusResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingAppointmentStatusResponse> response = (ApiResponse<CoachingAppointmentStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an existing notification.
   * Can only update your own notifications.
   * @param notificationId The ID of the notification. (required)
   * @param body Change the read state of a notification (required)
   * @return CoachingNotification
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingNotification patchCoachingNotification(String notificationId, CoachingNotification body) throws IOException, ApiException {
    return  patchCoachingNotification(createPatchCoachingNotificationRequest(notificationId, body));
  }

  /**
   * Update an existing notification.
   * Can only update your own notifications.
   * @param notificationId The ID of the notification. (required)
   * @param body Change the read state of a notification (required)
   * @return CoachingNotification
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingNotification> patchCoachingNotificationWithHttpInfo(String notificationId, CoachingNotification body) throws IOException {
    return patchCoachingNotification(createPatchCoachingNotificationRequest(notificationId, body).withHttpInfo());
  }

  private PatchCoachingNotificationRequest createPatchCoachingNotificationRequest(String notificationId, CoachingNotification body) {
    return PatchCoachingNotificationRequest.builder()
            .withNotificationId(notificationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an existing notification.
   * Can only update your own notifications.
   * @param request The request object
   * @return CoachingNotification
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingNotification patchCoachingNotification(PatchCoachingNotificationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingNotification> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingNotification>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an existing notification.
   * Can only update your own notifications.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingNotification> patchCoachingNotification(ApiRequest<CoachingNotification> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingNotification>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingNotification> response = (ApiResponse<CoachingNotification>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingNotification> response = (ApiResponse<CoachingNotification>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new annotation.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can create private annotations).
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param body The annotation to add (required)
   * @return CoachingAnnotation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAnnotation postCoachingAppointmentAnnotations(String appointmentId, CoachingAnnotationCreateRequest body) throws IOException, ApiException {
    return  postCoachingAppointmentAnnotations(createPostCoachingAppointmentAnnotationsRequest(appointmentId, body));
  }

  /**
   * Create a new annotation.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can create private annotations).
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param body The annotation to add (required)
   * @return CoachingAnnotation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAnnotation> postCoachingAppointmentAnnotationsWithHttpInfo(String appointmentId, CoachingAnnotationCreateRequest body) throws IOException {
    return postCoachingAppointmentAnnotations(createPostCoachingAppointmentAnnotationsRequest(appointmentId, body).withHttpInfo());
  }

  private PostCoachingAppointmentAnnotationsRequest createPostCoachingAppointmentAnnotationsRequest(String appointmentId, CoachingAnnotationCreateRequest body) {
    return PostCoachingAppointmentAnnotationsRequest.builder()
            .withAppointmentId(appointmentId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new annotation.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can create private annotations).
   * @param request The request object
   * @return CoachingAnnotation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAnnotation postCoachingAppointmentAnnotations(PostCoachingAppointmentAnnotationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingAnnotation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingAnnotation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new annotation.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can create private annotations).
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAnnotation> postCoachingAppointmentAnnotations(ApiRequest<CoachingAnnotationCreateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingAnnotation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingAnnotation> response = (ApiResponse<CoachingAnnotation>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingAnnotation> response = (ApiResponse<CoachingAnnotation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add a conversation to an appointment
   * Permission not required if you are the creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param body body (required)
   * @return AddConversationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AddConversationResponse postCoachingAppointmentConversations(String appointmentId, AddConversationRequest body) throws IOException, ApiException {
    return  postCoachingAppointmentConversations(createPostCoachingAppointmentConversationsRequest(appointmentId, body));
  }

  /**
   * Add a conversation to an appointment
   * Permission not required if you are the creator or facilitator of the appointment
   * @param appointmentId The ID of the coaching appointment. (required)
   * @param body body (required)
   * @return AddConversationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AddConversationResponse> postCoachingAppointmentConversationsWithHttpInfo(String appointmentId, AddConversationRequest body) throws IOException {
    return postCoachingAppointmentConversations(createPostCoachingAppointmentConversationsRequest(appointmentId, body).withHttpInfo());
  }

  private PostCoachingAppointmentConversationsRequest createPostCoachingAppointmentConversationsRequest(String appointmentId, AddConversationRequest body) {
    return PostCoachingAppointmentConversationsRequest.builder()
            .withAppointmentId(appointmentId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add a conversation to an appointment
   * Permission not required if you are the creator or facilitator of the appointment
   * @param request The request object
   * @return AddConversationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AddConversationResponse postCoachingAppointmentConversations(PostCoachingAppointmentConversationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AddConversationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AddConversationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a conversation to an appointment
   * Permission not required if you are the creator or facilitator of the appointment
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AddConversationResponse> postCoachingAppointmentConversations(ApiRequest<AddConversationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AddConversationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AddConversationResponse> response = (ApiResponse<AddConversationResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AddConversationResponse> response = (ApiResponse<AddConversationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new appointment
   * 
   * @param body The appointment to add (required)
   * @return CoachingAppointmentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentResponse postCoachingAppointments(CreateCoachingAppointmentRequest body) throws IOException, ApiException {
    return  postCoachingAppointments(createPostCoachingAppointmentsRequest(body));
  }

  /**
   * Create a new appointment
   * 
   * @param body The appointment to add (required)
   * @return CoachingAppointmentResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentResponse> postCoachingAppointmentsWithHttpInfo(CreateCoachingAppointmentRequest body) throws IOException {
    return postCoachingAppointments(createPostCoachingAppointmentsRequest(body).withHttpInfo());
  }

  private PostCoachingAppointmentsRequest createPostCoachingAppointmentsRequest(CreateCoachingAppointmentRequest body) {
    return PostCoachingAppointmentsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new appointment
   * 
   * @param request The request object
   * @return CoachingAppointmentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentResponse postCoachingAppointments(PostCoachingAppointmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingAppointmentResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingAppointmentResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new appointment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentResponse> postCoachingAppointments(ApiRequest<CreateCoachingAppointmentRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingAppointmentResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingAppointmentResponse> response = (ApiResponse<CoachingAppointmentResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingAppointmentResponse> response = (ApiResponse<CoachingAppointmentResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve aggregated appointment data
   * 
   * @param body Aggregate Request (required)
   * @return CoachingAppointmentAggregateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentAggregateResponse postCoachingAppointmentsAggregatesQuery(CoachingAppointmentAggregateRequest body) throws IOException, ApiException {
    return  postCoachingAppointmentsAggregatesQuery(createPostCoachingAppointmentsAggregatesQueryRequest(body));
  }

  /**
   * Retrieve aggregated appointment data
   * 
   * @param body Aggregate Request (required)
   * @return CoachingAppointmentAggregateResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentAggregateResponse> postCoachingAppointmentsAggregatesQueryWithHttpInfo(CoachingAppointmentAggregateRequest body) throws IOException {
    return postCoachingAppointmentsAggregatesQuery(createPostCoachingAppointmentsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostCoachingAppointmentsAggregatesQueryRequest createPostCoachingAppointmentsAggregatesQueryRequest(CoachingAppointmentAggregateRequest body) {
    return PostCoachingAppointmentsAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Retrieve aggregated appointment data
   * 
   * @param request The request object
   * @return CoachingAppointmentAggregateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingAppointmentAggregateResponse postCoachingAppointmentsAggregatesQuery(PostCoachingAppointmentsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingAppointmentAggregateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingAppointmentAggregateResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve aggregated appointment data
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingAppointmentAggregateResponse> postCoachingAppointmentsAggregatesQuery(ApiRequest<CoachingAppointmentAggregateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingAppointmentAggregateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingAppointmentAggregateResponse> response = (ApiResponse<CoachingAppointmentAggregateResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingAppointmentAggregateResponse> response = (ApiResponse<CoachingAppointmentAggregateResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of possible slots where a coaching appointment can be scheduled.
   * 
   * @param body The slot search request (required)
   * @return CoachingSlotsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingSlotsResponse postCoachingScheduleslotsQuery(CoachingSlotsRequest body) throws IOException, ApiException {
    return  postCoachingScheduleslotsQuery(createPostCoachingScheduleslotsQueryRequest(body));
  }

  /**
   * Get list of possible slots where a coaching appointment can be scheduled.
   * 
   * @param body The slot search request (required)
   * @return CoachingSlotsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingSlotsResponse> postCoachingScheduleslotsQueryWithHttpInfo(CoachingSlotsRequest body) throws IOException {
    return postCoachingScheduleslotsQuery(createPostCoachingScheduleslotsQueryRequest(body).withHttpInfo());
  }

  private PostCoachingScheduleslotsQueryRequest createPostCoachingScheduleslotsQueryRequest(CoachingSlotsRequest body) {
    return PostCoachingScheduleslotsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Get list of possible slots where a coaching appointment can be scheduled.
   * 
   * @param request The request object
   * @return CoachingSlotsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoachingSlotsResponse postCoachingScheduleslotsQuery(PostCoachingScheduleslotsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoachingSlotsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoachingSlotsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of possible slots where a coaching appointment can be scheduled.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoachingSlotsResponse> postCoachingScheduleslotsQuery(ApiRequest<CoachingSlotsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoachingSlotsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoachingSlotsResponse> response = (ApiResponse<CoachingSlotsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CoachingSlotsResponse> response = (ApiResponse<CoachingSlotsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
