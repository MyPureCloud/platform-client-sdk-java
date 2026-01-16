# JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **dateCreated** | **String** |  |  [optional] |
| **dateCompleted** | **String** |  |  [optional] |
| **journeyView** | [**JourneyViewJobNotificationTopicJourneyView**](JourneyViewJobNotificationTopicJourneyView) |  |  [optional] |
| **dateCompletionEstimated** | **String** |  |  [optional] |
| **estimatedCompletionMargin** | **Long** |  |  [optional] |
| **userId** | **String** |  |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ACCEPTED | &quot;Accepted&quot; | 
| EXECUTING | &quot;Executing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| FAILED | &quot;Failed&quot; | 
| CANCELLED | &quot;Cancelled&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
