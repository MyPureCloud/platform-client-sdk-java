# IdleTokenTimeout


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **idleTokenTimeoutSeconds** | **Integer** | Token timeout length in seconds. Must be at least 5 minutes and 8 hours or less (if HIPAA is disabled) or 15 minutes or less (if HIPAA is enabled). |  [optional] |
| **enableIdleTokenTimeout** | **Boolean** | Indicates whether the Token Timeout should be enabled or disabled. |  [optional] |
| **inactivityTimeoutUnit** | [**InactivityTimeoutUnitEnum**](#Enum--InactivityTimeoutUnitEnum) | The unit for the inactivity timeout (MINUTES or HOURS). |  [optional] |
| **inactivityTimeoutGroupsEnabled** | **Boolean** | Indicates whether inactivity timeout groups are enabled. |  [optional] |
| **inactivityTimeoutGroupBundles** | [**List&lt;InactivityTimeoutGroupBundle&gt;**](InactivityTimeoutGroupBundle) | Group bundle configuration for inactivity timeout. |  [optional] |


## Enum: InactivityTimeoutUnitEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MINUTES | &quot;Minutes&quot; | 
| HOURS | &quot;Hours&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:249.0.0_
