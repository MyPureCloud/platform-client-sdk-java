# BillingCharge


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **product** | [**BillingProduct**](BillingProduct) | Represents the details of a product. |  [optional] |
| **organizations** | [**List&lt;NamedEntity&gt;**](NamedEntity) | List of plans within the organization. |  [optional] |
| **getprepaidQuantity** | **Integer** | The quantity of usage that is prepaid. |  [optional] |
| **getfairuseQuantity** | **Integer** | The quantity of usage allowed under fair use policies. |  [optional] |
| **getactualQuantity** | **Integer** | The actual quantity of usage. |  [optional] |
| **getoverageQuantity** | **Integer** | The quantity of usage that exceeds prepaid or fair use limits. |  [optional] |
| **overageRate** | [**BigDecimal**](BigDecimal) | The rate charged per unit of overage. |  [optional] |
| **overageCharge** | [**BigDecimal**](BigDecimal) | The total charge for overage usage. |  [optional] |
| **overageCurrency** | **String** | The currency in which the overage charge is billed. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
