---
title: HeartBeatAlert
---
## HeartBeatAlert


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Name of the rule |  |
| **senderId** | **String** | The value that identifies the sender of the heartbeat. |  |
| **heartBeatTimeoutInMinutes** | **Integer** | The number of minutes to wait before alerting missing heartbeats. |  |
| **ruleId** | **String** | The id of the rule. |  |
| **startDate** | [**Date**](Date.html) | The date/time the alert was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  |
| **endDate** | [**Date**](Date.html) | The date/time the owning rule exiting in alarm status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **notificationUsers** | [**List&lt;User&gt;**](User.html) | The ids of users who were notified of alarm state change. |  |
| **alertTypes** | **List&lt;String&gt;** | A collection of notification methods. |  |
| **ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) | The type of heartbeat rule that generated the alert |  |
| **ruleUri** | **String** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="RuleTypeEnum"></a>

## Enum: RuleTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EDGE | &quot;EDGE&quot; |
{: class="table table-striped"}


