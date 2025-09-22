# GamificationContestPrizeImageUploadUrlRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileName** | **String** | Name of the file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#| |  [optional] |
| **contentMd5** | **String** | Content MD5 of the file to upload |  [optional] |
| **signedUrlTimeoutSeconds** | **Integer** | The number of seconds the presigned URL is valid for (from 1 to 604800 seconds). If none provided, defaults to 600 seconds |  [optional] |
| **contentType** | [**ContentTypeEnum**](#Enum--ContentTypeEnum) | The content type of the file to upload. |  |
| **contentLength** | **Long** | The size of the file to upload. |  |
| **serverSideEncryption** | [**ServerSideEncryptionEnum**](#Enum--ServerSideEncryptionEnum) |  |  [optional] |


## Enum: ContentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IMAGE_JPEG | &quot;image/jpeg&quot; | 
| IMAGE_JPG | &quot;image/jpg&quot; | 
| IMAGE_PNG | &quot;image/png&quot; | 


## Enum: ServerSideEncryptionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AES256 | &quot;AES256&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
