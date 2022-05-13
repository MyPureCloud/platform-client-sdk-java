---
title: IntegrationEvent
---
## IntegrationEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Unique ID for this event |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
| **correlationId** | <!----><!---->**String**<!----> | Correlation ID for the event |  [optional] |
| **timestamp** | <!----><!---->[**Date**](Date.html)<!----> | Time the event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **level** | [**LevelEnum**](#LevelEnum)<!----> | Indicates the severity of the event. |  [optional] |
| **eventCode** | <!----><!---->**String**<!----> | A classification for the event. Suitable for programmatic searching, sorting, or filtering |  [optional] |
| **message** | <!----><!---->[**MessageInfo**](MessageInfo.html)<!----> | Message indicating what happened |  [optional] |
| **entities** | <!----><!---->[**List&lt;EventEntity&gt;**](EventEntity.html)<!----> | Collection of entities affected by or pertaining to the event (e.g. a list of Integrations or Bridge connectors) |  [optional] |
| **contextAttributes** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Map of context attributes specific to this event. |  [optional] |
| **detailMessage** | <!----><!---->[**MessageInfo**](MessageInfo.html)<!----> | Message with additional details about the event. (e.g. an exception cause.) |  [optional] |
| **user** | <!----><!---->[**User**](User.html)<!----> | User that took an action that resulted in the event. |  [optional] |
{: class="table table-striped"}


<a name="LevelEnum"></a>

## Enum: LevelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INFO | &quot;INFO&quot; | 
| WARN | &quot;WARN&quot; | 
| ERROR | &quot;ERROR&quot; | 
| CRITICAL | &quot;CRITICAL&quot; | 
{: class="table table-striped"}



