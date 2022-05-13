---
title: WebMessagingEvent
---
## WebMessagingEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventType** | [**EventTypeEnum**](#EventTypeEnum)<!----> | Type of this event element |  |
| **coBrowse** | <!----><!---->[**WebMessagingEventCoBrowse**](WebMessagingEventCoBrowse.html)<!----> | Cobrowse event. |  [optional] |
| **presence** | <!----><!---->[**WebMessagingEventPresence**](WebMessagingEventPresence.html)<!----> | Presence event. |  [optional] |
{: class="table table-striped"}


<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COBROWSE | &quot;CoBrowse&quot; | 
| PRESENCE | &quot;Presence&quot; | 
{: class="table table-striped"}



