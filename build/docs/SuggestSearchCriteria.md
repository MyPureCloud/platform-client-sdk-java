---
title: SuggestSearchCriteria
---
## SuggestSearchCriteria


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **endValue** | <!----><!---->**String**<!----> | The end value of the range. This field is used for range search types. |  [optional] |
| **values** | <!----><!---->**List&lt;String&gt;**<!----> | A list of values for the search to match against |  [optional] |
| **startValue** | <!----><!---->**String**<!----> | The start value of the range. This field is used for range search types. |  [optional] |
| **fields** | <!----><!---->**List&lt;String&gt;**<!----> | Field names to search against |  [optional] |
| **value** | <!----><!---->**String**<!----> | A value for the search to match against |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | How to apply this search criteria against other criteria |  [optional] |
| **group** | <!----><!---->[**List&lt;SuggestSearchCriteria&gt;**](SuggestSearchCriteria.html)<!----> | Groups multiple conditions |  [optional] |
| **dateFormat** | <!----><!---->**String**<!----> | Set date format for criteria values when using date range search type.  Supports Java date format syntax, example yyyy-MM-dd'T'HH:mm:ss.SSSX. |  [optional] |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;AND&quot; | 
| OR | &quot;OR&quot; | 
| NOT | &quot;NOT&quot; | 
{: class="table table-striped"}



