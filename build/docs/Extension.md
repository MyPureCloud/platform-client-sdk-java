---
title: Extension
---
## Extension


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the entity. |  |
| **description** | **String** |  |  [optional] |
| **version** | **Integer** |  |  [optional] |
| **dateCreated** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateModified** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **modifiedBy** | **String** |  |  [optional] |
| **createdBy** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum) |  |  [optional] |
| **modifiedByApp** | **String** |  |  [optional] |
| **createdByApp** | **String** |  |  [optional] |
| **number** | **String** |  |  [optional] |
| **owner** | [**UriReference**](UriReference.html) | A Uri reference to the owner of this extension, which is either a User or an IVR |  [optional] |
| **extensionPool** | [**UriReference**](UriReference.html) |  |  [optional] |
| **ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| DELETED | &quot;deleted&quot; |


<a name="OwnerTypeEnum"></a>

## Enum: OwnerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| USER | &quot;USER&quot; |
| PHONE | &quot;PHONE&quot; |
| IVR_CONFIG | &quot;IVR_CONFIG&quot; |
| GROUP | &quot;GROUP&quot; |
{: class="table table-striped"}


