# UpdateActivityPlanRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the activity plan |  [optional] |
| **description** | **String** | The description of the activity plan |  [optional] |
| **groupSettings** | [**ValueWrapperGroupSettings**](ValueWrapperGroupSettings) | Group settings for the activity plan |  [optional] |
| **attendeesSearchRule** | [**ValueWrapperUserSearchRule**](ValueWrapperUserSearchRule) | Attendee search rule for this activity plan |  [optional] |
| **facilitatorsSearchRule** | [**ValueWrapperUserSearchRule**](ValueWrapperUserSearchRule) | Facilitator search rule for this activity plan |  [optional] |
| **transitionTimeMinutes** | **Integer** | Transition time in minutes between facilitated sessions |  [optional] |
| **serviceGoalImpactOverrides** | [**ValueWrapperActivityPlanServiceGoalImpactOverrides**](ValueWrapperActivityPlanServiceGoalImpactOverrides) | Allowable service goal impact override settings for this activity plan |  [optional] |
| **optimizationObjective** | [**OptimizationObjectiveEnum**](#Enum--OptimizationObjectiveEnum) | The optimization objective of this activity plan |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of this activity plan |  [optional] |
| **fixedAvailability** | [**ListWrapperFixedAvailability**](ListWrapperFixedAvailability) | Fixed availability configuration for the activity plan |  [optional] |


## Enum: OptimizationObjectiveEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FAVORSERVICEGOALS | &quot;FavorServiceGoals&quot; | 
| FAVORSCHEDULINGALL | &quot;FavorSchedulingAll&quot; | 


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
