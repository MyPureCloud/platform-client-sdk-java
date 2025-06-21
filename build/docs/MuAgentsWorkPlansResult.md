# MuAgentsWorkPlansResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entities** | [**List&lt;AgentWorkPlans&gt;**](AgentWorkPlans) |  |  [optional] |
| **referenceStartWeekDate** | [**LocalDate**](LocalDate) | The reference date in yyyy-MM-dd format rolled back to nearest BU start day of week. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **workPlanLookup** | [**Map&lt;String, WorkPlanReference&gt;**](WorkPlanReference) | Map containing lookup values for agent work plans. The integer keys serves as lookup keys for effective work plan from workPlanLookupKeysPerWeek property |  |




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
