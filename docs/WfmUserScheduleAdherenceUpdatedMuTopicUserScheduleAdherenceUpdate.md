# WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | [**WfmUserScheduleAdherenceUpdatedMuTopicUserReference**](WfmUserScheduleAdherenceUpdatedMuTopicUserReference) |  |  [optional] |
| **managementUnitId** | **String** |  |  [optional] |
| **team** | [**WfmUserScheduleAdherenceUpdatedMuTopicUriReference**](WfmUserScheduleAdherenceUpdatedMuTopicUriReference) |  |  [optional] |
| **scheduledActivityCategory** | **String** |  |  [optional] |
| **scheduledActivityCode** | [**WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference**](WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference) |  |  [optional] |
| **systemPresence** | **String** |  |  [optional] |
| **organizationSecondaryPresenceId** | **String** |  |  [optional] |
| **routingStatus** | [**RoutingStatusEnum**](#Enum--RoutingStatusEnum) |  |  [optional] |
| **actualActivityCategory** | **String** |  |  [optional] |
| **isOutOfOffice** | **Boolean** |  |  [optional] |
| **adherenceState** | [**AdherenceStateEnum**](#Enum--AdherenceStateEnum) |  |  [optional] |
| **impact** | **String** |  |  [optional] |
| **adherenceExplanation** | [**WfmUserScheduleAdherenceUpdatedMuTopicRealTimeAdherenceExplanation**](WfmUserScheduleAdherenceUpdatedMuTopicRealTimeAdherenceExplanation) |  |  [optional] |
| **adherenceChangeTime** | [**Date**](Date) |  |  [optional] |
| **presenceUpdateTime** | [**Date**](Date) |  |  [optional] |
| **activeQueues** | [**List&lt;WfmUserScheduleAdherenceUpdatedMuTopicQueueReference&gt;**](WfmUserScheduleAdherenceUpdatedMuTopicQueueReference) |  |  [optional] |
| **activeQueuesModifiedTime** | [**Date**](Date) |  |  [optional] |
| **removedFromManagementUnit** | **Boolean** |  |  [optional] |
| **suppressOnTimeReminder** | **Boolean** |  |  [optional] |
| **nextActivityReminders** | [**List&lt;WfmUserScheduleAdherenceUpdatedMuTopicUserNextActivityReminder&gt;**](WfmUserScheduleAdherenceUpdatedMuTopicUserNextActivityReminder) |  |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
