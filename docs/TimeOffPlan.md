# TimeOffPlan


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of this time off plan. |  [optional] |
| **activityCodeIds** | **List&lt;String&gt;** | The set of activity code IDs associated with this time off plan. |  [optional] |
| **timeOffLimits** | [**List&lt;TimeOffLimitReference&gt;**](TimeOffLimitReference) | The set of time off limit IDs associated with this time off plan. |  [optional] |
| **autoApprovalRule** | [**AutoApprovalRuleEnum**](#Enum--AutoApprovalRuleEnum) | Auto approval rule for this time off plan |  [optional] |
| **daysBeforeStartToExpireFromWaitlist** | **Integer** | The number of days before the time off request start date for when the request will be expired from the waitlist. |  [optional] |
| **hrisTimeOffType** | [**HrisTimeOffType**](HrisTimeOffType) | Time off type, if this time off plan is associated with the integration. |  [optional] |
| **active** | **Boolean** | Whether this time off plan is currently being used by agents. |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for the time off plan. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: AutoApprovalRuleEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEVER | &quot;Never&quot; | 
| ALWAYS | &quot;Always&quot; | 
| CHECKLIMITS | &quot;CheckLimits&quot; | 
| CHECKACTIVITYCODES | &quot;CheckActivityCodes&quot; | 
| CHECKLIMITSANDACTIVITYCODES | &quot;CheckLimitsAndActivityCodes&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.0.0_
