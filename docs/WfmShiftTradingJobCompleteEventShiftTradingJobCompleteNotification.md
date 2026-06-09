# WfmShiftTradingJobCompleteEventShiftTradingJobCompleteNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **trade** | [**WfmShiftTradingJobCompleteEventTradeEntity**](WfmShiftTradingJobCompleteEventTradeEntity) |  |  [optional] |
| **weekSummaries** | [**WfmShiftTradingJobCompleteEventWeekSummaryList**](WfmShiftTradingJobCompleteEventWeekSummaryList) |  |  [optional] |
| **downloadUrl** | **String** |  |  [optional] |
| **error** | [**WfmShiftTradingJobCompleteEventErrorBody**](WfmShiftTradingJobCompleteEventErrorBody) |  |  [optional] |


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
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:255.0.0_
