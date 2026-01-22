# EvaluationSearchRequestDTO


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **query** | [**List&lt;EvaluationSearchCriteriaDTO&gt;**](EvaluationSearchCriteriaDTO) |  |  |
| **aggregations** | [**List&lt;EvaluationSearchAggregationDTO&gt;**](EvaluationSearchAggregationDTO) | Aggregations to compute on the search results |  [optional] |
| **pageSize** | **Integer** | The number of results per page. For aggregation requests, must be omitted or 0. |  [optional] |
| **pageNumber** | **Integer** | The page of resources you want to retrieve |  |
| **sortOrder** | [**SortOrderEnum**](#Enum--SortOrderEnum) | The sort order for results. Include with sortBy. |  [optional] |
| **sortBy** | [**SortByEnum**](#Enum--SortByEnum) | The field in the resource that you want to sort the results by. Include with sortOrder. |  [optional] |
| **systemSubmitted** | **Boolean** | Filter for automated evaluations submitted by virtual supervisor. Defaults to false. |  [optional] |


## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;ASC&quot; | 
| DESC | &quot;DESC&quot; | 


## Enum: SortByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONVERSATIONDATE | &quot;conversationDate&quot; | 
| CREATEDDATE | &quot;createdDate&quot; | 
| SUBMITTEDDATE | &quot;submittedDate&quot; | 
| RELEASEDATE | &quot;releaseDate&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
