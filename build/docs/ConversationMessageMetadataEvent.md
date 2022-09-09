---
title: ConversationMessageMetadataEvent
---
## ConversationMessageMetadataEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventType** | [**EventTypeEnum**](#EventTypeEnum)<!----> | Type of this event element |  [optional] |
| **subType** | [**SubTypeEnum**](#SubTypeEnum)<!----> | Event subtype |  [optional] |
{: class="table table-striped"}


<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COBROWSE | &quot;CoBrowse&quot; | 
| TYPING | &quot;Typing&quot; | 
| PRESENCE | &quot;Presence&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}


<a name="SubTypeEnum"></a>

## Enum: SubTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ON | &quot;On&quot; | 
| JOIN | &quot;Join&quot; | 
| OFFERING | &quot;Offering&quot; | 
| OFFERINGEXPIRED | &quot;OfferingExpired&quot; | 
| OFFERINGACCEPTED | &quot;OfferingAccepted&quot; | 
| OFFERINGREJECTED | &quot;OfferingRejected&quot; | 
| DISCONNECT | &quot;Disconnect&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



