---
title: OperationCreatorUserResponse
---
## OperationCreatorUserResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Type of the operation creator entity: User or OAuthClient |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;User&quot; | 
| OAUTHCLIENT | &quot;OAuthClient&quot; | 
{: class="table table-striped"}



