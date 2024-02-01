---
title: EmailExternalEstablishedEvent
---
## EmailExternalEstablishedEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | <!----><!---->**String**<!----> | A unique (V4 UUID) eventId for this event |  |
| **eventDateTime** | <!----><!---->[**Date**](Date.html)<!----> | A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conversationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this conversation |  |
| **communicationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this communication. |  |
| **displayName** | <!----><!---->**String**<!----> | A name for the participant if it is available for this conversation. |  [optional] |
| **includeMessage** | <!----><!---->**Boolean**<!----> | Indicates that established communication has an initial email. If true, the initial messagesSent value will be initialized to 1. |  [optional] |
| **initialConfiguration** | <!----><!---->[**EmailInitialConfiguration**](EmailInitialConfiguration.html)<!----> | Metadata about this communication. |  |
| **sourceConfiguration** | <!----><!---->[**SourceConfiguration**](SourceConfiguration.html)<!----> | Metadata about the source of this communication's interaction. |  |
{: class="table table-striped"}



