---
title: WorkitemsQueueEventsNotificationSession
---
## WorkitemsQueueEventsNotificationSession


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **dateSessionStart** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateSessionEnd** | <!----><!---->**String**<!----> |  |  [optional] |
| **assignmentSegments** | <!----><!---->[**List&lt;WorkitemsQueueEventsNotificationAssignmentSegment&gt;**](WorkitemsQueueEventsNotificationAssignmentSegment.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| AGENT | &quot;Agent&quot; | 
| QUEUEASSIGNMENT | &quot;QueueAssignment&quot; | 
| DIRECTASSIGNMENT | &quot;DirectAssignment&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ACTIVE | &quot;Active&quot; | 
| COMPLETED | &quot;Completed&quot; | 
{: class="table table-striped"}



