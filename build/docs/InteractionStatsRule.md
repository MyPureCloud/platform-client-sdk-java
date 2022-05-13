---
title: InteractionStatsRule
---
## InteractionStatsRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | Name of the rule |  |
| **dimension** | [**DimensionEnum**](#DimensionEnum)<!----> | The dimension of concern. |  |
| **dimensionValue** | <!----><!---->**String**<!----> | The value of the dimension. |  |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> | The metric to be assessed. |  |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | The media type. |  |
| **numericRange** | [**NumericRangeEnum**](#NumericRangeEnum)<!----> | The comparison descriptor used against the metric's value. |  |
| **statistic** | [**StatisticEnum**](#StatisticEnum)<!----> | The statistic of concern for the metric. |  |
| **value** | <!----><!---->**Double**<!----> | The threshold value. |  |
| **enabled** | <!----><!---->**Boolean**<!----> | Indicates if the rule is enabled. |  |
| **inAlarm** | <!----><!---->**Boolean**<!----> | Indicates if the rule is in alarm state. |  [optional] |
| **notificationUsers** | <!----><!---->[**List&lt;User&gt;**](User.html)<!----> | The ids of users who will be notified of alarm state change. |  |
| **alertTypes** | <!---->[**List&lt;AlertTypesEnum&gt;**](#AlertTypesEnum)<!----> | A collection of notification methods. |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="DimensionEnum"></a>

## Enum: DimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| USERID | &quot;userId&quot; | 
{: class="table table-striped"}


<a name="MetricEnum"></a>

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


<a name="MediaTypeEnum"></a>

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


<a name="NumericRangeEnum"></a>

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


<a name="StatisticEnum"></a>

## Enum: StatisticEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COUNT | &quot;count&quot; | 
| MIN | &quot;min&quot; | 
| RATIO | &quot;ratio&quot; | 
| MAX | &quot;max&quot; | 
{: class="table table-striped"}


<a name="AlertTypesEnum"></a>

## Enum: AlertTypesEnum

| Name | Value |
| ---- | ----- |
| SMS | &quot;SMS&quot; |
| DEVICE | &quot;DEVICE&quot; |
| EMAIL | &quot;EMAIL&quot; |
{: class="table table-striped"}



