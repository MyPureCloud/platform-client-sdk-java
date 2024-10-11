# KlaxonInteractionStatsAlertsTopicInteractionStatAlert


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **ruleId** | **String** |  |  [optional] |
| **dimension** | [**DimensionEnum**](#Enum--DimensionEnum) |  |  [optional] |
| **dimensionValue** | **String** |  |  [optional] |
| **dimensionValueName** | **String** |  |  [optional] |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **numericRange** | [**NumericRangeEnum**](#Enum--NumericRangeEnum) |  |  [optional] |
| **statistic** | [**StatisticEnum**](#Enum--StatisticEnum) |  |  [optional] |
| **value** | [**BigDecimal**](BigDecimal) |  |  [optional] |
| **unread** | **Boolean** |  |  [optional] |
| **startDate** | [**Date**](Date) |  |  [optional] |
| **endDate** | [**Date**](Date) |  |  [optional] |
| **notificationUsers** | [**List&lt;KlaxonInteractionStatsAlertsTopicNotificationUser&gt;**](KlaxonInteractionStatsAlertsTopicNotificationUser) |  |  [optional] |
| **alertTypes** | [**List<AlertTypesEnum>**](#Enum--AlertTypesEnum) |  |  [optional] |


## Enum: DimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| USERID | &quot;userId&quot; | 


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TABANDON | &quot;tAbandon&quot; | 
| TANSWERED | &quot;tAnswered&quot; | 
| TTALK | &quot;tTalk&quot; | 
| NOFFERED | &quot;nOffered&quot; | 
| THANDLE | &quot;tHandle&quot; | 
| NTRANSFERRED | &quot;nTransferred&quot; | 
| OSERVICELEVEL | &quot;oServiceLevel&quot; | 
| TWAIT | &quot;tWait&quot; | 
| THELD | &quot;tHeld&quot; | 
| TACW | &quot;tAcw&quot; | 


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;voice&quot; | 
| CHAT | &quot;chat&quot; | 
| EMAIL | &quot;email&quot; | 
| CALLBACK | &quot;callback&quot; | 
| MESSAGE | &quot;message&quot; | 


## Enum: NumericRangeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GT | &quot;gt&quot; | 
| GTE | &quot;gte&quot; | 
| LT | &quot;lt&quot; | 
| LTE | &quot;lte&quot; | 
| EQ | &quot;eq&quot; | 
| NE | &quot;ne&quot; | 


## Enum: StatisticEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COUNT | &quot;count&quot; | 
| MIN | &quot;min&quot; | 
| RATIO | &quot;ratio&quot; | 
| MAX | &quot;max&quot; | 


## Enum: AlertTypesEnum

| Name | Value |
| ---- | ----- |
| SMS | &quot;SMS&quot; |
| DEVICE | &quot;DEVICE&quot; |
| EMAIL | &quot;EMAIL&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
