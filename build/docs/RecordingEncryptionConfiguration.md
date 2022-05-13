---
title: RecordingEncryptionConfiguration
---
## RecordingEncryptionConfiguration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **url** | <!----><!---->**String**<!----> | When keyConfigurationType is LocalKeyManager, this should be the url for decryption and must specify the path to where GenesysCloud can requests decryption. When keyConfigurationType is KmsSymmetric, this should be the arn to the key alias for the master key |  |
| **apiId** | <!----><!---->**String**<!----> | The api id for Hawk Authentication. Null if keyConfigurationType is KmsSymmetric |  [optional] |
| **apiKey** | <!----><!---->**String**<!----> | The api shared symmetric key used for hawk authentication. Null if keyConfigurationType is KmsSymmetric |  [optional] |
| **keyConfigurationType** | [**KeyConfigurationTypeEnum**](#KeyConfigurationTypeEnum)<!----> | Type should be LocalKeyManager or KmsSymmetric when create or update Key configurations; 'Native' for disabling configuration. |  |
| **lastError** | <!----><!---->[**ErrorBody**](ErrorBody.html)<!----> | The error message related to the configuration |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="KeyConfigurationTypeEnum"></a>

## Enum: KeyConfigurationTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| KMSSYMMETRIC | &quot;KmsSymmetric&quot; | 
| LOCALKEYMANAGER | &quot;LocalKeyManager&quot; | 
| NATIVE | &quot;Native&quot; | 
| NONE | &quot;None&quot; | 
{: class="table table-striped"}



