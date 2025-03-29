# UserObservationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **filter** | [**UserObservationQueryFilter**](UserObservationQueryFilter) | Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters |  |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **detailMetrics** | [**List<DetailMetricsEnum>**](#Enum--DetailMetricsEnum) | Metrics for which to include additional detailed observations |  [optional] |


## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| OACTIVEQUEUES | &quot;oActiveQueues&quot; |
| OMEMBERQUEUES | &quot;oMemberQueues&quot; |


## Enum: DetailMetricsEnum

| Name | Value |
| ---- | ----- |
| OACTIVEQUEUES | &quot;oActiveQueues&quot; |
| OMEMBERQUEUES | &quot;oMemberQueues&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:222.1.0_
