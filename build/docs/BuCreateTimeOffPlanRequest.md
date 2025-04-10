# BuCreateTimeOffPlanRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of this time-off plan |  |
| **activityCodeIds** | **List&lt;String&gt;** | The IDs of activity codes to associate with this time-off plan |  [optional] |
| **autoApprovalRule** | [**AutoApprovalRuleEnum**](#Enum--AutoApprovalRuleEnum) | Auto approval rule for this time-off plan. Default is Never |  [optional] |
| **daysBeforeStartToExpireFromWaitlist** | **Integer** | The number of days before the time-off request start date for when the request will be expired from the waitlist. Default is 0 |  [optional] |
| **hrisTimeOffType** | [**HrisTimeOffType**](HrisTimeOffType) | Time-off type, if this time-off plan is associated with the integration |  [optional] |
| **enabled** | **Boolean** | Whether this time-off plan should be used by agents. Default is true |  [optional] |
| **countAgainstTimeOffLimits** | **Boolean** | Whether this time-off plan should count against time-off limits. Default is false |  [optional] |
| **businessUnitAssociation** | [**CreateTimeOffPlanBusinessUnitAssociation**](CreateTimeOffPlanBusinessUnitAssociation) | Business unit association, if the time-off plan belongs to a business unit. managementUnitAssociation must not be set if this is populated |  [optional] |
| **managementUnitAssociation** | [**CreateTimeOffPlanManagementUnitAssociation**](CreateTimeOffPlanManagementUnitAssociation) | Management unit association, if the time-off plan belongs to a management unit. businessUnitAssociation must not be set if this is populated |  [optional] |


## Enum: AutoApprovalRuleEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEVER | &quot;Never&quot; | 
| ALWAYS | &quot;Always&quot; | 
| CHECKLIMITS | &quot;CheckLimits&quot; | 
| CHECKACTIVITYCODES | &quot;CheckActivityCodes&quot; | 
| CHECKLIMITSANDACTIVITYCODES | &quot;CheckLimitsAndActivityCodes&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
