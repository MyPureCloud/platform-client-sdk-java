---
title: JourneyWebEventsNotificationWebEventsNotification
---
## JourneyWebEventsNotificationWebEventsNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **correlationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **externalContact** | <!----><!---->[**JourneyWebEventsNotificationExternalContact**](JourneyWebEventsNotificationExternalContact.html)<!----> |  |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **customerId** | <!----><!---->**String**<!----> |  |  [optional] |
| **customerIdType** | <!----><!---->**String**<!----> |  |  [optional] |
| **session** | <!----><!---->[**JourneyWebEventsNotificationSession**](JourneyWebEventsNotificationSession.html)<!----> |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#EventTypeEnum)<!----> |  |  [optional] |
| **webEvent** | <!----><!---->[**JourneyWebEventsNotificationWebMessage**](JourneyWebEventsNotificationWebMessage.html)<!----> |  |  [optional] |
| **webActionEvent** | <!----><!---->[**JourneyWebEventsNotificationWebActionMessage**](JourneyWebEventsNotificationWebActionMessage.html)<!----> |  |  [optional] |
| **outcomeAchievedEvent** | <!----><!---->[**JourneyWebEventsNotificationOutcomeAchievedMessage**](JourneyWebEventsNotificationOutcomeAchievedMessage.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEBEVENT | &quot;WebEvent&quot; | 
| WEBACTIONEVENT | &quot;WebActionEvent&quot; | 
| OUTCOMEACHIEVEDEVENT | &quot;OutcomeAchievedEvent&quot; | 
{: class="table table-striped"}



