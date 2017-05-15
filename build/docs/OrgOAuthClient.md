---
title: OrgOAuthClient
---
## OrgOAuthClient


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the OAuth client. |  |
| **authorizedGrantType** | [**AuthorizedGrantTypeEnum**](#AuthorizedGrantTypeEnum) | The OAuth Grant/Client type supported by this client. Code Authorization Grant/Client type - Preferred client type where the Client ID and Secret are required to create tokens. Used where the secret can be secured. Implicit grant type - Client ID only is required to create tokens. Used in browser and mobile apps where the secret can not be secured. SAML2-Bearer extension grant type - SAML2 assertion provider for user authentication at the token endpoint. Client Credential grant type - Used to created access tokens that are tied only to the client.  |  |
| **organization** | [**Entity**](Entity.html) | The  oauth client&#39;s organization. |  [optional] |
{: class="table table-striped"}


<a name="AuthorizedGrantTypeEnum"></a>

## Enum: AuthorizedGrantTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CODE | &quot;CODE&quot; |
| TOKEN | &quot;TOKEN&quot; |
| SAML2BEARER | &quot;SAML2BEARER&quot; |
| PASSWORD | &quot;PASSWORD&quot; |
| CLIENT_CREDENTIALS | &quot;CLIENT_CREDENTIALS&quot; |
{: class="table table-striped"}


