---
title: KnowledgeConversationContextResponse
---
## KnowledgeConversationContextResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversation** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The conversation. |  |
| **queue** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The queue used to assign the interaction to the user. |  [optional] |
| **externalContact** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The end-user participant of the conversation. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | The media type of the conversation. |  [optional] |
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



