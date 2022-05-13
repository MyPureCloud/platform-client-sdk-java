---
title: JourneyWebEventsNotificationEventAction
---
## JourneyWebEventsNotificationEventAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> |  |  [optional] |
| **prompt** | <!----><!---->**String**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

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
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEBCHAT | &quot;webchat&quot; | 
| WEBMESSAGINGOFFER | &quot;webMessagingOffer&quot; | 
| CONTENTOFFER | &quot;contentOffer&quot; | 
| ARCHITECTFLOW | &quot;architectFlow&quot; | 
{: class="table table-striped"}



