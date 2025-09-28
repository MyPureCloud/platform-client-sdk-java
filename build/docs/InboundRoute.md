# InboundRoute


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **pattern** | **String** | The search pattern that the mailbox name should match. |  |
| **queue** | [**DomainEntityRef**](DomainEntityRef) | The queue to route the emails to. |  [optional] |
| **priority** | **Integer** | The priority to use for routing. |  [optional] |
| **skills** | [**List&lt;DomainEntityRef&gt;**](DomainEntityRef) | The skills to use for routing. |  [optional] |
| **language** | [**DomainEntityRef**](DomainEntityRef) | The language to use for routing. |  [optional] |
| **fromName** | **String** | The sender name to use for outgoing replies. |  |
| **fromEmail** | **String** | The sender email to use for outgoing replies. |  [optional] |
| **flow** | [**DomainEntityRef**](DomainEntityRef) | The flow to use for processing the email. |  [optional] |
| **replyEmailAddress** | [**QueueEmailAddress**](QueueEmailAddress) | The route to use for email replies. |  [optional] |
| **autoBcc** | [**List&lt;EmailAddress&gt;**](EmailAddress) | The recipients that should be automatically blind copied on outbound emails associated with this InboundRoute. |  [optional] |
| **spamFlow** | [**DomainEntityRef**](DomainEntityRef) | The flow to use for processing inbound emails that have been marked as spam. |  [optional] |
| **signature** | [**Signature**](Signature) | The configuration for the canned response signature that will be appended to outbound emails sent via this route |  [optional] |
| **historyInclusion** | [**HistoryInclusionEnum**](#Enum--HistoryInclusionEnum) | The configuration to indicate how the history of a conversation has to be included in a draft |  [optional] |
| **allowMultipleActions** | **Boolean** | Control if multiple actions are allowed on this route. When true the disconnect has to be done manually. When false a conversation will be disconnected by the system after every action |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: HistoryInclusionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INCLUDE | &quot;Include&quot; | 
| EXCLUDE | &quot;Exclude&quot; | 
| OPTIONAL | &quot;Optional&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
