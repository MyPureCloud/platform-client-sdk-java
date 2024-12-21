# WfmHistoricalAdherenceResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The query ID to listen for |  [optional] |
| **downloadUrl** | **String** | Deprecated. Use downloadUrls instead. |  [optional] |
| **downloadResult** | [**WfmHistoricalAdherenceResultWrapper**](WfmHistoricalAdherenceResultWrapper) | Result will always come via downloadUrls; however the schema is included for documentation |  [optional] |
| **downloadUrls** | **List&lt;String&gt;** | The uri list to GET the results of the Historical Adherence query. For notification purposes only |  [optional] |
| **queryState** | [**QueryStateEnum**](#Enum--QueryStateEnum) | The state of the adherence query |  [optional] |


## Enum: QueryStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
