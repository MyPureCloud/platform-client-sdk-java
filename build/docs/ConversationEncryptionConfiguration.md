---
title: ConversationEncryptionConfiguration
---
## ConversationEncryptionConfiguration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **url** | <!----><!---->**String**<!----> | keyConfigurationType is always KmsSymmetric, and should be the arn to the key alias for the master key |  |
| **keyConfigurationType** | [**KeyConfigurationTypeEnum**](#KeyConfigurationTypeEnum)<!----> | Type should be 'KmsSymmetric' when create or update Key configurations, 'None' to disable configuration. |  |
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



