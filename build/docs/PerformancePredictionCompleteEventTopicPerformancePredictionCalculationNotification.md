---
title: PerformancePredictionCompleteEventTopicPerformancePredictionCalculationNotification
---
## PerformancePredictionCompleteEventTopicPerformancePredictionCalculationNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **scheduleId** | <!----><!---->**String**<!----> |  |  [optional] |
| **weekDate** | <!----><!---->**String**<!----> |  |  [optional] |
| **downloadUrl** | <!----><!---->**String**<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **error** | <!----><!---->[**PerformancePredictionCompleteEventTopicErrorBody**](PerformancePredictionCompleteEventTopicErrorBody.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



