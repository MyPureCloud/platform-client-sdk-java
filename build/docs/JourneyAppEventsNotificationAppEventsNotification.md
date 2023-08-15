---
title: JourneyAppEventsNotificationAppEventsNotification
---
## JourneyAppEventsNotificationAppEventsNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **correlationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **externalContact** | <!----><!---->[**JourneyAppEventsNotificationExternalContact**](JourneyAppEventsNotificationExternalContact.html)<!----> |  |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **customerId** | <!----><!---->**String**<!----> |  |  [optional] |
| **customerIdType** | <!----><!---->**String**<!----> |  |  [optional] |
| **session** | <!----><!---->[**JourneyAppEventsNotificationSession**](JourneyAppEventsNotificationSession.html)<!----> |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#EventTypeEnum)<!----> |  |  [optional] |
| **appEvent** | <!----><!---->[**JourneyAppEventsNotificationAppMessage**](JourneyAppEventsNotificationAppMessage.html)<!----> |  |  [optional] |
| **outcomeAchievedEvent** | <!----><!---->[**JourneyAppEventsNotificationOutcomeAchievedMessage**](JourneyAppEventsNotificationOutcomeAchievedMessage.html)<!----> |  |  [optional] |
| **segmentAssignmentEvent** | <!----><!---->[**JourneyAppEventsNotificationSegmentAssignmentMessage**](JourneyAppEventsNotificationSegmentAssignmentMessage.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPEVENT | &quot;AppEvent&quot; | 
| OUTCOMEACHIEVEDEVENT | &quot;OutcomeAchievedEvent&quot; | 
| SEGMENTASSIGNMENTEVENT | &quot;SegmentAssignmentEvent&quot; | 
{: class="table table-striped"}



