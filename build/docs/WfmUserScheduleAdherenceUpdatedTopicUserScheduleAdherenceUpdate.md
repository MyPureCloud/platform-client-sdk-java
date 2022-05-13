---
title: WfmUserScheduleAdherenceUpdatedTopicUserScheduleAdherenceUpdate
---
## WfmUserScheduleAdherenceUpdatedTopicUserScheduleAdherenceUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | <!----><!---->[**WfmUserScheduleAdherenceUpdatedTopicUserReference**](WfmUserScheduleAdherenceUpdatedTopicUserReference.html)<!----> |  |  [optional] |
| **managementUnitId** | <!----><!---->**String**<!----> |  |  [optional] |
| **team** | <!----><!---->[**WfmUserScheduleAdherenceUpdatedTopicUriReference**](WfmUserScheduleAdherenceUpdatedTopicUriReference.html)<!----> |  |  [optional] |
| **scheduledActivityCategory** | <!----><!---->**String**<!----> |  |  [optional] |
| **scheduledActivityCode** | <!----><!---->[**WfmUserScheduleAdherenceUpdatedTopicActivityCodeReference**](WfmUserScheduleAdherenceUpdatedTopicActivityCodeReference.html)<!----> |  |  [optional] |
| **systemPresence** | <!----><!---->**String**<!----> |  |  [optional] |
| **organizationSecondaryPresenceId** | <!----><!---->**String**<!----> |  |  [optional] |
| **routingStatus** | [**RoutingStatusEnum**](#RoutingStatusEnum)<!----> |  |  [optional] |
| **actualActivityCategory** | <!----><!---->**String**<!----> |  |  [optional] |
| **isOutOfOffice** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **adherenceState** | [**AdherenceStateEnum**](#AdherenceStateEnum)<!----> |  |  [optional] |
| **impact** | <!----><!---->**String**<!----> |  |  [optional] |
| **adherenceExplanation** | <!----><!---->[**WfmUserScheduleAdherenceUpdatedTopicRealTimeAdherenceExplanation**](WfmUserScheduleAdherenceUpdatedTopicRealTimeAdherenceExplanation.html)<!----> |  |  [optional] |
| **adherenceChangeTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **presenceUpdateTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **activeQueues** | <!----><!---->[**List&lt;WfmUserScheduleAdherenceUpdatedTopicQueueReference&gt;**](WfmUserScheduleAdherenceUpdatedTopicQueueReference.html)<!----> |  |  [optional] |
| **activeQueuesModifiedTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **removedFromManagementUnit** | <!----><!---->**Boolean**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="RoutingStatusEnum"></a>

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



