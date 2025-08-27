# PaymentRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **paymentPlatform** | [**PaymentPlatformEnum**](#Enum--PaymentPlatformEnum) | The payment platform being used (e.g. Apple Pay) |  [optional] |
| **countryCode** | **String** | The merchant's two-letter ISO 3166 country code. |  [optional] |
| **currencyCode** | **String** | The three-letter ISO 4217 currency code for the payment. |  [optional] |
| **orderTotal** | **Double** | The total price of the order. |  |
| **lineItems** | [**List&lt;PaymentLineItem&gt;**](PaymentLineItem) | The items that make up the order. |  [optional] |
| **shippingOptions** | [**List&lt;PaymentLineItem&gt;**](PaymentLineItem) | The available shipping options. |  [optional] |


## Enum: PaymentPlatformEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPLEPAY | &quot;ApplePay&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
