# MessageEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) | Type of this event element |  |
| **coBrowse** | [**EventCoBrowse**](EventCoBrowse) | CoBrowse event. |  [optional] |
| **typing** | [**EventTyping**](EventTyping) | Typing event. |  [optional] |
| **presence** | [**EventPresence**](EventPresence) | Presence event. |  [optional] |
| **video** | [**EventVideo**](EventVideo) | Video event. |  [optional] |
| **reactions** | [**List&lt;ContentReaction&gt;**](ContentReaction) | A list of reactions to a message. |  [optional] |


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COBROWSE | &quot;CoBrowse&quot; | 
| TYPING | &quot;Typing&quot; | 
| PRESENCE | &quot;Presence&quot; | 
| VIDEO | &quot;Video&quot; | 
| REACTIONS | &quot;Reactions&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
