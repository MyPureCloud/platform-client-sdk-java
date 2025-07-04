# UploadUrlRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileName** | **String** | Name of the file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#| |  [optional] |
| **contentMd5** | **String** | Content MD5 of the file to upload |  [optional] |
| **signedUrlTimeoutSeconds** | **Integer** | The number of seconds the presigned URL is valid for (from 1 to 604800 seconds). If none provided, defaults to 600 seconds |  [optional] |
| **contentType** | **String** | The content type of the file to upload. Allows all MIME types |  [optional] |
| **serverSideEncryption** | [**ServerSideEncryptionEnum**](#Enum--ServerSideEncryptionEnum) |  |  [optional] |


## Enum: ServerSideEncryptionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AES256 | &quot;AES256&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
