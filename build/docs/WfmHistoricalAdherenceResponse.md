---
title: WfmHistoricalAdherenceResponse
---
## WfmHistoricalAdherenceResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The query ID to listen for |  [optional] |
| **downloadUrl** | <!----><!---->**String**<!----> | Deprecated. Use downloadUrls instead. |  [optional] |
| **downloadResult** | <!----><!---->[**WfmHistoricalAdherenceResultWrapper**](WfmHistoricalAdherenceResultWrapper.html)<!----> | Result will always come via downloadUrls; however the schema is included for documentation |  [optional] |
| **downloadUrls** | <!----><!---->**List&lt;String&gt;**<!----> | The uri list to GET the results of the Historical Adherence query. For notification purposes only |  [optional] |
| **queryState** | [**QueryStateEnum**](#QueryStateEnum)<!----> | The state of the adherence query |  [optional] |
{: class="table table-striped"}


<a name="QueryStateEnum"></a>

## Enum: QueryStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



