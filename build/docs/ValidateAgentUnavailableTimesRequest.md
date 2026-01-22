# ValidateAgentUnavailableTimesRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **validationWeekDate** | [**LocalDate**](LocalDate) | The ID of the week to validate. Must correspond to the start day of week of the business unit to which the agent belongs in the format YYYY-MM-dd. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **unavailableTimes** | [**List&lt;UpdateUnavailableTime&gt;**](UpdateUnavailableTime) | Proposed changes to agent's unavailable time spans to be validated |  |




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
