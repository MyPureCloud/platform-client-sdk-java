---
title: DocumentationV2SearchRequest
---
## DocumentationV2SearchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sortOrder** | [**SortOrderEnum**](#SortOrderEnum)<!----> | The sort order for results |  [optional] |
| **sortBy** | <!----><!---->**String**<!----> | The field in the resource that you want to sort the results by |  [optional] |
| **pageSize** | <!----><!---->**Integer**<!----> | The number of results per page |  [optional] |
| **pageNumber** | <!----><!---->**Integer**<!----> | The page of resources you want to retrieve |  [optional] |
| **sort** | <!----><!---->[**List&lt;SearchSort&gt;**](SearchSort.html)<!----> | Multi-value sort order, list of multiple sort values |  [optional] |
| **types** | <!----><!---->**List&lt;String&gt;**<!----> | Resource domain type to search |  |
| **query** | <!----><!---->[**List&lt;DocumentationV2SearchCriteria&gt;**](DocumentationV2SearchCriteria.html)<!----> | The search criteria |  [optional] |
| **aggregations** | <!----><!---->[**List&lt;DocumentationV2SearchAggregation&gt;**](DocumentationV2SearchAggregation.html)<!----> | Aggregation criteria |  [optional] |
{: class="table table-striped"}


<a name="SortOrderEnum"></a>

## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;ASC&quot; | 
| DESC | &quot;DESC&quot; | 
| SCORE | &quot;SCORE&quot; | 
{: class="table table-striped"}



