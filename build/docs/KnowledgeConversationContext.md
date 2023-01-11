---
title: KnowledgeConversationContext
---
## KnowledgeConversationContext


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversationId** | <!----><!---->**String**<!----> | The unique identifier of the conversation. |  |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | The media type of the conversation. |  [optional] |
| **queueId** | <!----><!---->**String**<!----> | The unique identifier of the queue used to assign the interaction to the user. |  [optional] |
| **externalContactId** | <!----><!---->**String**<!----> | The external contact identifier of the end-user participant. |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| CALLBACK | &quot;Callback&quot; | 
| CHAT | &quot;Chat&quot; | 
| COBROWSE | &quot;Cobrowse&quot; | 
| EMAIL | &quot;Email&quot; | 
| MESSAGE | &quot;Message&quot; | 
| SCREENSHARE | &quot;Screenshare&quot; | 
| VIDEO | &quot;Video&quot; | 
| VOICE | &quot;Voice&quot; | 
{: class="table table-striped"}



