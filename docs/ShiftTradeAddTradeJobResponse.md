# ShiftTradeAddTradeJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the job |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the job |  |
| **downloadUrl** | **String** | The URL where completed results might be available for download in case the result body for that job type is too large |  [optional] |
| **error** | [**ErrorBody**](ErrorBody) | Any error information, only set if the status == 'Error' |  [optional] |
| **addTradeResult** | [**ShiftTradeResponseItem**](ShiftTradeResponseItem) | Results for AddTrade job type |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| ERROR | &quot;Error&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADDTRADE | &quot;AddTrade&quot; | 
| BULKUPDATETRADESTATES | &quot;BulkUpdateTradeStates&quot; | 
| EVALUATETRADES | &quot;EvaluateTrades&quot; | 
| MATCHTRADE | &quot;MatchTrade&quot; | 
| QUERYAGENTTRADES | &quot;QueryAgentTrades&quot; | 
| QUERYTRADES | &quot;QueryTrades&quot; | 
| QUERYWEEKSUMMARIES | &quot;QueryWeekSummaries&quot; | 
| SEARCHUNMATCHEDTRADES | &quot;SearchUnmatchedTrades&quot; | 
| UPDATETRADE | &quot;UpdateTrade&quot; | 
| UPDATETRADESTATE | &quot;UpdateTradeState&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
