# OpenMessagingChannel


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The Messaging Platform integration ID. |  [optional] |
| **platform** | [**PlatformEnum**](#Enum--PlatformEnum) | The provider type. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Specifies if this message is part of a private or public conversation. |  [optional] |
| **messageId** | **String** | Unique provider ID of the message such as a Facebook message ID. |  [optional] |
| **to** | [**OpenMessagingToRecipient**](OpenMessagingToRecipient) | Information about the recipient the message is sent to. |  |
| **from** | [**OpenMessagingFromRecipient**](OpenMessagingFromRecipient) | Information about the recipient the message is received from. |  |
| **time** | [**Date**](Date) | Original time of the event. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **metadata** | **Object** | Information about the channel. |  [optional] |
{: class="table table-striped"}


## Enum: PlatformEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OPEN | &quot;Open&quot; | 
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PRIVATE | &quot;Private&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
