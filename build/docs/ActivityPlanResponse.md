# ActivityPlanResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the activity plan |  |
| **managementUnits** | [**List&lt;ManagementUnitReference&gt;**](ManagementUnitReference) | The management units to which this activity plan applies. Empty list or null means this activity plan applies to the entire business unit |  [optional] |
| **description** | **String** | The description of this activity plan |  |
| **activityCode** | [**ActivityCodeReference**](ActivityCodeReference) | The activity code associated with this activity plan. It is recommended to load and cache the entire list of activity codes rather than look up individual codes |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the activity plan |  |
| **initialSchedulePeriod** | [**SchedulingPeriod**](SchedulingPeriod) | The initial schedule period of the activity plan |  |
| **lengthMinutes** | **Integer** | The length of the activity in minutes |  |
| **groupSettings** | [**GroupSettings**](GroupSettings) | Group settings for this activity plan |  [optional] |
| **recurrenceSettings** | [**RecurrenceSettings**](RecurrenceSettings) | Recurrence settings for this activity plan |  [optional] |
| **attendeesSearchRule** | [**UserSearchRule**](UserSearchRule) | Attendee search rule for this activity plan |  [optional] |
| **facilitated** | **Boolean** | Whether the sessions created by this activity plan should be facilitated |  |
| **facilitatorsSearchRule** | [**UserSearchRule**](UserSearchRule) | Facilitator search rule for this activity plan |  [optional] |
| **transitionTimeMinutes** | **Integer** | Transition time in minutes between facilitated sessions |  |
| **serviceGoalImpactOverrides** | [**ActivityPlanServiceGoalImpactOverrides**](ActivityPlanServiceGoalImpactOverrides) | Allowable service goal impact override settings for this activity plan |  [optional] |
| **optimizationObjective** | [**OptimizationObjectiveEnum**](#Enum--OptimizationObjectiveEnum) | The optimization objective of this activity plan |  |
| **fixedAvailability** | [**List&lt;FixedAvailability&gt;**](FixedAvailability) | Fixed availability configuration for this activity plan |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of this activity plan |  |
| **countsAsPaidTime** | **Boolean** | Whether the activity should count as paid time |  |
| **createdDate** | [**Date**](Date) | The date the activity plan was created, in ISO-8601 format |  |
| **createdBy** | [**UserReference**](UserReference) | The user who created this activity plan |  |
| **modifiedDate** | [**Date**](Date) | The date the activity plan was modified, in ISO-8601 format |  |
| **modifiedBy** | [**UserReference**](UserReference) | The last user to modify this activity plan |  |
| **lastRunDate** | [**Date**](Date) | The date the activity plan was last run, in ISO-8601 format |  [optional] |
| **lastRunBy** | [**UserReference**](UserReference) | The last user to run this activity plan |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
