---
title: UserRoutingStatusEvent
---
## UserRoutingStatusEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | <!----><!---->**String**<!----> | A unique (UUID) eventId for this event |  |
| **eventDateTime** | <!----><!---->[**Date**](Date.html)<!----> | A timestamp as epoch representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **agentId** | <!----><!---->**String**<!----> | Unique identifier of the agent. |  |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The agent's current routing status. |  |
| **sourceId** | <!----><!---->**String**<!----> | The agent's source platform Id. |  |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFFQUEUE | &quot;OffQueue&quot; | 
| IDLE | &quot;Idle&quot; | 
| INTERACTING | &quot;Interacting&quot; | 
| COMMUNICATING | &quot;Communicating&quot; | 
| NOTRESPONDING | &quot;NotResponding&quot; | 
{: class="table table-striped"}



