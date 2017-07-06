---
title: DIDPool
---
## DIDPool


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
| **startPhoneNumber** | **String** | The starting phone number for the range of this DID pool. Must be in E.164 format |  |
| **endPhoneNumber** | **String** | The ending phone number for the range of this DID pool. Must be in E.164 format |  |
| **comments** | **String** |  |  [optional] |
| **provider** | [**ProviderEnum**](#ProviderEnum) | The provider for this DID pool |  [optional] |
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


<a name="ProviderEnum"></a>

## Enum: ProviderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PURE_CLOUD | &quot;PURE_CLOUD&quot; |
| PURE_CLOUD_VOICE | &quot;PURE_CLOUD_VOICE&quot; |
{: class="table table-striped"}


