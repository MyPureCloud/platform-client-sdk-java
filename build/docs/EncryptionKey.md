---
title: EncryptionKey
---
## EncryptionKey


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **createDate** | <!----><!---->[**Date**](Date.html)<!----> | create date of the key pair. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **keydataSummary** | <!----><!---->**String**<!----> | key data summary (base 64 encoded public key) |  [optional] |
| **user** | <!----><!---->[**User**](User.html)<!----> | user that requested generation of public key |  [optional] |
| **localEncryptionConfiguration** | <!----><!---->[**LocalEncryptionConfiguration**](LocalEncryptionConfiguration.html)<!----> | Local configuration |  [optional] |
| **keyConfigurationType** | [**KeyConfigurationTypeEnum**](#KeyConfigurationTypeEnum)<!----> | Key type used in this configuration |  [optional] |
| **kmsKeyArn** | <!----><!---->**String**<!----> | ARN of internal key to be wrapped by AWS KMS Symmetric key |  [optional] |
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



