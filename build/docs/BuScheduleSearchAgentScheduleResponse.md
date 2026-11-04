# BuScheduleSearchAgentScheduleResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | [**UserReference**](UserReference) | The user to whom this agent schedule applies |  [optional] |
| **shifts** | [**List&lt;BuAgentScheduleShift&gt;**](BuAgentScheduleShift) | The shift definitions for this agent schedule |  [optional] |
| **fullDayTimeOffMarkers** | [**List&lt;BuFullDayTimeOffMarker&gt;**](BuFullDayTimeOffMarker) | Full day time off markers which apply to this agent schedule |  [optional] |
| **workPlansPerWeek** | [**List&lt;WorkPlanReference&gt;**](WorkPlanReference) | The work plans per week for this user from the work plan rotation. Null values in the list denote that the user is not part of any work plan for that week. Populated only when expand=agentSchedules.workPlansPerWeek is requested |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
