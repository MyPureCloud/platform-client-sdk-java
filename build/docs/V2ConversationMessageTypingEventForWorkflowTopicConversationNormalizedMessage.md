---
title: V2ConversationMessageTypingEventForWorkflowTopicConversationNormalizedMessage
---
## V2ConversationMessageTypingEventForWorkflowTopicConversationNormalizedMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **channel** | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationMessagingChannel**](V2ConversationMessageTypingEventForWorkflowTopicConversationMessagingChannel.html)<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **events** | <!----><!---->[**List&lt;V2ConversationMessageTypingEventForWorkflowTopicConversationMessageEvent&gt;**](V2ConversationMessageTypingEventForWorkflowTopicConversationMessageEvent.html)<!----> |  |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENT | &quot;Event&quot; | 
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;Inbound&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 
{: class="table table-striped"}



