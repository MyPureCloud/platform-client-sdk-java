# BillingContract


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **externalNumber** | **String** | Unique external number. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the contract. |  [optional] |
| **commercialModel** | **String** | The type of commercial model. |  [optional] |
| **purchaseOrderNumbers** | **List&lt;String&gt;** | List of po numbers periods for this contract. |  [optional] |
| **billToCustomer** | [**Customer**](Customer) | The bill to customer. |  [optional] |
| **soldToCustomer** | [**Customer**](Customer) | The sold to customer. |  [optional] |
| **endCustomer** | [**Customer**](Customer) | The end customer. |  [optional] |
| **dateStart** | [**LocalDate**](LocalDate) | The start date of the contract. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEnd** | [**LocalDate**](LocalDate) | The end date of the contract. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateRampStart** | [**LocalDate**](LocalDate) | the date when the first revenue or quantity in a ramped deal begins. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateRampEnd** | [**LocalDate**](LocalDate) | the date when the first revenue or quantity in a ramped deal ends. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **billingPeriods** | [**List&lt;BillingContractPeriod&gt;**](BillingContractPeriod) | List of billing periods for the contract. |  [optional] |
| **plans** | [**List&lt;BillingPlan&gt;**](BillingPlan) | The collection of prices for the related organizations. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
