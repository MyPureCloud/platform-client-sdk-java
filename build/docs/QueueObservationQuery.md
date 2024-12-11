# QueueObservationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **filter** | [**QueueObservationQueryFilter**](QueueObservationQueryFilter) | Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters |  |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **detailMetrics** | [**List<DetailMetricsEnum>**](#Enum--DetailMetricsEnum) | Metrics for which to include additional detailed observations |  [optional] |


## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| OACTIVEUSERS | &quot;oActiveUsers&quot; |
| OALERTING | &quot;oAlerting&quot; |
| OINTERACTING | &quot;oInteracting&quot; |
| OMEMBERUSERS | &quot;oMemberUsers&quot; |
| OOFFQUEUEUSERS | &quot;oOffQueueUsers&quot; |
| OONQUEUEUSERS | &quot;oOnQueueUsers&quot; |
| OUSERPRESENCES | &quot;oUserPresences&quot; |
| OUSERROUTINGSTATUSES | &quot;oUserRoutingStatuses&quot; |
| OWAITING | &quot;oWaiting&quot; |


## Enum: DetailMetricsEnum

| Name | Value |
| ---- | ----- |
| OACTIVEUSERS | &quot;oActiveUsers&quot; |
| OALERTING | &quot;oAlerting&quot; |
| OINTERACTING | &quot;oInteracting&quot; |
| OMEMBERUSERS | &quot;oMemberUsers&quot; |
| OOFFQUEUEUSERS | &quot;oOffQueueUsers&quot; |
| OONQUEUEUSERS | &quot;oOnQueueUsers&quot; |
| OUSERPRESENCES | &quot;oUserPresences&quot; |
| OUSERROUTINGSTATUSES | &quot;oUserRoutingStatuses&quot; |
| OWAITING | &quot;oWaiting&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:216.0.0_
