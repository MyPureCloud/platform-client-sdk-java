# Room


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The jid of the room if adhoc, the id of the group for group rooms |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date) | Room's created time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **roomType** | [**RoomTypeEnum**](#Enum--RoomTypeEnum) | The type of room |  [optional] |
| **description** | **String** | Room's description |  [optional] |
| **subject** | **String** | Room's subject |  [optional] |
| **participantLimit** | **Integer** | Room's size limit |  [optional] |
| **owners** | [**List&lt;UserReference&gt;**](UserReference) | Room's owners |  [optional] |
| **pinnedMessages** | [**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef) | Room's pinned messages |  [optional] |
| **jid** | **String** | The jid of the room |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


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




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
