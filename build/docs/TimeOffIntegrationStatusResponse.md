# TimeOffIntegrationStatusResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeOffRequest** | [**TimeOffRequestReference**](TimeOffRequestReference) | The time off request associated with this integration status |  |
| **integrationStatus** | [**IntegrationStatusEnum**](#Enum--IntegrationStatusEnum) | The value of integration status for the time off request |  |


## Enum: IntegrationStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| ERROR | &quot;Error&quot; | 
| AUTOMATICALLYCOMPLETE | &quot;AutomaticallyComplete&quot; | 
| MANUALLYCOMPLETE | &quot;ManuallyComplete&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
