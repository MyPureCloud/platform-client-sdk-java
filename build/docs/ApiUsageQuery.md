---
title: ApiUsageQuery
---
## ApiUsageQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | [**GranularityEnum**](#GranularityEnum)<!----> | Date granularity of the results |  [optional] |
| **groupBy** | <!---->[**List&lt;GroupByEnum&gt;**](#GroupByEnum)<!----> | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **metrics** | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!----> | Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *). |  [optional] |
{: class="table table-striped"}


<a name="GranularityEnum"></a>

## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAY | &quot;Day&quot; | 
| WEEK | &quot;Week&quot; | 
| MONTH | &quot;Month&quot; | 
{: class="table table-striped"}


<a name="GroupByEnum"></a>

## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| OAUTHCLIENTID | &quot;OAuthClientId&quot; |
| ORGANIZATIONID | &quot;OrganizationId&quot; |
| USERID | &quot;UserId&quot; |
| TEMPLATEURI | &quot;TemplateUri&quot; |
| HTTPMETHOD | &quot;HttpMethod&quot; |
{: class="table table-striped"}


<a name="MetricsEnum"></a>

## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| STATUS200 | &quot;Status200&quot; |
| STATUS300 | &quot;Status300&quot; |
| STATUS400 | &quot;Status400&quot; |
| STATUS500 | &quot;Status500&quot; |
| STATUS429 | &quot;Status429&quot; |
| REQUESTS | &quot;Requests&quot; |
{: class="table table-striped"}



