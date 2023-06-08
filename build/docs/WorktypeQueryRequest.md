---
title: WorktypeQueryRequest
---
## WorktypeQueryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pageSize** | <!----><!---->**Integer**<!----> | Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. |  [optional] |
| **select** | [**SelectEnum**](#SelectEnum)<!----> | Specify the value 'Count' for this parameter in order to return only the record count. |  [optional] |
| **filters** | <!----><!---->[**List&lt;WorkitemFilter&gt;**](WorkitemFilter.html)<!----> | List of filter objects to be used in the search. |  |
| **attributes** | <!----><!---->**List&lt;String&gt;**<!----> | List of entity attributes to be retrieved in the result. |  [optional] |
| **after** | <!----><!---->**String**<!----> | The cursor that points to the end of the set of entities that has been returned. |  [optional] |
| **sort** | <!----><!---->[**WorktypeQuerySort**](WorktypeQuerySort.html)<!----> | Sort |  [optional] |
{: class="table table-striped"}


<a name="SelectEnum"></a>

## Enum: SelectEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COUNT | &quot;Count&quot; | 
{: class="table table-striped"}



