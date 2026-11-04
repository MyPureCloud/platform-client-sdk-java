# WfmShifttradingUpdateTradeJobEventShiftTradeDetail


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **expirationDate** | [**Date**](Date) |  |  [optional] |
| **acceptableIntervals** | [**List&lt;WfmShifttradingUpdateTradeJobEventShiftTradeInterval&gt;**](WfmShifttradingUpdateTradeJobEventShiftTradeInterval) |  |  [optional] |
| **oneSided** | **Boolean** |  |  [optional] |
| **initiating** | [**WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide**](WfmShifttradingUpdateTradeJobEventShiftTradeInitiatingSide) |  |  [optional] |
| **receiving** | [**WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide**](WfmShifttradingUpdateTradeJobEventShiftTradeReceivingSide) |  |  [optional] |
| **target** | [**WfmShifttradingUpdateTradeJobEventShiftTradeTarget**](WfmShifttradingUpdateTradeJobEventShiftTradeTarget) |  |  [optional] |
| **reviewedBy** | [**WfmShifttradingUpdateTradeJobEventUserReference**](WfmShifttradingUpdateTradeJobEventUserReference) |  |  [optional] |
| **reviewedDate** | [**Date**](Date) |  |  [optional] |
| **metadata** | [**WfmShifttradingUpdateTradeJobEventWfmVersionedEntityMetadata**](WfmShifttradingUpdateTradeJobEventWfmVersionedEntityMetadata) |  |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
