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

import com.mypurecloud.sdk.v2.model.BillingContract;
import com.mypurecloud.sdk.v2.model.BillingContractListing;
import com.mypurecloud.sdk.v2.model.BillingContractPeriodDetail;
import com.mypurecloud.sdk.v2.model.BillingInvoiceItemListing;
import com.mypurecloud.sdk.v2.model.BillingInvoiceListing;
import com.mypurecloud.sdk.v2.model.BillingUsageReport;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.TrusteeBillingOverview;
import com.mypurecloud.sdk.v2.model.UrlResponse;


import com.mypurecloud.sdk.v2.api.request.GetBillingContractRequest;
import com.mypurecloud.sdk.v2.api.request.GetBillingContractBillingperiodRequest;
import com.mypurecloud.sdk.v2.api.request.GetBillingContractsRequest;
import com.mypurecloud.sdk.v2.api.request.GetBillingContractsInvoiceDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.GetBillingContractsInvoiceLinesRequest;
import com.mypurecloud.sdk.v2.api.request.GetBillingContractsInvoicesRequest;
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
   * Get billing contract
   * Retrieve a single contract from the system.
   * getBillingContract is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BillingContract> getBillingContractAsync(GetBillingContractRequest request, final AsyncApiCallback<BillingContract> callback) {
    try {
      final SettableFuture<BillingContract> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BillingContract>() {}, new AsyncApiCallback<ApiResponse<BillingContract>>() {
        @Override
        public void onCompleted(ApiResponse<BillingContract> response) {
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
   * Get billing contract
   * Retrieve a single contract from the system.
   * getBillingContract is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BillingContract>> getBillingContractAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BillingContract>> callback) {
    try {
      final SettableFuture<ApiResponse<BillingContract>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BillingContract>() {}, new AsyncApiCallback<ApiResponse<BillingContract>>() {
        @Override
        public void onCompleted(ApiResponse<BillingContract> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BillingContract> response = (ApiResponse<BillingContract>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BillingContract> response = (ApiResponse<BillingContract>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get contract billing period
   * Fetch the billing information for a given Organization by billing period.
   * getBillingContractBillingperiod is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BillingContractPeriodDetail> getBillingContractBillingperiodAsync(GetBillingContractBillingperiodRequest request, final AsyncApiCallback<BillingContractPeriodDetail> callback) {
    try {
      final SettableFuture<BillingContractPeriodDetail> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BillingContractPeriodDetail>() {}, new AsyncApiCallback<ApiResponse<BillingContractPeriodDetail>>() {
        @Override
        public void onCompleted(ApiResponse<BillingContractPeriodDetail> response) {
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
   * Get contract billing period
   * Fetch the billing information for a given Organization by billing period.
   * getBillingContractBillingperiod is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BillingContractPeriodDetail>> getBillingContractBillingperiodAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BillingContractPeriodDetail>> callback) {
    try {
      final SettableFuture<ApiResponse<BillingContractPeriodDetail>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BillingContractPeriodDetail>() {}, new AsyncApiCallback<ApiResponse<BillingContractPeriodDetail>>() {
        @Override
        public void onCompleted(ApiResponse<BillingContractPeriodDetail> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BillingContractPeriodDetail> response = (ApiResponse<BillingContractPeriodDetail>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BillingContractPeriodDetail> response = (ApiResponse<BillingContractPeriodDetail>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get billing contracts
   * Retrieve a list of contracts stored in the system.
   * getBillingContracts is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BillingContractListing> getBillingContractsAsync(GetBillingContractsRequest request, final AsyncApiCallback<BillingContractListing> callback) {
    try {
      final SettableFuture<BillingContractListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BillingContractListing>() {}, new AsyncApiCallback<ApiResponse<BillingContractListing>>() {
        @Override
        public void onCompleted(ApiResponse<BillingContractListing> response) {
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
   * Get billing contracts
   * Retrieve a list of contracts stored in the system.
   * getBillingContracts is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BillingContractListing>> getBillingContractsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BillingContractListing>> callback) {
    try {
      final SettableFuture<ApiResponse<BillingContractListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BillingContractListing>() {}, new AsyncApiCallback<ApiResponse<BillingContractListing>>() {
        @Override
        public void onCompleted(ApiResponse<BillingContractListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BillingContractListing> response = (ApiResponse<BillingContractListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BillingContractListing> response = (ApiResponse<BillingContractListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get invoice document
   * Fetch the document for a specific invoice.
   * getBillingContractsInvoiceDocument is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UrlResponse> getBillingContractsInvoiceDocumentAsync(GetBillingContractsInvoiceDocumentRequest request, final AsyncApiCallback<UrlResponse> callback) {
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
   * Get invoice document
   * Fetch the document for a specific invoice.
   * getBillingContractsInvoiceDocument is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UrlResponse>> getBillingContractsInvoiceDocumentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UrlResponse>> callback) {
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
   * Get invoice lines
   * Fetch a list of all bills for the specified account.
   * getBillingContractsInvoiceLines is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BillingInvoiceItemListing> getBillingContractsInvoiceLinesAsync(GetBillingContractsInvoiceLinesRequest request, final AsyncApiCallback<BillingInvoiceItemListing> callback) {
    try {
      final SettableFuture<BillingInvoiceItemListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BillingInvoiceItemListing>() {}, new AsyncApiCallback<ApiResponse<BillingInvoiceItemListing>>() {
        @Override
        public void onCompleted(ApiResponse<BillingInvoiceItemListing> response) {
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
   * Get invoice lines
   * Fetch a list of all bills for the specified account.
   * getBillingContractsInvoiceLines is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BillingInvoiceItemListing>> getBillingContractsInvoiceLinesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BillingInvoiceItemListing>> callback) {
    try {
      final SettableFuture<ApiResponse<BillingInvoiceItemListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BillingInvoiceItemListing>() {}, new AsyncApiCallback<ApiResponse<BillingInvoiceItemListing>>() {
        @Override
        public void onCompleted(ApiResponse<BillingInvoiceItemListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BillingInvoiceItemListing> response = (ApiResponse<BillingInvoiceItemListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BillingInvoiceItemListing> response = (ApiResponse<BillingInvoiceItemListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get invoices
   * Retrieve a list of invoices stored in the system.
   * getBillingContractsInvoices is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BillingInvoiceListing> getBillingContractsInvoicesAsync(GetBillingContractsInvoicesRequest request, final AsyncApiCallback<BillingInvoiceListing> callback) {
    try {
      final SettableFuture<BillingInvoiceListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BillingInvoiceListing>() {}, new AsyncApiCallback<ApiResponse<BillingInvoiceListing>>() {
        @Override
        public void onCompleted(ApiResponse<BillingInvoiceListing> response) {
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
   * Get invoices
   * Retrieve a list of invoices stored in the system.
   * getBillingContractsInvoices is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BillingInvoiceListing>> getBillingContractsInvoicesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BillingInvoiceListing>> callback) {
    try {
      final SettableFuture<ApiResponse<BillingInvoiceListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BillingInvoiceListing>() {}, new AsyncApiCallback<ApiResponse<BillingInvoiceListing>>() {
        @Override
        public void onCompleted(ApiResponse<BillingInvoiceListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BillingInvoiceListing> response = (ApiResponse<BillingInvoiceListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BillingInvoiceListing> response = (ApiResponse<BillingInvoiceListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a report of the billable license usages
   * Report is of the billable usages (e.g. licenses and devices utilized) for a given period. If response's status is InProgress, wait a few seconds, then try the same request again.
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
   * Report is of the billable usages (e.g. licenses and devices utilized) for a given period. If response's status is InProgress, wait a few seconds, then try the same request again.
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
