---
title: ActivityPlanListItem
---
## ActivityPlanListItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the activity plan |  |
| **managementUnits** | <!----><!---->[**List&lt;ManagementUnitReference&gt;**](ManagementUnitReference.html)<!----> | The management units to which this activity plan applies. Empty list or null means this activity plan applies to all management units in the business unit |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of this activity plan |  |
| **activityCode** | <!----><!---->[**ActivityCodeReference**](ActivityCodeReference.html)<!----> | The activity code to which this activity plan applies. Note: It is recommended to load and cache the entire list of activity codes rather than look up individual codes |  |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the activity plan |  |
| **optimizationObjective** | [**OptimizationObjectiveEnum**](#OptimizationObjectiveEnum)<!----> | The optimization objective of this activity plan |  |
| **recurrenceSettings** | <!----><!---->[**RecurrenceSettings**](RecurrenceSettings.html)<!----> | Recurrence settings for this activity plan |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of this activity plan |  |
| **lastRunDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the activity plan was last run, in ISO-8601 format |  [optional] |
| **lastRunBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The last user to run this activity plan |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the activity plan was created, in ISO-8601 format |  |
| **createdBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who created this activity plan |  |
| **modifiedDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the activity plan was modified, in ISO-8601 format |  |
| **modifiedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The last user to modify this activity plan |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INDIVIDUAL | &quot;Individual&quot; | 
| GROUP | &quot;Group&quot; | 
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



