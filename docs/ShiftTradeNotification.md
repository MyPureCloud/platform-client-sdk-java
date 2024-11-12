# ShiftTradeNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **weekDate** | **String** | The start date of the schedule with which this trade is associated |  [optional] |
| **tradeId** | **String** | The ID of the shift trade |  [optional] |
| **oneSided** | **Boolean** | Whether this is a one sided shift trade |  [optional] |
| **newState** | [**NewStateEnum**](#Enum--NewStateEnum) | The new state of the shift trade, null if there was no change |  [optional] |
| **initiatingUser** | [**UserReference**](UserReference) | The user who initiated the shift trade |  [optional] |
| **initiatingShiftDate** | [**Date**](Date) | The start date and time of the initiating shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **receivingUser** | [**UserReference**](UserReference) | The user on the receiving side of this shift trade (null if not matched) |  [optional] |
| **receivingShiftDate** | [**Date**](Date) | The start date and time of the receiving shift (null if not matched or if one-sided. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: NewStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNMATCHED | &quot;Unmatched&quot; | 
| MATCHED | &quot;Matched&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
| EXPIRED | &quot;Expired&quot; | 
| CANCELED | &quot;Canceled&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
