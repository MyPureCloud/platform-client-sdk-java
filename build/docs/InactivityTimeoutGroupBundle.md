# InactivityTimeoutGroupBundle


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **priority** | **Integer** | The priority of the group bundle (1-5). |  |
| **timeoutSeconds** | **Integer** | The timeout value in seconds (300 to 28800, representing 5 to 480 minutes). |  |
| **inactivityTimeoutUnit** | [**InactivityTimeoutUnitEnum**](#Enum--InactivityTimeoutUnitEnum) | The unit for the timeout (MINUTES or HOURS). |  [optional] |
| **groups** | **List&lt;String&gt;** | The list of group IDs to select. |  |


## Enum: InactivityTimeoutUnitEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MINUTES | &quot;Minutes&quot; | 
| HOURS | &quot;Hours&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:250.1.0_
