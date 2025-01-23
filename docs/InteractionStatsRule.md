# InteractionStatsRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Name of the rule |  |
| **dimension** | [**DimensionEnum**](#Enum--DimensionEnum) | The dimension of concern. |  |
| **dimensionValue** | **String** | The value of the dimension. |  |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) | The metric to be assessed. |  |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The media type. |  |
| **numericRange** | [**NumericRangeEnum**](#Enum--NumericRangeEnum) | The comparison descriptor used against the metric's value. |  |
| **statistic** | [**StatisticEnum**](#Enum--StatisticEnum) | The statistic of concern for the metric. |  |
| **value** | **Double** | The threshold value. |  |
| **enabled** | **Boolean** | Indicates if the rule is enabled. |  |
| **inAlarm** | **Boolean** | Indicates if the rule is in alarm state. |  [optional] |
| **notificationUsers** | [**List&lt;User&gt;**](User) | The ids of users who will be notified of alarm state change. |  |
| **alertTypes** | [**List<AlertTypesEnum>**](#Enum--AlertTypesEnum) | A collection of notification methods. |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:218.0.0_
