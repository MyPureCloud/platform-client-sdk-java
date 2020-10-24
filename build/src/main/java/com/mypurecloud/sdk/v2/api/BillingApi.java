package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

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


public class BillingApi {
  private final ApiClient pcapiClient;

  public BillingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BillingApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get a report of the billable license usages
   * Report is of the billable usages (e.g. licenses and devices utilized) for a given period. If response&#39;s status is InProgress, wait a few seconds, then try the same request again.
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
   * Report is of the billable usages (e.g. licenses and devices utilized) for a given period. If response&#39;s status is InProgress, wait a few seconds, then try the same request again.
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
   * Report is of the billable usages (e.g. licenses and devices utilized) for a given period. If response&#39;s status is InProgress, wait a few seconds, then try the same request again.
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
   * Report is of the billable usages (e.g. licenses and devices utilized) for a given period. If response&#39;s status is InProgress, wait a few seconds, then try the same request again.
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
