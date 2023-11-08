---
title: ActionEventRequest
---
## ActionEventRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> | UUID of the customer session for this action. |  |
| **actionId** | <!----><!---->**String**<!----> | UUID for the action, as returned by the Ping endpoint when the action was qualified. |  |
| **actionState** | [**ActionStateEnum**](#ActionStateEnum)<!----> | State the action is transitioning to. |  |
| **errorCode** | <!----><!---->**String**<!----> | Client defined error code (when state transitions to errored) |  [optional] |
| **errorMessage** | <!----><!---->**String**<!----> | Message of the error returned when the action fails (when state transitions to errored) |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="ActionStateEnum"></a>

## Enum: ActionStateEnum

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



