# OAuthAuthorization


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **client** | [**OAuthClient**](OAuthClient) |  |  [optional] |
| **scope** | **List&lt;String&gt;** |  |  [optional] |
| **roles** | **List&lt;String&gt;** |  |  [optional] |
| **resourceOwner** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **dateCreated** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **modifiedBy** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **pending** | **Boolean** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNAUTHORIZED | &quot;Unauthorized&quot; | 
| REQUESTED | &quot;Requested&quot; | 
| AUTHORIZED | &quot;Authorized&quot; | 
| REVOKED | &quot;Revoked&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
