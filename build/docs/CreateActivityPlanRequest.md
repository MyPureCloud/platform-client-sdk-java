# CreateActivityPlanRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the activity plan |  |
| **managementUnitIds** | **List&lt;String&gt;** | The management units to which this activity plan applies. Empty list or null means this activity plan applies to the entire business unit |  [optional] |
| **description** | **String** | The description of the activity plan |  [optional] |
| **activityCodeId** | **String** | The activity code associated with the activity plan |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the activity plan |  |
| **lengthMinutes** | **Integer** | The length in minutes of the activity plan |  |
| **initialSchedulePeriod** | [**SchedulingPeriod**](SchedulingPeriod) | The initial scheduling period for the activity plan |  |
| **groupSettings** | [**GroupSettings**](GroupSettings) | Group settings for the activity plan |  [optional] |
| **recurrenceSettings** | [**RecurrenceSettings**](RecurrenceSettings) | Settings controlling recurrence for the activity plan. If not set the activity plan will only occur once |  [optional] |
| **attendeesSearchRule** | [**UserSearchRule**](UserSearchRule) | Attendee search rule for this activity plan |  [optional] |
| **facilitated** | **Boolean** | Whether the sessions created by this activity plan should be facilitated |  [optional] |
| **facilitatorsSearchRule** | [**UserSearchRule**](UserSearchRule) | Facilitator search rule for this activity plan |  [optional] |
| **transitionTimeMinutes** | **Integer** | Transition time in minutes between facilitated sessions |  |
| **serviceGoalImpactOverrides** | [**ActivityPlanServiceGoalImpactOverrides**](ActivityPlanServiceGoalImpactOverrides) | Allowable service goal impact override settings for this activity plan. If not set the business unit setting will be used |  [optional] |
| **optimizationObjective** | [**OptimizationObjectiveEnum**](#Enum--OptimizationObjectiveEnum) | The optimization objective of this activity plan |  |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of this activity plan |  |
| **countsAsPaidTime** | **Boolean** | Whether the activity should count as paid time |  |
| **fixedAvailability** | [**List&lt;FixedAvailability&gt;**](FixedAvailability) | Fixed availability configuration for the activity plan |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INDIVIDUAL | &quot;Individual&quot; | 
| GROUP | &quot;Group&quot; | 


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




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
