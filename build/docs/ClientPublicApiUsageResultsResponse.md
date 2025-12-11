# ClientPublicApiUsageResultsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** |  |  [optional] |
| **queryStatus** | [**QueryStatusEnum**](#Enum--QueryStatusEnum) | The status of the query. |  |
| **errorBody** | [**ErrorBody**](ErrorBody) | The reason for the failure. This will only be present if the query is in a FAILURE state but may not be included even if the state is FAILURE |  [optional] |
| **nextUri** | **String** | The uri to get the next set of results. Will only be included if there is another page to retrieve. |  [optional] |
| **entities** | [**List&lt;ClientPublicApiUsage&gt;**](ClientPublicApiUsage) | The results of the query. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: QueryStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUEUED | &quot;Queued&quot; | 
| RUNNING | &quot;Running&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 
| FAILED | &quot;Failed&quot; | 
| CANCELLED | &quot;Cancelled&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
