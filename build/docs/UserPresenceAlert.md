---
title: UserPresenceAlert
---

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Name of the rule |  |
| **presenceUser** | [**User**](User.html) | The user whose presence will be watched. |  |
| **presenceType** | [**PresenceTypeEnum**](#PresenceTypeEnum) | Indicates to which presence type the presence value belongs. |  |
| **presenceValue** | **String** | The Org&#39;s UUID or Systems enum constance indicating the presence of concern. |  |
| **presenceLimitInSeconds** | **Integer** | The number of seconds to wait before alerting based upon the user&#39;s presence. |  |
| **ruleId** | **String** | The id of the rule. |  |
| **startDate** | [**Date**](Date.html) | The date/time the alert was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  |
| **endDate** | [**Date**](Date.html) | The date/time the owning rule exiting in alarm status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **notificationUsers** | [**List&lt;User&gt;**](User.html) | The ids of users who were notified of alarm state change. |  |
| **alertTypes** | **List&lt;String&gt;** | A collection of notification methods. |  |
| **ruleUri** | **String** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="PresenceTypeEnum"></a>

## Enum: PresenceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SYSTEM | &quot;SYSTEM&quot; |
| ORGANIZATION | &quot;ORGANIZATION&quot; |
{: class="table table-striped"}


