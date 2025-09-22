# LocationSearchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sortOrder** | [**SortOrderEnum**](#Enum--SortOrderEnum) | The sort order for results |  [optional] |
| **sortBy** | **String** | The field in the resource that you want to sort the results by |  [optional] |
| **pageSize** | **Integer** | The number of results per page |  [optional] |
| **pageNumber** | **Integer** | The page of resources you want to retrieve |  [optional] |
| **sort** | [**List&lt;SearchSort&gt;**](SearchSort) | Multi-value sort order, list of multiple sort values |  [optional] |
| **expand** | **List&lt;String&gt;** | Provides more details about a specified resource |  [optional] |
| **query** | [**List&lt;LocationSearchCriteria&gt;**](LocationSearchCriteria) |  |  [optional] |


## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;ASC&quot; | 
| DESC | &quot;DESC&quot; | 
| SCORE | &quot;SCORE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
