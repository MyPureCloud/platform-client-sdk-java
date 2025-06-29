# KlaxonHeartBeatRulesTopicHeartBeatRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **senderId** | **String** |  |  [optional] |
| **heartBeatTimeoutInMinutes** | [**BigDecimal**](BigDecimal) |  |  [optional] |
| **enabled** | **Boolean** |  |  [optional] |
| **inAlarm** | **Boolean** |  |  [optional] |
| **notificationUsers** | [**List&lt;KlaxonHeartBeatRulesTopicNotificationUser&gt;**](KlaxonHeartBeatRulesTopicNotificationUser) |  |  [optional] |
| **alertTypes** | [**List<AlertTypesEnum>**](#Enum--AlertTypesEnum) |  |  [optional] |
| **ruleType** | [**RuleTypeEnum**](#Enum--RuleTypeEnum) |  |  [optional] |


## Enum: AlertTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SMS | &quot;SMS&quot; |
| DEVICE | &quot;DEVICE&quot; |
| EMAIL | &quot;EMAIL&quot; |


## Enum: RuleTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EDGE | &quot;EDGE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
