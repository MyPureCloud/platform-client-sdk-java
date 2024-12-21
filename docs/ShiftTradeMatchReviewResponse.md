# ShiftTradeMatchReviewResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **initiatingUser** | [**ShiftTradeMatchReviewUserResponse**](ShiftTradeMatchReviewUserResponse) | Details for the initiatingUser side of the shift trade |  [optional] |
| **receivingUser** | [**ShiftTradeMatchReviewUserResponse**](ShiftTradeMatchReviewUserResponse) | Details for the receivingUser side of the shift trade |  [optional] |
| **violations** | [**List&lt;ShiftTradeMatchViolation&gt;**](ShiftTradeMatchViolation) | Constraint violations introduced after being matched that would normally disallow a trade, but which can still be overridden by the shift trade administrator |  [optional] |
| **adminReviewViolations** | [**List&lt;ShiftTradeMatchViolation&gt;**](ShiftTradeMatchViolation) | Constraint violations associated with this shift trade which require shift trade administrator review |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
