---
title: KnowledgeSearchClientApplication
---
## KnowledgeSearchClientApplication


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Application type. |  |
| **deployment** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | Application details when type is MessengerKnowledgeApp or SupportCenter. |  [optional] |
| **botFlow** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | Application details when type is BotFlow. |  [optional] |
| **assistant** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | Application details when type is Assistant. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASSISTANT | &quot;Assistant&quot; | 
| BOTFLOW | &quot;BotFlow&quot; | 
| MESSENGERKNOWLEDGEAPP | &quot;MessengerKnowledgeApp&quot; | 
| SMARTADVISOR | &quot;SmartAdvisor&quot; | 
| SUPPORTCENTER | &quot;SupportCenter&quot; | 
{: class="table table-striped"}



