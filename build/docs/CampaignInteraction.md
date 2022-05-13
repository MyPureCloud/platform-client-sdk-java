---
title: CampaignInteraction
---
## CampaignInteraction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **campaign** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **agent** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **contact** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **destinationAddress** | <!----><!---->**String**<!----> |  |  [optional] |
| **activePreviewCall** | <!----><!---->**Boolean**<!----> | Boolean value if there is an active preview call on the interaction |  [optional] |
| **lastActivePreviewWrapupTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when the last preview of the interaction was wrapped up. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **creationTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when dialer created the interaction. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **callPlacedTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when the agent or system places the call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **callRoutedTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when the agent was connected to the call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **previewConnectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when the customer and routing participant are connected. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **queue** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **script** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **disposition** | [**DispositionEnum**](#DispositionEnum)<!----> | Describes what happened with call analysis for instance: disposition.classification.callable.person, disposition.classification.callable.noanswer |  [optional] |
| **callerName** | <!----><!---->**String**<!----> |  |  [optional] |
| **callerAddress** | <!----><!---->**String**<!----> |  |  [optional] |
| **previewPopDeliveredTime** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **conversation** | <!----><!---->[**ConversationBasic**](ConversationBasic.html)<!----> |  |  [optional] |
| **dialerSystemParticipantId** | <!----><!---->**String**<!----> | conversation participant id that is the dialer system participant to monitor the call from dialer perspective |  [optional] |
| **dialingMode** | <!----><!---->**String**<!----> |  |  [optional] |
| **skills** | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.html)<!----> | Any skills that are attached to the call for routing |  [optional] |
{: class="table table-striped"}


<a name="DispositionEnum"></a>

## Enum: DispositionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DISCONNECT | &quot;DISCONNECT&quot; | 
| LIVE_VOICE | &quot;LIVE_VOICE&quot; | 
| BUSY | &quot;BUSY&quot; | 
| MACHINE | &quot;MACHINE&quot; | 
| NO_ANSWER | &quot;NO_ANSWER&quot; | 
| SIT_CALLABLE | &quot;SIT_CALLABLE&quot; | 
| SIT_UNCALLABLE | &quot;SIT_UNCALLABLE&quot; | 
| FAX | &quot;FAX&quot; | 
{: class="table table-striped"}



