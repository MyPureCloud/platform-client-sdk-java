---
title: UserObservationQuery
---
## UserObservationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **filter** | <!----><!---->[**UserObservationQueryFilter**](UserObservationQueryFilter.html)<!----> | Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters |  |
| **metrics** | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!----> | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **detailMetrics** | <!---->[**List&lt;DetailMetricsEnum&gt;**](#DetailMetricsEnum)<!----> | Metrics for which to include additional detailed observations |  [optional] |
{: class="table table-striped"}


<a name="MetricsEnum"></a>

## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| OACTIVEQUEUES | &quot;oActiveQueues&quot; |
| OMEMBERQUEUES | &quot;oMemberQueues&quot; |
{: class="table table-striped"}


<a name="DetailMetricsEnum"></a>

## Enum: DetailMetricsEnum

| Name | Value |
| ---- | ----- |
| OACTIVEQUEUES | &quot;oActiveQueues&quot; |
| OMEMBERQUEUES | &quot;oMemberQueues&quot; |
{: class="table table-striped"}



