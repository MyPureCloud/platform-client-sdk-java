---
title: PerformancePredictionResponse
---
## PerformancePredictionResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **weekDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The weekDate of the short term forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **scheduleId** | <!----><!---->**String**<!----> | The ID of the schedule this performance prediction is associated with |  |
| **downloadUrl** | <!----><!---->**String**<!----> | The url to GET the results of the performance prediction. This field is populated only if query state is 'Complete' |  [optional] |
| **downloadResult** | <!----><!---->[**PerformancePredictionOutputs**](PerformancePredictionOutputs.html)<!----> | Result will always come via downloadUrls; however the schema is included for documentation |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of the performance prediction |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



