---
title: HeartBeatRuleNotification
---
## HeartBeatRuleNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **senderId** | **String** |  |  [optional] |
| **heartBeatTimeoutInMinutes** | [**BigDecimal**](BigDecimal.html) |  |  [optional] |
| **enabled** | **Boolean** |  |  [optional] |
| **inAlarm** | **Boolean** |  |  [optional] |
| **notificationUsers** | [**List&lt;HeartBeatAlertNotificationNotificationUsers&gt;**](HeartBeatAlertNotificationNotificationUsers.html) |  |  [optional] |
| **alertTypes** | **List&lt;String&gt;** |  |  [optional] |
| **ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) |  |  [optional] |
{: class="table table-striped"}


<a name="RuleTypeEnum"></a>

## Enum: RuleTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EDGE | &quot;EDGE&quot; |
{: class="table table-striped"}



