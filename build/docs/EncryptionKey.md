# EncryptionKey


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **createDate** | [**Date**](Date) | create date of the key pair. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **keydataSummary** | **String** | key data summary (base 64 encoded public key) |  [optional] |
| **user** | [**User**](User) | user that requested generation of public key |  [optional] |
| **localEncryptionConfiguration** | [**LocalEncryptionConfiguration**](LocalEncryptionConfiguration) | Local configuration |  [optional] |
| **keyConfigurationType** | [**KeyConfigurationTypeEnum**](#Enum--KeyConfigurationTypeEnum) | Key type used in this configuration |  [optional] |
| **kmsKeyArn** | **String** | ARN of internal key to be wrapped by AWS KMS Symmetric key |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: KeyConfigurationTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| KMSSYMMETRIC | &quot;KmsSymmetric&quot; | 
| LOCALKEYMANAGER | &quot;LocalKeyManager&quot; | 
| NATIVE | &quot;Native&quot; | 
| NONE | &quot;None&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.1.0_
