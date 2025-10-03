# ConversationContentPaymentResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **originatingMessageId** | **String** | Reference to the ID of the original payment request message this response is for. |  |
| **paymentStatus** | [**PaymentStatusEnum**](#Enum--PaymentStatusEnum) | The status of the payment transaction. |  |
| **failureReason** | **String** | The reason the payment request failed. |  [optional] |


## Enum: PaymentStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| FAILED | &quot;Failed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
