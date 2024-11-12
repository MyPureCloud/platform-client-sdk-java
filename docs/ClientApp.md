# ClientApp


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the integration, used to distinguish this integration from others of the same type. |  [optional] |
| **integrationType** | [**IntegrationType**](IntegrationType) | Type of the integration |  [optional] |
| **notes** | **String** | Notes about the integration. |  [optional] |
| **intendedState** | [**IntendedStateEnum**](#Enum--IntendedStateEnum) | Configured state of the integration. |  |
| **config** | [**ClientAppConfigurationInfo**](ClientAppConfigurationInfo) | Configuration information for the integration. |  [optional] |
| **reportedState** | [**IntegrationStatusInfo**](IntegrationStatusInfo) | Last reported status of the integration. |  [optional] |
| **attributes** | **Map&lt;String, String&gt;** | Read-only attributes for the integration. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: IntendedStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ENABLED | &quot;ENABLED&quot; | 
| DISABLED | &quot;DISABLED&quot; | 
| DELETED | &quot;DELETED&quot; | 
| RESTORED | &quot;RESTORED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
