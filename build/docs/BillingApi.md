---
title: BillingApi
---
## BillingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getBillingReportsBillableusage**](BillingApi.html#getBillingReportsBillableusage) | Get a report of the billable license usages |
| [**getBillingTrusteebillingoverviewTrustorOrgId**](BillingApi.html#getBillingTrusteebillingoverviewTrustorOrgId) | Get the billing overview for an organization that is managed by a partner. |
{: class="table-striped"}

<a name="getBillingReportsBillableusage"></a>

# **getBillingReportsBillableusage**



> [BillingUsageReport](BillingUsageReport.html) getBillingReportsBillableusage(startDate, endDate)

Get a report of the billable license usages

Report is of the billable usages (e.g. licenses and devices utilized) for a given period. If response's status is InProgress, wait a few seconds, then try the same request again.

Wraps GET /api/v2/billing/reports/billableusage  

Requires ANY permissions: 

* billing:subscription:read
* billing:subscription:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BillingApi apiInstance = new BillingApi();
Date startDate = new Date(); // Date | The period start date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
Date endDate = new Date(); // Date | The period end date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
try {
    BillingUsageReport result = apiInstance.getBillingReportsBillableusage(startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getBillingReportsBillableusage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startDate** | **Date**| The period start date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | 
| **endDate** | **Date**| The period end date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | 
{: class="table-striped"}


### Return type

[**BillingUsageReport**](BillingUsageReport.html)

<a name="getBillingTrusteebillingoverviewTrustorOrgId"></a>

# **getBillingTrusteebillingoverviewTrustorOrgId**



> [TrusteeBillingOverview](TrusteeBillingOverview.html) getBillingTrusteebillingoverviewTrustorOrgId(trustorOrgId, billingPeriodIndex)

Get the billing overview for an organization that is managed by a partner.

Tax Disclaimer: Prices returned by this API do not include applicable taxes. It is the responsibility of the customer to pay all taxes that are appropriate in their jurisdiction. See the PureCloud API Documentation in the Developer Center for more information about this API: https://developer.mypurecloud.com/api/rest/v2/

Wraps GET /api/v2/billing/trusteebillingoverview/{trustorOrgId}  

Requires ANY permissions: 

* affiliateOrganization:clientBilling:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BillingApi apiInstance = new BillingApi();
String trustorOrgId = "trustorOrgId_example"; // String | The organization ID of the trustor (customer) organization.
Integer billingPeriodIndex = 0; // Integer | 0 for active period (overview data may change until period closes). 1 for prior completed billing period. 2 for two billing cycles prior, and so on.
try {
    TrusteeBillingOverview result = apiInstance.getBillingTrusteebillingoverviewTrustorOrgId(trustorOrgId, billingPeriodIndex);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getBillingTrusteebillingoverviewTrustorOrgId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trustorOrgId** | **String**| The organization ID of the trustor (customer) organization. | 
| **billingPeriodIndex** | **Integer**| 0 for active period (overview data may change until period closes). 1 for prior completed billing period. 2 for two billing cycles prior, and so on. | [optional] [default to 0] 
{: class="table-striped"}


### Return type

[**TrusteeBillingOverview**](TrusteeBillingOverview.html)

