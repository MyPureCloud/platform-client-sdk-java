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
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.EmbeddedIntegration;
import com.mypurecloud.sdk.v2.model.IpAddressAuthentication;
import com.mypurecloud.sdk.v2.model.LimitChangeRequestDetails;
import com.mypurecloud.sdk.v2.model.LimitChangeRequestsEntityListing;
import com.mypurecloud.sdk.v2.model.UrlResponse;
import com.mypurecloud.sdk.v2.model.LimitsEntityListing;
import com.mypurecloud.sdk.v2.model.PagedNamespaceListing;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.OrgWhitelistSettings;
import com.mypurecloud.sdk.v2.model.OrganizationFeatures;
import com.mypurecloud.sdk.v2.model.FeatureState;


import com.mypurecloud.sdk.v2.api.request.GetFieldconfigRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsEmbeddedintegrationRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsIpaddressauthenticationRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsLimitsChangerequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsLimitsChangerequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsLimitsDocsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsLimitsNamespaceRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsLimitsNamespaceDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsLimitsNamespacesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsWhitelistRequest;
import com.mypurecloud.sdk.v2.api.request.PatchOrganizationsFeatureRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrganizationsEmbeddedintegrationRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrganizationsIpaddressauthenticationRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrganizationsMeRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrganizationsWhitelistRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class OrganizationApiAsync {
  private final ApiClient pcapiClient;

  public OrganizationApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public OrganizationApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Fetch field config for an entity type
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FieldConfig> getFieldconfigAsync(GetFieldconfigRequest request, final AsyncApiCallback<FieldConfig> callback) {
    try {
      final SettableFuture<FieldConfig> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FieldConfig>() {}, new AsyncApiCallback<ApiResponse<FieldConfig>>() {
        @Override
        public void onCompleted(ApiResponse<FieldConfig> response) {
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
   * Fetch field config for an entity type
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FieldConfig>> getFieldconfigAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FieldConfig>> callback) {
    try {
      final SettableFuture<ApiResponse<FieldConfig>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FieldConfig>() {}, new AsyncApiCallback<ApiResponse<FieldConfig>>() {
        @Override
        public void onCompleted(ApiResponse<FieldConfig> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FieldConfig> response = (ApiResponse<FieldConfig>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FieldConfig> response = (ApiResponse<FieldConfig>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the list of domains that will be allowed to embed PureCloud applications
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmbeddedIntegration> getOrganizationsEmbeddedintegrationAsync(GetOrganizationsEmbeddedintegrationRequest request, final AsyncApiCallback<EmbeddedIntegration> callback) {
    try {
      final SettableFuture<EmbeddedIntegration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmbeddedIntegration>() {}, new AsyncApiCallback<ApiResponse<EmbeddedIntegration>>() {
        @Override
        public void onCompleted(ApiResponse<EmbeddedIntegration> response) {
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
   * Get the list of domains that will be allowed to embed PureCloud applications
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmbeddedIntegration>> getOrganizationsEmbeddedintegrationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EmbeddedIntegration>> callback) {
    try {
      final SettableFuture<ApiResponse<EmbeddedIntegration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmbeddedIntegration>() {}, new AsyncApiCallback<ApiResponse<EmbeddedIntegration>>() {
        @Override
        public void onCompleted(ApiResponse<EmbeddedIntegration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmbeddedIntegration> response = (ApiResponse<EmbeddedIntegration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmbeddedIntegration> response = (ApiResponse<EmbeddedIntegration>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get organization IP address whitelist settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IpAddressAuthentication> getOrganizationsIpaddressauthenticationAsync(GetOrganizationsIpaddressauthenticationRequest request, final AsyncApiCallback<IpAddressAuthentication> callback) {
    try {
      final SettableFuture<IpAddressAuthentication> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IpAddressAuthentication>() {}, new AsyncApiCallback<ApiResponse<IpAddressAuthentication>>() {
        @Override
        public void onCompleted(ApiResponse<IpAddressAuthentication> response) {
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
   * Get organization IP address whitelist settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IpAddressAuthentication>> getOrganizationsIpaddressauthenticationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IpAddressAuthentication>> callback) {
    try {
      final SettableFuture<ApiResponse<IpAddressAuthentication>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IpAddressAuthentication>() {}, new AsyncApiCallback<ApiResponse<IpAddressAuthentication>>() {
        @Override
        public void onCompleted(ApiResponse<IpAddressAuthentication> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IpAddressAuthentication> response = (ApiResponse<IpAddressAuthentication>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IpAddressAuthentication> response = (ApiResponse<IpAddressAuthentication>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a limit change request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LimitChangeRequestDetails> getOrganizationsLimitsChangerequestAsync(GetOrganizationsLimitsChangerequestRequest request, final AsyncApiCallback<LimitChangeRequestDetails> callback) {
    try {
      final SettableFuture<LimitChangeRequestDetails> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LimitChangeRequestDetails>() {}, new AsyncApiCallback<ApiResponse<LimitChangeRequestDetails>>() {
        @Override
        public void onCompleted(ApiResponse<LimitChangeRequestDetails> response) {
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
   * Get a limit change request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LimitChangeRequestDetails>> getOrganizationsLimitsChangerequestAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LimitChangeRequestDetails>> callback) {
    try {
      final SettableFuture<ApiResponse<LimitChangeRequestDetails>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LimitChangeRequestDetails>() {}, new AsyncApiCallback<ApiResponse<LimitChangeRequestDetails>>() {
        @Override
        public void onCompleted(ApiResponse<LimitChangeRequestDetails> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LimitChangeRequestDetails> response = (ApiResponse<LimitChangeRequestDetails>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LimitChangeRequestDetails> response = (ApiResponse<LimitChangeRequestDetails>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the available limit change requests
   * Timestamp interval defaults to the last 365 days if both query parameters are omitted. If only one parameter is omitted, the interval will default to a 180 day range in the specified direction.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LimitChangeRequestsEntityListing> getOrganizationsLimitsChangerequestsAsync(GetOrganizationsLimitsChangerequestsRequest request, final AsyncApiCallback<LimitChangeRequestsEntityListing> callback) {
    try {
      final SettableFuture<LimitChangeRequestsEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LimitChangeRequestsEntityListing>() {}, new AsyncApiCallback<ApiResponse<LimitChangeRequestsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LimitChangeRequestsEntityListing> response) {
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
   * Get the available limit change requests
   * Timestamp interval defaults to the last 365 days if both query parameters are omitted. If only one parameter is omitted, the interval will default to a 180 day range in the specified direction.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LimitChangeRequestsEntityListing>> getOrganizationsLimitsChangerequestsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LimitChangeRequestsEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<LimitChangeRequestsEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LimitChangeRequestsEntityListing>() {}, new AsyncApiCallback<ApiResponse<LimitChangeRequestsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LimitChangeRequestsEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LimitChangeRequestsEntityListing> response = (ApiResponse<LimitChangeRequestsEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LimitChangeRequestsEntityListing> response = (ApiResponse<LimitChangeRequestsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a link to the limit documentation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UrlResponse> getOrganizationsLimitsDocsAsync(GetOrganizationsLimitsDocsRequest request, final AsyncApiCallback<UrlResponse> callback) {
    try {
      final SettableFuture<UrlResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UrlResponse>() {}, new AsyncApiCallback<ApiResponse<UrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UrlResponse> response) {
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
   * Get a link to the limit documentation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UrlResponse>> getOrganizationsLimitsDocsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UrlResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UrlResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UrlResponse>() {}, new AsyncApiCallback<ApiResponse<UrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UrlResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UrlResponse> response = (ApiResponse<UrlResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UrlResponse> response = (ApiResponse<UrlResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the effective limits in a namespace for an organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LimitsEntityListing> getOrganizationsLimitsNamespaceAsync(GetOrganizationsLimitsNamespaceRequest request, final AsyncApiCallback<LimitsEntityListing> callback) {
    try {
      final SettableFuture<LimitsEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LimitsEntityListing>() {}, new AsyncApiCallback<ApiResponse<LimitsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LimitsEntityListing> response) {
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
   * Get the effective limits in a namespace for an organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LimitsEntityListing>> getOrganizationsLimitsNamespaceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LimitsEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<LimitsEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LimitsEntityListing>() {}, new AsyncApiCallback<ApiResponse<LimitsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LimitsEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LimitsEntityListing> response = (ApiResponse<LimitsEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LimitsEntityListing> response = (ApiResponse<LimitsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the default limits in a namespace for an organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LimitsEntityListing> getOrganizationsLimitsNamespaceDefaultsAsync(GetOrganizationsLimitsNamespaceDefaultsRequest request, final AsyncApiCallback<LimitsEntityListing> callback) {
    try {
      final SettableFuture<LimitsEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LimitsEntityListing>() {}, new AsyncApiCallback<ApiResponse<LimitsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LimitsEntityListing> response) {
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
   * Get the default limits in a namespace for an organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LimitsEntityListing>> getOrganizationsLimitsNamespaceDefaultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LimitsEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<LimitsEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LimitsEntityListing>() {}, new AsyncApiCallback<ApiResponse<LimitsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LimitsEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LimitsEntityListing> response = (ApiResponse<LimitsEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LimitsEntityListing> response = (ApiResponse<LimitsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the available limit namespaces
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PagedNamespaceListing> getOrganizationsLimitsNamespacesAsync(GetOrganizationsLimitsNamespacesRequest request, final AsyncApiCallback<PagedNamespaceListing> callback) {
    try {
      final SettableFuture<PagedNamespaceListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PagedNamespaceListing>() {}, new AsyncApiCallback<ApiResponse<PagedNamespaceListing>>() {
        @Override
        public void onCompleted(ApiResponse<PagedNamespaceListing> response) {
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
   * Get the available limit namespaces
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PagedNamespaceListing>> getOrganizationsLimitsNamespacesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PagedNamespaceListing>> callback) {
    try {
      final SettableFuture<ApiResponse<PagedNamespaceListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PagedNamespaceListing>() {}, new AsyncApiCallback<ApiResponse<PagedNamespaceListing>>() {
        @Override
        public void onCompleted(ApiResponse<PagedNamespaceListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PagedNamespaceListing> response = (ApiResponse<PagedNamespaceListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PagedNamespaceListing> response = (ApiResponse<PagedNamespaceListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get organization.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Organization> getOrganizationsMeAsync(GetOrganizationsMeRequest request, final AsyncApiCallback<Organization> callback) {
    try {
      final SettableFuture<Organization> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Organization>() {}, new AsyncApiCallback<ApiResponse<Organization>>() {
        @Override
        public void onCompleted(ApiResponse<Organization> response) {
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
   * Get organization.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Organization>> getOrganizationsMeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Organization>> callback) {
    try {
      final SettableFuture<ApiResponse<Organization>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Organization>() {}, new AsyncApiCallback<ApiResponse<Organization>>() {
        @Override
        public void onCompleted(ApiResponse<Organization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)(new ApiException(exception));
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
   * Use PUT /api/v2/organizations/embeddedintegration instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrgWhitelistSettings> getOrganizationsWhitelistAsync(GetOrganizationsWhitelistRequest request, final AsyncApiCallback<OrgWhitelistSettings> callback) {
    try {
      final SettableFuture<OrgWhitelistSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrgWhitelistSettings>() {}, new AsyncApiCallback<ApiResponse<OrgWhitelistSettings>>() {
        @Override
        public void onCompleted(ApiResponse<OrgWhitelistSettings> response) {
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
   * Use PUT /api/v2/organizations/embeddedintegration instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrgWhitelistSettings>> getOrganizationsWhitelistAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OrgWhitelistSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<OrgWhitelistSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrgWhitelistSettings>() {}, new AsyncApiCallback<ApiResponse<OrgWhitelistSettings>>() {
        @Override
        public void onCompleted(ApiResponse<OrgWhitelistSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrgWhitelistSettings> response = (ApiResponse<OrgWhitelistSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrgWhitelistSettings> response = (ApiResponse<OrgWhitelistSettings>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrganizationFeatures> patchOrganizationsFeatureAsync(PatchOrganizationsFeatureRequest request, final AsyncApiCallback<OrganizationFeatures> callback) {
    try {
      final SettableFuture<OrganizationFeatures> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationFeatures>() {}, new AsyncApiCallback<ApiResponse<OrganizationFeatures>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationFeatures> response) {
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
   * Update organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrganizationFeatures>> patchOrganizationsFeatureAsync(ApiRequest<FeatureState> request, final AsyncApiCallback<ApiResponse<OrganizationFeatures>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationFeatures>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationFeatures>() {}, new AsyncApiCallback<ApiResponse<OrganizationFeatures>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationFeatures> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationFeatures> response = (ApiResponse<OrganizationFeatures>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationFeatures> response = (ApiResponse<OrganizationFeatures>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the list of domains that will be allowed to embed PureCloud applications
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmbeddedIntegration> putOrganizationsEmbeddedintegrationAsync(PutOrganizationsEmbeddedintegrationRequest request, final AsyncApiCallback<EmbeddedIntegration> callback) {
    try {
      final SettableFuture<EmbeddedIntegration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmbeddedIntegration>() {}, new AsyncApiCallback<ApiResponse<EmbeddedIntegration>>() {
        @Override
        public void onCompleted(ApiResponse<EmbeddedIntegration> response) {
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
   * Update the list of domains that will be allowed to embed PureCloud applications
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmbeddedIntegration>> putOrganizationsEmbeddedintegrationAsync(ApiRequest<EmbeddedIntegration> request, final AsyncApiCallback<ApiResponse<EmbeddedIntegration>> callback) {
    try {
      final SettableFuture<ApiResponse<EmbeddedIntegration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmbeddedIntegration>() {}, new AsyncApiCallback<ApiResponse<EmbeddedIntegration>>() {
        @Override
        public void onCompleted(ApiResponse<EmbeddedIntegration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmbeddedIntegration> response = (ApiResponse<EmbeddedIntegration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmbeddedIntegration> response = (ApiResponse<EmbeddedIntegration>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update organization IP address whitelist settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IpAddressAuthentication> putOrganizationsIpaddressauthenticationAsync(PutOrganizationsIpaddressauthenticationRequest request, final AsyncApiCallback<IpAddressAuthentication> callback) {
    try {
      final SettableFuture<IpAddressAuthentication> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IpAddressAuthentication>() {}, new AsyncApiCallback<ApiResponse<IpAddressAuthentication>>() {
        @Override
        public void onCompleted(ApiResponse<IpAddressAuthentication> response) {
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
   * Update organization IP address whitelist settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IpAddressAuthentication>> putOrganizationsIpaddressauthenticationAsync(ApiRequest<IpAddressAuthentication> request, final AsyncApiCallback<ApiResponse<IpAddressAuthentication>> callback) {
    try {
      final SettableFuture<ApiResponse<IpAddressAuthentication>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IpAddressAuthentication>() {}, new AsyncApiCallback<ApiResponse<IpAddressAuthentication>>() {
        @Override
        public void onCompleted(ApiResponse<IpAddressAuthentication> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IpAddressAuthentication> response = (ApiResponse<IpAddressAuthentication>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IpAddressAuthentication> response = (ApiResponse<IpAddressAuthentication>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update organization.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Organization> putOrganizationsMeAsync(PutOrganizationsMeRequest request, final AsyncApiCallback<Organization> callback) {
    try {
      final SettableFuture<Organization> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Organization>() {}, new AsyncApiCallback<ApiResponse<Organization>>() {
        @Override
        public void onCompleted(ApiResponse<Organization> response) {
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
   * Update organization.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Organization>> putOrganizationsMeAsync(ApiRequest<Organization> request, final AsyncApiCallback<ApiResponse<Organization>> callback) {
    try {
      final SettableFuture<ApiResponse<Organization>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Organization>() {}, new AsyncApiCallback<ApiResponse<Organization>>() {
        @Override
        public void onCompleted(ApiResponse<Organization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)(new ApiException(exception));
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
   * Use PUT /api/v2/organizations/embeddedintegration instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrgWhitelistSettings> putOrganizationsWhitelistAsync(PutOrganizationsWhitelistRequest request, final AsyncApiCallback<OrgWhitelistSettings> callback) {
    try {
      final SettableFuture<OrgWhitelistSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrgWhitelistSettings>() {}, new AsyncApiCallback<ApiResponse<OrgWhitelistSettings>>() {
        @Override
        public void onCompleted(ApiResponse<OrgWhitelistSettings> response) {
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
   * Use PUT /api/v2/organizations/embeddedintegration instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrgWhitelistSettings>> putOrganizationsWhitelistAsync(ApiRequest<OrgWhitelistSettings> request, final AsyncApiCallback<ApiResponse<OrgWhitelistSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<OrgWhitelistSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrgWhitelistSettings>() {}, new AsyncApiCallback<ApiResponse<OrgWhitelistSettings>>() {
        @Override
        public void onCompleted(ApiResponse<OrgWhitelistSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrgWhitelistSettings> response = (ApiResponse<OrgWhitelistSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrgWhitelistSettings> response = (ApiResponse<OrgWhitelistSettings>)(ApiResponse<?>)(new ApiException(exception));
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
