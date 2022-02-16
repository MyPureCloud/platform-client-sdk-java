---
title: EvaluationAggregationQueryMe
---
## EvaluationAggregationQueryMe


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **timeZone** | <!----><!---->**String**<!----> | Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | <!---->[**List&lt;GroupByEnum&gt;**](#GroupByEnum)<!----> | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **metrics** | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!----> | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **alternateTimeDimension** | [**AlternateTimeDimensionEnum**](#AlternateTimeDimensionEnum)<!----> | Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \&quot;eventTime\&quot; uses the actual time of the data event. |  [optional] |
| **contextId** | <!----><!---->**String**<!----> | Evaluation context Id |  [optional] |
{: class="table table-striped"}


<a name="GroupByEnum"></a>

## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| CALIBRATIONID | &quot;calibrationId&quot; |
| CONTEXTID | &quot;contextId&quot; |
| CONVERSATIONID | &quot;conversationId&quot; |
| CONVERSATIONSTART | &quot;conversationStart&quot; |
| DIVISIONID | &quot;divisionId&quot; |
| EVALUATIONCREATEDDATE | &quot;evaluationCreatedDate&quot; |
| EVALUATIONID | &quot;evaluationId&quot; |
| EVALUATIONRELEASEDATE | &quot;evaluationReleaseDate&quot; |
| EVALUATORID | &quot;evaluatorId&quot; |
| FORMID | &quot;formId&quot; |
| QUEUEID | &quot;queueId&quot; |
| RELEASED | &quot;released&quot; |
| RESCORED | &quot;rescored&quot; |
| TEAMID | &quot;teamId&quot; |
| USERID | &quot;userId&quot; |
{: class="table table-striped"}


<a name="MetricsEnum"></a>

## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| NEVALUATIONS | &quot;nEvaluations&quot; |
| NEVALUATIONSDELETED | &quot;nEvaluationsDeleted&quot; |
| NEVALUATIONSRESCORED | &quot;nEvaluationsRescored&quot; |
| OTOTALCRITICALSCORE | &quot;oTotalCriticalScore&quot; |
| OTOTALSCORE | &quot;oTotalScore&quot; |
{: class="table table-striped"}


<a name="AlternateTimeDimensionEnum"></a>

## Enum: AlternateTimeDimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CONVERSATIONSTART | &quot;conversationStart&quot; |
| EVALUATIONCREATEDDATE | &quot;evaluationCreatedDate&quot; |
| EVALUATIONRELEASEDATE | &quot;evaluationReleaseDate&quot; |
| EVENTTIME | &quot;eventTime&quot; |
{: class="table table-striped"}



