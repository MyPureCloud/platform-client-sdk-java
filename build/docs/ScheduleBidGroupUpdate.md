# ScheduleBidGroupUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the schedule bid group |  [optional] |
| **managementUnitId** | **String** | The ID of the management unit to which this bid group belongs |  [optional] |
| **agentIds** | [**SetWrapperString**](SetWrapperString) | The IDs of the agents who participate in this bid group |  [optional] |
| **workPlanIds** | [**SetWrapperString**](SetWrapperString) | The IDs of the work plans used in this bid group |  [optional] |
| **workPlanRotations** | [**ListWrapperBidGroupWorkPlanRotationRequest**](ListWrapperBidGroupWorkPlanRotationRequest) | The work plan rotations used in this bid group |  [optional] |
| **planningGroupIds** | [**SetWrapperString**](SetWrapperString) | The IDs of the planning groups selected in this bid group |  [optional] |
| **scheduleSets** | [**ListWrapperScheduleSetRequest**](ListWrapperScheduleSetRequest) | The schedule sets generated for this bid group |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:260.0.0_
