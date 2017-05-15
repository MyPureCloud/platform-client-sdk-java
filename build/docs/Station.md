---
title: Station
---
## Station


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
| **userId** | **String** | The Id of the user currently logged in and associated with the station. |  [optional] |
| **webRtcUserId** | **String** | The Id of the user configured for the station if it is of type inin_webrtc_softphone. Empty if station type is not inin_webrtc_softphone. |  [optional] |
| **primaryEdge** | [**UriReference**](UriReference.html) |  |  [optional] |
| **secondaryEdge** | [**UriReference**](UriReference.html) |  |  [optional] |
| **type** | **String** |  |  [optional] |
| **lineAppearanceId** | **String** |  |  [optional] |
| **webRtcMediaDscp** | **Integer** | The default or configured value of media dscp for the station. Empty if station type is not inin_webrtc_softphone. |  [optional] |
| **webRtcPersistentEnabled** | **Boolean** | The default or configured value of persistent connection setting for the station. Empty if station type is not inin_webrtc_softphone. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AVAILABLE | &quot;AVAILABLE&quot; |
| ASSOCIATED | &quot;ASSOCIATED&quot; |
{: class="table table-striped"}


