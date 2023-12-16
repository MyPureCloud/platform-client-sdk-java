---
title: PerformancePredictionRecalculationResponse
---
## PerformancePredictionRecalculationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operationId** | <!----><!---->**String**<!----> | The operationId for which to listen |  |
| **downloadUrl** | <!----><!---->**String**<!----> | The url to GET the results of the performance prediction. This field is populated only if query state is 'Complete' |  [optional] |
| **downloadResult** | <!----><!---->[**PerformancePredictionOutputs**](PerformancePredictionOutputs.html)<!----> | Result will always come via downloadUrls; however the schema is included for documentation |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of the performance prediction |  |
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



