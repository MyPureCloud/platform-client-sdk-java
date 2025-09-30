# MatchShiftTradeResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **trade** | [**ShiftTradeResponse**](ShiftTradeResponse) | The associated shift trade |  [optional] |
| **violations** | [**List&lt;ShiftTradeMatchViolation&gt;**](ShiftTradeMatchViolation) | Constraint violations which disallow this shift trade |  [optional] |
| **adminReviewViolations** | [**List&lt;ShiftTradeMatchViolation&gt;**](ShiftTradeMatchViolation) | Constraint violations for this shift trade which require shift trade administrator review |  [optional] |
| **unevaluatedRules** | [**List<UnevaluatedRulesEnum>**](#Enum--UnevaluatedRulesEnum) | Unevaluated rules for this shift trade which require shift trade administrator review |  [optional] |


## Enum: UnevaluatedRulesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PLANNINGPERIODMINPAIDTIME | &quot;PlanningPeriodMinPaidTime&quot; |
| PLANNINGPERIODMAXPAIDTIME | &quot;PlanningPeriodMaxPaidTime&quot; |
| MINIMUMTIMEBETWEENSHIFTS | &quot;MinimumTimeBetweenShifts&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
