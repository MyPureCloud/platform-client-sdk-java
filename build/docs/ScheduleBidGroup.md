# ScheduleBidGroup


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the schedule bid group |  |
| **managementUnit** | [**ManagementUnitReference**](ManagementUnitReference) | The management unit to which this bid group belongs |  |
| **agents** | [**List&lt;UserReference&gt;**](UserReference) | The agents who participate in this bid group |  |
| **workPlans** | [**List&lt;WorkPlanReference&gt;**](WorkPlanReference) | The work plans used in this bid group |  [optional] |
| **workPlanRotations** | [**List&lt;BidGroupWorkPlanRotationResponse&gt;**](BidGroupWorkPlanRotationResponse) | The work plan rotations used in this bid group |  [optional] |
| **planningGroups** | [**List&lt;PlanningGroupReference&gt;**](PlanningGroupReference) | The planning groups selected in this bid group |  |
| **downloadUrl** | **String** | The downloadUrl to fetch Schedule sets. It will be populated if the status of this bid is 'Optimized' |  [optional] |
| **downloadTemplate** | [**BidGroupScheduleSet**](BidGroupScheduleSet) | Schedule sets always come through downloadUrl, the schema included here is just for documentation |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
