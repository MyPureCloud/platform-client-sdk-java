---
title: UserEstablishedEvent
---
## UserEstablishedEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | <!----><!---->**String**<!----> | A unique (V4 UUID) eventId for this event |  |
| **eventDateTime** | <!----><!---->[**Date**](Date.html)<!----> | A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conversationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this conversation |  |
| **communicationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this communication |  |
| **phoneNumber** | <!----><!---->**String**<!----> | Identifies the phone number used to reach this user if it is different from the information that would be accessed by userId. |  [optional] |
| **userId** | <!----><!---->**String**<!----> | The userId (V4 UUID) for the user this communication belongs to. |  |
| **stationId** | <!----><!---->**String**<!----> | A Station ID (V4 UUID) that identifies the station being used if the user is using a station and the stationId is known. |  [optional] |
| **ani** | <!----><!---->**String**<!----> | The automatic number identification if it is available for this conversation. |  [optional] |
| **dnis** | <!----><!---->**String**<!----> | The dialed number identification if it is available for this conversation. |  [optional] |
| **afterCallWorkRequired** | <!----><!---->**Boolean**<!----> | Indicates whether or not this user will be required to complete after call work. |  [optional] |
| **queueId** | <!----><!---->**String**<!----> | The id (V4 UUID) of the queue that the user is calling on behalf of. Applies to outbound calls only. |  [optional] |
| **initialConfiguration** | <!----><!---->[**InitialConfiguration**](InitialConfiguration.html)<!----> | Metadata about this communication. |  |
| **sourceConfiguration** | <!----><!---->[**SourceConfiguration**](SourceConfiguration.html)<!----> | Metadata about the source of this communication's interaction. |  |
{: class="table table-striped"}



