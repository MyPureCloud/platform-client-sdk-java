# OpenSocialMediaChannel


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The topic ID. |  [optional] |
| **platform** | [**PlatformEnum**](#Enum--PlatformEnum) | The provider type. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Specifies if this message is part of a private or public conversation. |  [optional] |
| **messageId** | **String** | Unique provider ID of the message such as a Facebook message ID. |  |
| **to** | [**OpenSocialMediaRecipient**](OpenSocialMediaRecipient) | Information about the recipient the message is sent to. |  [optional] |
| **from** | [**OpenSocialMediaRecipient**](OpenSocialMediaRecipient) | Information about the recipient the message is received from. |  |
| **time** | [**Date**](Date) | Original time of the event. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **metadata** | **Object** | Information about the channel. |  [optional] |
| **publicMetadata** | [**OpenSocialMediaPublicMetadata**](OpenSocialMediaPublicMetadata) | Meta data of this public post. For example, used to define where in the thread the post exists. |  |


## Enum: PlatformEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OPEN | &quot;Open&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PUBLIC | &quot;Public&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
