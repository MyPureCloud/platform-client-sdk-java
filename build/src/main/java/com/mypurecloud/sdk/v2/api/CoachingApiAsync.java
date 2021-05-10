package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;

import com.mypurecloud.sdk.v2.AsyncApiCallback;
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
import java.util.concurrent.Future;


public class CoachingApiAsync {
  private final ApiClient pcapiClient;

  public CoachingApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public CoachingApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete an existing appointment
   * Permission not required if you are the creator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingAppointmentReference> deleteCoachingAppointmentAsync(DeleteCoachingAppointmentRequest request, final AsyncApiCallback<CoachingAppointmentReference> callback) {
    try {
      final SettableFuture<CoachingAppointmentReference> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingAppointmentReference>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentReference>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentReference> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an existing appointment
   * Permission not required if you are the creator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingAppointmentReference>> deleteCoachingAppointmentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CoachingAppointmentReference>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingAppointmentReference>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingAppointmentReference>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentReference>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentReference> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentReference> response = (ApiResponse<CoachingAppointmentReference>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentReference> response = (ApiResponse<CoachingAppointmentReference>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Delete an existing annotation
   * You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteCoachingAppointmentAnnotationAsync(DeleteCoachingAppointmentAnnotationRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an existing annotation
   * You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteCoachingAppointmentAnnotationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Retrieve an appointment
   * Permission not required if you are the attendee, creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingAppointmentResponse> getCoachingAppointmentAsync(GetCoachingAppointmentRequest request, final AsyncApiCallback<CoachingAppointmentResponse> callback) {
    try {
      final SettableFuture<CoachingAppointmentResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingAppointmentResponse>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve an appointment
   * Permission not required if you are the attendee, creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingAppointmentResponse>> getCoachingAppointmentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CoachingAppointmentResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingAppointmentResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingAppointmentResponse>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentResponse> response = (ApiResponse<CoachingAppointmentResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentResponse> response = (ApiResponse<CoachingAppointmentResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Retrieve an annotation.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingAnnotation> getCoachingAppointmentAnnotationAsync(GetCoachingAppointmentAnnotationRequest request, final AsyncApiCallback<CoachingAnnotation> callback) {
    try {
      final SettableFuture<CoachingAnnotation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingAnnotation>() {}, new AsyncApiCallback<ApiResponse<CoachingAnnotation>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAnnotation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve an annotation.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingAnnotation>> getCoachingAppointmentAnnotationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CoachingAnnotation>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingAnnotation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingAnnotation>() {}, new AsyncApiCallback<ApiResponse<CoachingAnnotation>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAnnotation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAnnotation> response = (ApiResponse<CoachingAnnotation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAnnotation> response = (ApiResponse<CoachingAnnotation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a list of annotations.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingAnnotationList> getCoachingAppointmentAnnotationsAsync(GetCoachingAppointmentAnnotationsRequest request, final AsyncApiCallback<CoachingAnnotationList> callback) {
    try {
      final SettableFuture<CoachingAnnotationList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingAnnotationList>() {}, new AsyncApiCallback<ApiResponse<CoachingAnnotationList>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAnnotationList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of annotations.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingAnnotationList>> getCoachingAppointmentAnnotationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CoachingAnnotationList>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingAnnotationList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingAnnotationList>() {}, new AsyncApiCallback<ApiResponse<CoachingAnnotationList>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAnnotationList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAnnotationList> response = (ApiResponse<CoachingAnnotationList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAnnotationList> response = (ApiResponse<CoachingAnnotationList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the list of status changes for a coaching appointment.
   * Permission not required if you are an attendee, creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingAppointmentStatusResponseList> getCoachingAppointmentStatusesAsync(GetCoachingAppointmentStatusesRequest request, final AsyncApiCallback<CoachingAppointmentStatusResponseList> callback) {
    try {
      final SettableFuture<CoachingAppointmentStatusResponseList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingAppointmentStatusResponseList>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentStatusResponseList>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentStatusResponseList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of status changes for a coaching appointment.
   * Permission not required if you are an attendee, creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingAppointmentStatusResponseList>> getCoachingAppointmentStatusesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CoachingAppointmentStatusResponseList>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingAppointmentStatusResponseList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingAppointmentStatusResponseList>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentStatusResponseList>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentStatusResponseList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentStatusResponseList> response = (ApiResponse<CoachingAppointmentStatusResponseList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentStatusResponseList> response = (ApiResponse<CoachingAppointmentStatusResponseList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get appointments for users and optional date range
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingAppointmentResponseList> getCoachingAppointmentsAsync(GetCoachingAppointmentsRequest request, final AsyncApiCallback<CoachingAppointmentResponseList> callback) {
    try {
      final SettableFuture<CoachingAppointmentResponseList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingAppointmentResponseList>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentResponseList>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentResponseList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get appointments for users and optional date range
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingAppointmentResponseList>> getCoachingAppointmentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CoachingAppointmentResponseList>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingAppointmentResponseList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingAppointmentResponseList>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentResponseList>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentResponseList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentResponseList> response = (ApiResponse<CoachingAppointmentResponseList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentResponseList> response = (ApiResponse<CoachingAppointmentResponseList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get my appointments for a given date range
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingAppointmentResponseList> getCoachingAppointmentsMeAsync(GetCoachingAppointmentsMeRequest request, final AsyncApiCallback<CoachingAppointmentResponseList> callback) {
    try {
      final SettableFuture<CoachingAppointmentResponseList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingAppointmentResponseList>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentResponseList>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentResponseList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get my appointments for a given date range
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingAppointmentResponseList>> getCoachingAppointmentsMeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CoachingAppointmentResponseList>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingAppointmentResponseList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingAppointmentResponseList>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentResponseList>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentResponseList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentResponseList> response = (ApiResponse<CoachingAppointmentResponseList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentResponseList> response = (ApiResponse<CoachingAppointmentResponseList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get an existing notification
   * Permission not required if you are the owner of the notification.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingNotification> getCoachingNotificationAsync(GetCoachingNotificationRequest request, final AsyncApiCallback<CoachingNotification> callback) {
    try {
      final SettableFuture<CoachingNotification> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingNotification>() {}, new AsyncApiCallback<ApiResponse<CoachingNotification>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingNotification> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an existing notification
   * Permission not required if you are the owner of the notification.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingNotification>> getCoachingNotificationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CoachingNotification>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingNotification>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingNotification>() {}, new AsyncApiCallback<ApiResponse<CoachingNotification>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingNotification> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingNotification> response = (ApiResponse<CoachingNotification>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingNotification> response = (ApiResponse<CoachingNotification>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Retrieve the list of your notifications.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingNotificationList> getCoachingNotificationsAsync(GetCoachingNotificationsRequest request, final AsyncApiCallback<CoachingNotificationList> callback) {
    try {
      final SettableFuture<CoachingNotificationList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingNotificationList>() {}, new AsyncApiCallback<ApiResponse<CoachingNotificationList>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingNotificationList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve the list of your notifications.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingNotificationList>> getCoachingNotificationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CoachingNotificationList>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingNotificationList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingNotificationList>() {}, new AsyncApiCallback<ApiResponse<CoachingNotificationList>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingNotificationList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingNotificationList> response = (ApiResponse<CoachingNotificationList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingNotificationList> response = (ApiResponse<CoachingNotificationList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update an existing appointment
   * Permission not required if you are the creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingAppointmentResponse> patchCoachingAppointmentAsync(PatchCoachingAppointmentRequest request, final AsyncApiCallback<CoachingAppointmentResponse> callback) {
    try {
      final SettableFuture<CoachingAppointmentResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingAppointmentResponse>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an existing appointment
   * Permission not required if you are the creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingAppointmentResponse>> patchCoachingAppointmentAsync(ApiRequest<UpdateCoachingAppointmentRequest> request, final AsyncApiCallback<ApiResponse<CoachingAppointmentResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingAppointmentResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingAppointmentResponse>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentResponse> response = (ApiResponse<CoachingAppointmentResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentResponse> response = (ApiResponse<CoachingAppointmentResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update an existing annotation.
   * You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingAnnotation> patchCoachingAppointmentAnnotationAsync(PatchCoachingAppointmentAnnotationRequest request, final AsyncApiCallback<CoachingAnnotation> callback) {
    try {
      final SettableFuture<CoachingAnnotation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingAnnotation>() {}, new AsyncApiCallback<ApiResponse<CoachingAnnotation>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAnnotation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an existing annotation.
   * You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingAnnotation>> patchCoachingAppointmentAnnotationAsync(ApiRequest<CoachingAnnotation> request, final AsyncApiCallback<ApiResponse<CoachingAnnotation>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingAnnotation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingAnnotation>() {}, new AsyncApiCallback<ApiResponse<CoachingAnnotation>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAnnotation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAnnotation> response = (ApiResponse<CoachingAnnotation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAnnotation> response = (ApiResponse<CoachingAnnotation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update the status of a coaching appointment
   * Permission not required if you are an attendee, creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingAppointmentStatusResponse> patchCoachingAppointmentStatusAsync(PatchCoachingAppointmentStatusRequest request, final AsyncApiCallback<CoachingAppointmentStatusResponse> callback) {
    try {
      final SettableFuture<CoachingAppointmentStatusResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingAppointmentStatusResponse>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentStatusResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the status of a coaching appointment
   * Permission not required if you are an attendee, creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingAppointmentStatusResponse>> patchCoachingAppointmentStatusAsync(ApiRequest<CoachingAppointmentStatusRequest> request, final AsyncApiCallback<ApiResponse<CoachingAppointmentStatusResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingAppointmentStatusResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingAppointmentStatusResponse>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentStatusResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentStatusResponse> response = (ApiResponse<CoachingAppointmentStatusResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentStatusResponse> response = (ApiResponse<CoachingAppointmentStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update an existing notification.
   * Can only update your own notifications.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingNotification> patchCoachingNotificationAsync(PatchCoachingNotificationRequest request, final AsyncApiCallback<CoachingNotification> callback) {
    try {
      final SettableFuture<CoachingNotification> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingNotification>() {}, new AsyncApiCallback<ApiResponse<CoachingNotification>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingNotification> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an existing notification.
   * Can only update your own notifications.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingNotification>> patchCoachingNotificationAsync(ApiRequest<CoachingNotification> request, final AsyncApiCallback<ApiResponse<CoachingNotification>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingNotification>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingNotification>() {}, new AsyncApiCallback<ApiResponse<CoachingNotification>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingNotification> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingNotification> response = (ApiResponse<CoachingNotification>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingNotification> response = (ApiResponse<CoachingNotification>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a new annotation.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can create private annotations).
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingAnnotation> postCoachingAppointmentAnnotationsAsync(PostCoachingAppointmentAnnotationsRequest request, final AsyncApiCallback<CoachingAnnotation> callback) {
    try {
      final SettableFuture<CoachingAnnotation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingAnnotation>() {}, new AsyncApiCallback<ApiResponse<CoachingAnnotation>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAnnotation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new annotation.
   * You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can create private annotations).
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingAnnotation>> postCoachingAppointmentAnnotationsAsync(ApiRequest<CoachingAnnotationCreateRequest> request, final AsyncApiCallback<ApiResponse<CoachingAnnotation>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingAnnotation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingAnnotation>() {}, new AsyncApiCallback<ApiResponse<CoachingAnnotation>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAnnotation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAnnotation> response = (ApiResponse<CoachingAnnotation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAnnotation> response = (ApiResponse<CoachingAnnotation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Add a conversation to an appointment
   * Permission not required if you are the creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AddConversationResponse> postCoachingAppointmentConversationsAsync(PostCoachingAppointmentConversationsRequest request, final AsyncApiCallback<AddConversationResponse> callback) {
    try {
      final SettableFuture<AddConversationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AddConversationResponse>() {}, new AsyncApiCallback<ApiResponse<AddConversationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AddConversationResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add a conversation to an appointment
   * Permission not required if you are the creator or facilitator of the appointment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AddConversationResponse>> postCoachingAppointmentConversationsAsync(ApiRequest<AddConversationRequest> request, final AsyncApiCallback<ApiResponse<AddConversationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AddConversationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AddConversationResponse>() {}, new AsyncApiCallback<ApiResponse<AddConversationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AddConversationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AddConversationResponse> response = (ApiResponse<AddConversationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AddConversationResponse> response = (ApiResponse<AddConversationResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a new appointment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingAppointmentResponse> postCoachingAppointmentsAsync(PostCoachingAppointmentsRequest request, final AsyncApiCallback<CoachingAppointmentResponse> callback) {
    try {
      final SettableFuture<CoachingAppointmentResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingAppointmentResponse>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new appointment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingAppointmentResponse>> postCoachingAppointmentsAsync(ApiRequest<CreateCoachingAppointmentRequest> request, final AsyncApiCallback<ApiResponse<CoachingAppointmentResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingAppointmentResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingAppointmentResponse>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentResponse> response = (ApiResponse<CoachingAppointmentResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentResponse> response = (ApiResponse<CoachingAppointmentResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Retrieve aggregated appointment data
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingAppointmentAggregateResponse> postCoachingAppointmentsAggregatesQueryAsync(PostCoachingAppointmentsAggregatesQueryRequest request, final AsyncApiCallback<CoachingAppointmentAggregateResponse> callback) {
    try {
      final SettableFuture<CoachingAppointmentAggregateResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingAppointmentAggregateResponse>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentAggregateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentAggregateResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve aggregated appointment data
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingAppointmentAggregateResponse>> postCoachingAppointmentsAggregatesQueryAsync(ApiRequest<CoachingAppointmentAggregateRequest> request, final AsyncApiCallback<ApiResponse<CoachingAppointmentAggregateResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingAppointmentAggregateResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingAppointmentAggregateResponse>() {}, new AsyncApiCallback<ApiResponse<CoachingAppointmentAggregateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingAppointmentAggregateResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentAggregateResponse> response = (ApiResponse<CoachingAppointmentAggregateResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingAppointmentAggregateResponse> response = (ApiResponse<CoachingAppointmentAggregateResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get list of possible slots where a coaching appointment can be scheduled.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoachingSlotsResponse> postCoachingScheduleslotsQueryAsync(PostCoachingScheduleslotsQueryRequest request, final AsyncApiCallback<CoachingSlotsResponse> callback) {
    try {
      final SettableFuture<CoachingSlotsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoachingSlotsResponse>() {}, new AsyncApiCallback<ApiResponse<CoachingSlotsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingSlotsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of possible slots where a coaching appointment can be scheduled.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoachingSlotsResponse>> postCoachingScheduleslotsQueryAsync(ApiRequest<CoachingSlotsRequest> request, final AsyncApiCallback<ApiResponse<CoachingSlotsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CoachingSlotsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoachingSlotsResponse>() {}, new AsyncApiCallback<ApiResponse<CoachingSlotsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CoachingSlotsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingSlotsResponse> response = (ApiResponse<CoachingSlotsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoachingSlotsResponse> response = (ApiResponse<CoachingSlotsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  

  private <T> void notifySuccess(SettableFuture<T> future, AsyncApiCallback<T> callback, T result) {
    if (callback != null) {
      try {
        callback.onCompleted(result);
        future.set(result);
      }
      catch (Throwable exception) {
        future.setException(exception);
      }
    }
    else {
      future.set(result);
    }
  }

  private <T> void notifyFailure(SettableFuture<T> future, AsyncApiCallback<T> callback, Throwable exception) {
    if (callback != null) {
      try {
        callback.onFailed(exception);
        future.setException(exception);
      }
      catch (Throwable callbackException) {
        future.setException(callbackException);
      }
    }
    else {
      future.setException(exception);
    }
  }
}
