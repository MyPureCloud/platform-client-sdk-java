---
title: IvrEstablishedEvent
---
## IvrEstablishedEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | <!----><!---->**String**<!----> | A unique (V4 UUID) eventId for this event |  |
| **eventDateTime** | <!----><!---->[**Date**](Date.html)<!----> | A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conversationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this conversation |  |
| **communicationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this communication |  |
| **ivrPhoneNumber** | <!----><!---->**String**<!----> | The phone number for this IVR, if any is known |  [optional] |
| **ivrName** | <!----><!---->**String**<!----> | A displayable name for this IVR, if any is known. |  [optional] |
| **ani** | <!----><!---->**String**<!----> | The automatic number identification if it is available for this conversation. |  [optional] |
| **dnis** | <!----><!---->**String**<!----> | The dialed number identification if it is available for this conversation. |  [optional] |
| **initialConfiguration** | <!----><!---->[**InitialConfiguration**](InitialConfiguration.html)<!----> | Metadata about this communication. |  |
| **sourceConfiguration** | <!----><!---->[**SourceConfiguration**](SourceConfiguration.html)<!----> | Metadata about the source of this communication's interaction. |  |
{: class="table table-striped"}



