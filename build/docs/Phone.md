---
title: Phone
---

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
| **site** | [**UriReference**](UriReference.html) | The site associated to the phone. |  |
| **phoneBaseSettings** | [**UriReference**](UriReference.html) | Phone Base Settings |  |
| **lineBaseSettings** | [**UriReference**](UriReference.html) |  |  [optional] |
| **phoneMetaBase** | [**UriReference**](UriReference.html) |  |  [optional] |
| **lines** | [**List&lt;Line&gt;**](Line.html) | Lines |  |
| **status** | [**PhoneStatus**](PhoneStatus.html) | The status of the phone and lines from the primary Edge. |  [optional] |
| **secondaryStatus** | [**PhoneStatus**](PhoneStatus.html) | The status of the phone and lines from the secondary Edge. |  [optional] |
| **userAgentInfo** | [**UserAgentInfo**](UserAgentInfo.html) | User Agent Information for this phone. This includes model, firmware version, and manufacturer. |  [optional] |
| **properties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **capabilities** | [**PhoneCapabilities**](PhoneCapabilities.html) |  |  [optional] |
| **webRtcUser** | [**UriReference**](UriReference.html) | This is the user associated with a WebRTC type phone.  It is required for all WebRTC phones. |  [optional] |
| **primaryEdge** | [**Edge**](Edge.html) |  |  [optional] |
| **secondaryEdge** | [**Edge**](Edge.html) |  |  [optional] |
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


