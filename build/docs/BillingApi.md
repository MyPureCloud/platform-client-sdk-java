# BillingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getBillingContract**](BillingApi#getBillingContract) | Get billing contract |
| [**getBillingContractBillingperiod**](BillingApi#getBillingContractBillingperiod) | Get contract billing period |
| [**getBillingContracts**](BillingApi#getBillingContracts) | Get billing contracts |
| [**getBillingContractsInvoiceDocument**](BillingApi#getBillingContractsInvoiceDocument) | Get invoice document |
| [**getBillingContractsInvoiceLines**](BillingApi#getBillingContractsInvoiceLines) | Get invoice lines |
| [**getBillingContractsInvoices**](BillingApi#getBillingContractsInvoices) | Get invoices |
| [**getBillingReportsBillableusage**](BillingApi#getBillingReportsBillableusage) | Get a report of the billable license usages |
| [**getBillingTrusteebillingoverviewTrustorOrgId**](BillingApi#getBillingTrusteebillingoverviewTrustorOrgId) | Get the billing overview for an organization that is managed by a partner. |
{: class="table-striped"}


# **getBillingContract**


> [BillingContract](BillingContract) getBillingContract(contractId)

Get billing contract

Retrieve a single contract from the system.

getBillingContract is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/billing/contracts/{contractId}  

Requires ANY permissions: 

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
String contractId = "contractId_example"; // String | The contract number.
try {
    BillingContract result = apiInstance.getBillingContract(contractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getBillingContract");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contractId** | **String**| The contract number. | 
{: class="table-striped"}


### Return type

[**BillingContract**](BillingContract)


# **getBillingContractBillingperiod**


> [BillingContractPeriodDetail](BillingContractPeriodDetail) getBillingContractBillingperiod(contractId, billingPeriodId)

Get contract billing period

Fetch the billing information for a given Organization by billing period.

getBillingContractBillingperiod is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/billing/contracts/{contractId}/billingperiods/{billingPeriodId}  

Requires ANY permissions: 

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
String contractId = "contractId_example"; // String | The contract number.
String billingPeriodId = "billingPeriodId_example"; // String | The Billing Period Id for the Org.
try {
    BillingContractPeriodDetail result = apiInstance.getBillingContractBillingperiod(contractId, billingPeriodId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getBillingContractBillingperiod");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contractId** | **String**| The contract number. | 
| **billingPeriodId** | **String**| The Billing Period Id for the Org. | 
{: class="table-striped"}


### Return type

[**BillingContractPeriodDetail**](BillingContractPeriodDetail)


# **getBillingContracts**


> [BillingContractListing](BillingContractListing) getBillingContracts(before, after, pageSize, dateStart, dateEnd, status, externalNumber)

Get billing contracts

Retrieve a list of contracts stored in the system.

getBillingContracts is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/billing/contracts  

Requires ANY permissions: 

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
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
LocalDate dateStart = new LocalDate(); // LocalDate | Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate dateEnd = new LocalDate(); // LocalDate | End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String status = "status_example"; // String | Filter by the status of contracts
String externalNumber = "externalNumber_example"; // String | Filter by the unique external number.
try {
    BillingContractListing result = apiInstance.getBillingContracts(before, after, pageSize, dateStart, dateEnd, status, externalNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getBillingContracts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **dateStart** | **LocalDate**| Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **dateEnd** | **LocalDate**| End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **status** | **String**| Filter by the status of contracts | [optional]<br />**Values**: Active, Inactive 
| **externalNumber** | **String**| Filter by the unique external number. | [optional] 
{: class="table-striped"}


### Return type

[**BillingContractListing**](BillingContractListing)


# **getBillingContractsInvoiceDocument**


> [UrlResponse](UrlResponse) getBillingContractsInvoiceDocument(invoiceId)

Get invoice document

Fetch the document for a specific invoice.

getBillingContractsInvoiceDocument is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/billing/contracts/invoices/{invoiceId}/document  

Requires ANY permissions: 

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
String invoiceId = "invoiceId_example"; // String | invoiceId
try {
    UrlResponse result = apiInstance.getBillingContractsInvoiceDocument(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getBillingContractsInvoiceDocument");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceId** | **String**| invoiceId | 
{: class="table-striped"}


### Return type

[**UrlResponse**](UrlResponse)


# **getBillingContractsInvoiceLines**


> [BillingInvoiceItemListing](BillingInvoiceItemListing) getBillingContractsInvoiceLines(invoiceId, before, after, pageSize)

Get invoice lines

Fetch a list of all bills for the specified account.

getBillingContractsInvoiceLines is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/billing/contracts/invoices/{invoiceId}/lines  

Requires ANY permissions: 

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
String invoiceId = "invoiceId_example"; // String | invoiceId
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
try {
    BillingInvoiceItemListing result = apiInstance.getBillingContractsInvoiceLines(invoiceId, before, after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getBillingContractsInvoiceLines");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceId** | **String**| invoiceId | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
{: class="table-striped"}


### Return type

[**BillingInvoiceItemListing**](BillingInvoiceItemListing)


# **getBillingContractsInvoices**


> [BillingInvoiceListing](BillingInvoiceListing) getBillingContractsInvoices(before, after, pageSize, dateStart, dateEnd, paymentStatus)

Get invoices

Retrieve a list of invoices stored in the system.

getBillingContractsInvoices is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/billing/contracts/invoices  

Requires ANY permissions: 

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
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
LocalDate dateStart = new LocalDate(); // LocalDate | Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate dateEnd = new LocalDate(); // LocalDate | End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String paymentStatus = "paymentStatus_example"; // String | Payment Status
try {
    BillingInvoiceListing result = apiInstance.getBillingContractsInvoices(before, after, pageSize, dateStart, dateEnd, paymentStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getBillingContractsInvoices");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **dateStart** | **LocalDate**| Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **dateEnd** | **LocalDate**| End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] 
| **paymentStatus** | **String**| Payment Status | [optional]<br />**Values**: Paid, UnPaid 
{: class="table-striped"}


### Return type

[**BillingInvoiceListing**](BillingInvoiceListing)


# **getBillingReportsBillableusage**


> [BillingUsageReport](BillingUsageReport) getBillingReportsBillableusage(startDate, endDate)

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

[**BillingUsageReport**](BillingUsageReport)


# **getBillingTrusteebillingoverviewTrustorOrgId**


> [TrusteeBillingOverview](TrusteeBillingOverview) getBillingTrusteebillingoverviewTrustorOrgId(trustorOrgId, billingPeriodIndex)

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

[**TrusteeBillingOverview**](TrusteeBillingOverview)


_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
