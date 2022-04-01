---
title: OAuthAuthorization
---
## OAuthAuthorization


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **client** | <!----><!---->[**OAuthClient**](OAuthClient.html)<!----> |  |  [optional] |
| **scope** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **roles** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **resourceOwner** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **modifiedBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **pending** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNAUTHORIZED | &quot;Unauthorized&quot; |
| REQUESTED | &quot;Requested&quot; |
| AUTHORIZED | &quot;Authorized&quot; |
| REVOKED | &quot;Revoked&quot; |
{: class="table table-striped"}



