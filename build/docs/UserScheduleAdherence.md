# UserScheduleAdherence


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **user** | [**UserReference**](UserReference) | The user for whom this status applies |  [optional] |
| **businessUnit** | [**BusinessUnitReference**](BusinessUnitReference) | The business unit to which this user belongs |  [optional] |
| **managementUnit** | [**ManagementUnitReference**](ManagementUnitReference) | The management unit to which this user belongs |  [optional] |
| **team** | [**TeamReference**](TeamReference) | The team to which this user belongs |  [optional] |
| **scheduledActivityCategory** | [**ScheduledActivityCategoryEnum**](#Enum--ScheduledActivityCategoryEnum) | Activity for which the user is scheduled |  [optional] |
| **scheduledActivityCode** | [**ActivityCodeSummary**](ActivityCodeSummary) | Activity code for which the user is currently scheduled |  [optional] |
| **systemPresence** | [**SystemPresenceEnum**](#Enum--SystemPresenceEnum) | Actual underlying system presence value |  [optional] |
| **organizationSecondaryPresenceId** | **String** | Organization Secondary Presence Id. |  [optional] |
| **routingStatus** | [**RoutingStatusEnum**](#Enum--RoutingStatusEnum) | Actual underlying routing status, used to determine whether a user is actually in adherence when OnQueue |  [optional] |
| **actualActivityCategory** | [**ActualActivityCategoryEnum**](#Enum--ActualActivityCategoryEnum) | Activity in which the user is actually engaged |  [optional] |
| **isOutOfOffice** | **Boolean** | Whether the user is marked OutOfOffice |  [optional] |
| **adherenceState** | [**AdherenceStateEnum**](#Enum--AdherenceStateEnum) | The user's current adherence state |  [optional] |
| **impact** | [**ImpactEnum**](#Enum--ImpactEnum) | The impact of the user's current adherenceState |  [optional] |
| **adherenceExplanation** | [**RealTimeAdherenceExplanation**](RealTimeAdherenceExplanation) | Currently applicable explanation for the adherence state |  [optional] |
| **timeOfAdherenceChange** | [**Date**](Date) | Time when the user entered the current adherenceState in ISO-8601 format |  [optional] |
| **presenceUpdateTime** | [**Date**](Date) | Time when presence was last updated. Used to calculate time in current status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **activeQueues** | [**List&lt;QueueReference&gt;**](QueueReference) | The list of queues to which this user is joined |  [optional] |
| **activeQueuesModifiedTime** | [**Date**](Date) | Time when the list of active queues for this user was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **removedFromManagementUnit** | **Boolean** | For notification purposes. Used to indicate that a user was removed from the management unit |  [optional] |
| **nextActivityReminders** | [**List&lt;UserNextActivityReminder&gt;**](UserNextActivityReminder) | A list of upcoming activities for which the user is scheduled |  [optional] |
| **suppressOnTimeReminder** | **Boolean** | Indicates whether the on-time adherence notification should be suppressed for the user |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


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


## Enum: RoutingStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFF_QUEUE | &quot;OFF_QUEUE&quot; | 
| IDLE | &quot;IDLE&quot; | 
| INTERACTING | &quot;INTERACTING&quot; | 
| NOT_RESPONDING | &quot;NOT_RESPONDING&quot; | 
| COMMUNICATING | &quot;COMMUNICATING&quot; | 


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


## Enum: ImpactEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| POSITIVE | &quot;Positive&quot; | 
| NEGATIVE | &quot;Negative&quot; | 
| NEUTRAL | &quot;Neutral&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
