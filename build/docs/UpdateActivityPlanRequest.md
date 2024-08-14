---
title: UpdateActivityPlanRequest
---
## UpdateActivityPlanRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The name of the activity plan |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of the activity plan |  [optional] |
| **groupSettings** | <!----><!---->[**ValueWrapperGroupSettings**](ValueWrapperGroupSettings.html)<!----> | Group settings for the activity plan |  [optional] |
| **attendeesSearchRule** | <!----><!---->[**ValueWrapperUserSearchRule**](ValueWrapperUserSearchRule.html)<!----> | Attendee search rule for this activity plan |  [optional] |
| **facilitatorsSearchRule** | <!----><!---->[**ValueWrapperUserSearchRule**](ValueWrapperUserSearchRule.html)<!----> | Facilitator search rule for this activity plan |  [optional] |
| **transitionTimeMinutes** | <!----><!---->**Integer**<!----> | Transition time in minutes between facilitated sessions |  [optional] |
| **serviceGoalImpactOverrides** | <!----><!---->[**ValueWrapperActivityPlanServiceGoalImpactOverrides**](ValueWrapperActivityPlanServiceGoalImpactOverrides.html)<!----> | Allowable service goal impact override settings for this activity plan |  [optional] |
| **optimizationObjective** | [**OptimizationObjectiveEnum**](#OptimizationObjectiveEnum)<!----> | The optimization objective of this activity plan |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of this activity plan |  [optional] |
| **fixedAvailability** | <!----><!---->[**ListWrapperFixedAvailability**](ListWrapperFixedAvailability.html)<!----> | Fixed availability configuration for the activity plan |  [optional] |
{: class="table table-striped"}


<a name="OptimizationObjectiveEnum"></a>

## Enum: OptimizationObjectiveEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FAVORSERVICEGOALS | &quot;FavorServiceGoals&quot; | 
| FAVORSCHEDULINGALL | &quot;FavorSchedulingAll&quot; | 
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
{: class="table table-striped"}



