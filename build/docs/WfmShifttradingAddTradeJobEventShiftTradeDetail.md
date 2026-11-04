# WfmShifttradingAddTradeJobEventShiftTradeDetail


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **expirationDate** | [**Date**](Date) |  |  [optional] |
| **acceptableIntervals** | [**List&lt;WfmShifttradingAddTradeJobEventShiftTradeInterval&gt;**](WfmShifttradingAddTradeJobEventShiftTradeInterval) |  |  [optional] |
| **oneSided** | **Boolean** |  |  [optional] |
| **initiating** | [**WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide**](WfmShifttradingAddTradeJobEventShiftTradeInitiatingSide) |  |  [optional] |
| **receiving** | [**WfmShifttradingAddTradeJobEventShiftTradeReceivingSide**](WfmShifttradingAddTradeJobEventShiftTradeReceivingSide) |  |  [optional] |
| **target** | [**WfmShifttradingAddTradeJobEventShiftTradeTarget**](WfmShifttradingAddTradeJobEventShiftTradeTarget) |  |  [optional] |
| **reviewedBy** | [**WfmShifttradingAddTradeJobEventUserReference**](WfmShifttradingAddTradeJobEventUserReference) |  |  [optional] |
| **reviewedDate** | [**Date**](Date) |  |  [optional] |
| **metadata** | [**WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata**](WfmShifttradingAddTradeJobEventWfmVersionedEntityMetadata) |  |  [optional] |


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
