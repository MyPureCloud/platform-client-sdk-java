# ShiftTradeResponseItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of this shift trade |  |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of this shift trade |  |
| **expirationDate** | [**Date**](Date) | When this shift trade will expire. Date time is represented as an ISO-8601 string |  [optional] |
| **initiating** | [**ShiftTradeInitiatingSideResponseItem**](ShiftTradeInitiatingSideResponseItem) | Details about the initiating user involved in this shift trade |  |
| **receiving** | [**ShiftTradeReceivingSideResponseItem**](ShiftTradeReceivingSideResponseItem) | Details about the receiving user involved in this shift trade |  [optional] |
| **acceptableIntervals** | [**List&lt;RequiredDateRange&gt;**](RequiredDateRange) | Time frames when the initiating user is willing to accept trades. Empty means giving up the shift |  |
| **oneSided** | **Boolean** | Whether this is a one-sided shift trade (e.g. the initiating user is not asking for a shift in return) |  |
| **target** | [**ShiftTradeTargetResponseItem**](ShiftTradeTargetResponseItem) | The user to whom the shift trade request was sent in a direct trade, or the user with whom a shift trade was Matched |  [optional] |
| **reviewedBy** | [**UserReference**](UserReference) | The admin who approved or denied this shift trade |  [optional] |
| **reviewedDate** | [**Date**](Date) | The timestamp of when the trade request was reviewed by an admin in ISO-8601 format |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for this shift trade |  |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNMATCHED | &quot;Unmatched&quot; | 
| MATCHED | &quot;Matched&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
| EXPIRED | &quot;Expired&quot; | 
| CANCELED | &quot;Canceled&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
