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
import com.mypurecloud.sdk.v2.model.InboundDomain;
import com.mypurecloud.sdk.v2.model.InboundRoute;
import com.mypurecloud.sdk.v2.model.InboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.InboundDomainEntityListing;
import com.mypurecloud.sdk.v2.model.EmailSetup;
import com.mypurecloud.sdk.v2.model.LanguageEntityListing;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.EstimatedWaitTimePredictions;
import com.mypurecloud.sdk.v2.model.QueueMemberEntityListing;
import com.mypurecloud.sdk.v2.model.WrapupCodeEntityListing;
import com.mypurecloud.sdk.v2.model.QueueEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingSkill;
import com.mypurecloud.sdk.v2.model.SkillEntityListing;
import com.mypurecloud.sdk.v2.model.Utilization;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.QueueMember;
import com.mypurecloud.sdk.v2.model.QualifierMappingObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ObservationQuery;
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.CreateQueueRequest;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;


import com.mypurecloud.sdk.v2.api.request.DeleteRoutingEmailDomainRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingEmailDomainRouteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueUserRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingSkillRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserRoutingskillRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainRouteRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainRoutesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailSetupRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingLanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueEstimatedwaittimeRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueMediatypeEstimatedwaittimeRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSkillRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSkillsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRoutingskillsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingQueueUserRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingQueueUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsQueuesObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingEmailDomainRoutesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingEmailDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingLanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueueUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueueWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingSkillsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserRoutingskillsRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingEmailDomainRouteRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingQueueRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserRoutingskillRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class RoutingApiAsync {
  private final ApiClient pcapiClient;

  public RoutingApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public RoutingApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a domain
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteRoutingEmailDomainAsync(DeleteRoutingEmailDomainRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
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
   * Delete a domain
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteRoutingEmailDomainAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
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
   * Delete a route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteRoutingEmailDomainRouteAsync(DeleteRoutingEmailDomainRouteRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
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
   * Delete a route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteRoutingEmailDomainRouteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
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
   * Delete a queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteRoutingQueueAsync(DeleteRoutingQueueRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
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
   * Delete a queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteRoutingQueueAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
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
   * Delete queue member
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteRoutingQueueUserAsync(DeleteRoutingQueueUserRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
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
   * Delete queue member
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteRoutingQueueUserAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
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
   * Delete a wrap-up code from a queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteRoutingQueueWrapupcodeAsync(DeleteRoutingQueueWrapupcodeRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
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
   * Delete a wrap-up code from a queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteRoutingQueueWrapupcodeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
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
   * Delete Routing Skill
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteRoutingSkillAsync(DeleteRoutingSkillRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
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
   * Delete Routing Skill
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteRoutingSkillAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
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
   * Delete utilization settings and revert to system defaults.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteRoutingUtilizationAsync(DeleteRoutingUtilizationRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
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
   * Delete utilization settings and revert to system defaults.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteRoutingUtilizationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
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
   * Delete wrap-up code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteRoutingWrapupcodeAsync(DeleteRoutingWrapupcodeRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
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
   * Delete wrap-up code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteRoutingWrapupcodeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
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
   * Remove routing skill from user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteUserRoutingskillAsync(DeleteUserRoutingskillRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
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
   * Remove routing skill from user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteUserRoutingskillAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get domain
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InboundDomain> getRoutingEmailDomainAsync(GetRoutingEmailDomainRequest request, AsyncApiCallback<InboundDomain> callback) {
    try {
      SettableFuture<InboundDomain> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InboundDomain>() {}, new AsyncApiCallback<ApiResponse<InboundDomain>>() {
        @Override
        public void onCompleted(ApiResponse<InboundDomain> response) {
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
   * Get domain
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InboundDomain>> getRoutingEmailDomainAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InboundDomain>> callback) {
    try {
      SettableFuture<ApiResponse<InboundDomain>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InboundDomain>() {}, new AsyncApiCallback<ApiResponse<InboundDomain>>() {
        @Override
        public void onCompleted(ApiResponse<InboundDomain> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundDomain> response = (ApiResponse<InboundDomain>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundDomain> response = (ApiResponse<InboundDomain>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InboundRoute> getRoutingEmailDomainRouteAsync(GetRoutingEmailDomainRouteRequest request, AsyncApiCallback<InboundRoute> callback) {
    try {
      SettableFuture<InboundRoute> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InboundRoute>() {}, new AsyncApiCallback<ApiResponse<InboundRoute>>() {
        @Override
        public void onCompleted(ApiResponse<InboundRoute> response) {
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
   * Get a route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InboundRoute>> getRoutingEmailDomainRouteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InboundRoute>> callback) {
    try {
      SettableFuture<ApiResponse<InboundRoute>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InboundRoute>() {}, new AsyncApiCallback<ApiResponse<InboundRoute>>() {
        @Override
        public void onCompleted(ApiResponse<InboundRoute> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundRoute> response = (ApiResponse<InboundRoute>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundRoute> response = (ApiResponse<InboundRoute>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get routes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InboundRouteEntityListing> getRoutingEmailDomainRoutesAsync(GetRoutingEmailDomainRoutesRequest request, AsyncApiCallback<InboundRouteEntityListing> callback) {
    try {
      SettableFuture<InboundRouteEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InboundRouteEntityListing>() {}, new AsyncApiCallback<ApiResponse<InboundRouteEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<InboundRouteEntityListing> response) {
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
   * Get routes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InboundRouteEntityListing>> getRoutingEmailDomainRoutesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InboundRouteEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<InboundRouteEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InboundRouteEntityListing>() {}, new AsyncApiCallback<ApiResponse<InboundRouteEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<InboundRouteEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundRouteEntityListing> response = (ApiResponse<InboundRouteEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundRouteEntityListing> response = (ApiResponse<InboundRouteEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get domains
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InboundDomainEntityListing> getRoutingEmailDomainsAsync(GetRoutingEmailDomainsRequest request, AsyncApiCallback<InboundDomainEntityListing> callback) {
    try {
      SettableFuture<InboundDomainEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InboundDomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<InboundDomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<InboundDomainEntityListing> response) {
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
   * Get domains
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InboundDomainEntityListing>> getRoutingEmailDomainsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InboundDomainEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<InboundDomainEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InboundDomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<InboundDomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<InboundDomainEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundDomainEntityListing> response = (ApiResponse<InboundDomainEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundDomainEntityListing> response = (ApiResponse<InboundDomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get email setup
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailSetup> getRoutingEmailSetupAsync(GetRoutingEmailSetupRequest request, AsyncApiCallback<EmailSetup> callback) {
    try {
      SettableFuture<EmailSetup> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailSetup>() {}, new AsyncApiCallback<ApiResponse<EmailSetup>>() {
        @Override
        public void onCompleted(ApiResponse<EmailSetup> response) {
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
   * Get email setup
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailSetup>> getRoutingEmailSetupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EmailSetup>> callback) {
    try {
      SettableFuture<ApiResponse<EmailSetup>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailSetup>() {}, new AsyncApiCallback<ApiResponse<EmailSetup>>() {
        @Override
        public void onCompleted(ApiResponse<EmailSetup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailSetup> response = (ApiResponse<EmailSetup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailSetup> response = (ApiResponse<EmailSetup>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the list of supported languages.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LanguageEntityListing> getRoutingLanguagesAsync(GetRoutingLanguagesRequest request, AsyncApiCallback<LanguageEntityListing> callback) {
    try {
      SettableFuture<LanguageEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LanguageEntityListing>() {}, new AsyncApiCallback<ApiResponse<LanguageEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LanguageEntityListing> response) {
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
   * Get the list of supported languages.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LanguageEntityListing>> getRoutingLanguagesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LanguageEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<LanguageEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LanguageEntityListing>() {}, new AsyncApiCallback<ApiResponse<LanguageEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LanguageEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LanguageEntityListing> response = (ApiResponse<LanguageEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LanguageEntityListing> response = (ApiResponse<LanguageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get details about this queue.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Queue> getRoutingQueueAsync(GetRoutingQueueRequest request, AsyncApiCallback<Queue> callback) {
    try {
      SettableFuture<Queue> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Queue>() {}, new AsyncApiCallback<ApiResponse<Queue>>() {
        @Override
        public void onCompleted(ApiResponse<Queue> response) {
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
   * Get details about this queue.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Queue>> getRoutingQueueAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Queue>> callback) {
    try {
      SettableFuture<ApiResponse<Queue>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Queue>() {}, new AsyncApiCallback<ApiResponse<Queue>>() {
        @Override
        public void onCompleted(ApiResponse<Queue> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Queue> response = (ApiResponse<Queue>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Queue> response = (ApiResponse<Queue>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get Estimated Wait Time
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EstimatedWaitTimePredictions> getRoutingQueueEstimatedwaittimeAsync(GetRoutingQueueEstimatedwaittimeRequest request, AsyncApiCallback<EstimatedWaitTimePredictions> callback) {
    try {
      SettableFuture<EstimatedWaitTimePredictions> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EstimatedWaitTimePredictions>() {}, new AsyncApiCallback<ApiResponse<EstimatedWaitTimePredictions>>() {
        @Override
        public void onCompleted(ApiResponse<EstimatedWaitTimePredictions> response) {
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
   * Get Estimated Wait Time
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EstimatedWaitTimePredictions>> getRoutingQueueEstimatedwaittimeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EstimatedWaitTimePredictions>> callback) {
    try {
      SettableFuture<ApiResponse<EstimatedWaitTimePredictions>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EstimatedWaitTimePredictions>() {}, new AsyncApiCallback<ApiResponse<EstimatedWaitTimePredictions>>() {
        @Override
        public void onCompleted(ApiResponse<EstimatedWaitTimePredictions> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EstimatedWaitTimePredictions> response = (ApiResponse<EstimatedWaitTimePredictions>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EstimatedWaitTimePredictions> response = (ApiResponse<EstimatedWaitTimePredictions>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get Estimated Wait Time
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EstimatedWaitTimePredictions> getRoutingQueueMediatypeEstimatedwaittimeAsync(GetRoutingQueueMediatypeEstimatedwaittimeRequest request, AsyncApiCallback<EstimatedWaitTimePredictions> callback) {
    try {
      SettableFuture<EstimatedWaitTimePredictions> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EstimatedWaitTimePredictions>() {}, new AsyncApiCallback<ApiResponse<EstimatedWaitTimePredictions>>() {
        @Override
        public void onCompleted(ApiResponse<EstimatedWaitTimePredictions> response) {
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
   * Get Estimated Wait Time
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EstimatedWaitTimePredictions>> getRoutingQueueMediatypeEstimatedwaittimeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EstimatedWaitTimePredictions>> callback) {
    try {
      SettableFuture<ApiResponse<EstimatedWaitTimePredictions>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EstimatedWaitTimePredictions>() {}, new AsyncApiCallback<ApiResponse<EstimatedWaitTimePredictions>>() {
        @Override
        public void onCompleted(ApiResponse<EstimatedWaitTimePredictions> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EstimatedWaitTimePredictions> response = (ApiResponse<EstimatedWaitTimePredictions>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EstimatedWaitTimePredictions> response = (ApiResponse<EstimatedWaitTimePredictions>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the members of this queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QueueMemberEntityListing> getRoutingQueueUsersAsync(GetRoutingQueueUsersRequest request, AsyncApiCallback<QueueMemberEntityListing> callback) {
    try {
      SettableFuture<QueueMemberEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QueueMemberEntityListing>() {}, new AsyncApiCallback<ApiResponse<QueueMemberEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<QueueMemberEntityListing> response) {
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
   * Get the members of this queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QueueMemberEntityListing>> getRoutingQueueUsersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<QueueMemberEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<QueueMemberEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QueueMemberEntityListing>() {}, new AsyncApiCallback<ApiResponse<QueueMemberEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<QueueMemberEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QueueMemberEntityListing> response = (ApiResponse<QueueMemberEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QueueMemberEntityListing> response = (ApiResponse<QueueMemberEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the wrap-up codes for a queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WrapupCodeEntityListing> getRoutingQueueWrapupcodesAsync(GetRoutingQueueWrapupcodesRequest request, AsyncApiCallback<WrapupCodeEntityListing> callback) {
    try {
      SettableFuture<WrapupCodeEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WrapupCodeEntityListing>() {}, new AsyncApiCallback<ApiResponse<WrapupCodeEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WrapupCodeEntityListing> response) {
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
   * Get the wrap-up codes for a queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WrapupCodeEntityListing>> getRoutingQueueWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WrapupCodeEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<WrapupCodeEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WrapupCodeEntityListing>() {}, new AsyncApiCallback<ApiResponse<WrapupCodeEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WrapupCodeEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapupCodeEntityListing> response = (ApiResponse<WrapupCodeEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapupCodeEntityListing> response = (ApiResponse<WrapupCodeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get list of queues.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QueueEntityListing> getRoutingQueuesAsync(GetRoutingQueuesRequest request, AsyncApiCallback<QueueEntityListing> callback) {
    try {
      SettableFuture<QueueEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QueueEntityListing>() {}, new AsyncApiCallback<ApiResponse<QueueEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<QueueEntityListing> response) {
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
   * Get list of queues.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QueueEntityListing>> getRoutingQueuesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<QueueEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<QueueEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QueueEntityListing>() {}, new AsyncApiCallback<ApiResponse<QueueEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<QueueEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QueueEntityListing> response = (ApiResponse<QueueEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QueueEntityListing> response = (ApiResponse<QueueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get Routing Skill
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RoutingSkill> getRoutingSkillAsync(GetRoutingSkillRequest request, AsyncApiCallback<RoutingSkill> callback) {
    try {
      SettableFuture<RoutingSkill> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RoutingSkill>() {}, new AsyncApiCallback<ApiResponse<RoutingSkill>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingSkill> response) {
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
   * Get Routing Skill
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RoutingSkill>> getRoutingSkillAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RoutingSkill>> callback) {
    try {
      SettableFuture<ApiResponse<RoutingSkill>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RoutingSkill>() {}, new AsyncApiCallback<ApiResponse<RoutingSkill>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingSkill> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingSkill> response = (ApiResponse<RoutingSkill>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingSkill> response = (ApiResponse<RoutingSkill>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the list of routing skills.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SkillEntityListing> getRoutingSkillsAsync(GetRoutingSkillsRequest request, AsyncApiCallback<SkillEntityListing> callback) {
    try {
      SettableFuture<SkillEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SkillEntityListing>() {}, new AsyncApiCallback<ApiResponse<SkillEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SkillEntityListing> response) {
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
   * Get the list of routing skills.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SkillEntityListing>> getRoutingSkillsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SkillEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<SkillEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SkillEntityListing>() {}, new AsyncApiCallback<ApiResponse<SkillEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SkillEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SkillEntityListing> response = (ApiResponse<SkillEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SkillEntityListing> response = (ApiResponse<SkillEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the utilization settings.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Utilization> getRoutingUtilizationAsync(GetRoutingUtilizationRequest request, AsyncApiCallback<Utilization> callback) {
    try {
      SettableFuture<Utilization> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Utilization>() {}, new AsyncApiCallback<ApiResponse<Utilization>>() {
        @Override
        public void onCompleted(ApiResponse<Utilization> response) {
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
   * Get the utilization settings.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Utilization>> getRoutingUtilizationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Utilization>> callback) {
    try {
      SettableFuture<ApiResponse<Utilization>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Utilization>() {}, new AsyncApiCallback<ApiResponse<Utilization>>() {
        @Override
        public void onCompleted(ApiResponse<Utilization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Utilization> response = (ApiResponse<Utilization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Utilization> response = (ApiResponse<Utilization>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get details about this wrap-up code.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WrapupCode> getRoutingWrapupcodeAsync(GetRoutingWrapupcodeRequest request, AsyncApiCallback<WrapupCode> callback) {
    try {
      SettableFuture<WrapupCode> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WrapupCode>() {}, new AsyncApiCallback<ApiResponse<WrapupCode>>() {
        @Override
        public void onCompleted(ApiResponse<WrapupCode> response) {
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
   * Get details about this wrap-up code.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WrapupCode>> getRoutingWrapupcodeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WrapupCode>> callback) {
    try {
      SettableFuture<ApiResponse<WrapupCode>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WrapupCode>() {}, new AsyncApiCallback<ApiResponse<WrapupCode>>() {
        @Override
        public void onCompleted(ApiResponse<WrapupCode> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get list of wrapup codes.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WrapupCodeEntityListing> getRoutingWrapupcodesAsync(GetRoutingWrapupcodesRequest request, AsyncApiCallback<WrapupCodeEntityListing> callback) {
    try {
      SettableFuture<WrapupCodeEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WrapupCodeEntityListing>() {}, new AsyncApiCallback<ApiResponse<WrapupCodeEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WrapupCodeEntityListing> response) {
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
   * Get list of wrapup codes.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WrapupCodeEntityListing>> getRoutingWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WrapupCodeEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<WrapupCodeEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WrapupCodeEntityListing>() {}, new AsyncApiCallback<ApiResponse<WrapupCodeEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WrapupCodeEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapupCodeEntityListing> response = (ApiResponse<WrapupCodeEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapupCodeEntityListing> response = (ApiResponse<WrapupCodeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * List routing skills for user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserSkillEntityListing> getUserRoutingskillsAsync(GetUserRoutingskillsRequest request, AsyncApiCallback<UserSkillEntityListing> callback) {
    try {
      SettableFuture<UserSkillEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserSkillEntityListing>() {}, new AsyncApiCallback<ApiResponse<UserSkillEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UserSkillEntityListing> response) {
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
   * List routing skills for user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserSkillEntityListing>> getUserRoutingskillsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserSkillEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<UserSkillEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserSkillEntityListing>() {}, new AsyncApiCallback<ApiResponse<UserSkillEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UserSkillEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the ring number of joined status for a User in a Queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QueueMember> patchRoutingQueueUserAsync(PatchRoutingQueueUserRequest request, AsyncApiCallback<QueueMember> callback) {
    try {
      SettableFuture<QueueMember> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QueueMember>() {}, new AsyncApiCallback<ApiResponse<QueueMember>>() {
        @Override
        public void onCompleted(ApiResponse<QueueMember> response) {
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
   * Update the ring number of joined status for a User in a Queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QueueMember>> patchRoutingQueueUserAsync(ApiRequest<QueueMember> request, AsyncApiCallback<ApiResponse<QueueMember>> callback) {
    try {
      SettableFuture<ApiResponse<QueueMember>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QueueMember>() {}, new AsyncApiCallback<ApiResponse<QueueMember>>() {
        @Override
        public void onCompleted(ApiResponse<QueueMember> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QueueMember> response = (ApiResponse<QueueMember>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QueueMember> response = (ApiResponse<QueueMember>)(ApiResponse<?>)(new ApiException(exception));
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
   * Join or unjoin a set of users for a queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QueueMemberEntityListing> patchRoutingQueueUsersAsync(PatchRoutingQueueUsersRequest request, AsyncApiCallback<QueueMemberEntityListing> callback) {
    try {
      SettableFuture<QueueMemberEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QueueMemberEntityListing>() {}, new AsyncApiCallback<ApiResponse<QueueMemberEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<QueueMemberEntityListing> response) {
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
   * Join or unjoin a set of users for a queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QueueMemberEntityListing>> patchRoutingQueueUsersAsync(ApiRequest<List<QueueMember>> request, AsyncApiCallback<ApiResponse<QueueMemberEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<QueueMemberEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QueueMemberEntityListing>() {}, new AsyncApiCallback<ApiResponse<QueueMemberEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<QueueMemberEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QueueMemberEntityListing> response = (ApiResponse<QueueMemberEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QueueMemberEntityListing> response = (ApiResponse<QueueMemberEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query for queue observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QualifierMappingObservationQueryResponse> postAnalyticsQueuesObservationsQueryAsync(PostAnalyticsQueuesObservationsQueryRequest request, AsyncApiCallback<QualifierMappingObservationQueryResponse> callback) {
    try {
      SettableFuture<QualifierMappingObservationQueryResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QualifierMappingObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<QualifierMappingObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QualifierMappingObservationQueryResponse> response) {
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
   * Query for queue observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QualifierMappingObservationQueryResponse>> postAnalyticsQueuesObservationsQueryAsync(ApiRequest<ObservationQuery> request, AsyncApiCallback<ApiResponse<QualifierMappingObservationQueryResponse>> callback) {
    try {
      SettableFuture<ApiResponse<QualifierMappingObservationQueryResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QualifierMappingObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<QualifierMappingObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QualifierMappingObservationQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QualifierMappingObservationQueryResponse> response = (ApiResponse<QualifierMappingObservationQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QualifierMappingObservationQueryResponse> response = (ApiResponse<QualifierMappingObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InboundRoute> postRoutingEmailDomainRoutesAsync(PostRoutingEmailDomainRoutesRequest request, AsyncApiCallback<InboundRoute> callback) {
    try {
      SettableFuture<InboundRoute> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InboundRoute>() {}, new AsyncApiCallback<ApiResponse<InboundRoute>>() {
        @Override
        public void onCompleted(ApiResponse<InboundRoute> response) {
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
   * Create a route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InboundRoute>> postRoutingEmailDomainRoutesAsync(ApiRequest<InboundRoute> request, AsyncApiCallback<ApiResponse<InboundRoute>> callback) {
    try {
      SettableFuture<ApiResponse<InboundRoute>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InboundRoute>() {}, new AsyncApiCallback<ApiResponse<InboundRoute>>() {
        @Override
        public void onCompleted(ApiResponse<InboundRoute> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundRoute> response = (ApiResponse<InboundRoute>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundRoute> response = (ApiResponse<InboundRoute>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a domain
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InboundDomain> postRoutingEmailDomainsAsync(PostRoutingEmailDomainsRequest request, AsyncApiCallback<InboundDomain> callback) {
    try {
      SettableFuture<InboundDomain> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InboundDomain>() {}, new AsyncApiCallback<ApiResponse<InboundDomain>>() {
        @Override
        public void onCompleted(ApiResponse<InboundDomain> response) {
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
   * Create a domain
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InboundDomain>> postRoutingEmailDomainsAsync(ApiRequest<InboundDomain> request, AsyncApiCallback<ApiResponse<InboundDomain>> callback) {
    try {
      SettableFuture<ApiResponse<InboundDomain>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InboundDomain>() {}, new AsyncApiCallback<ApiResponse<InboundDomain>>() {
        @Override
        public void onCompleted(ApiResponse<InboundDomain> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundDomain> response = (ApiResponse<InboundDomain>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundDomain> response = (ApiResponse<InboundDomain>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create Language
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Language> postRoutingLanguagesAsync(PostRoutingLanguagesRequest request, AsyncApiCallback<Language> callback) {
    try {
      SettableFuture<Language> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Language>() {}, new AsyncApiCallback<ApiResponse<Language>>() {
        @Override
        public void onCompleted(ApiResponse<Language> response) {
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
   * Create Language
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Language>> postRoutingLanguagesAsync(ApiRequest<Language> request, AsyncApiCallback<ApiResponse<Language>> callback) {
    try {
      SettableFuture<ApiResponse<Language>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Language>() {}, new AsyncApiCallback<ApiResponse<Language>>() {
        @Override
        public void onCompleted(ApiResponse<Language> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Language> response = (ApiResponse<Language>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Language> response = (ApiResponse<Language>)(ApiResponse<?>)(new ApiException(exception));
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
   * Bulk add or delete up to 100 queue members
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> postRoutingQueueUsersAsync(PostRoutingQueueUsersRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
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
   * Bulk add or delete up to 100 queue members
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> postRoutingQueueUsersAsync(ApiRequest<List<QueueMember>> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
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
   * Add up to 100 wrap-up codes to a queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<WrapupCode>> postRoutingQueueWrapupcodesAsync(PostRoutingQueueWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    try {
      SettableFuture<List<WrapupCode>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
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
   * Add up to 100 wrap-up codes to a queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<WrapupCode>>> postRoutingQueueWrapupcodesAsync(ApiRequest<List<WrapupCode>> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    try {
      SettableFuture<ApiResponse<List<WrapupCode>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<WrapupCode>>() {}, new AsyncApiCallback<ApiResponse<List<WrapupCode>>>() {
        @Override
        public void onCompleted(ApiResponse<List<WrapupCode>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Queue> postRoutingQueuesAsync(PostRoutingQueuesRequest request, AsyncApiCallback<Queue> callback) {
    try {
      SettableFuture<Queue> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Queue>() {}, new AsyncApiCallback<ApiResponse<Queue>>() {
        @Override
        public void onCompleted(ApiResponse<Queue> response) {
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
   * Create queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Queue>> postRoutingQueuesAsync(ApiRequest<CreateQueueRequest> request, AsyncApiCallback<ApiResponse<Queue>> callback) {
    try {
      SettableFuture<ApiResponse<Queue>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Queue>() {}, new AsyncApiCallback<ApiResponse<Queue>>() {
        @Override
        public void onCompleted(ApiResponse<Queue> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Queue> response = (ApiResponse<Queue>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Queue> response = (ApiResponse<Queue>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create Skill
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RoutingSkill> postRoutingSkillsAsync(PostRoutingSkillsRequest request, AsyncApiCallback<RoutingSkill> callback) {
    try {
      SettableFuture<RoutingSkill> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RoutingSkill>() {}, new AsyncApiCallback<ApiResponse<RoutingSkill>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingSkill> response) {
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
   * Create Skill
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RoutingSkill>> postRoutingSkillsAsync(ApiRequest<RoutingSkill> request, AsyncApiCallback<ApiResponse<RoutingSkill>> callback) {
    try {
      SettableFuture<ApiResponse<RoutingSkill>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RoutingSkill>() {}, new AsyncApiCallback<ApiResponse<RoutingSkill>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingSkill> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingSkill> response = (ApiResponse<RoutingSkill>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingSkill> response = (ApiResponse<RoutingSkill>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a wrap-up code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WrapupCode> postRoutingWrapupcodesAsync(PostRoutingWrapupcodesRequest request, AsyncApiCallback<WrapupCode> callback) {
    try {
      SettableFuture<WrapupCode> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WrapupCode>() {}, new AsyncApiCallback<ApiResponse<WrapupCode>>() {
        @Override
        public void onCompleted(ApiResponse<WrapupCode> response) {
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
   * Create a wrap-up code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WrapupCode>> postRoutingWrapupcodesAsync(ApiRequest<WrapupCode> request, AsyncApiCallback<ApiResponse<WrapupCode>> callback) {
    try {
      SettableFuture<ApiResponse<WrapupCode>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WrapupCode>() {}, new AsyncApiCallback<ApiResponse<WrapupCode>>() {
        @Override
        public void onCompleted(ApiResponse<WrapupCode> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)(new ApiException(exception));
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
   * Add routing skill to user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserRoutingSkill> postUserRoutingskillsAsync(PostUserRoutingskillsRequest request, AsyncApiCallback<UserRoutingSkill> callback) {
    try {
      SettableFuture<UserRoutingSkill> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {}, new AsyncApiCallback<ApiResponse<UserRoutingSkill>>() {
        @Override
        public void onCompleted(ApiResponse<UserRoutingSkill> response) {
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
   * Add routing skill to user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserRoutingSkill>> postUserRoutingskillsAsync(ApiRequest<UserRoutingSkillPost> request, AsyncApiCallback<ApiResponse<UserRoutingSkill>> callback) {
    try {
      SettableFuture<ApiResponse<UserRoutingSkill>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserRoutingSkill>() {}, new AsyncApiCallback<ApiResponse<UserRoutingSkill>>() {
        @Override
        public void onCompleted(ApiResponse<UserRoutingSkill> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InboundRoute> putRoutingEmailDomainRouteAsync(PutRoutingEmailDomainRouteRequest request, AsyncApiCallback<InboundRoute> callback) {
    try {
      SettableFuture<InboundRoute> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InboundRoute>() {}, new AsyncApiCallback<ApiResponse<InboundRoute>>() {
        @Override
        public void onCompleted(ApiResponse<InboundRoute> response) {
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
   * Update a route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InboundRoute>> putRoutingEmailDomainRouteAsync(ApiRequest<InboundRoute> request, AsyncApiCallback<ApiResponse<InboundRoute>> callback) {
    try {
      SettableFuture<ApiResponse<InboundRoute>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InboundRoute>() {}, new AsyncApiCallback<ApiResponse<InboundRoute>>() {
        @Override
        public void onCompleted(ApiResponse<InboundRoute> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundRoute> response = (ApiResponse<InboundRoute>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InboundRoute> response = (ApiResponse<InboundRoute>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Queue> putRoutingQueueAsync(PutRoutingQueueRequest request, AsyncApiCallback<Queue> callback) {
    try {
      SettableFuture<Queue> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Queue>() {}, new AsyncApiCallback<ApiResponse<Queue>>() {
        @Override
        public void onCompleted(ApiResponse<Queue> response) {
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
   * Update a queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Queue>> putRoutingQueueAsync(ApiRequest<Queue> request, AsyncApiCallback<ApiResponse<Queue>> callback) {
    try {
      SettableFuture<ApiResponse<Queue>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Queue>() {}, new AsyncApiCallback<ApiResponse<Queue>>() {
        @Override
        public void onCompleted(ApiResponse<Queue> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Queue> response = (ApiResponse<Queue>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Queue> response = (ApiResponse<Queue>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the utilization settings.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Utilization> putRoutingUtilizationAsync(PutRoutingUtilizationRequest request, AsyncApiCallback<Utilization> callback) {
    try {
      SettableFuture<Utilization> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Utilization>() {}, new AsyncApiCallback<ApiResponse<Utilization>>() {
        @Override
        public void onCompleted(ApiResponse<Utilization> response) {
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
   * Update the utilization settings.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Utilization>> putRoutingUtilizationAsync(ApiRequest<Utilization> request, AsyncApiCallback<ApiResponse<Utilization>> callback) {
    try {
      SettableFuture<ApiResponse<Utilization>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Utilization>() {}, new AsyncApiCallback<ApiResponse<Utilization>>() {
        @Override
        public void onCompleted(ApiResponse<Utilization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Utilization> response = (ApiResponse<Utilization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Utilization> response = (ApiResponse<Utilization>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update wrap-up code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WrapupCode> putRoutingWrapupcodeAsync(PutRoutingWrapupcodeRequest request, AsyncApiCallback<WrapupCode> callback) {
    try {
      SettableFuture<WrapupCode> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WrapupCode>() {}, new AsyncApiCallback<ApiResponse<WrapupCode>>() {
        @Override
        public void onCompleted(ApiResponse<WrapupCode> response) {
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
   * Update wrap-up code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WrapupCode>> putRoutingWrapupcodeAsync(ApiRequest<WrapupCode> request, AsyncApiCallback<ApiResponse<WrapupCode>> callback) {
    try {
      SettableFuture<ApiResponse<WrapupCode>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WrapupCode>() {}, new AsyncApiCallback<ApiResponse<WrapupCode>>() {
        @Override
        public void onCompleted(ApiResponse<WrapupCode> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update routing skill proficiency or state.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserRoutingSkill> putUserRoutingskillAsync(PutUserRoutingskillRequest request, AsyncApiCallback<UserRoutingSkill> callback) {
    try {
      SettableFuture<UserRoutingSkill> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {}, new AsyncApiCallback<ApiResponse<UserRoutingSkill>>() {
        @Override
        public void onCompleted(ApiResponse<UserRoutingSkill> response) {
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
   * Update routing skill proficiency or state.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserRoutingSkill>> putUserRoutingskillAsync(ApiRequest<UserRoutingSkill> request, AsyncApiCallback<ApiResponse<UserRoutingSkill>> callback) {
    try {
      SettableFuture<ApiResponse<UserRoutingSkill>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserRoutingSkill>() {}, new AsyncApiCallback<ApiResponse<UserRoutingSkill>>() {
        @Override
        public void onCompleted(ApiResponse<UserRoutingSkill> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)(new ApiException(exception));
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
