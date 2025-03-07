# UpdateMuAgentWorkPlanFailureResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | [**UserReference**](UserReference) | The user for whom the work plan update has failed |  |
| **failure** | [**FailureEnum**](#Enum--FailureEnum) | The work plan update failure reason |  |
| **notFoundWorkPlanId** | **String** | The id of the work plan that has not been found |  [optional] |


## Enum: FailureEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENTNOTINMANAGEMENTUNIT | &quot;AgentNotInManagementUnit&quot; | 
| OVERLAPPINGOVERRIDE | &quot;OverlappingOverride&quot; | 
| OVERRIDENOTFOUND | &quot;OverrideNotFound&quot; | 
| TOOMANYOVERRIDES | &quot;TooManyOverrides&quot; | 
| WORKPLANNOTFOUND | &quot;WorkPlanNotFound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
