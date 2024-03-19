---
title: BuTimeOffPlanResponse
---
## BuTimeOffPlanResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of this time-off plan |  |
| **activityCodeIds** | <!----><!---->**List&lt;String&gt;**<!----> | The IDs of activity codes associated with this time-off plan |  |
| **timeOffLimits** | <!----><!---->[**List&lt;BuTimeOffLimitReference&gt;**](BuTimeOffLimitReference.html)<!----> | The IDs of time-off limits associated with this time-off plan |  [optional] |
| **autoApprovalRule** | [**AutoApprovalRuleEnum**](#AutoApprovalRuleEnum)<!----> | Auto approval rule for this time-off plan |  |
| **daysBeforeStartToExpireFromWaitlist** | <!----><!---->**Integer**<!----> | The number of days before the time-off request start date for when the request will be expired from the waitlist |  |
| **hrisTimeOffType** | <!----><!---->[**HrisTimeOffType**](HrisTimeOffType.html)<!----> | Time-off type, if this time-off plan is associated with the integration |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether this time-off plan is currently being used by agents |  |
| **countAgainstTimeOffLimits** | <!----><!---->**Boolean**<!----> | Whether this time-off plan counts against time-off limits |  |
| **businessUnitAssociation** | <!----><!---->[**TimeOffPlanBusinessUnitAssociation**](TimeOffPlanBusinessUnitAssociation.html)<!----> | Business unit association, if the time-off plan belongs to a business unit. managementUnitAssociation must not be set if this is populated |  [optional] |
| **managementUnitAssociation** | <!----><!---->[**TimeOffPlanManagementUnitAssociation**](TimeOffPlanManagementUnitAssociation.html)<!----> | Management Unit association, if the time-off plan belongs to a management unit. businessUnitAssociation must not be set if this is populated |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version metadata for the time-off plan |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="AutoApprovalRuleEnum"></a>

## Enum: AutoApprovalRuleEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEVER | &quot;Never&quot; | 
| ALWAYS | &quot;Always&quot; | 
| CHECKLIMITS | &quot;CheckLimits&quot; | 
{: class="table table-striped"}



