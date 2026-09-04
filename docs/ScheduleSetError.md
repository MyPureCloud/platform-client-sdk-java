# ScheduleSetError


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **errorCode** | [**ErrorCodeEnum**](#Enum--ErrorCodeEnum) | Error code that indicates why schedule set optimization failed. At least one of workPlans or workPlanRotations is set if there is an error during optimization |  |
| **workPlans** | [**List&lt;WorkPlanReference&gt;**](WorkPlanReference) | Work plans involved in the optimization failure |  [optional] |
| **workPlanRotations** | [**List&lt;WorkPlanRotationReference&gt;**](WorkPlanRotationReference) | Work plan rotations involved in the optimization failure |  [optional] |


## Enum: ErrorCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INVALIDWORKPLANS | &quot;InvalidWorkPlans&quot; | 
| INVALIDWORKPLANROTATIONS | &quot;InvalidWorkPlanRotations&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
