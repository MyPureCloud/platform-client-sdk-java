# CampaignInteraction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **campaign** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **agent** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **contact** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **destinationAddress** | **String** |  |  [optional] |
| **activePreviewCall** | **Boolean** | Boolean value if there is an active preview call on the interaction |  [optional] |
| **lastActivePreviewWrapupTime** | [**Date**](Date) | The time when the last preview of the interaction was wrapped up. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **creationTime** | [**Date**](Date) | The time when dialer created the interaction. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **callPlacedTime** | [**Date**](Date) | The time when the agent or system places the call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **callRoutedTime** | [**Date**](Date) | The time when the agent was connected to the call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **previewConnectedTime** | [**Date**](Date) | The time when the customer and routing participant are connected. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **queue** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **script** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **disposition** | [**DispositionEnum**](#Enum--DispositionEnum) | Describes what happened with call analysis for instance: disposition.classification.callable.person, disposition.classification.callable.noanswer |  [optional] |
| **callerName** | **String** |  |  [optional] |
| **callerAddress** | **String** |  |  [optional] |
| **previewPopDeliveredTime** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **conversation** | [**ConversationBasic**](ConversationBasic) |  |  [optional] |
| **dialerSystemParticipantId** | **String** | conversation participant id that is the dialer system participant to monitor the call from dialer perspective |  [optional] |
| **dialingMode** | **String** |  |  [optional] |
| **skills** | [**List&lt;DomainEntityRef&gt;**](DomainEntityRef) | Any skills that are attached to the call for routing |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
