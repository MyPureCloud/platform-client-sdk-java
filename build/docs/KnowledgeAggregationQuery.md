---
title: KnowledgeAggregationQuery
---
## KnowledgeAggregationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | <!----><!---->**String**<!----> | Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> | Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  [optional] |
| **groupBy** | <!---->[**List&lt;GroupByEnum&gt;**](#GroupByEnum)<!----> | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |
| **filter** | <!----><!---->[**KnowledgeAggregateQueryFilter**](KnowledgeAggregateQueryFilter.html)<!----> | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters |  [optional] |
| **metrics** | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!----> | Behaves like a SQL SELECT clause. Only named metrics will be retrieved. |  |
| **flattenMultivaluedDimensions** | <!----><!---->**Boolean**<!----> | Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c') |  [optional] |
| **views** | <!----><!---->[**List&lt;KnowledgeAggregationView&gt;**](KnowledgeAggregationView.html)<!----> | Custom derived metric views |  [optional] |
| **alternateTimeDimension** | [**AlternateTimeDimensionEnum**](#AlternateTimeDimensionEnum)<!----> | Dimension to use as the alternative timestamp for data in the aggregate.  Choosing \"eventTime\" uses the actual time of the data event. |  [optional] |
| **queryType** | [**QueryTypeEnum**](#QueryTypeEnum)<!----> | Query type to use. Use groupBy for all matching results, and topN for just top N results for the requested metric (group by exactly 1 dimension) |  [optional] |
| **limit** | <!----><!---->**Integer**<!----> | How many results you want in the topN list. Only applicable for topN query type. |  [optional] |
{: class="table table-striped"}


<a name="GroupByEnum"></a>

## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| AGENTASSISTANTID | &quot;agentAssistantId&quot; |
| APPDEPLOYMENTID | &quot;appDeploymentId&quot; |
| APPTYPE | &quot;appType&quot; |
| CONVERSATIONCHANNELTYPE | &quot;conversationChannelType&quot; |
| CONVERSATIONID | &quot;conversationId&quot; |
| DOCUMENTENGAGEMENTTYPE | &quot;documentEngagementType&quot; |
| EXTERNALCONTACTID | &quot;externalContactId&quot; |
| FEEDBACKCATEGORY | &quot;feedbackCategory&quot; |
| FEEDBACKID | &quot;feedbackId&quot; |
| FEEDBACKRATING | &quot;feedbackRating&quot; |
| FEEDBACKRATINGTYPE | &quot;feedbackRatingType&quot; |
| FEEDBACKRATINGVALUE | &quot;feedbackRatingValue&quot; |
| FEEDBACKREASON | &quot;feedbackReason&quot; |
| FEEDBACKTYPE | &quot;feedbackType&quot; |
| HASCOMMENT | &quot;hasComment&quot; |
| HASSEARCH | &quot;hasSearch&quot; |
| KNOWLEDGEBASEDOCUMENTID | &quot;knowledgeBaseDocumentId&quot; |
| KNOWLEDGEBASEDOCUMENTVARIATIONID | &quot;knowledgeBaseDocumentVariationId&quot; |
| KNOWLEDGEBASEDOCUMENTVERSIONID | &quot;knowledgeBaseDocumentVersionId&quot; |
| KNOWLEDGEBASEID | &quot;knowledgeBaseId&quot; |
| LANGUAGECODE | &quot;languageCode&quot; |
| MEDIATYPE | &quot;mediaType&quot; |
| PRESENTEDDOCUMENTSCOUNT | &quot;presentedDocumentsCount&quot; |
| QUERYTYPE | &quot;queryType&quot; |
| QUEUEID | &quot;queueId&quot; |
| SEARCHID | &quot;searchId&quot; |
| SEARCHQUERY | &quot;searchQuery&quot; |
| SELFSERVED | &quot;selfServed&quot; |
| SESSIONID | &quot;sessionId&quot; |
| SURFACINGMETHOD | &quot;surfacingMethod&quot; |
| USERID | &quot;userId&quot; |
{: class="table table-striped"}


<a name="MetricsEnum"></a>

## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| NDISTINCTKNOWLEDGESESSIONS | &quot;nDistinctKnowledgeSessions&quot; |
| NKNOWLEDGEDOCUMENTCOPIED | &quot;nKnowledgeDocumentCopied&quot; |
| NKNOWLEDGEDOCUMENTFEEDBACK | &quot;nKnowledgeDocumentFeedback&quot; |
| NKNOWLEDGEDOCUMENTPRESENTED | &quot;nKnowledgeDocumentPresented&quot; |
| NKNOWLEDGEDOCUMENTSURFACED | &quot;nKnowledgeDocumentSurfaced&quot; |
| NKNOWLEDGEDOCUMENTVIEWED | &quot;nKnowledgeDocumentViewed&quot; |
| NKNOWLEDGESEARCH | &quot;nKnowledgeSearch&quot; |
| NKNOWLEDGESEARCHANSWERED | &quot;nKnowledgeSearchAnswered&quot; |
| NKNOWLEDGESEARCHFEEDBACK | &quot;nKnowledgeSearchFeedback&quot; |
| NKNOWLEDGESEARCHUNANSWERED | &quot;nKnowledgeSearchUnanswered&quot; |
| NKNOWLEDGESESSIONS | &quot;nKnowledgeSessions&quot; |
| OKNOWLEDGEDOCUMENTQUERY | &quot;oKnowledgeDocumentQuery&quot; |
| OKNOWLEDGEDOCUMENTQUERYSELFSERVED | &quot;oKnowledgeDocumentQuerySelfServed&quot; |
| OKNOWLEDGESEARCH | &quot;oKnowledgeSearch&quot; |
{: class="table table-striped"}


<a name="AlternateTimeDimensionEnum"></a>

## Enum: AlternateTimeDimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENTTIME | &quot;eventTime&quot; | 
{: class="table table-striped"}


<a name="QueryTypeEnum"></a>

## Enum: QueryTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GROUPBY | &quot;groupBy&quot; | 
| TOPN | &quot;topN&quot; | 
{: class="table table-striped"}



