---
title: BillingApi
---
## BillingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getBillingReportsBillableusage**](BillingApi.html#getBillingReportsBillableusage) | Get a report of the billable usages (e.g. licenses and devices utilized) for a given period. |
{: class="table table-striped"}

<a name="getBillingReportsBillableusage"></a>

# **getBillingReportsBillableusage**



> [BillingUsageReport](BillingUsageReport.html) getBillingReportsBillableusage(startDate, endDate)

Get a report of the billable usages (e.g. licenses and devices utilized) for a given period.



Wraps GET /api/v2/billing/reports/billableusage  

Requires ANY permissions: 

* billing:subscription:read
* billing:subscription:view
* billing:subscription:create
* billing:subscription:add

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.BillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

BillingApi apiInstance = new BillingApi();
Date startDate = new Date(); // Date | The period start date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
Date endDate = new Date(); // Date | The period end date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
try {
    BillingUsageReport result = apiInstance.getBillingReportsBillableusage(startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getBillingReportsBillableusage");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startDate** | **Date**| The period start date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | |
| **endDate** | **Date**| The period end date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | |
{: class="table table-striped"}

### Return type

[**BillingUsageReport**](BillingUsageReport.html)

