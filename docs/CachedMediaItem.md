# CachedMediaItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The unique identifier for the cached media. |  [optional] |
| **url** | **String** | The URL that represents the external media that has been cached |  [optional] |
| **downloadUrl** | **String** | A URL to fetch the cached media |  [optional] |
| **mediaType** | **String** | The media type for the URL |  [optional] |
| **contentLengthBytes** | **Integer** | The content length of the media represented by the URL, in bytes. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date the cached item was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateExpires** | [**Date**](Date) | The date the cached item expires and will be removed from the cache. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
