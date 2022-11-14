---
title: WfmHistoricalShrinkageResponse
---
## WfmHistoricalShrinkageResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operationId** | <!----><!---->**String**<!----> | The operationId for which to listen |  [optional] |
| **downloadUrls** | <!----><!---->**List&lt;String&gt;**<!----> | The url list to GET the results of the Historical Shrinkage query. This field is populated only if query state is Complete |  [optional] |
| **downloadResult** | <!----><!---->[**HistoricalShrinkageResultListing**](HistoricalShrinkageResultListing.html)<!----> | Result will always come via downloadUrls; however the schema is included for documentation |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of the shrinkage query |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



