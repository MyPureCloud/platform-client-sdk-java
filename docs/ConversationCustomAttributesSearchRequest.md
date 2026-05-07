# ConversationCustomAttributesSearchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **expand** | **List&lt;String&gt;** | Expand your search with bulk lookups |  [optional] |
| **pageSize** | **Integer** | The number of results per page |  [optional] |
| **pageNumber** | **Integer** | The page of resources you want to retrieve |  [optional] |
| **sort** | [**List&lt;SearchSort&gt;**](SearchSort) | Multi-value sort order, list of multiple sort values |  [optional] |
| **sortBy** | **String** | The field in the resource that you want to sort the results by |  [optional] |
| **sortOrder** | [**SortOrderEnum**](#Enum--SortOrderEnum) | The sort order for results |  [optional] |


## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;ASC&quot; | 
| DESC | &quot;DESC&quot; | 
| SCORE | &quot;SCORE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:253.1.0_
