# ScheduleBidGroupSummary


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  |
| **name** | **String** | The name assigned to this bid group |  |
| **managementUnit** | [**ManagementUnitReference**](ManagementUnitReference) | The management unit to which this bid group belongs |  |
| **agentCount** | **Integer** | The number of agents in this bid group |  |
| **workPlanCount** | **Integer** | The number of work plans in this bid group or the number of work plans in rotations |  |
| **workPlanRotationCount** | **Integer** | The number of work plan rotations used in this bid group |  |
| **planningGroupCount** | **Integer** | The number of planning groups in this bid group |  |
| **scheduleSetError** | [**ScheduleSetError**](ScheduleSetError) | Schedule set optimization error details for this bid group. Present only when optimization fails |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:256.0.0_
