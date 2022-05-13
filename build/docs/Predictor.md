---
title: Predictor
---
## Predictor


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **queues** | <!----><!---->[**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef.html)<!----> | The queue IDs associated with the predictor. |  |
| **kpi** | <!----><!---->**String**<!----> | The KPI that the predictor attempts to maximize/minimize. |  |
| **routingTimeoutSeconds** | <!----><!---->**Integer**<!----> | Number of seconds allocated to predictive routing before attempting a different routing method. This is a value between 12 and 900 seconds. |  [optional] |
| **schedule** | <!----><!---->[**PredictorSchedule**](PredictorSchedule.html)<!----> | The predictor schedule that determines when the predictor is used for routing interactions. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The predictor state. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | DateTime indicating when the predictor was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | DateTime indicating when the predictor was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **workloadBalancingConfig** | <!----><!---->[**PredictorWorkloadBalancing**](PredictorWorkloadBalancing.html)<!----> | The predictor balancing configuration to enable workload balancing. |  [optional] |
| **errorCode** | <!----><!---->**String**<!----> | Predictor error code - optional details on why the predictor went into error state. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;Created&quot; | 
| ERROR | &quot;Error&quot; | 
| ACTIVE | &quot;Active&quot; | 
{: class="table table-striped"}



