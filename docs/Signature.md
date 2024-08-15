# Signature


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **Boolean** | A toggle to enable the signature on email send. |  [optional] |
| **cannedResponseId** | **String** | The identifier referring to an email signature canned response. |  [optional] |
| **alwaysIncluded** | **Boolean** | A toggle that defines if a signature is always included or only set on the first email in an email chain. |  [optional] |
| **inclusionType** | [**InclusionTypeEnum**](#Enum--InclusionTypeEnum) | The configuration to indicate when the signature of a conversation has to be included |  [optional] |
{: class="table table-striped"}


## Enum: InclusionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| SEND | &quot;Send&quot; | 
| SENDONCE | &quot;SendOnce&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
