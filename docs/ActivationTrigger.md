# ActivationTrigger


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **triggerType** | [**TriggerTypeEnum**](#Enum--TriggerTypeEnum) | Trigger type that activated this checklist. |  [optional] |
| **triggerDate** | [**Date**](Date) | Date when the checklist was triggered. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **intentId** | **String** | The intent ID if checklist was triggered by an intent. |  [optional] |
| **intentName** | **String** | The intent name if checklist was triggered by an intent. |  [optional] |


## Enum: TriggerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INTENT | &quot;Intent&quot; | 
| CONVERSATIONSTART | &quot;ConversationStart&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
