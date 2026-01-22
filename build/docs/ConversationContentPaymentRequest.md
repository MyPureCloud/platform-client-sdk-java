# ConversationContentPaymentRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **paymentPlatform** | [**PaymentPlatformEnum**](#Enum--PaymentPlatformEnum) | The payment platform being used (e.g. Apple Pay) |  |
| **countryCode** | **String** | The merchant's two-letter ISO 3166 country code. |  |
| **currencyCode** | **String** | The three-letter ISO 4217 currency code for the payment. |  |
| **orderTotal** | **Double** | The total price of the order. |  |
| **lineItems** | [**List&lt;ConversationContentLineItem&gt;**](ConversationContentLineItem) | The items that make up the order. |  [optional] |
| **shippingOptions** | [**List&lt;ConversationContentLineItem&gt;**](ConversationContentLineItem) | The available shipping options. |  [optional] |
| **requiredContactFields** | [**List&lt;ConversationContentRequiredContactField&gt;**](ConversationContentRequiredContactField) | Contact fields required to complete the order. |  [optional] |
| **receivedMessage** | [**ConversationContentReceivedReplyMessage**](ConversationContentReceivedReplyMessage) | The message prompt to complete a payment transaction. |  [optional] |
| **replyMessage** | [**ConversationContentReceivedReplyMessage**](ConversationContentReceivedReplyMessage) | The reply message after the user has completed the payment transaction. |  [optional] |


## Enum: PaymentPlatformEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPLEPAY | &quot;ApplePay&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
