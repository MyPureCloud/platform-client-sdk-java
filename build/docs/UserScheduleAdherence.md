---
title: UserScheduleAdherence
---
## UserScheduleAdherence


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **user** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user for whom this status applies |  [optional] |
| **businessUnit** | <!----><!---->[**BusinessUnitReference**](BusinessUnitReference.html)<!----> | The business unit to which this user belongs |  [optional] |
| **managementUnit** | <!----><!---->[**ManagementUnitReference**](ManagementUnitReference.html)<!----> | The management unit to which this user belongs |  [optional] |
| **team** | <!----><!---->[**TeamReference**](TeamReference.html)<!----> | The team to which this user belongs |  [optional] |
| **scheduledActivityCategory** | [**ScheduledActivityCategoryEnum**](#ScheduledActivityCategoryEnum)<!----> | Activity for which the user is scheduled |  [optional] |
| **scheduledActivityCode** | <!----><!---->[**ActivityCodeReference**](ActivityCodeReference.html)<!----> | Activity code for which the user is currently scheduled |  [optional] |
| **systemPresence** | [**SystemPresenceEnum**](#SystemPresenceEnum)<!----> | Actual underlying system presence value |  [optional] |
| **organizationSecondaryPresenceId** | <!----><!---->**String**<!----> | Organization Secondary Presence Id. |  [optional] |
| **routingStatus** | [**RoutingStatusEnum**](#RoutingStatusEnum)<!----> | Actual underlying routing status, used to determine whether a user is actually in adherence when OnQueue |  [optional] |
| **actualActivityCategory** | [**ActualActivityCategoryEnum**](#ActualActivityCategoryEnum)<!----> | Activity in which the user is actually engaged |  [optional] |
| **isOutOfOffice** | <!----><!---->**Boolean**<!----> | Whether the user is marked OutOfOffice |  [optional] |
| **adherenceState** | [**AdherenceStateEnum**](#AdherenceStateEnum)<!----> | The user's current adherence state |  [optional] |
| **impact** | [**ImpactEnum**](#ImpactEnum)<!----> | The impact of the user's current adherenceState |  [optional] |
| **timeOfAdherenceChange** | <!----><!---->[**Date**](Date.html)<!----> | Time when the user entered the current adherenceState in ISO-8601 format |  [optional] |
| **presenceUpdateTime** | <!----><!---->[**Date**](Date.html)<!----> | Time when presence was last updated. Used to calculate time in current status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **activeQueues** | <!----><!---->[**List&lt;QueueReference&gt;**](QueueReference.html)<!----> | The list of queues to which this user is joined |  [optional] |
| **activeQueuesModifiedTime** | <!----><!---->[**Date**](Date.html)<!----> | Time when the list of active queues for this user was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **removedFromManagementUnit** | <!----><!---->**Boolean**<!----> | For notification purposes. Used to indicate that a user was removed from the management unit |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="ScheduledActivityCategoryEnum"></a>

## Enum: ScheduledActivityCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ONQUEUEWORK | &quot;OnQueueWork&quot; | 
| BREAK | &quot;Break&quot; | 
| MEAL | &quot;Meal&quot; | 
| MEETING | &quot;Meeting&quot; | 
| OFFQUEUEWORK | &quot;OffQueueWork&quot; | 
| TIMEOFF | &quot;TimeOff&quot; | 
| TRAINING | &quot;Training&quot; | 
| UNAVAILABLE | &quot;Unavailable&quot; | 
| UNSCHEDULED | &quot;Unscheduled&quot; | 
{: class="table table-striped"}


<a name="SystemPresenceEnum"></a>

## Enum: SystemPresenceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AVAILABLE | &quot;Available&quot; | 
| AWAY | &quot;Away&quot; | 
| BUSY | &quot;Busy&quot; | 
| OFFLINE | &quot;Offline&quot; | 
| IDLE | &quot;Idle&quot; | 
| ONQUEUE | &quot;OnQueue&quot; | 
| MEAL | &quot;Meal&quot; | 
| TRAINING | &quot;Training&quot; | 
| MEETING | &quot;Meeting&quot; | 
| BREAK | &quot;Break&quot; | 
{: class="table table-striped"}


<a name="RoutingStatusEnum"></a>

## Enum: RoutingStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFF_QUEUE | &quot;OFF_QUEUE&quot; | 
| IDLE | &quot;IDLE&quot; | 
| INTERACTING | &quot;INTERACTING&quot; | 
| NOT_RESPONDING | &quot;NOT_RESPONDING&quot; | 
| COMMUNICATING | &quot;COMMUNICATING&quot; | 
{: class="table table-striped"}


<a name="ActualActivityCategoryEnum"></a>

## Enum: ActualActivityCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ONQUEUEWORK | &quot;OnQueueWork&quot; | 
| BREAK | &quot;Break&quot; | 
| MEAL | &quot;Meal&quot; | 
| MEETING | &quot;Meeting&quot; | 
| OFFQUEUEWORK | &quot;OffQueueWork&quot; | 
| TIMEOFF | &quot;TimeOff&quot; | 
| TRAINING | &quot;Training&quot; | 
| UNAVAILABLE | &quot;Unavailable&quot; | 
| UNSCHEDULED | &quot;Unscheduled&quot; | 
{: class="table table-striped"}


<a name="AdherenceStateEnum"></a>

## Enum: AdherenceStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INADHERENCE | &quot;InAdherence&quot; | 
| OUTOFADHERENCE | &quot;OutOfAdherence&quot; | 
| UNSCHEDULED | &quot;Unscheduled&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| IGNORED | &quot;Ignored&quot; | 
| EXPLAINED | &quot;Explained&quot; | 
{: class="table table-striped"}


<a name="ImpactEnum"></a>

## Enum: ImpactEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| POSITIVE | &quot;Positive&quot; | 
| NEGATIVE | &quot;Negative&quot; | 
| NEUTRAL | &quot;Neutral&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



