# ChatMessageResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The id of the message |  |
| **dateCreated** | [**Date**](Date) | Message's created time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **dateModified** | [**Date**](Date) | Message's last updated time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **toJid** | **String** | Jid of message's recipient (roomJid or userJid) |  |
| **jid** | **String** | Jid of message's sender (userJid) |  |
| **body** | **String** | Message's body |  |
| **mentions** | **Map&lt;String, String&gt;** | Message's mentions |  [optional] |
| **edited** | **Boolean** | If message was edited |  [optional] |
| **attachmentDeleted** | **Boolean** | If message's attachment was deleted |  [optional] |
| **fileUri** | **String** | URI of file attachment |  [optional] |
| **thread** | [**Entity**](Entity) | The id for a thread this message corresponds to |  |
| **parentThread** | [**Entity**](Entity) | Parent thread id for thread replies |  [optional] |
| **user** | [**AddressableEntityRef**](AddressableEntityRef) | The user who sent the message |  [optional] |
| **toUser** | [**AddressableEntityRef**](AddressableEntityRef) | The receiving user of the message |  [optional] |
| **reactions** | [**List&lt;ChatReaction&gt;**](ChatReaction) | The emoji reactions to this message |  [optional] |
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
