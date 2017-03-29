---
title: UserScheduleAdherenceUpdateNotification
---

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | [**DocumentDataV2NotificationWorkspace**](DocumentDataV2NotificationWorkspace.html) |  |  [optional] |
| **managementUnitId** | **String** |  |  [optional] |
| **scheduledActivityCategory** | **String** |  |  [optional] |
| **systemPresence** | **String** |  |  [optional] |
| **routingStatus** | [**RoutingStatusEnum**](#RoutingStatusEnum) |  |  [optional] |
| **actualActivityCategory** | **String** |  |  [optional] |
| **isOutOfOffice** | **Boolean** |  |  [optional] |
| **adherenceState** | **String** |  |  [optional] |
| **impact** | **String** |  |  [optional] |
| **adherenceChangeTime** | **String** |  |  [optional] |
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


