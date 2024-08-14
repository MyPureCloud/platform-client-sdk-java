---
title: SuggestionContext
---
## SuggestionContext


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The queue used to assign the interaction to the user, if any. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | The media type of the conversation in which the suggestion event was raised. |  [optional] |
| **user** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The agent participant who received the raised suggestion, if any. |  [optional] |
| **externalContact** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The external contact of the end-user participant, if any. |  [optional] |
| **utterance** | <!----><!---->[**Entity**](Entity.html)<!----> | The utterance in the voice conversation, after which the suggestion was raised, if any. |  [optional] |
| **message** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The message in the digital conversation, after which the suggestion was raised, if any. |  [optional] |
| **queryStatement** | <!----><!---->**String**<!----> | The query statement used when generating the suggestion, if any. |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MESSAGE | &quot;Message&quot; | 
| VOICE | &quot;Voice&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



