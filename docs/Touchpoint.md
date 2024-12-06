# Touchpoint


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversationId** | **String** | ID of conversation. |  [optional] |
| **agentId** | **String** | ID of agent. |  |
| **associatedValue** | [**BigDecimal**](BigDecimal) | The value attributed to this touchpoint. |  |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | Media Type of the touchpoint; allowed values are Email, Message and Voice. |  [optional] |
| **createdDate** | [**Date**](Date) | Date conversation happened. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EMAIL | &quot;Email&quot; | 
| MESSAGE | &quot;Message&quot; | 
| VOICE | &quot;Voice&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
