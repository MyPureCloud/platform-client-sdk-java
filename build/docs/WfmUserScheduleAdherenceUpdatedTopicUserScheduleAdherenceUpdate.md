# WfmUserScheduleAdherenceUpdatedTopicUserScheduleAdherenceUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | [**WfmUserScheduleAdherenceUpdatedTopicUserReference**](WfmUserScheduleAdherenceUpdatedTopicUserReference) |  |  [optional] |
| **managementUnitId** | **String** |  |  [optional] |
| **team** | [**WfmUserScheduleAdherenceUpdatedTopicUriReference**](WfmUserScheduleAdherenceUpdatedTopicUriReference) |  |  [optional] |
| **scheduledActivityCategory** | **String** |  |  [optional] |
| **scheduledActivityCode** | [**WfmUserScheduleAdherenceUpdatedTopicActivityCodeReference**](WfmUserScheduleAdherenceUpdatedTopicActivityCodeReference) |  |  [optional] |
| **systemPresence** | **String** |  |  [optional] |
| **organizationSecondaryPresenceId** | **String** |  |  [optional] |
| **routingStatus** | [**RoutingStatusEnum**](#Enum--RoutingStatusEnum) |  |  [optional] |
| **actualActivityCategory** | **String** |  |  [optional] |
| **isOutOfOffice** | **Boolean** |  |  [optional] |
| **adherenceState** | [**AdherenceStateEnum**](#Enum--AdherenceStateEnum) |  |  [optional] |
| **impact** | **String** |  |  [optional] |
| **adherenceExplanation** | [**WfmUserScheduleAdherenceUpdatedTopicRealTimeAdherenceExplanation**](WfmUserScheduleAdherenceUpdatedTopicRealTimeAdherenceExplanation) |  |  [optional] |
| **adherenceChangeTime** | [**Date**](Date) |  |  [optional] |
| **presenceUpdateTime** | [**Date**](Date) |  |  [optional] |
| **activeQueues** | [**List&lt;WfmUserScheduleAdherenceUpdatedTopicQueueReference&gt;**](WfmUserScheduleAdherenceUpdatedTopicQueueReference) |  |  [optional] |
| **activeQueuesModifiedTime** | [**Date**](Date) |  |  [optional] |
| **removedFromManagementUnit** | **Boolean** |  |  [optional] |
| **suppressOnTimeReminder** | **Boolean** |  |  [optional] |
| **nextActivityReminders** | [**List&lt;WfmUserScheduleAdherenceUpdatedTopicUserNextActivityReminder&gt;**](WfmUserScheduleAdherenceUpdatedTopicUserNextActivityReminder) |  |  [optional] |


## Enum: RoutingStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| _EMPTY_ | &quot;__EMPTY__&quot; | 
| OFF_QUEUE | &quot;OFF_QUEUE&quot; | 
| IDLE | &quot;IDLE&quot; | 
| INTERACTING | &quot;INTERACTING&quot; | 
| NOT_RESPONDING | &quot;NOT_RESPONDING&quot; | 
| COMMUNICATING | &quot;COMMUNICATING&quot; | 
| OFFLINE | &quot;OFFLINE&quot; | 


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




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
