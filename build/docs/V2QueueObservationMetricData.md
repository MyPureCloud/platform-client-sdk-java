# V2QueueObservationMetricData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) | The observation metric |  [optional] |
| **observations** | [**List&lt;V2QueueObservationObservation&gt;**](V2QueueObservationObservation) | List of observations sorted by timestamp in ascending order. This list may be truncated. |  [optional] |
| **truncated** | **Boolean** | Flag indicating whether the list of observations was truncated or not |  [optional] |
| **stats** | [**V2QueueObservationMetricStats**](V2QueueObservationMetricStats) |  |  [optional] |


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OALERTING | &quot;oAlerting&quot; | 
| OINTERACTING | &quot;oInteracting&quot; | 
| OWAITING | &quot;oWaiting&quot; | 
| OFLOW | &quot;oFlow&quot; | 
| OLONGESTWAITING | &quot;oLongestWaiting&quot; | 
| OLONGESTINTERACTING | &quot;oLongestInteracting&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
