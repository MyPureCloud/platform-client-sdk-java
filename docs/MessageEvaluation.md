# MessageEvaluation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contactColumn** | **String** | The name of the contact column that was wrapped up |  [optional] |
| **contactAddress** | **String** | The address (phone or email) that was wrapped up |  [optional] |
| **messageType** | [**MessageTypeEnum**](#Enum--MessageTypeEnum) | The type of message sent |  [optional] |
| **wrapupCodeId** | **String** | The id of the wrap-up code |  [optional] |
| **timestamp** | [**Date**](Date) | The time that the wrap-up was applied. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: MessageTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SMS | &quot;Sms&quot; | 
| EMAIL | &quot;Email&quot; | 
| WHATSAPP | &quot;WhatsApp&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
