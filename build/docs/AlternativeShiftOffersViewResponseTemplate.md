# AlternativeShiftOffersViewResponseTemplate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **jobId** | **String** | The unique identifier of the async list job that created this file |  |
| **businessUnitId** | **String** | The unique identifier of the business unit to which the user (agent) belongs at the time the offer is created |  |
| **agentId** | **String** | The unique identifier of the agent for whom the offer was made |  |
| **managementUnitId** | **String** | The unique identifier of the management unit to which the user (agent) belongs at the time the offer is created |  |
| **schedule** | [**AlternativeShiftScheduleLookup**](AlternativeShiftScheduleLookup) | The existing schedule information associated with the offer |  |
| **offerWeekDate** | [**LocalDate**](LocalDate) | The first date of the week for the schedule we are querying in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **shifts** | [**List&lt;AlternativeShiftAgentScheduledShift&gt;**](AlternativeShiftAgentScheduledShift) | The shifts the agent is scheduled for at the time the offer is created |  |
| **alternativeDays** | [**List&lt;AlternativeShiftAgentScheduledShift&gt;**](AlternativeShiftAgentScheduledShift) | The offered alternative shift days in this week at the time the offer is created |  |




_com.mypurecloud.sdk.v2:platform-client-v2:219.0.0_
