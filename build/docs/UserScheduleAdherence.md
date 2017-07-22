---
title: UserScheduleAdherence
---
## UserScheduleAdherence


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **user** | [**User**](User.html) | The user for whom this status applies |  [optional] |
| **managementUnit** | [**ManagementUnit**](ManagementUnit.html) | The management unit to which this user belongs |  [optional] |
| **scheduledActivityCategory** | [**ScheduledActivityCategoryEnum**](#ScheduledActivityCategoryEnum) | Activity for which the user is scheduled |  [optional] |
| **systemPresence** | [**SystemPresenceEnum**](#SystemPresenceEnum) | Actual underlying system presence value |  [optional] |
| **organizationSecondaryPresenceId** | **String** | Organization Secondary Presence Id. |  [optional] |
| **routingStatus** | [**RoutingStatusEnum**](#RoutingStatusEnum) | Actual underlying routing status, used to determine whether a user is actually in adherence when OnQueue |  [optional] |
| **actualActivityCategory** | [**ActualActivityCategoryEnum**](#ActualActivityCategoryEnum) | Activity in which the user is actually engaged |  [optional] |
| **isOutOfOffice** | **Boolean** | Whether the user is marked OutOfOffice |  [optional] |
| **adherenceState** | [**AdherenceStateEnum**](#AdherenceStateEnum) | The user&#39;s current adherence state |  [optional] |
| **impact** | [**ImpactEnum**](#ImpactEnum) | The impact of the user&#39;s current adherenceState |  [optional] |
| **timeOfAdherenceChange** | **String** | Time when the user entered the current adherenceState in ISO-8601 format |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
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


<a name="AdherenceStateEnum"></a>

## Enum: AdherenceStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INADHERENCE | &quot;InAdherence&quot; |
| OUTOFADHERENCE | &quot;OutOfAdherence&quot; |
| UNSCHEDULED | &quot;Unscheduled&quot; |
| UNKNOWN | &quot;Unknown&quot; |


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


