# OrgOAuthClient


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the OAuth client. |  |
| **dateCreated** | [**Date**](Date) | Date this client was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date this client was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**DomainEntityRef**](DomainEntityRef) | User that created this client |  [optional] |
| **modifiedBy** | [**DomainEntityRef**](DomainEntityRef) | User that last modified this client |  [optional] |
| **authorizedGrantType** | [**AuthorizedGrantTypeEnum**](#Enum--AuthorizedGrantTypeEnum) | The OAuth Grant/Client type supported by this client. Code Authorization Grant/Client type - Preferred client type where the Client ID and Secret are required to create tokens. Used where the secret can be secured. PKCE-Enabled Code Authorization grant type - Code grant type which requires PKCE challenge and verifier to create tokens. Used in public clients for increased security. Implicit grant type - Client ID only is required to create tokens. Used in browser and mobile apps where the secret can not be secured. SAML2-Bearer extension grant type - SAML2 assertion provider for user authentication at the token endpoint. Client Credential grant type - Used to created access tokens that are tied only to the client.  |  |
| **scope** | **List&lt;String&gt;** | The scope requested by this client. Scopes only apply to clients not using the client_credential grant |  [optional] |
| **roleDivisions** | [**List&lt;RoleDivision&gt;**](RoleDivision) | Set of roles and their corresponding divisions associated with this client. Roles and divisions only apply to clients using the client_credential grant |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of the OAuth client. Active: The OAuth client can be used to create access tokens. This is the default state. Disabled: Access tokens created by the client are invalid and new ones cannot be created. Inactive: Access tokens cannot be created with this OAuth client and it will be deleted. |  [optional] |
| **dateToDelete** | [**Date**](Date) | The time at which this client will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **organization** | [**NamedEntity**](NamedEntity) | The  oauth client's organization. |  [optional] |


## Enum: AuthorizedGrantTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CODE | &quot;CODE&quot; | 
| TOKEN | &quot;TOKEN&quot; | 
| SAML2_BEARER | &quot;SAML2-BEARER&quot; | 
| PASSWORD | &quot;PASSWORD&quot; | 
| CLIENT_CREDENTIALS | &quot;CLIENT-CREDENTIALS&quot; | 


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| DISABLED | &quot;disabled&quot; | 
| INACTIVE | &quot;inactive&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
