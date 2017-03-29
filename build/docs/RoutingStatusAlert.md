---
title: RoutingStatusAlert
---

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Name of the rule |  |
| **agent** | [**User**](User.html) | The agent whose routing status will be watched. |  |
| **routingStatus** | [**RoutingStatusEnum**](#RoutingStatusEnum) | The routing status on which to alert. |  |
| **routingLimitInSeconds** | **Integer** | The number of seconds to wait before alerting based upon the agent&#39;s routing status. |  |
| **ruleId** | **String** | The id of the rule. |  |
| **startDate** | [**Date**](Date.html) | The date/time the alert was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  |
| **endDate** | [**Date**](Date.html) | The date/time the owning rule exiting in alarm status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **notificationUsers** | [**List&lt;User&gt;**](User.html) | The ids of users who were notified of alarm state change. |  |
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


