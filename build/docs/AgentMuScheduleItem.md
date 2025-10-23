# AgentMuScheduleItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **agent** | [**UserReference**](UserReference) | The agent to whom this schedule applies. Note: selfUri will not be populated if retrieving result via downloadUrl |  |
| **shifts** | [**List&lt;AgentMuScheduleShift&gt;**](AgentMuScheduleShift) | The shift definitions for this agent schedule |  |
| **fullDayTimeOffMarkerDates** | [**List&lt;LocalDate&gt;**](LocalDate) | The full day time off marker dates which apply to this agent schedule, interpreted in the time zone of the relevant business unit |  |




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
