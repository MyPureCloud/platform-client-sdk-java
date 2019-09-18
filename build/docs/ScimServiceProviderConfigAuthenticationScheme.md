---
title: ScimServiceProviderConfigAuthenticationScheme
---
## ScimServiceProviderConfigAuthenticationScheme


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Name |  |
| **description** | **String** | Description |  |
| **specUri** | **String** | An HTTP-addressable URL pointing to the authentication scheme&#39;s specification. |  [optional] |
| **documentationUri** | **String** | An HTTP-addressable URL pointing to the authentication scheme&#39;s usage documentation |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) | The authentication type. |  |
| **primary** | **Boolean** | Indication of primary method of authentication. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| OAUTH | &quot;oauth&quot; |
| OAUTH2 | &quot;oauth2&quot; |
| OAUTHBEARERTOKEN | &quot;oauthbearertoken&quot; |
| HTTPBASIC | &quot;httpbasic&quot; |
| HTTPDIGEST | &quot;httpdigest&quot; |
{: class="table table-striped"}



