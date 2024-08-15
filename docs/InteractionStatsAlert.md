# InteractionStatsAlert


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Name of the rule that generated the alert |  |
| **dimension** | [**DimensionEnum**](#Enum--DimensionEnum) | The dimension of concern. |  |
| **dimensionValue** | **String** | The value of the dimension. |  |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) | The metric to be assessed. |  |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The media type. |  |
| **numericRange** | [**NumericRangeEnum**](#Enum--NumericRangeEnum) | The comparison descriptor used against the metric's value. |  |
| **statistic** | [**StatisticEnum**](#Enum--StatisticEnum) | The statistic of concern for the metric. |  |
| **value** | **Double** | The threshold value. |  |
| **ruleId** | **String** | The id of the rule. |  |
| **unread** | **Boolean** | Indicates if the alert has been read. |  |
| **startDate** | [**Date**](Date) | The date/time the alert was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **endDate** | [**Date**](Date) | The date/time the owning rule exiting in alarm status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **notificationUsers** | [**List&lt;User&gt;**](User) | The ids of users who were notified of alarm state change. |  |
| **alertTypes** | [**List<AlertTypesEnum>**](#Enum--AlertTypesEnum) | A collection of notification methods. |  |
| **ruleUri** | **String** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


## Enum: DimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| USERID | &quot;userId&quot; | 
{: class="table table-striped"}


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
{: class="table table-striped"}


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;voice&quot; | 
| CHAT | &quot;chat&quot; | 
| EMAIL | &quot;email&quot; | 
| CALLBACK | &quot;callback&quot; | 
| MESSAGE | &quot;message&quot; | 
{: class="table table-striped"}


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
{: class="table table-striped"}


## Enum: StatisticEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COUNT | &quot;count&quot; | 
| MIN | &quot;min&quot; | 
| RATIO | &quot;ratio&quot; | 
| MAX | &quot;max&quot; | 
{: class="table table-striped"}


## Enum: AlertTypesEnum

| Name | Value |
| ---- | ----- |
| SMS | &quot;SMS&quot; |
| DEVICE | &quot;DEVICE&quot; |
| EMAIL | &quot;EMAIL&quot; |
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
