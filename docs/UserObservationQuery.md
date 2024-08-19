# UserObservationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **filter** | [**UserObservationQueryFilter**](UserObservationQueryFilter) | Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters |  |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **detailMetrics** | [**List<DetailMetricsEnum>**](#Enum--DetailMetricsEnum) | Metrics for which to include additional detailed observations |  [optional] |
{: class="table table-striped"}


## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| OACTIVEQUEUES | &quot;oActiveQueues&quot; |
| OMEMBERQUEUES | &quot;oMemberQueues&quot; |
{: class="table table-striped"}


## Enum: DetailMetricsEnum

| Name | Value |
| ---- | ----- |
| OACTIVEQUEUES | &quot;oActiveQueues&quot; |
| OMEMBERQUEUES | &quot;oMemberQueues&quot; |
{: class="table table-striped"}



