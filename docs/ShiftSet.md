# ShiftSet


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the shift set |  |
| **name** | **String** | The name given for the shift set |  |
| **effectiveWorkPlan** | [**ShiftSetEffectiveWorkPlan**](ShiftSetEffectiveWorkPlan) | The work plan or work plan rotation used for generating the shift set |  |
| **shifts** | [**List&lt;ScheduleBidScheduledShift&gt;**](ScheduleBidScheduledShift) | The scheduled shifts |  |
| **suggestedAgentCount** | **Integer** | The suggested agent count |  |
| **overrideAgentCount** | **Integer** | The override agent count. If it is null, it falls back to using the suggestedAgentCount |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
