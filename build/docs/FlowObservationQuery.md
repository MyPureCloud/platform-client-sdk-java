---
title: FlowObservationQuery
---
## FlowObservationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **filter** | [**FlowObservationQueryFilter**](FlowObservationQueryFilter.html) | Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters |  |
| **metrics** | **List&lt;String&gt;** | Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *). |  [optional] |
| **detailMetrics** | **List&lt;String&gt;** | Metrics for which to include additional detailed observations |  [optional] |
{: class="table table-striped"}



