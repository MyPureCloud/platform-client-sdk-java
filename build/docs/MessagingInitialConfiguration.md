---
title: MessagingInitialConfiguration
---
## MessagingInitialConfiguration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **toAddress** | <!----><!---->**String**<!----> | Address for the participant on receiving side of the message conversation. If the address is a phone number, E.164 format is recommended. |  |
| **fromAddress** | <!----><!---->**String**<!----> | Address for the participant on the sending side of the message conversation. If the address is a phone number, E.164 format is recommended. |  |
| **messageType** | [**MessageTypeEnum**](#MessageTypeEnum)<!----> | The type of message platform from which the message originated. |  [optional] |
| **held** | <!----><!---->**Boolean**<!----> | Indicates that this communication's initial state is held. |  [optional] |
| **alerting** | <!----><!---->**Boolean**<!----> | Indicates that this communication's initial state is alerting. If false, the communication started in a connected state. |  [optional] |
| **inbound** | <!----><!---->**Boolean**<!----> | Indicates the direction of this communication with respect to the contact center. `true` means the communication is INBOUND. `false` means the communication is OUTBOUND. |  [optional] |
| **invitedBy** | <!----><!---->**String**<!----> | The id of the communication (the \"peer\") that \"invited\" this communication, if this occurred. |  [optional] |
| **additionalInfo** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Additional metadata about this session which should be recorded by the platform but which will not be indexed or searchable. Primarily for diagnostic value. Any information that needs to be accessible through other components like Analytics should be moved to dedicated fields. |  [optional] |
{: class="table table-striped"}


<a name="MessageTypeEnum"></a>

## Enum: MessageTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SMS | &quot;Sms&quot; | 
| TWITTER | &quot;Twitter&quot; | 
| FACEBOOK | &quot;Facebook&quot; | 
| LINE | &quot;Line&quot; | 
| WHATSAPP | &quot;WhatsApp&quot; | 
| WEBMESSAGE | &quot;WebMessage&quot; | 
| OPEN | &quot;Open&quot; | 
| INSTAGRAM | &quot;Instagram&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



