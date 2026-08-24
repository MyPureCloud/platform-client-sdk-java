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
| **activityCodeId** | **String** | The activity code associated with the activity plan |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the activity plan |  [optional] |
| **lengthMinutes** | **Integer** | The length in minutes of the activity plan |  [optional] |
| **countsAsPaidTime** | **Boolean** | Whether the activity should count as paid time |  [optional] |
| **recurrenceSettings** | [**RecurrenceSettingsBase**](RecurrenceSettingsBase) | Settings controlling recurrence for the activity plan. If not set the activity plan will only occur once |  [optional] |


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


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INDIVIDUAL | &quot;Individual&quot; | 
| GROUP | &quot;Group&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
