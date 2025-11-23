# AgentCopilotAggregationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | **String** | Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **timeZone** | **String** | Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **filter** | [**AgentCopilotAggregateQueryFilter**](AgentCopilotAggregateQueryFilter) | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **flattenMultivaluedDimensions** | **Boolean** | Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c') |  [optional] |
| **views** | [**List&lt;AgentCopilotAggregationView&gt;**](AgentCopilotAggregationView) | Custom derived metric views |  [optional] |
| **alternateTimeDimension** | [**AlternateTimeDimensionEnum**](#Enum--AlternateTimeDimensionEnum) | Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event. |  [optional] |
| **queryType** | [**QueryTypeEnum**](#Enum--QueryTypeEnum) | Query type to use. Use groupBy for all matching results, and topN/bottomN for N results ordered by the sortMetric. Default is groupBy. |  [optional] |
| **sortMetric** | [**AgentCopilotAggregationSort**](AgentCopilotAggregationSort) | Required when requesting multiple metrics. Only applicable for topN/bottomN query type. |  [optional] |
| **limit** | **Integer** | How many results you want in an ordered list. Only applicable for topN/bottomN query type. |  [optional] |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AGENTASSISTANTID | &quot;agentAssistantId&quot; |
| CANNEDRESPONSEID | &quot;cannedResponseId&quot; |
| CANNEDRESPONSELIBRARYID | &quot;cannedResponseLibraryId&quot; |
| CHUNKCOUNT | &quot;chunkCount&quot; |
| CONVERSATIONID | &quot;conversationId&quot; |
| ENGAGEMENTTYPE | &quot;engagementType&quot; |
| EXTERNALCONTACTID | &quot;externalContactId&quot; |
| FEEDBACKRATING | &quot;feedbackRating&quot; |
| HASANSWERHIGHLIGHT | &quot;hasAnswerHighlight&quot; |
| HASGENERATEDANSWER | &quot;hasGeneratedAnswer&quot; |
| KNOWLEDGEBASEDOCUMENTID | &quot;knowledgeBaseDocumentId&quot; |
| KNOWLEDGEBASEDOCUMENTVERSIONID | &quot;knowledgeBaseDocumentVersionId&quot; |
| MEDIATYPE | &quot;mediaType&quot; |
| MESSAGEID | &quot;messageId&quot; |
| QUEUEID | &quot;queueId&quot; |
| SCRIPTID | &quot;scriptId&quot; |
| SCRIPTPAGEID | &quot;scriptPageId&quot; |
| SEARCHID | &quot;searchId&quot; |
| STATE | &quot;state&quot; |
| SUGGESTIONID | &quot;suggestionId&quot; |
| SUGGESTIONTYPE | &quot;suggestionType&quot; |
| TRIGGERTYPE | &quot;triggerType&quot; |
| USERID | &quot;userId&quot; |
| UTTERANCEID | &quot;utteranceId&quot; |


## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NCANNEDRESPONSESUGGESTIONS | &quot;nCannedResponseSuggestions&quot; |
| NDISTINCTSUGGESTIONS | &quot;nDistinctSuggestions&quot; |
| NKNOWLEDGEANSWERSUGGESTIONS | &quot;nKnowledgeAnswerSuggestions&quot; |
| NKNOWLEDGEARTICLESUGGESTIONS | &quot;nKnowledgeArticleSuggestions&quot; |
| NKNOWLEDGESEARCHSUGGESTIONS | &quot;nKnowledgeSearchSuggestions&quot; |
| NSCRIPTSUGGESTIONS | &quot;nScriptSuggestions&quot; |


## Enum: AlternateTimeDimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENTTIME | &quot;eventTime&quot; | 


## Enum: QueryTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BOTTOMN | &quot;bottomN&quot; | 
| GROUPBY | &quot;groupBy&quot; | 
| TOPN | &quot;topN&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
