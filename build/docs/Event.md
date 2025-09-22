# Event


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | System-generated UUID for the event. |  |
| **correlationId** | **String** | UUID corresponding to triggering action that caused this event (e.g. HTTP POST, SIP invite, another event). |  |
| **customerId** | **String** | Primary identifier of the customer in the source of the events. |  [optional] |
| **customerIdType** | **String** | Type of primary identifier (e.g. cookie, email, phone). |  [optional] |
| **session** | [**EventSession**](EventSession) | The session that the event belongs to. |  |
| **eventType** | **String** | The name representing the type of event. |  |
| **outcomeAchievedEvent** | [**OutcomeAchievedEvent**](OutcomeAchievedEvent) | Event where a customer has achieved a specific outcome or goal. |  [optional] |
| **segmentAssignmentEvent** | [**SegmentAssignmentEvent**](SegmentAssignmentEvent) | Event that represents a segment being assigned. |  [optional] |
| **webActionEvent** | [**WebActionEvent**](WebActionEvent) | Event triggered by web actions. |  [optional] |
| **webEvent** | [**WebEvent**](WebEvent) | Event that tracks user interactions with content in a browser such as pageviews, downloads, mobile ad clicks, etc. |  [optional] |
| **appEvent** | [**AppEvent**](AppEvent) | Event that tracks user interactions with content in an application such as screen views, searches, etc. |  [optional] |
| **createdDate** | [**Date**](Date) | Timestamp indicating when the event actually took place. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
