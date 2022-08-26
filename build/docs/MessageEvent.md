---
title: MessageEvent
---
## MessageEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventType** | [**EventTypeEnum**](#EventTypeEnum)<!----> | Type of this event element |  |
| **coBrowse** | <!----><!---->[**EventCoBrowse**](EventCoBrowse.html)<!----> | CoBrowse event. |  [optional] |
| **typing** | <!----><!---->[**EventTyping**](EventTyping.html)<!----> | Typing event. |  [optional] |
| **presence** | <!----><!---->[**EventPresence**](EventPresence.html)<!----> | Presence event. |  [optional] |
{: class="table table-striped"}


<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COBROWSE | &quot;CoBrowse&quot; | 
| TYPING | &quot;Typing&quot; | 
| PRESENCE | &quot;Presence&quot; | 
{: class="table table-striped"}



