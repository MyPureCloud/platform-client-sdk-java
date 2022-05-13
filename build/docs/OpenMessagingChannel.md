---
title: OpenMessagingChannel
---
## OpenMessagingChannel


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The Messaging Platform integration ID. |  [optional] |
| **platform** | [**PlatformEnum**](#PlatformEnum)<!----> | The provider type. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Specifies if this message is part of a private or public conversation. |  [optional] |
| **messageId** | <!----><!---->**String**<!----> | Unique provider ID of the message such as a Facebook message ID. |  |
| **to** | <!----><!---->[**OpenMessagingToRecipient**](OpenMessagingToRecipient.html)<!----> | Information about the recipient the message is sent to. |  |
| **from** | <!----><!---->[**OpenMessagingFromRecipient**](OpenMessagingFromRecipient.html)<!----> | Information about the recipient the message is received from. |  |
| **time** | <!----><!---->[**Date**](Date.html)<!----> | Original time of the event. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **metadata** | <!----><!---->**Object**<!----> | Information about the channel. |  [optional] |
{: class="table table-striped"}


<a name="PlatformEnum"></a>

## Enum: PlatformEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OPEN | &quot;Open&quot; | 
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PRIVATE | &quot;Private&quot; | 
{: class="table table-striped"}



