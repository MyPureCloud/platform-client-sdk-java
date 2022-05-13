---
title: TranscriptAggregationQuery
---
## TranscriptAggregationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | <!----><!---->**String**<!----> | Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> | Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | <!---->[**List&lt;GroupByEnum&gt;**](#GroupByEnum)<!----> | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **filter** | <!----><!---->[**TranscriptAggregateQueryFilter**](TranscriptAggregateQueryFilter.html)<!----> | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **metrics** | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!----> | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **flattenMultivaluedDimensions** | <!----><!---->**Boolean**<!----> | Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c') |  [optional] |
| **views** | <!----><!---->[**List&lt;TranscriptAggregationView&gt;**](TranscriptAggregationView.html)<!----> | Custom derived metric views |  [optional] |
| **alternateTimeDimension** | [**AlternateTimeDimensionEnum**](#AlternateTimeDimensionEnum)<!----> | Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event. |  [optional] |
{: class="table table-striped"}


<a name="GroupByEnum"></a>

## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| ADDRESSFROM | &quot;addressFrom&quot; |
| ADDRESSTO | &quot;addressTo&quot; |
| ANI | &quot;ani&quot; |
| CHANNEL | &quot;channel&quot; |
| CONVERSATIONID | &quot;conversationId&quot; |
| DIRECTION | &quot;direction&quot; |
| DIVISIONID | &quot;divisionId&quot; |
| DNIS | &quot;dnis&quot; |
| FLOWID | &quot;flowId&quot; |
| FLOWVERSION | &quot;flowVersion&quot; |
| MEDIATYPE | &quot;mediaType&quot; |
| MESSAGETYPE | &quot;messageType&quot; |
| QUEUEID | &quot;queueId&quot; |
| TEAMID | &quot;teamId&quot; |
| TOPICID | &quot;topicId&quot; |
| USERID | &quot;userId&quot; |
{: class="table table-striped"}


<a name="MetricsEnum"></a>

## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| NTOPICCOMMUNICATIONS | &quot;nTopicCommunications&quot; |
| OCUSTOMERSENTIMENT | &quot;oCustomerSentiment&quot; |
| OSENTIMENTSCORE | &quot;oSentimentScore&quot; |
{: class="table table-striped"}


<a name="AlternateTimeDimensionEnum"></a>

## Enum: AlternateTimeDimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENTTIME | &quot;eventTime&quot; | 
{: class="table table-striped"}



