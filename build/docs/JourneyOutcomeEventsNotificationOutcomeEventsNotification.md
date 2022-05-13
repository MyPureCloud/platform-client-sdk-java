---
title: JourneyOutcomeEventsNotificationOutcomeEventsNotification
---
## JourneyOutcomeEventsNotificationOutcomeEventsNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **correlationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **externalContact** | <!----><!---->[**JourneyOutcomeEventsNotificationExternalContact**](JourneyOutcomeEventsNotificationExternalContact.html)<!----> |  |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **customerId** | <!----><!---->**String**<!----> |  |  [optional] |
| **customerIdType** | <!----><!---->**String**<!----> |  |  [optional] |
| **session** | <!----><!---->[**JourneyOutcomeEventsNotificationSession**](JourneyOutcomeEventsNotificationSession.html)<!----> |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#EventTypeEnum)<!----> |  |  [optional] |
| **outcomeAchievedEvent** | <!----><!---->[**JourneyOutcomeEventsNotificationOutcomeAchievedMessage**](JourneyOutcomeEventsNotificationOutcomeAchievedMessage.html)<!----> |  |  [optional] |
| **outcomeAttributionEventMessage** | <!----><!---->[**JourneyOutcomeEventsNotificationOutcomeAttributionMessage**](JourneyOutcomeEventsNotificationOutcomeAttributionMessage.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OUTCOMEACHIEVEDEVENT | &quot;OutcomeAchievedEvent&quot; | 
| OUTCOMEATTRIBUTIONEVENT | &quot;OutcomeAttributionEvent&quot; | 
{: class="table table-striped"}



