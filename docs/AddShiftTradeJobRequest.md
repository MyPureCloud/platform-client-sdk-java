# AddShiftTradeJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **initiatingShift** | [**InitiatingShiftRequestItem**](InitiatingShiftRequestItem) | The shift that the initiating user wants to give up in this trade |  |
| **acceptableIntervals** | [**List&lt;RequiredDateRange&gt;**](RequiredDateRange) | Time frames when the initiating user is willing to accept a shift in exchange. Empty means giving up the shift without taking on another one |  [optional] |
| **target** | [**ShiftTradeTargetRequestItem**](ShiftTradeTargetRequestItem) | Optional shift trade target, can be used for example for direct user to user trade |  [optional] |
| **expirationDate** | [**Date**](Date) | When this shift trade will expire. Date time is represented as an ISO-8601 string |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
