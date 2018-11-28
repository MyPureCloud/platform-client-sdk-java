---
title: QueueConversationSocialExpressionEventTopicCobrowse
---
## QueueConversationSocialExpressionEventTopicCobrowse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum) |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) |  |  [optional] |
| **id** | **String** |  |  [optional] |
| **self** | [**QueueConversationSocialExpressionEventTopicAddress**](QueueConversationSocialExpressionEventTopicAddress.html) |  |  [optional] |
| **roomId** | **String** |  |  [optional] |
| **cobrowseSessionId** | **String** |  |  [optional] |
| **cobrowseRole** | **String** |  |  [optional] |
| **controlling** | **List&lt;String&gt;** |  |  [optional] |
| **viewerUrl** | **String** |  |  [optional] |
| **provider** | **String** |  |  [optional] |
| **scriptId** | **String** |  |  [optional] |
| **peerId** | **String** |  |  [optional] |
| **providerEventTime** | [**Date**](Date.html) |  |  [optional] |
| **connectedTime** | [**Date**](Date.html) |  |  [optional] |
| **disconnectedTime** | [**Date**](Date.html) |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ALERTING | &quot;ALERTING&quot; |
| DIALING | &quot;DIALING&quot; |
| CONTACTING | &quot;CONTACTING&quot; |
| OFFERING | &quot;OFFERING&quot; |
| CONNECTED | &quot;CONNECTED&quot; |
| DISCONNECTED | &quot;DISCONNECTED&quot; |
| TERMINATED | &quot;TERMINATED&quot; |
| NONE | &quot;NONE&quot; |
{: class="table table-striped"}


<a name="DisconnectTypeEnum"></a>

## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ENDPOINT | &quot;ENDPOINT&quot; |
| CLIENT | &quot;CLIENT&quot; |
| SYSTEM | &quot;SYSTEM&quot; |
| TIMEOUT | &quot;TIMEOUT&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| TRANSFER_CONFERENCE | &quot;TRANSFER_CONFERENCE&quot; |
| TRANSFER_CONSULT | &quot;TRANSFER_CONSULT&quot; |
| TRANSFER_FORWARD | &quot;TRANSFER_FORWARD&quot; |
| TRANSPORT_FAILURE | &quot;TRANSPORT_FAILURE&quot; |
| ERROR | &quot;ERROR&quot; |
| PEER | &quot;PEER&quot; |
| OTHER | &quot;OTHER&quot; |
| SPAM | &quot;SPAM&quot; |
| UNCALLABLE | &quot;UNCALLABLE&quot; |
{: class="table table-striped"}



