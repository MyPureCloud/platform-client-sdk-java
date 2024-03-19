---
title: MessagingUserEstablishedEvent
---
## MessagingUserEstablishedEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | <!----><!---->**String**<!----> | A unique (V4 UUID) eventId for this event |  |
| **eventDateTime** | <!----><!---->[**Date**](Date.html)<!----> | A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conversationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this conversation |  |
| **communicationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this communication. |  |
| **userId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying the user this communication belongs to. |  |
| **queueId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying the queue that the user is messaging on behalf of. Applies to outbound messages only. |  [optional] |
| **afterCallWorkRequired** | <!----><!---->**Boolean**<!----> | Indicates whether or not this user will be required to complete after call work. |  [optional] |
| **initialConfiguration** | <!----><!---->[**MessagingInitialConfiguration**](MessagingInitialConfiguration.html)<!----> | Metadata about this communication. |  |
| **sourceConfiguration** | <!----><!---->[**SourceConfiguration**](SourceConfiguration.html)<!----> | Metadata about the source of this communication's interaction. |  |
{: class="table table-striped"}



