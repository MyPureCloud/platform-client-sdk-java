# PatchCallbackRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversationId** | **String** | The conversationId. |  |
| **queueId** | **String** | The identifier of the queue to be used for the callback. |  [optional] |
| **agentId** | **String** | The agentId. |  |
| **callbackScheduledTime** | [**Date**](Date) | The scheduled date-time for the callback. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **countryCode** | **String** | The countryCode |  [optional] |
| **callbackNumbers** | **List&lt;String&gt;** | The callbackNumbers |  [optional] |
| **validateCallbackNumbers** | **Boolean** | validateCallbackNumbers |  [optional] |
| **customerFirstCallbackDeliveryMode** | [**CustomerFirstCallbackDeliveryModeEnum**](#Enum--CustomerFirstCallbackDeliveryModeEnum) | How customer-first callback agent reservation is applied for this callback. useAgentReservation forces reservation on; noAgentReservation forces it off; useQueueSetting uses the queue configuration. |  [optional] |


## Enum: CustomerFirstCallbackDeliveryModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USEQUEUESETTING | &quot;UseQueueSetting&quot; | 
| USEAGENTRESERVATION | &quot;UseAgentReservation&quot; | 
| NOAGENTRESERVATION | &quot;NoAgentReservation&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
