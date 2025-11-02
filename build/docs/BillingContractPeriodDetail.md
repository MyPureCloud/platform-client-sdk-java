# BillingContractPeriodDetail


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **dateStart** | [**LocalDate**](LocalDate) | The date when the Billing Period starts. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEnd** | [**LocalDate**](LocalDate) | The date when the Billing Period starts. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The type of address. |  [optional] |
| **charges** | [**List&lt;BillingCharge&gt;**](BillingCharge) | Represents usage metrics including prepaid, actual, and overage quantities along with associated charges. |  [optional] |
| **wallets** | [**List&lt;BillingWallet&gt;**](BillingWallet) | Represents usage metrics including prepaid, actual, and overage quantities along with associated charges. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OPEN | &quot;Open&quot; | 
| CLOSED | &quot;Closed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
