# ConversationEncryptionConfiguration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **url** | **String** | keyConfigurationType is always KmsSymmetric, and should be the arn to the key alias for the master key |  |
| **keyConfigurationType** | [**KeyConfigurationTypeEnum**](#Enum--KeyConfigurationTypeEnum) | Type should be 'KmsSymmetric' when create or update Key configurations, 'None' to disable configuration. |  |
| **lastError** | [**ErrorBody**](ErrorBody) | The error message related to the configuration |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: KeyConfigurationTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| KMSSYMMETRIC | &quot;KmsSymmetric&quot; | 
| LOCALKEYMANAGER | &quot;LocalKeyManager&quot; | 
| NATIVE | &quot;Native&quot; | 
| NONE | &quot;None&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
