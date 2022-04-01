---
title: ResponseAssetSearchRequest
---
## ResponseAssetSearchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pageSize** | <!----><!---->**Integer**<!----> | The number of results per page. Default: 25, Maximum: 100. |  [optional] |
| **pageNumber** | <!----><!---->**Integer**<!----> | The page of resources you want to retrieve |  [optional] |
| **sortOrder** | [**SortOrderEnum**](#SortOrderEnum)<!----> | The sort order for results |  [optional] |
| **sortBy** | <!----><!---->**String**<!----> | The field in the resource that you want to sort the results by |  [optional] |
| **query** | <!----><!---->[**List&lt;ResponseAssetFilter&gt;**](ResponseAssetFilter.html)<!----> | Filter the query results. |  |
{: class="table table-striped"}


<a name="SortOrderEnum"></a>

## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ASC | &quot;ASC&quot; |
| DESC | &quot;DESC&quot; |
{: class="table table-striped"}



