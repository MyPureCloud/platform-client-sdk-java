# UpdateTimeOffPlanRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Deprecated. The name of this time off plan. |  [optional] |
| **activityCodeIds** | [**SetWrapperString**](SetWrapperString) | Deprecated. The set of activity code IDs to associate with this time off plan. |  [optional] |
| **timeOffLimitIds** | [**SetWrapperString**](SetWrapperString) | Deprecated. The set of time off limit IDs to associate with this time off plan. |  [optional] |
| **autoApprovalRule** | [**AutoApprovalRuleEnum**](#Enum--AutoApprovalRuleEnum) | Deprecated. Auto approval rule for the time off plan. |  [optional] |
| **daysBeforeStartToExpireFromWaitlist** | **Integer** | Deprecated. The number of days before the time off request start date for when the request will be expired from the waitlist. |  [optional] |
| **hrisTimeOffType** | [**ValueWrapperHrisTimeOffType**](ValueWrapperHrisTimeOffType) | Deprecated Time off type, if this time off plan is associated with the integration. |  [optional] |
| **active** | **Boolean** | Deprecated. Whether this time off plan should be used by agents. |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Deprecated. Version metadata for the time off plan |  |


## Enum: AutoApprovalRuleEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEVER | &quot;Never&quot; | 
| ALWAYS | &quot;Always&quot; | 
| CHECKLIMITS | &quot;CheckLimits&quot; | 
| CHECKACTIVITYCODES | &quot;CheckActivityCodes&quot; | 
| CHECKLIMITSANDACTIVITYCODES | &quot;CheckLimitsAndActivityCodes&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
