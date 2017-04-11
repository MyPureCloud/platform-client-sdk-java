---
title: RoutingStatusRule
---
## RoutingStatusRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Name of the rule |  |
| **agent** | [**User**](User.html) | The agent whose routing status will be watched. |  |
| **routingStatus** | [**RoutingStatusEnum**](#RoutingStatusEnum) | The routing status on which to alert. |  |
| **routingLimitInSeconds** | **Integer** | The number of seconds to wait before alerting based upon the agent&#39;s routing status. |  |
| **enabled** | **Boolean** | Indicates if the rule is enabled. |  |
| **inAlarm** | **Boolean** | Indicates if the rule is in alarm state. |  [optional] |
| **notificationUsers** | [**List&lt;User&gt;**](User.html) | The ids of users who will be notified of alarm state change. |  |
| **alertTypes** | **List&lt;String&gt;** | A collection of notification methods. |  |
| **selfUri** | **String** | The URI for this object |  [optional] |
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


