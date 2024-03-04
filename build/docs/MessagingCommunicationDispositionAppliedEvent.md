---
title: MessagingCommunicationDispositionAppliedEvent
---
## MessagingCommunicationDispositionAppliedEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | <!----><!---->**String**<!----> | A unique (V4 UUID) eventId for this event |  |
| **eventDateTime** | <!----><!---->[**Date**](Date.html)<!----> | A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conversationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this conversation |  |
| **communicationId** | <!----><!---->**String**<!----> | A unique Id (V4 UUID) identifying this communication |  |
| **code** | <!----><!---->**String**<!----> | The wrapup-code (V4 UUID) used to disposition this interaction. If this value is not provided the disposition is considered skipped. |  [optional] |
| **notes** | <!----><!---->**String**<!----> | Text entered by the agent to describe the interaction or disposition. Ignored if the disposition is considered skipped. |  [optional] |
| **tags** | <!----><!---->**List&lt;String&gt;**<!----> | The list of tags selected by the agent to describe the interaction or disposition. Ignored if the disposition is considered skipped. |  [optional] |
{: class="table table-striped"}



