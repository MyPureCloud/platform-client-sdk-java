# SearchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sortOrder** | [**SortOrderEnum**](#Enum--SortOrderEnum) | The sort order for results |  [optional] |
| **sortBy** | **String** | The field in the resource that you want to sort the results by |  [optional] |
| **pageSize** | **Integer** | The number of results per page |  [optional] |
| **pageNumber** | **Integer** | The page of resources you want to retrieve |  [optional] |
| **sort** | [**List&lt;SearchSort&gt;**](SearchSort) | Multi-value sort order, list of multiple sort values |  [optional] |
| **returnFields** | **List&lt;String&gt;** | A List of strings.  Possible values are any field in the resource you are searching on.  The other option is to use ALL_FIELDS, when this is provided all fields in the resource will be returned in the search results. |  [optional] |
| **expand** | **List&lt;String&gt;** | Provides more details about a specified resource |  [optional] |
| **types** | **List&lt;String&gt;** | Resource domain type to search |  |
| **query** | [**List&lt;SearchCriteria&gt;**](SearchCriteria) | The search criteria |  [optional] |
| **aggregations** | [**List&lt;SearchAggregation&gt;**](SearchAggregation) | Aggregation criteria |  [optional] |


## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;ASC&quot; | 
| DESC | &quot;DESC&quot; | 
| SCORE | &quot;SCORE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
