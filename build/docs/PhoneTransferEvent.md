---
title: PhoneTransferEvent
---
## PhoneTransferEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | <!----><!---->**String**<!----> | A unique (V4 UUID) eventId for this event |  |
| **eventDateTime** | <!----><!---->[**Date**](Date.html)<!----> | A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conversationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this conversation |  |
| **transferType** | [**TransferTypeEnum**](#TransferTypeEnum)<!----> | Indicates the desired type of transfer. |  |
| **commandId** | <!----><!---->**String**<!----> | The id (V4 UUID) used by the external platform to refer to the transfer in subsequent Transfer events. |  |
| **initiatingCommunicationId** | <!----><!---->**String**<!----> | The id (V4 UUID) of the communication representing the participant that is initiating the transfer. |  |
| **targetCommunicationId** | <!----><!---->**String**<!----> | The id (V4 UUID) of the communication that is being transferred away from. In many cases this will be the same as the `initiatingCommunicationId`. |  |
| **objectCommunicationId** | <!----><!---->**String**<!----> | The id (V4 UUID) of the communication that is being transferred. |  |
| **destinationPhoneNumber** | <!----><!---->**String**<!----> | The desired destination phone number that the object communication should be transferred to. |  |
{: class="table table-striped"}


<a name="TransferTypeEnum"></a>

## Enum: TransferTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTENDED | &quot;Attended&quot; | 
| UNATTENDED | &quot;Unattended&quot; | 
{: class="table table-striped"}



