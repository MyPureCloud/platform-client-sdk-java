# BuImportAgentScheduleUploadSchema


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | **String** | The ID of the user to whom this agent schedule applies |  |
| **workPlanId** | [**ValueWrapperString**](ValueWrapperString) | The ID of the work plan for this user.  Mutually exclusive with workPlanIdsPerWeek |  [optional] |
| **workPlanIdsPerWeek** | [**ListWrapperString**](ListWrapperString) | The IDs of the work plans per week for this user.  Mutually exclusive with workPlanId |  [optional] |
| **shifts** | [**List&lt;BuAgentScheduleShift&gt;**](BuAgentScheduleShift) | The shift definitions for this agent schedule |  [optional] |
| **fullDayTimeOffMarkers** | [**List&lt;BuFullDayTimeOffMarker&gt;**](BuFullDayTimeOffMarker) | Any full day time off markers that apply to this agent schedule |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
