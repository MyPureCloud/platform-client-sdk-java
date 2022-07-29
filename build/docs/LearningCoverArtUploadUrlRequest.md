---
title: LearningCoverArtUploadUrlRequest
---
## LearningCoverArtUploadUrlRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileName** | <!----><!---->**String**<!----> | Name of the file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#| |  [optional] |
| **contentMd5** | <!----><!---->**String**<!----> | Content MD5 of the file to upload |  [optional] |
| **signedUrlTimeoutSeconds** | <!----><!---->**Integer**<!----> | The number of seconds the presigned URL is valid for (from 1 to 604800 seconds). If none provided, defaults to 600 seconds |  [optional] |
| **contentType** | [**ContentTypeEnum**](#ContentTypeEnum)<!----> | The content type of the file to upload. |  |
| **serverSideEncryption** | [**ServerSideEncryptionEnum**](#ServerSideEncryptionEnum)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ContentTypeEnum"></a>

## Enum: ContentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IMAGE_BMP | &quot;image/bmp&quot; | 
| IMAGE_GIF | &quot;image/gif&quot; | 
| IMAGE_JPEG | &quot;image/jpeg&quot; | 
| IMAGE_JPG | &quot;image/jpg&quot; | 
| IMAGE_PNG | &quot;image/png&quot; | 
{: class="table table-striped"}


<a name="ServerSideEncryptionEnum"></a>

## Enum: ServerSideEncryptionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AES256 | &quot;AES256&quot; | 
{: class="table table-striped"}



