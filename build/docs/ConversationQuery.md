---
title: ConversationQuery
---
## ConversationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversationFilters** | <!----><!---->[**List&lt;ConversationDetailQueryFilter&gt;**](ConversationDetailQueryFilter.html)<!----> | Filters that target conversation-level data |  [optional] |
| **segmentFilters** | <!----><!---->[**List&lt;SegmentDetailQueryFilter&gt;**](SegmentDetailQueryFilter.html)<!----> | Filters that target individual segments within a conversation |  [optional] |
| **evaluationFilters** | <!----><!---->[**List&lt;EvaluationDetailQueryFilter&gt;**](EvaluationDetailQueryFilter.html)<!----> | Filters that target evaluations |  [optional] |
| **surveyFilters** | <!----><!---->[**List&lt;SurveyDetailQueryFilter&gt;**](SurveyDetailQueryFilter.html)<!----> | Filters that target surveys |  [optional] |
| **resolutionFilters** | <!----><!---->[**List&lt;ResolutionDetailQueryFilter&gt;**](ResolutionDetailQueryFilter.html)<!----> | Filters that target resolutions |  [optional] |
| **order** | [**OrderEnum**](#OrderEnum)<!----> | Sort the result set in ascending/descending order. Default is ascending |  [optional] |
| **orderBy** | [**OrderByEnum**](#OrderByEnum)<!----> | Specify which data element within the result set to use for sorting. The options  to use as a basis for sorting the results: conversationStart, segmentStart, and segmentEnd. If not specified, the default is conversationStart |  [optional] |
| **interval** | <!----><!---->**String**<!----> | Specifies the date and time range of data being queried. Results will only include conversations that started on a day touched by the interval. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **aggregations** | <!----><!---->[**List&lt;AnalyticsQueryAggregation&gt;**](AnalyticsQueryAggregation.html)<!----> | Include faceted search and aggregate roll-ups describing your search results. This does not function as a filter, but rather, summary data about the data matching your filters |  [optional] |
| **paging** | <!----><!---->[**PagingSpec**](PagingSpec.html)<!----> | Page size and number to control iterating through large result sets. Default page size is 25 |  [optional] |
{: class="table table-striped"}


<a name="OrderEnum"></a>

## Enum: OrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;asc&quot; | 
| DESC | &quot;desc&quot; | 
{: class="table table-striped"}


<a name="OrderByEnum"></a>

## Enum: OrderByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONVERSATIONSTART | &quot;conversationStart&quot; | 
| CONVERSATIONEND | &quot;conversationEnd&quot; | 
| SEGMENTSTART | &quot;segmentStart&quot; | 
| SEGMENTEND | &quot;segmentEnd&quot; | 
{: class="table table-striped"}



