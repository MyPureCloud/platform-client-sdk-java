# AgentSchedulingPreference


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the scheduling preference |  [optional] |
| **timeSpan** | [**WfmTimeSpan**](WfmTimeSpan) | Exact date, time and length of the scheduling preference time span |  |
| **preferenceLevel** | [**PreferenceLevelEnum**](#Enum--PreferenceLevelEnum) | The preference level for this time span |  |


## Enum: PreferenceLevelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STRONGLYPREFER | &quot;StronglyPrefer&quot; | 
| PREFER | &quot;Prefer&quot; | 
| AVOID | &quot;Avoid&quot; | 
| STRONGLYAVOID | &quot;StronglyAvoid&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:263.0.0_
