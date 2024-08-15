# MailFromResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The verification status. |  [optional] |
| **records** | [**List&lt;Record&gt;**](Record) | The list of DNS records that pertain that need to exist for verification. |  [optional] |
| **mailFromDomain** | **String** | The custom MAIL FROM domain. |  |
{: class="table table-striped"}


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FAILED | &quot;FAILED&quot; | 
| PENDING | &quot;PENDING&quot; | 
| VERIFIED | &quot;VERIFIED&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
