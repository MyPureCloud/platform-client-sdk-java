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
| **eventType** | [**EventTypeEnum**](#EventTypeEnum)<!----> |  |  [optional] |
| **session** | <!----><!---->[**JourneyOutcomeEventsNotificationSession**](JourneyOutcomeEventsNotificationSession.html)<!----> |  |  [optional] |
| **outcomeAchievedEvent** | <!----><!---->[**JourneyOutcomeEventsNotificationOutcomeAchievedMessage**](JourneyOutcomeEventsNotificationOutcomeAchievedMessage.html)<!----> |  |  [optional] |
| **outcomeAttributionEventMessage** | <!----><!---->[**JourneyOutcomeEventsNotificationOutcomeAttributionMessage**](JourneyOutcomeEventsNotificationOutcomeAttributionMessage.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| WEBEVENT | &quot;WebEvent&quot; |
| WEBACTIONEVENT | &quot;WebActionEvent&quot; |
| OUTCOMEACHIEVEDEVENT | &quot;OutcomeAchievedEvent&quot; |
| BLOCKEDWEBACTIONOFFEREVENT | &quot;BlockedWebActionOfferEvent&quot; |
| OUTCOMEATTRIBUTIONEVENT | &quot;OutcomeAttributionEvent&quot; |
{: class="table table-striped"}



