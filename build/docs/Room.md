---
title: Room
---
## Room


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The jid of the room |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Room's created time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **roomType** | [**RoomTypeEnum**](#RoomTypeEnum)<!----> | The type of room |  [optional] |
| **description** | <!----><!---->**String**<!----> | Room's description |  [optional] |
| **subject** | <!----><!---->**String**<!----> | Room's subject |  [optional] |
| **participantLimit** | <!----><!---->**Integer**<!----> | Room's size limit |  [optional] |
| **owners** | <!----><!---->[**List&lt;UserReference&gt;**](UserReference.html)<!----> | Room's owners |  [optional] |
| **pinnedMessages** | <!----><!---->[**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef.html)<!----> | Room's pinned messages |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="RoomTypeEnum"></a>

## Enum: RoomTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADHOC | &quot;adhoc&quot; | 
| ACD | &quot;acd&quot; | 
| GROUP | &quot;group&quot; | 
| ONEONONE | &quot;oneOnOne&quot; | 
| SUPERVISORASSISTANCE | &quot;supervisorAssistance&quot; | 
{: class="table table-striped"}



