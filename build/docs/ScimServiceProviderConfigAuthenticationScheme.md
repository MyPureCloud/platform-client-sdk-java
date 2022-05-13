---
title: ScimServiceProviderConfigAuthenticationScheme
---
## ScimServiceProviderConfigAuthenticationScheme


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The name of the authentication scheme, for example, HTTP Basic. |  |
| **description** | <!----><!---->**String**<!----> | The description of the authentication scheme. |  |
| **specUri** | <!----><!---->**String**<!----> | The HTTP-addressable URL that points to the authentication scheme's specification. |  [optional] |
| **documentationUri** | <!----><!---->**String**<!----> | The HTTP-addressable URL that points to the authentication scheme's usage documentation. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of authentication scheme. |  |
| **primary** | <!----><!---->**Boolean**<!----> | Indicates whether this authentication scheme is the primary method of authentication. |  [optional] |
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



