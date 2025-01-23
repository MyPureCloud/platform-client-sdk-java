# ConversationMessageEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) | Type of this event element |  |
| **coBrowse** | [**ConversationEventCoBrowse**](ConversationEventCoBrowse) | CoBrowse event. |  [optional] |
| **typing** | [**ConversationEventTyping**](ConversationEventTyping) | Typing event. |  [optional] |
| **presence** | [**ConversationEventPresence**](ConversationEventPresence) | Presence event. |  [optional] |
| **video** | [**ConversationEventVideo**](ConversationEventVideo) | Video event. |  [optional] |


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COBROWSE | &quot;CoBrowse&quot; | 
| TYPING | &quot;Typing&quot; | 
| PRESENCE | &quot;Presence&quot; | 
| VIDEO | &quot;Video&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:218.0.0_
