# IdleTokenTimeout


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **idleTokenTimeoutSeconds** | **Integer** | Token timeout length in seconds. Must be at least 5 minutes and at most 8 hours. HIPAA-enabled organizations may be subject to a stricter 15-minute maximum during rollout. |  [optional] |
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




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
