---
title: ConversationCategory
---
## ConversationCategory


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The id of the category |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the category |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of the category |  [optional] |
| **interactionType** | [**InteractionTypeEnum**](#InteractionTypeEnum)<!----> | The type of interaction the category will apply to |  [optional] |
| **criteria** | <!----><!---->[**Operand**](Operand.html)<!----> | A collection of conditions joined together by logical operation to provide more refined filtering of conversations |  [optional] |
{: class="table table-striped"}


<a name="InteractionTypeEnum"></a>

## Enum: InteractionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;Voice&quot; | 
| DIGITAL | &quot;Digital&quot; | 
| ALL | &quot;All&quot; | 
{: class="table table-striped"}



