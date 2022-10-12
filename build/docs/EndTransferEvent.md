---
title: EndTransferEvent
---
## EndTransferEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | <!----><!---->**String**<!----> | A unique (V4 UUID) eventId for this event |  |
| **eventDateTime** | <!----><!---->[**Date**](Date.html)<!----> | A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conversationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this conversation |  |
| **commandId** | <!----><!---->**String**<!----> | The id (V4 UUID) used to identify the transfer already started by the external platform. |  |
| **finalState** | [**FinalStateEnum**](#FinalStateEnum)<!----> | Indicates whether the transfer completed successfully, was cancelled, or failed for some reason. |  |
| **objectCommunicationId** | <!----><!---->**String**<!----> | The id (V4 UUID) of the communication that was being transferred. |  |
{: class="table table-striped"}


<a name="FinalStateEnum"></a>

## Enum: FinalStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| FAILED | &quot;Failed&quot; | 
{: class="table table-striped"}



