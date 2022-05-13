---
title: ConversationAssociation
---
## ConversationAssociation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **externalContactId** | <!----><!---->**String**<!----> | An external contact ID.  If not supplied, implies the conversation should be disassociated with any external contact. |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> | Conversation ID |  |
| **communicationId** | <!----><!---->**String**<!----> | Communication ID |  |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | Media type |  |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALL | &quot;CALL&quot; | 
| CALLBACK | &quot;CALLBACK&quot; | 
| CHAT | &quot;CHAT&quot; | 
| COBROWSE | &quot;COBROWSE&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
| MESSAGE | &quot;MESSAGE&quot; | 
| SOCIAL_EXPRESSION | &quot;SOCIAL_EXPRESSION&quot; | 
| VIDEO | &quot;VIDEO&quot; | 
| SCREENSHARE | &quot;SCREENSHARE&quot; | 
{: class="table table-striped"}



