---
title: PerformancePredictionRecalculationCompleteEventTopicPerformancePredictionUserRecalculationNotification
---
## PerformancePredictionRecalculationCompleteEventTopicPerformancePredictionUserRecalculationNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **downloadUrl** | <!----><!---->**String**<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **error** | <!----><!---->[**PerformancePredictionRecalculationCompleteEventTopicErrorBody**](PerformancePredictionRecalculationCompleteEventTopicErrorBody.html)<!----> |  |  [optional] |
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



