# JourneyWebEventsNotificationEventAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **createdDate** | [**Date**](Date) |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **prompt** | **String** |  |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACCEPTED | &quot;accepted&quot; | 
| REJECTED | &quot;rejected&quot; | 
| TIMEDOUT | &quot;timedout&quot; | 
| ERRORED | &quot;errored&quot; | 
| IGNORED | &quot;ignored&quot; | 
| QUALIFIED | &quot;qualified&quot; | 
| OFFERED | &quot;offered&quot; | 
| STARTED | &quot;started&quot; | 
| ENGAGED | &quot;engaged&quot; | 
| QUALIFIEDOUTSIDESCHEDULE | &quot;qualifiedOutsideSchedule&quot; | 
| OFFEREDOUTSIDESCHEDULE | &quot;offeredOutsideSchedule&quot; | 
| ABANDONED | &quot;abandoned&quot; | 
| COMPLETED | &quot;completed&quot; | 
| FREQUENCYCAPREACHED | &quot;frequencyCapReached&quot; | 


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEBCHAT | &quot;webchat&quot; | 
| WEBMESSAGINGOFFER | &quot;webMessagingOffer&quot; | 
| CONTENTOFFER | &quot;contentOffer&quot; | 
| ARCHITECTFLOW | &quot;architectFlow&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
