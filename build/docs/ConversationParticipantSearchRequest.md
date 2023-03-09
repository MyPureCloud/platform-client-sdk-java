---
title: ConversationParticipantSearchRequest
---
## ConversationParticipantSearchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sortOrder** | [**SortOrderEnum**](#SortOrderEnum)<!----> | The sort order for results |  [optional] |
| **sortBy** | <!----><!---->**String**<!----> | The field in the resource that you want to sort the results by |  [optional] |
| **sort** | <!----><!---->[**List&lt;SearchSort&gt;**](SearchSort.html)<!----> | Multi-value sort order, list of multiple sort values |  [optional] |
| **returnFields** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **query** | <!----><!---->[**List&lt;ConversationParticipantSearchCriteria&gt;**](ConversationParticipantSearchCriteria.html)<!----> |  |  [optional] |
| **cursor** | <!----><!---->**String**<!----> |  |  [optional] |
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



