# AsyncConversationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversationFilters** | [**List&lt;ConversationDetailQueryFilter&gt;**](ConversationDetailQueryFilter) | Filters that target conversation-level data |  [optional] |
| **segmentFilters** | [**List&lt;SegmentDetailQueryFilter&gt;**](SegmentDetailQueryFilter) | Filters that target individual segments within a conversation |  [optional] |
| **evaluationFilters** | [**List&lt;EvaluationDetailQueryFilter&gt;**](EvaluationDetailQueryFilter) | Filters that target evaluations |  [optional] |
| **surveyFilters** | [**List&lt;SurveyDetailQueryFilter&gt;**](SurveyDetailQueryFilter) | Filters that target surveys |  [optional] |
| **resolutionFilters** | [**List&lt;ResolutionDetailQueryFilter&gt;**](ResolutionDetailQueryFilter) | Filters that target resolutions |  [optional] |
| **order** | [**OrderEnum**](#Enum--OrderEnum) | Sort the result set in ascending/descending order. Default is ascending |  [optional] |
| **orderBy** | [**OrderByEnum**](#Enum--OrderByEnum) | Specify which data element within the result set to use for sorting. The options  to use as a basis for sorting the results: conversationStart, segmentStart, and segmentEnd. If not specified, the default is conversationStart |  [optional] |
| **interval** | **String** | Specifies the date and time range of data being queried. Results will include all conversations that had activity during the interval. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **limit** | **Integer** | Specify number of results to be returned |  [optional] |
| **startOfDayIntervalMatching** | **Boolean** | Add a filter to only include conversations that started after the beginning of the interval start date (UTC) |  [optional] |


## Enum: OrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;asc&quot; | 
| DESC | &quot;desc&quot; | 
| UNORDERED | &quot;unordered&quot; | 


## Enum: OrderByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONVERSATIONSTART | &quot;conversationStart&quot; | 
| CONVERSATIONEND | &quot;conversationEnd&quot; | 
| SEGMENTSTART | &quot;segmentStart&quot; | 
| SEGMENTEND | &quot;segmentEnd&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
