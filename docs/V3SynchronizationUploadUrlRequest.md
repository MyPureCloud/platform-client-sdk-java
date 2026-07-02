# V3SynchronizationUploadUrlRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileName** | **String** | Name of the file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#| |  |
| **contentMd5** | **String** | Content MD5 of the file to upload encoded in base64, example: \"f8VicOenD6gaWTW3Lqy+KQ==\". Not the hexadecimal representation as \"7fc56270e7a70fa81a5935b72eacbe29\". |  [optional] |
| **contentType** | **String** | The content type of the file to upload |  [optional] |
| **contentLength** | **Integer** | The length of the file to upload in bytes |  [optional] |
| **metadata** | [**V3SynchronizationUploadMetadata**](V3SynchronizationUploadMetadata) | The metadata of the file to upload |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:257.1.0_
