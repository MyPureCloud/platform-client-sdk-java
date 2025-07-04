# IntegrationStatusInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **code** | [**CodeEnum**](#Enum--CodeEnum) | Machine-readable status as reported by the integration. |  [optional] |
| **effective** | **String** | Localized, human-readable, effective status of the integration. |  [optional] |
| **detail** | [**MessageInfo**](MessageInfo) | Localizable status details for the integration. |  [optional] |
| **lastUpdated** | [**Date**](Date) | Date and time (in UTC) when the integration status (i.e. the code field) was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: CodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;ACTIVE&quot; | 
| ACTIVATING | &quot;ACTIVATING&quot; | 
| INACTIVE | &quot;INACTIVE&quot; | 
| DEACTIVATING | &quot;DEACTIVATING&quot; | 
| ERROR | &quot;ERROR&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
