---
title: QueueObservationQuery
---
## QueueObservationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **filter** | <!----><!---->[**QueueObservationQueryFilter**](QueueObservationQueryFilter.html)<!----> | Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters |  |
| **metrics** | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!----> | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **detailMetrics** | <!---->[**List&lt;DetailMetricsEnum&gt;**](#DetailMetricsEnum)<!----> | Metrics for which to include additional detailed observations |  [optional] |
{: class="table table-striped"}


<a name="MetricsEnum"></a>

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
{: class="table table-striped"}


<a name="DetailMetricsEnum"></a>

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
{: class="table table-striped"}



