package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

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

public class BillingApi {
  private final ApiClient pcapiClient;

  public BillingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BillingApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get billing contract
   * Retrieve a single contract from the system.
   * getBillingContract is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param contractId The contract number. (required)
   * @return BillingContract
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BillingContract getBillingContract(String contractId) throws IOException, ApiException {
    return  getBillingContract(createGetBillingContractRequest(contractId));
  }

  /**
   * Get billing contract
   * Retrieve a single contract from the system.
   * getBillingContract is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param contractId The contract number. (required)
   * @return BillingContract
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BillingContract> getBillingContractWithHttpInfo(String contractId) throws IOException {
    return getBillingContract(createGetBillingContractRequest(contractId).withHttpInfo());
  }

  private GetBillingContractRequest createGetBillingContractRequest(String contractId) {
    return GetBillingContractRequest.builder()
            .withContractId(contractId)

            .build();
  }

  /**
   * Get billing contract
   * Retrieve a single contract from the system.
   * getBillingContract is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return BillingContract
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BillingContract getBillingContract(GetBillingContractRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BillingContract> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BillingContract>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get billing contract
   * Retrieve a single contract from the system.
   * getBillingContract is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BillingContract> getBillingContract(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BillingContract>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BillingContract> response = (ApiResponse<BillingContract>)(ApiResponse<?>)exception;
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
      ApiResponse<BillingContract> response = (ApiResponse<BillingContract>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get contract billing period
   * Fetch the billing information for a given Organization by billing period.
   * getBillingContractBillingperiod is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param contractId The contract number. (required)
   * @param billingPeriodId The Billing Period Id for the Org. (required)
   * @return BillingContractPeriodDetail
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BillingContractPeriodDetail getBillingContractBillingperiod(String contractId, String billingPeriodId) throws IOException, ApiException {
    return  getBillingContractBillingperiod(createGetBillingContractBillingperiodRequest(contractId, billingPeriodId));
  }

  /**
   * Get contract billing period
   * Fetch the billing information for a given Organization by billing period.
   * getBillingContractBillingperiod is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param contractId The contract number. (required)
   * @param billingPeriodId The Billing Period Id for the Org. (required)
   * @return BillingContractPeriodDetail
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BillingContractPeriodDetail> getBillingContractBillingperiodWithHttpInfo(String contractId, String billingPeriodId) throws IOException {
    return getBillingContractBillingperiod(createGetBillingContractBillingperiodRequest(contractId, billingPeriodId).withHttpInfo());
  }

  private GetBillingContractBillingperiodRequest createGetBillingContractBillingperiodRequest(String contractId, String billingPeriodId) {
    return GetBillingContractBillingperiodRequest.builder()
            .withContractId(contractId)

            .withBillingPeriodId(billingPeriodId)

            .build();
  }

  /**
   * Get contract billing period
   * Fetch the billing information for a given Organization by billing period.
   * getBillingContractBillingperiod is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return BillingContractPeriodDetail
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BillingContractPeriodDetail getBillingContractBillingperiod(GetBillingContractBillingperiodRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BillingContractPeriodDetail> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BillingContractPeriodDetail>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get contract billing period
   * Fetch the billing information for a given Organization by billing period.
   * getBillingContractBillingperiod is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BillingContractPeriodDetail> getBillingContractBillingperiod(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BillingContractPeriodDetail>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BillingContractPeriodDetail> response = (ApiResponse<BillingContractPeriodDetail>)(ApiResponse<?>)exception;
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
      ApiResponse<BillingContractPeriodDetail> response = (ApiResponse<BillingContractPeriodDetail>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get billing contracts
   * Retrieve a list of contracts stored in the system.
   * getBillingContracts is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param dateStart Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param status Filter by the status of contracts (optional)
   * @param externalNumber Filter by the unique external number. (optional)
   * @return BillingContractListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BillingContractListing getBillingContracts(String before, String after, String pageSize, LocalDate dateStart, LocalDate dateEnd, String status, String externalNumber) throws IOException, ApiException {
    return  getBillingContracts(createGetBillingContractsRequest(before, after, pageSize, dateStart, dateEnd, status, externalNumber));
  }

  /**
   * Get billing contracts
   * Retrieve a list of contracts stored in the system.
   * getBillingContracts is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param dateStart Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param status Filter by the status of contracts (optional)
   * @param externalNumber Filter by the unique external number. (optional)
   * @return BillingContractListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BillingContractListing> getBillingContractsWithHttpInfo(String before, String after, String pageSize, LocalDate dateStart, LocalDate dateEnd, String status, String externalNumber) throws IOException {
    return getBillingContracts(createGetBillingContractsRequest(before, after, pageSize, dateStart, dateEnd, status, externalNumber).withHttpInfo());
  }

  private GetBillingContractsRequest createGetBillingContractsRequest(String before, String after, String pageSize, LocalDate dateStart, LocalDate dateEnd, String status, String externalNumber) {
    return GetBillingContractsRequest.builder()
            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withDateStart(dateStart)

            .withDateEnd(dateEnd)

            .withStatus(status)

            .withExternalNumber(externalNumber)

            .build();
  }

  /**
   * Get billing contracts
   * Retrieve a list of contracts stored in the system.
   * getBillingContracts is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return BillingContractListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BillingContractListing getBillingContracts(GetBillingContractsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BillingContractListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BillingContractListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get billing contracts
   * Retrieve a list of contracts stored in the system.
   * getBillingContracts is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BillingContractListing> getBillingContracts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BillingContractListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BillingContractListing> response = (ApiResponse<BillingContractListing>)(ApiResponse<?>)exception;
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
      ApiResponse<BillingContractListing> response = (ApiResponse<BillingContractListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get invoice document
   * Fetch the document for a specific invoice.
   * getBillingContractsInvoiceDocument is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param invoiceId invoiceId (required)
   * @return UrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UrlResponse getBillingContractsInvoiceDocument(String invoiceId) throws IOException, ApiException {
    return  getBillingContractsInvoiceDocument(createGetBillingContractsInvoiceDocumentRequest(invoiceId));
  }

  /**
   * Get invoice document
   * Fetch the document for a specific invoice.
   * getBillingContractsInvoiceDocument is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param invoiceId invoiceId (required)
   * @return UrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UrlResponse> getBillingContractsInvoiceDocumentWithHttpInfo(String invoiceId) throws IOException {
    return getBillingContractsInvoiceDocument(createGetBillingContractsInvoiceDocumentRequest(invoiceId).withHttpInfo());
  }

  private GetBillingContractsInvoiceDocumentRequest createGetBillingContractsInvoiceDocumentRequest(String invoiceId) {
    return GetBillingContractsInvoiceDocumentRequest.builder()
            .withInvoiceId(invoiceId)

            .build();
  }

  /**
   * Get invoice document
   * Fetch the document for a specific invoice.
   * getBillingContractsInvoiceDocument is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UrlResponse getBillingContractsInvoiceDocument(GetBillingContractsInvoiceDocumentRequest request) throws IOException, ApiException {
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
   * Get invoice document
   * Fetch the document for a specific invoice.
   * getBillingContractsInvoiceDocument is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UrlResponse> getBillingContractsInvoiceDocument(ApiRequest<Void> request) throws IOException {
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

  /**
   * Get invoice lines
   * Fetch a list of all bills for the specified account.
   * getBillingContractsInvoiceLines is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param invoiceId invoiceId (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return BillingInvoiceItemListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BillingInvoiceItemListing getBillingContractsInvoiceLines(String invoiceId, String before, String after, String pageSize) throws IOException, ApiException {
    return  getBillingContractsInvoiceLines(createGetBillingContractsInvoiceLinesRequest(invoiceId, before, after, pageSize));
  }

  /**
   * Get invoice lines
   * Fetch a list of all bills for the specified account.
   * getBillingContractsInvoiceLines is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param invoiceId invoiceId (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return BillingInvoiceItemListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BillingInvoiceItemListing> getBillingContractsInvoiceLinesWithHttpInfo(String invoiceId, String before, String after, String pageSize) throws IOException {
    return getBillingContractsInvoiceLines(createGetBillingContractsInvoiceLinesRequest(invoiceId, before, after, pageSize).withHttpInfo());
  }

  private GetBillingContractsInvoiceLinesRequest createGetBillingContractsInvoiceLinesRequest(String invoiceId, String before, String after, String pageSize) {
    return GetBillingContractsInvoiceLinesRequest.builder()
            .withInvoiceId(invoiceId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get invoice lines
   * Fetch a list of all bills for the specified account.
   * getBillingContractsInvoiceLines is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return BillingInvoiceItemListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BillingInvoiceItemListing getBillingContractsInvoiceLines(GetBillingContractsInvoiceLinesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BillingInvoiceItemListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BillingInvoiceItemListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get invoice lines
   * Fetch a list of all bills for the specified account.
   * getBillingContractsInvoiceLines is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BillingInvoiceItemListing> getBillingContractsInvoiceLines(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BillingInvoiceItemListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BillingInvoiceItemListing> response = (ApiResponse<BillingInvoiceItemListing>)(ApiResponse<?>)exception;
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
      ApiResponse<BillingInvoiceItemListing> response = (ApiResponse<BillingInvoiceItemListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get invoices
   * Retrieve a list of invoices stored in the system.
   * getBillingContractsInvoices is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param dateStart Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param paymentStatus Payment Status (optional)
   * @return BillingInvoiceListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BillingInvoiceListing getBillingContractsInvoices(String before, String after, String pageSize, LocalDate dateStart, LocalDate dateEnd, String paymentStatus) throws IOException, ApiException {
    return  getBillingContractsInvoices(createGetBillingContractsInvoicesRequest(before, after, pageSize, dateStart, dateEnd, paymentStatus));
  }

  /**
   * Get invoices
   * Retrieve a list of invoices stored in the system.
   * getBillingContractsInvoices is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param dateStart Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param paymentStatus Payment Status (optional)
   * @return BillingInvoiceListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BillingInvoiceListing> getBillingContractsInvoicesWithHttpInfo(String before, String after, String pageSize, LocalDate dateStart, LocalDate dateEnd, String paymentStatus) throws IOException {
    return getBillingContractsInvoices(createGetBillingContractsInvoicesRequest(before, after, pageSize, dateStart, dateEnd, paymentStatus).withHttpInfo());
  }

  private GetBillingContractsInvoicesRequest createGetBillingContractsInvoicesRequest(String before, String after, String pageSize, LocalDate dateStart, LocalDate dateEnd, String paymentStatus) {
    return GetBillingContractsInvoicesRequest.builder()
            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withDateStart(dateStart)

            .withDateEnd(dateEnd)

            .withPaymentStatus(paymentStatus)

            .build();
  }

  /**
   * Get invoices
   * Retrieve a list of invoices stored in the system.
   * getBillingContractsInvoices is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return BillingInvoiceListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BillingInvoiceListing getBillingContractsInvoices(GetBillingContractsInvoicesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BillingInvoiceListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BillingInvoiceListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get invoices
   * Retrieve a list of invoices stored in the system.
   * getBillingContractsInvoices is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BillingInvoiceListing> getBillingContractsInvoices(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BillingInvoiceListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BillingInvoiceListing> response = (ApiResponse<BillingInvoiceListing>)(ApiResponse<?>)exception;
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
      ApiResponse<BillingInvoiceListing> response = (ApiResponse<BillingInvoiceListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a report of the billable license usages
   * Report is of the billable usages (e.g. licenses and devices utilized) for a given period. If response's status is InProgress, wait a few seconds, then try the same request again.
   * @param startDate The period start date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (required)
   * @param endDate The period end date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (required)
   * @return BillingUsageReport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BillingUsageReport getBillingReportsBillableusage(Date startDate, Date endDate) throws IOException, ApiException {
    return  getBillingReportsBillableusage(createGetBillingReportsBillableusageRequest(startDate, endDate));
  }

  /**
   * Get a report of the billable license usages
   * Report is of the billable usages (e.g. licenses and devices utilized) for a given period. If response's status is InProgress, wait a few seconds, then try the same request again.
   * @param startDate The period start date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (required)
   * @param endDate The period end date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (required)
   * @return BillingUsageReport
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BillingUsageReport> getBillingReportsBillableusageWithHttpInfo(Date startDate, Date endDate) throws IOException {
    return getBillingReportsBillableusage(createGetBillingReportsBillableusageRequest(startDate, endDate).withHttpInfo());
  }

  private GetBillingReportsBillableusageRequest createGetBillingReportsBillableusageRequest(Date startDate, Date endDate) {
    return GetBillingReportsBillableusageRequest.builder()
            .withStartDate(startDate)

            .withEndDate(endDate)

            .build();
  }

  /**
   * Get a report of the billable license usages
   * Report is of the billable usages (e.g. licenses and devices utilized) for a given period. If response's status is InProgress, wait a few seconds, then try the same request again.
   * @param request The request object
   * @return BillingUsageReport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BillingUsageReport getBillingReportsBillableusage(GetBillingReportsBillableusageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BillingUsageReport> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BillingUsageReport>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a report of the billable license usages
   * Report is of the billable usages (e.g. licenses and devices utilized) for a given period. If response's status is InProgress, wait a few seconds, then try the same request again.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BillingUsageReport> getBillingReportsBillableusage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BillingUsageReport>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BillingUsageReport> response = (ApiResponse<BillingUsageReport>)(ApiResponse<?>)exception;
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
      ApiResponse<BillingUsageReport> response = (ApiResponse<BillingUsageReport>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the billing overview for an organization that is managed by a partner.
   * Tax Disclaimer: Prices returned by this API do not include applicable taxes. It is the responsibility of the customer to pay all taxes that are appropriate in their jurisdiction. See the PureCloud API Documentation in the Developer Center for more information about this API: https://developer.mypurecloud.com/api/rest/v2/
   * @param trustorOrgId The organization ID of the trustor (customer) organization. (required)
   * @param billingPeriodIndex 0 for active period (overview data may change until period closes). 1 for prior completed billing period. 2 for two billing cycles prior, and so on. (optional, default to 0)
   * @return TrusteeBillingOverview
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrusteeBillingOverview getBillingTrusteebillingoverviewTrustorOrgId(String trustorOrgId, Integer billingPeriodIndex) throws IOException, ApiException {
    return  getBillingTrusteebillingoverviewTrustorOrgId(createGetBillingTrusteebillingoverviewTrustorOrgIdRequest(trustorOrgId, billingPeriodIndex));
  }

  /**
   * Get the billing overview for an organization that is managed by a partner.
   * Tax Disclaimer: Prices returned by this API do not include applicable taxes. It is the responsibility of the customer to pay all taxes that are appropriate in their jurisdiction. See the PureCloud API Documentation in the Developer Center for more information about this API: https://developer.mypurecloud.com/api/rest/v2/
   * @param trustorOrgId The organization ID of the trustor (customer) organization. (required)
   * @param billingPeriodIndex 0 for active period (overview data may change until period closes). 1 for prior completed billing period. 2 for two billing cycles prior, and so on. (optional, default to 0)
   * @return TrusteeBillingOverview
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrusteeBillingOverview> getBillingTrusteebillingoverviewTrustorOrgIdWithHttpInfo(String trustorOrgId, Integer billingPeriodIndex) throws IOException {
    return getBillingTrusteebillingoverviewTrustorOrgId(createGetBillingTrusteebillingoverviewTrustorOrgIdRequest(trustorOrgId, billingPeriodIndex).withHttpInfo());
  }

  private GetBillingTrusteebillingoverviewTrustorOrgIdRequest createGetBillingTrusteebillingoverviewTrustorOrgIdRequest(String trustorOrgId, Integer billingPeriodIndex) {
    return GetBillingTrusteebillingoverviewTrustorOrgIdRequest.builder()
            .withTrustorOrgId(trustorOrgId)

            .withBillingPeriodIndex(billingPeriodIndex)

            .build();
  }

  /**
   * Get the billing overview for an organization that is managed by a partner.
   * Tax Disclaimer: Prices returned by this API do not include applicable taxes. It is the responsibility of the customer to pay all taxes that are appropriate in their jurisdiction. See the PureCloud API Documentation in the Developer Center for more information about this API: https://developer.mypurecloud.com/api/rest/v2/
   * @param request The request object
   * @return TrusteeBillingOverview
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrusteeBillingOverview getBillingTrusteebillingoverviewTrustorOrgId(GetBillingTrusteebillingoverviewTrustorOrgIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrusteeBillingOverview> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrusteeBillingOverview>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the billing overview for an organization that is managed by a partner.
   * Tax Disclaimer: Prices returned by this API do not include applicable taxes. It is the responsibility of the customer to pay all taxes that are appropriate in their jurisdiction. See the PureCloud API Documentation in the Developer Center for more information about this API: https://developer.mypurecloud.com/api/rest/v2/
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrusteeBillingOverview> getBillingTrusteebillingoverviewTrustorOrgId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrusteeBillingOverview>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrusteeBillingOverview> response = (ApiResponse<TrusteeBillingOverview>)(ApiResponse<?>)exception;
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
      ApiResponse<TrusteeBillingOverview> response = (ApiResponse<TrusteeBillingOverview>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
