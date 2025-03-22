# SummaryAggregationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | **String** | Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **timeZone** | **String** | Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **filter** | [**SummaryAggregateQueryFilter**](SummaryAggregateQueryFilter) | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **flattenMultivaluedDimensions** | **Boolean** | Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c') |  [optional] |
| **views** | [**List&lt;SummaryAggregationView&gt;**](SummaryAggregationView) | Custom derived metric views |  [optional] |
| **alternateTimeDimension** | [**AlternateTimeDimensionEnum**](#Enum--AlternateTimeDimensionEnum) | Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event. |  [optional] |
| **queryType** | [**QueryTypeEnum**](#Enum--QueryTypeEnum) | Query type to use. Use groupBy for all matching results, and topN for just top N results for the requested metric (group by exactly 1 dimension) |  [optional] |
| **limit** | **Integer** | How many results you want in the topN list. Only applicable for topN query type. |  [optional] |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| CONVERSATIONID | &quot;conversationId&quot; |
| ERRORTYPE | &quot;errorType&quot; |
| LANGUAGE | &quot;language&quot; |
| MEDIATYPE | &quot;mediaType&quot; |
| MESSAGETYPE | &quot;messageType&quot; |
| QUEUEID | &quot;queueId&quot; |
| SUMMARYGENERATED | &quot;summaryGenerated&quot; |
| SUMMARYID | &quot;summaryId&quot; |
| TRIGGERSOURCEID | &quot;triggerSourceId&quot; |
| TRIGGERSOURCETYPE | &quot;triggerSourceType&quot; |
| USERID | &quot;userId&quot; |
| WRAPUPCODESGENERATED | &quot;wrapupCodesGenerated&quot; |


## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| NCONVERSATIONSUMMARIES | &quot;nConversationSummaries&quot; |
| TCONVERSATIONSUMMARY | &quot;tConversationSummary&quot; |


## Enum: AlternateTimeDimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENTTIME | &quot;eventTime&quot; | 


## Enum: QueryTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GROUPBY | &quot;groupBy&quot; | 
| TOPN | &quot;topN&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.0.0_
