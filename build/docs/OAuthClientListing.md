---
title: OAuthClientListing
---
## OAuthClientListing


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the OAuth client. |  |
| **accessTokenValiditySeconds** | <!----><!---->**Long**<!----> | The number of seconds, between 5mins and 48hrs, until tokens created with this client expire. If this field is omitted, a default of 24 hours will be applied. |  [optional] |
| **description** | <!----><!---->**String**<!----> |  |  [optional] |
| **registeredRedirectUri** | <!----><!---->**List&lt;String&gt;**<!----> | List of allowed callbacks for this client. For example: https://myap.example.com/auth/callback |  [optional] |
| **secret** | <!----><!---->**String**<!----> | System created secret assigned to this client. Secrets are required for code authorization and client credential grants. |  [optional] |
| **roleIds** | <!----><!---->**List&lt;String&gt;**<!----> | Deprecated. Use roleDivisions instead. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date this client was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date this client was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User that created this client |  [optional] |
| **modifiedBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User that last modified this client |  [optional] |
| **scope** | <!----><!---->**List&lt;String&gt;**<!----> | The scope requested by this client. Scopes only apply to clients not using the client_credential grant |  [optional] |
| **roleDivisions** | <!----><!---->[**List&lt;RoleDivision&gt;**](RoleDivision.html)<!----> | Set of roles and their corresponding divisions associated with this client. Roles and divisions only apply to clients using the client_credential grant |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of the OAuth client. Active: The OAuth client can be used to create access tokens. This is the default state. Disabled: Access tokens created by the client are invalid and new ones cannot be created. Inactive: Access tokens cannot be created with this OAuth client and it will be deleted. |  [optional] |
| **dateToDelete** | <!----><!---->[**Date**](Date.html)<!----> | The time at which this client will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| DISABLED | &quot;disabled&quot; | 
| INACTIVE | &quot;inactive&quot; | 
{: class="table table-striped"}



