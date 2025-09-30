# EventAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | ID of the action. |  |
| **state** | [**StateEnum**](#Enum--StateEnum) | Current state of the action (e.g. qualified, succeeded, errored). |  |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The media type used to deliver the action (e.g. email, webhook). |  |
| **prompt** | **String** | Prompt of the action to be displayed/sent to the visitor. |  |
| **createdDate** | [**Date**](Date) | Timestamp indicating when the action was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |


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
| INTEGRATIONACTION | &quot;integrationAction&quot; | 
| ARCHITECTFLOW | &quot;architectFlow&quot; | 
| OPENACTION | &quot;openAction&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
