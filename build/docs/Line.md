---
title: Line
---
## Line


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
| **properties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **edgeGroup** | [**UriReference**](UriReference.html) |  |  [optional] |
| **template** | [**UriReference**](UriReference.html) |  |  [optional] |
| **site** | [**UriReference**](UriReference.html) |  |  [optional] |
| **lineBaseSettings** | [**UriReference**](UriReference.html) |  |  [optional] |
| **primaryEdge** | [**Edge**](Edge.html) | The primary edge associated to the line. (Deprecated) |  [optional] |
| **secondaryEdge** | [**Edge**](Edge.html) | The secondary edge associated to the line. (Deprecated) |  [optional] |
| **loggedInUser** | [**UriReference**](UriReference.html) |  |  [optional] |
| **defaultForUser** | [**UriReference**](UriReference.html) |  |  [optional] |
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
{: class="table table-striped"}


