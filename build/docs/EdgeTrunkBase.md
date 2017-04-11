---
title: EdgeTrunkBase
---
## EdgeTrunkBase


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
| **trunkMetabase** | [**UriReference**](UriReference.html) | The meta-base this trunk is based on. |  |
| **properties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **trunkType** | [**TrunkTypeEnum**](#TrunkTypeEnum) | The type of this trunk base. |  |
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


<a name="TrunkTypeEnum"></a>

## Enum: TrunkTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |
| PHONE | &quot;PHONE&quot; |
| EDGE | &quot;EDGE&quot; |
{: class="table table-striped"}


