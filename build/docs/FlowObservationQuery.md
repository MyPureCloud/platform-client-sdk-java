# FlowObservationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **filter** | [**FlowObservationQueryFilter**](FlowObservationQueryFilter) | Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters |  |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **detailMetrics** | [**List<DetailMetricsEnum>**](#Enum--DetailMetricsEnum) | Metrics for which to include additional detailed observations |  [optional] |


## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| OFLOW | &quot;oFlow&quot; |


## Enum: DetailMetricsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| OFLOW | &quot;oFlow&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
