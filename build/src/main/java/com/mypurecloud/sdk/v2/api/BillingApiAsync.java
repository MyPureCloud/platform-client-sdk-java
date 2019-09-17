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

import com.mypurecloud.sdk.v2.model.BillingUsageReport;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.TrusteeBillingOverview;


import com.mypurecloud.sdk.v2.api.request.GetBillingReportsBillableusageRequest;
import com.mypurecloud.sdk.v2.api.request.GetBillingTrusteebillingoverviewTrustorOrgIdRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class BillingApiAsync {
  private final ApiClient pcapiClient;

  public BillingApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public BillingApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get a report of the billable license usages
   * Report is of the billable usages (e.g. licenses and devices utilized) for a given period. If response&#39;s status is InProgress, wait a few seconds, then try the same request again.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BillingUsageReport> getBillingReportsBillableusageAsync(GetBillingReportsBillableusageRequest request, final AsyncApiCallback<BillingUsageReport> callback) {
    try {
      final SettableFuture<BillingUsageReport> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BillingUsageReport>() {}, new AsyncApiCallback<ApiResponse<BillingUsageReport>>() {
        @Override
        public void onCompleted(ApiResponse<BillingUsageReport> response) {
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
   * Get a report of the billable license usages
   * Report is of the billable usages (e.g. licenses and devices utilized) for a given period. If response&#39;s status is InProgress, wait a few seconds, then try the same request again.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BillingUsageReport>> getBillingReportsBillableusageAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BillingUsageReport>> callback) {
    try {
      final SettableFuture<ApiResponse<BillingUsageReport>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BillingUsageReport>() {}, new AsyncApiCallback<ApiResponse<BillingUsageReport>>() {
        @Override
        public void onCompleted(ApiResponse<BillingUsageReport> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BillingUsageReport> response = (ApiResponse<BillingUsageReport>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BillingUsageReport> response = (ApiResponse<BillingUsageReport>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the billing overview for an organization that is managed by a partner.
   * Tax Disclaimer: Prices returned by this API do not include applicable taxes. It is the responsibility of the customer to pay all taxes that are appropriate in their jurisdiction. See the PureCloud API Documentation in the Developer Center for more information about this API: https://developer.mypurecloud.com/api/rest/v2/
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TrusteeBillingOverview> getBillingTrusteebillingoverviewTrustorOrgIdAsync(GetBillingTrusteebillingoverviewTrustorOrgIdRequest request, final AsyncApiCallback<TrusteeBillingOverview> callback) {
    try {
      final SettableFuture<TrusteeBillingOverview> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TrusteeBillingOverview>() {}, new AsyncApiCallback<ApiResponse<TrusteeBillingOverview>>() {
        @Override
        public void onCompleted(ApiResponse<TrusteeBillingOverview> response) {
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
   * Get the billing overview for an organization that is managed by a partner.
   * Tax Disclaimer: Prices returned by this API do not include applicable taxes. It is the responsibility of the customer to pay all taxes that are appropriate in their jurisdiction. See the PureCloud API Documentation in the Developer Center for more information about this API: https://developer.mypurecloud.com/api/rest/v2/
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TrusteeBillingOverview>> getBillingTrusteebillingoverviewTrustorOrgIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TrusteeBillingOverview>> callback) {
    try {
      final SettableFuture<ApiResponse<TrusteeBillingOverview>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TrusteeBillingOverview>() {}, new AsyncApiCallback<ApiResponse<TrusteeBillingOverview>>() {
        @Override
        public void onCompleted(ApiResponse<TrusteeBillingOverview> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TrusteeBillingOverview> response = (ApiResponse<TrusteeBillingOverview>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TrusteeBillingOverview> response = (ApiResponse<TrusteeBillingOverview>)(ApiResponse<?>)(new ApiException(exception));
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
