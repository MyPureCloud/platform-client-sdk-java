# WfmUserScheduleAdherenceUpdatedTeamTopicUserScheduleAdherenceUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | [**WfmUserScheduleAdherenceUpdatedTeamTopicUserReference**](WfmUserScheduleAdherenceUpdatedTeamTopicUserReference) |  |  [optional] |
| **managementUnitId** | **String** |  |  [optional] |
| **team** | [**WfmUserScheduleAdherenceUpdatedTeamTopicUriReference**](WfmUserScheduleAdherenceUpdatedTeamTopicUriReference) |  |  [optional] |
| **scheduledActivityCategory** | **String** |  |  [optional] |
| **scheduledActivityCode** | [**WfmUserScheduleAdherenceUpdatedTeamTopicActivityCodeReference**](WfmUserScheduleAdherenceUpdatedTeamTopicActivityCodeReference) |  |  [optional] |
| **systemPresence** | **String** |  |  [optional] |
| **organizationSecondaryPresenceId** | **String** |  |  [optional] |
| **routingStatus** | [**RoutingStatusEnum**](#Enum--RoutingStatusEnum) |  |  [optional] |
| **actualActivityCategory** | **String** |  |  [optional] |
| **isOutOfOffice** | **Boolean** |  |  [optional] |
| **adherenceState** | [**AdherenceStateEnum**](#Enum--AdherenceStateEnum) |  |  [optional] |
| **impact** | **String** |  |  [optional] |
| **adherenceExplanation** | [**WfmUserScheduleAdherenceUpdatedTeamTopicRealTimeAdherenceExplanation**](WfmUserScheduleAdherenceUpdatedTeamTopicRealTimeAdherenceExplanation) |  |  [optional] |
| **adherenceChangeTime** | [**Date**](Date) |  |  [optional] |
| **presenceUpdateTime** | [**Date**](Date) |  |  [optional] |
| **activeQueues** | [**List&lt;WfmUserScheduleAdherenceUpdatedTeamTopicQueueReference&gt;**](WfmUserScheduleAdherenceUpdatedTeamTopicQueueReference) |  |  [optional] |
| **activeQueuesModifiedTime** | [**Date**](Date) |  |  [optional] |
| **removedFromManagementUnit** | **Boolean** |  |  [optional] |
| **suppressOnTimeReminder** | **Boolean** |  |  [optional] |
| **nextActivityReminders** | [**List&lt;WfmUserScheduleAdherenceUpdatedTeamTopicUserNextActivityReminder&gt;**](WfmUserScheduleAdherenceUpdatedTeamTopicUserNextActivityReminder) |  |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
