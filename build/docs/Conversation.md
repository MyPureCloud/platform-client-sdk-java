---
title: Conversation
---
## Conversation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **externalTag** | <!----><!---->**String**<!----> | The external tag associated with the conversation. |  [optional] |
| **startTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when the conversation started. This will be the time when the first participant joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **endTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when the conversation ended. This will be the time when the last participant left the conversation, or null when the conversation is still active. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **address** | <!----><!---->**String**<!----> | The address of the conversation as seen from an external participant. For phone calls this will be the DNIS for inbound calls and the ANI for outbound calls. For other media types this will be the address of the destination participant for inbound and the address of the initiating participant for outbound. |  [optional] |
| **participants** | <!----><!---->[**List&lt;Participant&gt;**](Participant.html)<!----> | The list of all participants in the conversation. |  |
| **conversationIds** | <!----><!---->**List&lt;String&gt;**<!----> | A list of conversations to merge into this conversation to create a conference. This field is null except when being used to create a conference. |  [optional] |
| **maxParticipants** | <!----><!---->**Integer**<!----> | If this is a conference conversation, then this field indicates the maximum number of participants allowed to participant in the conference. |  [optional] |
| **recordingState** | [**RecordingStateEnum**](#RecordingStateEnum)<!----> | On update, 'paused' initiates a secure pause, 'active' resumes any paused recordings; otherwise indicates state of conversation recording. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The conversation's state |  [optional] |
| **divisions** | <!----><!---->[**List&lt;ConversationDivisionMembership&gt;**](ConversationDivisionMembership.html)<!----> | Identifiers of divisions associated with this conversation |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="RecordingStateEnum"></a>

## Enum: RecordingStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;ACTIVE&quot; | 
| PAUSED | &quot;PAUSED&quot; | 
| NONE | &quot;NONE&quot; | 
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALERTING | &quot;alerting&quot; | 
| DIALING | &quot;dialing&quot; | 
| CONTACTING | &quot;contacting&quot; | 
| OFFERING | &quot;offering&quot; | 
| CONNECTED | &quot;connected&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 
| TERMINATED | &quot;terminated&quot; | 
| CONVERTING | &quot;converting&quot; | 
| UPLOADING | &quot;uploading&quot; | 
| TRANSMITTING | &quot;transmitting&quot; | 
| NONE | &quot;none&quot; | 
{: class="table table-striped"}



