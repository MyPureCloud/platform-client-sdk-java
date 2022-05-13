---
title: CreateTimeOffPlanRequest
---
## CreateTimeOffPlanRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The name of this time off plan. |  |
| **activityCodeIds** | <!----><!---->**List&lt;String&gt;**<!----> | The set of activity code IDs to associate with this time off plan. |  [optional] |
| **timeOffLimitIds** | <!----><!---->**List&lt;String&gt;**<!----> | The set of time off limit IDs to associate with this time off plan. |  [optional] |
| **autoApprovalRule** | [**AutoApprovalRuleEnum**](#AutoApprovalRuleEnum)<!----> | Auto approval rule for the time off plan. |  |
| **daysBeforeStartToExpireFromWaitlist** | <!----><!---->**Integer**<!----> | The number of days before the time off request start date for when the request will be expired from the waitlist. |  [optional] |
| **active** | <!----><!---->**Boolean**<!----> | Whether this time off plan should be used by agents. |  |
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



