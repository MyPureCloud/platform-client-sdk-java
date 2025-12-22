# BuUpdateAgentScheduleUploadSchema


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | **String** | The ID of the user to whom this agent schedule applies |  |
| **workPlanId** | [**ValueWrapperString**](ValueWrapperString) | The ID of the work plan for this user.  Mutually exclusive with workPlanIdsPerWeek |  [optional] |
| **workPlanIdsPerWeek** | [**ListWrapperString**](ListWrapperString) | The IDs of the work plans per week for this user.  Mutually exclusive with workPlanId |  [optional] |
| **shifts** | [**List&lt;BuUpdateAgentScheduleShift&gt;**](BuUpdateAgentScheduleShift) | The shift definitions for this agent schedule |  [optional] |
| **fullDayTimeOffMarkers** | [**List&lt;BuFullDayTimeOffMarker&gt;**](BuFullDayTimeOffMarker) | Any full day time off markers that apply to this agent schedule |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for this agent schedule. Required if updating or deleting an existing agent schedule, otherwise should be omitted |  [optional] |
| **delete** | **Boolean** | Whether to delete this agent's schedule. Defaults to false if not set |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
