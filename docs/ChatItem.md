# ChatItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **open** | **Boolean** | If the chat is open |  |
| **favorite** | [**ChatFavorite**](ChatFavorite) | The favorite entity for the chat, only appears if the chat is favorited |  [optional] |
| **images** | [**List&lt;Image&gt;**](Image) | Avatar images for the chat |  [optional] |
| **dateLastMessage** | [**Date**](Date) | The date of the last message. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateClosed** | [**Date**](Date) | The date the chat was closed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **user** | [**ChatUserRef**](ChatUserRef) | The other 1on1 user |  [optional] |
| **room** | [**Room**](Room) | The room of the chat |  [optional] |
| **chatType** | [**ChatTypeEnum**](#Enum--ChatTypeEnum) | The type of chat |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: ChatTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADHOC | &quot;adhoc&quot; | 
| ACD | &quot;acd&quot; | 
| GROUP | &quot;group&quot; | 
| ONEONONE | &quot;oneOnOne&quot; | 
| SUPERVISORASSISTANCE | &quot;supervisorAssistance&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
