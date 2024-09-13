# PatchJourneyPattern


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **criteria** | [**List&lt;PatchCriteria&gt;**](PatchCriteria) | A list of one or more criteria to satisfy. |  [optional] |
| **count** | **Integer** | The number of times the pattern must match. |  [optional] |
| **streamType** | [**StreamTypeEnum**](#Enum--StreamTypeEnum) | The stream type for which this pattern can be matched on. |  [optional] |
| **sessionType** | **String** | The session type for which this pattern can be matched on. |  [optional] |
| **eventName** | **String** | The name of the event for which this pattern can be matched on. |  [optional] |


## Enum: StreamTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEB | &quot;Web&quot; | 
| CUSTOM | &quot;Custom&quot; | 
| CONVERSATION | &quot;Conversation&quot; | 
| APP | &quot;App&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
