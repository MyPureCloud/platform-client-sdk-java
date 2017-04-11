---
title: ConversationBasic
---
## ConversationBasic


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **startTime** | [**Date**](Date.html) | The time when the conversation started. This will be the time when the first participant joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  |
| **endTime** | [**Date**](Date.html) | The time when the conversation ended. This will be the time when the last participant left the conversation, or null when the conversation is still active. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **participants** | [**List&lt;ParticipantBasic&gt;**](ParticipantBasic.html) |  |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


