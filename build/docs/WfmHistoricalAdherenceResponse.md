---
title: WfmHistoricalAdherenceResponse
---
## WfmHistoricalAdherenceResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The query ID to listen for |  [optional] |
| **downloadUrl** | <!----><!---->**String**<!----> | The uri to query to GET the results of the Historical Adherence query. This will return unpopulated but will be populated in the notification |  [optional] |
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



