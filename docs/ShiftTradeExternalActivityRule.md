# ShiftTradeExternalActivityRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **externalActivityType** | [**ExternalActivityTypeEnum**](#Enum--ExternalActivityTypeEnum) | The external activity type to which to apply this rule |  |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | The action this rule invokes |  |
| **activityCodeIdReplacement** | **String** | The ID of the activity code with which to replace to replace external activities (required if action == KeepWithAgent, must be a default activity code ID) |  [optional] |


## Enum: ExternalActivityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVITYPLAN | &quot;ActivityPlan&quot; | 
| COACHING | &quot;Coaching&quot; | 
| LEARNING | &quot;Learning&quot; | 


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DONOTALLOWTRADE | &quot;DoNotAllowTrade&quot; | 
| KEEPWITHAGENT | &quot;KeepWithAgent&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
