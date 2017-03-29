---
title: HeartBeatRule
---

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Name of the rule |  |
| **senderId** | **String** | The value that identifies the sender of the heartbeat. |  |
| **heartBeatTimeoutInMinutes** | **Integer** | The number of minutes to wait before alerting missing heartbeats. |  |
| **enabled** | **Boolean** | Indicates if the rule is enabled. |  |
| **inAlarm** | **Boolean** | Indicates if the rule is in alarm state. |  [optional] |
| **notificationUsers** | [**List&lt;User&gt;**](User.html) | The ids of users who will be notified of alarm state change. |  |
| **alertTypes** | **List&lt;String&gt;** | A collection of notification methods. |  |
| **ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) | The type of system the will be generating the heartbeat. |  |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="RuleTypeEnum"></a>

## Enum: RuleTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EDGE | &quot;EDGE&quot; |
{: class="table table-striped"}


