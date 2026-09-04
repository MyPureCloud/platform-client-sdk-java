# WfmShiftTradingJobCompleteEventTradeEntity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **expirationDate** | **String** |  |  [optional] |
| **acceptableIntervals** | [**List&lt;WfmShiftTradingJobCompleteEventWfmDateTimeInterval&gt;**](WfmShiftTradingJobCompleteEventWfmDateTimeInterval) |  |  [optional] |
| **oneSided** | **Boolean** |  |  [optional] |
| **initiating** | [**WfmShiftTradingJobCompleteEventTradeSide**](WfmShiftTradingJobCompleteEventTradeSide) |  |  [optional] |
| **receiving** | [**WfmShiftTradingJobCompleteEventTradeSide**](WfmShiftTradingJobCompleteEventTradeSide) |  |  [optional] |
| **targetUserId** | **String** |  |  [optional] |
| **reviewedBy** | **String** |  |  [optional] |
| **reviewedDate** | **String** |  |  [optional] |
| **metadata** | [**WfmShiftTradingJobCompleteEventWfmVersionMetadata**](WfmShiftTradingJobCompleteEventWfmVersionMetadata) |  |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| UNMATCHED | &quot;Unmatched&quot; | 
| MATCHED | &quot;Matched&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
| EXPIRED | &quot;Expired&quot; | 
| CANCELED | &quot;Canceled&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
