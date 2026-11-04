# BillingCharge


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the object. |  [optional] |
| **product** | [**BillingProduct**](BillingProduct) | Represents the details of a product. |  [optional] |
| **organizations** | [**List&lt;NamedEntity&gt;**](NamedEntity) | Organizations associated with this charge. |  [optional] |
| **prepaidQuantity** | [**BigDecimal**](BigDecimal) | The quantity of usage that is prepaid. |  [optional] |
| **fairuseAllocation** | [**BigDecimal**](BigDecimal) | Quantity of usage allowed under fair-use policies. |  [optional] |
| **fairuseAmount** | [**BigDecimal**](BigDecimal) | Monetary value of the fair-use allocation, in the same currency as overageCurrency. |  [optional] |
| **actualQuantity** | [**BigDecimal**](BigDecimal) | The actual quantity of usage. |  [optional] |
| **overageQuantity** | [**BigDecimal**](BigDecimal) | The quantity of usage that exceeds prepaid or fair use limits. |  [optional] |
| **overageRate** | [**BigDecimal**](BigDecimal) | The rate charged per unit of overage. |  [optional] |
| **overageCharge** | [**BigDecimal**](BigDecimal) | The total charge for overage usage. |  [optional] |
| **overageCurrency** | **String** | The currency in which the overage charge is billed. |  [optional] |
| **convertedTokenCount** | [**BigDecimal**](BigDecimal) | AI Token Count after the conversion for AI Products. |  [optional] |
| **tokenConversionRate** | [**BigDecimal**](BigDecimal) | AI Token Conversion Rate — Units per token conversion ratio. |  [optional] |
| **aiSubItems** | [**List&lt;BillingAiSubItem&gt;**](BillingAiSubItem) | Usage that makes up this AI parent bundle, including the bundle's own token usage and each child product's usage converted to tokens; the converted total is the parent's actual quantity. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
