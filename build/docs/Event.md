---
title: Event
---
## Event


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | System-generated UUID for the event. |  |
| **correlationId** | <!----><!---->**String**<!----> | UUID corresponding to triggering action that caused this event (e.g. HTTP POST, SIP invite, another event). |  |
| **customerId** | <!----><!---->**String**<!----> | Primary identifier of the customer in the source of the events. |  [optional] |
| **customerIdType** | <!----><!---->**String**<!----> | Type of primary identifier (e.g. cookie, email, phone). |  [optional] |
| **session** | <!----><!---->[**EventSession**](EventSession.html)<!----> | The session that the event belongs to. |  |
| **eventType** | <!----><!---->**String**<!----> | The name representing the type of event. |  |
| **genericActionEvent** | <!----><!---->[**GenericActionEvent**](GenericActionEvent.html)<!----> | Event triggered by generic actions. |  [optional] |
| **outcomeAchievedEvent** | <!----><!---->[**OutcomeAchievedEvent**](OutcomeAchievedEvent.html)<!----> | Event where a customer has achieved a specific outcome or goal. |  [optional] |
| **segmentAssignmentEvent** | <!----><!---->[**SegmentAssignmentEvent**](SegmentAssignmentEvent.html)<!----> | Event that represents a segment being assigned. |  [optional] |
| **webActionEvent** | <!----><!---->[**WebActionEvent**](WebActionEvent.html)<!----> | Event triggered by web actions. |  [optional] |
| **webEvent** | <!----><!---->[**WebEvent**](WebEvent.html)<!----> | Event that tracks user interactions with content in a browser such as pageviews, downloads, mobile ad clicks, etc. |  [optional] |
| **appEvent** | <!----><!---->[**AppEvent**](AppEvent.html)<!----> | Event that tracks user interactions with content in an application such as screen views, searches, etc. |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp indicating when the event actually took place. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
{: class="table table-striped"}



