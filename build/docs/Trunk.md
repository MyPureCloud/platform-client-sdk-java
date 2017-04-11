---
title: Trunk
---
## Trunk


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
| **trunkType** | [**TrunkTypeEnum**](#TrunkTypeEnum) | The type of this trunk. |  [optional] |
| **edge** | [**UriReference**](UriReference.html) | The Edge using this trunk. |  [optional] |
| **trunkBase** | [**UriReference**](UriReference.html) | The trunk base configuration used on this trunk. |  [optional] |
| **trunkMetabase** | [**UriReference**](UriReference.html) | The metabase used to create this trunk. |  [optional] |
| **edgeGroup** | [**UriReference**](UriReference.html) | The edge group associated with this trunk. |  [optional] |
| **inService** | **Boolean** | True if this trunk is in-service.  This comes from the trunk_enabled property of the referenced trunk base. |  [optional] |
| **enabled** | **Boolean** | True if the Edge used by this trunk is in-service |  [optional] |
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


