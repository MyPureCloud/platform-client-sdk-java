---
title: UserAggregationQuery
---
## UserAggregationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  [optional] |
| **granularity** | <!----><!---->**String**<!----> | Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> | Sets the time zone for the query interval, defaults to UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | <!---->[**List&lt;GroupByEnum&gt;**](#GroupByEnum)<!----> | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **filter** | <!----><!---->[**UserAggregateQueryFilter**](UserAggregateQueryFilter.html)<!----> | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **metrics** | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!----> | Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *). |  [optional] |
| **flattenMultivaluedDimensions** | <!----><!---->**Boolean**<!----> | Flattens any multivalued dimensions used in response groups (e.g. [&#39;a&#39;,&#39;b&#39;,&#39;c&#39;]-&gt;&#39;a,b,c&#39;) |  [optional] |
| **views** | <!----><!---->[**List&lt;UserAggregationView&gt;**](UserAggregationView.html)<!----> | Custom derived metric views |  [optional] |
{: class="table table-striped"}


<a name="GroupByEnum"></a>

## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| ORGANIZATIONPRESENCEID | &quot;organizationPresenceId&quot; |
| ROUTINGSTATUS | &quot;routingStatus&quot; |
| SYSTEMPRESENCE | &quot;systemPresence&quot; |
| USERID | &quot;userId&quot; |
{: class="table table-striped"}


<a name="MetricsEnum"></a>

## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| TAGENTROUTINGSTATUS | &quot;tAgentRoutingStatus&quot; |
| TORGANIZATIONPRESENCE | &quot;tOrganizationPresence&quot; |
| TSYSTEMPRESENCE | &quot;tSystemPresence&quot; |
{: class="table table-striped"}



